// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   LogService.java

package kr.co.project3.service;

import java.util.List;
import kr.co.project3.log.dto.Criteria;
import kr.co.project3.log.dto.LogDTO;

public interface LogService
{

    public abstract List select_dateLog(LogDTO logdto);

    public abstract List<LogDTO> selectLog(Criteria criteria);

    public abstract int countLog(String s);
}
