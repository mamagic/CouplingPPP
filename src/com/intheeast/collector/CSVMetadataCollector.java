package com.intheeast.collector;

import java.util.List;

import com.intheeast.export.ExportMetadata;
import com.intheeast.fetch.FetchMetadata;

//충돌충돌 
//충돌충돌 
public class CSVMetadataCollector implements MetadataCollector {
	
	private FetchMetadata fetchMetadata;
    private ExportMetadata exportMetadata;
    
    public CSVMetadataCollector() {
    	
    }

	@Override
	public void setMetadataCollector(FetchMetadata fetchMetadata, ExportMetadata exportMetadata) {
		this.fetchMetadata = fetchMetadata;
        this.exportMetadata = exportMetadata;
	}

	@Override
	public void collectMetadata() {
		List<Object> metadata = fetchMetadata.fetchMetadata();
        exportMetadata.export(metadata);

	}

	@Override
	public void print() {
		String fetchType = fetchMetadata.getFetchType();
		System.out.println("CSV Exporting data to" + fetchType);

	}
}
