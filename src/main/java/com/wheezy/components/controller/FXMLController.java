package com.wheezy.components.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.stage.Stage;

public class FXMLController implements Initializable
{
  private Stage stage;

  @Override
  public void initialize(URL location, ResourceBundle resources)
  {
    // (Don't really need to do anything here).
  }

  public Stage getStage()
  {
    return stage;
  }

  public void setStage(Stage stage)
  {
    this.stage = stage;
  }  
}
