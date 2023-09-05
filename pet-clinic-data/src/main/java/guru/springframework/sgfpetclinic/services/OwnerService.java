package guru.springframework.sgfpetclinic.services;

import guru.springframework.sgfpetclinic.model.Owner;
import org.springframework.stereotype.Service;


public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
