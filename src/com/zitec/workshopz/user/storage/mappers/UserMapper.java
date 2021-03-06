package com.zitec.workshopz.user.storage.mappers;

import java.util.HashMap;

import com.zitec.workshopz.base.BaseEntity;
import com.zitec.workshopz.base.BaseStorageMapper;
import com.zitec.workshopz.user.entities.User;
import com.zitec.workshopz.user.storage.adapters.UserWSAdapter;


public class UserMapper extends BaseStorageMapper{
	
	public void getEntity(String username, String password){
		((UserWSAdapter)this.adapter).getEntity(username, password);
	}
	
	@Override
	public BaseEntity hydrate(HashMap<String, String> data) {
		User usr = new User();
		usr.setEmail(data.get("email"));
		usr.setRemoteId(data.get("remote_id"));
		usr.setName(data.get("name"));
		usr.setPhoneNumber(data.get("phone_number"));
		usr.setPosition(data.get("position"));
		return usr;
	}

	@Override
	public HashMap<String, String> dehydrate(BaseEntity data) {
		// TODO Auto-generated method stub
		return null;
	}
}
