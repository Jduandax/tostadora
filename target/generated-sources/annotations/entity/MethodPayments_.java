package entity;

import entity.Payments;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2022-12-05T17:05:10")
@StaticMetamodel(MethodPayments.class)
public class MethodPayments_ { 

    public static volatile SingularAttribute<MethodPayments, String> nameMethod;
    public static volatile SingularAttribute<MethodPayments, Date> createdAt;
    public static volatile CollectionAttribute<MethodPayments, Payments> paymentsCollection;
    public static volatile SingularAttribute<MethodPayments, Integer> id;
    public static volatile SingularAttribute<MethodPayments, Date> updatedAt;

}