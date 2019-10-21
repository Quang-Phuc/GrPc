package org.baeldung.grpc.model;


import org.baeldung.grpc.getInfoBReponse;

public class B {
    private  String idB;
    private String nameB;

    public void setIdB(String idB) {
        this.idB = idB;
    }

    public String getIdB() {
        return idB;
    }

    public String getNameB() {
        return nameB;
    }

    public void setNameB(String nameB) {
        this.nameB = nameB;
    }

    public B(String idB, String nameB) {
        this.idB = idB;
        this.nameB = nameB;
    }
    public B(getInfoBReponse.InfoB infoB)
    {
        this.idB = infoB.getIdB();
        this.nameB=infoB.getNameB();
    }
}
