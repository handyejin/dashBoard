// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ServerDAO.java

package kr.co.project3.server.dao;

import java.util.List;

import kr.co.project3.dashBoard.dto.ServerInfoDTO;
import kr.co.project3.server.dto.ServerDTO;

public interface ServerDAO
{

    public abstract int check_ip(String s);

    public abstract void insert_server(ServerDTO serverdto);

    public abstract List<ServerInfoDTO> getServerInfo(String s);
}
