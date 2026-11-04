package l;

import java.util.Set;

/* JADX INFO: renamed from: l.ۘܺۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: P2S7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4266 extends AbstractC10892 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC15299 f15511;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19182 f15512;

    public C4266(C19182 c19182, InterfaceC15299 interfaceC15299) {
        this.f15512 = c19182;
        this.f15511 = interfaceC15299;
    }

    @Override // l.InterfaceC15299
    public final String getType() {
        return (String) this.f15512.f62035.m54589().mo2798(this.f15511.getType());
    }

    @Override // l.InterfaceC15299
    public final Set getElements() {
        return new C10253(this.f15511.getElements(), this.f15512.f62035.m54579());
    }
}
