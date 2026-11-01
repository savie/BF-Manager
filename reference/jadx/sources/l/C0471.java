package l;

/* JADX INFO: renamed from: l.֡ܳ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N8CI */
/* JADX INFO: loaded from: classes2.dex */
public final class C0471 extends AbstractC12568 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final AbstractC12568 f2140 = new C0471(9);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f2141;

    public C0471(int i) {
        super(2);
        this.f2141 = 1 << (i - 1);
    }

    @Override // l.AbstractC12568
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo2340(int i, int i2, byte[] bArr, byte[] bArr2) {
        C6116 c6116;
        C6116 c6117;
        byte[] bArr3 = bArr;
        int i3 = 0;
        C23805.m52453(0, i, bArr3);
        C23805.m52453(0, i2, bArr2);
        int i4 = i - 12;
        int i5 = i - 5;
        C20228 c20228 = new C20228(this);
        C6116 c6118 = new C6116();
        C6116 c6119 = new C6116();
        C6116 c61110 = new C6116();
        int iM17088 = 1;
        int iM40569 = 0;
        while (iM17088 < i4) {
            if (c20228.m45730(bArr3, iM17088, i5, c6118)) {
                int i6 = c6118.f20881;
                int iM17089 = i3;
                int iM405610 = iM40569;
                int i7 = c6118.f20882;
                int i8 = c6118.f20883;
                int i9 = i6;
                while (true) {
                    if (c6118.m17088() < i4) {
                        int i10 = i8;
                        int i11 = i7;
                        int i12 = i9;
                        C6116 c61111 = c61110;
                        C6116 c61112 = c6119;
                        if (c20228.m45729(bArr, c6118.m17088() - 2, c6118.f20882 + 1, i5, c6118.f20881, c6119)) {
                            int i13 = c6118.f20882;
                            c6119 = c61112;
                            if (i11 < i13 && c6119.f20882 < i13 + i12) {
                                c6118.f20881 = i12;
                                c6118.f20882 = i11;
                                c6118.f20883 = i10;
                            }
                            if (c6119.f20882 - c6118.f20882 < 3) {
                                C11056.m27875(c6119, c6118);
                                i8 = i10;
                                i7 = i11;
                                i9 = i12;
                                c61110 = c61111;
                            } else {
                                while (true) {
                                    int i14 = c6119.f20882;
                                    int i15 = c6118.f20882;
                                    if (i14 - i15 < 18) {
                                        int i16 = c6118.f20881;
                                        if (i16 > 18) {
                                            i16 = 18;
                                        }
                                        if (i15 + i16 > c6119.m17088() - 4) {
                                            i16 = ((c6119.f20882 - c6118.f20882) + c6119.f20881) - 4;
                                        }
                                        int i17 = i16 - (c6119.f20882 - c6118.f20882);
                                        if (i17 > 0) {
                                            c6119.m17089(i17);
                                        }
                                    }
                                    if (c6119.f20882 + c6119.f20881 < i4) {
                                        c6117 = c6119;
                                        if (c20228.m45729(bArr, c6119.m17088() - 3, c6119.f20882, i5, c6119.f20881, c61111)) {
                                            C6116 c61113 = c61111;
                                            if (c61113.f20882 >= c6118.m17088() + 3) {
                                                if (c6117.f20882 < c6118.m17088()) {
                                                    int i18 = c6117.f20882 - c6118.f20882;
                                                    if (i18 < 15) {
                                                        if (c6118.f20881 > 18) {
                                                            c6118.f20881 = 18;
                                                        }
                                                        if (c6118.m17088() > c6117.m17088() - 4) {
                                                            c6118.f20881 = (c6117.m17088() - c6118.f20882) - 4;
                                                        }
                                                        c6117.m17089(c6118.m17088() - c6117.f20882);
                                                    } else {
                                                        c6118.f20881 = i18;
                                                    }
                                                }
                                                C6116 c61114 = c6118;
                                                iM405610 = C17405.m40569(bArr, bArr2, iM17089, c6118.f20882, c6118.f20883, c6118.f20881, iM405610, i2);
                                                iM17089 = c61114.m17088();
                                                C11056.m27875(c6117, c61114);
                                                C11056.m27875(c61113, c6117);
                                                c61111 = c61113;
                                                c6118 = c61114;
                                            } else if (c61113.f20882 >= c6118.m17088()) {
                                                if (c6117.f20882 < c6118.m17088()) {
                                                    c6117.m17089(c6118.m17088() - c6117.f20882);
                                                    if (c6117.f20881 < 4) {
                                                        C11056.m27875(c61113, c6117);
                                                    }
                                                }
                                                C6116 c61115 = c6118;
                                                iM405610 = C17405.m40569(bArr, bArr2, iM17089, c6118.f20882, c6118.f20883, c6118.f20881, iM405610, i2);
                                                iM17089 = c61115.m17088();
                                                C11056.m27875(c61113, c61115);
                                                i9 = c6117.f20881;
                                                i7 = c6117.f20882;
                                                i8 = c6117.f20883;
                                                c61110 = c61113;
                                                c6118 = c61115;
                                                c6119 = c6117;
                                            } else {
                                                C11056.m27875(c61113, c6117);
                                                c61111 = c61113;
                                            }
                                            c6119 = c6117;
                                        }
                                    } else {
                                        c6117 = c6119;
                                    }
                                    c6118 = c6118;
                                    c6116 = c61111;
                                    if (c6117.f20882 < c6118.m17088()) {
                                        c6118.f20881 = c6117.f20882 - c6118.f20882;
                                    }
                                    iM40569 = C17405.m40569(bArr, bArr2, c6118.m17088(), c6117.f20882, c6117.f20883, c6117.f20881, C17405.m40569(bArr, bArr2, iM17089, c6118.f20882, c6118.f20883, c6118.f20881, iM405610, i2), i2);
                                    iM17088 = c6117.m17088();
                                }
                            }
                        } else {
                            c6116 = c61111;
                            c6117 = c61112;
                        }
                        i3 = iM17088;
                        c61110 = c6116;
                        c6118 = c6118;
                        c6119 = c6117;
                        bArr3 = bArr;
                    } else {
                        c6116 = c61110;
                        c6117 = c6119;
                    }
                    iM40569 = C17405.m40569(bArr, bArr2, iM17089, c6118.f20882, c6118.f20883, c6118.f20881, iM405610, i2);
                    iM17088 = c6118.m17088();
                    i3 = iM17088;
                    c61110 = c6116;
                    c6118 = c6118;
                    c6119 = c6117;
                    bArr3 = bArr;
                }
            } else {
                iM17088++;
            }
        }
        return C17405.m40568(bArr, i3, i - i3, bArr2, iM40569, i2);
    }
}
