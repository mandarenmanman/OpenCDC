package me.xcoding.opencdc.binlog.event.statement;

import me.xcoding.opencdc.binlog.EventContext;
import me.xcoding.opencdc.binlog.event.Event;
import me.xcoding.opencdc.binlog.parser.EventParser;
import me.xcoding.opencdc.mysql.protocol.BasicReader;

public class RandEvent extends Event implements EventParser {

	@Override
	public Event parser(EventContext context, BasicReader reader) {
		// TODO Auto-generated method stub
		return null;
	}
}
