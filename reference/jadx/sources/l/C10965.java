package l;

import java.security.AccessControlContext;

/* JADX INFO: renamed from: l.ۤܶ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 86PR */
/* JADX INFO: loaded from: classes3.dex */
public class C10965 extends Thread {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C10263 f34640;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C19214 f34641;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo27796() {
    }

    public C10965(C10263 c10263, ClassLoader classLoader) {
        super("aFJWorkerThread");
        C13203.m32715(this, classLoader);
        this.f34640 = c10263;
        this.f34641 = c10263.m26466(this);
    }

    public C10965(C10263 c10263, ClassLoader classLoader, ThreadGroup threadGroup, AccessControlContext accessControlContext) {
        super(threadGroup, "aFJWorkerThread");
        super.setContextClassLoader(classLoader);
        C13203.m32716(this, accessControlContext);
        C13203.m32714(this);
        this.f34640 = c10263;
        this.f34641 = c10263.m26466(this);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws Throwable {
        C10263 c10263 = this.f34640;
        C19214 c19214 = this.f34641;
        if (c19214.f62143 == null) {
            try {
                c10263.m26471(c19214);
                th = null;
            } catch (Throwable th) {
                th = th;
            }
            c10263.m26467(this, th);
        }
    }
}
