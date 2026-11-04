package l;

/* JADX INFO: renamed from: l.ۛܶۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: J1JQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C6483 implements Comparable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f21794;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f21795;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f21796;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C6483 c6483 = (C6483) obj;
        int iCompare = Integer.compare(this.f21795, c6483.f21795);
        return iCompare == 0 ? Integer.compare(this.f21796, c6483.f21796) : iCompare;
    }

    public C6483(int i, int i2, int i3) {
        this.f21796 = i;
        this.f21795 = i2;
        this.f21794 = i3;
    }

    public final String toString() {
        return "Group" + this.f21796 + " " + this.f21795 + "-" + this.f21794;
    }
}
