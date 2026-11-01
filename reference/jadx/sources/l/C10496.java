package l;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1BMPString$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ۤ᩵۠, reason: contains not printable characters */
/* JADX INFO: compiled from: WA0T */
/* JADX INFO: loaded from: classes3.dex */
public final class C10496 extends AbstractC9085 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public String f35958;

    public C10496(InterfaceC19067 interfaceC19067, int i, String str) {
        m23424((((C9895) interfaceC19067.mo29449()).m25083() ? 1 : 2) | 33554944 | i);
        this.f35958 = str;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final byte[] m26633() {
        int i;
        try {
            int iM23421 = m23421();
            int i2 = iM23421 & 33554432;
            int i3 = 32;
            int length = (i2 != 0 ? 8 : 0) + 32;
            byte[] bytes = new byte[0];
            String str = this.f35958;
            if (i2 != 0 || str == null || str.length() == 0) {
                i = iM23421 & (-4097);
            } else {
                i = iM23421 | 4096;
                bytes = str.toUpperCase().getBytes("Cp850");
                length += bytes.length;
            }
            byte[] bArr = new byte[0];
            byte[] bArr2 = new byte[length];
            System.arraycopy(AbstractC9085.f30957, 0, bArr2, 0, 8);
            AbstractC9085.m23418(8, 1, bArr2);
            AbstractC9085.m23418(12, i & (-8193), bArr2);
            int iM23417 = AbstractC9085.m23417(16, bArr2, bytes);
            int iM23418 = AbstractC9085.m23417(24, bArr2, bArr);
            if ((i & 33554432) != 0) {
                System.arraycopy(AbstractC9085.f30956, 0, bArr2, 32, 8);
                i3 = 40;
            }
            AbstractC9085.m23416(i3 + AbstractC9085.m23416(i3, iM23417, bArr2, bytes), iM23418, bArr2, bArr);
            return bArr2;
        } catch (IOException e) {
            throw new IllegalStateException(e.getMessage());
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Type1Message[suppliedDomain=");
        String str = this.f35958;
        if (str == null) {
            str = "null";
        }
        ASN1BMPString$$ExternalSyntheticOutline0.m(sb, str, ",suppliedWorkstation=", "null", ",flags=0x");
        sb.append(C5993.m16280(m23421(), 8));
        sb.append("]");
        return sb.toString();
    }
}
