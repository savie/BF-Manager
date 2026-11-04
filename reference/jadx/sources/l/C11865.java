package l;

import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ۧ᩶᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 99YC */
/* JADX INFO: loaded from: classes4.dex */
public final class C11865 extends AbstractC5900 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public byte[] f38244;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f38245;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public byte[] f38246;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public byte[] f38247;

    public C11865(byte[] bArr) throws IOException {
        for (int i = 0; i < 8; i++) {
            if (bArr[i] != AbstractC5900.f20197[i]) {
                throw new IOException("Not an NTLMSSP message.");
            }
        }
        if (AbstractC5900.m17131(8, bArr) != 2) {
            throw new IOException("Not a Type 2 message.");
        }
        int iM17131 = AbstractC5900.m17131(20, bArr);
        m17135(iM17131);
        byte[] bArrM17130 = AbstractC5900.m17130(12, bArr);
        int iM17132 = AbstractC5900.m17131(16, bArr);
        if (bArrM17130.length != 0) {
            this.f38245 = new String(bArrM17130, (iM17131 & 1) != 0 ? "UTF-16LE" : "Cp850");
        }
        for (int i2 = 24; i2 < 32; i2++) {
            if (bArr[i2] != 0) {
                byte[] bArr2 = new byte[8];
                System.arraycopy(bArr, 24, bArr2, 0, 8);
                this.f38247 = bArr2;
                break;
            }
        }
        if (iM17132 < 40 || bArr.length < 40) {
            return;
        }
        for (int i3 = 32; i3 < 40; i3++) {
            if (bArr[i3] != 0) {
                byte[] bArr3 = new byte[8];
                System.arraycopy(bArr, 32, bArr3, 0, 8);
                this.f38246 = bArr3;
                break;
            }
        }
        if (iM17132 < 48 || bArr.length < 48) {
            return;
        }
        byte[] bArrM17131 = AbstractC5900.m17130(40, bArr);
        if (bArrM17131.length != 0) {
            this.f38244 = bArrM17131;
        }
    }

    static {
        C16980.m40037(C11865.class);
        new HashMap();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final byte[] m29730() {
        return this.f38247;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final byte[] m29731() {
        return this.f38244;
    }

    public final String toString() {
        String strM31437;
        String strM31438;
        StringBuilder sbM51387 = C22783.m51387("Type2Message[target=", this.f38245, ",challenge=");
        String strM31439 = "null";
        byte[] bArr = this.f38247;
        if (bArr == null) {
            strM31437 = "null";
        } else {
            strM31437 = C12669.m31437(bArr.length, " bytes>", new StringBuilder("<"));
        }
        sbM51387.append(strM31437);
        sbM51387.append(",context=");
        byte[] bArr2 = this.f38246;
        if (bArr2 == null) {
            strM31438 = "null";
        } else {
            strM31438 = C12669.m31437(bArr2.length, " bytes>", new StringBuilder("<"));
        }
        sbM51387.append(strM31438);
        sbM51387.append(",targetInformation=");
        byte[] bArr3 = this.f38244;
        if (bArr3 != null) {
            strM31439 = C12669.m31437(bArr3.length, " bytes>", new StringBuilder("<"));
        }
        sbM51387.append(strM31439);
        sbM51387.append(",flags=0x");
        sbM51387.append(C6033.m17503(m17132(), 8));
        sbM51387.append("]");
        return sbM51387.toString();
    }
}
