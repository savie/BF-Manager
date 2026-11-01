package l;

/* JADX INFO: renamed from: l.ܳۙۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: KAQ1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C14293 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C6094 f46829;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C5825 f46830 = C5825.m16005();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC13783 f46827 = new ConcurrentMapC13783();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23465 f46828 = new C23465(0, this);

    public C14293(C6094 c6094) {
        this.f46829 = c6094;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1591 m34525(String str) {
        if (str.length() <= 2) {
            return null;
        }
        return (C1591) C2492.computeIfAbsent(this.f46827, str, this.f46828);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C1591 m34524(C14293 c14293, String str) {
        InterfaceC9354 interfaceC9354M16528 = c14293.f46829.m16528(C20630.m46498(1, 1, str));
        if (interfaceC9354M16528 == null) {
            return c14293.f46830.m16006(str);
        }
        C7807 c7807Mo24002 = ((C17383) interfaceC9354M16528).mo24002();
        if (c7807Mo24002 == null) {
            return null;
        }
        return new C1591(c7807Mo24002);
    }
}
