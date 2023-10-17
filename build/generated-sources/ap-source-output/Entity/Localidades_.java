package Entity;

import Entity.Situacionesanormalesriesgo;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-10-17T18:20:10")
@StaticMetamodel(Localidades.class)
public class Localidades_ { 

    public static volatile SingularAttribute<Localidades, String> descripcion;
    public static volatile SingularAttribute<Localidades, String> codigo;
    public static volatile SingularAttribute<Localidades, String> ubicacion;
    public static volatile CollectionAttribute<Localidades, Situacionesanormalesriesgo> situacionesanormalesriesgoCollection;
    public static volatile SingularAttribute<Localidades, Integer> id;

}