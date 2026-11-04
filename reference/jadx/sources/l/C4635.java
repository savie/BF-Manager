package l;

/* JADX INFO: renamed from: l.ۙۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: D1JP */
/* JADX INFO: loaded from: classes2.dex */
public final class C4635 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean[] f16415 = new boolean[3];

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final boolean m14460(int i, int i2) {
        return (i & i2) == i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m14459(C1497 c1497, C17158 c17158, C10445 c10445) {
        c10445.f33241 = -1;
        C0751 c0751 = c10445.f33202;
        C0751 c0752 = c10445.f33216;
        C0751 c0753 = c10445.f33197;
        C0751 c0754 = c10445.f33248;
        C0751 c0755 = c10445.f33212;
        c10445.f33250 = -1;
        EnumC19396 enumC19396 = c1497.f33210[0];
        EnumC19396 enumC19397 = EnumC19396.WRAP_CONTENT;
        if (enumC19396 != enumC19397 && c10445.f33210[0] == EnumC19396.MATCH_PARENT) {
            int i = c0755.f2748;
            int iM26806 = c1497.m26806() - c0754.f2748;
            c0755.f2746 = c17158.m40319(c0755);
            c0754.f2746 = c17158.m40319(c0754);
            c17158.m40321(c0755.f2746, i);
            c17158.m40321(c0754.f2746, iM26806);
            c10445.f33241 = 2;
            c10445.f33234 = i;
            int i2 = iM26806 - i;
            c10445.f33242 = i2;
            int i3 = c10445.f33193;
            if (i2 < i3) {
                c10445.f33242 = i3;
            }
        }
        if (c1497.f33210[1] == enumC19397 || c10445.f33210[1] != EnumC19396.MATCH_PARENT) {
            return;
        }
        int i4 = c0753.f2748;
        int iM26823 = c1497.m26823() - c0752.f2748;
        c0753.f2746 = c17158.m40319(c0753);
        c0752.f2746 = c17158.m40319(c0752);
        c17158.m40321(c0753.f2746, i4);
        c17158.m40321(c0752.f2746, iM26823);
        if (c10445.f33192 > 0 || c10445.m26870() == 8) {
            C6718 c6718M40319 = c17158.m40319(c0751);
            c0751.f2746 = c6718M40319;
            c17158.m40321(c6718M40319, c10445.f33192 + i4);
        }
        c10445.f33250 = 2;
        c10445.f33189 = i4;
        int i5 = iM26823 - i4;
        c10445.f33204 = i5;
        int i6 = c10445.f33203;
        if (i5 < i6) {
            c10445.f33204 = i6;
        }
    }
}
