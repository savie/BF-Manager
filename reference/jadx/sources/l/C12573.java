package l;

/* JADX INFO: renamed from: l.۫ᩳۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: J1JQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C12573 implements Comparable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f42039;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f42040;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f42041;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C12573 c12573 = (C12573) obj;
        int iCompare = Integer.compare(this.f42039, c12573.f42039);
        return iCompare == 0 ? Integer.compare(this.f42041, c12573.f42041) : iCompare;
    }

    public C12573(int i, int i2, int i3) {
        this.f42041 = i;
        this.f42039 = i2;
        this.f42040 = i3;
    }

    public final String toString() {
        return "Group" + this.f42041 + " " + this.f42039 + "-" + this.f42040;
    }
}
