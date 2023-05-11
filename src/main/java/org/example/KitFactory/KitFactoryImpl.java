package org.example.KitFactory;

import org.example.Kit.Kit;

public class KitFactoryImpl implements KitFactory{
    @Override
    public Kit createKit(int codigo){
        return new Kit(codigo);
    }
}
