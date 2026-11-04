package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.InputStream;
import l.C11958;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class DEROctetStringParser implements ASN1OctetStringParser {
    public DefiniteLengthInputStream stream;

    public DEROctetStringParser(DefiniteLengthInputStream definiteLengthInputStream) {
        this.stream = definiteLengthInputStream;
    }

    @Override // org.bouncycastle.asn1.InMemoryRepresentable
    public ASN1Primitive getLoadedObject() {
        return new DEROctetString(this.stream.toByteArray());
    }

    @Override // org.bouncycastle.asn1.ASN1OctetStringParser
    public InputStream getOctetStream() {
        return this.stream;
    }

    @Override // org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        try {
            return getLoadedObject();
        } catch (IOException e) {
            throw new ASN1ParsingException(C11958.m29932(e, new StringBuilder("IOException converting stream to byte array: ")), e);
        }
    }
}
