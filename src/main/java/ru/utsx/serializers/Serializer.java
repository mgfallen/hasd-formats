package ru.utsx.serializers;

public interface Serializer<T extends Serializable> {

    default T serialize(){
        throw new UnsupportedOperationException();
    }

    default T deserialize(){
        throw new UnsupportedOperationException();
    }

}
