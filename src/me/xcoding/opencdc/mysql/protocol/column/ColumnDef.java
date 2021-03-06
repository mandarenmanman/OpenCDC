package me.xcoding.opencdc.mysql.protocol.column;

/**
 * <b>Column Definition</b>
 * </br> byte0 type </br> byte1 meta </br>
 * 
 * @author Teny Zh(zh.Teny.1@gmail.com)
 *
 */
public class ColumnDef {
	private int type;
	private int meta;
	
	public ColumnDef(int type, int meta) {
		
	}
	
	ColumnDef valueOf(int type, int meta) {
		this.type = type & 0x001F;
		this.meta = meta;
		return this;
	}
	
	public int getType() {
		return type;
	}
	
	public int getMeta() {
		return meta;
	}
}
