package l;

import android.os.Looper;

/* JADX INFO: renamed from: l.ܳ۫ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z8PT */
/* JADX INFO: loaded from: classes4.dex */
public final class C14519 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final InterfaceC10991 f47555;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f47556;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final InterfaceC23691 f47557;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public Object f47558;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Looper f47559;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f47560;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m34954(boolean z) {
        notifyAll();
    }

    public C14519(InterfaceC10991 interfaceC10991, InterfaceC23691 interfaceC23691, AbstractC16511 abstractC16511, int i, C22217 c22217, Looper looper) {
        this.f47555 = interfaceC10991;
        this.f47557 = interfaceC23691;
        this.f47559 = looper;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final InterfaceC23691 m34956() {
        return this.f47557;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34952(int i) {
        C2023.m6510(!this.f47556);
        this.f47560 = i;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m34950() {
        return this.f47560;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34953(Object obj) {
        C2023.m6510(!this.f47556);
        this.f47558 = obj;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Object m34957() {
        return this.f47558;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Looper m34951() {
        return this.f47559;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m34955() {
        C2023.m6510(!this.f47556);
        this.f47556 = true;
        ((C0530) this.f47555).m2530(this);
    }
}
