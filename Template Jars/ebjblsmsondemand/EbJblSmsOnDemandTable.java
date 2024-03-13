package com.temenos.t24.api.tables.ebjblsmsondemand
public class EbJblSmsOnDemandTable {
    /**
    * Write a EbJblSmsOnDemandRecord to 'F.EB.JBL.SMS.ON.DEMAND"<br>
    * @param id java.lang.CharSequence : Record ID to read<br>
    * @param record EbJblSmsOnDemandRecord : Record to write<br>
    * @return boolean : <br>
    */
    public boolean write(java.lang.CharSequence id, EbJblSmsOnDemandRecord record){}

    /**
    * Returns an unmodifiable list of ID of the record satisfying the 'where' clause  for 'F.EB.JBL.SMS.ON.DEMAND' 
    * example : List&lt;String&gt; IDs = myTable.select("ACTION like 'ABC%'")<br>
    * @param whereClause java.lang.CharSequence : 'Where clause' part of a sql statement.<br>
    * @return List<String> : <br>
    */
    public List<String> select(java.lang.CharSequence whereClause){}

    /**
    * Read a EbJblSmsOnDemandRecord from 'F.EB.JBL.SMS.ON.DEMAND"<br>
    * @param id java.lang.CharSequence : Record ID to read<br>
    * @return com.temenos.t24.api.tables.ebjblsmsondemand.EbJblSmsOnDemandRecord : <br>
    */
    public com.temenos.t24.api.tables.ebjblsmsondemand.EbJblSmsOnDemandRecord read(java.lang.CharSequence id){}

    /**
    * Release (unlock)  the table 'F.EB.JBL.SMS.ON.DEMAND' for the specified ID<br>
    * @param id java.lang.CharSequence : Record ID to release<br>
    * @return boolean : <br>
    */
    public boolean release(java.lang.CharSequence id){}

    /**
    * Clear the table 'F.EB.JBL.SMS.ON.DEMAND<br>
    * @return boolean : <br>
    */
    public boolean clear(){}

    /**
    * Lock the table 'F.EB.JBL.SMS.ON.DEMAND' for the specified ID<br>
    * @param id java.lang.CharSequence : Record ID to lock<br>
    * @return boolean : <br>
    */
    public boolean lock(java.lang.CharSequence id){}

    /**
    * Returns an unmodifiable list of all record IDs of 'F.EB.JBL.SMS.ON.DEMAND'<br>
    * @return List<String> : <br>
    */
    public List<String> select(){}

    /**
    * Delete a EbJblSmsOnDemandRecord of 'F.EB.JBL.SMS.ON.DEMAND"<br>
    * @param id java.lang.CharSequence : Record ID to delete<br>
    * @return boolean : <br>
    */
    public boolean delete(java.lang.CharSequence id){}

}
