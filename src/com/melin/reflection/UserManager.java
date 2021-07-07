package com.melin.reflection;

import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.Map;
import java.util.Properties;

public class UserManager {
	private Properties prop = new Properties();
	public <T> T gen(String paramName, Map<String, Object> map)
	{
		String classname = prop.getProperty("job." + paramName + ".class");
		//String paramsStr = prop.getProperty("job." + paramName + ".params");
		try
		{
		
			Class c = Class.forName(classname);
			Object obj = c.newInstance();
			//String[] params = paramsStr.split(",");
			//for(int i = 0; i < params.length; i++)
			for(String k : map.keySet())
			{
				//Field f = obj.getClass().getDeclaredField(params[i]);
				Field f = obj.getClass().getDeclaredField(k);
				f.setAccessible(true);
				//f.set(obj,map.get(params[i]));
				f.set(obj,map.get(k));
			}
			return (T) obj;
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			
		}
		return null;
	}
	
	
	
	void loadProp(String propName)
	{
		InputStream is = null;
		try {
			is = this.getClass().getClassLoader().getResourceAsStream(propName);
			this.prop.load(is);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			//TODO close InputStream
		}
	}
	
}
