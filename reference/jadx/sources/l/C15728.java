package l;

import java.util.Set;

/* JADX INFO: renamed from: l.ܺۚۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: E2TB */
/* JADX INFO: loaded from: classes5.dex */
public final class C15728 extends AbstractC2679 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19961 f51025;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public InterfaceC3710 f51026;

    public C15728(C19961 c19961, InterfaceC3710 interfaceC3710) {
        this.f51025 = c19961;
        this.f51026 = interfaceC3710;
    }

    @Override // l.InterfaceC3710
    public final int getVisibility() {
        return this.f51026.getVisibility();
    }

    @Override // l.InterfaceC3710
    public final String getType() {
        return (String) this.f51025.f63922.m29872().mo1014(this.f51026.getType());
    }

    @Override // l.InterfaceC3710
    public final Set getElements() {
        return new C22659(this.f51026.getElements(), this.f51025.f63922.m29862());
    }
}
