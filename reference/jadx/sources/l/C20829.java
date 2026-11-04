package l;

import android.app.Activity;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: l.᩵᩷ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: OANW */
/* JADX INFO: loaded from: classes5.dex */
public final class C20829 implements InterfaceC9883 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C21575 f66701;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final ReentrantLock f66700 = new ReentrantLock();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final WeakHashMap f66699 = new WeakHashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47633(Activity activity, C14115 c14115) {
        WeakHashMap weakHashMap = this.f66699;
        C15243.m36590(activity, "activity");
        ReentrantLock reentrantLock = this.f66700;
        reentrantLock.lock();
        try {
            if (c14115.equals((C14115) weakHashMap.get(activity))) {
                reentrantLock.unlock();
                return;
            }
            reentrantLock.unlock();
            for (C18591 c18591 : this.f66701.f68926.m2993()) {
                if (C15243.m36589(c18591.m43168(), activity)) {
                    c18591.m43169(c14115);
                }
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public C20829(C21575 c21575) {
        this.f66701 = c21575;
    }
}
