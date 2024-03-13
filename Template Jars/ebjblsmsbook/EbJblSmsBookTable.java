package com.temenos.t24.api.tables.ebjblsmsbook
public class EbJblSmsBookTable {
    /**
    * Returns an unmodifiable list of ID of the record satisfying the 'where' clause  for 'F.EB.JBL.SMS.BOOK' 
    * example : List&lt;String&gt; IDs = myTable.select("ACTION like 'ABC%'")<br>
    * @param whereClause java.lang.CharSequence : 'Where clause' part of a sql statement.<br>
    * @return List<String> : <br>
    */
    public List<String> select(java.lang.CharSequence whereClause){}

    /**
    * Read a EbJblSmsBookRecord from 'F.EB.JBL.SMS.BOOK"<br>
    * @param id java.lang.CharSequence : Record ID to read<br>
    * @return com.temenos.t24.api.tables.ebjblsmsbook.EbJblSmsBookRecord : <br>
    */
    public com.temenos.t24.api.tables.ebjblsmsbook.EbJblSmsBookRecord read(java.lang.CharSequence id){}

    /**
    * Write a EbJblSmsBookRecord to 'F.EB.JBL.SMS.BOOK"<br>
    * @param id java.lang.CharSequence : Record ID to read<br>
    * @param record EbJblSmsBookRecord : Record to write<br>
    * @return boolean : <br>
    */
    public boolean write(java.lang.CharSequence id, EbJblSmsBookRecord record){}

    /**
    * Release (unlock)  the table 'F.EB.JBL.SMS.BOOK' for the specified ID<br>
    * @param id java.lang.CharSequence : Record ID to release<br>
    * @return boolean : <br>
    */
    public boolean release(java.lang.CharSequence id){}

    /**
    * Clear the table 'F.EB.JBL.SMS.BOOK<br>
    * @return boolean : <br>
    */
    public boolean clear(){}

    /**
    * Lock the table 'F.EB.JBL.SMS.BOOK' for the specified ID<br>
    * @param id java.lang.CharSequence : Record ID to lock<br>
    * @return boolean : <br>
    */
    public boolean lock(java.lang.CharSequence id){}

    /**
    * Returns an unmodifiable list of all record IDs of 'F.EB.JBL.SMS.BOOK'<br>
    * @return List<String> : <br>
    */
    public List<String> select(){}

    /**
    * Delete a EbJblSmsBookRecord of 'F.EB.JBL.SMS.BOOK"<br>
    * @param id java.lang.CharSequence : Record ID to delete<br>
    * @return boolean : <br>
    */
    public boolean delete(java.lang.CharSequence id){}

}
