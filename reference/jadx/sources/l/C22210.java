package l;

import java.util.EnumSet;

/* JADX INFO: renamed from: l.᩹ۢ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: W9ED */
/* JADX INFO: loaded from: classes.dex */
public final class C22210 extends C6687 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC4314 f72640 = C13488.m32997(C22210.class);

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f72641;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f72642;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C8099 f72643;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public EnumSet f72644;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f72645;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C22916 f72646;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f72647;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public byte[] f72648;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public String f72649;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49328(C5982 c5982) {
        c5982.m27379(8, C7393.f24572);
        c5982.m27394();
        this.f72647 = c5982.m27375();
        c5982.m27389(2);
        this.f72641 = c5982.m27378();
        this.f72644 = C20799.m46782(c5982.m27394(), EnumC3864.class);
        byte[] bArr = new byte[8];
        c5982.m27397(8, bArr);
        this.f72648 = bArr;
        c5982.m27389(8);
        if (this.f72644.contains(EnumC3864.NTLMSSP_NEGOTIATE_TARGET_INFO)) {
            this.f72645 = c5982.m27375();
            c5982.m27389(2);
            this.f72642 = c5982.m27378();
        } else {
            c5982.m27389(8);
        }
        if (this.f72644.contains(EnumC3864.NTLMSSP_NEGOTIATE_VERSION)) {
            C8099 c8099 = new C8099();
            c8099.m21312(c5982);
            this.f72643 = c8099;
            f72640.mo12126(c8099, "Windows version = {}");
        } else {
            c5982.m27389(8);
        }
        if (this.f72647 > 0) {
            c5982.m27376(this.f72641);
            this.f72649 = c5982.m27379(this.f72647 / 2, C7393.f24570);
        }
        if (this.f72645 > 0) {
            c5982.m27376(this.f72642);
            C22916 c22916 = new C22916();
            c22916.m50694(c5982);
            this.f72646 = c22916;
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String m49326() {
        return this.f72649;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final byte[] m49331() {
        return this.f72648;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumSet m49327() {
        return this.f72644;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C22916 m49330() {
        return this.f72646;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C8099 m49329() {
        return this.f72643;
    }

    public final String toString() {
        return "NtlmChallenge{\n  targetName='" + this.f72649 + "',\n  negotiateFlags=" + this.f72644 + ",\n  serverChallenge=" + C10216.m26000(this.f72648) + ",\n  version=" + this.f72643 + ",\n  targetInfo=" + this.f72646 + "\n}";
    }
}
