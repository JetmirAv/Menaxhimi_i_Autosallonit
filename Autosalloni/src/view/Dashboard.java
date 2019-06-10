package view;

import java.sql.SQLException;
import java.util.Calendar;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;
import javafx.scene.chart.XYChart.Data;
import javafx.scene.chart.XYChart.Series;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import models.Bought;

public class Dashboard extends VBox{
	
	public Dashboard() {
	
		VBox dashboard = new VBox(30);
		 
		try {

			int totalUsers = models.Users.count(false);
			int thisMonthUsers = models.Users.count(true);

			int otherUsers = totalUsers - thisMonthUsers;

			// Users Pie Chart
			ObservableList<PieChart.Data> usersChartData = FXCollections.observableArrayList();
			usersChartData.add(new PieChart.Data("Other: " + otherUsers, otherUsers));
			usersChartData.add(new PieChart.Data("This Month: " + thisMonthUsers, thisMonthUsers));

			PieChart usersPieChart = new PieChart(usersChartData);
			usersPieChart.setTitle("Users");

			// Cars Pie Chart
			ObservableList<PieChart.Data> carsChartData = FXCollections.observableArrayList();
			carsChartData.add(new PieChart.Data("Total", 75));
			carsChartData.add(new PieChart.Data("This Month", 25));

			PieChart carsPieChart = new PieChart(carsChartData);
			carsPieChart.setTitle("Cars");

			HBox pieChartBox = new HBox(20);
			pieChartBox.setAlignment(Pos.CENTER);

			// Statistics through year
			NumberAxis xAxis = new NumberAxis();
			xAxis.setLabel("Year");
			xAxis.setAutoRanging(false);
			xAxis.setLowerBound(1);
			xAxis.setUpperBound(12);
			xAxis.setTickUnit(1);

			NumberAxis yAxis = new NumberAxis();
			yAxis.setLabel("Profit");
			LineChart<Number, Number> profitChart = new LineChart<>(xAxis, yAxis);
			profitChart.setTitle("Profit in year " + Calendar.getInstance().get(Calendar.YEAR));

			Double[] data = Bought.profitThroughYear();
			Series<Number, Number> profitChartData = new Series<Number, Number>();

			for (int i = 0; i < data.length; i++) {
				if (data[i] == null) {
					profitChartData.getData().add(new Data<Number, Number>(i, 0));
				} else {
					profitChartData.getData().add(new Data<Number, Number>(i, data[i]));
				}
			}
			profitChart.getData().add(profitChartData);
			
			
			
			

			Integer[] thisYear = Bought.salesThroughMonths(0);
			Integer[] lastYear = Bought.salesThroughMonths(1);

			final CategoryAxis xCatAxis = new CategoryAxis();
			final NumberAxis yCatAxis = new NumberAxis();
			final BarChart<String, Number> bc = new BarChart<String, Number>(xCatAxis, yCatAxis);
			bc.setTitle("Year Summary");
			xAxis.setLabel("Month");
			yAxis.setLabel("Value");

			XYChart.Series<String, Number> series1 = new XYChart.Series<String, Number>();
			series1.setName("" + String.valueOf((Calendar.getInstance().get(Calendar.YEAR))));
			XYChart.Series<String, Number> series2 = new XYChart.Series<String, Number>();
			series2.setName("" + String.valueOf((Calendar.getInstance().get(Calendar.YEAR) - 1)));

			for (int i = 0; i < thisYear.length; i++) {
				if(thisYear[i] == null) {
					series1.getData().add(new XYChart.Data<String, Number>(i + "", 0));					
				} else {
					series1.getData().add(new XYChart.Data<String, Number>(i+ "", thisYear[i]));
				}			
				if(lastYear[i] == null) {
					series2.getData().add(new XYChart.Data<String, Number>(i+ "", 0));					
				} else {
					series2.getData().add(new XYChart.Data<String, Number>(i+ "", lastYear[i]));
				}
			}


			bc.getData().addAll(series1, series2);
			pieChartBox.getChildren().addAll(usersPieChart, bc);

			dashboard.setAlignment(Pos.CENTER);
			dashboard.getChildren().addAll(profitChart, pieChartBox);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		getChildren().add(dashboard);

	}
}
