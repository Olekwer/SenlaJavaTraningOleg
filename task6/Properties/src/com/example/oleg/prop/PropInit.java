package com.example.oleg.prop;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

public class PropInit {
    public PropInit() {
		
	}	
	public Properties init (){
		Properties properties = null;
		try {
			properties=new Properties();
			properties.load(new InputStreamReader(new FileInputStream("/home/user/config.properties")));
		}
		catch (IOException e) {
			 System.err.println("������: ���� ������� ����������!");
		}
		
		return properties;		
	}
}
