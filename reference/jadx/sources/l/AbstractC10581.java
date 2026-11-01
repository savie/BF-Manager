package l;

/* JADX INFO: renamed from: l.ۤ᩹ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 82T8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC10581 implements InterfaceC13859, InterfaceC10062 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6346 f36196;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public InterfaceC13859 f36197;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public AbstractC8325 f36198 = null;

    public AbstractC10581(C6346 c6346, InterfaceC13859 interfaceC13859) {
        this.f36196 = c6346;
        this.f36197 = interfaceC13859;
    }

    @Override // l.InterfaceC13859
    public final InterfaceC7446 getReference() {
        AbstractC8325 abstractC8325 = this.f36198;
        if (abstractC8325 != null) {
            return abstractC8325;
        }
        InterfaceC13859 interfaceC13859 = this.f36197;
        return C6346.m17452(this.f36196, interfaceC13859.mo1143(), interfaceC13859.getReference());
    }

    @Override // l.InterfaceC13859
    /* JADX INFO: renamed from: ᩵ */
    public final int mo1143() {
        return this.f36197.mo1143();
    }

    @Override // l.InterfaceC1594
    /* JADX INFO: renamed from: ۜ */
    public final EnumC10297 mo5435() {
        return this.f36197.mo5435();
    }

    @Override // l.InterfaceC1594
    /* JADX INFO: renamed from: ۡ */
    public final int mo5436() {
        return this.f36197.mo5436();
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo1141(C8485 c8485) {
        this.f36198 = (AbstractC8325) c8485.m22156(getReference());
    }
}
