package l;

import java.util.List;

/* JADX INFO: renamed from: l.ܺܽۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: R2RY */
/* JADX INFO: loaded from: classes5.dex */
public final class C16966 implements InterfaceC7140 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC7140 f55471;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17712 f55472;

    public C16966(C17712 c17712, InterfaceC7140 interfaceC7140) {
        this.f55472 = c17712;
        this.f55471 = interfaceC7140;
    }

    @Override // l.InterfaceC7140
    /* JADX INFO: renamed from: ۚ */
    public final int mo2841() {
        return this.f55471.mo2841();
    }

    @Override // l.InterfaceC7140
    /* JADX INFO: renamed from: ۙ */
    public final Iterable mo2840() {
        return new C2796(this.f55471.mo2840(), this.f55472.f58200.m54582());
    }

    @Override // l.InterfaceC7140
    /* JADX INFO: renamed from: ֫ */
    public final List mo2839() {
        return new C1305(this.f55472.f58200.m54578(), this.f55471.mo2839());
    }

    @Override // l.InterfaceC7140
    /* JADX INFO: renamed from: ۧ */
    public final Iterable mo2842() {
        return new C2796(this.f55471.mo2842(), this.f55472.f58200.m54588());
    }
}
