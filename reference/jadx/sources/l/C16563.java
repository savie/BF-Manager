package l;

import java.io.Closeable;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܺۗ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: A6S3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16563 implements InterfaceC7509 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public volatile boolean f53620;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final HashSet f53621 = new HashSet();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f53622;

    public final synchronized void cancel() {
        this.f53620 = true;
        Iterator it = this.f53621.iterator();
        while (it.hasNext()) {
            ((C24769) it.next()).m55290();
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m39239() {
        return this.f53621.isEmpty();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final synchronized void m39240() {
        if (this.f53620) {
            throw new IllegalStateException("Canceled input cannot be handed off");
        }
        this.f53622 = true;
        this.f53621.clear();
    }

    @Override // l.InterfaceC7509
    /* JADX INFO: renamed from: ۫ */
    public final boolean mo924() {
        return this.f53620;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m39238(C16563 c16563, C24769 c24769) {
        synchronized (c16563) {
            c16563.f53621.remove(c24769);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Closeable m39237(Closeable closeable, InterfaceC7509 interfaceC7509) {
        if (!(interfaceC7509 instanceof C16563)) {
            return closeable;
        }
        C16563 c16563 = (C16563) interfaceC7509;
        C24769 c24769 = new C24769(c16563, closeable);
        synchronized (c16563) {
            if (c16563.f53622) {
                return c24769;
            }
            c16563.f53621.add(c24769);
            if (c16563.f53620) {
                c24769.m55290();
            }
            return c24769;
        }
    }
}
