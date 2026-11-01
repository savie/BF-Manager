package l;

import java.nio.charset.Charset;
import java.util.AbstractSet;
import java.util.Set;

/* JADX INFO: renamed from: l.ۚۢ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: Q9I3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5276 extends C1042 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public byte[] f18267;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public byte[] f18268;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public byte[] f18269;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public byte[] f18270;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public byte[] f18271;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public byte[] f18272;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public byte[] f18273;

    public C5276(byte[] bArr, byte[] bArr2, String str, String str2, String str3, byte[] bArr3, AbstractSet abstractSet, C8099 c8099) {
        super(abstractSet, c8099);
        byte[] bArr4 = C15155.f49499;
        this.f18273 = bArr == null ? bArr4 : bArr;
        this.f18272 = bArr2 == null ? bArr4 : bArr2;
        this.f18269 = str != null ? str.getBytes(C11627.f39051) : bArr4;
        this.f18268 = str2 != null ? str2.getBytes(C11627.f39051) : bArr4;
        this.f18271 = str3 != null ? str3.getBytes(C11627.f39051) : bArr4;
        this.f18270 = bArr3 == null ? bArr4 : bArr3;
        this.f4844 = abstractSet;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14568(C5982 c5982) {
        c5982.m27399("NTLMSSP\u0000", C7393.f24572);
        c5982.m27398(3L);
        Set set = this.f4844;
        EnumC3864 enumC3864 = EnumC3864.NTLMSSP_NEGOTIATE_VERSION;
        int i = (set.contains(enumC3864) || this.f18267 != null) ? 72 : 64;
        if (this.f18267 != null) {
            i += 16;
        }
        byte[] bArr = this.f18273;
        int iM36320 = C15155.m36320(c5982, bArr, i);
        byte[] bArr2 = this.f18272;
        int iM36321 = C15155.m36320(c5982, bArr2, iM36320);
        byte[] bArr3 = this.f18268;
        int iM36322 = C15155.m36320(c5982, bArr3, iM36321);
        byte[] bArr4 = this.f18269;
        int iM36323 = C15155.m36320(c5982, bArr4, iM36322);
        byte[] bArr5 = this.f18271;
        int iM36324 = C15155.m36320(c5982, bArr5, iM36323);
        byte[] bArr6 = this.f18270;
        C15155.m36320(c5982, bArr6, iM36324);
        c5982.m27398(C20799.m46781(this.f4844));
        if (this.f4844.contains(enumC3864)) {
            C5982 c5983 = new C5982();
            c5983.m27381((byte) 6);
            c5983.m27381((byte) 1);
            c5983.m27396(7600);
            c5983.m27383(3, new byte[]{0, 0, 0});
            c5983.m27381((byte) 15);
            byte[] bArrM27377 = c5983.m27377();
            c5982.m27383(bArrM27377.length, bArrM27377);
        } else if (this.f18267 != null) {
            c5982.m27392(0L);
        }
        byte[] bArr7 = this.f18267;
        if (bArr7 != null) {
            c5982.m27383(16, bArr7);
        }
        c5982.m27383(bArr.length, bArr);
        c5982.m27383(bArr2.length, bArr2);
        c5982.m27383(bArr3.length, bArr3);
        c5982.m27383(bArr4.length, bArr4);
        c5982.m27383(bArr5.length, bArr5);
        c5982.m27383(bArr6.length, bArr6);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14569(byte[] bArr) {
        this.f18267 = bArr;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("NtlmAuthenticate{\n  mic=");
        byte[] bArr = this.f18267;
        sb.append(bArr != null ? C10216.m26000(bArr) : "[]");
        sb.append(",\n  lmResponse=");
        sb.append(C10216.m26000(this.f18273));
        sb.append(",\n  ntResponse=");
        sb.append(C10216.m26000(this.f18272));
        sb.append(",\n  domainName='");
        byte[] bArr2 = this.f18268;
        if (bArr2 != null) {
            str = new String(bArr2, C11627.f39051);
        } else {
            Charset charset = C11627.f39051;
            str = "";
        }
        sb.append(str);
        sb.append("',\n  userName='");
        byte[] bArr3 = this.f18269;
        sb.append(bArr3 != null ? new String(bArr3, C11627.f39051) : "");
        sb.append("',\n  workstation='");
        byte[] bArr4 = this.f18271;
        return C22697.m50267(sb, bArr4 != null ? new String(bArr4, C11627.f39051) : "", "',\n  encryptedRandomSessionKey=[<secret>],\n}");
    }
}
