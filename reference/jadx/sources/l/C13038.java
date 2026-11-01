package l;

import java.nio.charset.Charset;
import java.util.AbstractSet;

/* JADX INFO: renamed from: l.۬ۢ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 89HI */
/* JADX INFO: loaded from: classes4.dex */
public final class C13038 extends C1042 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public byte[] f43474;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f43475;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public byte[] f43476;

    public C13038(AbstractSet abstractSet, String str, String str2, C8099 c8099, boolean z) {
        byte[] bytes;
        super(abstractSet, c8099);
        byte[] bytes2 = C15155.f49499;
        if (str != null) {
            Charset charset = C11627.f39051;
            bytes = str.getBytes(Charset.forName("Cp850"));
        } else {
            bytes = bytes2;
        }
        this.f43474 = bytes;
        if (str2 != null) {
            Charset charset2 = C11627.f39051;
            bytes2 = str2.getBytes(Charset.forName("Cp850"));
        }
        this.f43476 = bytes2;
        this.f43475 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32251(C5982 c5982) {
        c5982.m27399("NTLMSSP\u0000", C7393.f24572);
        c5982.m27398(1L);
        c5982.m27398(C20799.m46781(this.f4844));
        boolean z = this.f43475;
        int iM36320 = !z ? 40 : 32;
        boolean zContains = this.f4844.contains(EnumC3864.NTLMSSP_NEGOTIATE_OEM_DOMAIN_SUPPLIED);
        byte[] bArr = this.f43474;
        if (zContains) {
            iM36320 = C15155.m36320(c5982, bArr, iM36320);
        } else {
            c5982.m27396(0);
            c5982.m27396(0);
            c5982.m27398(0L);
        }
        boolean zContains2 = this.f4844.contains(EnumC3864.NTLMSSP_NEGOTIATE_OEM_WORKSTATION_SUPPLIED);
        byte[] bArr2 = this.f43476;
        if (zContains2) {
            C15155.m36320(c5982, bArr2, iM36320);
        } else {
            c5982.m27396(0);
            c5982.m27396(0);
            c5982.m27398(0L);
        }
        if (!z && this.f4844.contains(EnumC3864.NTLMSSP_NEGOTIATE_VERSION)) {
            this.f4845.m21313(c5982);
        } else if (!z) {
            c5982.m27392(0L);
        }
        c5982.m27383(bArr.length, bArr);
        c5982.m27383(bArr2.length, bArr2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NtlmNegotiate{\n  domain='");
        Charset charset = C11627.f39051;
        byte[] bArr = this.f43474;
        sb.append(bArr != null ? new String(bArr, Charset.forName("Cp850")) : "");
        sb.append("'',\n  workstation='");
        byte[] bArr2 = this.f43476;
        sb.append(bArr2 != null ? new String(bArr2, Charset.forName("Cp850")) : "");
        sb.append("',\n  negotiateFlags=");
        sb.append(this.f4844);
        sb.append(",\n  version=");
        sb.append(this.f4845);
        sb.append("\n}");
        return sb.toString();
    }
}
