package l;

import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: renamed from: l.۟᩵۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 99YC */
/* JADX INFO: loaded from: classes3.dex */
public final class C7673 extends AbstractC9085 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public byte[] f25388;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public byte[] f25389;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public byte[] f25390;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public String f25391;

    public C7673(byte[] bArr) throws IOException {
        for (int i = 0; i < 8; i++) {
            if (bArr[i] != AbstractC9085.f30957[i]) {
                throw new IOException("Not an NTLMSSP message.");
            }
        }
        if (AbstractC9085.m23420(8, bArr) != 2) {
            throw new IOException("Not a Type 2 message.");
        }
        int iM23420 = AbstractC9085.m23420(20, bArr);
        m23424(iM23420);
        byte[] bArrM23419 = AbstractC9085.m23419(12, bArr);
        int iM23421 = AbstractC9085.m23420(16, bArr);
        if (bArrM23419.length != 0) {
            this.f25391 = new String(bArrM23419, (iM23420 & 1) != 0 ? "UTF-16LE" : "Cp850");
        }
        for (int i2 = 24; i2 < 32; i2++) {
            if (bArr[i2] != 0) {
                byte[] bArr2 = new byte[8];
                System.arraycopy(bArr, 24, bArr2, 0, 8);
                this.f25389 = bArr2;
                break;
            }
        }
        if (iM23421 < 40 || bArr.length < 40) {
            return;
        }
        for (int i3 = 32; i3 < 40; i3++) {
            if (bArr[i3] != 0) {
                byte[] bArr3 = new byte[8];
                System.arraycopy(bArr, 32, bArr3, 0, 8);
                this.f25390 = bArr3;
                break;
            }
        }
        if (iM23421 < 48 || bArr.length < 48) {
            return;
        }
        byte[] bArrM234110 = AbstractC9085.m23419(40, bArr);
        if (bArrM234110.length != 0) {
            this.f25388 = bArrM234110;
        }
    }

    static {
        C13488.m32997(C7673.class);
        new HashMap();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final byte[] m20266() {
        return this.f25389;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final byte[] m20265() {
        return this.f25388;
    }

    public final String toString() {
        String strM30911;
        String strM30912;
        StringBuilder sbM30914 = C12441.m30914("Type2Message[target=", this.f25391, ",challenge=");
        String strM30913 = "null";
        byte[] bArr = this.f25389;
        if (bArr == null) {
            strM30911 = "null";
        } else {
            strM30911 = C12441.m30911(bArr.length, " bytes>", new StringBuilder("<"));
        }
        sbM30914.append(strM30911);
        sbM30914.append(",context=");
        byte[] bArr2 = this.f25390;
        if (bArr2 == null) {
            strM30912 = "null";
        } else {
            strM30912 = C12441.m30911(bArr2.length, " bytes>", new StringBuilder("<"));
        }
        sbM30914.append(strM30912);
        sbM30914.append(",targetInformation=");
        byte[] bArr3 = this.f25388;
        if (bArr3 != null) {
            strM30913 = C12441.m30911(bArr3.length, " bytes>", new StringBuilder("<"));
        }
        sbM30914.append(strM30913);
        sbM30914.append(",flags=0x");
        sbM30914.append(C5993.m16280(m23421(), 8));
        sbM30914.append("]");
        return sbM30914.toString();
    }
}
