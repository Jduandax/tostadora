package entity;

import entity.Products;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2022-12-05T17:05:10")
@StaticMetamodel(Category.class)
public class Category_ { 

    public static volatile SingularAttribute<Category, Date> createdAt;
    public static volatile CollectionAttribute<Category, Products> productsCollection;
    public static volatile SingularAttribute<Category, String> nameCategory;
    public static volatile SingularAttribute<Category, String> description;
    public static volatile SingularAttribute<Category, Integer> id;
    public static volatile SingularAttribute<Category, Date> updatedAt;

}