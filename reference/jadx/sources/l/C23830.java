package l;

/* JADX INFO: renamed from: l.᩻ܽ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 51V0 */
/* JADX INFO: loaded from: classes.dex */
public final class C23830 extends C23489 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6771 f77025;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23830(C6771 c6771, C11992 c11992) {
        super(c11992);
        this.f77025 = c6771;
    }

    @Override // l.C23489, l.InterfaceC2196
    /* JADX INFO: renamed from: ۙ */
    public final C10789 mo1014(InterfaceC22762 interfaceC22762) {
        String type = interfaceC22762.getType();
        C6771 c6771 = this.f77025;
        c6771.f22864 = C6730.m18157(C6771.m18367(c6771, type));
        return new C10789(this, interfaceC22762);
    }
}
