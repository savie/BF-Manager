package l;

/* JADX INFO: renamed from: l.ܺۤۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6QT */
/* JADX INFO: loaded from: classes5.dex */
public final class C15875 extends C19402 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C23595 f51353;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C5290 f51354;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C23595 f51355;

    public C15875(C23595 c23595, C5290 c5290, C23595 c23596) {
        super(c23595);
        this.f51353 = c23595;
        this.f51354 = c5290;
        int unused = c5290.f18302;
        this.f51355 = c23596;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C15875 m37748(C23595 c23595, C19402 c19402) {
        C5290 c5290M14664 = C5290.m14664(c23595);
        if (c5290M14664 == null) {
            return null;
        }
        if (c5290M14664.f18302 != 0 || c5290M14664.f18303) {
            return new C15875(c23595, c5290M14664, c19402);
        }
        return null;
    }
}
