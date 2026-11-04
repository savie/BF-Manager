package l;

import android.os.Looper;

/* JADX INFO: renamed from: l.᩵۟ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z8PT */
/* JADX INFO: loaded from: classes5.dex */
public final class C20410 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f65407;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public Object f65408;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f65409;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final InterfaceC3256 f65410;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public Looper f65411;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC23394 f65412;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m46811(boolean z) {
        notifyAll();
    }

    public C20410(InterfaceC23394 interfaceC23394, InterfaceC3256 interfaceC3256, AbstractC24755 abstractC24755, int i, C0404 c0404, Looper looper) {
        this.f65412 = interfaceC23394;
        this.f65410 = interfaceC3256;
        this.f65411 = looper;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final InterfaceC3256 m46812() {
        return this.f65410;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46809(int i) {
        C20782.m47568(!this.f65407);
        this.f65409 = i;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m46815() {
        return this.f65409;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46810(Object obj) {
        C20782.m47568(!this.f65407);
        this.f65408 = obj;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Object m46814() {
        return this.f65408;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Looper m46808() {
        return this.f65411;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m46813() {
        C20782.m47568(!this.f65407);
        this.f65407 = true;
        ((C11240) this.f65412).m28451(this);
    }
}
