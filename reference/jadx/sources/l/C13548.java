package l;

/* JADX INFO: renamed from: l.۬ۖۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z4GR */
/* JADX INFO: loaded from: classes4.dex */
public final class C13548 extends AbstractC10739 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public String f43030;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f43031;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C20436 f43032;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C20436 f43033;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C3282 f43034;

    @Override // l.AbstractC10739
    /* JADX INFO: renamed from: ۙ */
    public final int mo10821(int i) {
        return i + 8;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C13548 c13548 = (C13548) obj;
        int iM46861 = this.f43032.compareTo(c13548.f43032);
        if (iM46861 != 0) {
            return iM46861;
        }
        int iCompareTo = this.f43034.compareTo(c13548.f43034);
        return iCompareTo != 0 ? iCompareTo : this.f43033.compareTo(c13548.f43033);
    }

    public C13548(C24738 c24738) {
        super(c24738);
        this.f43031 = 0;
        this.f43030 = null;
    }

    public C13548(C24738 c24738, C20436 c20436, C20436 c20437, C3282 c3282) {
        this(c24738);
        this.f43032 = c20436;
        this.f43033 = c20437;
        this.f43034 = c3282;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C13548 m33264(C24738 c24738, C20436 c20436, C20436 c20437, C3282 c3282) {
        return (C13548) c24738.f80101.m38079(new C13548(c24738, c20436, c20437, c3282));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13548 m33265(C24738 c24738) {
        return (C13548) c24738.f80101.m38079(new C13548(c24738, C20436.m46859(this.f43032.m46860(), c24738), C20436.m46859(this.f43033.m46860(), c24738), C3282.m10820(this.f43034.m10827(), c24738)));
    }

    @Override // l.AbstractC10739
    /* JADX INFO: renamed from: ۙ */
    public final void mo10825(C4028 c4028, C17452 c17452) {
        C24738 c24738 = this.f34102;
        this.f43032 = (C20436) c24738.f80112.m49623(c4028.m13002());
        this.f43033 = (C20436) c24738.f80112.m49623(c4028.m13002());
        this.f43034 = (C3282) c24738.f80094.m49623(c4028.m12995());
    }

    @Override // l.AbstractC10739
    /* JADX INFO: renamed from: ۙ */
    public final void mo10826(C24166 c24166) {
        c24166.m54139(this.f43032.f34104);
        c24166.m54139(this.f43033.f34104);
        c24166.m54134(this.f43034.f34104);
    }

    @Override // l.AbstractC10739
    /* JADX INFO: renamed from: ۙ */
    public final String mo10823() {
        return m33266();
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final String m33266() {
        if (this.f43030 == null) {
            String strM46860 = this.f43032.m46860();
            String strM10827 = this.f43034.m10827();
            String strM46861 = this.f43033.m46860();
            StringBuffer stringBuffer = new StringBuffer(strM46861.length() + strM10827.length() + strM46860.length() + 3);
            stringBuffer.append(strM46860);
            stringBuffer.append("->");
            stringBuffer.append(strM10827);
            stringBuffer.append(":");
            stringBuffer.append(strM46861);
            this.f43030 = stringBuffer.toString();
        }
        return this.f43030;
    }

    public final int hashCode() {
        if (this.f43031 == 0) {
            int iHashCode = this.f43032.hashCode();
            this.f43031 = iHashCode;
            int iHashCode2 = this.f43033.hashCode() + (iHashCode * 31);
            this.f43031 = iHashCode2;
            this.f43031 = this.f43034.hashCode() + (iHashCode2 * 31);
        }
        return this.f43031;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C13548.class.equals(obj.getClass())) {
            C13548 c13548 = (C13548) obj;
            if (this.f43032 == c13548.f43032 && this.f43033 == c13548.f43033 && this.f43034 == c13548.f43034) {
                return true;
            }
        }
        return false;
    }
}
