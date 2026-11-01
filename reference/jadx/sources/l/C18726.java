package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: l.ᩴۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: G9LE */
/* JADX INFO: loaded from: classes4.dex */
public final class C18726 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f60732;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Executor f60733;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Object f60735 = new Object();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final ArrayList f60734 = new ArrayList();

    public C18726(Executor executor, C12439 c12439) {
        this.f60733 = executor;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m43262() {
        boolean z;
        synchronized (this.f60735) {
            z = this.f60732;
        }
        return z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43261() {
        synchronized (this.f60735) {
            this.f60732 = true;
            Iterator it = this.f60734.iterator();
            while (it.hasNext()) {
                ((InterfaceC4871) it.next()).mo3788();
            }
            this.f60734.clear();
            C7321 c7321 = C7321.f24318;
        }
    }
}
