package l;

import android.os.Build;

/* JADX INFO: renamed from: l.֡ۧۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: P8OZ */
/* JADX INFO: loaded from: classes2.dex */
public final class C0365 implements InterfaceC15744 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16594 f1818;

    public C0365(C16594 c16594) {
        this.f1818 = c16594;
    }

    @Override // l.InterfaceC15744
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void mo2081() {
        this.f1818.m39036();
    }

    @Override // l.InterfaceC15744
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo2082() {
        this.f1818.f53252 = true;
    }

    @Override // l.InterfaceC15744
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo2084(long j) {
        this.f1818.f53258.m44224(j);
    }

    @Override // l.InterfaceC15744
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo2085(long j, int i, long j2) {
        this.f1818.f53258.m44225(j, i, j2);
    }

    @Override // l.InterfaceC15744
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo2088(boolean z) {
        this.f1818.f53258.m44232(z);
    }

    @Override // l.InterfaceC15744
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void mo2089() {
        InterfaceC3228 interfaceC3228M35930 = this.f1818.m35930();
        if (interfaceC3228M35930 != null) {
            interfaceC3228M35930.mo9681();
        }
    }

    @Override // l.InterfaceC15744
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo2091() {
        InterfaceC3228 interfaceC3228M35930 = this.f1818.m35930();
        if (interfaceC3228M35930 != null) {
            interfaceC3228M35930.mo9680();
        }
    }

    @Override // l.InterfaceC15744
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo2086(Exception exc) {
        C0303.m1854("Audio sink error", exc);
        this.f1818.f53258.m44233(exc);
    }

    @Override // l.InterfaceC15744
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void mo2090() {
        this.f1818.m39524();
    }

    @Override // l.InterfaceC15744
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo2087(C10099 c10099) {
        this.f1818.f53258.m44230(c10099);
    }

    @Override // l.InterfaceC15744
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo2092(C10099 c10099) {
        this.f1818.f53258.m44234(c10099);
    }

    @Override // l.InterfaceC15744
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo2083(int i) {
        int i2 = Build.VERSION.SDK_INT;
        C16594 c16594 = this.f1818;
        if (i2 >= 35 && c16594.f53254 != null) {
            c16594.f53254.m34716(i);
        }
        c16594.f53258.m44223(i);
    }
}
