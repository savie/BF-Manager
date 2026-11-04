package l;

import java.util.EnumSet;

/* JADX INFO: renamed from: l.ܰܽܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: W9ED */
/* JADX INFO: loaded from: classes5.dex */
public final class C14734 extends C8023 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC25186 f48137 = C16980.m40037(C14734.class);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C8768 f48138;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public EnumSet f48139;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f48140;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C19210 f48141;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f48142;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f48143;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f48144;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public byte[] f48145;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f48146;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35419(C11707 c11707) {
        c11707.m56003(8, C22150.f71348);
        c11707.m56012();
        this.f48140 = c11707.m56017();
        c11707.m56021(2);
        this.f48142 = c11707.m56002();
        this.f48139 = C10961.m27792(c11707.m56012(), EnumC0565.class);
        byte[] bArr = new byte[8];
        c11707.m56024(8, bArr);
        this.f48145 = bArr;
        c11707.m56021(8);
        if (this.f48139.contains(EnumC0565.NTLMSSP_NEGOTIATE_TARGET_INFO)) {
            this.f48144 = c11707.m56017();
            c11707.m56021(2);
            this.f48146 = c11707.m56002();
        } else {
            c11707.m56021(8);
        }
        if (this.f48139.contains(EnumC0565.NTLMSSP_NEGOTIATE_VERSION)) {
            C8768 c8768 = new C8768();
            c8768.m23464(c11707);
            this.f48138 = c8768;
            f48137.mo13716(c8768, "Windows version = {}");
        } else {
            c11707.m56021(8);
        }
        if (this.f48140 > 0) {
            c11707.m56027(this.f48142);
            this.f48143 = c11707.m56003(this.f48140 / 2, C22150.f71350);
        }
        if (this.f48144 > 0) {
            c11707.m56027(this.f48146);
            C19210 c19210 = new C19210();
            c19210.m44528(c11707);
            this.f48141 = c19210;
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String m35423() {
        return this.f48143;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final byte[] m35422() {
        return this.f48145;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumSet m35418() {
        return this.f48139;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C19210 m35420() {
        return this.f48141;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C8768 m35421() {
        return this.f48138;
    }

    public final String toString() {
        return "NtlmChallenge{\n  targetName='" + this.f48143 + "',\n  negotiateFlags=" + this.f48139 + ",\n  serverChallenge=" + C4996.m15222(this.f48145) + ",\n  version=" + this.f48138 + ",\n  targetInfo=" + this.f48141 + "\n}";
    }
}
