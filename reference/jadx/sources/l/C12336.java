package l;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: l.ۨۨۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: J8TX */
/* JADX INFO: loaded from: classes3.dex */
public final class C12336 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Executor f39616;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4133 f39617;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final WeakReference f39618;

    public C12336(C4133 c4133, C16297 c16297, Executor executor) {
        this.f39617 = c4133;
        this.f39618 = new WeakReference(c16297);
        this.f39616 = executor;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m30758() {
        return this.f39618.get() == null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30757() {
        this.f39616.execute(new Runnable() { // from class: l.᩵ۨۙ
            @Override // java.lang.Runnable
            public final void run() {
                C12336.m30756(this.f65774);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m30756(C12336 c12336) {
        InterfaceC3387 interfaceC3387 = (InterfaceC3387) c12336.f39618.get();
        if (interfaceC3387 != null) {
            interfaceC3387.mo11104(c12336.f39617.m13258());
        }
    }
}
