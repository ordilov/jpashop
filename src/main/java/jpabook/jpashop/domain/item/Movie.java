package jpabook.jpashop.domain.item;

import jpabook.jpashop.domain.Item;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@DiscriminatorValue("M")
@Getter @Setter
@Entity
public class Movie extends Item {

    private String actor;
    private String director;

}
