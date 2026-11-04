package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۧۗᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 76ZW */
/* JADX INFO: loaded from: classes3.dex */
public final class C11339 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f35723;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int[] f35724;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24766 f35725;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int[] f35726;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f35727;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f35728;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f35729;

    public C11339(C24766 c24766) {
        this.f35725 = c24766;
        this.f35726 = new int[c24766.f80157.length];
        this.f35724 = new int[Math.min(16, c24766.f80157.length)];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5374 m28638(C22528 c22528) {
        C17359.requireNonNull(c22528);
        int iM50762 = c22528.m50762();
        C24766 c24766 = this.f35725;
        if (iM50762 != c24766.f80154) {
            throw new IllegalArgumentException("Index and change set lengths differ");
        }
        this.f35729 = 0;
        this.f35728 = 0;
        this.f35727 = -1;
        if (this.f35723 == Integer.MAX_VALUE) {
            Arrays.fill(this.f35726, 0);
            this.f35723 = 0;
        }
        boolean z = true;
        this.f35723++;
        if (c22528.m50760()) {
            return C5374.f18852;
        }
        for (int i = 0; i < c22528.m50761(); i++) {
            int iM50763 = c22528.m50763(i);
            int iM50768 = c22528.m50768(i);
            m28637(0, c24766.f80150.length, iM50763, iM50768, iM50768 - iM50763 != c22528.m50765(i) - c22528.m50759(i));
        }
        if (c22528.m50758()) {
            for (int i2 : c24766.f80158) {
                m28636(i2);
            }
        }
        for (int i3 : c24766.f80152) {
            m28636(i3);
        }
        Arrays.sort(this.f35724, 0, this.f35728);
        if (c24766.f80151 == EnumC19544.COMPLETE && c24766.f80152.length == 0) {
            z = false;
        }
        return new C5374(Arrays.copyOf(this.f35724, this.f35728), z, this.f35727, 0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m28637(int i, int i2, int i3, int i4, boolean z) {
        if (i == i2) {
            return;
        }
        int i5 = (i + i2) >>> 1;
        this.f35729++;
        C24766 c24766 = this.f35725;
        if (c24766.f80155[i5] < i3 || C24766.m55277(c24766, c24766.f80150[i]) > i4) {
            return;
        }
        m28637(i, i5, i3, i4, z);
        int i6 = c24766.f80150[i5];
        if (c24766.f80157[i6].m31851(i3, i4) || (z && C24766.m55277(c24766, i6) <= i4 && i3 <= C24766.m55270(c24766, i6))) {
            this.f35727 = Math.max(this.f35727, c24766.f80156[i6]);
            m28636(i6);
        }
        m28637(i5 + 1, i2, i3, i4, z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m28636(int i) {
        int[] iArr = this.f35726;
        int i2 = iArr[i];
        int i3 = this.f35723;
        if (i2 == i3) {
            return;
        }
        iArr[i] = i3;
        if (this.f35728 == this.f35724.length) {
            int length = this.f35725.f80157.length;
            int i4 = this.f35728;
            this.f35724 = Arrays.copyOf(this.f35724, Math.min(length, Math.max(16, i4 + (i4 >>> 1))));
        }
        int[] iArr2 = this.f35724;
        int i5 = this.f35728;
        this.f35728 = i5 + 1;
        iArr2[i5] = i;
    }
}
