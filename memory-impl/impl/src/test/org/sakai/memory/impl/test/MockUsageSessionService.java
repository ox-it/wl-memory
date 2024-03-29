/**********************************************************************************
 * $URL$
 * $Id$
 ***********************************************************************************
 *
 * Copyright (c) 2003, 2004, 2005, 2006, 2007 The Sakai Foundation.
 *
 * Licensed under the Educational Community License, Version 1.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.opensource.org/licenses/ecl1.php
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 **********************************************************************************/

package org.sakai.memory.impl.test;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.sakaiproject.event.api.SessionState;
import org.sakaiproject.event.api.UsageSession;
import org.sakaiproject.event.api.UsageSessionService;
import org.sakaiproject.user.api.Authentication;

/**
 * @author ieb
 *
 */
public class MockUsageSessionService implements UsageSessionService
{

	/* (non-Javadoc)
	 * @see org.sakaiproject.event.api.UsageSessionService#closeSessionsOnInvalidServers(java.util.List)
	 */
	public int closeSessionsOnInvalidServers(List<String> validServerIds)
	{
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see org.sakaiproject.event.api.UsageSessionService#getOpenSessions()
	 */
	public List getOpenSessions()
	{
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.sakaiproject.event.api.UsageSessionService#getOpenSessionsByServer()
	 */
	public Map getOpenSessionsByServer()
	{
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.sakaiproject.event.api.UsageSessionService#getSession()
	 */
	public UsageSession getSession()
	{
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.sakaiproject.event.api.UsageSessionService#getSession(java.lang.String)
	 */
	public UsageSession getSession(String id)
	{
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.sakaiproject.event.api.UsageSessionService#getSessionId()
	 */
	public String getSessionId()
	{
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.sakaiproject.event.api.UsageSessionService#getSessionInactiveTimeout()
	 */
	public int getSessionInactiveTimeout()
	{
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see org.sakaiproject.event.api.UsageSessionService#getSessionLostTimeout()
	 */
	public int getSessionLostTimeout()
	{
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see org.sakaiproject.event.api.UsageSessionService#getSessionState(java.lang.String)
	 */
	public SessionState getSessionState(String key)
	{
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.sakaiproject.event.api.UsageSessionService#getSessions(java.util.List)
	 */
	public List getSessions(List ids)
	{
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.sakaiproject.event.api.UsageSessionService#getSessions(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Object[])
	 */
	public List getSessions(String joinTable, String joinAlias, String joinColumn,
			String joinCriteria, Object[] values)
	{
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.sakaiproject.event.api.UsageSessionService#logout()
	 */
	public void logout()
	{
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see org.sakaiproject.event.api.UsageSessionService#setSessionActive(boolean)
	 */
	public UsageSession setSessionActive(boolean auto)
	{
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.sakaiproject.event.api.UsageSessionService#startSession(java.lang.String, java.lang.String, java.lang.String)
	 */
	public UsageSession startSession(String userId, String remoteAddress, String userAgent)
	{
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.sakaiproject.event.api.UsageSessionService#login(org.sakaiproject.user.api.Authentication, javax.servlet.http.HttpServletRequest)
	 */
	public boolean login(Authentication authn, HttpServletRequest req)
	{
		// TODO Auto-generated method stub
		return false;
	}

	public void cleanupSessions() {
		// TODO Auto-generated method stub
		
	}
	
	

}
