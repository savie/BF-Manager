package l;

/* JADX INFO: renamed from: l.֫ܽ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: T4QU */
/* JADX INFO: loaded from: classes2.dex */
public final class C1953 extends AbstractC9011 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C14655 f7351;

    @Override // l.AbstractC9011
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo6315(int i) {
        return i + 4;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C1953 m6312(String str, C12063 c12063) {
        C14655 c14655M35175 = C14655.m35175(str, c12063);
        C1953 c1953 = new C1953(c12063);
        c1953.f7351 = c14655M35175;
        return (C1953) c12063.f40367.m28060(c1953);
    }

    @Override // l.AbstractC9011
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo6320(C13825 c13825, C6187 c6187) {
        this.f7351 = (C14655) this.f30808.f40354.m44688(c13825.m33642());
    }

    @Override // l.AbstractC9011
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo6319(C4651 c4651) {
        c4651.m12839(this.f7351.f30809);
    }

    @Override // l.AbstractC9011
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String mo6317() {
        return "type_id_item: " + this.f7351.m35176();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C1953 c1953) {
        return this.f7351.compareTo(c1953.f7351);
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int m6313() {
        String strM35176 = this.f7351.m35176();
        return (strM35176.charAt(0) == 'J' || strM35176.charAt(0) == 'D') ? 2 : 1;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final String m6314() {
        return this.f7351.m35176();
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String m6321() {
        String strM35176 = this.f7351.m35176();
        return strM35176.length() > 1 ? "L" : strM35176;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m6318(String str) {
        this.f7351.m35178(str);
    }

    public final int hashCode() {
        return this.f7351.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C1953.class.equals(obj.getClass()) && this.f7351 == ((C1953) obj).f7351;
    }
}
