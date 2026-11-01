package l;

/* JADX INFO: renamed from: l.ۤۤۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6QT */
/* JADX INFO: loaded from: classes4.dex */
public final class C10230 extends C19402 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final InterfaceC13717 f34915;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C16848 f34916;

    public C10230(C16848 c16848) {
        super(c16848);
        this.f34916 = c16848;
        this.f34915 = c16848.f43382;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10230 m26021(C23595 c23595) {
        if (!(c23595 instanceof C16848)) {
            return null;
        }
        C16848 c16848 = (C16848) c23595;
        if (c16848.f43383 > 0) {
            return new C10230(c16848);
        }
        return null;
    }
}
