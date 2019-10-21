package org.baeldung.grpc.server;

import io.grpc.stub.StreamObserver;
import org.baeldung.grpc.ABGrpc;
import org.baeldung.grpc.dao.ABDao;
import org.baeldung.grpc.getInfoABReponse;

import org.baeldung.grpc.getInforequest;

public class ABGrpcService extends ABGrpc.ABImplBase{
    ABDao abDao = new ABDao();

    @Override
    public void getAB(getInforequest request, StreamObserver<getInfoABReponse> responseObserver) {
        responseObserver.onNext(abDao.getInfoAB(request));
        responseObserver.onCompleted();
    }
}
