package l;

import android.app.Activity;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: l.ܰܰۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: TAN9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13861 implements InterfaceC14567 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final WindowLayoutComponent f45700;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final ReentrantLock f45699 = new ReentrantLock();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f45698 = new LinkedHashMap();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f45697 = new LinkedHashMap();

    @Override // l.InterfaceC14567
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo33697(Activity activity, ExecutorC2053 executorC2053, C13799 c13799) {
        C7321 c7321;
        LinkedHashMap linkedHashMap = this.f45698;
        ReentrantLock reentrantLock = this.f45699;
        reentrantLock.lock();
        try {
            C4687 c4687 = (C4687) linkedHashMap.get(activity);
            LinkedHashMap linkedHashMap2 = this.f45697;
            if (c4687 == null) {
                c7321 = null;
            } else {
                c4687.m12988(c13799);
                linkedHashMap2.put(c13799, activity);
                c7321 = C7321.f24318;
            }
            if (c7321 == null) {
                C4687 c4688 = new C4687(activity);
                linkedHashMap.put(activity, c4688);
                linkedHashMap2.put(c13799, activity);
                c4688.m12988(c13799);
                this.f45700.addWindowLayoutInfoListener(activity, c4688);
            }
            C7321 c7322 = C7321.f24318;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // l.InterfaceC14567
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo33698(InterfaceC17295 interfaceC17295) {
        C13465.m32966(interfaceC17295, "callback");
        ReentrantLock reentrantLock = this.f45699;
        reentrantLock.lock();
        try {
            Activity activity = (Activity) this.f45697.get(interfaceC17295);
            if (activity == null) {
                return;
            }
            C4687 c4687 = (C4687) this.f45698.get(activity);
            if (c4687 == null) {
                return;
            }
            c4687.m12989(interfaceC17295);
            if (c4687.m12990()) {
                this.f45700.removeWindowLayoutInfoListener(c4687);
            }
            C7321 c7321 = C7321.f24318;
        } finally {
            reentrantLock.unlock();
        }
    }

    public C13861(WindowLayoutComponent windowLayoutComponent) {
        this.f45700 = windowLayoutComponent;
    }
}
