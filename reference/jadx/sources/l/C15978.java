package l;

import android.app.Activity;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: l.ܺܰۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: OANW */
/* JADX INFO: loaded from: classes4.dex */
public final class C15978 implements InterfaceC9359 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C6099 f51751;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final ReentrantLock f51750 = new ReentrantLock();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final WeakHashMap f51749 = new WeakHashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37957(Activity activity, C5331 c5331) {
        WeakHashMap weakHashMap = this.f51749;
        C13465.m32966(activity, "activity");
        ReentrantLock reentrantLock = this.f51750;
        reentrantLock.lock();
        try {
            if (c5331.equals((C5331) weakHashMap.get(activity))) {
                reentrantLock.unlock();
                return;
            }
            reentrantLock.unlock();
            for (C11039 c11039 : this.f51751.f20665.m52270()) {
                if (C13465.m32965(c11039.m27832(), activity)) {
                    c11039.m27833(c5331);
                }
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public C15978(C6099 c6099) {
        this.f51751 = c6099;
    }
}
