package Entity;

import Entity.Estadisticasseguridadvial;
import Entity.Localidades;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-10-17T18:20:10")
@StaticMetamodel(Situacionesanormalesriesgo.class)
public class Situacionesanormalesriesgo_ { 

    public static volatile SingularAttribute<Situacionesanormalesriesgo, String> tipoactorvial;
    public static volatile SingularAttribute<Situacionesanormalesriesgo, Boolean> existenciasenalestransito;
    public static volatile SingularAttribute<Situacionesanormalesriesgo, BigDecimal> latitud;
    public static volatile SingularAttribute<Situacionesanormalesriesgo, BigDecimal> longitud;
    public static volatile CollectionAttribute<Situacionesanormalesriesgo, Estadisticasseguridadvial> estadisticasseguridadvialCollection;
    public static volatile SingularAttribute<Situacionesanormalesriesgo, Integer> id;
    public static volatile SingularAttribute<Situacionesanormalesriesgo, String> nombre;
    public static volatile SingularAttribute<Situacionesanormalesriesgo, Localidades> localidadid;

}