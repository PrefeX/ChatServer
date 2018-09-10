/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.chatserver;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


/**
 *
 * @author Christian
 */
@Entity(name = "Messages")
public class Message implements Serializable
{

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String message;
    private User sender;
    //private int sendTime;

    public Message()
    {
    }


    public Message(String message)
    {
        this.message = message;
    }


    
    public Long getId()
    {
        return id;
    }


    public String getMessage()
    {
        return message;
    }
    
    
    
}
