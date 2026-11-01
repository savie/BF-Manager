package l;

import java.util.HashSet;

/* JADX INFO: renamed from: l.۫᩻᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: N7I4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12749 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashSet f42501 = new HashSet();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31688(String str) {
        synchronized (this.f42501) {
            while (this.f42501.contains(str)) {
                try {
                    this.f42501.wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    throw new RuntimeException("线程被中断", e);
                }
            }
            this.f42501.add(str);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m31689(String str) {
        synchronized (this.f42501) {
            this.f42501.remove(str);
            this.f42501.notifyAll();
        }
    }
}
