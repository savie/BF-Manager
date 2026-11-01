package l;

import java.util.Set;

/* JADX INFO: renamed from: l.ۖ᩹ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: P2S7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2818 extends AbstractC10442 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public InterfaceC20147 f10697;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7052 f10698;

    public C2818(C7052 c7052, InterfaceC20147 interfaceC20147) {
        this.f10698 = c7052;
        this.f10697 = interfaceC20147;
    }

    @Override // l.InterfaceC20147
    public final String getType() {
        return (String) this.f10698.f23690.m29872().mo1014(this.f10697.getType());
    }

    @Override // l.InterfaceC20147
    public final Set getElements() {
        return new C22659(this.f10697.getElements(), this.f10698.f23690.m29862());
    }
}
