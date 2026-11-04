package l;

import java.util.Set;

/* JADX INFO: renamed from: l.ᩴܺۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: E2TB */
/* JADX INFO: loaded from: classes5.dex */
public final class C19928 extends AbstractC14425 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15452 f64099;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public InterfaceC7886 f64100;

    public C19928(C15452 c15452, InterfaceC7886 interfaceC7886) {
        this.f64099 = c15452;
        this.f64100 = interfaceC7886;
    }

    @Override // l.InterfaceC7886
    public final int getVisibility() {
        return this.f64100.getVisibility();
    }

    @Override // l.InterfaceC7886
    public final String getType() {
        return (String) this.f64099.f50308.m54589().mo2798(this.f64100.getType());
    }

    @Override // l.InterfaceC7886
    public final Set getElements() {
        return new C10253(this.f64100.getElements(), this.f64099.f50308.m54579());
    }
}
