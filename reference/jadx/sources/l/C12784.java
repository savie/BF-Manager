package l;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: l.۫֫ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 39IB */
/* JADX INFO: loaded from: classes4.dex */
public final class C12784 extends AbstractC2671 {
    @Override // l.AbstractC2671
    /* JADX INFO: renamed from: ۙ */
    public final C1598 mo1664(AbstractC15877 abstractC15877, byte[] bArr) {
        if (abstractC15877.m37848()) {
            try {
                C10128 c10128 = new C10128(this.f8490, bArr);
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    byte b = 0;
                    while (c10128.available() > 0) {
                        AbstractC15877 abstractC15877M26121 = c10128.m26121();
                        Object[] objArr = {abstractC15877M26121};
                        if (!(abstractC15877M26121.m37846() == abstractC15877.m37846())) {
                            throw new IllegalStateException(String.format("Expected an ASN.1 BIT STRING as Constructed object, got: %s", objArr));
                        }
                        byte[] bArrM26120 = c10128.m26120(c10128.m26122());
                        byteArrayOutputStream.write(bArrM26120, 1, bArrM26120.length - 1);
                        if (c10128.available() <= 0) {
                            b = bArrM26120[0];
                        }
                    }
                    C1598 c1598 = new C1598(abstractC15877, byteArrayOutputStream.toByteArray(), b);
                    c10128.close();
                    return c1598;
                } catch (Throwable th) {
                    try {
                        c10128.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e) {
                throw new C9382(e, "Unable to parse Constructed ASN.1 BIT STRING", new Object[0]);
            }
        }
        return new C1598(abstractC15877, Arrays.copyOfRange(bArr, 1, bArr.length), bArr[0]);
    }
}
