package l;

import java.security.AccessControlContext;

/* JADX INFO: renamed from: l.ᩳ۬۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 86PR */
/* JADX INFO: loaded from: classes4.dex */
public class C18069 extends Thread {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C5369 f57782;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C2546 f57783;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo42065() {
    }

    public C18069(C5369 c5369, ClassLoader classLoader) {
        super("aFJWorkerThread");
        C8898.m23151(this, classLoader);
        this.f57782 = c5369;
        this.f57783 = c5369.m14881(this);
    }

    public C18069(C5369 c5369, ClassLoader classLoader, ThreadGroup threadGroup, AccessControlContext accessControlContext) {
        super(threadGroup, "aFJWorkerThread");
        super.setContextClassLoader(classLoader);
        C8898.m23152(this, accessControlContext);
        C8898.m23150(this);
        this.f57782 = c5369;
        this.f57783 = c5369.m14881(this);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws Throwable {
        C5369 c5369 = this.f57782;
        C2546 c2546 = this.f57783;
        if (c2546.f10073 == null) {
            try {
                c5369.m14886(c2546);
                th = null;
            } catch (Throwable th) {
                th = th;
            }
            c5369.m14883(this, th);
        }
    }
}
