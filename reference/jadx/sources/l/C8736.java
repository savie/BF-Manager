package l;

import android.text.TextUtils;
import java.text.Normalizer;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۡ۟ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: X6W3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8736 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final C1791 f30002;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f30004;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f30005;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public long[] f30006;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f30007;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f30008;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C7324 f30009;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f30010;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public boolean f30011;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int[] f30012;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C20730 f30013 = new C20730();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int[] f30014;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f30015;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f30016;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C6618 f30017;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int[] f30018;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public long[] f30019;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int[] f30020;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f30021;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f30022;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f30023;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int[] f30024;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public Thread f30025;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C4853 f30026;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final int[] f30001 = new int[0];

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final long[] f30003 = new long[0];

    static {
        C8030 c8030 = new C8030();
        Arrays.fill(new int[32], -1);
        Arrays.fill(new int[9], -1);
        f30002 = c8030;
    }

    public C8736(C7324 c7324) {
        int[] iArr = f30001;
        this.f30024 = iArr;
        this.f30014 = iArr;
        this.f30018 = iArr;
        long[] jArr = f30003;
        this.f30019 = jArr;
        this.f30020 = iArr;
        this.f30006 = jArr;
        this.f30012 = iArr;
        this.f30005 = -1;
        this.f30009 = c7324;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m22656() {
        if (this.f30011) {
            throw new IllegalStateException("Regex matcher is already executing");
        }
        C4853 c4853 = this.f30009.f24330;
        if (this.f30026 != c4853) {
            this.f30017 = c4853.m13552();
            this.f30026 = c4853;
            this.f30024 = f30001;
        }
        this.f30011 = true;
        this.f30007 = false;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0068 A[Catch: all -> 0x008c, ᩵۟ۨ -> 0x008f, TRY_LEAVE, TryCatch #11 {᩵۟ۨ -> 0x008f, all -> 0x008c, blocks: (B:21:0x0035, B:32:0x0056, B:34:0x005a, B:36:0x0060, B:38:0x0064, B:40:0x0068, B:22:0x003c, B:30:0x0050), top: B:96:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:42:0x006e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:89:0x0070 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x00b5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m22674(int i, CharSequence charSequence) throws Throwable {
        boolean zM22604;
        boolean zM22643;
        C7324 c7324 = this.f30009;
        int i2 = c7324.f24342;
        int i3 = c7324.f24340;
        int i4 = c7324.f24333;
        m22656();
        boolean z = true;
        try {
            try {
                zM22604 = m22604();
                try {
                    C0973 c0973 = this.f30017.f22302;
                    if (c0973 != null && m22630(c0973, c7324, i, charSequence)) {
                        m22623(i2, i3, i4, zM22604);
                        return false;
                    }
                    C6618 c6618 = this.f30017;
                    int i5 = c6618.f22304;
                    boolean z2 = c6618.f22316;
                    if (i5 == 1) {
                        boolean zM22636 = m22636(c6618.f22309, i, charSequence);
                        m22623(i2, i3, i4, zM22604);
                        return zM22636;
                    }
                    if (i5 == 2) {
                        boolean zM22628 = m22628(i, c6618.f22315, charSequence);
                        m22623(i2, i3, i4, zM22604);
                        return zM22628;
                    }
                    try {
                        if (i5 == 3) {
                            zM22643 = m22643(i, charSequence);
                        } else if (i5 != 4) {
                            zM22643 = i5 != 5 ? m22661(c6618.f22299, i, charSequence) : m22605(i, charSequence);
                        } else {
                            try {
                                zM22643 = m22633(c6618.f22300, i, charSequence);
                                z2 = true;
                            } catch (C19319 e) {
                                e = e;
                                z = true;
                                try {
                                    throw e;
                                } catch (Throwable th) {
                                    th = th;
                                    zM22604 = true;
                                    if (z) {
                                        try {
                                            m22658(false);
                                        } finally {
                                            m22623(i2, i3, i4, zM22604);
                                        }
                                    }
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                if (z) {
                                    m22658(false);
                                }
                                throw th;
                            }
                        }
                        if (zM22643) {
                            if (!c7324.f24331) {
                                C6618 c6619 = this.f30017;
                                if (c6619.f22301 || c6619.f22308 || c6619.f22307) {
                                    if (!m22670(0)) {
                                        if (z2) {
                                            try {
                                                m22658(false);
                                            } finally {
                                                m22623(i2, i3, i4, zM22604);
                                            }
                                        }
                                        return false;
                                    }
                                }
                            } else if (!m22670(0)) {
                                if (z2) {
                                    m22658(false);
                                }
                                return false;
                            }
                        }
                        if (z2) {
                            try {
                                m22658(zM22643);
                            } finally {
                                m22623(i2, i3, i4, zM22604);
                            }
                        }
                        return zM22643;
                    } catch (C19319 e2) {
                        e = e2;
                        z = z2;
                    } catch (Throwable th3) {
                        th = th3;
                        z = z2;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    z = false;
                }
            } catch (C19319 e3) {
                e = e3;
                z = false;
            }
        } catch (Throwable th5) {
            th = th5;
            z = false;
            zM22604 = false;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m22675(int i, CharSequence charSequence) throws Throwable {
        boolean zM22604;
        C7324 c7324 = this.f30009;
        C4853 c4853 = c7324.f24330;
        if (c4853.f17094 == c4853.f17083) {
            return m22674(i, charSequence);
        }
        int i2 = c7324.f24342;
        int i3 = c7324.f24340;
        int i4 = c7324.f24333;
        m22656();
        try {
            try {
                zM22604 = m22604();
                try {
                    C23595 c23595 = this.f30026.f17094;
                    C6618 c6618 = this.f30017;
                    C21435 c21435 = c6618.f22305;
                    if (c21435 != null) {
                        boolean zM22637 = m22637(c21435, i, charSequence);
                        m22623(i2, i3, i4, zM22604);
                        return zM22637;
                    }
                    C11910 c11910 = c6618.f22315;
                    if (c11910 == null) {
                        boolean zM22664 = m22664(c23595, i, charSequence);
                        m22623(i2, i3, i4, zM22604);
                        return zM22664;
                    }
                    if (c11910.f39982 && c23595.getClass() == C19402.class) {
                        boolean zM22671 = m22671(i, this.f30017.f22315, charSequence);
                        m22623(i2, i3, i4, zM22604);
                        return zM22671;
                    }
                    boolean zM22638 = m22638(c23595, i, charSequence);
                    m22623(i2, i3, i4, zM22604);
                    return zM22638;
                } catch (Throwable th) {
                    th = th;
                    m22623(i2, i3, i4, zM22604);
                    throw th;
                }
            } catch (C19319 e) {
                try {
                    throw e;
                } catch (Throwable th2) {
                    th = th2;
                    zM22604 = true;
                    m22623(i2, i3, i4, zM22604);
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            zM22604 = false;
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private boolean m22604() {
        int length = this.f30024.length;
        int i = this.f30017.f22314;
        if (length >= i) {
            return false;
        }
        m22649(i, this.f30014.length, this.f30018.length);
        this.f30024 = new int[this.f30017.f22314];
        return m22646() > 65536;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m22623(int i, int i2, int i3, boolean z) {
        C7324 c7324 = this.f30009;
        c7324.f24342 = i;
        c7324.f24340 = i2;
        c7324.f24333 = i3;
        this.f30025 = null;
        this.f30011 = false;
        if (z) {
            int[] iArr = f30001;
            this.f30012 = iArr;
            this.f30020 = iArr;
            this.f30018 = iArr;
            this.f30014 = iArr;
            this.f30024 = iArr;
            long[] jArr = f30003;
            this.f30019 = jArr;
            this.f30006 = jArr;
            this.f30004 = 0;
            this.f30021 = 0;
            this.f30005 = -1;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private boolean m22650(int i, int i2, CharSequence charSequence) {
        C6618 c6618 = this.f30017;
        int i3 = c6618.f22304;
        if (i3 == 1) {
            return m22636(c6618.f22309, i2, charSequence);
        }
        if (i3 == 3) {
            return m22643(i2, charSequence);
        }
        if (i3 == 4) {
            return m22633(c6618.f22300, i2, charSequence);
        }
        return m22661(i, i2, charSequence);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0065 A[Catch: all -> 0x0104, TRY_LEAVE, TryCatch #0 {all -> 0x0104, blocks: (B:14:0x0032, B:16:0x0036, B:17:0x003b, B:20:0x0043, B:23:0x0049, B:25:0x0053, B:27:0x0057, B:29:0x005d, B:31:0x0061, B:33:0x0065, B:39:0x0073, B:45:0x008a, B:47:0x0090, B:51:0x0098, B:54:0x00a7, B:56:0x00ab, B:58:0x00b1, B:60:0x00b5, B:66:0x00c3, B:62:0x00b9, B:69:0x00cd, B:77:0x00dc, B:79:0x00e6, B:81:0x00ec, B:83:0x00f6, B:85:0x00fb, B:52:0x009d, B:86:0x00fe, B:42:0x0083), top: B:92:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x006b  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b9 A[Catch: all -> 0x0104, TRY_LEAVE, TryCatch #0 {all -> 0x0104, blocks: (B:14:0x0032, B:16:0x0036, B:17:0x003b, B:20:0x0043, B:23:0x0049, B:25:0x0053, B:27:0x0057, B:29:0x005d, B:31:0x0061, B:33:0x0065, B:39:0x0073, B:45:0x008a, B:47:0x0090, B:51:0x0098, B:54:0x00a7, B:56:0x00ab, B:58:0x00b1, B:60:0x00b5, B:66:0x00c3, B:62:0x00b9, B:69:0x00cd, B:77:0x00dc, B:79:0x00e6, B:81:0x00ec, B:83:0x00f6, B:85:0x00fb, B:52:0x009d, B:86:0x00fe, B:42:0x0083), top: B:92:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x00bf  */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private boolean m22664(C23595 c23595, int i, CharSequence charSequence) {
        C5934 c5934 = this.f30017.f22313;
        if (!(c23595 instanceof C19402) && c5934 == null && c23595.getClass() != C9088.class && c23595.getClass() != C2384.class) {
            throw new UnsupportedOperationException("Regex program does not support search root: ".concat(c23595.getClass().getName()));
        }
        try {
            if (c5934 != null) {
                boolean zM22662 = c5934.f20205 ? m22662(c5934, i, charSequence) : m22632(c5934, i, charSequence);
                m22658(zM22662);
                return zM22662;
            }
            boolean z = c23595 instanceof C19402;
            C7324 c7324 = this.f30009;
            if (!z) {
                boolean zM22650 = m22650(this.f30017.f22312, i, charSequence);
                if (zM22650) {
                    if (!c7324.f24331) {
                        C6618 c6618 = this.f30017;
                        if (c6618.f22301 || c6618.f22308 || c6618.f22307) {
                            if (!m22670(0)) {
                                m22658(false);
                                return false;
                            }
                        }
                    } else if (!m22670(0)) {
                        m22658(false);
                        return false;
                    }
                }
                m22658(zM22650);
                return zM22650;
            }
            int i2 = c7324.f24340 - ((C19402) c23595).f62544;
            boolean z2 = c23595 instanceof C20108;
            C3795 c3795 = c7324.f24331 ? null : this.f30017.f22311;
            while (i <= i2) {
                if (c7324.m19558()) {
                    this.f30007 = true;
                    m22658(false);
                    return false;
                }
                if (c3795 != null ? m22631(c3795, i, charSequence) : m22650(this.f30017.f22312, i, charSequence)) {
                    if (!c7324.f24331) {
                        C6618 c6619 = this.f30017;
                        if (c6619.f22301 || c6619.f22308 || c6619.f22307) {
                            if (!m22670(0)) {
                                m22658(false);
                                return false;
                            }
                        }
                    } else if (!m22670(0)) {
                        m22658(false);
                        return false;
                    }
                    c7324.f24322 = i;
                    c7324.f24332[0] = i;
                    m22658(true);
                    return true;
                }
                if (this.f30007) {
                    m22658(false);
                    return false;
                }
                if (!z2 || i == i2) {
                    i++;
                } else {
                    int i3 = i + 1;
                    i = (Character.isHighSurrogate(charSequence.charAt(i)) && i3 < charSequence.length() && Character.isLowSurrogate(charSequence.charAt(i3))) ? i + 2 : i3;
                }
            }
            c7324.f24346 = true;
            m22658(false);
            return false;
        } catch (Throwable th) {
            m22658(false);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m22658(boolean z) {
        if (!z) {
            m22667(0);
            int i = this.f30021;
            while (true) {
                i -= 32;
                if (i < 0) {
                    break;
                } else {
                    m22619(i);
                }
            }
            this.f30021 = 0;
            this.f30005 = -1;
        }
        this.f30022 = 0;
        this.f30016 = 0;
        this.f30021 = 0;
        this.f30005 = -1;
        if (m22646() > 65536) {
            int[] iArr = f30001;
            this.f30012 = iArr;
            this.f30020 = iArr;
            this.f30018 = iArr;
            this.f30014 = iArr;
            this.f30024 = iArr;
            long[] jArr = f30003;
            this.f30019 = jArr;
            this.f30006 = jArr;
            this.f30004 = 0;
            this.f30021 = 0;
            this.f30005 = -1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0092 A[PHI: r13 r14
      0x0092: PHI (r13v6 int) = (r13v2 int), (r13v7 int), (r13v7 int) binds: [B:33:0x0081, B:35:0x0088, B:37:0x008c] A[DONT_GENERATE, DONT_INLINE]
      0x0092: PHI (r14v5 int) = (r14v1 int), (r14v6 int), (r14v6 int) binds: [B:33:0x0081, B:35:0x0088, B:37:0x008c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m22632(C5934 c5934, int i, CharSequence charSequence) {
        int i2;
        int i3;
        boolean z;
        int i4;
        int iIndexOf;
        int[] iArr = c5934.f20200;
        int[] iArr2 = c5934.f20203;
        int length = iArr.length;
        C7324 c7324 = this.f30009;
        int i5 = c7324.f24340 - length;
        int i6 = length - 1;
        char c = (char) iArr[i6];
        boolean z2 = charSequence instanceof InterfaceC1976;
        boolean z3 = false;
        int i7 = 0;
        int i8 = 0;
        int iMax = i;
        while (iMax <= i5) {
            if (c7324.m19558()) {
                this.f30007 = true;
                return z3;
            }
            if (z2) {
                int i9 = iMax + length;
                char cCharAt = charSequence.charAt(i9 - 1);
                if (cCharAt != c) {
                    int i10 = length - iArr2[cCharAt & 127];
                    i2 = i5;
                    if (i10 > 2) {
                        iMax += i10;
                        i3 = i6;
                    } else {
                        c7324.m19552();
                        int i11 = c7324.f24340;
                        int i12 = i11 - 1;
                        i3 = i6;
                        if (!(charSequence instanceof InterfaceC1976)) {
                            while (true) {
                                if (i9 > i12) {
                                    iIndexOf = -1;
                                    break;
                                }
                                if (charSequence.charAt(i9) == c) {
                                    iIndexOf = i9;
                                    break;
                                }
                                i9++;
                            }
                        } else {
                            iIndexOf = ((InterfaceC1976) charSequence).indexOf(c, i9, i11);
                        }
                        if (c7324.m19568()) {
                            this.f30007 = true;
                            return false;
                        }
                        if (iIndexOf < 0) {
                            c7324.f24346 = true;
                            return false;
                        }
                        int i13 = (iIndexOf - length) + 1;
                        if (i7 < 64) {
                            i7++;
                            i8 += i13 - iMax;
                            if (i7 != 64 || i8 >= 128) {
                                iMax = i13;
                            } else {
                                iMax = i13;
                                z2 = false;
                            }
                        } else {
                            iMax = i13;
                        }
                    }
                    z3 = false;
                    i5 = i2;
                    i6 = i3;
                } else {
                    i2 = i5;
                    i3 = i6;
                }
                i4 = length - 2;
                z = false;
            } else {
                i2 = i5;
                i3 = i6;
                z = false;
                i4 = i3;
            }
            while (true) {
                if (i4 < 0) {
                    c7324.f24322 = iMax;
                    if (m22661(c5934.f20202, iMax + length, charSequence)) {
                        return m22659(iMax);
                    }
                    if (!this.f30007) {
                        iMax++;
                        break;
                    }
                    return z;
                }
                if (c7324.m19558()) {
                    this.f30007 = true;
                    return z;
                }
                char cCharAt2 = charSequence.charAt(iMax + i4);
                if (cCharAt2 != iArr[i4]) {
                    iMax += Math.max((i4 + 1) - iArr2[cCharAt2 & 127], c5934.f20204[i4]);
                    break;
                }
                i4--;
            }
            z3 = false;
            i5 = i2;
            i6 = i3;
        }
        c7324.f24346 = true;
        return false;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private boolean m22662(C5934 c5934, int i, CharSequence charSequence) {
        C7324 c7324 = this.f30009;
        int i2 = c7324.f24340 - c5934.f20201;
        int[] iArr = c5934.f20200;
        while (i <= i2) {
            if (!c7324.m19558()) {
                int iM22611 = m22611(i, iArr.length, charSequence);
                if (!this.f30007) {
                    int length = iArr.length - 1;
                    while (true) {
                        if (iM22611 <= 0) {
                            c7324.f24322 = i;
                            if (m22661(c5934.f20202, c5934.f20201 + i, charSequence)) {
                                return m22659(i);
                            }
                            if (!this.f30007) {
                                i += m22611(i, 1, charSequence);
                                if (!this.f30007) {
                                    break;
                                }
                                return false;
                            }
                            return false;
                        }
                        if (c7324.m19558()) {
                            this.f30007 = true;
                            return false;
                        }
                        int iCodePointBefore = Character.codePointBefore(charSequence, i + iM22611);
                        if (iCodePointBefore != iArr[length]) {
                            i += m22611(i, Math.max((length + 1) - c5934.f20203[iCodePointBefore & 127], c5934.f20204[length]), charSequence);
                            if (!this.f30007) {
                                break;
                            }
                            return false;
                        }
                        iM22611 -= Character.charCount(iCodePointBefore);
                        length--;
                    }
                } else {
                    return false;
                }
            } else {
                this.f30007 = true;
                return false;
            }
        }
        c7324.f24346 = true;
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0015  */
    /* JADX WARN: Code duplicated, block: B:12:0x001b A[RETURN] */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private boolean m22659(int i) {
        C7324 c7324 = this.f30009;
        if (!c7324.f24331) {
            C6618 c6618 = this.f30017;
            if (c6618.f22301 || c6618.f22308 || c6618.f22307) {
                if (!m22670(0)) {
                    return false;
                }
            }
        } else if (!m22670(0)) {
            return false;
        }
        int[] iArr = c7324.f24332;
        iArr[0] = i;
        c7324.f24322 = i;
        iArr[1] = c7324.f24355;
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m22638(C23595 c23595, int i, CharSequence charSequence) {
        C11910 c11910 = this.f30017.f22315;
        if (!(c23595 instanceof C19402)) {
            if (c23595.getClass() != C9088.class) {
                throw new UnsupportedOperationException("Regex program does not support search root: ".concat(c23595.getClass().getName()));
            }
            return m22628(i, c11910, charSequence);
        }
        C7324 c7324 = this.f30009;
        int i2 = c7324.f24340 - ((C19402) c23595).f62544;
        boolean z = c23595 instanceof C20108;
        while (i <= i2) {
            if (c7324.m19558()) {
                this.f30007 = true;
                return false;
            }
            this.f30008 = i;
            if ((i >= c7324.f24340 || c11910.m29717(charSequence.charAt(i))) && m22628(i, c11910, charSequence)) {
                c7324.f24332[0] = i;
                c7324.f24322 = i;
                return true;
            }
            if (this.f30007) {
                return false;
            }
            int i3 = this.f30008;
            if (i3 > i && (!c11910.f39988 || z || c11910.f39989)) {
                i = i3;
            }
            if (!z || i >= i2) {
                i++;
            } else {
                int i4 = i + 1;
                i = (Character.isHighSurrogate(charSequence.charAt(i)) && i4 < charSequence.length() && Character.isLowSurrogate(charSequence.charAt(i4))) ? i + 2 : i4;
            }
        }
        c7324.f24346 = true;
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m22637(C21435 c21435, int i, CharSequence charSequence) {
        C20730 c20730 = this.f30013;
        try {
            c20730.m46670(c21435, this.f30009, charSequence, i);
            while (c20730.m46671()) {
                if (m22661(c20730.f67455, c20730.f67458, charSequence)) {
                    boolean zM22659 = m22659(c20730.f67465);
                    c20730.m46669();
                    m22658(zM22659);
                    return zM22659;
                }
                if (this.f30007) {
                    c20730.m46669();
                    m22658(false);
                    return false;
                }
            }
            this.f30007 |= c20730.f67457;
            c20730.m46669();
            m22658(false);
            return false;
        } catch (Throwable th) {
            c20730.m46669();
            m22658(false);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private boolean m22671(int i, C11910 c11910, CharSequence charSequence) {
        int i2 = c11910.f39975;
        int i3 = c11910.f39981;
        C7324 c7324 = this.f30009;
        int i4 = c7324.f24340 - 1;
        EnumC4584 enumC4584 = c11910.f39992.f74307;
        boolean z = enumC4584 == EnumC4584.LAZY;
        boolean z2 = enumC4584 == EnumC4584.GREEDY;
        while (i <= i4) {
            if (c7324.m19558()) {
                this.f30007 = true;
                return false;
            }
            if (i >= c7324.f24340 || c11910.m29717(charSequence.charAt(i))) {
                if (i >= c7324.f24340) {
                    c7324.f24346 = true;
                } else {
                    if (z && charSequence.charAt(i) == i3 && (c7324.f24328 != 1 || i + 1 == c7324.f24340)) {
                        m22647(i + 1);
                        c7324.f24332[0] = i;
                        c7324.f24322 = i;
                        return true;
                    }
                    if (i >= c7324.f24340) {
                        c7324.f24346 = true;
                    } else if (charSequence.charAt(i) == i2) {
                        int i5 = i + 1;
                        m22647(i5);
                        if (i5 >= c7324.f24340) {
                            c7324.f24346 = true;
                        } else if (charSequence.charAt(i5) == i3 && (c7324.f24328 != 1 || i + 2 == c7324.f24340)) {
                            m22647(i + 2);
                            c7324.f24332[0] = i;
                            c7324.f24322 = i;
                            return true;
                        }
                        if (!z2) {
                            continue;
                        }
                    }
                    if (z) {
                        continue;
                    } else if (i >= c7324.f24340) {
                        c7324.f24346 = true;
                    } else if (charSequence.charAt(i) == i3 && (c7324.f24328 != 1 || i + 1 == c7324.f24340)) {
                        m22647(i + 1);
                        c7324.f24332[0] = i;
                        c7324.f24322 = i;
                        return true;
                    }
                }
            }
            i++;
        }
        c7324.f24346 = true;
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:162:0x01de A[Catch: all -> 0x0214, TRY_ENTER, TryCatch #0 {all -> 0x0214, blocks: (B:102:0x0122, B:106:0x0133, B:108:0x0139, B:114:0x014c, B:118:0x015d, B:120:0x0163, B:135:0x0193, B:137:0x0197, B:143:0x01a9, B:144:0x01ac, B:147:0x01b3, B:149:0x01b7, B:150:0x01ba, B:162:0x01de, B:176:0x0205, B:163:0x01e1, B:165:0x01e7, B:167:0x01eb, B:169:0x01ef), top: B:519:0x0133 }] */
    /* JADX WARN: Code duplicated, block: B:163:0x01e1 A[Catch: all -> 0x0214, TryCatch #0 {all -> 0x0214, blocks: (B:102:0x0122, B:106:0x0133, B:108:0x0139, B:114:0x014c, B:118:0x015d, B:120:0x0163, B:135:0x0193, B:137:0x0197, B:143:0x01a9, B:144:0x01ac, B:147:0x01b3, B:149:0x01b7, B:150:0x01ba, B:162:0x01de, B:176:0x0205, B:163:0x01e1, B:165:0x01e7, B:167:0x01eb, B:169:0x01ef), top: B:519:0x0133 }] */
    /* JADX WARN: Code duplicated, block: B:171:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:174:0x0202  */
    /* JADX WARN: Code duplicated, block: B:175:0x0204  */
    /* JADX WARN: Code duplicated, block: B:178:0x020a  */
    /* JADX WARN: Code duplicated, block: B:183:0x0218  */
    /* JADX WARN: Code duplicated, block: B:18:0x0049 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x004b  */
    /* JADX WARN: Code duplicated, block: B:200:0x0255  */
    /* JADX WARN: Code duplicated, block: B:201:0x0258  */
    /* JADX WARN: Code duplicated, block: B:204:0x025d  */
    /* JADX WARN: Code duplicated, block: B:205:0x0260  */
    /* JADX WARN: Code duplicated, block: B:20:0x004e  */
    /* JADX WARN: Code duplicated, block: B:216:0x0279  */
    /* JADX WARN: Code duplicated, block: B:255:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:258:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:261:0x0303 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:262:0x0305  */
    /* JADX WARN: Code duplicated, block: B:263:0x0307  */
    /* JADX WARN: Code duplicated, block: B:266:0x030d A[Catch: all -> 0x02ef, TRY_ENTER, TryCatch #3 {all -> 0x02ef, blocks: (B:234:0x02b8, B:235:0x02bb, B:238:0x02c4, B:240:0x02c8, B:241:0x02cc, B:244:0x02d3, B:246:0x02dd, B:256:0x02f5, B:266:0x030d, B:269:0x031d, B:291:0x0362, B:298:0x0375, B:306:0x0388, B:311:0x0398, B:313:0x039e, B:332:0x03d8, B:338:0x03ec, B:340:0x03f2, B:272:0x0328, B:274:0x032e, B:279:0x0338, B:280:0x0346), top: B:523:0x02bb }] */
    /* JADX WARN: Code duplicated, block: B:267:0x0316  */
    /* JADX WARN: Code duplicated, block: B:269:0x031d A[Catch: all -> 0x02ef, TryCatch #3 {all -> 0x02ef, blocks: (B:234:0x02b8, B:235:0x02bb, B:238:0x02c4, B:240:0x02c8, B:241:0x02cc, B:244:0x02d3, B:246:0x02dd, B:256:0x02f5, B:266:0x030d, B:269:0x031d, B:291:0x0362, B:298:0x0375, B:306:0x0388, B:311:0x0398, B:313:0x039e, B:332:0x03d8, B:338:0x03ec, B:340:0x03f2, B:272:0x0328, B:274:0x032e, B:279:0x0338, B:280:0x0346), top: B:523:0x02bb }] */
    /* JADX WARN: Code duplicated, block: B:270:0x0323  */
    /* JADX WARN: Code duplicated, block: B:272:0x0328 A[Catch: all -> 0x02ef, TryCatch #3 {all -> 0x02ef, blocks: (B:234:0x02b8, B:235:0x02bb, B:238:0x02c4, B:240:0x02c8, B:241:0x02cc, B:244:0x02d3, B:246:0x02dd, B:256:0x02f5, B:266:0x030d, B:269:0x031d, B:291:0x0362, B:298:0x0375, B:306:0x0388, B:311:0x0398, B:313:0x039e, B:332:0x03d8, B:338:0x03ec, B:340:0x03f2, B:272:0x0328, B:274:0x032e, B:279:0x0338, B:280:0x0346), top: B:523:0x02bb }] */
    /* JADX WARN: Code duplicated, block: B:274:0x032e A[Catch: all -> 0x02ef, TryCatch #3 {all -> 0x02ef, blocks: (B:234:0x02b8, B:235:0x02bb, B:238:0x02c4, B:240:0x02c8, B:241:0x02cc, B:244:0x02d3, B:246:0x02dd, B:256:0x02f5, B:266:0x030d, B:269:0x031d, B:291:0x0362, B:298:0x0375, B:306:0x0388, B:311:0x0398, B:313:0x039e, B:332:0x03d8, B:338:0x03ec, B:340:0x03f2, B:272:0x0328, B:274:0x032e, B:279:0x0338, B:280:0x0346), top: B:523:0x02bb }] */
    /* JADX WARN: Code duplicated, block: B:279:0x0338 A[Catch: all -> 0x02ef, TryCatch #3 {all -> 0x02ef, blocks: (B:234:0x02b8, B:235:0x02bb, B:238:0x02c4, B:240:0x02c8, B:241:0x02cc, B:244:0x02d3, B:246:0x02dd, B:256:0x02f5, B:266:0x030d, B:269:0x031d, B:291:0x0362, B:298:0x0375, B:306:0x0388, B:311:0x0398, B:313:0x039e, B:332:0x03d8, B:338:0x03ec, B:340:0x03f2, B:272:0x0328, B:274:0x032e, B:279:0x0338, B:280:0x0346), top: B:523:0x02bb }] */
    /* JADX WARN: Code duplicated, block: B:284:0x0352 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:286:0x0356  */
    /* JADX WARN: Code duplicated, block: B:289:0x035f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:293:0x0369  */
    /* JADX WARN: Code duplicated, block: B:296:0x0372 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:300:0x037a  */
    /* JADX WARN: Code duplicated, block: B:303:0x0383  */
    /* JADX WARN: Code duplicated, block: B:308:0x038f  */
    /* JADX WARN: Code duplicated, block: B:311:0x0398 A[Catch: all -> 0x02ef, TRY_ENTER, TryCatch #3 {all -> 0x02ef, blocks: (B:234:0x02b8, B:235:0x02bb, B:238:0x02c4, B:240:0x02c8, B:241:0x02cc, B:244:0x02d3, B:246:0x02dd, B:256:0x02f5, B:266:0x030d, B:269:0x031d, B:291:0x0362, B:298:0x0375, B:306:0x0388, B:311:0x0398, B:313:0x039e, B:332:0x03d8, B:338:0x03ec, B:340:0x03f2, B:272:0x0328, B:274:0x032e, B:279:0x0338, B:280:0x0346), top: B:523:0x02bb }] */
    /* JADX WARN: Code duplicated, block: B:315:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:318:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:323:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:326:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:329:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:334:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:337:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:342:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:347:0x040a  */
    /* JADX WARN: Code duplicated, block: B:36:0x0070  */
    /* JADX WARN: Code duplicated, block: B:432:0x055d  */
    /* JADX WARN: Code duplicated, block: B:433:0x055f  */
    /* JADX WARN: Code duplicated, block: B:438:0x056b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:440:0x0572  */
    /* JADX WARN: Code duplicated, block: B:461:0x05b1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:462:0x05b3  */
    /* JADX WARN: Code duplicated, block: B:465:0x05c9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:466:0x05cb  */
    /* JADX WARN: Code duplicated, block: B:468:0x05cf  */
    /* JADX WARN: Code duplicated, block: B:471:0x05d5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:473:0x05d9  */
    /* JADX WARN: Code duplicated, block: B:475:0x05e1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:497:0x062d  */
    /* JADX WARN: Code duplicated, block: B:501:0x0634 A[LOOP:15: B:501:0x0634->B:518:0x066a, LOOP_START, PHI: r5 r6
      0x0634: PHI (r5v3 int) = (r5v2 int), (r5v5 int) binds: [B:499:0x0631, B:518:0x066a] A[DONT_GENERATE, DONT_INLINE]
      0x0634: PHI (r6v3 int) = (r6v2 int), (r6v5 int) binds: [B:499:0x0631, B:518:0x066a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:504:0x063d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:508:0x0644  */
    /* JADX WARN: Code duplicated, block: B:511:0x0649 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:512:0x064b  */
    /* JADX WARN: Code duplicated, block: B:513:0x065c  */
    /* JADX WARN: Code duplicated, block: B:518:0x066a A[LOOP:15: B:501:0x0634->B:518:0x066a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:54:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:561:0x0275 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:570:0x03b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:571:0x03d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:572:0x0336 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:573:0x0332 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:574:0x03f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:575:0x0354 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:576:0x0361 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:577:0x0374 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:578:0x0387 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:579:0x039e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:581:0x0400 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:599:0x0229 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:600:0x056d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:609:0x0666 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:610:0x0648 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:611:0x063f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:612:0x0648 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:614:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:616:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x00bd  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m22628(int i, C11910 c11910, CharSequence charSequence) throws Throwable {
        int iM22655;
        int i2;
        int iM22601;
        int iM22656;
        int iM22657;
        boolean z;
        int i3;
        int iM22658;
        Throwable th;
        boolean z2;
        boolean z3;
        int i4;
        int iCharAt;
        int i5;
        int i6;
        boolean z4;
        int i7;
        boolean z5;
        boolean z6;
        int i8;
        Throwable th2;
        int i9 = c11910.f39997;
        int i10 = c11910.f39980;
        int i11 = c11910.f39979;
        int i12 = c11910.f39975;
        int i13 = c11910.f39981;
        C22847 c22847 = c11910.f39992;
        C7324 c7324 = this.f30009;
        switch (i9) {
            case 0:
                Object obj = c11910.f39985;
                int i14 = c11910.f39990;
                boolean z7 = c11910.f39988;
                InterfaceC13717 interfaceC13717 = (InterfaceC13717) obj;
                int i15 = c7324.f24340;
                int i16 = 0;
                int iMax = i;
                while (iMax < i15) {
                    int iCodePointAt = z7 ? Character.codePointAt(charSequence, iMax) : charSequence.charAt(iMax);
                    int iCharCount = z7 ? Character.charCount(iCodePointAt) : 1;
                    if (iMax + iCharCount > i15) {
                        c7324.f24346 = true;
                        iCodePointAt = charSequence.charAt(iMax);
                        iCharCount = 1;
                    }
                    if (interfaceC13717.mo1813(iCodePointAt)) {
                        iMax += iCharCount;
                        i16++;
                        if (c7324.m19558()) {
                            this.f30007 = true;
                            return false;
                        }
                    } else {
                        if (iMax >= i15) {
                            c7324.f24346 = true;
                        }
                        this.f30008 = iMax;
                        if (i16 < i14) {
                            return false;
                        }
                        while (true) {
                            iM22655 = m22655(iMax, c11910, charSequence);
                            if (this.f30007) {
                                return false;
                            }
                            if (iM22655 >= 0) {
                                m22647(iM22655);
                                return true;
                            }
                            i2 = i16 - 1;
                            if (i16 <= i14) {
                                return false;
                            }
                            if (z7) {
                                iMax = Math.max(i, iMax - Character.charCount(Character.codePointBefore(charSequence, iMax)));
                            } else {
                                iMax--;
                            }
                            if (c7324.m19558()) {
                                this.f30007 = true;
                                return false;
                            }
                            i16 = i2;
                        }
                    }
                }
                if (iMax >= i15) {
                    c7324.f24346 = true;
                }
                this.f30008 = iMax;
                if (i16 < i14) {
                    return false;
                }
                while (true) {
                    iM22655 = m22655(iMax, c11910, charSequence);
                    if (this.f30007) {
                        return false;
                    }
                    if (iM22655 >= 0) {
                        m22647(iM22655);
                        return true;
                    }
                    i2 = i16 - 1;
                    if (i16 <= i14) {
                        return false;
                    }
                    if (z7) {
                        iMax = Math.max(i, iMax - Character.charCount(Character.codePointBefore(charSequence, iMax)));
                    } else {
                        iMax--;
                    }
                    if (c7324.m19558()) {
                        this.f30007 = true;
                        return false;
                    }
                    i16 = i2;
                }
                break;
            case 1:
                EnumC4584 enumC4584 = c22847.f74307;
                EnumC4584 enumC4585 = EnumC4584.LAZY;
                if (enumC4584 == enumC4585) {
                    int iM22659 = m22655(i, c11910, charSequence);
                    if (!this.f30007) {
                        if (iM22659 >= 0) {
                            m22647(iM22659);
                            return true;
                        }
                        iM22601 = m22601(i, c11910, charSequence);
                        if (!this.f30007) {
                            if (iM22601 >= 0) {
                                int[] iArr = c7324.f24332;
                                iArr[0] = c7324.f24322;
                                c7324.m19581(iM22601);
                                iArr[1] = iM22601;
                                iM22657 = m22655(iM22601, c11910, charSequence);
                                if (!this.f30007) {
                                    if (iM22657 >= 0) {
                                        m22647(iM22657);
                                        return true;
                                    }
                                    if (enumC4584 == EnumC4584.GREEDY) {
                                        iM22656 = m22655(i, c11910, charSequence);
                                        if (!this.f30007 && iM22656 >= 0) {
                                            m22647(iM22656);
                                            return true;
                                        }
                                    }
                                }
                            } else if (enumC4584 != enumC4585) {
                                iM22656 = m22655(i, c11910, charSequence);
                                if (!this.f30007) {
                                    m22647(iM22656);
                                    return true;
                                }
                            }
                        }
                    }
                } else {
                    iM22601 = m22601(i, c11910, charSequence);
                    if (!this.f30007) {
                        if (iM22601 >= 0) {
                            int[] iArr2 = c7324.f24332;
                            iArr2[0] = c7324.f24322;
                            c7324.m19581(iM22601);
                            iArr2[1] = iM22601;
                            iM22657 = m22655(iM22601, c11910, charSequence);
                            if (!this.f30007) {
                                if (iM22657 >= 0) {
                                    m22647(iM22657);
                                    return true;
                                }
                                if (enumC4584 == EnumC4584.GREEDY) {
                                    iM22656 = m22655(i, c11910, charSequence);
                                    if (!this.f30007) {
                                        m22647(iM22656);
                                        return true;
                                    }
                                }
                            }
                        } else if (enumC4584 != enumC4585) {
                            iM22656 = m22655(i, c11910, charSequence);
                            if (!this.f30007) {
                                m22647(iM22656);
                                return true;
                            }
                        }
                    }
                }
                return false;
            case 2:
                int i17 = i;
                int i18 = 0;
                while (true) {
                    int i19 = c22847.f74310;
                    EnumC4584 enumC4586 = c22847.f74307;
                    int i20 = c22847.f74308;
                    if (i18 < i19) {
                        int iM22602 = m22601(i17, c11910, charSequence);
                        if (!this.f30007) {
                            if (iM22602 < 0) {
                                m22626(c11910, i17, true);
                                return false;
                            }
                            m22647(iM22602);
                            i18++;
                            if (c7324.m19558()) {
                                this.f30007 = true;
                                return false;
                            }
                            i17 = iM22602;
                        }
                    } else {
                        if (c7324.f24357) {
                            this.f30007 = true;
                            return false;
                        }
                        if (enumC4586 != EnumC4584.LAZY) {
                            while (i18 < i20) {
                                int iM22603 = m22601(i17, c11910, charSequence);
                                if (!this.f30007) {
                                    if (iM22603 < 0) {
                                        if (i18 < i20) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        i3 = i17;
                                        do {
                                            iM22658 = m22655(i3, c11910, charSequence);
                                            if (this.f30007) {
                                                if (iM22658 >= 0) {
                                                    m22647(iM22658);
                                                    return true;
                                                }
                                                if (enumC4586 != EnumC4584.POSSESSIVE || i18 <= c22847.f74310) {
                                                    m22626(c11910, i17, z);
                                                    return false;
                                                }
                                                i3 -= c11910.f39993;
                                                i18--;
                                            }
                                        } while (!c7324.m19558());
                                        this.f30007 = true;
                                        return false;
                                    }
                                    m22647(iM22603);
                                    i18++;
                                    if (c7324.m19558()) {
                                        this.f30007 = true;
                                        return false;
                                    }
                                    i17 = iM22603;
                                }
                            }
                            if (i18 < i20) {
                                z = true;
                            } else {
                                z = false;
                            }
                            i3 = i17;
                            do {
                                iM22658 = m22655(i3, c11910, charSequence);
                                if (this.f30007) {
                                    if (iM22658 >= 0) {
                                        m22647(iM22658);
                                        return true;
                                    }
                                    if (enumC4586 != EnumC4584.POSSESSIVE) {
                                    }
                                    m22626(c11910, i17, z);
                                    return false;
                                }
                            } while (!c7324.m19558());
                            this.f30007 = true;
                            return false;
                        }
                        while (true) {
                            int iM226510 = m22655(i17, c11910, charSequence);
                            if (!this.f30007) {
                                if (iM226510 >= 0) {
                                    m22647(iM226510);
                                    return true;
                                }
                                if (i18 < i20) {
                                    int iM22604 = m22601(i17, c11910, charSequence);
                                    if (!this.f30007) {
                                        if (iM22604 < 0) {
                                            m22626(c11910, i17, true);
                                            return false;
                                        }
                                        m22647(iM22604);
                                        i18++;
                                        if (c7324.m19558()) {
                                            this.f30007 = true;
                                            return false;
                                        }
                                        i17 = iM22604;
                                    }
                                }
                            }
                        }
                    }
                }
                return false;
            case 3:
                boolean z8 = c7324.f24331;
                if (z8) {
                    C22847 c22848 = c22847;
                    int i21 = c22848.f74310;
                    int i22 = c22848.f74312;
                    int i23 = c22848.f74311;
                    int i24 = this.f30024[i23];
                    int[] iArr3 = c7324.f24332;
                    int i25 = iArr3[i22];
                    int i26 = iArr3[i22 + 1];
                    int size = z8 ? c7324.f24341.f59218.size() : -1;
                    this.f30024[i23] = -1;
                    try {
                        int i27 = c11910.f39979;
                        int i28 = c11910.f39980;
                        int iM22612 = i;
                        int i29 = 0;
                        while (i29 < i21) {
                            int i30 = i29;
                            int i31 = iM22612;
                            int i32 = i27;
                            C22847 c22849 = c22848;
                            int i33 = i28;
                            iM22612 = m22612(i27, i28, charSequence, i31, c7324.f24340);
                            if (iM22612 < 0) {
                                m22626(c11910, i31, true);
                                m22622(i23, i22, i24, i25, i26, size);
                                return false;
                            }
                            c7324.m19581(iM22612);
                            m22620(i22, i31, iM22612);
                            i29 = i30 + 1;
                            if (c7324.m19558()) {
                                this.f30007 = true;
                                m22622(i23, i22, i24, i25, i26, size);
                                return false;
                            }
                            c22848 = c22849;
                            i27 = i32;
                            i28 = i33;
                        }
                        int i34 = iM22612;
                        boolean zM22663 = c22848.f74307 == EnumC4584.LAZY ? m22663(c11910, i34, i21, charSequence) : m22634(c11910, i34, i21, charSequence);
                        if (!zM22663) {
                            m22622(i23, i22, i24, i25, i26, size);
                        }
                        return zM22663;
                    } catch (Throwable th3) {
                        m22622(i23, i22, i24, i25, i26, size);
                        throw th3;
                    }
                }
                int i35 = c22847.f74310;
                int i36 = c22847.f74308;
                int i37 = c7324.f24340;
                int i38 = c22847.f74311;
                int[] iArr4 = this.f30024;
                int i39 = iArr4[i38];
                boolean z9 = c22847.f74307 == EnumC4584.LAZY;
                iArr4[i38] = -1;
                int i40 = z9 ? i35 : i36;
                int i41 = i;
                boolean z10 = z9;
                C22847 c228410 = c22847;
                int i42 = 0;
                int i43 = -1;
                while (i42 < i40) {
                    if (i41 >= i37) {
                        c7324.f24346 = true;
                    } else {
                        try {
                            int i44 = i40;
                            if (charSequence.charAt(i41) == i11) {
                                int i45 = i41 + 1;
                                if (i45 >= i37) {
                                    c7324.f24346 = true;
                                } else if (charSequence.charAt(i45) == i10) {
                                    i43 = i41 + 2;
                                    i42++;
                                    if (c7324.m19558()) {
                                        this.f30007 = true;
                                        if (i43 >= 0) {
                                            c7324.m19581(i43);
                                        }
                                        this.f30024[i38] = i39;
                                        return false;
                                    }
                                    i41 = i43;
                                    i40 = i44;
                                }
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            if (i43 >= 0) {
                                c7324.m19581(i43);
                            }
                            this.f30024[i38] = i39;
                            throw th;
                        }
                    }
                    if (i42 < i35) {
                        m22626(c11910, i41, true);
                        if (i43 >= 0) {
                            c7324.m19581(i43);
                        }
                        this.f30024[i38] = i39;
                        return false;
                    }
                    if (i42 < i36) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    z3 = z2;
                    i4 = i41;
                    while (true) {
                        if (i4 < i37) {
                            iCharAt = charSequence.charAt(i4);
                        } else {
                            iCharAt = -1;
                        }
                        if (iCharAt < 0) {
                            i5 = i35;
                            c7324.f24346 = true;
                        } else {
                            i5 = i35;
                            if (iCharAt == i13) {
                                if (c7324.f24328 != 1) {
                                    if (i4 + 1 == i37) {
                                    }
                                }
                                if (i42 > 0) {
                                    int[] iArr5 = c7324.f24332;
                                    int i46 = c228410.f74312;
                                    iArr5[i46] = i4 - 2;
                                    iArr5[i46 + 1] = i4;
                                }
                                m22647(i4 + 1);
                                return true;
                            }
                            C22847 c228411 = c228410;
                            if (z10) {
                                i35 = i5;
                                if (i42 <= i35) {
                                    i41 = i41;
                                    m22626(c11910, i41, z3);
                                    if (i43 >= 0) {
                                        c7324.m19581(i43);
                                    }
                                    this.f30024[i38] = i39;
                                    return false;
                                }
                                i41 = i41;
                                i4 -= 2;
                                i42--;
                                if (c7324.m19558()) {
                                    this.f30007 = true;
                                    if (i43 >= 0) {
                                        c7324.m19581(i43);
                                    }
                                    this.f30024[i38] = i39;
                                    return false;
                                }
                            } else {
                                if (i42 >= i36) {
                                    if (i43 >= 0) {
                                        c7324.m19581(i43);
                                    }
                                    this.f30024[i38] = i39;
                                    return false;
                                }
                                if (i4 >= i37) {
                                    c7324.f24346 = true;
                                    m22626(c11910, i4, true);
                                    if (i43 >= 0) {
                                        c7324.m19581(i43);
                                    }
                                    this.f30024[i38] = i39;
                                    return false;
                                }
                                if (iCharAt != i11) {
                                    m22626(c11910, i4, true);
                                    if (i43 >= 0) {
                                        c7324.m19581(i43);
                                    }
                                    this.f30024[i38] = i39;
                                    return false;
                                }
                                i6 = i4 + 1;
                                if (i6 >= i37) {
                                    c7324.f24346 = true;
                                    m22626(c11910, i4, true);
                                    if (i43 >= 0) {
                                        c7324.m19581(i43);
                                    }
                                    this.f30024[i38] = i39;
                                    return false;
                                }
                                if (charSequence.charAt(i6) != i10) {
                                    m22626(c11910, i4, true);
                                    if (i43 >= 0) {
                                        c7324.m19581(i43);
                                    }
                                    this.f30024[i38] = i39;
                                    return false;
                                }
                                i4 += 2;
                                i42++;
                                try {
                                    if (c7324.m19558()) {
                                        this.f30007 = true;
                                        if (i4 >= 0) {
                                            c7324.m19581(i4);
                                        }
                                        this.f30024[i38] = i39;
                                        return false;
                                    }
                                    i41 = i41;
                                    i43 = i4;
                                    i35 = i5;
                                } catch (Throwable th5) {
                                    th = th5;
                                    i43 = i4;
                                    if (i43 >= 0) {
                                        c7324.m19581(i43);
                                    }
                                    this.f30024[i38] = i39;
                                    throw th;
                                }
                            }
                            z3 = z3;
                            c228410 = c228411;
                            i13 = i13;
                        }
                        C22847 c228412 = c228410;
                        if (z10) {
                            i35 = i5;
                            if (i42 <= i35) {
                                i41 = i41;
                                m22626(c11910, i41, z3);
                                if (i43 >= 0) {
                                    c7324.m19581(i43);
                                }
                                this.f30024[i38] = i39;
                                return false;
                            }
                            i41 = i41;
                            i4 -= 2;
                            i42--;
                            if (c7324.m19558()) {
                                this.f30007 = true;
                                if (i43 >= 0) {
                                    c7324.m19581(i43);
                                }
                                this.f30024[i38] = i39;
                                return false;
                            }
                        } else {
                            if (i42 >= i36) {
                                if (i43 >= 0) {
                                    c7324.m19581(i43);
                                }
                                this.f30024[i38] = i39;
                                return false;
                            }
                            if (i4 >= i37) {
                                c7324.f24346 = true;
                                m22626(c11910, i4, true);
                                if (i43 >= 0) {
                                    c7324.m19581(i43);
                                }
                                this.f30024[i38] = i39;
                                return false;
                            }
                            if (iCharAt != i11) {
                                m22626(c11910, i4, true);
                                if (i43 >= 0) {
                                    c7324.m19581(i43);
                                }
                                this.f30024[i38] = i39;
                                return false;
                            }
                            i6 = i4 + 1;
                            if (i6 >= i37) {
                                c7324.f24346 = true;
                                m22626(c11910, i4, true);
                                if (i43 >= 0) {
                                    c7324.m19581(i43);
                                }
                                this.f30024[i38] = i39;
                                return false;
                            }
                            if (charSequence.charAt(i6) != i10) {
                                m22626(c11910, i4, true);
                                if (i43 >= 0) {
                                    c7324.m19581(i43);
                                }
                                this.f30024[i38] = i39;
                                return false;
                            }
                            i4 += 2;
                            i42++;
                            if (c7324.m19558()) {
                                this.f30007 = true;
                                if (i4 >= 0) {
                                    c7324.m19581(i4);
                                }
                                this.f30024[i38] = i39;
                                return false;
                            }
                            i41 = i41;
                            i43 = i4;
                            i35 = i5;
                        }
                        z3 = z3;
                        c228410 = c228412;
                        i13 = i13;
                    }
                }
                if (i42 < i35) {
                    m22626(c11910, i41, true);
                    if (i43 >= 0) {
                        c7324.m19581(i43);
                    }
                    this.f30024[i38] = i39;
                    return false;
                }
                if (i42 < i36) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                z3 = z2;
                i4 = i41;
                while (true) {
                    if (i4 < i37) {
                        iCharAt = charSequence.charAt(i4);
                    } else {
                        iCharAt = -1;
                    }
                    if (iCharAt < 0) {
                        i5 = i35;
                        c7324.f24346 = true;
                    } else {
                        i5 = i35;
                        if (iCharAt == i13) {
                            if (c7324.f24328 != 1) {
                                if (i4 + 1 == i37) {
                                }
                            }
                            if (i42 > 0) {
                                int[] iArr6 = c7324.f24332;
                                int i47 = c228410.f74312;
                                iArr6[i47] = i4 - 2;
                                iArr6[i47 + 1] = i4;
                            }
                            m22647(i4 + 1);
                            return true;
                        }
                        C22847 c228413 = c228410;
                        if (z10) {
                            i35 = i5;
                            if (i42 <= i35) {
                                i41 = i41;
                                m22626(c11910, i41, z3);
                                if (i43 >= 0) {
                                    c7324.m19581(i43);
                                }
                                this.f30024[i38] = i39;
                                return false;
                            }
                            i41 = i41;
                            i4 -= 2;
                            i42--;
                            if (c7324.m19558()) {
                                this.f30007 = true;
                                if (i43 >= 0) {
                                    c7324.m19581(i43);
                                }
                                this.f30024[i38] = i39;
                                return false;
                            }
                        } else {
                            if (i42 >= i36) {
                                if (i43 >= 0) {
                                    c7324.m19581(i43);
                                }
                                this.f30024[i38] = i39;
                                return false;
                            }
                            if (i4 >= i37) {
                                c7324.f24346 = true;
                                m22626(c11910, i4, true);
                                if (i43 >= 0) {
                                    c7324.m19581(i43);
                                }
                                this.f30024[i38] = i39;
                                return false;
                            }
                            if (iCharAt != i11) {
                                m22626(c11910, i4, true);
                                if (i43 >= 0) {
                                    c7324.m19581(i43);
                                }
                                this.f30024[i38] = i39;
                                return false;
                            }
                            i6 = i4 + 1;
                            if (i6 >= i37) {
                                c7324.f24346 = true;
                                m22626(c11910, i4, true);
                                if (i43 >= 0) {
                                    c7324.m19581(i43);
                                }
                                this.f30024[i38] = i39;
                                return false;
                            }
                            if (charSequence.charAt(i6) != i10) {
                                m22626(c11910, i4, true);
                                if (i43 >= 0) {
                                    c7324.m19581(i43);
                                }
                                this.f30024[i38] = i39;
                                return false;
                            }
                            i4 += 2;
                            i42++;
                            if (c7324.m19558()) {
                                this.f30007 = true;
                                if (i4 >= 0) {
                                    c7324.m19581(i4);
                                }
                                this.f30024[i38] = i39;
                                return false;
                            }
                            i41 = i41;
                            i43 = i4;
                            i35 = i5;
                        }
                        z3 = z3;
                        c228410 = c228413;
                        i13 = i13;
                    }
                    C22847 c228414 = c228410;
                    if (z10) {
                        i35 = i5;
                        if (i42 <= i35) {
                            i41 = i41;
                            m22626(c11910, i41, z3);
                            if (i43 >= 0) {
                                c7324.m19581(i43);
                            }
                            this.f30024[i38] = i39;
                            return false;
                        }
                        i41 = i41;
                        i4 -= 2;
                        i42--;
                        if (c7324.m19558()) {
                            this.f30007 = true;
                            if (i43 >= 0) {
                                c7324.m19581(i43);
                            }
                            this.f30024[i38] = i39;
                            return false;
                        }
                    } else {
                        if (i42 >= i36) {
                            if (i43 >= 0) {
                                c7324.m19581(i43);
                            }
                            this.f30024[i38] = i39;
                            return false;
                        }
                        if (i4 >= i37) {
                            c7324.f24346 = true;
                            m22626(c11910, i4, true);
                            if (i43 >= 0) {
                                c7324.m19581(i43);
                            }
                            this.f30024[i38] = i39;
                            return false;
                        }
                        if (iCharAt != i11) {
                            m22626(c11910, i4, true);
                            if (i43 >= 0) {
                                c7324.m19581(i43);
                            }
                            this.f30024[i38] = i39;
                            return false;
                        }
                        i6 = i4 + 1;
                        if (i6 >= i37) {
                            c7324.f24346 = true;
                            m22626(c11910, i4, true);
                            if (i43 >= 0) {
                                c7324.m19581(i43);
                            }
                            this.f30024[i38] = i39;
                            return false;
                        }
                        if (charSequence.charAt(i6) != i10) {
                            m22626(c11910, i4, true);
                            if (i43 >= 0) {
                                c7324.m19581(i43);
                            }
                            this.f30024[i38] = i39;
                            return false;
                        }
                        i4 += 2;
                        i42++;
                        if (c7324.m19558()) {
                            this.f30007 = true;
                            if (i4 >= 0) {
                                c7324.m19581(i4);
                            }
                            this.f30024[i38] = i39;
                            return false;
                        }
                        i41 = i41;
                        i43 = i4;
                        i35 = i5;
                    }
                    z3 = z3;
                    c228410 = c228414;
                    i13 = i13;
                }
                break;
            case 4:
            default:
                return m22652(i, c11910, charSequence);
            case 5:
                if (m22644(i, c11910, charSequence)) {
                    int i48 = c7324.f24340;
                    int i49 = c22847.f74310;
                    int i50 = c22847.f74308;
                    int i51 = i + i49;
                    int i52 = i49;
                    while (i52 < i50) {
                        if (i51 >= i48) {
                            c7324.f24346 = true;
                        } else if (charSequence.charAt(i51) == i12) {
                            i51++;
                            m22647(i51);
                            i52++;
                            if (c7324.m19558()) {
                                this.f30007 = true;
                                return false;
                            }
                        }
                        if (i52 < i50) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        i7 = i51;
                        do {
                            if (i7 >= i48) {
                                c7324.f24346 = true;
                            } else if (charSequence.charAt(i7) == i13 && (c7324.f24328 != 1 || i7 + 1 == i48)) {
                                m22647(i7 + 1);
                                return true;
                            }
                            if (i52 <= i49) {
                                m22626(c11910, i51, z4);
                                return false;
                            }
                            i7--;
                            i52--;
                        } while (!c7324.m19558());
                        this.f30007 = true;
                        return false;
                    }
                    if (i52 < i50) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    i7 = i51;
                    do {
                        if (i7 >= i48) {
                            c7324.f24346 = true;
                        } else if (charSequence.charAt(i7) == i13) {
                            m22647(i7 + 1);
                            return true;
                        }
                        if (i52 <= i49) {
                            m22626(c11910, i51, z4);
                            return false;
                        }
                        i7--;
                        i52--;
                    } while (!c7324.m19558());
                    this.f30007 = true;
                    return false;
                }
                return false;
            case 6:
                if (c7324.f24331) {
                    return m22652(i, c11910, charSequence);
                }
                int i53 = c11910.f39995;
                int i54 = c22847.f74310;
                int i55 = c22847.f74308;
                int i56 = c7324.f24340;
                int i57 = 0;
                int i58 = i;
                boolean z11 = false;
                while (i57 < i54) {
                    if (i58 >= i56) {
                        c7324.f24346 = true;
                        m22626(c11910, i58, true);
                        if (i57 > 0) {
                            int[] iArr7 = c7324.f24332;
                            iArr7[i53] = i58 - 2;
                            iArr7[i53 + 1] = i58;
                            return z11;
                        }
                    } else {
                        try {
                            if (charSequence.charAt(i58) != i11) {
                                m22626(c11910, i58, true);
                                if (i57 > 0) {
                                    int[] iArr8 = c7324.f24332;
                                    iArr8[i53] = i58 - 2;
                                    iArr8[i53 + 1] = i58;
                                    return z11;
                                }
                            } else {
                                int i59 = i58 + 1;
                                if (i59 >= i56) {
                                    c7324.f24346 = true;
                                    m22626(c11910, i58, true);
                                    if (i57 > 0) {
                                        int[] iArr9 = c7324.f24332;
                                        iArr9[i53] = i58 - 2;
                                        iArr9[i53 + 1] = i58;
                                        return z11;
                                    }
                                } else if (charSequence.charAt(i59) != i10) {
                                    m22626(c11910, i58, true);
                                    if (i57 > 0) {
                                        int[] iArr10 = c7324.f24332;
                                        iArr10[i53] = i58 - 2;
                                        iArr10[i53 + 1] = i58;
                                        return z11;
                                    }
                                } else {
                                    z5 = false;
                                    i8 = i58 + 2;
                                    try {
                                        m22647(i8);
                                        i57++;
                                        if (c7324.m19558()) {
                                            this.f30007 = true;
                                            if (i57 > 0) {
                                                int[] iArr11 = c7324.f24332;
                                                iArr11[i53] = i58;
                                                iArr11[i53 + 1] = i8;
                                                return false;
                                            }
                                            return z5;
                                        }
                                        z11 = false;
                                        i58 = i8;
                                    } catch (Throwable th6) {
                                        th2 = th6;
                                        if (i57 > 0) {
                                            int[] iArr12 = c7324.f24332;
                                            iArr12[i53] = i8 - 2;
                                            iArr12[i53 + 1] = i8;
                                        }
                                        throw th2;
                                    }
                                }
                            }
                        } catch (Throwable th7) {
                            th2 = th7;
                            i8 = i58;
                            if (i57 > 0) {
                                int[] iArr13 = c7324.f24332;
                                iArr13[i53] = i8 - 2;
                                iArr13[i53 + 1] = i8;
                            }
                            throw th2;
                        }
                    }
                    return false;
                }
                z5 = false;
                if (c7324.f24357) {
                    this.f30007 = true;
                    if (i57 <= 0) {
                        return false;
                    }
                    int[] iArr14 = c7324.f24332;
                    iArr14[i53] = i58 - 2;
                    iArr14[i53 + 1] = i58;
                    return false;
                }
                while (i57 < i55) {
                    if (i58 >= i56) {
                        c7324.f24346 = true;
                    } else if (charSequence.charAt(i58) == i11) {
                        int i60 = i58 + 1;
                        if (i60 >= i56) {
                            c7324.f24346 = true;
                        } else if (charSequence.charAt(i60) == i10) {
                            i8 = i58 + 2;
                            m22647(i8);
                            i57++;
                            if (c7324.m19558()) {
                                this.f30007 = true;
                                if (i57 > 0) {
                                    int[] iArr15 = c7324.f24332;
                                    iArr15[i53] = i58;
                                    iArr15[i53 + 1] = i8;
                                    return false;
                                }
                                return z5;
                            }
                            i58 = i8;
                        }
                    }
                    if (i58 >= i56) {
                        c7324.f24346 = true;
                    } else if (charSequence.charAt(i58) == i13 && (c7324.f24328 != 1 || i58 + 1 == i56)) {
                        m22647(i58 + 1);
                        if (i57 > 0) {
                            int[] iArr16 = c7324.f24332;
                            iArr16[i53] = i58 - 2;
                            iArr16[i53 + 1] = i58;
                        }
                        return true;
                    }
                    if (i57 < i55) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    m22626(c11910, i58, z6);
                    if (i57 > 0) {
                        return false;
                    }
                    int[] iArr17 = c7324.f24332;
                    iArr17[i53] = i58 - 2;
                    iArr17[i53 + 1] = i58;
                    return false;
                }
                if (i58 >= i56) {
                    c7324.f24346 = true;
                } else if (charSequence.charAt(i58) == i13) {
                    m22647(i58 + 1);
                    if (i57 > 0) {
                        int[] iArr18 = c7324.f24332;
                        iArr18[i53] = i58 - 2;
                        iArr18[i53 + 1] = i58;
                    }
                    return true;
                }
                if (i57 < i55) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                m22626(c11910, i58, z6);
                if (i57 > 0) {
                    return false;
                }
                int[] iArr19 = c7324.f24332;
                iArr19[i53] = i58 - 2;
                iArr19[i53 + 1] = i58;
                return false;
            case 7:
                if (m22644(i, c11910, charSequence)) {
                    int i61 = c22847.f74308;
                    int i62 = c7324.f24340;
                    int i63 = c22847.f74310;
                    int i64 = i + i63;
                    do {
                        int iCharAt2 = i64 < i62 ? charSequence.charAt(i64) : -1;
                        if (iCharAt2 < 0) {
                            c7324.f24346 = true;
                        } else if (iCharAt2 == i13 && (c7324.f24328 != 1 || i64 + 1 == i62)) {
                            m22647(i64 + 1);
                            return true;
                        }
                        if (i63 < i61) {
                            if (iCharAt2 < 0 || iCharAt2 != i12) {
                                m22626(c11910, i64, true);
                                return false;
                            }
                            i64++;
                            m22647(i64);
                            i63++;
                        }
                    } while (!c7324.m19558());
                    this.f30007 = true;
                    return false;
                }
                return false;
            case 8:
                if (m22644(i, c11910, charSequence)) {
                    int i65 = c7324.f24340;
                    int i66 = c22847.f74308;
                    int i67 = c22847.f74310;
                    int i68 = i + i67;
                    while (i67 < i66) {
                        if (i68 >= i65) {
                            c7324.f24346 = true;
                        } else if (charSequence.charAt(i68) == i12) {
                            i68++;
                            m22647(i68);
                            i67++;
                            if (c7324.m19558()) {
                                this.f30007 = true;
                                return false;
                            }
                        }
                        if (i68 >= i65) {
                            c7324.f24346 = true;
                        } else if (charSequence.charAt(i68) == i13 && (c7324.f24328 != 1 || i68 + 1 == i65)) {
                            m22647(i68 + 1);
                            return true;
                        }
                        m22626(c11910, i68, i67 < i66);
                        return false;
                    }
                    if (i68 >= i65) {
                        c7324.f24346 = true;
                    } else if (charSequence.charAt(i68) == i13) {
                        m22647(i68 + 1);
                        return true;
                    }
                    m22626(c11910, i68, i67 < i66);
                    return false;
                }
                return false;
            case 9:
                if (m22644(i, c11910, charSequence)) {
                    int i69 = c7324.f24340;
                    int i70 = c22847.f74310;
                    int i71 = c22847.f74308;
                    int i72 = i + i70;
                    int i73 = i70;
                    while (i73 < i71) {
                        if (i72 >= i69) {
                            c7324.f24346 = true;
                        } else if (charSequence.charAt(i72) == i12) {
                            i72++;
                            m22647(i72);
                            i73++;
                        }
                        if (i73 == i71) {
                            if (i72 >= i69) {
                                c7324.f24346 = true;
                            } else if (charSequence.charAt(i72) == i12 && (c7324.f24328 != 1 || i72 + 1 == i69)) {
                                m22647(i72 + 1);
                                return true;
                            }
                        }
                        if (i73 > i70 || (c7324.f24328 == 1 && i72 != i69)) {
                            m22626(c11910, i72, i73 < i71);
                            return false;
                        }
                        m22647(i72);
                        return true;
                    }
                    if (i73 == i71) {
                        if (i72 >= i69) {
                            c7324.f24346 = true;
                        } else if (charSequence.charAt(i72) == i12) {
                            m22647(i72 + 1);
                            return true;
                        }
                    }
                    if (i73 > i70) {
                    }
                    m22626(c11910, i72, i73 < i71);
                    return false;
                }
                return false;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m22622(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f30024[i] = i3;
        C7324 c7324 = this.f30009;
        int[] iArr = c7324.f24332;
        iArr[i2] = i4;
        iArr[i2 + 1] = i5;
        if (i6 >= 0) {
            c7324.f24341.m43016(i6);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private boolean m22663(C11910 c11910, int i, int i2, CharSequence charSequence) {
        C22847 c22847 = c11910.f39992;
        int i3 = c22847.f74308;
        int i4 = c22847.f74312;
        int i5 = c11910.f39979;
        int i6 = c11910.f39980;
        int i7 = c11910.f39981;
        int i8 = i;
        int i9 = i2;
        while (true) {
            C7324 c7324 = this.f30009;
            int iM22609 = m22609(i7, i8, c7324.f24340, charSequence);
            if (iM22609 >= 0 && c7324.f24328 == 1 && iM22609 != c7324.f24340) {
                iM22609 = -1;
            }
            if (iM22609 >= 0) {
                m22647(iM22609);
                return true;
            }
            if (i9 >= i3) {
                return false;
            }
            int i10 = i3;
            int iM22612 = m22612(i5, i6, charSequence, i8, c7324.f24340);
            if (iM22612 < 0) {
                m22626(c11910, i8, true);
                return false;
            }
            c7324.m19581(iM22612);
            m22620(i4, i8, iM22612);
            i9++;
            if (c7324.m19558()) {
                this.f30007 = true;
                return false;
            }
            i8 = iM22612;
            i3 = i10;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m22634(C11910 c11910, int i, int i2, CharSequence charSequence) {
        int i3;
        int i4;
        int i5;
        C22847 c22847 = c11910.f39992;
        int i6 = c22847.f74308;
        int i7 = c22847.f74312;
        int i8 = c11910.f39979;
        int i9 = c11910.f39980;
        int i10 = c11910.f39981;
        C7324 c7324 = this.f30009;
        C18613 c18613 = c7324.f24341;
        int[] iArr = c7324.f24332;
        int i11 = iArr[i7];
        int i12 = i7 + 1;
        int i13 = iArr[i12];
        int size = c7324.f24331 ? c18613.f59218.size() : -1;
        int iM22612 = i;
        int i14 = i2;
        while (true) {
            if (i14 >= i6) {
                i3 = i14;
                i4 = iM22612;
                i5 = size;
                break;
            }
            int i15 = i8;
            int i16 = i9;
            int i17 = i8;
            i3 = i14;
            int i18 = iM22612;
            int i19 = i9;
            i5 = size;
            iM22612 = m22612(i15, i16, charSequence, iM22612, c7324.f24340);
            if (iM22612 < 0) {
                i4 = i18;
                break;
            }
            c7324.m19581(iM22612);
            m22620(i7, i18, iM22612);
            i14 = i3 + 1;
            if (!c7324.m19558()) {
                size = i5;
                i8 = i17;
                i9 = i19;
            }
            this.f30007 = true;
            return false;
        }
        boolean z = i3 < i6;
        int i20 = i4;
        int i21 = i3;
        while (true) {
            if (i21 == i2) {
                if (i5 >= 0) {
                    c18613.m43016(i5);
                }
                int[] iArr2 = c7324.f24332;
                iArr2[i7] = i11;
                iArr2[i12] = i13;
            }
            int iM22609 = m22609(i10, i20, c7324.f24340, charSequence);
            if (iM22609 >= 0 && c7324.f24328 == 1 && iM22609 != c7324.f24340) {
                iM22609 = -1;
            }
            if (iM22609 >= 0) {
                if (i21 > i2) {
                    m22620(i7, i20 - 2, i20);
                }
                m22647(iM22609);
                return true;
            }
            if (i21 <= i2) {
                m22626(c11910, i4, z);
                return false;
            }
            int i22 = i20 - 2;
            i21--;
            m22620(i7, i20 - 4, i22);
            if (c7324.m19558()) {
                this.f30007 = true;
                return false;
            }
            i20 = i22;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m22612(int i, int i2, CharSequence charSequence, int i3, int i4) {
        C7324 c7324 = this.f30009;
        if (i3 >= i4) {
            c7324.f24346 = true;
            return -1;
        }
        if (charSequence.charAt(i3) != i) {
            return -1;
        }
        int i5 = i3 + 1;
        if (i5 >= i4) {
            c7324.f24346 = true;
            return -1;
        }
        if (charSequence.charAt(i5) == i2) {
            return i3 + 2;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m22620(int i, int i2, int i3) {
        C7324 c7324 = this.f30009;
        if (c7324.f24331) {
            c7324.f24341.m43017(i, i2, i3, c7324.f24332);
        }
        int[] iArr = c7324.f24332;
        iArr[i] = i2;
        iArr[i + 1] = i3;
    }

    /* JADX WARN: Code duplicated, block: B:131:0x01c2 A[Catch: all -> 0x0214, TRY_LEAVE, TryCatch #0 {all -> 0x0214, blocks: (B:24:0x005a, B:36:0x007f, B:43:0x0095, B:45:0x00a3, B:54:0x00c1, B:57:0x00c7, B:59:0x00cb, B:66:0x00e1, B:68:0x00e7, B:78:0x010a, B:88:0x0126, B:98:0x0145, B:105:0x015c, B:107:0x016c, B:118:0x0190, B:121:0x019a, B:124:0x01a8, B:126:0x01ae, B:131:0x01c2, B:157:0x021e, B:159:0x0226, B:169:0x0247, B:171:0x024b, B:185:0x0279, B:187:0x0281, B:189:0x028c, B:201:0x02b2, B:202:0x02b5, B:206:0x02be, B:214:0x02e5, B:216:0x02ee, B:141:0x01e9, B:143:0x01f7), top: B:232:0x005a }] */
    /* JADX WARN: Code duplicated, block: B:134:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:136:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:139:0x01e4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:141:0x01e9 A[Catch: all -> 0x0214, TRY_ENTER, TryCatch #0 {all -> 0x0214, blocks: (B:24:0x005a, B:36:0x007f, B:43:0x0095, B:45:0x00a3, B:54:0x00c1, B:57:0x00c7, B:59:0x00cb, B:66:0x00e1, B:68:0x00e7, B:78:0x010a, B:88:0x0126, B:98:0x0145, B:105:0x015c, B:107:0x016c, B:118:0x0190, B:121:0x019a, B:124:0x01a8, B:126:0x01ae, B:131:0x01c2, B:157:0x021e, B:159:0x0226, B:169:0x0247, B:171:0x024b, B:185:0x0279, B:187:0x0281, B:189:0x028c, B:201:0x02b2, B:202:0x02b5, B:206:0x02be, B:214:0x02e5, B:216:0x02ee, B:141:0x01e9, B:143:0x01f7), top: B:232:0x005a }] */
    /* JADX WARN: Code duplicated, block: B:145:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:147:0x0202  */
    /* JADX WARN: Code duplicated, block: B:150:0x020e A[LOOP:2: B:130:0x01c0->B:150:0x020e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:155:0x021b  */
    /* JADX WARN: Code duplicated, block: B:156:0x021d  */
    /* JADX WARN: Code duplicated, block: B:159:0x0226 A[Catch: all -> 0x0214, TRY_LEAVE, TryCatch #0 {all -> 0x0214, blocks: (B:24:0x005a, B:36:0x007f, B:43:0x0095, B:45:0x00a3, B:54:0x00c1, B:57:0x00c7, B:59:0x00cb, B:66:0x00e1, B:68:0x00e7, B:78:0x010a, B:88:0x0126, B:98:0x0145, B:105:0x015c, B:107:0x016c, B:118:0x0190, B:121:0x019a, B:124:0x01a8, B:126:0x01ae, B:131:0x01c2, B:157:0x021e, B:159:0x0226, B:169:0x0247, B:171:0x024b, B:185:0x0279, B:187:0x0281, B:189:0x028c, B:201:0x02b2, B:202:0x02b5, B:206:0x02be, B:214:0x02e5, B:216:0x02ee, B:141:0x01e9, B:143:0x01f7), top: B:232:0x005a }] */
    /* JADX WARN: Code duplicated, block: B:161:0x0230 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:162:0x0232  */
    /* JADX WARN: Code duplicated, block: B:164:0x0238  */
    /* JADX WARN: Code duplicated, block: B:167:0x0244  */
    /* JADX WARN: Code duplicated, block: B:169:0x0247 A[Catch: all -> 0x0214, TRY_ENTER, TryCatch #0 {all -> 0x0214, blocks: (B:24:0x005a, B:36:0x007f, B:43:0x0095, B:45:0x00a3, B:54:0x00c1, B:57:0x00c7, B:59:0x00cb, B:66:0x00e1, B:68:0x00e7, B:78:0x010a, B:88:0x0126, B:98:0x0145, B:105:0x015c, B:107:0x016c, B:118:0x0190, B:121:0x019a, B:124:0x01a8, B:126:0x01ae, B:131:0x01c2, B:157:0x021e, B:159:0x0226, B:169:0x0247, B:171:0x024b, B:185:0x0279, B:187:0x0281, B:189:0x028c, B:201:0x02b2, B:202:0x02b5, B:206:0x02be, B:214:0x02e5, B:216:0x02ee, B:141:0x01e9, B:143:0x01f7), top: B:232:0x005a }] */
    /* JADX WARN: Code duplicated, block: B:171:0x024b A[Catch: all -> 0x0214, TRY_LEAVE, TryCatch #0 {all -> 0x0214, blocks: (B:24:0x005a, B:36:0x007f, B:43:0x0095, B:45:0x00a3, B:54:0x00c1, B:57:0x00c7, B:59:0x00cb, B:66:0x00e1, B:68:0x00e7, B:78:0x010a, B:88:0x0126, B:98:0x0145, B:105:0x015c, B:107:0x016c, B:118:0x0190, B:121:0x019a, B:124:0x01a8, B:126:0x01ae, B:131:0x01c2, B:157:0x021e, B:159:0x0226, B:169:0x0247, B:171:0x024b, B:185:0x0279, B:187:0x0281, B:189:0x028c, B:201:0x02b2, B:202:0x02b5, B:206:0x02be, B:214:0x02e5, B:216:0x02ee, B:141:0x01e9, B:143:0x01f7), top: B:232:0x005a }] */
    /* JADX WARN: Code duplicated, block: B:173:0x0250  */
    /* JADX WARN: Code duplicated, block: B:175:0x0256  */
    /* JADX WARN: Code duplicated, block: B:178:0x0262  */
    /* JADX WARN: Code duplicated, block: B:188:0x028a  */
    /* JADX WARN: Code duplicated, block: B:192:0x0296  */
    /* JADX WARN: Code duplicated, block: B:194:0x029c  */
    /* JADX WARN: Code duplicated, block: B:197:0x02a8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:204:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:208:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:210:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:213:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:218:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:220:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:222:0x0303  */
    /* JADX WARN: Code duplicated, block: B:224:0x0309 A[LOOP:3: B:179:0x0269->B:224:0x0309, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:243:0x0217 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:244:0x01d0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:245:0x01e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:246:0x01f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:247:0x02aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:248:0x02be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:249:0x02ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:250:0x0294 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:259:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:260:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:261:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:262:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:263:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:264:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:265:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private boolean m22652(int i, C11910 c11910, CharSequence charSequence) {
        int i2;
        int i3;
        int i4;
        EnumC4584 enumC4584;
        boolean z;
        int i5;
        boolean z2;
        int i6;
        int i7;
        int i8;
        int i9;
        int iM22655;
        C22847 c22847;
        boolean z3;
        int iM22656;
        int i10;
        int iM22601;
        C11910 c11911 = c11910;
        C7324 c7324 = this.f30009;
        C18613 c18613 = c7324.f24341;
        C22847 c22848 = c11911.f39992;
        int i11 = c11911.f39993;
        int i12 = c22848.f74311;
        EnumC4584 enumC4585 = c22848.f74307;
        int i13 = c22848.f74308;
        int i14 = c22848.f74310;
        boolean z4 = c22848.f74309;
        int i15 = c22848.f74312;
        int i16 = i12 >= 0 ? this.f30024[i12] : 0;
        int i17 = z4 ? c7324.f24332[i15] : 0;
        int i18 = z4 ? c7324.f24332[i15 + 1] : 0;
        int size = (!c7324.f24331 || (i12 >= 0 && !z4)) ? -1 : c18613.f59218.size();
        int i19 = i13;
        if (i12 >= 0) {
            this.f30024[i12] = -1;
        }
        int i20 = i;
        int i21 = 0;
        while (i21 < i14) {
            int i22 = i14;
            try {
                int iM22602 = m22601(i20, c11911, charSequence);
                if (this.f30007) {
                    if (i12 >= 0) {
                        this.f30024[i12] = i16;
                    }
                    if (z4) {
                        int[] iArr = c7324.f24332;
                        iArr[i15] = i17;
                        iArr[i15 + 1] = i18;
                    }
                    if (size < 0) {
                        return false;
                    }
                } else if (iM22602 < 0) {
                    m22626(c11911, i20, true);
                    if (i12 >= 0) {
                        this.f30024[i12] = i16;
                    }
                    if (z4) {
                        int[] iArr2 = c7324.f24332;
                        iArr2[i15] = i17;
                        iArr2[i15 + 1] = i18;
                    }
                    if (size < 0) {
                        return false;
                    }
                } else {
                    m22625(c11911, i20, iM22602);
                    m22627(c22848, i20, iM22602);
                    i21++;
                    if (c7324.m19558()) {
                        this.f30007 = true;
                        if (i12 >= 0) {
                            this.f30024[i12] = i16;
                        }
                        if (z4) {
                            int[] iArr3 = c7324.f24332;
                            iArr3[i15] = i17;
                            iArr3[i15 + 1] = i18;
                        }
                        if (size < 0) {
                            return false;
                        }
                    } else {
                        i20 = iM22602;
                        i14 = i22;
                    }
                }
                c18613.m43016(size);
                return false;
            } catch (Throwable th) {
                if (i12 >= 0) {
                    this.f30024[i12] = i16;
                }
                if (z4) {
                    int[] iArr4 = c7324.f24332;
                    iArr4[i15] = i17;
                    iArr4[i15 + 1] = i18;
                }
                if (size >= 0) {
                    c18613.m43016(size);
                }
                throw th;
            }
        }
        int i23 = i14;
        if (c22848.f74313 || i12 >= 0 || !c7324.f24357) {
            EnumC4584 enumC4586 = enumC4585;
            if (enumC4586 == EnumC4584.LAZY) {
                while (true) {
                    int iM22657 = m22655(i20, c11911, charSequence);
                    C22847 c22849 = c22848;
                    if (this.f30007) {
                        if (i12 >= 0) {
                            this.f30024[i12] = i16;
                        }
                        if (z4) {
                            int[] iArr5 = c7324.f24332;
                            iArr5[i15] = i17;
                            iArr5[i15 + 1] = i18;
                        }
                        if (size >= 0) {
                            break;
                        }
                        return false;
                    }
                    if (iM22657 >= 0) {
                        m22647(iM22657);
                        return true;
                    }
                    int i24 = i19;
                    if (i21 >= i24) {
                        if (i12 >= 0) {
                            this.f30024[i12] = i16;
                        }
                        if (z4) {
                            int[] iArr6 = c7324.f24332;
                            iArr6[i15] = i17;
                            iArr6[i15 + 1] = i18;
                        }
                        if (size >= 0) {
                            break;
                        }
                        return false;
                    }
                    int iM22603 = m22601(i20, c11911, charSequence);
                    if (this.f30007) {
                        if (i12 >= 0) {
                            this.f30024[i12] = i16;
                        }
                        if (z4) {
                            int[] iArr7 = c7324.f24332;
                            iArr7[i15] = i17;
                            iArr7[i15 + 1] = i18;
                        }
                        if (size >= 0) {
                            break;
                        }
                        return false;
                    }
                    if (iM22603 < 0) {
                        m22626(c11911, i20, true);
                        if (i12 >= 0) {
                            this.f30024[i12] = i16;
                        }
                        if (z4) {
                            int[] iArr8 = c7324.f24332;
                            iArr8[i15] = i17;
                            iArr8[i15 + 1] = i18;
                        }
                        if (size >= 0) {
                            break;
                        }
                        return false;
                    }
                    m22625(c11911, i20, iM22603);
                    m22627(c22849, i20, iM22603);
                    i21++;
                    if (c7324.m19558()) {
                        this.f30007 = true;
                        if (i12 >= 0) {
                            this.f30024[i12] = i16;
                        }
                        if (z4) {
                            int[] iArr9 = c7324.f24332;
                            iArr9[i15] = i17;
                            iArr9[i15 + 1] = i18;
                        }
                        if (size >= 0) {
                            break;
                        }
                        return false;
                    }
                    i19 = i24;
                    i20 = iM22603;
                    c22848 = c22849;
                }
            } else {
                C22847 c228410 = c22848;
                int i25 = i19;
                int i26 = z4 ? c7324.f24332[i15] : 0;
                int i27 = z4 ? c7324.f24332[i15 + 1] : 0;
                if (z4) {
                    i2 = i27;
                    int size2 = c7324.f24331 ? c18613.f59218.size() : -1;
                    int i28 = i26;
                    i3 = i21;
                    int i29 = size2;
                    i4 = i20;
                    while (true) {
                        if (i3 < i25) {
                            enumC4584 = enumC4586;
                            break;
                        }
                        i10 = i25;
                        enumC4584 = enumC4586;
                        iM22601 = m22601(i4, c11911, charSequence);
                        if (this.f30007) {
                            if (i12 >= 0) {
                                this.f30024[i12] = i16;
                            }
                            if (z4) {
                                int[] iArr10 = c7324.f24332;
                                iArr10[i15] = i17;
                                iArr10[i15 + 1] = i18;
                            }
                            if (size < 0) {
                                return false;
                            }
                        } else {
                            if (iM22601 < 0) {
                                i25 = i10;
                                break;
                            }
                            m22625(c11911, i4, iM22601);
                            m22627(c228410, i4, iM22601);
                            i3++;
                            if (c7324.m19558()) {
                                this.f30007 = true;
                                if (i12 >= 0) {
                                    this.f30024[i12] = i16;
                                }
                                if (z4) {
                                    int[] iArr11 = c7324.f24332;
                                    iArr11[i15] = i17;
                                    iArr11[i15 + 1] = i18;
                                }
                                if (size < 0) {
                                    return false;
                                }
                            } else {
                                i4 = iM22601;
                                enumC4586 = enumC4584;
                                i25 = i10;
                            }
                        }
                    }
                    if (i3 < i25) {
                        z = true;
                    } else {
                        z = false;
                    }
                    i5 = i3;
                    if (enumC4584 == EnumC4584.POSSESSIVE) {
                        iM22656 = m22655(i4, c11911, charSequence);
                        if (this.f30007) {
                            if (i12 >= 0) {
                                this.f30024[i12] = i16;
                            }
                            if (z4) {
                                int[] iArr12 = c7324.f24332;
                                iArr12[i15] = i17;
                                iArr12[i15 + 1] = i18;
                            }
                            if (size < 0) {
                                return false;
                            }
                        } else {
                            if (iM22656 >= 0) {
                                m22647(iM22656);
                                return true;
                            }
                            m22626(c11911, i4, z);
                            if (i12 >= 0) {
                                this.f30024[i12] = i16;
                            }
                            if (z4) {
                                int[] iArr13 = c7324.f24332;
                                iArr13[i15] = i17;
                                iArr13[i15 + 1] = i18;
                            }
                            if (size < 0) {
                                return false;
                            }
                        }
                    } else {
                        z2 = z;
                        i6 = i4;
                        i7 = i5;
                        while (true) {
                            i8 = i4;
                            i9 = i23;
                            if (i12 < 0 && i7 == i9 && z4) {
                                if (i29 >= 0) {
                                    int i30 = i29;
                                    c18613.m43016(i30);
                                    i29 = i30;
                                }
                                int[] iArr14 = c7324.f24332;
                                iArr14[i15] = i28;
                                iArr14[i15 + 1] = i2;
                            } else {
                                c228410 = c228410;
                            }
                            iM22655 = m22655(i6, c11911, charSequence);
                            if (this.f30007) {
                                if (i12 >= 0) {
                                    this.f30024[i12] = i16;
                                }
                                if (z4) {
                                    int[] iArr15 = c7324.f24332;
                                    iArr15[i15] = i17;
                                    iArr15[i15 + 1] = i18;
                                }
                                if (size < 0) {
                                    return false;
                                }
                            } else {
                                if (iM22655 >= 0) {
                                    if (i12 >= 0 && i7 > i9) {
                                        m22627(c228410, i6 - i11, i6);
                                    }
                                    m22647(iM22655);
                                    return true;
                                }
                                c22847 = c228410;
                                if (i7 <= i9) {
                                    m22626(c11911, i8, z2);
                                    if (i12 >= 0) {
                                        this.f30024[i12] = i16;
                                    }
                                    if (z4) {
                                        int[] iArr16 = c7324.f24332;
                                        iArr16[i15] = i17;
                                        iArr16[i15 + 1] = i18;
                                    }
                                    if (size < 0) {
                                        return false;
                                    }
                                } else {
                                    i23 = i9;
                                    z3 = z2;
                                    i6 -= i11;
                                    i7--;
                                    m22627(c22847, i6 - i11, i6);
                                    if (c7324.m19558()) {
                                        this.f30007 = true;
                                        if (i12 >= 0) {
                                            this.f30024[i12] = i16;
                                        }
                                        if (z4) {
                                            int[] iArr17 = c7324.f24332;
                                            iArr17[i15] = i17;
                                            iArr17[i15 + 1] = i18;
                                        }
                                        if (size >= 0) {
                                            return false;
                                        }
                                        c18613.m43016(size);
                                        return false;
                                    }
                                    c11911 = c11910;
                                    z2 = z3;
                                    i4 = i8;
                                    c228410 = c22847;
                                }
                            }
                        }
                    }
                } else {
                    i2 = i27;
                }
                int i210 = i26;
                i3 = i21;
                int i211 = size2;
                i4 = i20;
                while (true) {
                    if (i3 < i25) {
                        enumC4584 = enumC4586;
                        break;
                    }
                    i10 = i25;
                    enumC4584 = enumC4586;
                    iM22601 = m22601(i4, c11911, charSequence);
                    if (this.f30007) {
                        if (i12 >= 0) {
                            this.f30024[i12] = i16;
                        }
                        if (z4) {
                            int[] iArr18 = c7324.f24332;
                            iArr18[i15] = i17;
                            iArr18[i15 + 1] = i18;
                        }
                        if (size < 0) {
                            return false;
                        }
                    } else {
                        if (iM22601 < 0) {
                            i25 = i10;
                            break;
                        }
                        m22625(c11911, i4, iM22601);
                        m22627(c228410, i4, iM22601);
                        i3++;
                        if (c7324.m19558()) {
                            this.f30007 = true;
                            if (i12 >= 0) {
                                this.f30024[i12] = i16;
                            }
                            if (z4) {
                                int[] iArr19 = c7324.f24332;
                                iArr19[i15] = i17;
                                iArr19[i15 + 1] = i18;
                            }
                            if (size < 0) {
                                return false;
                            }
                        } else {
                            i4 = iM22601;
                            enumC4586 = enumC4584;
                            i25 = i10;
                        }
                    }
                }
                if (i3 < i25) {
                    z = true;
                } else {
                    z = false;
                }
                i5 = i3;
                if (enumC4584 == EnumC4584.POSSESSIVE) {
                    iM22656 = m22655(i4, c11911, charSequence);
                    if (this.f30007) {
                        if (i12 >= 0) {
                            this.f30024[i12] = i16;
                        }
                        if (z4) {
                            int[] iArr110 = c7324.f24332;
                            iArr110[i15] = i17;
                            iArr110[i15 + 1] = i18;
                        }
                        if (size < 0) {
                            return false;
                        }
                    } else {
                        if (iM22656 >= 0) {
                            m22647(iM22656);
                            return true;
                        }
                        m22626(c11911, i4, z);
                        if (i12 >= 0) {
                            this.f30024[i12] = i16;
                        }
                        if (z4) {
                            int[] iArr111 = c7324.f24332;
                            iArr111[i15] = i17;
                            iArr111[i15 + 1] = i18;
                        }
                        if (size < 0) {
                            return false;
                        }
                    }
                } else {
                    z2 = z;
                    i6 = i4;
                    i7 = i5;
                    while (true) {
                        i8 = i4;
                        i9 = i23;
                        if (i12 < 0) {
                            c228410 = c228410;
                        } else {
                            c228410 = c228410;
                        }
                        iM22655 = m22655(i6, c11911, charSequence);
                        if (this.f30007) {
                            if (i12 >= 0) {
                                this.f30024[i12] = i16;
                            }
                            if (z4) {
                                int[] iArr112 = c7324.f24332;
                                iArr112[i15] = i17;
                                iArr112[i15 + 1] = i18;
                            }
                            if (size < 0) {
                                return false;
                            }
                        } else {
                            if (iM22655 >= 0) {
                                if (i12 >= 0) {
                                    m22627(c228410, i6 - i11, i6);
                                }
                                m22647(iM22655);
                                return true;
                            }
                            c22847 = c228410;
                            if (i7 <= i9) {
                                m22626(c11911, i8, z2);
                                if (i12 >= 0) {
                                    this.f30024[i12] = i16;
                                }
                                if (z4) {
                                    int[] iArr113 = c7324.f24332;
                                    iArr113[i15] = i17;
                                    iArr113[i15 + 1] = i18;
                                }
                                if (size < 0) {
                                    return false;
                                }
                            } else {
                                i23 = i9;
                                z3 = z2;
                                i6 -= i11;
                                i7--;
                                m22627(c22847, i6 - i11, i6);
                                if (c7324.m19558()) {
                                    this.f30007 = true;
                                    if (i12 >= 0) {
                                        this.f30024[i12] = i16;
                                    }
                                    if (z4) {
                                        int[] iArr114 = c7324.f24332;
                                        iArr114[i15] = i17;
                                        iArr114[i15 + 1] = i18;
                                    }
                                    if (size >= 0) {
                                        return false;
                                    }
                                    c18613.m43016(size);
                                    return false;
                                }
                                c11911 = c11910;
                                z2 = z3;
                                i4 = i8;
                                c228410 = c22847;
                            }
                        }
                    }
                }
            }
        } else {
            this.f30007 = true;
            if (i12 >= 0) {
                this.f30024[i12] = i16;
            }
            if (z4) {
                int[] iArr20 = c7324.f24332;
                iArr20[i15] = i17;
                iArr20[i15 + 1] = i18;
            }
            if (size < 0) {
                return false;
            }
        }
        c18613.m43016(size);
        return false;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private boolean m22644(int i, C11910 c11910, CharSequence charSequence) {
        int i2 = c11910.f39975;
        int i3 = c11910.f39992.f74310;
        C7324 c7324 = this.f30009;
        int i4 = c7324.f24340;
        int i5 = 0;
        while (i5 < i3) {
            if (i >= i4) {
                c7324.f24346 = true;
                m22626(c11910, i, true);
                return false;
            }
            if (charSequence.charAt(i) != i2) {
                m22626(c11910, i, true);
                return false;
            }
            i++;
            m22647(i);
            i5++;
            if (c7324.m19558()) {
                this.f30007 = true;
                return false;
            }
        }
        if (!c7324.f24357) {
            return true;
        }
        this.f30007 = true;
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m22626(C11910 c11910, int i, boolean z) {
        if (z && c11910.f39991) {
            this.f30008 = i;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m22625(C11910 c11910, int i, int i2) {
        boolean z = c11910.f39996;
        C7324 c7324 = this.f30009;
        if (z) {
            int[] iArr = c7324.f24332;
            int i3 = c11910.f39995;
            int i4 = iArr[i3];
            int i5 = i3 + 1;
            int i6 = iArr[i5];
            iArr[i3] = i;
            iArr[i5] = i2;
            if (c7324.f24331 && i4 != -1 && i6 != -1) {
                C18613 c18613 = c7324.f24341;
                c18613.f59218.add(new C12573(i3 / 2, i4, i6));
            }
        }
        c7324.m19581(i2);
        if (c11910.f39992.f74311 < 0) {
            int[] iArr2 = c7324.f24332;
            iArr2[0] = c7324.f24322;
            iArr2[1] = i2;
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private int m22601(int i, C11910 c11910, CharSequence charSequence) {
        C7324 c7324 = this.f30009;
        int i2 = c7324.f24340;
        if (!c11910.f39986) {
            int i3 = c11910.f39975;
            if (i3 >= 0) {
                return m22609(i3, i, i2, charSequence);
            }
            int i4 = c11910.f39976;
            return i4 >= 0 ? m22610(i4, i, i2, c11910.f39977, charSequence) : m22613(i, i2, charSequence, c11910.f39985);
        }
        if (i >= i2) {
            c7324.f24346 = true;
            return -1;
        }
        if (charSequence.charAt(i) != c11910.f39979) {
            return -1;
        }
        int i5 = i + 1;
        if (i5 >= i2) {
            c7324.f24346 = true;
            return -1;
        }
        if (charSequence.charAt(i5) == c11910.f39980) {
            return i + 2;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m22609(int i, int i2, int i3, CharSequence charSequence) {
        if (i2 >= i3) {
            this.f30009.f24346 = true;
            return -1;
        }
        if (charSequence.charAt(i2) == i) {
            return i2 + 1;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m22610(int i, int i2, int i3, InterfaceC13717 interfaceC13717, CharSequence charSequence) {
        if (i2 >= i3) {
            this.f30009.f24346 = true;
            return -1;
        }
        char cCharAt = charSequence.charAt(i2);
        if (cCharAt >= 128 ? interfaceC13717 == null || !interfaceC13717.mo1813(cCharAt) : cCharAt != i) {
            return -1;
        }
        return i2 + 1;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private int m22655(int i, C11910 c11910, CharSequence charSequence) {
        int iM22610;
        C7324 c7324 = this.f30009;
        int i2 = c7324.f24340;
        int i3 = c11910.f39981;
        if (i3 >= 0) {
            iM22610 = m22609(i3, i, i2, charSequence);
        } else {
            int i4 = c11910.f39984;
            iM22610 = i4 >= 0 ? m22610(i4, i, i2, c11910.f39994, charSequence) : m22613(i, i2, charSequence, c11910.f39983);
        }
        if (iM22610 < 0) {
            return -1;
        }
        if (c7324.f24328 != 1 || iM22610 == c7324.f24340) {
            return iM22610;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m22647(int i) {
        C7324 c7324 = this.f30009;
        int[] iArr = c7324.f24332;
        iArr[0] = c7324.f24322;
        c7324.m19581(i);
        iArr[1] = i;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private boolean m22605(int i, CharSequence charSequence) {
        C6618 c6618 = this.f30017;
        int i2 = c6618.f22299;
        int[] iArr = c6618.f22303;
        Object[] objArr = c6618.f22310;
        C7324 c7324 = this.f30009;
        int i3 = c7324.f24340;
        while (true) {
            if (c7324.m19558()) {
                this.f30007 = true;
                return false;
            }
            int i4 = iArr[i2];
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 == 3) {
                        int[] iArr2 = (int[]) objArr[iArr[i2 + 2]];
                        int i5 = 0;
                        while (i5 < iArr2.length) {
                            if (i >= i3) {
                                c7324.f24346 = true;
                                return false;
                            }
                            int i6 = i + 1;
                            if (iArr2[i5] == charSequence.charAt(i)) {
                                if (c7324.m19558()) {
                                    this.f30007 = true;
                                    return false;
                                }
                                i5++;
                                i = i6;
                            }
                        }
                        i2 = iArr[i2 + 1];
                    } else if (i4 == 4) {
                        InterfaceC13717 interfaceC13717 = (InterfaceC13717) objArr[iArr[i2 + 2]];
                        int i7 = i;
                        while (i7 < i3 && interfaceC13717.mo1813(charSequence.charAt(i7))) {
                            i7++;
                            if (c7324.m19558()) {
                                this.f30007 = true;
                                return false;
                            }
                        }
                        if (i7 >= i3) {
                            c7324.f24346 = true;
                        }
                        if (i7 - i >= iArr[i2 + 3]) {
                            i = i7;
                            i2 = iArr[i2 + 1];
                        }
                    } else {
                        if (i4 == 7) {
                            m22668(iArr[i2 + 2], i);
                        } else if (i4 == 8) {
                            int iM22640 = m22640(iArr[i2 + 2]);
                            if (iM22640 < 0) {
                                c7324.m19581(i);
                                return true;
                            }
                            int i8 = iArr[i2 + 3];
                            if (i8 != 0) {
                                m22642(i8, iM22640);
                                m22642(i8 + 1, i);
                            }
                        } else if (i4 == 11) {
                            continue;
                        } else if (i4 == 16) {
                            int i9 = i2 + 2;
                            if (C15792.m37549(iArr[i9], iArr[i2 + 3] != 0, c7324, i, charSequence)) {
                                if (iArr[i9] == 0) {
                                    m22603(Integer.MIN_VALUE, i);
                                }
                            }
                        } else if (i4 == 28 || i4 == 29) {
                            i = C10147.m25785((int[]) objArr[iArr[i2 + 2]], iArr[i2 + 3], c7324, charSequence, i);
                            if (i == -2) {
                                this.f30007 = true;
                                return false;
                            }
                            if (i == -1) {
                            }
                        } else {
                            throw new IllegalStateException("Invalid linear regex scan opcode");
                        }
                        i2 = iArr[i2 + 1];
                    }
                } else {
                    if (i >= i3) {
                        c7324.f24346 = true;
                        return false;
                    }
                    int i10 = i + 1;
                    if (((InterfaceC13717) objArr[iArr[i2 + 2]]).mo1813(charSequence.charAt(i))) {
                        i = i10;
                        i2 = iArr[i2 + 1];
                    }
                }
            } else if (c7324.f24328 != 1 || i == i3) {
                int[] iArr3 = c7324.f24332;
                iArr3[0] = c7324.f24322;
                c7324.m19581(i);
                iArr3[1] = i;
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private boolean m22643(int i, CharSequence charSequence) {
        C6618 c6618 = this.f30017;
        int i2 = c6618.f22299;
        int[] iArr = c6618.f22303;
        Object[] objArr = c6618.f22310;
        C7324 c7324 = this.f30009;
        int i3 = c7324.f24340;
        while (true) {
            if (c7324.m19558()) {
                this.f30007 = true;
                return false;
            }
            int i4 = iArr[i2];
            if (i4 != 1) {
                if (i4 != 16) {
                    if (i4 == 20) {
                        int iM22617 = m22617((C17907) objArr[iArr[i2 + 2]], charSequence, i, i3);
                        if (!this.f30007 && iM22617 >= 0) {
                            int[] iArr2 = c7324.f24332;
                            iArr2[0] = c7324.f24322;
                            c7324.m19581(iM22617);
                            iArr2[1] = iM22617;
                            return true;
                        }
                    } else if (i4 == 3) {
                        int[] iArr3 = (int[]) objArr[iArr[i2 + 2]];
                        int i5 = 0;
                        while (i5 < iArr3.length) {
                            if (i >= i3) {
                                c7324.f24346 = true;
                                return false;
                            }
                            int i6 = i + 1;
                            if (iArr3[i5] == charSequence.charAt(i)) {
                                if (c7324.m19558()) {
                                    this.f30007 = true;
                                    return false;
                                }
                                i5++;
                                i = i6;
                            }
                        }
                        i2 = iArr[i2 + 1];
                    } else if (i4 == 4) {
                        InterfaceC13717 interfaceC13717 = (InterfaceC13717) objArr[iArr[i2 + 2]];
                        int i7 = i;
                        while (i7 < i3 && interfaceC13717.mo1813(charSequence.charAt(i7))) {
                            i7++;
                            if (c7324.m19558()) {
                                this.f30007 = true;
                                return false;
                            }
                        }
                        if (i7 >= i3) {
                            c7324.f24346 = true;
                        }
                        if (i7 - i >= iArr[i2 + 3]) {
                            i = i7;
                            i2 = iArr[i2 + 1];
                        }
                    } else {
                        throw new IllegalStateException("Invalid terminal regex prefix opcode");
                    }
                    return false;
                }
                if (!C15792.m37549(iArr[i2 + 2], iArr[i2 + 3] != 0, c7324, i, charSequence)) {
                    return false;
                }
                i2 = iArr[i2 + 1];
            } else {
                if (i >= i3) {
                    c7324.f24346 = true;
                    return false;
                }
                int i8 = i + 1;
                if (!((InterfaceC13717) objArr[iArr[i2 + 2]]).mo1813(charSequence.charAt(i))) {
                    return false;
                }
                i = i8;
                i2 = iArr[i2 + 1];
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:206:0x0324  */
    /* JADX WARN: Code duplicated, block: B:209:0x0329  */
    /* JADX WARN: Code duplicated, block: B:281:0x047b  */
    /* JADX WARN: Code duplicated, block: B:284:0x0480  */
    /* JADX WARN: Code duplicated, block: B:385:0x0666 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:581:0x09a8  */
    /* JADX WARN: Code duplicated, block: B:585:0x09b2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:586:0x09b4  */
    /* JADX WARN: Code duplicated, block: B:675:0x0b37  */
    /* JADX WARN: Code duplicated, block: B:677:0x0b51  */
    /* JADX WARN: Code duplicated, block: B:680:0x0b5f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:681:0x0b61  */
    /* JADX WARN: Code duplicated, block: B:683:0x0b6d  */
    /* JADX WARN: Code duplicated, block: B:685:0x0b71  */
    /* JADX WARN: Code duplicated, block: B:689:0x0b7c  */
    /* JADX WARN: Code duplicated, block: B:692:0x0ba8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:693:0x0baa  */
    /* JADX WARN: Code duplicated, block: B:695:0x0bb6  */
    /* JADX WARN: Code duplicated, block: B:699:0x0bcb  */
    /* JADX WARN: Code duplicated, block: B:700:0x0bd5  */
    /* JADX WARN: Code duplicated, block: B:701:0x0bd9  */
    /* JADX WARN: Code duplicated, block: B:703:0x0bdc  */
    /* JADX WARN: Code duplicated, block: B:705:0x0bf5  */
    /* JADX WARN: Code duplicated, block: B:710:0x0c01  */
    /* JADX WARN: Code duplicated, block: B:717:0x0c12  */
    /* JADX WARN: Code duplicated, block: B:719:0x0c2b  */
    /* JADX WARN: Code duplicated, block: B:720:0x0c2e  */
    /* JADX WARN: Code duplicated, block: B:722:0x0c35  */
    /* JADX WARN: Code duplicated, block: B:724:0x0c38  */
    /* JADX WARN: Code duplicated, block: B:728:0x0c46  */
    /* JADX WARN: Code duplicated, block: B:729:0x0c49  */
    /* JADX WARN: Code duplicated, block: B:731:0x0c4c  */
    /* JADX WARN: Code duplicated, block: B:732:0x0c59  */
    /* JADX WARN: Code duplicated, block: B:734:0x0c5c  */
    /* JADX WARN: Code duplicated, block: B:737:0x0c67  */
    /* JADX WARN: Code duplicated, block: B:739:0x0c6a  */
    /* JADX WARN: Code duplicated, block: B:73:0x012d  */
    /* JADX WARN: Code duplicated, block: B:741:0x0c89  */
    /* JADX WARN: Code duplicated, block: B:743:0x0c8e  */
    /* JADX WARN: Code duplicated, block: B:74:0x012f  */
    /* JADX WARN: Code duplicated, block: B:755:0x035e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:758:0x04e3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:767:0x04e3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:768:0x066a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:786:0x0b32 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:787:0x0c43 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:788:0x0b77 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:789:0x0c43 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:790:0x0bfd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:791:0x0c43 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:834:0x0c0a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:835:0x0b64 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:836:0x0bad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:837:0x0bbb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:838:0x0c0f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:841:0x0c07 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:842:? A[PHI: r1 r3 r6 r15 r17 r18 r22 r23
      PHI (r1v7 l.ۡ۟ۨ) = 
      (r1v3 l.ۡ۟ۨ)
      (r1v3 l.ۡ۟ۨ)
      (r1v11 l.ۡ۟ۨ)
      (r1v11 l.ۡ۟ۨ)
      (r1v11 l.ۡ۟ۨ)
      (r1v12 l.ۡ۟ۨ)
      (r1v12 l.ۡ۟ۨ)
      (r1v13 l.ۡ۟ۨ)
      (r1v13 l.ۡ۟ۨ)
      (r1v13 l.ۡ۟ۨ)
      (r1v14 l.ۡ۟ۨ)
      (r1v14 l.ۡ۟ۨ)
      (r1v15 l.ۡ۟ۨ)
      (r1v16 l.ۡ۟ۨ)
      (r1v21 l.ۡ۟ۨ)
      (r1v28 l.ۡ۟ۨ)
      (r1v54 l.ۡ۟ۨ)
      (r1v61 l.ۡ۟ۨ)
      (r1v117 l.ۡ۟ۨ)
     binds: [B:670:0x0b2c, B:667:0x0b22, B:658:0x0af2, B:656:0x0aef, B:641:0x0ab0, B:636:0x0a9c, B:634:0x0a87, B:630:0x0a7a, B:628:0x0a6a, B:625:0x0a59, B:620:0x0a46, B:621:0x0a48, B:829:0x0b2e, B:583:0x09ae, B:557:0x0956, B:526:0x08b5, B:425:0x0710, B:413:0x06db, B:319:0x0524] A[DONT_GENERATE, DONT_INLINE]
      PHI (r3v7 l.ۡ۟ۨ) = 
      (r3v2 l.ۡ۟ۨ)
      (r3v2 l.ۡ۟ۨ)
      (r3v2 l.ۡ۟ۨ)
      (r3v2 l.ۡ۟ۨ)
      (r3v2 l.ۡ۟ۨ)
      (r3v2 l.ۡ۟ۨ)
      (r3v2 l.ۡ۟ۨ)
      (r3v2 l.ۡ۟ۨ)
      (r3v2 l.ۡ۟ۨ)
      (r3v2 l.ۡ۟ۨ)
      (r3v2 l.ۡ۟ۨ)
      (r3v2 l.ۡ۟ۨ)
      (r3v2 l.ۡ۟ۨ)
      (r3v2 l.ۡ۟ۨ)
      (r3v9 l.ۡ۟ۨ)
      (r3v2 l.ۡ۟ۨ)
      (r3v2 l.ۡ۟ۨ)
      (r3v2 l.ۡ۟ۨ)
      (r3v2 l.ۡ۟ۨ)
     binds: [B:670:0x0b2c, B:667:0x0b22, B:658:0x0af2, B:656:0x0aef, B:641:0x0ab0, B:636:0x0a9c, B:634:0x0a87, B:630:0x0a7a, B:628:0x0a6a, B:625:0x0a59, B:620:0x0a46, B:621:0x0a48, B:829:0x0b2e, B:583:0x09ae, B:557:0x0956, B:526:0x08b5, B:425:0x0710, B:413:0x06db, B:319:0x0524] A[DONT_GENERATE, DONT_INLINE]
      PHI (r6v7 java.lang.CharSequence) = 
      (r6v3 java.lang.CharSequence)
      (r6v3 java.lang.CharSequence)
      (r6v8 java.lang.CharSequence)
      (r6v8 java.lang.CharSequence)
      (r6v8 java.lang.CharSequence)
      (r6v9 java.lang.CharSequence)
      (r6v9 java.lang.CharSequence)
      (r6v10 java.lang.CharSequence)
      (r6v10 java.lang.CharSequence)
      (r6v10 java.lang.CharSequence)
      (r6v11 java.lang.CharSequence)
      (r6v11 java.lang.CharSequence)
      (r6v12 java.lang.CharSequence)
      (r6v14 java.lang.CharSequence)
      (r6v15 java.lang.CharSequence)
      (r6v17 java.lang.CharSequence)
      (r6v34 java.lang.CharSequence)
      (r6v45 java.lang.CharSequence)
      (r6v60 java.lang.CharSequence)
     binds: [B:670:0x0b2c, B:667:0x0b22, B:658:0x0af2, B:656:0x0aef, B:641:0x0ab0, B:636:0x0a9c, B:634:0x0a87, B:630:0x0a7a, B:628:0x0a6a, B:625:0x0a59, B:620:0x0a46, B:621:0x0a48, B:829:0x0b2e, B:583:0x09ae, B:557:0x0956, B:526:0x08b5, B:425:0x0710, B:413:0x06db, B:319:0x0524] A[DONT_GENERATE, DONT_INLINE]
      PHI (r15v1 l.۟۟ۨ) = 
      (r15v0 l.۟۟ۨ)
      (r15v0 l.۟۟ۨ)
      (r15v6 l.۟۟ۨ)
      (r15v6 l.۟۟ۨ)
      (r15v6 l.۟۟ۨ)
      (r15v7 l.۟۟ۨ)
      (r15v7 l.۟۟ۨ)
      (r15v8 l.۟۟ۨ)
      (r15v8 l.۟۟ۨ)
      (r15v8 l.۟۟ۨ)
      (r15v9 l.۟۟ۨ)
      (r15v9 l.۟۟ۨ)
      (r15v10 l.۟۟ۨ)
      (r15v12 l.۟۟ۨ)
      (r4v2 l.۟۟ۨ)
      (r15v18 l.۟۟ۨ)
      (r15v29 l.۟۟ۨ)
      (r15v32 l.۟۟ۨ)
      (r15v51 l.۟۟ۨ)
     binds: [B:670:0x0b2c, B:667:0x0b22, B:658:0x0af2, B:656:0x0aef, B:641:0x0ab0, B:636:0x0a9c, B:634:0x0a87, B:630:0x0a7a, B:628:0x0a6a, B:625:0x0a59, B:620:0x0a46, B:621:0x0a48, B:829:0x0b2e, B:583:0x09ae, B:557:0x0956, B:526:0x08b5, B:425:0x0710, B:413:0x06db, B:319:0x0524] A[DONT_GENERATE, DONT_INLINE]
      PHI (r17v6 int) = 
      (r17v1 int)
      (r17v1 int)
      (r17v1 int)
      (r17v1 int)
      (r17v1 int)
      (r17v1 int)
      (r17v1 int)
      (r17v1 int)
      (r17v1 int)
      (r17v1 int)
      (r17v1 int)
      (r17v1 int)
      (r17v1 int)
      (r17v1 int)
      (r17v1 int)
      (r17v1 int)
      (r17v1 int)
      (r17v8 int)
      (r17v1 int)
     binds: [B:670:0x0b2c, B:667:0x0b22, B:658:0x0af2, B:656:0x0aef, B:641:0x0ab0, B:636:0x0a9c, B:634:0x0a87, B:630:0x0a7a, B:628:0x0a6a, B:625:0x0a59, B:620:0x0a46, B:621:0x0a48, B:829:0x0b2e, B:583:0x09ae, B:557:0x0956, B:526:0x08b5, B:425:0x0710, B:413:0x06db, B:319:0x0524] A[DONT_GENERATE, DONT_INLINE]
      PHI (r18v6 int) = 
      (r18v1 int)
      (r18v1 int)
      (r18v1 int)
      (r18v1 int)
      (r18v1 int)
      (r18v1 int)
      (r18v1 int)
      (r18v1 int)
      (r18v1 int)
      (r18v1 int)
      (r18v1 int)
      (r18v1 int)
      (r18v1 int)
      (r18v1 int)
      (r18v1 int)
      (r18v1 int)
      (r18v1 int)
      (r18v10 int)
      (r18v1 int)
     binds: [B:670:0x0b2c, B:667:0x0b22, B:658:0x0af2, B:656:0x0aef, B:641:0x0ab0, B:636:0x0a9c, B:634:0x0a87, B:630:0x0a7a, B:628:0x0a6a, B:625:0x0a59, B:620:0x0a46, B:621:0x0a48, B:829:0x0b2e, B:583:0x09ae, B:557:0x0956, B:526:0x08b5, B:425:0x0710, B:413:0x06db, B:319:0x0524] A[DONT_GENERATE, DONT_INLINE]
      PHI (r22v4 java.lang.Object[]) = 
      (r22v0 java.lang.Object[])
      (r22v0 java.lang.Object[])
      (r22v5 java.lang.Object[])
      (r22v5 java.lang.Object[])
      (r22v5 java.lang.Object[])
      (r22v6 java.lang.Object[])
      (r22v6 java.lang.Object[])
      (r22v7 java.lang.Object[])
      (r22v7 java.lang.Object[])
      (r22v7 java.lang.Object[])
      (r22v8 java.lang.Object[])
      (r22v8 java.lang.Object[])
      (r22v9 java.lang.Object[])
      (r22v10 java.lang.Object[])
      (r22v11 java.lang.Object[])
      (r22v13 java.lang.Object[])
      (r22v19 java.lang.Object[])
      (r22v21 java.lang.Object[])
      (r22v38 java.lang.Object[])
     binds: [B:670:0x0b2c, B:667:0x0b22, B:658:0x0af2, B:656:0x0aef, B:641:0x0ab0, B:636:0x0a9c, B:634:0x0a87, B:630:0x0a7a, B:628:0x0a6a, B:625:0x0a59, B:620:0x0a46, B:621:0x0a48, B:829:0x0b2e, B:583:0x09ae, B:557:0x0956, B:526:0x08b5, B:425:0x0710, B:413:0x06db, B:319:0x0524] A[DONT_GENERATE, DONT_INLINE]
      PHI (r23v4 int[]) = 
      (r23v0 int[])
      (r23v0 int[])
      (r23v5 int[])
      (r23v5 int[])
      (r23v5 int[])
      (r23v6 int[])
      (r23v6 int[])
      (r23v7 int[])
      (r23v7 int[])
      (r23v7 int[])
      (r23v8 int[])
      (r23v8 int[])
      (r23v9 int[])
      (r23v10 int[])
      (r23v11 int[])
      (r23v13 int[])
      (r23v19 int[])
      (r23v21 int[])
      (r23v39 int[])
     binds: [B:670:0x0b2c, B:667:0x0b22, B:658:0x0af2, B:656:0x0aef, B:641:0x0ab0, B:636:0x0a9c, B:634:0x0a87, B:630:0x0a7a, B:628:0x0a6a, B:625:0x0a59, B:620:0x0a46, B:621:0x0a48, B:829:0x0b2e, B:583:0x09ae, B:557:0x0956, B:526:0x08b5, B:425:0x0710, B:413:0x06db, B:319:0x0524] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x0522, code lost:
    
        if (l.C15792.m37551((l.C12285) r8[r7[r16 + 2]], r4, r9, r5) == false) goto L319;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x013a, code lost:
    
        if (r9 == (-1)) goto L319;
     */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean m22661(int r27, int r28, java.lang.CharSequence r29) {
        /*
            Method dump skipped, instruction units count: 3312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C8736.m22661(int, int, java.lang.CharSequence):boolean");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m22635(C12969 c12969, int i, int i2, CharSequence charSequence) {
        char cCharAt;
        int[] iArr = c12969.f43079;
        return iArr == null || iArr[i] < 0 || i2 >= this.f30009.f24340 || (cCharAt = charSequence.charAt(i2)) >= 128 || cCharAt == iArr[i];
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private C22847 m22645(int i) {
        return (C22847) this.f30017.f22310[this.f30012[i + 16]];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m22608(int i, int i2, int i3, int i4, int i5, boolean z) {
        int i6;
        m22641();
        C22847 c22847 = (C22847) this.f30017.f22310[i];
        int i7 = this.f30021;
        int[] iArr = this.f30012;
        iArr[i7] = z ? 6 : 5;
        iArr[i7 + 1] = i3;
        iArr[i7 + 2] = i4;
        iArr[i7 + 3] = i2;
        iArr[i7 + 4] = this.f30016;
        iArr[i7 + 5] = this.f30022;
        int i8 = i7 + 6;
        C7324 c7324 = this.f30009;
        iArr[i8] = (!c7324.f24331 || (!c22847.f74309 && (z || c22847.f74311 >= 0))) ? -1 : c7324.f24341.f59218.size();
        int[] iArr2 = this.f30012;
        iArr2[i7 + 12] = this.f30005;
        iArr2[i7 + 13] = 0;
        iArr2[i7 + 16] = i;
        iArr2[i7 + 17] = 0;
        iArr2[i7 + 18] = i5;
        iArr2[i7 + 19] = 0;
        iArr2[i7 + 20] = i5;
        iArr2[i7 + 21] = this.f30022;
        int i9 = i7 + 22;
        int i10 = c22847.f74311;
        int i11 = c22847.f74312;
        iArr2[i9] = i10 >= 0 ? m22640(i10) : 0;
        int[] iArr3 = this.f30012;
        int i12 = i7 + 23;
        boolean z2 = c22847.f74309;
        iArr3[i12] = z2 ? c7324.f24332[i11] : 0;
        iArr3[i7 + 24] = z2 ? c7324.f24332[i11 + 1] : 0;
        this.f30021 += 32;
        if (!z && (i6 = c22847.f74311) >= 0) {
            m22599(i6, -1);
        }
        m22621(7, 0, i4, i7, 0);
        return i7;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m22624(int i, int i2, boolean z) {
        int[] iArr = this.f30012;
        iArr[i + 17] = i2;
        iArr[i + 13] = !z ? 1 : 0;
        int i3 = this.f30022;
        iArr[i + 21] = i3;
        this.f30014[iArr[i + 4] + 3] = i3;
        this.f30005 = z ? i : iArr[i + 12];
        this.f30010 = iArr[(z ? 3 : 1) + i];
        this.f30023 = iArr[i + 2];
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    private boolean m22606(int i) {
        C22847 c22847M22645 = m22645(i);
        if (c22847M22645.f74311 < 0 && this.f30009.f24357) {
            this.f30007 = true;
            return false;
        }
        EnumC4584 enumC4584 = c22847M22645.f74307;
        if (enumC4584 == EnumC4584.GREEDY) {
            int[] iArr = this.f30012;
            iArr[i + 17] = 1;
            m22657(i, iArr[i + 2], iArr[i + 18]);
            return true;
        }
        if (enumC4584 == EnumC4584.LAZY) {
            m22624(i, 2, false);
            return true;
        }
        if (this.f30012[i + 18] < c22847M22645.f74308) {
            m22624(i, 4, true);
            return true;
        }
        m22624(i, 1, false);
        return true;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m22657(int i, int i2, int i3) {
        C22847 c22847M22645 = m22645(i);
        int[] iArr = this.f30012;
        iArr[i + 13] = 1;
        this.f30005 = iArr[i + 12];
        int i4 = c22847M22645.f74311;
        int i5 = c22847M22645.f74308;
        if (i4 < 0 && i3 >= i5) {
            m22624(i, iArr[i + 17], false);
            this.f30023 = i2;
            return;
        }
        int iM22608 = m22608(iArr[i + 16], iArr[i + 3], iArr[i + 1], i2, i3, true);
        if (i3 < i5) {
            m22624(iM22608, 5, true);
        } else {
            m22672(iM22608);
            m22624(iM22608, 9, false);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m22629(int i, boolean z) {
        int i2;
        int i3;
        C22847 c22847M22645 = m22645(i);
        int[] iArr = this.f30012;
        int i4 = i + 17;
        int i5 = iArr[i4];
        int i6 = i + 2;
        int i7 = iArr[i6];
        int i8 = i + 18;
        int i9 = iArr[i8];
        C7324 c7324 = this.f30009;
        switch (i5) {
            case 0:
                if (!z) {
                    m22602(i);
                    return false;
                }
                m22627(c22847M22645, i7, c7324.f24355);
                int[] iArr2 = this.f30012;
                iArr2[i6] = c7324.f24355;
                int i10 = i9 + 1;
                iArr2[i8] = i10;
                if (i10 >= c22847M22645.f74310) {
                    return m22606(i);
                }
                m22624(i, 0, true);
                return true;
            case 1:
            case 9:
            case 13:
                m22602(i);
                return false;
            case 2:
                if (i9 < c22847M22645.f74308) {
                    m22624(i, 3, true);
                    return true;
                }
                m22602(i);
                return false;
            case 3:
                if (!z || i7 == (i2 = c7324.f24355)) {
                    m22602(i);
                    return false;
                }
                m22627(c22847M22645, i7, i2);
                int[] iArr3 = this.f30012;
                iArr3[i6] = c7324.f24355;
                iArr3[i8] = i9 + 1;
                m22624(i, 2, false);
                return true;
            case 4:
                if (z) {
                    m22627(c22847M22645, i7, c7324.f24355);
                    int i11 = c7324.f24355;
                    if (i7 != i11) {
                        int[] iArr4 = this.f30012;
                        iArr4[i6] = i11;
                        int i12 = i9 + 1;
                        iArr4[i8] = i12;
                        if (i12 < c22847M22645.f74308) {
                            m22624(i, 4, true);
                            return true;
                        }
                    }
                }
                m22624(i, 1, false);
                return true;
            case 5:
                if (!z || (i3 = c7324.f24355) == i7 || (c22847M22645.f74311 >= 0 && i3 < i7)) {
                    if (z && c22847M22645.f74311 >= 0) {
                        iArr[i6] = c7324.f24355;
                    }
                    m22672(i);
                    m22624(i, 9, false);
                    return true;
                }
                iArr[i + 19] = i3 - i7;
                return m22653(i);
            case 6:
                if (!z) {
                    return m22600(i);
                }
                int i13 = iArr[i + 19] + i7;
                int i14 = c7324.f24355;
                if (i13 != i14) {
                    iArr[i4] = 7;
                    int i15 = c22847M22645.f74311;
                    if (i15 < 0) {
                        i7 = i14;
                    }
                    if (i15 < 0) {
                        i9++;
                    }
                    m22657(i, i7, i9);
                    return true;
                }
                return m22653(i);
            case 7:
                return m22600(i);
            case 8:
                int i16 = iArr[i + 19];
                int i17 = i7 - i16;
                m22627(c22847M22645, i17 - i16, i17);
                int[] iArr5 = this.f30012;
                iArr5[i6] = i17;
                iArr5[i8] = i9 - 1;
                return m22600(i);
            case 10:
                if (z) {
                    iArr[i6] = c7324.f24355;
                    iArr[i + 20] = i7;
                    m22624(i, 11, false);
                    return true;
                }
                if (c22847M22645.f74307 != EnumC4584.LAZY) {
                    m22624(i, 13, false);
                    return true;
                }
                m22602(i);
                return false;
            case 11:
                if (c22847M22645.f74307 == EnumC4584.GREEDY) {
                    iArr[i6] = iArr[i + 20];
                    m22624(i, 13, false);
                    return true;
                }
                m22602(i);
                return false;
            case 12:
                m22624(i, 10, true);
                return true;
            default:
                throw new IllegalStateException("Invalid quantifier continuation");
        }
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    private boolean m22653(int i) {
        int[] iArr = this.f30012;
        int i2 = i + 2;
        int i3 = iArr[i2];
        int i4 = iArr[i + 19] + i3;
        C22847 c22847M22645 = m22645(i);
        m22627(c22847M22645, i3, i4);
        int[] iArr2 = this.f30012;
        iArr2[i2] = i4;
        int i5 = i + 18;
        int i6 = iArr2[i5] + 1;
        iArr2[i5] = i6;
        if (i6 >= c22847M22645.f74308) {
            return m22600(i);
        }
        m22624(i, 6, true);
        return true;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private boolean m22600(int i) {
        int[] iArr = this.f30012;
        int i2 = iArr[i + 18];
        int i3 = iArr[i + 20];
        if (m22645(i).f74311 >= 0) {
            if (i2 <= i3) {
                m22672(i);
                m22624(i, 9, false);
                return true;
            }
        } else if (i2 < i3) {
            m22602(i);
            return false;
        }
        m22624(i, 8, false);
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m22627(C22847 c22847, int i, int i2) {
        boolean z = c22847.f74309;
        int i3 = c22847.f74312;
        if (z) {
            C7324 c7324 = this.f30009;
            if (c7324.f24331) {
                c7324.f24341.m43017(i3, i, i2, c7324.f24332);
            }
            int[] iArr = c7324.f24332;
            iArr[i3] = i;
            iArr[i3 + 1] = i2;
        }
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    private void m22672(int i) {
        C22847 c22847M22645 = m22645(i);
        if (c22847M22645.f74309) {
            int i2 = this.f30012[i + 6];
            C7324 c7324 = this.f30009;
            if (i2 >= 0) {
                c7324.f24341.m43016(i2);
            }
            int[] iArr = c7324.f24332;
            int i3 = c22847M22645.f74312;
            int[] iArr2 = this.f30012;
            iArr[i3] = iArr2[i + 23];
            iArr[i3 + 1] = iArr2[i + 24];
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m22602(int i) {
        m22619(i);
        int[] iArr = this.f30012;
        this.f30016 = iArr[i + 4];
        this.f30021 = i;
        this.f30005 = iArr[i + 12];
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m22641() {
        int[] iArr = this.f30012;
        int length = iArr.length;
        int i = this.f30021;
        if (length - i >= 32) {
            return;
        }
        int iM22614 = m22614(iArr.length, ((long) i) + 32);
        long jM22646 = m22646();
        int[] iArr2 = this.f30012;
        if ((((long) (iM22614 - iArr2.length)) * 4) + jM22646 > 33554432) {
            throw new C19319();
        }
        this.f30012 = Arrays.copyOf(iArr2, iM22614);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x002e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0034 A[RETURN] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m22639(boolean z) {
        int i = this.f30005;
        if (i < 0) {
            throw new IllegalStateException("Regex condition returned without a control scope");
        }
        int[] iArr = this.f30012;
        boolean z2 = iArr[i] >= 5;
        int i2 = iArr[(z2 ? 21 : 5) + i];
        C7324 c7324 = this.f30009;
        if (z) {
            if (!c7324.f24331) {
                C6618 c6618 = this.f30017;
                if (c6618.f22301 || c6618.f22308 || c6618.f22307) {
                    if (!m22670(i2)) {
                        return false;
                    }
                }
            } else if (!m22670(i2)) {
                return false;
            }
            if (!this.f30017.f22307) {
                for (int i3 = this.f30022 - 2; i3 >= i2; i3 -= 2) {
                    int[] iArr2 = this.f30018;
                    int i4 = iArr2[i3];
                    if (i4 < 0 && i4 != Integer.MIN_VALUE) {
                        this.f30024[~i4] = iArr2[i3 + 1];
                    }
                }
            }
            this.f30022 = i2;
        } else {
            m22667(i2);
        }
        this.f30021 = i + 32;
        int[] iArr3 = this.f30012;
        int i5 = i + 4;
        this.f30016 = iArr3[i5] + 6;
        this.f30005 = iArr3[i + 12];
        if (z2) {
            return m22629(i, z);
        }
        m22665(i);
        int[] iArr4 = this.f30012;
        int i6 = iArr4[i];
        if (z != (i6 == 0 || i6 == 2 || i6 == 4)) {
            m22619(i);
            this.f30016 = this.f30012[i5];
            this.f30021 = i;
            return false;
        }
        iArr4[i + 13] = 1;
        this.f30010 = iArr4[i + 1];
        this.f30023 = i6 == 4 ? c7324.f24355 : iArr4[i + 2];
        return true;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private boolean m22651(int i, CharSequence charSequence) {
        int[] iArr = this.f30012;
        int i2 = iArr[i];
        if (i2 >= 5) {
            if (iArr[i + 13] == 0) {
                this.f30005 = i;
                return m22639(false);
            }
            return m22629(i, false);
        }
        if (iArr[i + 13] == 0) {
            this.f30005 = i;
            if (i2 == 2 || i2 == 3) {
                int i3 = i + 10;
                int i4 = iArr[i3];
                int i5 = iArr[i + 11];
                int iM22611 = i4 - ((iArr[i + 14] == 0 || i4 <= i5) ? 1 : m22611(i4, -1, charSequence));
                if (this.f30007) {
                    return false;
                }
                if (iM22611 >= i5) {
                    int[] iArr2 = this.f30012;
                    iArr2[i3] = iM22611;
                    this.f30010 = iArr2[i + 3];
                    this.f30023 = iM22611;
                    return true;
                }
            }
            return m22639(false);
        }
        m22619(i);
        int[] iArr3 = this.f30012;
        this.f30016 = iArr3[i + 4];
        this.f30021 = i;
        this.f30005 = iArr3[i + 12];
        return false;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    private void m22665(int i) {
        int[] iArr = this.f30012;
        int i2 = iArr[i];
        C7324 c7324 = this.f30009;
        if (i2 == 0 || i2 == 1) {
            c7324.f24340 = iArr[i + 7];
        } else if (i2 == 2 || i2 == 3) {
            c7324.f24342 = iArr[i + 8];
            c7324.f24333 = iArr[i + 9];
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m22619(int i) {
        int i2;
        int[] iArr = this.f30012;
        if (iArr[i + 13] == 2) {
            return;
        }
        if (iArr[i] >= 5) {
            C22847 c22847M22645 = m22645(i);
            int[] iArr2 = this.f30012;
            if (iArr2[i] == 5 && (i2 = c22847M22645.f74311) >= 0) {
                m22599(i2, iArr2[i + 22]);
            }
            m22672(i);
        } else {
            m22665(i);
        }
        int i3 = this.f30012[i + 6];
        if (i3 >= 0) {
            this.f30009.f24341.m43016(i3);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m22611(int i, int i2, CharSequence charSequence) {
        if (i2 == 1 && i >= 0 && i < charSequence.length() && !Character.isHighSurrogate(charSequence.charAt(i))) {
            return 1;
        }
        int length = charSequence.length();
        C7324 c7324 = this.f30009;
        int i3 = 0;
        if (i2 >= 0) {
            int i4 = i;
            while (i4 < length && i3 < i2) {
                int i5 = i4 + 1;
                i4 = (Character.isHighSurrogate(charSequence.charAt(i4)) && i5 < length && Character.isLowSurrogate(charSequence.charAt(i5))) ? i4 + 2 : i5;
                if (c7324.m19558()) {
                    this.f30007 = true;
                    return i4 - i;
                }
                i3++;
            }
            return i4 - i;
        }
        int i6 = -i2;
        int i7 = i;
        while (i7 > 0 && i3 < i6) {
            int i8 = i7 - 1;
            i7 = (Character.isLowSurrogate(charSequence.charAt(i8)) && i8 > 0 && Character.isHighSurrogate(charSequence.charAt(i7 + (-2)))) ? i7 - 2 : i8;
            if (c7324.m19558()) {
                this.f30007 = true;
                return i - i7;
            }
            i3++;
        }
        return i - i7;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m22615(C10874 c10874, CharSequence charSequence, int i, int i2) {
        int i3;
        int i4 = 0;
        do {
            int i5 = c10874.f36977;
            C7324 c7324 = this.f30009;
            if (i4 < i5) {
                if (i >= i2) {
                    c7324.f24346 = true;
                } else {
                    char cCharAt = charSequence.charAt(i);
                    int[] iArr = c10874.f36974;
                    if (cCharAt >= iArr.length) {
                        int i6 = 0;
                        while (true) {
                            InterfaceC13717[] interfaceC13717Arr = c10874.f36975;
                            if (i6 >= interfaceC13717Arr.length) {
                                i3 = 0;
                                break;
                            }
                            if (interfaceC13717Arr[i6].mo1813(cCharAt)) {
                                i3 = c10874.f36973[i6];
                                break;
                            }
                            if (c7324.m19558()) {
                                this.f30007 = true;
                                return -1;
                            }
                            i6++;
                        }
                    } else {
                        i3 = iArr[cCharAt];
                    }
                    if (i3 != 0) {
                        m22642(i3, i);
                        i++;
                        m22642(i3 + 1, i);
                        i4++;
                    }
                }
            }
            if (i4 >= c10874.f36976 && (c7324.f24328 != 1 || i == i2)) {
                return i;
            }
        } while (!m22669());
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:61:0x009e  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ae  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m22617(C17907 c17907, CharSequence charSequence, int i, int i2) {
        int i3;
        int i4 = 0;
        do {
            int i5 = c17907.f56718;
            InterfaceC13717 interfaceC13717 = c17907.f56717;
            boolean z = c17907.f56716;
            boolean z2 = c17907.f56724;
            C7324 c7324 = this.f30009;
            if (i4 < i5) {
                if (i >= i2) {
                    c7324.f24346 = true;
                } else {
                    int iCharAt = z2 ? charSequence.charAt(i) : Character.codePointAt(charSequence, i);
                    int iCharCount = (z2 ? 1 : Character.charCount(iCharAt)) + i;
                    if (iCharCount > i2) {
                        c7324.f24346 = true;
                    }
                    if (iCharCount <= i2 && c17907.f56715.mo1813(iCharAt)) {
                        i = iCharCount;
                    } else if (iCharAt == c17907.f56721) {
                        int i6 = i + 1;
                        if (i6 >= i2) {
                            c7324.f24346 = true;
                        } else {
                            int iCharAt2 = z ? charSequence.charAt(i6) : Character.codePointAt(charSequence, i6);
                            int iCharCount2 = i6 + (z ? 1 : Character.charCount(iCharAt2));
                            if (iCharCount2 > i2) {
                                c7324.f24346 = true;
                            } else if (c17907.f56719.mo1813(iCharAt2)) {
                                i = iCharCount2;
                            }
                        }
                    }
                    i4++;
                }
            }
            if (i4 < c17907.f56723) {
                break;
            }
            if (interfaceC13717 == null) {
                if (i >= i2) {
                    c7324.f24346 = true;
                    return -1;
                }
                if (c17907.f56720.mo1813(charSequence.charAt(i))) {
                    break;
                }
                i3 = i + 1;
                if (c7324.f24328 == 1) {
                }
                return i3;
            }
            int i7 = i;
            while (i7 < i2 && interfaceC13717.mo1813(charSequence.charAt(i7))) {
                i7++;
                if (c7324.m19558()) {
                    this.f30007 = true;
                    return -1;
                }
            }
            if (i7 >= i2) {
                c7324.f24346 = true;
            }
            if (i7 - i < c17907.f56722) {
                break;
            }
            i = i7;
            if (i >= i2) {
                c7324.f24346 = true;
                return -1;
            }
            if (c17907.f56720.mo1813(charSequence.charAt(i))) {
                break;
            }
            i3 = i + 1;
            if (c7324.f24328 == 1 || i3 == i2) {
                return i3;
            }
        } while (!m22669());
        return -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m22616(C17223 c17223, CharSequence charSequence, int i, int i2) {
        char cCharAt;
        C12285 c12285 = c17223.f54889;
        int[][] iArr = c17223.f54887;
        C7324 c7324 = this.f30009;
        if (C15792.m37551(c12285, c7324, i, charSequence)) {
            int[] iArr2 = (i >= i2 || (cCharAt = charSequence.charAt(i)) >= 128) ? null : c17223.f54890[cCharAt];
            int length = iArr2 == null ? iArr.length : iArr2.length;
            for (int i3 = 0; i3 < length; i3++) {
                if (c7324.m19558()) {
                    this.f30007 = true;
                    return -1;
                }
                int iM22613 = m22613(i, i2, charSequence, iArr[iArr2 == null ? i3 : iArr2[i3]]);
                if (this.f30007) {
                    break;
                }
                if (iM22613 >= 0 && C15792.m37551(c17223.f54888, c7324, iM22613, charSequence) && (c7324.f24328 != 1 || iM22613 == i2)) {
                    return iM22613;
                }
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m22613(int i, int i2, CharSequence charSequence, Object obj) {
        boolean z = obj instanceof InterfaceC13717;
        C7324 c7324 = this.f30009;
        if (z) {
            InterfaceC13717 interfaceC13717 = (InterfaceC13717) obj;
            if (i >= i2) {
                c7324.f24346 = true;
                return -1;
            }
            if (interfaceC13717.mo1813(charSequence.charAt(i))) {
                return i + 1;
            }
            return -1;
        }
        int[] iArr = (int[]) obj;
        for (int i3 = 0; i3 < iArr.length; i3++) {
            int i4 = i + i3;
            if (i4 >= i2) {
                c7324.f24346 = true;
                return -1;
            }
            if (iArr[i3] != charSequence.charAt(i4)) {
                return -1;
            }
            if (c7324.m19558()) {
                this.f30007 = true;
                return -1;
            }
        }
        return i + iArr.length;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m22621(int i, int i2, int i3, int i4, int i5) {
        int[] iArr = this.f30014;
        int length = iArr.length;
        int i6 = this.f30016;
        if (length - i6 < 6) {
            int iM22614 = m22614(iArr.length, ((long) i6) + 6);
            m22649(this.f30024.length, iM22614, this.f30018.length);
            this.f30014 = Arrays.copyOf(this.f30014, iM22614);
        }
        int i7 = this.f30016;
        int[] iArr2 = this.f30014;
        iArr2[i7] = i;
        iArr2[i7 + 1] = i2;
        iArr2[i7 + 2] = i3;
        iArr2[i7 + 3] = this.f30022;
        iArr2[i7 + 4] = i4;
        iArr2[i7 + 5] = i5;
        this.f30016 = i7 + 6;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private int m22640(int i) {
        return this.f30017.f22307 ? this.f30009.f24335[i] : this.f30024[i];
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private void m22599(int i, int i2) {
        if (this.f30017.f22307) {
            this.f30009.f24335[i] = i2;
        } else {
            this.f30024[i] = i2;
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m22666(int i) {
        if ((i & 1073741824) != 0) {
            throw new C19319();
        }
        m22603(~(1073741824 | i), m22640(i));
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private void m22668(int i, int i2) {
        if (this.f30017.f22307 || this.f30016 != 0) {
            m22603(~i, m22640(i));
        }
        m22599(i, i2);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m22642(int i, int i2) {
        C7324 c7324 = this.f30009;
        m22603(i, c7324.f24332[i]);
        c7324.f24332[i] = i2;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m22603(int i, int i2) {
        int[] iArr = this.f30018;
        int length = iArr.length;
        int i3 = this.f30022;
        if (length - i3 < 2) {
            int iM22614 = m22614(iArr.length, ((long) i3) + 2);
            m22649(this.f30024.length, this.f30014.length, iM22614);
            this.f30018 = Arrays.copyOf(this.f30018, iM22614);
        }
        int[] iArr2 = this.f30018;
        int i4 = this.f30022;
        int i5 = i4 + 1;
        this.f30022 = i5;
        iArr2[i4] = i;
        this.f30022 = i4 + 2;
        iArr2[i5] = i2;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m22667(int i) {
        while (true) {
            int i2 = this.f30022;
            if (i2 <= i) {
                return;
            }
            int[] iArr = this.f30018;
            int i3 = i2 - 1;
            this.f30022 = i3;
            int i4 = iArr[i3];
            int i5 = i2 - 2;
            this.f30022 = i5;
            int i6 = iArr[i5];
            if (i6 != Integer.MIN_VALUE && i6 != -2147483647) {
                if (i6 < 0) {
                    m22599((~i6) & (-1073741825), i4);
                } else {
                    this.f30009.f24332[i6] = i4;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private boolean m22670(int i) {
        int iM22607 = this.f30021 - 32;
        int i2 = this.f30022 - 2;
        boolean z = true;
        while (i2 >= i) {
            iM22607 = m22607(iM22607, i2 + 2);
            if (!this.f30007) {
                int i3 = this.f30018[i2];
                if (i3 != -2147483647) {
                    boolean z2 = (i3 >= 0 || i3 == Integer.MIN_VALUE || ((~i3) & 1073741824) == 0) ? false : true;
                    C7324 c7324 = this.f30009;
                    if (z && i3 != Integer.MIN_VALUE && !z2) {
                        if (m22669()) {
                        }
                    } else if (c7324.m19558()) {
                        this.f30007 = true;
                        return false;
                    }
                    if (z2) {
                        m22599((~i3) & (-1073741825), this.f30018[i2 + 1]);
                        this.f30018[i2] = -2147483647;
                    } else if (this.f30017.f22307 && i3 < 0 && i3 != Integer.MIN_VALUE) {
                        this.f30018[i2] = -2147483647;
                    } else if (i3 == Integer.MIN_VALUE) {
                        int[] iArr = c7324.f24332;
                        int i4 = this.f30018[i2 + 1];
                        iArr[0] = i4;
                        c7324.f24322 = i4;
                        iArr[1] = c7324.f24355;
                    } else if (i3 > 1 && (i3 & 1) != 0) {
                        int[] iArr2 = this.f30018;
                        int i5 = iArr2[i2 + 1];
                        int i6 = iArr2[i2 - 1];
                        if (c7324.f24331 && i6 != -1 && i5 != -1) {
                            c7324.f24341.f59218.add(new C12573(i3 / 2, i6, i5));
                        }
                        i2 -= 2;
                    }
                    z = false;
                }
                i2 -= 2;
            }
            return false;
        }
        m22607(iM22607, i);
        return !this.f30007;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m22607(int i, int i2) {
        while (i >= 0) {
            int[] iArr = this.f30012;
            int i3 = i + 13;
            int i4 = iArr[i3];
            if (i4 == 0 || iArr[i + 5] < i2) {
                break;
            }
            if (i4 != 2 && iArr[i] == 6 && iArr[i + 17] == 8) {
                int i5 = iArr[i + 2];
                m22627(m22645(i), i5 - this.f30012[i + 19], i5);
            }
            this.f30012[i3] = 2;
            i -= 32;
            if (this.f30009.m19558()) {
                this.f30007 = true;
                break;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22673() {
        if (this.f30004 != 0) {
            this.f30015++;
            Arrays.fill(this.f30006, 0L);
            this.f30004 = 0;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private boolean m22660(int i, int i2) {
        if (this.f30017.f22307) {
            this.f30009.f24337[i].getClass();
        }
        long[] jArr = this.f30006;
        if (jArr.length == 0) {
            return false;
        }
        long j = (((long) i2) + 1) | (((long) i) << 32);
        return !this.f30007 && this.f30015 == this.f30015 && this.f30006[m22618(jArr, j)] == j;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m22648(int i, int i2) {
        boolean z = this.f30017.f22307;
        C7324 c7324 = this.f30009;
        if (z) {
            c7324.f24337[i].getClass();
        }
        int i3 = this.f30015;
        long j = (((long) i2) + 1) | (((long) i) << 32);
        long[] jArr = this.f30006;
        if (jArr.length != 0) {
            int iM22618 = m22618(jArr, j);
            if (this.f30007 || i3 != this.f30015 || this.f30006[iM22618] == j) {
                return;
            }
        }
        int i4 = this.f30004;
        long[] jArr2 = this.f30006;
        if (i4 >= jArr2.length / 2) {
            int iM22614 = m22614(jArr2.length, ((long) jArr2.length) + 1);
            if (((iM22614 - 1) & iM22614) == 0) {
                if ((((long) (iM22614 - this.f30006.length)) * 8) + m22646() <= 33554432) {
                    long[] jArr3 = new long[iM22614];
                    for (int i5 = 0; i5 < this.f30006.length; i5++) {
                        if (c7324.m19558()) {
                            this.f30007 = true;
                            return;
                        }
                        if (i3 != this.f30015) {
                            return;
                        }
                        long j2 = this.f30006[i5];
                        if (j2 != 0) {
                            int iM22619 = m22618(jArr3, j2);
                            if (this.f30007 || i3 != this.f30015) {
                                return;
                            } else {
                                jArr3[iM22619] = j2;
                            }
                        }
                    }
                    if (i3 != this.f30015) {
                        return;
                    } else {
                        this.f30006 = jArr3;
                    }
                }
            }
            throw new C19319();
        }
        int iM226110 = m22618(this.f30006, j);
        if (this.f30007 || i3 != this.f30015) {
            return;
        }
        this.f30006[iM226110] = j;
        this.f30004++;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m22618(long[] jArr, long j) {
        long j2 = ((j >>> 33) ^ j) * (-49064778989728563L);
        int length = jArr.length - 1;
        int i = ((int) (j2 ^ (j2 >>> 33))) & length;
        while (true) {
            long j3 = jArr[i];
            if (j3 == 0 || j3 == j) {
                break;
            }
            if (this.f30009.m19558()) {
                this.f30007 = true;
                return 0;
            }
            i = (i + 1) & length;
        }
        return i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m22631(C3795 c3795, int i, CharSequence charSequence) {
        char cCharAt;
        C7324 c7324 = this.f30009;
        if (c7324.m19558()) {
            this.f30007 = true;
            return false;
        }
        int i2 = c7324.f24340;
        C12969 c12969 = c3795.f13676;
        int[] iArr = c12969.f43078;
        if (i < i2 && (cCharAt = charSequence.charAt(i)) < 128) {
            int i3 = c12969.f43077[cCharAt];
            return i3 != 0 && m22661(iArr[Integer.numberOfTrailingZeros(i3)], i, charSequence);
        }
        m22621(3, c3795.f13677, i, 1, 0);
        return m22661(iArr[0], i, charSequence);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m22633(C10874 c10874, int i, CharSequence charSequence) {
        C7324 c7324 = this.f30009;
        if (c7324.m19558()) {
            this.f30007 = true;
            return false;
        }
        int iM22615 = m22615(c10874, charSequence, i, c7324.f24340);
        if (this.f30007 || iM22615 < 0) {
            m22667(0);
            return false;
        }
        int[] iArr = c7324.f24332;
        iArr[0] = c7324.f24322;
        c7324.m19581(iM22615);
        iArr[1] = iM22615;
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m22636(C17223 c17223, int i, CharSequence charSequence) {
        C7324 c7324 = this.f30009;
        if (c7324.m19558()) {
            this.f30007 = true;
            return false;
        }
        int iM22616 = m22616(c17223, charSequence, i, c7324.f24340);
        if (this.f30007 || iM22616 < 0) {
            return false;
        }
        int[] iArr = c7324.f24332;
        iArr[0] = c7324.f24322;
        c7324.m19581(iM22616);
        iArr[1] = iM22616;
        return true;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private int m22654(int i, int i2, int i3, InterfaceC13717 interfaceC13717, CharSequence charSequence) {
        while (i2 < i3) {
            C7324 c7324 = this.f30009;
            if (!c7324.m19558()) {
                c7324.m19552();
                String strNormalize = Normalizer.normalize(TextUtils.substring(charSequence, i, i3), Normalizer.Form.NFC);
                if (!c7324.m19568()) {
                    Thread threadCurrentThread = this.f30025;
                    if (threadCurrentThread == null) {
                        threadCurrentThread = Thread.currentThread();
                        this.f30025 = threadCurrentThread;
                    }
                    if (!c7324.m19548(threadCurrentThread)) {
                        if (strNormalize.codePointCount(0, strNormalize.length()) == 1 && interfaceC13717.mo1813(strNormalize.codePointAt(0))) {
                            return i3;
                        }
                        i3 -= Character.charCount(Character.codePointBefore(charSequence, i3));
                    }
                }
                this.f30007 = true;
                break;
            }
            this.f30007 = true;
            return -1;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private boolean m22669() {
        C7324 c7324 = this.f30009;
        if (!c7324.m19558()) {
            if (c7324.f24358) {
                return false;
            }
            Thread threadCurrentThread = this.f30025;
            if (threadCurrentThread == null) {
                threadCurrentThread = Thread.currentThread();
                this.f30025 = threadCurrentThread;
            }
            if (!c7324.m19548(threadCurrentThread)) {
                return false;
            }
        }
        this.f30007 = true;
        return true;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m22649(int i, int i2, int i3) {
        if (((((long) this.f30020.length) + ((long) this.f30012.length)) * 4) + ((((long) this.f30019.length) + ((long) this.f30006.length)) * 8) + ((((long) i) + ((long) i2) + ((long) i3)) * 4) > 33554432) {
            throw new C19319();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m22614(int i, long j) {
        if (j > 2147483639) {
            throw new C19319();
        }
        return (int) Math.min(2147483639L, Math.max(j, Math.max(64L, ((long) i) * 2)));
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private long m22646() {
        return ((((long) this.f30019.length) + ((long) this.f30006.length)) * 8) + ((((long) this.f30024.length) + ((long) this.f30014.length) + ((long) this.f30018.length) + ((long) this.f30020.length) + ((long) this.f30012.length)) * 4);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m22630(C0973 c0973, C7324 c7324, int i, CharSequence charSequence) {
        int i2 = c0973.f3807;
        Object obj = c0973.f3804;
        if (i2 != 16) {
            if (i2 == 1) {
                if (i >= c7324.f24340) {
                    c7324.f24346 = true;
                    return true;
                }
                return !((InterfaceC13717) obj).mo1813(charSequence.charAt(i));
            }
            C1056 c1056 = (C1056) obj;
            int i3 = c1056.f4897 + i;
            if (i3 >= i && i3 < c7324.f24340) {
                char cCharAt = charSequence.charAt(i3);
                if (!c1056.f4898 ? c1056.f4895.mo1813(cCharAt) : cCharAt == c1056.f4896) {
                }
            }
            return false;
        }
        boolean z = c7324.f24346;
        boolean z2 = c7324.f24338;
        if (C15792.m37549(c0973.f3805, c0973.f3806, c7324, i, charSequence)) {
            c7324.f24346 = z;
            c7324.f24338 = z2;
            return false;
        }
        return true;
    }
}
