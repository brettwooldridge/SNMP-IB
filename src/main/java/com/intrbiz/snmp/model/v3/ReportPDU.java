package com.intrbiz.snmp.model.v3;

import org.bouncycastle.asn1.DERTaggedObject;

import com.intrbiz.snmp.model.v2.VarBindPDU;

public class ReportPDU extends VarBindPDU 
{
    public static final int TAG = 8;
    
    public ReportPDU()
    {
        super();
    }
    
    public ReportPDU(DERTaggedObject val)
    {
        this();
        this.decode(val);
    }
    
    protected int _tag()
    {
        return TAG;
    }
}
