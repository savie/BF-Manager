package l;

/* JADX INFO: renamed from: l.ۨۢۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: E5GV */
/* JADX INFO: loaded from: classes3.dex */
public final class C12275 implements Comparable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f39462;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C5520 f39463;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C7033 f39464;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m30653(C12275 c12275, C24166 c24166, C12275 c12276) {
        c12275.getClass();
        c24166.m54135(c12275.f39463.f34104 - (c12276 == null ? 0 : c12276.f39463.f34104));
        c24166.m54135(c12275.f39462);
        C7033 c7033 = c12275.f39464;
        c24166.m54135(c7033 != null ? c7033.f34103 : 0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m30652(C12275 c12275, int i, C12275 c12276) {
        int i2;
        if (c12276 == null) {
            i2 = 0;
        } else {
            c12275.getClass();
            i2 = c12276.f39463.f34104;
        }
        int iM19213 = C6929.m19213(c12275.f39462) + C6929.m19213(c12275.f39463.f34104 - i2) + i;
        C7033 c7033 = c12275.f39464;
        return iM19213 + (c7033 == null ? 1 : C6929.m19213(c7033.f34103));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f39463.compareTo(((C12275) obj).f39463);
    }

    public C12275(C5520 c5520, int i, C7033 c7033) {
        this.f39463 = c5520;
        this.f39462 = i;
        this.f39464 = c7033;
        if (c7033 != null) {
            c7033.m19359(this);
        }
    }

    public C12275(C24738 c24738, C17452 c17452, C4028 c4028, C12275 c12275) {
        this.f39463 = (C5520) c24738.f80108.m49623(c4028.m12998() + (c12275 == null ? 0 : c12275.f39463.f34104));
        this.f39462 = c4028.m12998();
        C7033 c7033 = (C7033) c17452.m40955(EnumC15214.TYPE_CODE_ITEM, c4028.m12998());
        this.f39464 = c7033;
        if (c7033 != null) {
            c7033.m19359(this);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m30654() {
        return (((EnumC6266.STATIC.getValue() | EnumC6266.PRIVATE.getValue()) | EnumC6266.CONSTRUCTOR.getValue()) & this.f39462) != 0;
    }
}
