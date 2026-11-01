package l;

/* JADX INFO: renamed from: l.᩷ۤۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6QT */
/* JADX INFO: loaded from: classes5.dex */
public final class C20813 extends C19402 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C3837 f67649;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f67650;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final InterfaceC13717 f67651;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C5290 f67652;

    public C20813(C3837 c3837, C0619 c0619, C5290 c5290) {
        super(c3837);
        this.f67649 = c3837;
        this.f67651 = c0619.f4704;
        this.f67652 = c5290;
        this.f67650 = c3837.f14305;
        int unused = c5290.f18302;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C20813 m46803(C23595 c23595) {
        C3837 c3837;
        int i;
        if (!(c23595 instanceof C3837) || (i = (c3837 = (C3837) c23595).f14305) <= 0 || i != c3837.f14307) {
            return null;
        }
        C23595 c23596 = c3837.f14308;
        if (!(c23596 instanceof C0619)) {
            return null;
        }
        C0619 c0619 = (C0619) c23596;
        C5290 c5290M14661 = C5290.m14661(c3837.f76439, c0619.f4704, i);
        if (c5290M14661 == null) {
            return null;
        }
        return new C20813(c3837, c0619, c5290M14661);
    }
}
