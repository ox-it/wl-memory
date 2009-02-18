package org.sakai.memory.impl.test;

import org.sakaiproject.memory.impl.CacheInitializer;

import junit.framework.TestCase;
import net.sf.ehcache.config.CacheConfiguration;

public class TestCacheInitializer extends TestCase {

	private CacheConfiguration config;
	private CacheInitializer initializer;
	
	public void setUp() {
		config = new CacheConfiguration();
		initializer = new CacheInitializer();
	}

	public void testSingleConfig() {
		initializer.configure("timeToLiveSeconds=400").initialize(config);
		assertEquals(400, config.getTimeToLiveSeconds());
	}
	
	public void testMultipleConfig() {
		initializer.configure("timeToLiveSeconds=300,timeToIdleSeconds=150")
			.initialize(config);
		assertEquals(300, config.getTimeToLiveSeconds());
		assertEquals(150, config.getTimeToIdleSeconds());
	}
	
	public void testDuplicateConfig() {
		initializer.configure("timeToLiveSeconds=300,timeToIdleSeconds=150,timeToLiveSeconds=10")
			.initialize(config);
		assertEquals(10, config.getTimeToLiveSeconds());
		assertEquals(150, config.getTimeToIdleSeconds());
	}
	
	public void testBadKey() {
		initializer.configure("doesNotExist=300,timeToIdleSeconds=150")
			.initialize(config);
		assertEquals(150, config.getTimeToIdleSeconds());
	}
	
	public void testBadValue() {
		initializer.configure("timeToLiveSeconds=300a,timeToIdleSeconds=150")
			.initialize(config);
		assertEquals(150, config.getTimeToIdleSeconds());
	}
	 
}
