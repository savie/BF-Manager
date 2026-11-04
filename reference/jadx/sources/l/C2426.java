package l;

import android.app.Activity;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: l.ۖۙۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: TAN9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2426 implements InterfaceC8150 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final WindowLayoutComponent f7766;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final ReentrantLock f7765 = new ReentrantLock();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f7764 = new LinkedHashMap();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f7767 = new LinkedHashMap();

    @Override // l.InterfaceC8150
    /* JADX INFO: renamed from: ۙ */
    public final void mo2994(Activity activity, ExecutorC20817 executorC20817, C2929 c2929) {
        C11471 c11471;
        LinkedHashMap linkedHashMap = this.f7764;
        ReentrantLock reentrantLock = this.f7765;
        reentrantLock.lock();
        try {
            C9137 c9137 = (C9137) linkedHashMap.get(activity);
            LinkedHashMap linkedHashMap2 = this.f7767;
            if (c9137 == null) {
                c11471 = null;
            } else {
                c9137.m24279(c2929);
                linkedHashMap2.put(c2929, activity);
                c11471 = C11471.f36082;
            }
            if (c11471 == null) {
                C9137 c9138 = new C9137(activity);
                linkedHashMap.put(activity, c9138);
                linkedHashMap2.put(c2929, activity);
                c9138.m24279(c2929);
                this.f7766.addWindowLayoutInfoListener(activity, c9138);
            }
            C11471 c11472 = C11471.f36082;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // l.InterfaceC8150
    /* JADX INFO: renamed from: ۙ */
    public final void mo2995(InterfaceC0818 interfaceC0818) {
        C15243.m36590(interfaceC0818, "callback");
        ReentrantLock reentrantLock = this.f7765;
        reentrantLock.lock();
        try {
            Activity activity = (Activity) this.f7767.get(interfaceC0818);
            if (activity == null) {
                return;
            }
            C9137 c9137 = (C9137) this.f7764.get(activity);
            if (c9137 == null) {
                return;
            }
            c9137.m24278(interfaceC0818);
            if (c9137.m24280()) {
                this.f7766.removeWindowLayoutInfoListener(c9137);
            }
            C11471 c11471 = C11471.f36082;
        } finally {
            reentrantLock.unlock();
        }
    }

    public C2426(WindowLayoutComponent windowLayoutComponent) {
        this.f7766 = windowLayoutComponent;
    }
}
