package l;

import java.nio.charset.Charset;
import java.util.AbstractSet;

/* JADX INFO: renamed from: l.ܿܽܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 89HI */
/* JADX INFO: loaded from: classes5.dex */
public final class C18464 extends C21448 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public byte[] f60093;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f60094;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public byte[] f60095;

    public C18464(AbstractSet abstractSet, String str, String str2, C8768 c8768, boolean z) {
        byte[] bytes;
        super(abstractSet, c8768);
        byte[] bytes2 = C10259.f32761;
        if (str != null) {
            Charset charset = C6532.f21949;
            bytes = str.getBytes(Charset.forName("Cp850"));
        } else {
            bytes = bytes2;
        }
        this.f60095 = bytes;
        if (str2 != null) {
            Charset charset2 = C6532.f21949;
            bytes2 = str2.getBytes(Charset.forName("Cp850"));
        }
        this.f60093 = bytes2;
        this.f60094 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43011(C11707 c11707) {
        c11707.m56026("NTLMSSP\u0000", C22150.f71348);
        c11707.m56025(1L);
        c11707.m56025(C10961.m27791(this.f68433));
        boolean z = this.f60094;
        int iM26452 = !z ? 40 : 32;
        boolean zContains = this.f68433.contains(EnumC0565.NTLMSSP_NEGOTIATE_OEM_DOMAIN_SUPPLIED);
        byte[] bArr = this.f60095;
        if (zContains) {
            iM26452 = C10259.m26452(c11707, bArr, iM26452);
        } else {
            c11707.m56023(0);
            c11707.m56023(0);
            c11707.m56025(0L);
        }
        boolean zContains2 = this.f68433.contains(EnumC0565.NTLMSSP_NEGOTIATE_OEM_WORKSTATION_SUPPLIED);
        byte[] bArr2 = this.f60093;
        if (zContains2) {
            C10259.m26452(c11707, bArr2, iM26452);
        } else {
            c11707.m56023(0);
            c11707.m56023(0);
            c11707.m56025(0L);
        }
        if (!z && this.f68433.contains(EnumC0565.NTLMSSP_NEGOTIATE_VERSION)) {
            this.f68434.m23465(c11707);
        } else if (!z) {
            c11707.m56014(0L);
        }
        c11707.m56007(bArr.length, bArr);
        c11707.m56007(bArr2.length, bArr2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NtlmNegotiate{\n  domain='");
        Charset charset = C6532.f21949;
        byte[] bArr = this.f60095;
        sb.append(bArr != null ? new String(bArr, Charset.forName("Cp850")) : "");
        sb.append("'',\n  workstation='");
        byte[] bArr2 = this.f60093;
        sb.append(bArr2 != null ? new String(bArr2, Charset.forName("Cp850")) : "");
        sb.append("',\n  negotiateFlags=");
        sb.append(this.f68433);
        sb.append(",\n  version=");
        sb.append(this.f68434);
        sb.append("\n}");
        return sb.toString();
    }
}
