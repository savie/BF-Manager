package l;

/* JADX INFO: renamed from: l.ۢ᩷᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: E5GV */
/* JADX INFO: loaded from: classes3.dex */
public final class C9841 implements Comparable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C20299 f33621;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f33622;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C17706 f33623;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m24946(C9841 c9841, C4651 c4651, C9841 c9842) {
        c9841.getClass();
        c4651.m12842(c9841.f33621.f30809 - (c9842 == null ? 0 : c9842.f33621.f30809));
        c4651.m12842(c9841.f33622);
        C17706 c17706 = c9841.f33623;
        c4651.m12842(c17706 != null ? c17706.f30807 : 0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m24945(C9841 c9841, int i, C9841 c9842) {
        int i2;
        if (c9842 == null) {
            i2 = 0;
        } else {
            c9841.getClass();
            i2 = c9842.f33621.f30809;
        }
        int iM33072 = C13530.m33072(c9841.f33622) + C13530.m33072(c9841.f33621.f30809 - i2) + i;
        C17706 c17706 = c9841.f33623;
        return iM33072 + (c17706 == null ? 1 : C13530.m33072(c17706.f30807));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f33621.compareTo(((C9841) obj).f33621);
    }

    public C9841(C20299 c20299, int i, C17706 c17706) {
        this.f33621 = c20299;
        this.f33622 = i;
        this.f33623 = c17706;
        if (c17706 != null) {
            c17706.m41253(this);
        }
    }

    public C9841(C12063 c12063, C6187 c6187, C13825 c13825, C9841 c9841) {
        this.f33621 = (C20299) c12063.f40370.m44688(c13825.m33647() + (c9841 == null ? 0 : c9841.f33621.f30809));
        this.f33622 = c13825.m33647();
        C17706 c17706 = (C17706) c6187.m17187(EnumC21004.TYPE_CODE_ITEM, c13825.m33647());
        this.f33623 = c17706;
        if (c17706 != null) {
            c17706.m41253(this);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m24947() {
        return (((EnumC3364.STATIC.getValue() | EnumC3364.PRIVATE.getValue()) | EnumC3364.CONSTRUCTOR.getValue()) & this.f33622) != 0;
    }
}
