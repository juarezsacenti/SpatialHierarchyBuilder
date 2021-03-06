package com.fabiosalvini.spatialhierarchybuilder.resources;

import com.fabiosalvini.spatialhierarchybuilder.datasets.Dataset;
import com.fabiosalvini.spatialhierarchybuilder.datasets.LinkedGeoDataDataset;


public class LinkedGeoDataResource extends Resource {

	public LinkedGeoDataResource(String url) {
		super(url);
	}

	@Override
	public Dataset getDataset() {
		return LinkedGeoDataDataset.getSingleton();
	}

}
