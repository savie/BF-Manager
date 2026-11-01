package l;

/* JADX INFO: renamed from: l.ۛ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: D1JP */
/* JADX INFO: loaded from: classes2.dex */
public final class C5902 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean[] f20140 = new boolean[3];

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final boolean m16170(int i, int i2) {
        return (i & i2) == i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m16169(C15781 c15781, C5196 c5196, C20719 c20719) {
        c20719.f67424 = -1;
        C8725 c8725 = c20719.f67404;
        C8725 c8726 = c20719.f67387;
        C8725 c8727 = c20719.f67392;
        C8725 c8728 = c20719.f67421;
        C8725 c8729 = c20719.f67385;
        c20719.f67390 = -1;
        EnumC7313 enumC7313 = c15781.f67434[0];
        EnumC7313 enumC7314 = EnumC7313.WRAP_CONTENT;
        if (enumC7313 != enumC7314 && c20719.f67434[0] == EnumC7313.MATCH_PARENT) {
            int i = c8729.f29979;
            int iM46640 = c15781.m46640() - c8728.f29979;
            c8729.f29975 = c5196.m14364(c8729);
            c8728.f29975 = c5196.m14364(c8728);
            c5196.m14367(c8729.f29975, i);
            c5196.m14367(c8728.f29975, iM46640);
            c20719.f67424 = 2;
            c20719.f67372 = i;
            int i2 = iM46640 - i;
            c20719.f67425 = i2;
            int i3 = c20719.f67380;
            if (i2 < i3) {
                c20719.f67425 = i3;
            }
        }
        if (c15781.f67434[1] == enumC7314 || c20719.f67434[1] != EnumC7313.MATCH_PARENT) {
            return;
        }
        int i4 = c8727.f29979;
        int iM46619 = c15781.m46619() - c8726.f29979;
        c8727.f29975 = c5196.m14364(c8727);
        c8726.f29975 = c5196.m14364(c8726);
        c5196.m14367(c8727.f29975, i4);
        c5196.m14367(c8726.f29975, iM46619);
        if (c20719.f67379 > 0 || c20719.m46606() == 8) {
            C15075 c15075M14364 = c5196.m14364(c8725);
            c8725.f29975 = c15075M14364;
            c5196.m14367(c15075M14364, c20719.f67379 + i4);
        }
        c20719.f67390 = 2;
        c20719.f67415 = i4;
        int i5 = iM46619 - i4;
        c20719.f67396 = i5;
        int i6 = c20719.f67405;
        if (i5 < i6) {
            c20719.f67396 = i6;
        }
    }
}
