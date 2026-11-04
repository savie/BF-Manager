package l;

/* JADX INFO: renamed from: l.ۤۖܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: I9QN */
/* JADX INFO: loaded from: classes4.dex */
public final class C10570 implements InterfaceC0130 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC0130[] f33585;

    public C10570(InterfaceC0130... interfaceC0130Arr) {
        this.f33585 = interfaceC0130Arr;
    }

    @Override // l.InterfaceC0130
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo1288(Class cls) {
        for (InterfaceC0130 interfaceC0130 : this.f33585) {
            if (interfaceC0130.mo1288(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // l.InterfaceC0130
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC18029 mo1287(Class cls) {
        for (InterfaceC0130 interfaceC0130 : this.f33585) {
            if (interfaceC0130.mo1288(cls)) {
                return interfaceC0130.mo1287(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }
}
