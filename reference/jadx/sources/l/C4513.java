package l;

import java.io.Closeable;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۙ۠ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: A6S3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4513 implements InterfaceC5614 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final HashSet f16033 = new HashSet();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public volatile boolean f16034;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f16035;

    public final synchronized void cancel() {
        this.f16034 = true;
        Iterator it = this.f16033.iterator();
        while (it.hasNext()) {
            ((C3411) it.next()).m10112();
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m12550() {
        return this.f16033.isEmpty();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final synchronized void m12551() {
        if (this.f16034) {
            throw new IllegalStateException("Canceled input cannot be handed off");
        }
        this.f16035 = true;
        this.f16033.clear();
    }

    @Override // l.InterfaceC5614
    /* JADX INFO: renamed from: ֨ */
    public final boolean mo2357() {
        return this.f16034;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m12549(C4513 c4513, C3411 c3411) {
        synchronized (c4513) {
            c4513.f16033.remove(c3411);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Closeable m12548(Closeable closeable, InterfaceC5614 interfaceC5614) {
        if (!(interfaceC5614 instanceof C4513)) {
            return closeable;
        }
        C4513 c4513 = (C4513) interfaceC5614;
        C3411 c3411 = new C3411(c4513, closeable);
        synchronized (c4513) {
            if (c4513.f16035) {
                return c3411;
            }
            c4513.f16033.add(c3411);
            if (c4513.f16034) {
                c3411.m10112();
            }
            return c3411;
        }
    }
}
