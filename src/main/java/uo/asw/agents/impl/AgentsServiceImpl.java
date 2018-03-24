package uo.asw.agents.impl;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uo.asw.agents.AgentsService;
import uo.asw.agents.util.LoaderMin;
import uo.asw.dbManagement.LoaderDAO;
import uo.asw.dbManagement.model.Agent;

/**
 * Created by Irazusta on 15/02/2017.
 */
@Service
public class AgentsServiceImpl implements AgentsService {
	@Autowired
	private LoaderDAO loaderDAO;

	@Override
	public LoaderMin getAgentInfo(String login, String password, String kind) throws IOException {
		Agent c = loaderDAO.getAgent(login, password, kind);
		if (c != null) {
			return new LoaderMin(c.getNombre() , "\""+ c.getLatitud() +"\"N - \""+ c.getLongitud() +"\"W", c.getEmail(), c.getIdentificador(), c.getKind(), c.getKindCode());
		}
		return null;
	}

	@Override
	public Agent changeInfo(Agent updatedData) {
		return loaderDAO.updateInfo(updatedData);
	}
}
