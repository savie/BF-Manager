package l;

/* JADX INFO: renamed from: l.᩷ᩳ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: O6S3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C22244 implements InterfaceC2017, InterfaceC3543 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f71646;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f71647;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f71648;

    public /* synthetic */ C22244(Object obj, Object obj2, Object obj3) {
        this.f71646 = obj;
        this.f71648 = obj2;
        this.f71647 = obj3;
    }

    @Override // l.InterfaceC2017
    /* JADX INFO: renamed from: ᩷ */
    public void mo1355(Object obj, Throwable th) {
        C20006.m46017((C20006) this.f71646, (C22990) this.f71648, (C10046) this.f71647, th);
    }

    @Override // l.InterfaceC3543
    /* JADX INFO: renamed from: ᩷ */
    public InterfaceC15475 mo1860(int i) {
        AbstractC22044 abstractC22044 = (AbstractC22044) this.f71646;
        C0594 c0594 = (C0594) this.f71648;
        InterfaceC0818 interfaceC0818 = (InterfaceC0818) this.f71647;
        StringBuilder sb = new StringBuilder(abstractC22044.mo4294());
        sb.append('.');
        int i2 = i + 1;
        if (i2 < 100) {
            sb.append('0');
        }
        if (i2 < 10) {
            sb.append('0');
        }
        sb.append(i2);
        AbstractC22044 abstractC22044M35193 = C14584.m35193(sb.toString(), new String[0]);
        InterfaceC15475 interfaceC15475Mo4276 = abstractC22044M35193.mo4276("rw");
        if (c0594.add(i2)) {
            interfaceC15475Mo4276.setLength(0L);
            interfaceC0818.accept(abstractC22044M35193);
        }
        return interfaceC15475Mo4276;
    }
}
