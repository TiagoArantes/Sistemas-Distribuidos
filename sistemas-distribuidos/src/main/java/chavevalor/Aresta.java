/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package chavevalor;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2017-11-15")
public class Aresta implements org.apache.thrift.TBase<Aresta, Aresta._Fields>, java.io.Serializable, Cloneable, Comparable<Aresta> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Aresta");

  private static final org.apache.thrift.protocol.TField NOME_VERTICE1_FIELD_DESC = new org.apache.thrift.protocol.TField("nomeVertice1", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField NOME_VERTICE2_FIELD_DESC = new org.apache.thrift.protocol.TField("nomeVertice2", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField PESO_FIELD_DESC = new org.apache.thrift.protocol.TField("peso", org.apache.thrift.protocol.TType.DOUBLE, (short)3);
  private static final org.apache.thrift.protocol.TField DIRECIONADA_FIELD_DESC = new org.apache.thrift.protocol.TField("direcionada", org.apache.thrift.protocol.TType.BOOL, (short)4);
  private static final org.apache.thrift.protocol.TField DESCRICAO_FIELD_DESC = new org.apache.thrift.protocol.TField("descricao", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField NOME_FIELD_DESC = new org.apache.thrift.protocol.TField("nome", org.apache.thrift.protocol.TType.I32, (short)6);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ArestaStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ArestaTupleSchemeFactory();

  public int nomeVertice1; // required
  public int nomeVertice2; // required
  public double peso; // required
  public boolean direcionada; // required
  public java.lang.String descricao; // required
  public int nome; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    NOME_VERTICE1((short)1, "nomeVertice1"),
    NOME_VERTICE2((short)2, "nomeVertice2"),
    PESO((short)3, "peso"),
    DIRECIONADA((short)4, "direcionada"),
    DESCRICAO((short)5, "descricao"),
    NOME((short)6, "nome");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // NOME_VERTICE1
          return NOME_VERTICE1;
        case 2: // NOME_VERTICE2
          return NOME_VERTICE2;
        case 3: // PESO
          return PESO;
        case 4: // DIRECIONADA
          return DIRECIONADA;
        case 5: // DESCRICAO
          return DESCRICAO;
        case 6: // NOME
          return NOME;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __NOMEVERTICE1_ISSET_ID = 0;
  private static final int __NOMEVERTICE2_ISSET_ID = 1;
  private static final int __PESO_ISSET_ID = 2;
  private static final int __DIRECIONADA_ISSET_ID = 3;
  private static final int __NOME_ISSET_ID = 4;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.NOME_VERTICE1, new org.apache.thrift.meta_data.FieldMetaData("nomeVertice1", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.NOME_VERTICE2, new org.apache.thrift.meta_data.FieldMetaData("nomeVertice2", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.PESO, new org.apache.thrift.meta_data.FieldMetaData("peso", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.DIRECIONADA, new org.apache.thrift.meta_data.FieldMetaData("direcionada", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.DESCRICAO, new org.apache.thrift.meta_data.FieldMetaData("descricao", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.NOME, new org.apache.thrift.meta_data.FieldMetaData("nome", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Aresta.class, metaDataMap);
  }

  public Aresta() {
  }

  public Aresta(
    int nomeVertice1,
    int nomeVertice2,
    double peso,
    boolean direcionada,
    java.lang.String descricao,
    int nome)
  {
    this();
    this.nomeVertice1 = nomeVertice1;
    setNomeVertice1IsSet(true);
    this.nomeVertice2 = nomeVertice2;
    setNomeVertice2IsSet(true);
    this.peso = peso;
    setPesoIsSet(true);
    this.direcionada = direcionada;
    setDirecionadaIsSet(true);
    this.descricao = descricao;
    this.nome = nome;
    setNomeIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Aresta(Aresta other) {
    __isset_bitfield = other.__isset_bitfield;
    this.nomeVertice1 = other.nomeVertice1;
    this.nomeVertice2 = other.nomeVertice2;
    this.peso = other.peso;
    this.direcionada = other.direcionada;
    if (other.isSetDescricao()) {
      this.descricao = other.descricao;
    }
    this.nome = other.nome;
  }

  public Aresta deepCopy() {
    return new Aresta(this);
  }

  @Override
  public void clear() {
    setNomeVertice1IsSet(false);
    this.nomeVertice1 = 0;
    setNomeVertice2IsSet(false);
    this.nomeVertice2 = 0;
    setPesoIsSet(false);
    this.peso = 0.0;
    setDirecionadaIsSet(false);
    this.direcionada = false;
    this.descricao = null;
    setNomeIsSet(false);
    this.nome = 0;
  }

  public int getNomeVertice1() {
    return this.nomeVertice1;
  }

  public Aresta setNomeVertice1(int nomeVertice1) {
    this.nomeVertice1 = nomeVertice1;
    setNomeVertice1IsSet(true);
    return this;
  }

  public void unsetNomeVertice1() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __NOMEVERTICE1_ISSET_ID);
  }

  /** Returns true if field nomeVertice1 is set (has been assigned a value) and false otherwise */
  public boolean isSetNomeVertice1() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __NOMEVERTICE1_ISSET_ID);
  }

  public void setNomeVertice1IsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __NOMEVERTICE1_ISSET_ID, value);
  }

  public int getNomeVertice2() {
    return this.nomeVertice2;
  }

  public Aresta setNomeVertice2(int nomeVertice2) {
    this.nomeVertice2 = nomeVertice2;
    setNomeVertice2IsSet(true);
    return this;
  }

  public void unsetNomeVertice2() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __NOMEVERTICE2_ISSET_ID);
  }

  /** Returns true if field nomeVertice2 is set (has been assigned a value) and false otherwise */
  public boolean isSetNomeVertice2() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __NOMEVERTICE2_ISSET_ID);
  }

  public void setNomeVertice2IsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __NOMEVERTICE2_ISSET_ID, value);
  }

  public double getPeso() {
    return this.peso;
  }

  public Aresta setPeso(double peso) {
    this.peso = peso;
    setPesoIsSet(true);
    return this;
  }

  public void unsetPeso() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __PESO_ISSET_ID);
  }

  /** Returns true if field peso is set (has been assigned a value) and false otherwise */
  public boolean isSetPeso() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __PESO_ISSET_ID);
  }

  public void setPesoIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __PESO_ISSET_ID, value);
  }

  public boolean isDirecionada() {
    return this.direcionada;
  }

  public Aresta setDirecionada(boolean direcionada) {
    this.direcionada = direcionada;
    setDirecionadaIsSet(true);
    return this;
  }

  public void unsetDirecionada() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __DIRECIONADA_ISSET_ID);
  }

  /** Returns true if field direcionada is set (has been assigned a value) and false otherwise */
  public boolean isSetDirecionada() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __DIRECIONADA_ISSET_ID);
  }

  public void setDirecionadaIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __DIRECIONADA_ISSET_ID, value);
  }

  public java.lang.String getDescricao() {
    return this.descricao;
  }

  public Aresta setDescricao(java.lang.String descricao) {
    this.descricao = descricao;
    return this;
  }

  public void unsetDescricao() {
    this.descricao = null;
  }

  /** Returns true if field descricao is set (has been assigned a value) and false otherwise */
  public boolean isSetDescricao() {
    return this.descricao != null;
  }

  public void setDescricaoIsSet(boolean value) {
    if (!value) {
      this.descricao = null;
    }
  }

  public int getNome() {
    return this.nome;
  }

  public Aresta setNome(int nome) {
    this.nome = nome;
    setNomeIsSet(true);
    return this;
  }

  public void unsetNome() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __NOME_ISSET_ID);
  }

  /** Returns true if field nome is set (has been assigned a value) and false otherwise */
  public boolean isSetNome() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __NOME_ISSET_ID);
  }

  public void setNomeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __NOME_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case NOME_VERTICE1:
      if (value == null) {
        unsetNomeVertice1();
      } else {
        setNomeVertice1((java.lang.Integer)value);
      }
      break;

    case NOME_VERTICE2:
      if (value == null) {
        unsetNomeVertice2();
      } else {
        setNomeVertice2((java.lang.Integer)value);
      }
      break;

    case PESO:
      if (value == null) {
        unsetPeso();
      } else {
        setPeso((java.lang.Double)value);
      }
      break;

    case DIRECIONADA:
      if (value == null) {
        unsetDirecionada();
      } else {
        setDirecionada((java.lang.Boolean)value);
      }
      break;

    case DESCRICAO:
      if (value == null) {
        unsetDescricao();
      } else {
        setDescricao((java.lang.String)value);
      }
      break;

    case NOME:
      if (value == null) {
        unsetNome();
      } else {
        setNome((java.lang.Integer)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case NOME_VERTICE1:
      return getNomeVertice1();

    case NOME_VERTICE2:
      return getNomeVertice2();

    case PESO:
      return getPeso();

    case DIRECIONADA:
      return isDirecionada();

    case DESCRICAO:
      return getDescricao();

    case NOME:
      return getNome();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case NOME_VERTICE1:
      return isSetNomeVertice1();
    case NOME_VERTICE2:
      return isSetNomeVertice2();
    case PESO:
      return isSetPeso();
    case DIRECIONADA:
      return isSetDirecionada();
    case DESCRICAO:
      return isSetDescricao();
    case NOME:
      return isSetNome();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof Aresta)
      return this.equals((Aresta)that);
    return false;
  }

  public boolean equals(Aresta that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_nomeVertice1 = true;
    boolean that_present_nomeVertice1 = true;
    if (this_present_nomeVertice1 || that_present_nomeVertice1) {
      if (!(this_present_nomeVertice1 && that_present_nomeVertice1))
        return false;
      if (this.nomeVertice1 != that.nomeVertice1)
        return false;
    }

    boolean this_present_nomeVertice2 = true;
    boolean that_present_nomeVertice2 = true;
    if (this_present_nomeVertice2 || that_present_nomeVertice2) {
      if (!(this_present_nomeVertice2 && that_present_nomeVertice2))
        return false;
      if (this.nomeVertice2 != that.nomeVertice2)
        return false;
    }

    boolean this_present_peso = true;
    boolean that_present_peso = true;
    if (this_present_peso || that_present_peso) {
      if (!(this_present_peso && that_present_peso))
        return false;
      if (this.peso != that.peso)
        return false;
    }

    boolean this_present_direcionada = true;
    boolean that_present_direcionada = true;
    if (this_present_direcionada || that_present_direcionada) {
      if (!(this_present_direcionada && that_present_direcionada))
        return false;
      if (this.direcionada != that.direcionada)
        return false;
    }

    boolean this_present_descricao = true && this.isSetDescricao();
    boolean that_present_descricao = true && that.isSetDescricao();
    if (this_present_descricao || that_present_descricao) {
      if (!(this_present_descricao && that_present_descricao))
        return false;
      if (!this.descricao.equals(that.descricao))
        return false;
    }

    boolean this_present_nome = true;
    boolean that_present_nome = true;
    if (this_present_nome || that_present_nome) {
      if (!(this_present_nome && that_present_nome))
        return false;
      if (this.nome != that.nome)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + nomeVertice1;

    hashCode = hashCode * 8191 + nomeVertice2;

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(peso);

    hashCode = hashCode * 8191 + ((direcionada) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((isSetDescricao()) ? 131071 : 524287);
    if (isSetDescricao())
      hashCode = hashCode * 8191 + descricao.hashCode();

    hashCode = hashCode * 8191 + nome;

    return hashCode;
  }

  @Override
  public int compareTo(Aresta other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetNomeVertice1()).compareTo(other.isSetNomeVertice1());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNomeVertice1()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.nomeVertice1, other.nomeVertice1);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetNomeVertice2()).compareTo(other.isSetNomeVertice2());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNomeVertice2()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.nomeVertice2, other.nomeVertice2);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetPeso()).compareTo(other.isSetPeso());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPeso()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.peso, other.peso);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetDirecionada()).compareTo(other.isSetDirecionada());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDirecionada()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.direcionada, other.direcionada);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetDescricao()).compareTo(other.isSetDescricao());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDescricao()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.descricao, other.descricao);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetNome()).compareTo(other.isSetNome());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNome()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.nome, other.nome);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("Aresta(");
    boolean first = true;

    sb.append("nomeVertice1:");
    sb.append(this.nomeVertice1);
    first = false;
    if (!first) sb.append(", ");
    sb.append("nomeVertice2:");
    sb.append(this.nomeVertice2);
    first = false;
    if (!first) sb.append(", ");
    sb.append("peso:");
    sb.append(this.peso);
    first = false;
    if (!first) sb.append(", ");
    sb.append("direcionada:");
    sb.append(this.direcionada);
    first = false;
    if (!first) sb.append(", ");
    sb.append("descricao:");
    if (this.descricao == null) {
      sb.append("null");
    } else {
      sb.append(this.descricao);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("nome:");
    sb.append(this.nome);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ArestaStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ArestaStandardScheme getScheme() {
      return new ArestaStandardScheme();
    }
  }

  private static class ArestaStandardScheme extends org.apache.thrift.scheme.StandardScheme<Aresta> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Aresta struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // NOME_VERTICE1
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.nomeVertice1 = iprot.readI32();
              struct.setNomeVertice1IsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // NOME_VERTICE2
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.nomeVertice2 = iprot.readI32();
              struct.setNomeVertice2IsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PESO
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.peso = iprot.readDouble();
              struct.setPesoIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // DIRECIONADA
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.direcionada = iprot.readBool();
              struct.setDirecionadaIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // DESCRICAO
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.descricao = iprot.readString();
              struct.setDescricaoIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // NOME
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.nome = iprot.readI32();
              struct.setNomeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Aresta struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(NOME_VERTICE1_FIELD_DESC);
      oprot.writeI32(struct.nomeVertice1);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(NOME_VERTICE2_FIELD_DESC);
      oprot.writeI32(struct.nomeVertice2);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(PESO_FIELD_DESC);
      oprot.writeDouble(struct.peso);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(DIRECIONADA_FIELD_DESC);
      oprot.writeBool(struct.direcionada);
      oprot.writeFieldEnd();
      if (struct.descricao != null) {
        oprot.writeFieldBegin(DESCRICAO_FIELD_DESC);
        oprot.writeString(struct.descricao);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(NOME_FIELD_DESC);
      oprot.writeI32(struct.nome);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ArestaTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ArestaTupleScheme getScheme() {
      return new ArestaTupleScheme();
    }
  }

  private static class ArestaTupleScheme extends org.apache.thrift.scheme.TupleScheme<Aresta> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Aresta struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetNomeVertice1()) {
        optionals.set(0);
      }
      if (struct.isSetNomeVertice2()) {
        optionals.set(1);
      }
      if (struct.isSetPeso()) {
        optionals.set(2);
      }
      if (struct.isSetDirecionada()) {
        optionals.set(3);
      }
      if (struct.isSetDescricao()) {
        optionals.set(4);
      }
      if (struct.isSetNome()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetNomeVertice1()) {
        oprot.writeI32(struct.nomeVertice1);
      }
      if (struct.isSetNomeVertice2()) {
        oprot.writeI32(struct.nomeVertice2);
      }
      if (struct.isSetPeso()) {
        oprot.writeDouble(struct.peso);
      }
      if (struct.isSetDirecionada()) {
        oprot.writeBool(struct.direcionada);
      }
      if (struct.isSetDescricao()) {
        oprot.writeString(struct.descricao);
      }
      if (struct.isSetNome()) {
        oprot.writeI32(struct.nome);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Aresta struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.nomeVertice1 = iprot.readI32();
        struct.setNomeVertice1IsSet(true);
      }
      if (incoming.get(1)) {
        struct.nomeVertice2 = iprot.readI32();
        struct.setNomeVertice2IsSet(true);
      }
      if (incoming.get(2)) {
        struct.peso = iprot.readDouble();
        struct.setPesoIsSet(true);
      }
      if (incoming.get(3)) {
        struct.direcionada = iprot.readBool();
        struct.setDirecionadaIsSet(true);
      }
      if (incoming.get(4)) {
        struct.descricao = iprot.readString();
        struct.setDescricaoIsSet(true);
      }
      if (incoming.get(5)) {
        struct.nome = iprot.readI32();
        struct.setNomeIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

