package l;

/* JADX INFO: renamed from: l.᩷۠᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: I9QN */
/* JADX INFO: loaded from: classes5.dex */
public final class C20758 implements InterfaceC4154 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC4154[] f67555;

    public C20758(InterfaceC4154... interfaceC4154Arr) {
        this.f67555 = interfaceC4154Arr;
    }

    @Override // l.InterfaceC4154
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo11797(Class cls) {
        for (InterfaceC4154 interfaceC4154 : this.f67555) {
            if (interfaceC4154.mo11797(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // l.InterfaceC4154
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC13328 mo11796(Class cls) {
        for (InterfaceC4154 interfaceC4154 : this.f67555) {
            if (interfaceC4154.mo11797(cls)) {
                return interfaceC4154.mo11796(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }
}
