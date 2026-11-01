package l;

/* JADX INFO: renamed from: l.ܳ᩵᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: S9PM */
/* JADX INFO: loaded from: classes4.dex */
public final class C14739 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final C14739 f48198 = new C14739();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC13783 f48199 = new ConcurrentMapC13783();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C15820 f48200 = new C15820();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14739 m35321() {
        return f48198;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC6667 m35322(Class cls) {
        C9779.m24889(cls, "messageType");
        ConcurrentMapC13783 concurrentMapC13783 = this.f48199;
        InterfaceC6667 interfaceC6667M37601 = (InterfaceC6667) concurrentMapC13783.get(cls);
        if (interfaceC6667M37601 == null) {
            interfaceC6667M37601 = this.f48200.m37601(cls);
            InterfaceC6667 interfaceC6667 = (InterfaceC6667) concurrentMapC13783.putIfAbsent(cls, interfaceC6667M37601);
            if (interfaceC6667 != null) {
                return interfaceC6667;
            }
        }
        return interfaceC6667M37601;
    }
}
