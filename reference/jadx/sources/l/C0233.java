package l;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: l.֡ۛ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 39IB */
/* JADX INFO: loaded from: classes2.dex */
public final class C0233 extends AbstractC18203 {
    @Override // l.AbstractC18203
    /* JADX INFO: renamed from: ۙ */
    public final C12229 mo1600(AbstractC14676 abstractC14676, byte[] bArr) {
        if (abstractC14676.m35209()) {
            try {
                C23143 c23143 = new C23143(this.f58149, bArr);
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    byte b = 0;
                    while (c23143.available() > 0) {
                        AbstractC14676 abstractC14676M51135 = c23143.m51135();
                        Object[] objArr = {abstractC14676M51135};
                        if (!(abstractC14676M51135.m35212() == abstractC14676.m35212())) {
                            throw new IllegalStateException(String.format("Expected an ASN.1 BIT STRING as Constructed object, got: %s", objArr));
                        }
                        byte[] bArrM51136 = c23143.m51136(c23143.m51137());
                        byteArrayOutputStream.write(bArrM51136, 1, bArrM51136.length - 1);
                        if (c23143.available() <= 0) {
                            b = bArrM51136[0];
                        }
                    }
                    C12229 c12229 = new C12229(abstractC14676, byteArrayOutputStream.toByteArray(), b);
                    c23143.close();
                    return c12229;
                } catch (Throwable th) {
                    try {
                        c23143.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e) {
                throw new C21731(e, "Unable to parse Constructed ASN.1 BIT STRING", new Object[0]);
            }
        }
        return new C12229(abstractC14676, Arrays.copyOfRange(bArr, 1, bArr.length), bArr[0]);
    }
}
