package l;

/* JADX INFO: renamed from: l.᩵ۢۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: E5GV */
/* JADX INFO: loaded from: classes5.dex */
public final class C20480 implements Comparable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f65616;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C13548 f65617;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m46982(C20480 c20480, C24166 c24166, C20480 c20481) {
        c20480.getClass();
        c24166.m54135(c20480.f65617.f34104 - (c20481 == null ? 0 : c20481.f65617.f34104));
        c24166.m54135(c20480.f65616);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m46981(C20480 c20480, int i, C20480 c20481) {
        int i2;
        if (c20481 == null) {
            i2 = 0;
        } else {
            c20480.getClass();
            i2 = c20481.f65617.f34104;
        }
        return C6929.m19213(c20480.f65616) + C6929.m19213(c20480.f65617.f34104 - i2) + i;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C13548 c13548 = ((C20480) obj).f65617;
        C13548 c13549 = this.f65617;
        int iCompareTo = c13549.f43032.compareTo(c13548.f43032);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int iCompareTo2 = c13549.f43034.compareTo(c13548.f43034);
        return iCompareTo2 != 0 ? iCompareTo2 : c13549.f43033.compareTo(c13548.f43033);
    }

    public C20480(C13548 c13548, int i) {
        this.f65617 = c13548;
        this.f65616 = i;
    }

    public C20480(C24738 c24738, C4028 c4028, C20480 c20480) {
        this.f65617 = (C13548) c24738.f80101.m49623(c4028.m12998() + (c20480 == null ? 0 : c20480.f65617.f34104));
        this.f65616 = c4028.m12998();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m46984() {
        return (EnumC6266.STATIC.getValue() & this.f65616) != 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m46983() {
        return (EnumC6266.FINAL.getValue() & this.f65616) != 0;
    }
}
