package view;

import java.util.Calendar;
import java.util.Date;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;
import javafx.scene.chart.XYChart.Series;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class Dashboard {

	public static VBox display() {

//		ObservableList<PieChart.Data> usersChartData = 
//				FXCollections.observableArrayList(
//						new PieChart.Data("Total", 75),
//						new PieChart.Data("This Month", 25));
		
		
		ObservableList<PieChart.Data> usersChartData= FXCollections.observableArrayList();
		usersChartData.add(new PieChart.Data("Total", 75));
		usersChartData.add(new PieChart.Data("This Month", 25));
		
		PieChart usersPieChart = new PieChart(usersChartData);
		usersPieChart.setTitle("Users");


		
		ObservableList<PieChart.Data> carsChartData= FXCollections.observableArrayList();
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
		profitChartData.getData().add(new XYChart.Data(1, 23));
		profitChartData.getData().add(new XYChart.Data(2, 12));
		profitChartData.getData().add(new XYChart.Data(3, 50));
		profitChartData.getData().add(new XYChart.Data(4, 10));
		profitChartData.getData().add(new XYChart.Data(5, 5));
		profitChartData.getData().add(new XYChart.Data(6, 30));
		profitChartData.getData().add(new XYChart.Data(7, 55));
		profitChartData.getData().add(new XYChart.Data(8, 70));
		profitChartData.getData().add(new XYChart.Data(9, 62));
		profitChartData.getData().add(new XYChart.Data(10, 11));
		profitChartData.getData().add(new XYChart.Data(11, 0));
		profitChartData.getData().add(new XYChart.Data(12, 12));

		profitChart.getData().add(profitChartData);
		
		VBox dashboard = new VBox(30);
		dashboard.setAlignment(Pos.CENTER);
		dashboard.getChildren().addAll(profitChart, pieChartBox);

		return dashboard;
	}
}
