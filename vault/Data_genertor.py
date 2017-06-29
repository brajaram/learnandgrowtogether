### personal copy 

import mysql.connector
import json

def Metadata_extract(sor,rec_cnt):
	cnx = mysql.connector.connect(user='root', password='',host='127.0.0.1',database='mdm')
	cursor = cnx.cursor()
	sor=1
	rec_cnt=10
	query=("select col_nm,col_pos,col_type,col_format,col_length from vault_source_attribute where sor_id=%s order by cast(col_pos as int) asc;")
	cursor.execute(query,(sor))
	return cursor

def type_identi(typee):
	switch(typee){
		case 'int':
			return "Number Range"
		case 'varchar':
			return "Alphanumeric"

def Contruct_json(cursor):
	for (col_nm,col_pos,col_type,col_format,col_length) in cursor:
		if col_type=='integer'||col_type=='int'
			d1={}
			d1['type']="alphanumeric"
			d1['label']="name"
			row_json.get('rows').append(d1)
			o=json.dumps(row_json);
		
def json_request(json_str,path):
	



cursor.close()
cnx.close()
