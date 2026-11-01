package l;

/* JADX INFO: renamed from: l.ܺۚ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: X44P */
/* JADX INFO: loaded from: classes5.dex */
public final class C15726 extends C15091 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0202 f51023;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC3800 f51024;

    public C15726(C0202 c0202, InterfaceC3800 interfaceC3800) {
        this.f51023 = c0202;
        this.f51024 = interfaceC3800;
    }

    @Override // l.C15091, l.InterfaceC2389
    public final EnumC11563 preVisitDirectory(Object obj, InterfaceC20735 interfaceC20735) {
        InterfaceC3800 interfaceC3800 = (InterfaceC3800) obj;
        InterfaceC3800 fileName = interfaceC3800.getFileName();
        C0202 c0202 = this.f51023;
        if (C0202.m1511(c0202, fileName)) {
            c0202.f1360.put(new C11284(this.f51024.relativize(interfaceC3800).toString()), interfaceC3800);
            return EnumC11563.CONTINUE;
        }
        return EnumC11563.SKIP_SUBTREE;
    }
}
