package l;

/* JADX INFO: renamed from: l.ۛ֡֨, reason: contains not printable characters */
/* JADX INFO: compiled from: M60I */
/* JADX INFO: loaded from: classes3.dex */
public final class C5696 extends C15404 {

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f19430 = 0;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public C12107 f19431;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final C20573 f19432;

    @Override // l.C15404
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo15712() {
        return true;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C5696(C12107 c12107) {
        String strM30093 = c12107.m30093();
        String parent = c12107.getParent();
        super(strM30093, parent != null ? "/".concat(parent) : "/", null, c12107.getSize(), c12107.getTime(), !c12107.isDirectory());
        this.f19431 = c12107;
        C20573 c20573M30117 = c12107.m30117();
        this.f19432 = c20573M30117;
        if (c20573M30117 == null || !c20573M30117.m46419()) {
            return;
        }
        m36874(c20573M30117.m46421());
    }

    @Override // l.C15404, l.InterfaceC2557
    /* JADX INFO: renamed from: ᩴ */
    public final boolean mo7987() {
        return this.f19431.m30133();
    }

    @Override // l.C15404, l.InterfaceC2557
    /* JADX INFO: renamed from: ۤܰ */
    public final C11731 mo7971() {
        C20573 c20573 = this.f19432;
        if (c20573 == null || !c20573.m46414()) {
            return null;
        }
        return new C11731(c20573.m46420(), (String) null, (String) null);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C12107 m15713() {
        return this.f19431;
    }
}
