package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۧܽܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: G4GB */
/* JADX INFO: loaded from: classes3.dex */
public final class C11752 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C25157 f37995;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C25179 f37996;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f37997 = true;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C22941 f37998;

    public C11752(C22941 c22941, C25179 c25179) {
        this.f37996 = c25179;
        C25157 c25157 = c25179.f81384;
        C17359.requireNonNull(c25157);
        this.f37995 = c25157;
        this.f37998 = c22941;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29505(InterfaceC3573 interfaceC3573) {
        C25179 c25179 = this.f37996;
        C13961 c13961Mo34035 = this.f37998.m51735().mo34035();
        try {
            long length = c13961Mo34035.length();
            C21298.m48534(new C10260(c13961Mo34035, 0L, length, false), c25179.m56119(), length, interfaceC3573);
            c25179.m56134();
            c13961Mo34035.close();
            this.f37997 = false;
        } catch (Throwable th) {
            try {
                c13961Mo34035.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m29503() {
        return this.f37995.f81319;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m29504(String str) throws IOException {
        C25179 c25179 = this.f37996;
        if (c25179.f81380 != -1) {
            throw new UnsupportedOperationException("Virtual entry is not supported in split mode");
        }
        boolean z = this.f37997;
        C22941 c22941 = this.f37998;
        if (z) {
            C13961 c13961Mo34035 = c22941.m51735().mo34035();
            try {
                c25179.m56123(new C10260(c13961Mo34035, 0L, c13961Mo34035.length(), false));
                c25179.m56134();
                c13961Mo34035.close();
                this.f37997 = false;
            } catch (Throwable th) {
                try {
                    c13961Mo34035.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        C8002 c8002M51724 = c22941.m51724(str);
        C25157 c25157 = new C25157(c8002M51724, c25179.f81379);
        C25179.m56107(c25157);
        c25157.f81320 = c8002M51724.m21841();
        long jM21842 = c8002M51724.m21842();
        C25157 c25158 = this.f37995;
        long j = jM21842 + c25158.f81311;
        c25157.f81319 = j;
        c25157.f81313 = j;
        c25157.f81311 = c8002M51724.m21811() + c25158.f81311;
        c25179.f81378.add(c25157);
        return c25157.f81319 - c25158.f81319;
    }
}
