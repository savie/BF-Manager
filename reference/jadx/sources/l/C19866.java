package l;

import java.util.Random;

/* JADX INFO: renamed from: l.᩶֫᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: J9FZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C19866 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C0109 f63707;

    public C19866(Random random) {
        C0109 c0109 = new C0109();
        this.f63707 = c0109;
        c0109.f1081 = new C8099(EnumC17976.WINDOWS_MAJOR_VERSION_6, EnumC18682.WINDOWS_MINOR_VERSION_1, EnumC21504.NTLMSSP_REVISION_W2K3);
        c0109.f1080 = true;
        c0109.f1082 = new byte[32];
        random.nextBytes(c0109.f1082);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C0109 m45119() {
        return new C0109(this.f63707);
    }
}
