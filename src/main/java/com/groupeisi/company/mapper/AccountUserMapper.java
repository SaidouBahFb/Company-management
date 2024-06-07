package com.groupeisi.company.mapper;

import com.groupeisi.company.dto.AccountUserDto;
import com.groupeisi.company.entities.AccountUserEntity;

public class AccountUserMapper {
	
	public AccountUserEntity toAccountUserEntity(AccountUserDto accountUserDto) {
		
		AccountUserEntity accountUserEntity = new AccountUserEntity();
		
		accountUserEntity.setId(accountUserDto.getId());
		accountUserEntity.setEmail(accountUserDto.getEmail());
		accountUserEntity.setPassword(accountUserDto.getPassword());
		accountUserEntity.setState(accountUserDto.isState());
		
		return accountUserEntity;	
	}
	
	public AccountUserDto toAccountUserDto(AccountUserEntity accountUserEntity) {
		
		AccountUserDto accountUserDto = new AccountUserDto();
		
		accountUserDto.setId(accountUserEntity.getId());
		accountUserDto.setEmail(accountUserEntity.getEmail());
		accountUserDto.setPassword(accountUserEntity.getPassword());
		accountUserDto.setState(accountUserEntity.isState());
		
		return accountUserDto;	
	}

}
