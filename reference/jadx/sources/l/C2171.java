package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.֫᩶᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: WA0T */
/* JADX INFO: loaded from: classes3.dex */
public final class C2171 extends AbstractC5900 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f7151;

    public C2171(InterfaceC23032 interfaceC23032, int i, String str) {
        m17135((((C14826) interfaceC23032.mo2875()).m35743() ? 1 : 2) | 33554944 | i);
        this.f7151 = str;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final byte[] m7470() {
        int i;
        try {
            int iM17132 = m17132();
            int i2 = iM17132 & 33554432;
            int i3 = 32;
            int length = (i2 != 0 ? 8 : 0) + 32;
            byte[] bytes = new byte[0];
            String str = this.f7151;
            if (i2 != 0 || str == null || str.length() == 0) {
                i = iM17132 & (-4097);
            } else {
                i = iM17132 | 4096;
                bytes = str.toUpperCase().getBytes("Cp850");
                length += bytes.length;
            }
            byte[] bArr = new byte[0];
            byte[] bArr2 = new byte[length];
            System.arraycopy(AbstractC5900.f20197, 0, bArr2, 0, 8);
            AbstractC5900.m17129(8, 1, bArr2);
            AbstractC5900.m17129(12, i & (-8193), bArr2);
            int iM17128 = AbstractC5900.m17128(16, bArr2, bytes);
            int iM17129 = AbstractC5900.m17128(24, bArr2, bArr);
            if ((i & 33554432) != 0) {
                System.arraycopy(AbstractC5900.f20196, 0, bArr2, 32, 8);
                i3 = 40;
            }
            AbstractC5900.m17127(i3 + AbstractC5900.m17127(i3, iM17128, bArr2, bytes), iM17129, bArr2, bArr);
            return bArr2;
        } catch (IOException e) {
            throw new IllegalStateException(e.getMessage());
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Type1Message[suppliedDomain=");
        String str = this.f7151;
        if (str == null) {
            str = "null";
        }
        C4794.m14774(sb, str, ",suppliedWorkstation=", "null", ",flags=0x");
        sb.append(C6033.m17503(m17132(), 8));
        sb.append("]");
        return sb.toString();
    }
}
