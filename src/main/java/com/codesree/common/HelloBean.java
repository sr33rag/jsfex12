package com.codesree.common;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class HelloBean implements Serializable {

  private String name;
  
  public String getName() {
    return this.name;
  }

  public void setName(String _name) {
    this.name=_name;
  }
  
}
