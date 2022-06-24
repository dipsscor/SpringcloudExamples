package com.dipsscor;

import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route
public class MainView extends VerticalLayout{
	
	public MainView() {
		Label label = new Label("Welcome to App2");
		add(label);
	}
	


}
