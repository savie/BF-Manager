package l;

import java.util.List;

/* JADX INFO: renamed from: l.ܳܶۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: 42RT */
/* JADX INFO: loaded from: classes5.dex */
public final class C15430 extends AbstractC9950 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13193 f50274;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public InterfaceC4685 f50275;

    public C15430(C13193 c13193, InterfaceC4685 interfaceC4685) {
        this.f50274 = c13193;
        this.f50275 = interfaceC4685;
    }

    @Override // l.InterfaceC4685
    /* JADX INFO: renamed from: ۙ */
    public final int mo4114() {
        return this.f50275.mo4114();
    }

    @Override // l.InterfaceC4685
    /* JADX INFO: renamed from: ۤ */
    public final int mo4115() {
        return this.f50275.mo4115();
    }

    @Override // l.InterfaceC4685
    /* JADX INFO: renamed from: ᩷ */
    public final List mo4116() {
        return new C1305(this.f50274.f42140.m54583(), this.f50275.mo4116());
    }
}
