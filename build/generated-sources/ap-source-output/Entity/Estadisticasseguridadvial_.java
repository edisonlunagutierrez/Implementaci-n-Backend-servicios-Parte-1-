package Entity;

import Entity.Situacionesanormalesriesgo;
import Entity.Usuarios;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-10-17T18:20:10")
@StaticMetamodel(Estadisticasseguridadvial.class)
public class Estadisticasseguridadvial_ { 

    public static volatile SingularAttribute<Estadisticasseguridadvial, String> contenido;
    public static volatile SingularAttribute<Estadisticasseguridadvial, String> tipoestadistica;
    public static volatile SingularAttribute<Estadisticasseguridadvial, Integer> mes;
    public static volatile SingularAttribute<Estadisticasseguridadvial, Integer> id;
    public static volatile SingularAttribute<Estadisticasseguridadvial, Situacionesanormalesriesgo> reporteid;
    public static volatile SingularAttribute<Estadisticasseguridadvial, Usuarios> responsableid;
    public static volatile SingularAttribute<Estadisticasseguridadvial, Integer> anio;

}