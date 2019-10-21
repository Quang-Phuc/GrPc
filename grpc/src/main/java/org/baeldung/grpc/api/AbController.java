package org.baeldung.grpc.api;

import org.baeldung.grpc.client.ABService;
import org.baeldung.grpc.dao.ABDao;
import org.baeldung.grpc.getInfoABReponse;

public class AbController {
    ABService abService = new ABService();

    public static void main(String[] args) {

        AbController abController = new AbController();
        abController.getInforAB("1");

    }

    public getInfoABReponse getInforAB(String id) {
        return abService.getInforAB(id);

    }
}