package org.baeldung.grpc.model;

import org.baeldung.grpc.getInfoAReponse;

public class A {
    private  String idA;
    private String nameA;

    public A(String idA, String nameA) {
        this.idA = idA;
        this.nameA = nameA;
    }

    public void setIdA(String idA) {
        this.idA = idA;
    }

    public String getIdA() {
        return idA;
    }

    public String getNameA() {
        return nameA;
    }

    public void setNameA(String nameA) {
        this.nameA = nameA;
    }

    public A(getInfoAReponse.InfoA infoA)
    {
        this.idA = infoA.getIdA();
        this.nameA=infoA.getNameA();
    }
}
