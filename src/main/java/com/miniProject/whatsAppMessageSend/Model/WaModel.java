package com.miniProject.whatsAppMessageSend.Model;

public class WaModel
{
    private String uri;
    private String name;

    private int address;
    private String Connector;
    private String type;

    private int id;
    private String data;
    private int size;

    public int getAddress()
    {
        return address;
    }

    public void setAddress( int address )
    {
        this.address = address;
    }

    public String getConnector()
    {
        return Connector;
    }

    public void setConnector( String connector )
    {
        Connector = connector;
    }

    public String getType()
    {
        return type;
    }

    public void setType( String type )
    {
        this.type = type;
    }

    public int getId()
    {
        return id;
    }

    public void setId( int id )
    {
        this.id = id;
    }

    public String getData()
    {
        return data;
    }

    public void setData( String data )
    {
        this.data = data;
    }

    public int getSize()
    {
        return size;
    }

    public void setSize( int size )
    {
        this.size = size;
    }


    public void setName( String name )
    {
        this.name = name;
    }

    public void setUri( String uri )
    {
        this.uri = uri;
    }

    public String getName()
    {
        return name;
    }

    public String getUri()
    {
        return uri;
    }


}
