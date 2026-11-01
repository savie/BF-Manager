package l;

/* JADX INFO: renamed from: l.ᩴܽ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: Z4GR */
/* JADX INFO: loaded from: classes5.dex */
public final class C18888 extends AbstractC9011 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C1953 f61160;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f61161;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C1953 f61162;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public String f61163;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C14655 f61164;

    @Override // l.AbstractC9011
    /* JADX INFO: renamed from: ۙ */
    public final int mo6315(int i) {
        return i + 8;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C18888 c18888 = (C18888) obj;
        int iCompareTo = this.f61162.compareTo(c18888.f61162);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int iCompareTo2 = this.f61164.compareTo(c18888.f61164);
        return iCompareTo2 != 0 ? iCompareTo2 : this.f61160.compareTo(c18888.f61160);
    }

    public C18888(C12063 c12063) {
        super(c12063);
        this.f61161 = 0;
        this.f61163 = null;
    }

    public C18888(C12063 c12063, C1953 c1953, C1953 c1954, C14655 c14655) {
        this(c12063);
        this.f61162 = c1953;
        this.f61160 = c1954;
        this.f61164 = c14655;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C18888 m43560(C12063 c12063, C1953 c1953, C1953 c1954, C14655 c14655) {
        return (C18888) c12063.f40352.m28060(new C18888(c12063, c1953, c1954, c14655));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18888 m43562(C12063 c12063) {
        return (C18888) c12063.f40352.m28060(new C18888(c12063, C1953.m6312(this.f61162.m6314(), c12063), C1953.m6312(this.f61160.m6314(), c12063), C14655.m35175(this.f61164.m35176(), c12063)));
    }

    @Override // l.AbstractC9011
    /* JADX INFO: renamed from: ۙ */
    public final void mo6320(C13825 c13825, C6187 c6187) {
        C12063 c12063 = this.f30808;
        this.f61162 = (C1953) c12063.f40367.m44688(c13825.m33638());
        this.f61160 = (C1953) c12063.f40367.m44688(c13825.m33638());
        this.f61164 = (C14655) c12063.f40354.m44688(c13825.m33642());
    }

    @Override // l.AbstractC9011
    /* JADX INFO: renamed from: ۙ */
    public final void mo6319(C4651 c4651) {
        c4651.m12833(this.f61162.f30809);
        c4651.m12833(this.f61160.f30809);
        c4651.m12839(this.f61164.f30809);
    }

    @Override // l.AbstractC9011
    /* JADX INFO: renamed from: ۙ */
    public final String mo6317() {
        return m43561();
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final String m43561() {
        if (this.f61163 == null) {
            String strM6314 = this.f61162.m6314();
            String strM35176 = this.f61164.m35176();
            String strM6315 = this.f61160.m6314();
            StringBuffer stringBuffer = new StringBuffer(strM6315.length() + strM35176.length() + strM6314.length() + 3);
            stringBuffer.append(strM6314);
            stringBuffer.append("->");
            stringBuffer.append(strM35176);
            stringBuffer.append(":");
            stringBuffer.append(strM6315);
            this.f61163 = stringBuffer.toString();
        }
        return this.f61163;
    }

    public final int hashCode() {
        if (this.f61161 == 0) {
            int iHashCode = this.f61162.hashCode();
            this.f61161 = iHashCode;
            int iHashCode2 = this.f61160.hashCode() + (iHashCode * 31);
            this.f61161 = iHashCode2;
            this.f61161 = this.f61164.hashCode() + (iHashCode2 * 31);
        }
        return this.f61161;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C18888.class.equals(obj.getClass())) {
            C18888 c18888 = (C18888) obj;
            if (this.f61162 == c18888.f61162 && this.f61160 == c18888.f61160 && this.f61164 == c18888.f61164) {
                return true;
            }
        }
        return false;
    }
}
