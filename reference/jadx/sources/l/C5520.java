package l;

/* JADX INFO: renamed from: l.ۚ۠ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: K4XP */
/* JADX INFO: loaded from: classes3.dex */
public final class C5520 extends AbstractC10739 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public String f19207;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C16706 f19208;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C20436 f19209;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C3282 f19210;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f19211;

    @Override // l.AbstractC10739
    /* JADX INFO: renamed from: ۙ */
    public final int mo10821(int i) {
        return i + 8;
    }

    public C5520(C24738 c24738) {
        super(c24738);
        this.f19211 = 0;
        this.f19207 = null;
    }

    public C5520(C24738 c24738, C20436 c20436, C16706 c16706, C3282 c3282) {
        this(c24738);
        this.f19209 = c20436;
        this.f19208 = c16706;
        this.f19210 = c3282;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5520 m16434(C24738 c24738, C20436 c20436, C16706 c16706, C3282 c3282) {
        return (C5520) c24738.f80108.m38079(new C5520(c24738, c20436, c16706, c3282));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5520 m16436(C24738 c24738) {
        return (C5520) c24738.f80108.m38079(new C5520(c24738, C20436.m46859(this.f19209.m46860(), c24738), this.f19208.m39475(c24738), C3282.m10820(this.f19210.m10827(), c24738)));
    }

    @Override // l.AbstractC10739
    /* JADX INFO: renamed from: ۙ */
    public final void mo10825(C4028 c4028, C17452 c17452) {
        C24738 c24738 = this.f34102;
        this.f19209 = (C20436) c24738.f80112.m49623(c4028.m13002());
        this.f19208 = (C16706) c24738.f80106.m49623(c4028.m13002());
        this.f19210 = (C3282) c24738.f80094.m49623(c4028.m12995());
    }

    @Override // l.AbstractC10739
    /* JADX INFO: renamed from: ۙ */
    public final void mo10826(C24166 c24166) {
        c24166.m54139(this.f19209.f34104);
        c24166.m54139(this.f19208.f34104);
        c24166.m54134(this.f19210.f34104);
    }

    @Override // l.AbstractC10739
    /* JADX INFO: renamed from: ۙ */
    public final String mo10823() {
        return "method_id_item: " + m16437();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C5520 c5520) {
        int iM46861 = this.f19209.compareTo(c5520.f19209);
        if (iM46861 != 0) {
            return iM46861;
        }
        int iCompareTo = this.f19210.compareTo(c5520.f19210);
        return iCompareTo != 0 ? iCompareTo : this.f19208.compareTo(c5520.f19208);
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final String m16437() {
        if (this.f19207 == null) {
            String strM46860 = this.f19209.m46860();
            String strM10827 = this.f19210.m10827();
            String strM39476 = this.f19208.m39476();
            StringBuilder sb = new StringBuilder(strM39476.length() + strM10827.length() + strM46860.length() + 2);
            sb.append(strM46860);
            sb.append("->");
            sb.append(strM10827);
            sb.append(strM39476);
            this.f19207 = sb.toString();
        }
        return this.f19207;
    }

    public final int hashCode() {
        if (this.f19211 == 0) {
            int iHashCode = this.f19209.hashCode();
            this.f19211 = iHashCode;
            int iHashCode2 = this.f19208.hashCode() + (iHashCode * 31);
            this.f19211 = iHashCode2;
            this.f19211 = this.f19210.hashCode() + (iHashCode2 * 31);
        }
        return this.f19211;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C5520.class.equals(obj.getClass())) {
            C5520 c5520 = (C5520) obj;
            if (this.f19209 == c5520.f19209 && this.f19208 == c5520.f19208 && this.f19210 == c5520.f19210) {
                return true;
            }
        }
        return false;
    }
}
