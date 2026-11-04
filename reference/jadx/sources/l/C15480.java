package l;

import java.util.Random;

/* JADX INFO: renamed from: l.ܳܽܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: J9FZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C15480 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C13243 f50400;

    public C15480(Random random) {
        C13243 c13243 = new C13243();
        this.f50400 = c13243;
        c13243.f42318 = new C8768(EnumC9513.WINDOWS_MAJOR_VERSION_6, EnumC2802.WINDOWS_MINOR_VERSION_1, EnumC1311.NTLMSSP_REVISION_W2K3);
        c13243.f42317 = true;
        c13243.f42319 = new byte[32];
        random.nextBytes(c13243.f42319);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13243 m37045() {
        return new C13243(this.f50400);
    }
}
