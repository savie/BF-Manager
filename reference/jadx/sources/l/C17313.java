package l;

/* JADX INFO: renamed from: l.ܽۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: J1BI */
/* JADX INFO: loaded from: classes5.dex */
public class C17313 extends C16567 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f56393;

    public C17313(AbstractC18805 abstractC18805) {
        super(abstractC18805);
        if (abstractC18805 instanceof C6127) {
            this.f53629 = EnumC24773.HORIZONTAL_DIMENSION;
        } else {
            this.f53629 = EnumC24773.VERTICAL_DIMENSION;
        }
    }

    @Override // l.C16567
    /* JADX INFO: renamed from: ۙ */
    public final void mo39242(int i) {
        if (this.f53630) {
            return;
        }
        this.f53630 = true;
        this.f53632 = i;
        for (InterfaceC1652 interfaceC1652 : this.f53634) {
            interfaceC1652.mo5938(interfaceC1652);
        }
    }
}
