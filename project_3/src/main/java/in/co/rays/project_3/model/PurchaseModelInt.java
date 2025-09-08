package in.co.rays.project_3.model;

import java.util.List;

import in.co.rays.project_3.dto.UserDTO;
import in.co.rays.project_3.exception.ApplicationException;
import in.co.rays.project_3.exception.DuplicateRecordException;
import in.co.rays.project_3.exception.RecordNotFoundException;

public interface PurchaseModelInt { 
	
	public long add(UserDTO dto) throws ApplicationException, DuplicateRecordException;

	public void delete(UserDTO dto) throws ApplicationException;

	public void update(UserDTO dto) throws ApplicationException, DuplicateRecordException;

	public UserDTO findByPK(long pk) throws ApplicationException;

	public List list() throws ApplicationException;

	public List list(int pageNo, int pageSize) throws ApplicationException;

	public List search(UserDTO dto, int pageNo, int pageSize) throws ApplicationException;

	public List search(UserDTO dto) throws ApplicationException;

	}
