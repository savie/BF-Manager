package l;

import java.util.Set;

/* JADX INFO: renamed from: l.۠ܺۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z2S6 */
/* JADX INFO: loaded from: classes4.dex */
public class C8740 extends AbstractC9204 implements InterfaceC2665 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC2665 f28425;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7249 f28426;

    public C8740(C7249 c7249, InterfaceC2665 interfaceC2665) {
        this.f28426 = c7249;
        this.f28425 = interfaceC2665;
    }

    @Override // l.InterfaceC8304
    /* JADX INFO: renamed from: ܳ */
    public final String mo4500() {
        return ((InterfaceC8304) this.f28426.f23905.m54580().mo2798(this.f28425)).mo4500();
    }

    @Override // l.InterfaceC8304
    public final String getName() {
        return ((InterfaceC8304) this.f28426.f23905.m54580().mo2798(this.f28425)).getName();
    }

    @Override // l.InterfaceC8304
    public final String getType() {
        return ((InterfaceC8304) this.f28426.f23905.m54580().mo2798(this.f28425)).getType();
    }

    @Override // l.InterfaceC2665
    /* JADX INFO: renamed from: ᩷ */
    public final int mo8823() {
        return this.f28425.mo8823();
    }

    @Override // l.InterfaceC2665
    /* JADX INFO: renamed from: ۨۙ */
    public InterfaceC16791 mo8822() {
        return (InterfaceC16791) C19906.m45835(this.f28426.f23905.m54584(), this.f28425.mo8822());
    }

    @Override // l.InterfaceC2665
    public final Set getAnnotations() {
        return new C10253(this.f28425.getAnnotations(), this.f28426.f23905.m54590());
    }

    @Override // l.InterfaceC2665
    /* JADX INFO: renamed from: ۗ */
    public final Set mo8821() {
        return this.f28425.mo8821();
    }
}
