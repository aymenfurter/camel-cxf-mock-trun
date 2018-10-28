package ch.aymenfurter.orchestration.mapping;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.component.cxf.common.message.CxfConstants;
import org.apache.cxf.message.MessageContentsList;

import ch.aymenfurter.OutputLocalizedPrice;

public class Country2GeoPriceResponse implements Processor {
public void process(Exchange ex) throws Exception {
		OutputLocalizedPrice response = new OutputLocalizedPrice();
		response.setPrice("100");
		
		ex.getIn().setBody(response);
	}
}
