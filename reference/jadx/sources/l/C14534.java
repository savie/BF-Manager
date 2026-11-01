package l;

import java.util.Set;

/* JADX INFO: renamed from: l.ܳ۫᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: E1V9 */
/* JADX INFO: loaded from: classes5.dex */
public class C14534 extends AbstractC2679 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C11992 f47595;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public InterfaceC3710 f47596;

    @Override // l.InterfaceC3710
    public final int getVisibility() {
        return this.f47596.getVisibility();
    }

    @Override // l.InterfaceC3710
    public final String getType() {
        return (String) this.f47595.m29872().mo1014(this.f47596.getType());
    }

    @Override // l.InterfaceC3710
    public Set getElements() {
        return C15604.m37271(this.f47596.getElements(), this.f47595.m29862());
    }

    public C14534(C11992 c11992, InterfaceC3710 interfaceC3710) {
        this.f47595 = c11992;
        this.f47596 = interfaceC3710;
    }
}
