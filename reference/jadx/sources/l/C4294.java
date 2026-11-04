package l;

import java.nio.charset.Charset;
import java.util.AbstractSet;
import java.util.Set;

/* JADX INFO: renamed from: l.ۘܽܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q9I3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4294 extends C21448 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public byte[] f15567;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public byte[] f15568;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public byte[] f15569;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public byte[] f15570;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public byte[] f15571;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public byte[] f15572;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public byte[] f15573;

    public C4294(byte[] bArr, byte[] bArr2, String str, String str2, String str3, byte[] bArr3, AbstractSet abstractSet, C8768 c8768) {
        super(abstractSet, c8768);
        byte[] bArr4 = C10259.f32761;
        this.f15571 = bArr == null ? bArr4 : bArr;
        this.f15568 = bArr2 == null ? bArr4 : bArr2;
        this.f15567 = str != null ? str.getBytes(C6532.f21949) : bArr4;
        this.f15573 = str2 != null ? str2.getBytes(C6532.f21949) : bArr4;
        this.f15569 = str3 != null ? str3.getBytes(C6532.f21949) : bArr4;
        this.f15572 = bArr3 == null ? bArr4 : bArr3;
        this.f68433 = abstractSet;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13669(C11707 c11707) {
        c11707.m56026("NTLMSSP\u0000", C22150.f71348);
        c11707.m56025(3L);
        Set set = this.f68433;
        EnumC0565 enumC0565 = EnumC0565.NTLMSSP_NEGOTIATE_VERSION;
        int i = (set.contains(enumC0565) || this.f15570 != null) ? 72 : 64;
        if (this.f15570 != null) {
            i += 16;
        }
        byte[] bArr = this.f15571;
        int iM26452 = C10259.m26452(c11707, bArr, i);
        byte[] bArr2 = this.f15568;
        int iM26453 = C10259.m26452(c11707, bArr2, iM26452);
        byte[] bArr3 = this.f15573;
        int iM26454 = C10259.m26452(c11707, bArr3, iM26453);
        byte[] bArr4 = this.f15567;
        int iM26455 = C10259.m26452(c11707, bArr4, iM26454);
        byte[] bArr5 = this.f15569;
        int iM26456 = C10259.m26452(c11707, bArr5, iM26455);
        byte[] bArr6 = this.f15572;
        C10259.m26452(c11707, bArr6, iM26456);
        c11707.m56025(C10961.m27791(this.f68433));
        if (this.f68433.contains(enumC0565)) {
            C11707 c11708 = new C11707();
            c11708.m56005((byte) 6);
            c11708.m56005((byte) 1);
            c11708.m56023(7600);
            c11708.m56007(3, new byte[]{0, 0, 0});
            c11708.m56005((byte) 15);
            byte[] bArrM56028 = c11708.m56028();
            c11707.m56007(bArrM56028.length, bArrM56028);
        } else if (this.f15570 != null) {
            c11707.m56014(0L);
        }
        byte[] bArr7 = this.f15570;
        if (bArr7 != null) {
            c11707.m56007(16, bArr7);
        }
        c11707.m56007(bArr.length, bArr);
        c11707.m56007(bArr2.length, bArr2);
        c11707.m56007(bArr3.length, bArr3);
        c11707.m56007(bArr4.length, bArr4);
        c11707.m56007(bArr5.length, bArr5);
        c11707.m56007(bArr6.length, bArr6);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13670(byte[] bArr) {
        this.f15570 = bArr;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("NtlmAuthenticate{\n  mic=");
        byte[] bArr = this.f15570;
        sb.append(bArr != null ? C4996.m15222(bArr) : "[]");
        sb.append(",\n  lmResponse=");
        sb.append(C4996.m15222(this.f15571));
        sb.append(",\n  ntResponse=");
        sb.append(C4996.m15222(this.f15568));
        sb.append(",\n  domainName='");
        byte[] bArr2 = this.f15573;
        if (bArr2 != null) {
            str = new String(bArr2, C6532.f21949);
        } else {
            Charset charset = C6532.f21949;
            str = "";
        }
        sb.append(str);
        sb.append("',\n  userName='");
        byte[] bArr3 = this.f15567;
        sb.append(bArr3 != null ? new String(bArr3, C6532.f21949) : "");
        sb.append("',\n  workstation='");
        byte[] bArr4 = this.f15569;
        return C8947.m23910(sb, bArr4 != null ? new String(bArr4, C6532.f21949) : "", "',\n  encryptedRandomSessionKey=[<secret>],\n}");
    }
}
