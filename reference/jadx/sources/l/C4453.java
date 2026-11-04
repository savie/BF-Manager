package l;

/* JADX INFO: renamed from: l.ۘ᩸᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 18UV */
/* JADX INFO: loaded from: classes3.dex */
public final class C4453 extends AbstractC21607 implements Comparable {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean f15937;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f15938;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int f15939;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final boolean f15940;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final int f15941;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int f15942;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean f15943;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int f15944;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean f15945;

    @Override // l.AbstractC21607
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* bridge */ /* synthetic */ boolean mo14151(AbstractC21607 abstractC21607) {
        return false;
    }

    public C4453(int i, C16549 c16549, int i2, C20861 c20861, int i3, String str, String str2) {
        AbstractC1928 abstractC1928Of;
        int iM44786;
        super(i, c16549, i2);
        int i4 = 0;
        this.f15937 = C14442.m34867(i3, false);
        int i5 = this.f69019.f50850;
        int i6 = c20861.f10128;
        AbstractC1928 abstractC1928 = c20861.f10121;
        int i7 = i5 & (~i6);
        this.f15945 = (i7 & 1) != 0;
        this.f15943 = (i7 & 2) != 0;
        if (str2 != null) {
            abstractC1928Of = AbstractC1928.of((Object) str2);
        } else {
            abstractC1928Of = abstractC1928.isEmpty() ? AbstractC1928.of((Object) "") : abstractC1928;
        }
        int i8 = 0;
        while (true) {
            if (i8 >= abstractC1928Of.size()) {
                i8 = Integer.MAX_VALUE;
                iM44786 = 0;
                break;
            } else {
                iM44786 = C19369.m44786(this.f69019, (String) abstractC1928Of.get(i8), c20861.f10127);
                if (iM44786 > 0) {
                    break;
                } else {
                    i8++;
                }
            }
        }
        this.f15942 = i8;
        this.f15938 = iM44786;
        int i9 = str2 != null ? 1088 : c20861.f10130;
        int i10 = this.f69019.f50834;
        int i11 = C19369.f62579;
        int iBitCount = (i10 == 0 || i10 != i9) ? Integer.bitCount(i9 & i10) : Integer.MAX_VALUE;
        this.f15941 = iBitCount;
        this.f15940 = (1088 & this.f69019.f50834) != 0;
        int iM44787 = C19369.m44786(this.f69019, str, C19369.m44788(str) == null);
        this.f15939 = iM44787;
        boolean z = iM44786 > 0 || (abstractC1928.isEmpty() && iBitCount > 0) || this.f15945 || (this.f15943 && iM44787 > 0);
        if (C14442.m34867(i3, c20861.f66772) && z) {
            i4 = 1;
        }
        this.f15944 = i4;
    }

    @Override // l.AbstractC21607
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo14149() {
        return this.f15944;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C4453 c4453) {
        AbstractC25114 abstractC25114Mo6827 = AbstractC25114.m55993().mo6828(this.f15937, c4453.f15937).mo6827(Integer.valueOf(this.f15942), Integer.valueOf(c4453.f15942), AbstractC18753.m43550().mo1214());
        int i = c4453.f15938;
        int i2 = this.f15938;
        AbstractC25114 abstractC25114Mo6825 = abstractC25114Mo6827.mo6825(i2, i);
        int i3 = c4453.f15941;
        int i4 = this.f15941;
        AbstractC25114 abstractC25114Mo6826 = abstractC25114Mo6825.mo6825(i4, i3).mo6828(this.f15945, c4453.f15945).mo6827(Boolean.valueOf(this.f15943), Boolean.valueOf(c4453.f15943), i2 == 0 ? AbstractC18753.m43550() : AbstractC18753.m43550().mo1214()).mo6825(this.f15939, c4453.f15939);
        if (i4 == 0) {
            abstractC25114Mo6826 = abstractC25114Mo6826.mo6829(this.f15940, c4453.f15940);
        }
        return abstractC25114Mo6826.mo6824();
    }
}
