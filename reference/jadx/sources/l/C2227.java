package l;

/* JADX INFO: renamed from: l.ۖ֫᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: UAO5 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2227 implements Comparable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final String f8003;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f8004;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f8005 = -1;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C2227 c2227 = (C2227) obj;
        int iCompare = Integer.compare(this.f8004, c2227.f8004);
        return iCompare != 0 ? iCompare : this.f8003.compareTo(c2227.f8003);
    }

    public C2227(String str, int i) {
        this.f8003 = str;
        this.f8004 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m6852() {
        int i = this.f8005;
        if (i != -1) {
            return i;
        }
        throw new IllegalStateException();
    }
}
