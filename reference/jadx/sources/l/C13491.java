package l;

import android.content.ContextWrapper;
import android.os.Handler;

/* JADX INFO: renamed from: l.ܰ֨ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z8VY */
/* JADX INFO: loaded from: classes3.dex */
public final class C13491 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f44584;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final ContextWrapper f44585;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f44586;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public Handler f44587;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public InterfaceC9498 f44588;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f44589;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public InterfaceC11725 f44590;

    public C13491(ContextWrapper contextWrapper) {
        this.f44585 = contextWrapper;
        this.f44588 = new C5969(contextWrapper);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33014(InterfaceC9498 interfaceC9498) {
        this.f44588 = interfaceC9498;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m33017() {
        this.f44586 = 5000L;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33013(Handler handler) {
        this.f44587 = handler;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33015(InterfaceC11725 interfaceC11725) {
        this.f44590 = interfaceC11725;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m33016() {
        this.f44584 = 50;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5023 m33012() {
        C2023.m6510(!this.f44589);
        Handler handler = this.f44587;
        C2023.m6510((handler == null && this.f44590 == null) || !(handler == null || this.f44590 == null));
        this.f44589 = true;
        return new C5023(this);
    }
}
