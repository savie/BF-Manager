package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ᩴᩳۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: I6TG */
/* JADX INFO: loaded from: classes4.dex */
public final class C18914 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C2063 f61196;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] f61197;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C23607 f61198;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C8331 f61199;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final byte[] f61200;

    public C18914(C18208 c18208) {
        this.f61199 = c18208.f58154;
        this.f61198 = c18208.f58155.finish();
        this.f61196 = c18208.f58156.m52578();
        this.f61200 = c18208.f58163;
        this.f61197 = c18208.f58160;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C18914 m43572(C5488 c5488, InterfaceC3800 interfaceC3800, C10428 c10428, int i) {
        C18914 c18914M43573;
        synchronized (c5488) {
            C5697 c5697M15715 = C5697.m15715(c5488.m15174());
            if (!c5697M15715.m15721().equals(c5488.m15176())) {
                throw new IOException("Migration app identity does not match");
            }
            C6276 c6276M15172 = c5488.m15172();
            try {
                c18914M43573 = m43573(c6276M15172, c5697M15715, interfaceC3800, c10428, i);
                c6276M15172.close();
            } catch (Throwable th) {
                try {
                    c6276M15172.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        return c18914M43573;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C18914 m43573(C6276 c6276, C5697 c5697, InterfaceC3800 interfaceC3800, C10428 c10428, int i) throws IOException {
        if (!c5697.m15723() || i < 0 || c5697.m15716() > i) {
            throw new IOException("Migration app state is missing or exceeds limit");
        }
        C18208 c18208 = new C18208(c6276, i);
        try {
            C4991.m13820(c5697.m15717(interfaceC3800, c10428), c5697.m15716(), c10428, c18208);
            c18208.m42329();
            C18914 c18914 = new C18914(c18208);
            c18208.close();
            return c18914;
        } catch (Throwable th) {
            try {
                c18208.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
