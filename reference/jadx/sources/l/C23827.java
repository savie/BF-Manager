package l;

/* JADX INFO: renamed from: l.᩻ܽ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: S4UL */
/* JADX INFO: loaded from: classes.dex */
public final class C23827 extends AbstractC9011 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public String f77023;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f77024;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f77023.compareTo(((C23827) obj).f77023);
    }

    public C23827(C12063 c12063) {
        super(c12063);
        this.f77024 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C23827 m52502(String str, C12063 c12063) {
        C23827 c23827 = new C23827(c12063);
        c23827.f77024 = 0;
        c23827.f77023 = str;
        return (C23827) c12063.f40366.m28060(c23827);
    }

    @Override // l.AbstractC9011
    /* JADX INFO: renamed from: ۙ */
    public final void mo6320(C13825 c13825, C6187 c6187) {
        c13825.m33647();
        this.f77023 = c13825.m33644();
    }

    @Override // l.AbstractC9011
    /* JADX INFO: renamed from: ۙ */
    public final int mo6315(int i) {
        return C13530.m33072(this.f77023.length()) + i + C16845.m39500(this.f77023).length + 1;
    }

    @Override // l.AbstractC9011
    /* JADX INFO: renamed from: ۙ */
    public final void mo6319(C4651 c4651) {
        byte[] bArrM39500 = C16845.m39500(this.f77023);
        c4651.m12842(this.f77023.length());
        c4651.m12837(bArrM39500, 0, bArrM39500.length);
        c4651.m12841(0);
    }

    @Override // l.AbstractC9011
    /* JADX INFO: renamed from: ۙ */
    public final String mo6317() {
        return "string_data_item: \"" + C16845.m39507(this.f77023) + "\"";
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final String m52503() {
        return this.f77023;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52504(String str) {
        this.f77023 = str;
    }

    public final int hashCode() {
        if (this.f77024 == 0) {
            this.f77024 = this.f77023.hashCode();
        }
        return this.f77024;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C23827.class.equals(obj.getClass())) {
            return false;
        }
        return this.f77023.equals(((C23827) obj).f77023);
    }
}
