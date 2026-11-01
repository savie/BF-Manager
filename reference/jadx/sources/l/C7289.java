package l;

import java.io.ByteArrayInputStream;
import java.math.BigInteger;

/* JADX INFO: renamed from: l.۟ۛ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: S9JY */
/* JADX INFO: loaded from: classes3.dex */
public final class C7289 extends AbstractC18203 {
    @Override // l.AbstractC18203
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC9032 mo1600(AbstractC14676 abstractC14676, byte[] bArr) {
        int i;
        if (bArr.length <= 0) {
            throw new IllegalArgumentException("An ASN.1 OBJECT IDENTIFIER should have at least a one byte value");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        StringBuilder sb = new StringBuilder();
        int i2 = byteArrayInputStream.read();
        sb.append(i2 / 40);
        sb.append('.');
        sb.append(i2 % 40);
        while (byteArrayInputStream.available() > 0) {
            int i3 = byteArrayInputStream.read();
            if (i3 < 127) {
                sb.append('.');
                sb.append(i3);
            } else {
                BigInteger bigIntegerValueOf = BigInteger.valueOf(i3 & 127);
                do {
                    i = byteArrayInputStream.read();
                    bigIntegerValueOf = bigIntegerValueOf.shiftLeft(7).add(BigInteger.valueOf(i & 127));
                } while (i > 127);
                sb.append('.');
                sb.append(bigIntegerValueOf);
            }
        }
        return new C15757(bArr, sb.toString());
    }
}
