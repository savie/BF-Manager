package l;

import java.util.zip.CRC32;

/* JADX INFO: renamed from: l.ᩴ᩺ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q6ZO */
/* JADX INFO: loaded from: classes4.dex */
public final class C19064 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m43828(C11018 c11018, C1652 c1652, C7027 c7027, C2357 c2357, boolean z, boolean z2, C3498 c3498, C2087 c2087) {
        C13638.requireNonNull(c11018, "out");
        C13638.requireNonNull(c1652, "definition");
        long position = c11018.getPosition();
        try {
            C20889 c20889M5552 = c1652.m5552();
            C1900 c1900M5553 = c1652.m5553();
            String strM31899 = c20889M5552 == null ? null : C12859.m31899(c20889M5552);
            if (z && c20889M5552 != null && strM31899 != null && c1900M5553 != null && c7027 != null) {
                boolean z3 = false;
                if (z2 && c3498 == null && c2357 != null && c2357.m7174() == c7027.m18860()) {
                    if (c7027.m18865() <= 1000000 && c2357.m7166() <= 1000000) {
                        m43827(c11018, 1, strM31899, c1900M5553, c7027.m18860(), 0, c7027.m18860(), c7027, c2357, c2087);
                        return;
                    }
                }
                if (!z2 && c3498 != null && c3498.m10291() == c7027 && c3498.m10284()) {
                    C7027 c7027M10290 = c3498.m10290();
                    C2357 c2357M10285 = c3498.m10285();
                    if (c7027M10290 != null && c2357M10285 != null && c2357M10285.m7174() == c7027M10290.m18860()) {
                        if (c7027M10290.m18865() <= 1000000 && c2357M10285.m7166() <= 1000000) {
                            z3 = true;
                        }
                        if (z3) {
                            m43827(c11018, 2, strM31899, c1900M5553, c7027.m18860(), c3498.m10292(), c3498.m10286(), c7027M10290, c2357M10285, c2087);
                            return;
                        }
                    }
                }
                m43826(c11018);
                return;
            }
            m43826(c11018);
        } catch (RuntimeException unused) {
            c11018.seek(position);
            c11018.m27779((int) position);
            m43826(c11018);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m43827(C11018 c11018, int i, String str, C1900 c1900, int i2, int i3, int i4, C7027 c7027, C2357 c2357, C2087 c2087) {
        if (c7027.m18860() != i4 - i3 || c2357.m7174() != c7027.m18860()) {
            throw new IllegalArgumentException("Syntax cache payload coverage differs");
        }
        c11018.writeInt(1398361651);
        c11018.writeInt(3);
        int position = (int) c11018.getPosition();
        c11018.writeByte(i);
        c11018.m27782((CharSequence) str);
        c11018.writeInt(c1900.m6197());
        c11018.writeInt(i2);
        c11018.writeInt(i3);
        c11018.writeInt(i4);
        c11018.m27784(c2087 != null);
        if (c2087 != null) {
            int iM6623 = c2087.m6623();
            if (iM6623 > 32) {
                throw new IllegalArgumentException("Too many syntax derived refresh ranges");
            }
            c11018.writeInt(iM6623);
            int iM50064 = -1;
            for (int i5 = 0; i5 < iM6623; i5++) {
                C22550 c22550M6621 = c2087.m6621(i5);
                if (c22550M6621.m50065() < 0 || c22550M6621.m50065() >= c22550M6621.m50064() || c22550M6621.m50064() > i2 || c22550M6621.m50065() <= iM50064) {
                    throw new IllegalArgumentException("Invalid syntax derived refresh range");
                }
                c11018.writeInt(c22550M6621.m50065());
                c11018.writeInt(c22550M6621.m50064());
                iM50064 = c22550M6621.m50064();
            }
        }
        C18358 c18358 = new C18358();
        C2793 c2793 = new C2793();
        c2793.m8488(c7027);
        while (c2793.m8490()) {
            c18358.m42614(c2793.m8491());
        }
        c11018.writeInt(c7027.m18865());
        c11018.writeInt(c18358.m42611());
        for (int i6 = 0; i6 < c18358.m42611(); i6++) {
            C15682 c15682M42613 = c18358.m42613(i6);
            c11018.writeInt(c15682M42613.m37368());
            c11018.writeInt(c15682M42613.m37375());
            c11018.writeInt(c15682M42613.m37374());
            c11018.writeInt(c15682M42613.m37378());
            c11018.writeInt(c15682M42613.m37367());
            String strM37369 = c15682M42613.m37369();
            c11018.m27784(strM37369 != null);
            if (strM37369 != null) {
                c11018.m27782((CharSequence) strM37369);
            }
        }
        c2793.m8488(c7027);
        while (c2793.m8490()) {
            int iM8487 = c2793.m8487() - c2793.m8492();
            if (c2793.m8486()) {
                iM8487 |= Integer.MIN_VALUE;
            }
            c11018.writeInt(iM8487);
            c11018.writeInt(c18358.m42612(c2793.m8491()));
        }
        c11018.writeInt(c2357.m7166());
        for (int i7 = 0; i7 < c2357.m7166(); i7++) {
            c11018.writeInt(c2357.m7176(i7));
            c11018.writeInt(c2357.m7172(i7));
            c11018.writeInt(c2357.m7170(i7));
            C20889 c20889M7164 = c2357.m7164(i7);
            int iM6200 = c20889M7164 == null ? -1 : c1900.m6200(c20889M7164);
            if (c20889M7164 != null && iM6200 < 0) {
                throw new IllegalArgumentException("Syntax context language is outside program graph");
            }
            c11018.writeInt(iM6200 + 1);
        }
        byte[] bArrM27788 = c11018.m27788();
        int position2 = (int) c11018.getPosition();
        CRC32 crc32 = new CRC32();
        crc32.update(bArrM27788, position, position2 - position);
        c11018.writeInt((int) crc32.getValue());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m43826(C11018 c11018) {
        c11018.writeInt(1398361651);
        c11018.writeInt(3);
        int position = (int) c11018.getPosition();
        c11018.writeByte(0);
        byte[] bArrM27788 = c11018.m27788();
        int position2 = (int) c11018.getPosition();
        CRC32 crc32 = new CRC32();
        crc32.update(bArrM27788, position, position2 - position);
        c11018.writeInt((int) crc32.getValue());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C15537 m43825(int i, int i2, C17367 c17367) {
        C15537 c15537M37147;
        C13638.requireNonNull(c17367, "in");
        byte[] bArr = c17367.f55260;
        int iM40445 = c17367.m40445();
        if (i < iM40445 || i > bArr.length) {
            throw new IndexOutOfBoundsException("Syntax cache record is outside input");
        }
        C1652 c1652M5551 = C1652.m5551(null);
        try {
            if (i - iM40445 < 13) {
                c15537M37147 = C15537.m37147(c1652M5551);
            } else {
                C21886 c21886 = new C21886(bArr, iM40445, i);
                if (c21886.m48682() != 1398361651 || c21886.m48682() != 3) {
                    c15537M37147 = C15537.m37147(c1652M5551);
                } else {
                    int iM48678 = c21886.m48678();
                    int i3 = i - 4;
                    int iM43829 = m43829(i3, bArr);
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr, iM48678, i3 - iM48678);
                    if (((int) crc32.getValue()) != iM43829) {
                        c15537M37147 = C15537.m37147(c1652M5551);
                    } else {
                        C21886 c21887 = new C21886(bArr, iM48678, i3);
                        int iM48681 = c21887.m48681();
                        if (iM48681 == 0) {
                            c21887.m48680();
                            c15537M37147 = C15537.m37147(c1652M5551);
                        } else {
                            if (iM48681 != 1 && iM48681 != 2) {
                                throw new IllegalArgumentException("Unknown syntax cache kind");
                            }
                            C1652 c1652M5552 = C1652.m5551(C12859.m31894(c21887.m48679(16384)));
                            C1900 c1900M5553 = c1652M5552.m5553();
                            C20889 c20889M5552 = c1652M5552.m5552();
                            int iM48682 = c21887.m48682();
                            int iM48683 = c21887.m48682();
                            int iM48684 = c21887.m48682();
                            int iM48685 = c21887.m48682();
                            if (c1900M5553 == null || c20889M5552 == null || c1900M5553.m6197() != iM48682 || iM48683 != i2 || iM48683 < 0 || iM48684 < 0 || iM48685 < iM48684 || iM48685 > iM48683) {
                                throw new IllegalArgumentException("Syntax cache identity differs");
                            }
                            int i4 = iM48685 - iM48684;
                            if (iM48681 == 1 && (iM48684 != 0 || iM48685 != iM48683 || iM48683 > 1000000)) {
                                throw new IllegalArgumentException("Invalid full syntax cache coverage");
                            }
                            C2087 c2087M43823 = m43823(c21887, iM48683);
                            C7027 c7027M43830 = m43830(c21887, i4);
                            C2357 c2357M43824 = m43824(c21887, i4, c1900M5553);
                            c21887.m48680();
                            if (iM48681 == 1) {
                                c15537M37147 = C15537.m37149(c1652M5552, c7027M43830, c2357M43824, c2087M43823);
                            } else {
                                c15537M37147 = C15537.m37148(c1652M5552, C3498.m10281(iM48683, iM48684, c7027M43830, c2357M43824, c1900M5553.f7174), c2087M43823);
                            }
                        }
                    }
                }
            }
        } catch (RuntimeException unused) {
            c15537M37147 = C15537.m37147(c1652M5551);
        } finally {
            c17367.seek(i);
        }
        return c15537M37147;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C7027 m43830(C21886 c21886, int i) {
        int iM48682 = c21886.m48682();
        int iM48683 = c21886.m48682();
        if (iM48682 < 0 || iM48683 < 0 || ((i == 0 && (iM48682 != 0 || iM48683 != 0)) || ((i != 0 && (iM48682 == 0 || iM48682 > i || iM48682 > 1000000 || iM48683 == 0 || iM48683 > iM48682)) || iM48683 > c21886.m48677() / 21))) {
            throw new IllegalArgumentException("Invalid syntax cache run counts");
        }
        C15682[] c15682Arr = new C15682[iM48683];
        for (int i2 = 0; i2 < iM48683; i2++) {
            int iM48684 = c21886.m48682();
            int iM48685 = c21886.m48682();
            int iM48686 = c21886.m48682();
            int iM48687 = c21886.m48682();
            int iM48688 = c21886.m48682();
            int iM48681 = c21886.m48681();
            if (iM48681 == 0 || iM48681 == 255) {
                c15682Arr[i2] = C15682.m37365(iM48681 != 0 ? c21886.m48679(65536) : null, iM48684, iM48685, iM48686, iM48687, iM48688);
            } else {
                throw new IllegalArgumentException("Invalid syntax cache boolean");
            }
        }
        C11967 c11967 = new C11967();
        int i3 = 0;
        for (int i4 = 0; i4 < iM48682; i4++) {
            int iM48689 = c21886.m48682();
            boolean z = iM48689 < 0;
            int i5 = iM48689 & Integer.MAX_VALUE;
            int iM486810 = c21886.m48682();
            if (i5 <= 0 || iM486810 < 0 || iM486810 >= iM48683 || ((long) i3) + ((long) i5) > i) {
                throw new IllegalArgumentException("Invalid syntax cache run");
            }
            c11967.m29779(i5, c15682Arr[iM486810], z);
            i3 += i5;
        }
        if (i3 != i) {
            throw new IllegalArgumentException("Syntax cache runs do not cover payload");
        }
        return c11967.m29778();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C2357 m43824(C21886 c21886, int i, C1900 c1900) {
        int iM48682 = c21886.m48682();
        if (iM48682 <= 0 || iM48682 > 1000000 || iM48682 > c21886.m48677() / 16) {
            throw new IllegalArgumentException("Invalid syntax cache context count");
        }
        int[] iArr = new int[iM48682];
        int[] iArr2 = new int[iM48682];
        int[] iArr3 = new int[iM48682];
        C20889[] c20889Arr = new C20889[iM48682];
        for (int i2 = 0; i2 < iM48682; i2++) {
            int iM48683 = c21886.m48682();
            iArr[i2] = iM48683;
            int iM48684 = c21886.m48682();
            iArr2[i2] = iM48684;
            int iM48685 = c21886.m48682();
            iArr3[i2] = iM48685;
            int iM48686 = c21886.m48682();
            if (iM48683 < 0 || iM48684 < iM48683 || iM48684 > i || ((i2 == 0 && iM48685 != -1) || ((i2 != 0 && (iM48685 < 0 || iM48685 >= i2)) || iM48686 < 0 || iM48686 > c1900.m6199()))) {
                throw new IllegalArgumentException("Invalid syntax cache context node");
            }
            c20889Arr[i2] = iM48686 == 0 ? null : c1900.m6202(iM48686 - 1);
        }
        if (iArr[0] != 0 || iArr2[0] != i || c20889Arr[0] != c1900.f7183) {
            throw new IllegalArgumentException("Invalid syntax cache context root");
        }
        return new C2357(i, iM48682, iArr, iArr2, iArr3, c20889Arr);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int m43829(int i, byte[] bArr) {
        return (bArr[i + 3] << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C2087 m43823(C21886 c21886, int i) {
        int iM48681 = c21886.m48681();
        if (iM48681 != 0 && iM48681 != 255) {
            throw new IllegalArgumentException("Invalid syntax cache boolean");
        }
        if (iM48681 == 0) {
            return null;
        }
        int iM48682 = c21886.m48682();
        if (iM48682 < 0 || iM48682 > 32 || iM48682 > c21886.m48677() / 8) {
            throw new IllegalArgumentException("Invalid syntax derived refresh range count");
        }
        C2087 c2087M6617 = C2087.f7716;
        int i2 = -1;
        int i3 = 0;
        while (i3 < iM48682) {
            int iM48683 = c21886.m48682();
            int iM48684 = c21886.m48682();
            if (iM48683 < 0 || iM48683 >= iM48684 || iM48684 > i || iM48683 <= i2) {
                throw new IllegalArgumentException("Invalid syntax derived refresh range");
            }
            c2087M6617 = C2087.m6617(c2087M6617, iM48683, iM48684);
            i3++;
            i2 = iM48684;
        }
        return c2087M6617;
    }
}
