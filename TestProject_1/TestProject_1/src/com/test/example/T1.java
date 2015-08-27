/*
 * T1.java
 *
 * created at Aug 27, 2015 by g.lengarski <YOURMAILADDRESS>
 * 
 * $Id: eclipse-seeburger-codetemplates.xml,v 1.1 2005/03/04 15:02:28 UllrichPollaehne Exp www-data $
 *
 * Copyright (c) 2015 SEEBURGER AG, Germany. All Rights Reserved.
 */
package com.test.example;


import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.MalformedURLException;
import java.net.URL;


public class T1
{
    private String link = "http://sinoptik.bg/locations/europe/bulgaria";


    public T1()
    {

    }


    public void t()
    {
        try
        {
            URL url = new URL(link);
            DataInputStream i = new DataInputStream(url.openStream());

            String line;
            while ((line = i.readLine()) != null)
            {
                System.out.println(line);
            }

        }
        catch (MalformedURLException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (IOException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
