package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: l.᩵ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: G9LE */
/* JADX INFO: loaded from: classes5.dex */
public final class C20493 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Executor f65639;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f65642;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Object f65641 = new Object();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final ArrayList f65640 = new ArrayList();

    public C20493(Executor executor, C19330 c19330) {
        this.f65639 = executor;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m46993() {
        boolean z;
        synchronized (this.f65641) {
            z = this.f65642;
        }
        return z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46992() {
        synchronized (this.f65641) {
            this.f65642 = true;
            Iterator it = this.f65640.iterator();
            while (it.hasNext()) {
                ((InterfaceC19479) it.next()).mo4064();
            }
            this.f65640.clear();
            C11471 c11471 = C11471.f36082;
        }
    }
}
