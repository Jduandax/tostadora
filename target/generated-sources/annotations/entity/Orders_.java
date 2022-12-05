package entity;

import entity.OrderDetails;
import entity.OrderDetailsPayments;
import entity.Users;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2022-12-05T17:05:10")
@StaticMetamodel(Orders.class)
public class Orders_ { 

    public static volatile SingularAttribute<Orders, Date> createdAt;
    public static volatile CollectionAttribute<Orders, OrderDetails> orderDetailsCollection;
    public static volatile SingularAttribute<Orders, Integer> id;
    public static volatile SingularAttribute<Orders, Users> users;
    public static volatile CollectionAttribute<Orders, OrderDetailsPayments> orderDetailsPaymentsCollection;
    public static volatile SingularAttribute<Orders, Date> updatedAt;

}