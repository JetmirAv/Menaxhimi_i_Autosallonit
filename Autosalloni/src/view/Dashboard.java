package view;

import java.sql.SQLException;
import java.util.Calendar;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart.Data;
import javafx.scene.chart.XYChart.Series;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class Dashboard {

	public static VBox display() {
		VBox dashboard = new VBox(30);
		
		try {
			int totalUsers = models.Users.count(false);
			int thisMonthUsers = models.Users.count(true);

			int otherUsers = totalUsers - thisMonthUsers;

			ObservableList<PieChart.Data> usersChartData = FXCollections.observableArrayList();
			usersChartData.add(new PieChart.Data("Other: " + otherUsers , otherUsers));
			usersChartData.add(new PieChart.Data("This Month: " + thisMonthUsers, thisMonthUsers));

			PieChart usersPieChart = new PieChart(usersChartData);
			usersPieChart.setTitle("Users");

			ObservableList<PieChart.Data> carsChartData = FXCollections.observableArrayList();
			carsChartData.add(new PieChart.Data("Total", 75));
			carsChartData.add(new PieChart.Data("This Month", 25));

			PieChart carsPieChart = new PieChart(carsChartData);
			carsPieChart.setTitle("Cars");

			HBox pieChartBox = new HBox(20);
			pieChartBox.setAlignment(Pos.CENTER);
			pieChartBox.getChildren().addAll(usersPieChart, carsPieChart);

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

			Series<Number, Number> profitChartData = new Series<Number, Number>();
			profitChartData.getData().add(new Data<Number, Number>(1, 23));
			profitChartData.getData().add(new Data<Number, Number>(2, 12));
			profitChartData.getData().add(new Data<Number, Number>(3, 50));
			profitChartData.getData().add(new Data<Number, Number>(4, 10));
			profitChartData.getData().add(new Data<Number, Number>(5, 5));
			profitChartData.getData().add(new Data<Number, Number>(6, 30));
			profitChartData.getData().add(new Data<Number, Number>(7, 55));
			profitChartData.getData().add(new Data<Number, Number>(8, 70));
			profitChartData.getData().add(new Data<Number, Number>(9, 62));
			profitChartData.getData().add(new Data<Number, Number>(10, 11));
			profitChartData.getData().add(new Data<Number, Number>(11, 0));
			profitChartData.getData().add(new Data<Number, Number>(12, 12));

			profitChart.getData().add(profitChartData);

			dashboard.setAlignment(Pos.CENTER);
			dashboard.getChildren().addAll(profitChart, pieChartBox);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dashboard;
	}
}
