package l;

/* JADX INFO: renamed from: l.᩶ܽ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: K4XP */
/* JADX INFO: loaded from: classes5.dex */
public final class C20299 extends AbstractC9011 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C14655 f65771;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C17476 f65772;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C1953 f65773;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public String f65774;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f65775;

    @Override // l.AbstractC9011
    /* JADX INFO: renamed from: ۙ */
    public final int mo6315(int i) {
        return i + 8;
    }

    public C20299(C12063 c12063) {
        super(c12063);
        this.f65775 = 0;
        this.f65774 = null;
    }

    public C20299(C12063 c12063, C1953 c1953, C17476 c17476, C14655 c14655) {
        this(c12063);
        this.f65773 = c1953;
        this.f65772 = c17476;
        this.f65771 = c14655;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C20299 m45809(C12063 c12063, C1953 c1953, C17476 c17476, C14655 c14655) {
        return (C20299) c12063.f40370.m28060(new C20299(c12063, c1953, c17476, c14655));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20299 m45812(C12063 c12063) {
        return (C20299) c12063.f40370.m28060(new C20299(c12063, C1953.m6312(this.f65773.m6314(), c12063), this.f65772.m40674(c12063), C14655.m35175(this.f65771.m35176(), c12063)));
    }

    @Override // l.AbstractC9011
    /* JADX INFO: renamed from: ۙ */
    public final void mo6320(C13825 c13825, C6187 c6187) {
        C12063 c12063 = this.f30808;
        this.f65773 = (C1953) c12063.f40367.m44688(c13825.m33638());
        this.f65772 = (C17476) c12063.f40365.m44688(c13825.m33638());
        this.f65771 = (C14655) c12063.f40354.m44688(c13825.m33642());
    }

    @Override // l.AbstractC9011
    /* JADX INFO: renamed from: ۙ */
    public final void mo6319(C4651 c4651) {
        c4651.m12833(this.f65773.f30809);
        c4651.m12833(this.f65772.f30809);
        c4651.m12839(this.f65771.f30809);
    }

    @Override // l.AbstractC9011
    /* JADX INFO: renamed from: ۙ */
    public final String mo6317() {
        return "method_id_item: " + m45810();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C20299 c20299) {
        int iCompareTo = this.f65773.compareTo(c20299.f65773);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int iCompareTo2 = this.f65771.compareTo(c20299.f65771);
        return iCompareTo2 != 0 ? iCompareTo2 : this.f65772.compareTo(c20299.f65772);
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final String m45810() {
        if (this.f65774 == null) {
            String strM6314 = this.f65773.m6314();
            String strM35176 = this.f65771.m35176();
            String strM40672 = this.f65772.m40672();
            StringBuilder sb = new StringBuilder(strM40672.length() + strM35176.length() + strM6314.length() + 2);
            sb.append(strM6314);
            sb.append("->");
            sb.append(strM35176);
            sb.append(strM40672);
            this.f65774 = sb.toString();
        }
        return this.f65774;
    }

    public final int hashCode() {
        if (this.f65775 == 0) {
            int iHashCode = this.f65773.hashCode();
            this.f65775 = iHashCode;
            int iHashCode2 = this.f65772.hashCode() + (iHashCode * 31);
            this.f65775 = iHashCode2;
            this.f65775 = this.f65771.hashCode() + (iHashCode2 * 31);
        }
        return this.f65775;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C20299.class.equals(obj.getClass())) {
            C20299 c20299 = (C20299) obj;
            if (this.f65773 == c20299.f65773 && this.f65772 == c20299.f65772 && this.f65771 == c20299.f65771) {
                return true;
            }
        }
        return false;
    }
}
