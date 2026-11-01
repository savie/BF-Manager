package l;

/* JADX INFO: renamed from: l.᩹᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: J1BI */
/* JADX INFO: loaded from: classes.dex */
public class C22524 extends C5590 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f73492;

    public C22524(AbstractC7707 abstractC7707) {
        super(abstractC7707);
        if (abstractC7707 instanceof C15469) {
            this.f19192 = EnumC2767.HORIZONTAL_DIMENSION;
        } else {
            this.f19192 = EnumC2767.VERTICAL_DIMENSION;
        }
    }

    @Override // l.C5590
    /* JADX INFO: renamed from: ۙ */
    public final void mo15463(int i) {
        if (this.f19187) {
            return;
        }
        this.f19187 = true;
        this.f19196 = i;
        for (InterfaceC14058 interfaceC14058 : this.f19195) {
            interfaceC14058.mo11822(interfaceC14058);
        }
    }
}
