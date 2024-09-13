package com.it.governance.security;

import jakarta.persistence.AttributeConverter;

public class AttributeEncryptor implements AttributeConverter<String, String> {
    @Override
    public String convertToDatabaseColumn(String attribute) {
        return Encryption.encrypt(attribute);
    }

    @Override
    public String convertToEntityAttribute(String dbData) {
        return Encryption.decrypt(dbData);
    }
}
