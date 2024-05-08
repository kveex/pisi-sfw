package kveex.pisi.utils;

import net.minecraft.entity.attribute.ClampedEntityAttribute;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class ModAttribute {
    public static final EntityAttribute CUSTOM = register("static_regeneration", new ClampedEntityAttribute("attribute.name.static_regeneration", 0.0, 0.0, 30.0));
            //EntityAttributes.register("generic.armor", new ClampedEntityAttribute("attribute.name.generic.armor", 0.0, 0.0, 30.0).setTracked(true));

    public static EntityAttribute register(String id, EntityAttribute attribute) {
        return Registry.register(Registries.ATTRIBUTE, id, attribute);
    }
}
