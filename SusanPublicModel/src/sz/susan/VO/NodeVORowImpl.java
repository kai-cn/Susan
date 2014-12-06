package sz.susan.VO;

import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Dec 19 17:02:25 CST 2013
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class NodeVORowImpl extends ViewRowImpl {
    public static final int ENTITY_NODEEO = 0;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        Id {
            public Object get(NodeVORowImpl obj) {
                return obj.getId();
            }

            public void put(NodeVORowImpl obj, Object value) {
                obj.setId((Integer)value);
            }
        }
        ,
        ServiceId {
            public Object get(NodeVORowImpl obj) {
                return obj.getServiceId();
            }

            public void put(NodeVORowImpl obj, Object value) {
                obj.setServiceId((Integer)value);
            }
        }
        ,
        Parentid {
            public Object get(NodeVORowImpl obj) {
                return obj.getParentid();
            }

            public void put(NodeVORowImpl obj, Object value) {
                obj.setParentid((Integer)value);
            }
        }
        ,
        Depth {
            public Object get(NodeVORowImpl obj) {
                return obj.getDepth();
            }

            public void put(NodeVORowImpl obj, Object value) {
                obj.setDepth((Integer)value);
            }
        }
        ,
        Sequenceid {
            public Object get(NodeVORowImpl obj) {
                return obj.getSequenceid();
            }

            public void put(NodeVORowImpl obj, Object value) {
                obj.setSequenceid((Integer)value);
            }
        }
        ,
        TransactionId {
            public Object get(NodeVORowImpl obj) {
                return obj.getTransactionId();
            }

            public void put(NodeVORowImpl obj, Object value) {
                obj.setTransactionId((Integer)value);
            }
        }
        ,
        Time {
            public Object get(NodeVORowImpl obj) {
                return obj.getTime();
            }

            public void put(NodeVORowImpl obj, Object value) {
                obj.setTime((Integer)value);
            }
        }
        ,
        Cpu {
            public Object get(NodeVORowImpl obj) {
                return obj.getCpu();
            }

            public void put(NodeVORowImpl obj, Object value) {
                obj.setCpu((Integer)value);
            }
        }
        ,
        Attribute10 {
            public Object get(NodeVORowImpl obj) {
                return obj.getAttribute10();
            }

            public void put(NodeVORowImpl obj, Object value) {
                obj.setAttribute10((String)value);
            }
        }
        ,
        Attribute11 {
            public Object get(NodeVORowImpl obj) {
                return obj.getAttribute11();
            }

            public void put(NodeVORowImpl obj, Object value) {
                obj.setAttribute11((String)value);
            }
        }
        ,
        Attribute12 {
            public Object get(NodeVORowImpl obj) {
                return obj.getAttribute12();
            }

            public void put(NodeVORowImpl obj, Object value) {
                obj.setAttribute12((Integer)value);
            }
        }
        ,
        Attribute8 {
            public Object get(NodeVORowImpl obj) {
                return obj.getAttribute8();
            }

            public void put(NodeVORowImpl obj, Object value) {
                obj.setAttribute8((String)value);
            }
        }
        ,
        Attribute9 {
            public Object get(NodeVORowImpl obj) {
                return obj.getAttribute9();
            }

            public void put(NodeVORowImpl obj, Object value) {
                obj.setAttribute9((String)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(NodeVORowImpl object);

        public abstract void put(NodeVORowImpl object, Object value);

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }
    public static final int ID = AttributesEnum.Id.index();
    public static final int SERVICEID = AttributesEnum.ServiceId.index();
    public static final int PARENTID = AttributesEnum.Parentid.index();
    public static final int DEPTH = AttributesEnum.Depth.index();
    public static final int SEQUENCEID = AttributesEnum.Sequenceid.index();
    public static final int TRANSACTIONID = AttributesEnum.TransactionId.index();
    public static final int TIME = AttributesEnum.Time.index();
    public static final int CPU = AttributesEnum.Cpu.index();
    public static final int ATTRIBUTE10 = AttributesEnum.Attribute10.index();
    public static final int ATTRIBUTE11 = AttributesEnum.Attribute11.index();
    public static final int ATTRIBUTE12 = AttributesEnum.Attribute12.index();
    public static final int ATTRIBUTE8 = AttributesEnum.Attribute8.index();
    public static final int ATTRIBUTE9 = AttributesEnum.Attribute9.index();

    /**
     * This is the default constructor (do not remove).
     */
    public NodeVORowImpl() {
    }

    /**
     * Gets NodeEO entity object.
     * @return the NodeEO
     */
    public EntityImpl getNodeEO() {
        return (EntityImpl)getEntity(ENTITY_NODEEO);
    }

    /**
     * Gets the attribute value for ID using the alias name Id.
     * @return the ID
     */
    public Integer getId() {
        return (Integer) getAttributeInternal(ID);
    }

    /**
     * Sets <code>value</code> as attribute value for ID using the alias name Id.
     * @param value value to set the ID
     */
    public void setId(Integer value) {
        setAttributeInternal(ID, value);
    }

    /**
     * Gets the attribute value for SERVICE_ID using the alias name ServiceId.
     * @return the SERVICE_ID
     */
    public Integer getServiceId() {
        return (Integer) getAttributeInternal(SERVICEID);
    }

    /**
     * Sets <code>value</code> as attribute value for SERVICE_ID using the alias name ServiceId.
     * @param value value to set the SERVICE_ID
     */
    public void setServiceId(Integer value) {
        setAttributeInternal(SERVICEID, value);
    }

    /**
     * Gets the attribute value for PARENTID using the alias name Parentid.
     * @return the PARENTID
     */
    public Integer getParentid() {
        return (Integer) getAttributeInternal(PARENTID);
    }

    /**
     * Sets <code>value</code> as attribute value for PARENTID using the alias name Parentid.
     * @param value value to set the PARENTID
     */
    public void setParentid(Integer value) {
        setAttributeInternal(PARENTID, value);
    }

    /**
     * Gets the attribute value for DEPTH using the alias name Depth.
     * @return the DEPTH
     */
    public Integer getDepth() {
        return (Integer) getAttributeInternal(DEPTH);
    }

    /**
     * Sets <code>value</code> as attribute value for DEPTH using the alias name Depth.
     * @param value value to set the DEPTH
     */
    public void setDepth(Integer value) {
        setAttributeInternal(DEPTH, value);
    }

    /**
     * Gets the attribute value for SEQUENCEID using the alias name Sequenceid.
     * @return the SEQUENCEID
     */
    public Integer getSequenceid() {
        return (Integer) getAttributeInternal(SEQUENCEID);
    }

    /**
     * Sets <code>value</code> as attribute value for SEQUENCEID using the alias name Sequenceid.
     * @param value value to set the SEQUENCEID
     */
    public void setSequenceid(Integer value) {
        setAttributeInternal(SEQUENCEID, value);
    }

    /**
     * Gets the attribute value for TRANSACTION_ID using the alias name TransactionId.
     * @return the TRANSACTION_ID
     */
    public Integer getTransactionId() {
        return (Integer) getAttributeInternal(TRANSACTIONID);
    }

    /**
     * Sets <code>value</code> as attribute value for TRANSACTION_ID using the alias name TransactionId.
     * @param value value to set the TRANSACTION_ID
     */
    public void setTransactionId(Integer value) {
        setAttributeInternal(TRANSACTIONID, value);
    }

    /**
     * Gets the attribute value for TIME using the alias name Time.
     * @return the TIME
     */
    public Integer getTime() {
        return (Integer) getAttributeInternal(TIME);
    }

    /**
     * Sets <code>value</code> as attribute value for TIME using the alias name Time.
     * @param value value to set the TIME
     */
    public void setTime(Integer value) {
        setAttributeInternal(TIME, value);
    }

    /**
     * Gets the attribute value for CPU using the alias name Cpu.
     * @return the CPU
     */
    public Integer getCpu() {
        return (Integer) getAttributeInternal(CPU);
    }

    /**
     * Sets <code>value</code> as attribute value for CPU using the alias name Cpu.
     * @param value value to set the CPU
     */
    public void setCpu(Integer value) {
        setAttributeInternal(CPU, value);
    }

    /**
     * Gets the attribute value for ATTRIBUTE_10 using the alias name Attribute10.
     * @return the ATTRIBUTE_10
     */
    public String getAttribute10() {
        return (String) getAttributeInternal(ATTRIBUTE10);
    }

    /**
     * Sets <code>value</code> as attribute value for ATTRIBUTE_10 using the alias name Attribute10.
     * @param value value to set the ATTRIBUTE_10
     */
    public void setAttribute10(String value) {
        setAttributeInternal(ATTRIBUTE10, value);
    }

    /**
     * Gets the attribute value for ATTRIBUTE_11 using the alias name Attribute11.
     * @return the ATTRIBUTE_11
     */
    public String getAttribute11() {
        return (String) getAttributeInternal(ATTRIBUTE11);
    }

    /**
     * Sets <code>value</code> as attribute value for ATTRIBUTE_11 using the alias name Attribute11.
     * @param value value to set the ATTRIBUTE_11
     */
    public void setAttribute11(String value) {
        setAttributeInternal(ATTRIBUTE11, value);
    }

    /**
     * Gets the attribute value for ATTRIBUTE_12 using the alias name Attribute12.
     * @return the ATTRIBUTE_12
     */
    public Integer getAttribute12() {
        return (Integer) getAttributeInternal(ATTRIBUTE12);
    }

    /**
     * Sets <code>value</code> as attribute value for ATTRIBUTE_12 using the alias name Attribute12.
     * @param value value to set the ATTRIBUTE_12
     */
    public void setAttribute12(Integer value) {
        setAttributeInternal(ATTRIBUTE12, value);
    }

    /**
     * Gets the attribute value for ATTRIBUTE_8 using the alias name Attribute8.
     * @return the ATTRIBUTE_8
     */
    public String getAttribute8() {
        return (String) getAttributeInternal(ATTRIBUTE8);
    }

    /**
     * Sets <code>value</code> as attribute value for ATTRIBUTE_8 using the alias name Attribute8.
     * @param value value to set the ATTRIBUTE_8
     */
    public void setAttribute8(String value) {
        setAttributeInternal(ATTRIBUTE8, value);
    }

    /**
     * Gets the attribute value for ATTRIBUTE_9 using the alias name Attribute9.
     * @return the ATTRIBUTE_9
     */
    public String getAttribute9() {
        return (String) getAttributeInternal(ATTRIBUTE9);
    }

    /**
     * Sets <code>value</code> as attribute value for ATTRIBUTE_9 using the alias name Attribute9.
     * @param value value to set the ATTRIBUTE_9
     */
    public void setAttribute9(String value) {
        setAttributeInternal(ATTRIBUTE9, value);
    }

    /**
     * getAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param attrDef the attribute

     * @return the attribute value
     * @throws Exception
     */
    protected Object getAttrInvokeAccessor(int index, AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            return AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].get(this);
        }
        return super.getAttrInvokeAccessor(index, attrDef);
    }

    /**
     * setAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param value the value to assign to the attribute
     * @param attrDef the attribute

     * @throws Exception
     */
    protected void setAttrInvokeAccessor(int index, Object value, AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].put(this, value);
            return;
        }
        super.setAttrInvokeAccessor(index, value, attrDef);
    }
}
