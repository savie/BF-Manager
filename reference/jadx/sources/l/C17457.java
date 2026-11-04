package l;

/* JADX INFO: renamed from: l.ܽ۠ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: S9PM */
/* JADX INFO: loaded from: classes4.dex */
public final class C17457 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final C17457 f56770 = new C17457();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC17249 f56771 = new ConcurrentMapC17249();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C22505 f56772 = new C22505();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C17457 m40958() {
        return f56770;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7762 m40959(Class cls) {
        C23447.m52662(cls, "messageType");
        ConcurrentMapC17249 concurrentMapC17249 = this.f56771;
        InterfaceC7762 interfaceC7762M50745 = (InterfaceC7762) concurrentMapC17249.get(cls);
        if (interfaceC7762M50745 == null) {
            interfaceC7762M50745 = this.f56772.m50745(cls);
            InterfaceC7762 interfaceC7762 = (InterfaceC7762) concurrentMapC17249.putIfAbsent(cls, interfaceC7762M50745);
            if (interfaceC7762 != null) {
                return interfaceC7762;
            }
        }
        return interfaceC7762M50745;
    }
}
