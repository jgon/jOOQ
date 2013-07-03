/**
 * This class is generated by jOOQ
 */
package org.jooq.test.access.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TTriggersRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.access.generatedclasses.tables.records.TTriggersRecord> implements org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer> {

	private static final long serialVersionUID = -974726197;

	/**
	 * Setter for <code>T_TRIGGERS.ID_GENERATED</code>. 
	 */
	public void setIdGenerated(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>T_TRIGGERS.ID_GENERATED</code>. 
	 */
	public java.lang.Integer getIdGenerated() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>T_TRIGGERS.ID</code>. 
	 */
	public void setId(java.lang.Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>T_TRIGGERS.ID</code>. 
	 */
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(1);
	}

	/**
	 * Setter for <code>T_TRIGGERS.XINTEGER</code>. 
	 */
	public void setXinteger(java.lang.Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>T_TRIGGERS.XINTEGER</code>. 
	 */
	public java.lang.Integer getXinteger() {
		return (java.lang.Integer) getValue(2);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Integer> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.Integer> fieldsRow() {
		return (org.jooq.Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.Integer> valuesRow() {
		return (org.jooq.Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.test.access.generatedclasses.tables.TTriggers.ID_GENERATED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return org.jooq.test.access.generatedclasses.tables.TTriggers.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field3() {
		return org.jooq.test.access.generatedclasses.tables.TTriggers.XINTEGER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getIdGenerated();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value2() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value3() {
		return getXinteger();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TTriggersRecord
	 */
	public TTriggersRecord() {
		super(org.jooq.test.access.generatedclasses.tables.TTriggers.T_TRIGGERS);
	}
}