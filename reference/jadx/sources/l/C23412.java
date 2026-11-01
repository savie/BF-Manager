package l;

import java.util.List;

/* JADX INFO: renamed from: l.᩻ۖᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: P1MC */
/* JADX INFO: loaded from: classes.dex */
public final class C23412 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15070 f75810;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ List f75811;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f75812 = 0;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ List f75813;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int[] f75814;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15070 f75815;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int[] f75816;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f75817;

    public C23412(C15070 c15070, int i, int[] iArr, C15070 c15071, List list, List list2, int[] iArr2) {
        this.f75815 = c15070;
        this.f75817 = i;
        this.f75814 = iArr;
        this.f75810 = c15071;
        this.f75811 = list;
        this.f75813 = list2;
        this.f75816 = iArr2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51547() {
        m51546(0, this.f75815.size() - 1, 0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m51546(int i, int i2, int i3) {
        int[] iArr = this.f75814;
        int i4 = this.f75817;
        if (i3 != i4) {
            while (i <= i2) {
                iArr[i3] = i;
                i++;
                m51546(i, i2, i3 + 1);
            }
            return;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            if (((C1538) this.f75811.get(this.f75810.getInt(i6))).equals(this.f75813.get(this.f75815.getInt(iArr[i6])))) {
                i5++;
            }
        }
        if (i5 > this.f75812) {
            this.f75812 = i5;
            System.arraycopy(iArr, 0, this.f75816, 0, iArr.length);
        }
    }
}
