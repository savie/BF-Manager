package l;

import android.text.TextUtils;
import java.text.Normalizer;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ܽ᩺ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: X6W3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17911 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final C5596 f58665;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long[] f58667;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f58668;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f58669;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f58670;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f58671;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C3741 f58672 = new C3741();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int[] f58673;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C23879 f58674;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int[] f58675;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f58676;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int[] f58677;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public Thread f58678;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public long[] f58679;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C20149 f58680;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int[] f58681;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f58682;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f58683;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f58684;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f58685;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f58686;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int[] f58687;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f58688;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C9093 f58689;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final int[] f58666 = new int[0];

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final long[] f58664 = new long[0];

    static {
        C25371 c25371 = new C25371();
        Arrays.fill(new int[32], -1);
        Arrays.fill(new int[9], -1);
        f58665 = c25371;
    }

    public C17911(C23879 c23879) {
        int[] iArr = f58666;
        this.f58681 = iArr;
        this.f58673 = iArr;
        this.f58677 = iArr;
        long[] jArr = f58664;
        this.f58679 = jArr;
        this.f58687 = iArr;
        this.f58667 = jArr;
        this.f58675 = iArr;
        this.f58686 = -1;
        this.f58674 = c23879;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m41817() {
        if (this.f58668) {
            throw new IllegalStateException("Regex matcher is already executing");
        }
        C9093 c9093 = this.f58674.f77338;
        if (this.f58689 != c9093) {
            this.f58680 = c9093.m24235();
            this.f58689 = c9093;
            this.f58681 = f58666;
        }
        this.f58668 = true;
        this.f58670 = false;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0068 A[Catch: all -> 0x008c, ܺ᩺ۤ -> 0x008f, TRY_LEAVE, TryCatch #10 {ܺ᩺ۤ -> 0x008f, all -> 0x008c, blocks: (B:21:0x0035, B:32:0x0056, B:34:0x005a, B:36:0x0060, B:38:0x0064, B:40:0x0068, B:22:0x003c, B:30:0x0050), top: B:98:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:42:0x006e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:89:0x0070 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x00b5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m41833(int i, CharSequence charSequence) throws Throwable {
        boolean zM41829;
        boolean zM41813;
        C23879 c23879 = this.f58674;
        int i2 = c23879.f77318;
        int i3 = c23879.f77326;
        int i4 = c23879.f77346;
        m41817();
        boolean z = true;
        try {
            try {
                zM41829 = m41829();
                try {
                    C22387 c22387 = this.f58680.f64730;
                    if (c22387 != null && m41789(c22387, c23879, i, charSequence)) {
                        m41775(i2, i3, i4, zM41829);
                        return false;
                    }
                    C20149 c20149 = this.f58680;
                    int i5 = c20149.f64733;
                    boolean z2 = c20149.f64745;
                    if (i5 == 1) {
                        boolean zM41786 = m41786(c20149.f64742, i, charSequence);
                        m41775(i2, i3, i4, zM41829);
                        return zM41786;
                    }
                    if (i5 == 2) {
                        boolean zM41780 = m41780(i, c20149.f64736, charSequence);
                        m41775(i2, i3, i4, zM41829);
                        return zM41780;
                    }
                    try {
                        if (i5 == 3) {
                            zM41813 = m41813(i, charSequence);
                        } else if (i5 != 4) {
                            zM41813 = i5 != 5 ? m41822(c20149.f64735, i, charSequence) : m41830(i, charSequence);
                        } else {
                            try {
                                zM41813 = m41787(c20149.f64743, i, charSequence);
                                z2 = true;
                            } catch (C17165 e) {
                                e = e;
                                z = true;
                                try {
                                    throw e;
                                } catch (Throwable th) {
                                    th = th;
                                    zM41829 = true;
                                    if (z) {
                                        try {
                                            m41819(false);
                                        } finally {
                                            m41775(i2, i3, i4, zM41829);
                                        }
                                    }
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                if (z) {
                                    m41819(false);
                                }
                                throw th;
                            }
                        }
                        if (zM41813) {
                            if (!c23879.f77324) {
                                C20149 c201410 = this.f58680;
                                if (c201410.f64728 || c201410.f64731 || c201410.f64732) {
                                    if (!m41805(0)) {
                                        if (z2) {
                                            try {
                                                m41819(false);
                                            } finally {
                                                m41775(i2, i3, i4, zM41829);
                                            }
                                        }
                                        return false;
                                    }
                                }
                            } else if (!m41805(0)) {
                                if (z2) {
                                    m41819(false);
                                }
                                return false;
                            }
                        }
                        if (z2) {
                            try {
                                m41819(zM41813);
                            } finally {
                                m41775(i2, i3, i4, zM41829);
                            }
                        }
                        return zM41813;
                    } catch (C17165 e2) {
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
            } catch (Throwable th5) {
                th = th5;
                z = false;
                zM41829 = false;
            }
        } catch (C17165 e3) {
            e = e3;
            z = false;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m41834(int i, CharSequence charSequence) throws Throwable {
        boolean zM41829;
        C23879 c23879 = this.f58674;
        C9093 c9093 = c23879.f77338;
        if (c9093.f29545 == c9093.f29539) {
            return m41833(i, charSequence);
        }
        int i2 = c23879.f77318;
        int i3 = c23879.f77326;
        int i4 = c23879.f77346;
        m41817();
        try {
            try {
                zM41829 = m41829();
                try {
                    C0407 c0407 = this.f58689.f29545;
                    C20149 c20149 = this.f58680;
                    C5979 c5979 = c20149.f64729;
                    if (c5979 != null) {
                        boolean zM41783 = m41783(c5979, i, charSequence);
                        m41775(i2, i3, i4, zM41829);
                        return zM41783;
                    }
                    C8348 c8348 = c20149.f64736;
                    if (c8348 == null) {
                        boolean zM41823 = m41823(c0407, i, charSequence);
                        m41775(i2, i3, i4, zM41829);
                        return zM41823;
                    }
                    if (c8348.f27345 && c0407.getClass() == C16640.class) {
                        boolean zM41806 = m41806(i, this.f58680.f64736, charSequence);
                        m41775(i2, i3, i4, zM41829);
                        return zM41806;
                    }
                    boolean zM41782 = m41782(c0407, i, charSequence);
                    m41775(i2, i3, i4, zM41829);
                    return zM41782;
                } catch (Throwable th) {
                    th = th;
                    m41775(i2, i3, i4, zM41829);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                zM41829 = false;
            }
        } catch (C17165 e) {
            try {
                throw e;
            } catch (Throwable th3) {
                th = th3;
                zM41829 = true;
                m41775(i2, i3, i4, zM41829);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private boolean m41829() {
        int length = this.f58681.length;
        int i = this.f58680.f64739;
        if (length >= i) {
            return false;
        }
        m41796(i, this.f58673.length, this.f58677.length);
        this.f58681 = new int[this.f58680.f64739];
        return m41793() > 65536;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m41775(int i, int i2, int i3, boolean z) {
        C23879 c23879 = this.f58674;
        c23879.f77318 = i;
        c23879.f77326 = i2;
        c23879.f77346 = i3;
        this.f58678 = null;
        this.f58668 = false;
        if (z) {
            int[] iArr = f58666;
            this.f58675 = iArr;
            this.f58687 = iArr;
            this.f58677 = iArr;
            this.f58673 = iArr;
            this.f58681 = iArr;
            long[] jArr = f58664;
            this.f58679 = jArr;
            this.f58667 = jArr;
            this.f58676 = 0;
            this.f58683 = 0;
            this.f58686 = -1;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private boolean m41797(int i, int i2, CharSequence charSequence) {
        C20149 c20149 = this.f58680;
        int i3 = c20149.f64733;
        if (i3 == 1) {
            return m41786(c20149.f64742, i2, charSequence);
        }
        if (i3 == 3) {
            return m41813(i2, charSequence);
        }
        if (i3 == 4) {
            return m41787(c20149.f64743, i2, charSequence);
        }
        return m41822(i, i2, charSequence);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0065 A[Catch: all -> 0x0104, TRY_LEAVE, TryCatch #0 {all -> 0x0104, blocks: (B:14:0x0032, B:16:0x0036, B:17:0x003b, B:20:0x0043, B:23:0x0049, B:25:0x0053, B:27:0x0057, B:29:0x005d, B:31:0x0061, B:33:0x0065, B:39:0x0073, B:45:0x008a, B:47:0x0090, B:51:0x0098, B:54:0x00a7, B:56:0x00ab, B:58:0x00b1, B:60:0x00b5, B:66:0x00c3, B:62:0x00b9, B:69:0x00cd, B:77:0x00dc, B:79:0x00e6, B:81:0x00ec, B:83:0x00f6, B:85:0x00fb, B:52:0x009d, B:86:0x00fe, B:42:0x0083), top: B:92:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x006b  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b9 A[Catch: all -> 0x0104, TRY_LEAVE, TryCatch #0 {all -> 0x0104, blocks: (B:14:0x0032, B:16:0x0036, B:17:0x003b, B:20:0x0043, B:23:0x0049, B:25:0x0053, B:27:0x0057, B:29:0x005d, B:31:0x0061, B:33:0x0065, B:39:0x0073, B:45:0x008a, B:47:0x0090, B:51:0x0098, B:54:0x00a7, B:56:0x00ab, B:58:0x00b1, B:60:0x00b5, B:66:0x00c3, B:62:0x00b9, B:69:0x00cd, B:77:0x00dc, B:79:0x00e6, B:81:0x00ec, B:83:0x00f6, B:85:0x00fb, B:52:0x009d, B:86:0x00fe, B:42:0x0083), top: B:92:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x00bf  */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private boolean m41823(C0407 c0407, int i, CharSequence charSequence) {
        C21028 c21028 = this.f58680.f64741;
        if (!(c0407 instanceof C16640) && c21028 == null && c0407.getClass() != C17801.class && c0407.getClass() != C6945.class) {
            throw new UnsupportedOperationException("Regex program does not support search root: ".concat(c0407.getClass().getName()));
        }
        try {
            if (c21028 != null) {
                boolean zM41825 = c21028.f67197 ? m41825(c21028, i, charSequence) : m41788(c21028, i, charSequence);
                m41819(zM41825);
                return zM41825;
            }
            boolean z = c0407 instanceof C16640;
            C23879 c23879 = this.f58674;
            if (!z) {
                boolean zM41797 = m41797(this.f58680.f64744, i, charSequence);
                if (zM41797) {
                    if (!c23879.f77324) {
                        C20149 c20149 = this.f58680;
                        if (c20149.f64728 || c20149.f64731 || c20149.f64732) {
                            if (!m41805(0)) {
                                m41819(false);
                                return false;
                            }
                        }
                    } else if (!m41805(0)) {
                        m41819(false);
                        return false;
                    }
                }
                m41819(zM41797);
                return zM41797;
            }
            int i2 = c23879.f77326 - ((C16640) c0407).f53784;
            boolean z2 = c0407 instanceof C12165;
            C23133 c23133 = c23879.f77324 ? null : this.f58680.f64737;
            while (i <= i2) {
                if (c23879.m53350()) {
                    this.f58670 = true;
                    m41819(false);
                    return false;
                }
                if (c23133 != null ? m41790(c23133, i, charSequence) : m41797(this.f58680.f64744, i, charSequence)) {
                    if (!c23879.f77324) {
                        C20149 c201410 = this.f58680;
                        if (c201410.f64728 || c201410.f64731 || c201410.f64732) {
                            if (!m41805(0)) {
                                m41819(false);
                                return false;
                            }
                        }
                    } else if (!m41805(0)) {
                        m41819(false);
                        return false;
                    }
                    c23879.f77329 = i;
                    c23879.f77327[0] = i;
                    m41819(true);
                    return true;
                }
                if (this.f58670) {
                    m41819(false);
                    return false;
                }
                if (!z2 || i == i2) {
                    i++;
                } else {
                    int i3 = i + 1;
                    i = (Character.isHighSurrogate(charSequence.charAt(i)) && i3 < charSequence.length() && Character.isLowSurrogate(charSequence.charAt(i3))) ? i + 2 : i3;
                }
            }
            c23879.f77334 = true;
            m41819(false);
            return false;
        } catch (Throwable th) {
            m41819(false);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m41819(boolean z) {
        if (!z) {
            m41809(0);
            int i = this.f58683;
            while (true) {
                i -= 32;
                if (i < 0) {
                    break;
                } else {
                    m41771(i);
                }
            }
            this.f58683 = 0;
            this.f58686 = -1;
        }
        this.f58684 = 0;
        this.f58685 = 0;
        this.f58683 = 0;
        this.f58686 = -1;
        if (m41793() > 65536) {
            int[] iArr = f58666;
            this.f58675 = iArr;
            this.f58687 = iArr;
            this.f58677 = iArr;
            this.f58673 = iArr;
            this.f58681 = iArr;
            long[] jArr = f58664;
            this.f58679 = jArr;
            this.f58667 = jArr;
            this.f58676 = 0;
            this.f58683 = 0;
            this.f58686 = -1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0092 A[PHI: r13 r14
      0x0092: PHI (r13v6 int) = (r13v2 int), (r13v7 int), (r13v7 int) binds: [B:33:0x0081, B:35:0x0088, B:37:0x008c] A[DONT_GENERATE, DONT_INLINE]
      0x0092: PHI (r14v5 int) = (r14v1 int), (r14v6 int), (r14v6 int) binds: [B:33:0x0081, B:35:0x0088, B:37:0x008c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m41788(C21028 c21028, int i, CharSequence charSequence) {
        int i2;
        int i3;
        boolean z;
        int i4;
        int iIndexOf;
        int[] iArr = c21028.f67200;
        int[] iArr2 = c21028.f67196;
        int length = iArr.length;
        C23879 c23879 = this.f58674;
        int i5 = c23879.f77326 - length;
        int i6 = length - 1;
        char c = (char) iArr[i6];
        boolean z2 = charSequence instanceof InterfaceC1181;
        boolean z3 = false;
        int i7 = 0;
        int i8 = 0;
        int iMax = i;
        while (iMax <= i5) {
            if (c23879.m53350()) {
                this.f58670 = true;
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
                        c23879.m53365();
                        int i11 = c23879.f77326;
                        int i12 = i11 - 1;
                        i3 = i6;
                        if (!(charSequence instanceof InterfaceC1181)) {
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
                            iIndexOf = ((InterfaceC1181) charSequence).indexOf(c, i9, i11);
                        }
                        if (c23879.m53374()) {
                            this.f58670 = true;
                            return false;
                        }
                        if (iIndexOf < 0) {
                            c23879.f77334 = true;
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
                    c23879.f77329 = iMax;
                    if (m41822(c21028.f67198, iMax + length, charSequence)) {
                        return m41820(iMax);
                    }
                    if (!this.f58670) {
                        iMax++;
                        break;
                    }
                    return z;
                }
                if (c23879.m53350()) {
                    this.f58670 = true;
                    return z;
                }
                char cCharAt2 = charSequence.charAt(iMax + i4);
                if (cCharAt2 != iArr[i4]) {
                    iMax += Math.max((i4 + 1) - iArr2[cCharAt2 & 127], c21028.f67199[i4]);
                    break;
                }
                i4--;
            }
            z3 = false;
            i5 = i2;
            i6 = i3;
        }
        c23879.f77334 = true;
        return false;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private boolean m41825(C21028 c21028, int i, CharSequence charSequence) {
        C23879 c23879 = this.f58674;
        int i2 = c23879.f77326 - c21028.f67195;
        int[] iArr = c21028.f67200;
        while (i <= i2) {
            if (!c23879.m53350()) {
                int iM41763 = m41763(i, iArr.length, charSequence);
                if (!this.f58670) {
                    int length = iArr.length - 1;
                    while (true) {
                        if (iM41763 <= 0) {
                            c23879.f77329 = i;
                            if (m41822(c21028.f67198, c21028.f67195 + i, charSequence)) {
                                return m41820(i);
                            }
                            if (!this.f58670) {
                                i += m41763(i, 1, charSequence);
                                if (!this.f58670) {
                                    break;
                                }
                                return false;
                            }
                            return false;
                        }
                        if (c23879.m53350()) {
                            this.f58670 = true;
                            return false;
                        }
                        int iCodePointBefore = Character.codePointBefore(charSequence, i + iM41763);
                        if (iCodePointBefore != iArr[length]) {
                            i += m41763(i, Math.max((length + 1) - c21028.f67196[iCodePointBefore & 127], c21028.f67199[length]), charSequence);
                            if (!this.f58670) {
                                break;
                            }
                            return false;
                        }
                        iM41763 -= Character.charCount(iCodePointBefore);
                        length--;
                    }
                } else {
                    return false;
                }
            } else {
                this.f58670 = true;
                return false;
            }
        }
        c23879.f77334 = true;
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0015  */
    /* JADX WARN: Code duplicated, block: B:12:0x001b A[RETURN] */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private boolean m41820(int i) {
        C23879 c23879 = this.f58674;
        if (!c23879.f77324) {
            C20149 c20149 = this.f58680;
            if (c20149.f64728 || c20149.f64731 || c20149.f64732) {
                if (!m41805(0)) {
                    return false;
                }
            }
        } else if (!m41805(0)) {
            return false;
        }
        int[] iArr = c23879.f77327;
        iArr[0] = i;
        c23879.f77329 = i;
        iArr[1] = c23879.f77335;
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m41782(C0407 c0407, int i, CharSequence charSequence) {
        C8348 c8348 = this.f58680.f64736;
        if (!(c0407 instanceof C16640)) {
            if (c0407.getClass() != C17801.class) {
                throw new UnsupportedOperationException("Regex program does not support search root: ".concat(c0407.getClass().getName()));
            }
            return m41780(i, c8348, charSequence);
        }
        C23879 c23879 = this.f58674;
        int i2 = c23879.f77326 - ((C16640) c0407).f53784;
        boolean z = c0407 instanceof C12165;
        while (i <= i2) {
            if (c23879.m53350()) {
                this.f58670 = true;
                return false;
            }
            this.f58682 = i;
            if ((i >= c23879.f77326 || c8348.m22460(charSequence.charAt(i))) && m41780(i, c8348, charSequence)) {
                c23879.f77327[0] = i;
                c23879.f77329 = i;
                return true;
            }
            if (this.f58670) {
                return false;
            }
            int i3 = this.f58682;
            if (i3 > i && (!c8348.f27357 || z || c8348.f27354)) {
                i = i3;
            }
            if (!z || i >= i2) {
                i++;
            } else {
                int i4 = i + 1;
                i = (Character.isHighSurrogate(charSequence.charAt(i)) && i4 < charSequence.length() && Character.isLowSurrogate(charSequence.charAt(i4))) ? i + 2 : i4;
            }
        }
        c23879.f77334 = true;
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m41783(C5979 c5979, int i, CharSequence charSequence) {
        C3741 c3741 = this.f58672;
        try {
            c3741.m12166(c5979, this.f58674, charSequence, i);
            while (c3741.m12167()) {
                if (m41822(c3741.f12836, c3741.f12834, charSequence)) {
                    boolean zM41820 = m41820(c3741.f12831);
                    c3741.m12165();
                    m41819(zM41820);
                    return zM41820;
                }
                if (this.f58670) {
                    c3741.m12165();
                    m41819(false);
                    return false;
                }
            }
            this.f58670 |= c3741.f12826;
            c3741.m12165();
            m41819(false);
            return false;
        } catch (Throwable th) {
            c3741.m12165();
            m41819(false);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private boolean m41806(int i, C8348 c8348, CharSequence charSequence) {
        int i2 = c8348.f27353;
        int i3 = c8348.f27365;
        C23879 c23879 = this.f58674;
        int i4 = c23879.f77326 - 1;
        EnumC9355 enumC9355 = c8348.f27360.f50966;
        boolean z = enumC9355 == EnumC9355.LAZY;
        boolean z2 = enumC9355 == EnumC9355.GREEDY;
        while (i <= i4) {
            if (c23879.m53350()) {
                this.f58670 = true;
                return false;
            }
            if (i >= c23879.f77326 || c8348.m22460(charSequence.charAt(i))) {
                if (i >= c23879.f77326) {
                    c23879.f77334 = true;
                } else {
                    if (z && charSequence.charAt(i) == i3 && (c23879.f77316 != 1 || i + 1 == c23879.f77326)) {
                        m41794(i + 1);
                        c23879.f77327[0] = i;
                        c23879.f77329 = i;
                        return true;
                    }
                    if (i >= c23879.f77326) {
                        c23879.f77334 = true;
                    } else if (charSequence.charAt(i) == i2) {
                        int i5 = i + 1;
                        m41794(i5);
                        if (i5 >= c23879.f77326) {
                            c23879.f77334 = true;
                        } else if (charSequence.charAt(i5) == i3 && (c23879.f77316 != 1 || i + 2 == c23879.f77326)) {
                            m41794(i + 2);
                            c23879.f77327[0] = i;
                            c23879.f77329 = i;
                            return true;
                        }
                        if (!z2) {
                            continue;
                        }
                    }
                    if (z) {
                        continue;
                    } else if (i >= c23879.f77326) {
                        c23879.f77334 = true;
                    } else if (charSequence.charAt(i) == i3 && (c23879.f77316 != 1 || i + 1 == c23879.f77326)) {
                        m41794(i + 1);
                        c23879.f77327[0] = i;
                        c23879.f77329 = i;
                        return true;
                    }
                }
            }
            i++;
        }
        c23879.f77334 = true;
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
    private boolean m41780(int i, C8348 c8348, CharSequence charSequence) throws Throwable {
        int iM41816;
        int i2;
        int iM41826;
        int iM41817;
        int iM41818;
        boolean z;
        int i3;
        int iM41819;
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
        int i9 = c8348.f27366;
        int i10 = c8348.f27351;
        int i11 = c8348.f27359;
        int i12 = c8348.f27353;
        int i13 = c8348.f27365;
        C15673 c15673 = c8348.f27360;
        C23879 c23879 = this.f58674;
        switch (i9) {
            case 0:
                Object obj = c8348.f27350;
                int i14 = c8348.f27356;
                boolean z7 = c8348.f27357;
                InterfaceC2885 interfaceC2885 = (InterfaceC2885) obj;
                int i15 = c23879.f77326;
                int i16 = 0;
                int iMax = i;
                while (iMax < i15) {
                    int iCodePointAt = z7 ? Character.codePointAt(charSequence, iMax) : charSequence.charAt(iMax);
                    int iCharCount = z7 ? Character.charCount(iCodePointAt) : 1;
                    if (iMax + iCharCount > i15) {
                        c23879.f77334 = true;
                        iCodePointAt = charSequence.charAt(iMax);
                        iCharCount = 1;
                    }
                    if (interfaceC2885.mo1303(iCodePointAt)) {
                        iMax += iCharCount;
                        i16++;
                        if (c23879.m53350()) {
                            this.f58670 = true;
                            return false;
                        }
                    } else {
                        if (iMax >= i15) {
                            c23879.f77334 = true;
                        }
                        this.f58682 = iMax;
                        if (i16 < i14) {
                            return false;
                        }
                        while (true) {
                            iM41816 = m41816(iMax, c8348, charSequence);
                            if (this.f58670) {
                                return false;
                            }
                            if (iM41816 >= 0) {
                                m41794(iM41816);
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
                            if (c23879.m53350()) {
                                this.f58670 = true;
                                return false;
                            }
                            i16 = i2;
                        }
                    }
                }
                if (iMax >= i15) {
                    c23879.f77334 = true;
                }
                this.f58682 = iMax;
                if (i16 < i14) {
                    return false;
                }
                while (true) {
                    iM41816 = m41816(iMax, c8348, charSequence);
                    if (this.f58670) {
                        return false;
                    }
                    if (iM41816 >= 0) {
                        m41794(iM41816);
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
                    if (c23879.m53350()) {
                        this.f58670 = true;
                        return false;
                    }
                    i16 = i2;
                }
                break;
            case 1:
                EnumC9355 enumC9355 = c15673.f50966;
                EnumC9355 enumC9356 = EnumC9355.LAZY;
                if (enumC9355 == enumC9356) {
                    int iM418110 = m41816(i, c8348, charSequence);
                    if (!this.f58670) {
                        if (iM418110 >= 0) {
                            m41794(iM418110);
                            return true;
                        }
                        iM41826 = m41826(i, c8348, charSequence);
                        if (!this.f58670) {
                            if (iM41826 >= 0) {
                                int[] iArr = c23879.f77327;
                                iArr[0] = c23879.f77329;
                                c23879.m53360(iM41826);
                                iArr[1] = iM41826;
                                iM41818 = m41816(iM41826, c8348, charSequence);
                                if (!this.f58670) {
                                    if (iM41818 >= 0) {
                                        m41794(iM41818);
                                        return true;
                                    }
                                    if (enumC9355 == EnumC9355.GREEDY) {
                                        iM41817 = m41816(i, c8348, charSequence);
                                        if (!this.f58670 && iM41817 >= 0) {
                                            m41794(iM41817);
                                            return true;
                                        }
                                    }
                                }
                            } else if (enumC9355 != enumC9356) {
                                iM41817 = m41816(i, c8348, charSequence);
                                if (!this.f58670) {
                                    m41794(iM41817);
                                    return true;
                                }
                            }
                        }
                    }
                } else {
                    iM41826 = m41826(i, c8348, charSequence);
                    if (!this.f58670) {
                        if (iM41826 >= 0) {
                            int[] iArr2 = c23879.f77327;
                            iArr2[0] = c23879.f77329;
                            c23879.m53360(iM41826);
                            iArr2[1] = iM41826;
                            iM41818 = m41816(iM41826, c8348, charSequence);
                            if (!this.f58670) {
                                if (iM41818 >= 0) {
                                    m41794(iM41818);
                                    return true;
                                }
                                if (enumC9355 == EnumC9355.GREEDY) {
                                    iM41817 = m41816(i, c8348, charSequence);
                                    if (!this.f58670) {
                                        m41794(iM41817);
                                        return true;
                                    }
                                }
                            }
                        } else if (enumC9355 != enumC9356) {
                            iM41817 = m41816(i, c8348, charSequence);
                            if (!this.f58670) {
                                m41794(iM41817);
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
                    int i19 = c15673.f50968;
                    EnumC9355 enumC9357 = c15673.f50966;
                    int i20 = c15673.f50970;
                    if (i18 < i19) {
                        int iM41827 = m41826(i17, c8348, charSequence);
                        if (!this.f58670) {
                            if (iM41827 < 0) {
                                m41778(c8348, i17, true);
                                return false;
                            }
                            m41794(iM41827);
                            i18++;
                            if (c23879.m53350()) {
                                this.f58670 = true;
                                return false;
                            }
                            i17 = iM41827;
                        }
                    } else {
                        if (c23879.f77347) {
                            this.f58670 = true;
                            return false;
                        }
                        if (enumC9357 != EnumC9355.LAZY) {
                            while (i18 < i20) {
                                int iM41828 = m41826(i17, c8348, charSequence);
                                if (!this.f58670) {
                                    if (iM41828 < 0) {
                                        if (i18 < i20) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        i3 = i17;
                                        do {
                                            iM41819 = m41816(i3, c8348, charSequence);
                                            if (this.f58670) {
                                                if (iM41819 >= 0) {
                                                    m41794(iM41819);
                                                    return true;
                                                }
                                                if (enumC9357 != EnumC9355.POSSESSIVE || i18 <= c15673.f50968) {
                                                    m41778(c8348, i17, z);
                                                    return false;
                                                }
                                                i3 -= c8348.f27361;
                                                i18--;
                                            }
                                        } while (!c23879.m53350());
                                        this.f58670 = true;
                                        return false;
                                    }
                                    m41794(iM41828);
                                    i18++;
                                    if (c23879.m53350()) {
                                        this.f58670 = true;
                                        return false;
                                    }
                                    i17 = iM41828;
                                }
                            }
                            if (i18 < i20) {
                                z = true;
                            } else {
                                z = false;
                            }
                            i3 = i17;
                            do {
                                iM41819 = m41816(i3, c8348, charSequence);
                                if (this.f58670) {
                                    if (iM41819 >= 0) {
                                        m41794(iM41819);
                                        return true;
                                    }
                                    if (enumC9357 != EnumC9355.POSSESSIVE) {
                                    }
                                    m41778(c8348, i17, z);
                                    return false;
                                }
                            } while (!c23879.m53350());
                            this.f58670 = true;
                            return false;
                        }
                        while (true) {
                            int iM418111 = m41816(i17, c8348, charSequence);
                            if (!this.f58670) {
                                if (iM418111 >= 0) {
                                    m41794(iM418111);
                                    return true;
                                }
                                if (i18 < i20) {
                                    int iM41829 = m41826(i17, c8348, charSequence);
                                    if (!this.f58670) {
                                        if (iM41829 < 0) {
                                            m41778(c8348, i17, true);
                                            return false;
                                        }
                                        m41794(iM41829);
                                        i18++;
                                        if (c23879.m53350()) {
                                            this.f58670 = true;
                                            return false;
                                        }
                                        i17 = iM41829;
                                    }
                                }
                            }
                        }
                    }
                }
                return false;
            case 3:
                boolean z8 = c23879.f77324;
                if (z8) {
                    C15673 c15674 = c15673;
                    int i21 = c15674.f50968;
                    int i22 = c15674.f50969;
                    int i23 = c15674.f50965;
                    int i24 = this.f58681[i23];
                    int[] iArr3 = c23879.f77327;
                    int i25 = iArr3[i22];
                    int i26 = iArr3[i22 + 1];
                    int size = z8 ? c23879.f77321.f38467.size() : -1;
                    this.f58681[i23] = -1;
                    try {
                        int i27 = c8348.f27359;
                        int i28 = c8348.f27351;
                        int iM41764 = i;
                        int i29 = 0;
                        while (i29 < i21) {
                            int i30 = i29;
                            int i31 = iM41764;
                            int i32 = i27;
                            C15673 c15675 = c15674;
                            int i33 = i28;
                            iM41764 = m41764(i27, i28, charSequence, i31, c23879.f77326);
                            if (iM41764 < 0) {
                                m41778(c8348, i31, true);
                                m41774(i23, i22, i24, i25, i26, size);
                                return false;
                            }
                            c23879.m53360(iM41764);
                            m41772(i22, i31, iM41764);
                            i29 = i30 + 1;
                            if (c23879.m53350()) {
                                this.f58670 = true;
                                m41774(i23, i22, i24, i25, i26, size);
                                return false;
                            }
                            c15674 = c15675;
                            i27 = i32;
                            i28 = i33;
                        }
                        int i34 = iM41764;
                        boolean zM41824 = c15674.f50966 == EnumC9355.LAZY ? m41824(c8348, i34, i21, charSequence) : m41784(c8348, i34, i21, charSequence);
                        if (!zM41824) {
                            m41774(i23, i22, i24, i25, i26, size);
                        }
                        return zM41824;
                    } catch (Throwable th3) {
                        m41774(i23, i22, i24, i25, i26, size);
                        throw th3;
                    }
                }
                int i35 = c15673.f50968;
                int i36 = c15673.f50970;
                int i37 = c23879.f77326;
                int i38 = c15673.f50965;
                int[] iArr4 = this.f58681;
                int i39 = iArr4[i38];
                boolean z9 = c15673.f50966 == EnumC9355.LAZY;
                iArr4[i38] = -1;
                int i40 = z9 ? i35 : i36;
                int i41 = i;
                boolean z10 = z9;
                C15673 c15676 = c15673;
                int i42 = 0;
                int i43 = -1;
                while (i42 < i40) {
                    if (i41 >= i37) {
                        c23879.f77334 = true;
                    } else {
                        try {
                            int i44 = i40;
                            if (charSequence.charAt(i41) == i11) {
                                int i45 = i41 + 1;
                                if (i45 >= i37) {
                                    c23879.f77334 = true;
                                } else if (charSequence.charAt(i45) == i10) {
                                    i43 = i41 + 2;
                                    i42++;
                                    if (c23879.m53350()) {
                                        this.f58670 = true;
                                        if (i43 >= 0) {
                                            c23879.m53360(i43);
                                        }
                                        this.f58681[i38] = i39;
                                        return false;
                                    }
                                    i41 = i43;
                                    i40 = i44;
                                }
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            if (i43 >= 0) {
                                c23879.m53360(i43);
                            }
                            this.f58681[i38] = i39;
                            throw th;
                        }
                    }
                    if (i42 < i35) {
                        m41778(c8348, i41, true);
                        if (i43 >= 0) {
                            c23879.m53360(i43);
                        }
                        this.f58681[i38] = i39;
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
                            c23879.f77334 = true;
                        } else {
                            i5 = i35;
                            if (iCharAt == i13) {
                                if (c23879.f77316 != 1) {
                                    if (i4 + 1 == i37) {
                                    }
                                }
                                if (i42 > 0) {
                                    int[] iArr5 = c23879.f77327;
                                    int i46 = c15676.f50969;
                                    iArr5[i46] = i4 - 2;
                                    iArr5[i46 + 1] = i4;
                                }
                                m41794(i4 + 1);
                                return true;
                            }
                            C15673 c15677 = c15676;
                            if (z10) {
                                i35 = i5;
                                if (i42 <= i35) {
                                    i41 = i41;
                                    m41778(c8348, i41, z3);
                                    if (i43 >= 0) {
                                        c23879.m53360(i43);
                                    }
                                    this.f58681[i38] = i39;
                                    return false;
                                }
                                i41 = i41;
                                i4 -= 2;
                                i42--;
                                if (c23879.m53350()) {
                                    this.f58670 = true;
                                    if (i43 >= 0) {
                                        c23879.m53360(i43);
                                    }
                                    this.f58681[i38] = i39;
                                    return false;
                                }
                            } else {
                                if (i42 >= i36) {
                                    if (i43 >= 0) {
                                        c23879.m53360(i43);
                                    }
                                    this.f58681[i38] = i39;
                                    return false;
                                }
                                if (i4 >= i37) {
                                    c23879.f77334 = true;
                                    m41778(c8348, i4, true);
                                    if (i43 >= 0) {
                                        c23879.m53360(i43);
                                    }
                                    this.f58681[i38] = i39;
                                    return false;
                                }
                                if (iCharAt != i11) {
                                    m41778(c8348, i4, true);
                                    if (i43 >= 0) {
                                        c23879.m53360(i43);
                                    }
                                    this.f58681[i38] = i39;
                                    return false;
                                }
                                i6 = i4 + 1;
                                if (i6 >= i37) {
                                    c23879.f77334 = true;
                                    m41778(c8348, i4, true);
                                    if (i43 >= 0) {
                                        c23879.m53360(i43);
                                    }
                                    this.f58681[i38] = i39;
                                    return false;
                                }
                                if (charSequence.charAt(i6) != i10) {
                                    m41778(c8348, i4, true);
                                    if (i43 >= 0) {
                                        c23879.m53360(i43);
                                    }
                                    this.f58681[i38] = i39;
                                    return false;
                                }
                                i4 += 2;
                                i42++;
                                try {
                                    if (c23879.m53350()) {
                                        this.f58670 = true;
                                        if (i4 >= 0) {
                                            c23879.m53360(i4);
                                        }
                                        this.f58681[i38] = i39;
                                        return false;
                                    }
                                    i41 = i41;
                                    i43 = i4;
                                    i35 = i5;
                                } catch (Throwable th5) {
                                    th = th5;
                                    i43 = i4;
                                    if (i43 >= 0) {
                                        c23879.m53360(i43);
                                    }
                                    this.f58681[i38] = i39;
                                    throw th;
                                }
                            }
                            z3 = z3;
                            c15676 = c15677;
                            i13 = i13;
                        }
                        C15673 c15678 = c15676;
                        if (z10) {
                            i35 = i5;
                            if (i42 <= i35) {
                                i41 = i41;
                                m41778(c8348, i41, z3);
                                if (i43 >= 0) {
                                    c23879.m53360(i43);
                                }
                                this.f58681[i38] = i39;
                                return false;
                            }
                            i41 = i41;
                            i4 -= 2;
                            i42--;
                            if (c23879.m53350()) {
                                this.f58670 = true;
                                if (i43 >= 0) {
                                    c23879.m53360(i43);
                                }
                                this.f58681[i38] = i39;
                                return false;
                            }
                        } else {
                            if (i42 >= i36) {
                                if (i43 >= 0) {
                                    c23879.m53360(i43);
                                }
                                this.f58681[i38] = i39;
                                return false;
                            }
                            if (i4 >= i37) {
                                c23879.f77334 = true;
                                m41778(c8348, i4, true);
                                if (i43 >= 0) {
                                    c23879.m53360(i43);
                                }
                                this.f58681[i38] = i39;
                                return false;
                            }
                            if (iCharAt != i11) {
                                m41778(c8348, i4, true);
                                if (i43 >= 0) {
                                    c23879.m53360(i43);
                                }
                                this.f58681[i38] = i39;
                                return false;
                            }
                            i6 = i4 + 1;
                            if (i6 >= i37) {
                                c23879.f77334 = true;
                                m41778(c8348, i4, true);
                                if (i43 >= 0) {
                                    c23879.m53360(i43);
                                }
                                this.f58681[i38] = i39;
                                return false;
                            }
                            if (charSequence.charAt(i6) != i10) {
                                m41778(c8348, i4, true);
                                if (i43 >= 0) {
                                    c23879.m53360(i43);
                                }
                                this.f58681[i38] = i39;
                                return false;
                            }
                            i4 += 2;
                            i42++;
                            if (c23879.m53350()) {
                                this.f58670 = true;
                                if (i4 >= 0) {
                                    c23879.m53360(i4);
                                }
                                this.f58681[i38] = i39;
                                return false;
                            }
                            i41 = i41;
                            i43 = i4;
                            i35 = i5;
                        }
                        z3 = z3;
                        c15676 = c15678;
                        i13 = i13;
                    }
                }
                if (i42 < i35) {
                    m41778(c8348, i41, true);
                    if (i43 >= 0) {
                        c23879.m53360(i43);
                    }
                    this.f58681[i38] = i39;
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
                        c23879.f77334 = true;
                    } else {
                        i5 = i35;
                        if (iCharAt == i13) {
                            if (c23879.f77316 != 1) {
                                if (i4 + 1 == i37) {
                                }
                            }
                            if (i42 > 0) {
                                int[] iArr6 = c23879.f77327;
                                int i47 = c15676.f50969;
                                iArr6[i47] = i4 - 2;
                                iArr6[i47 + 1] = i4;
                            }
                            m41794(i4 + 1);
                            return true;
                        }
                        C15673 c15679 = c15676;
                        if (z10) {
                            i35 = i5;
                            if (i42 <= i35) {
                                i41 = i41;
                                m41778(c8348, i41, z3);
                                if (i43 >= 0) {
                                    c23879.m53360(i43);
                                }
                                this.f58681[i38] = i39;
                                return false;
                            }
                            i41 = i41;
                            i4 -= 2;
                            i42--;
                            if (c23879.m53350()) {
                                this.f58670 = true;
                                if (i43 >= 0) {
                                    c23879.m53360(i43);
                                }
                                this.f58681[i38] = i39;
                                return false;
                            }
                        } else {
                            if (i42 >= i36) {
                                if (i43 >= 0) {
                                    c23879.m53360(i43);
                                }
                                this.f58681[i38] = i39;
                                return false;
                            }
                            if (i4 >= i37) {
                                c23879.f77334 = true;
                                m41778(c8348, i4, true);
                                if (i43 >= 0) {
                                    c23879.m53360(i43);
                                }
                                this.f58681[i38] = i39;
                                return false;
                            }
                            if (iCharAt != i11) {
                                m41778(c8348, i4, true);
                                if (i43 >= 0) {
                                    c23879.m53360(i43);
                                }
                                this.f58681[i38] = i39;
                                return false;
                            }
                            i6 = i4 + 1;
                            if (i6 >= i37) {
                                c23879.f77334 = true;
                                m41778(c8348, i4, true);
                                if (i43 >= 0) {
                                    c23879.m53360(i43);
                                }
                                this.f58681[i38] = i39;
                                return false;
                            }
                            if (charSequence.charAt(i6) != i10) {
                                m41778(c8348, i4, true);
                                if (i43 >= 0) {
                                    c23879.m53360(i43);
                                }
                                this.f58681[i38] = i39;
                                return false;
                            }
                            i4 += 2;
                            i42++;
                            if (c23879.m53350()) {
                                this.f58670 = true;
                                if (i4 >= 0) {
                                    c23879.m53360(i4);
                                }
                                this.f58681[i38] = i39;
                                return false;
                            }
                            i41 = i41;
                            i43 = i4;
                            i35 = i5;
                        }
                        z3 = z3;
                        c15676 = c15679;
                        i13 = i13;
                    }
                    C15673 c156710 = c15676;
                    if (z10) {
                        i35 = i5;
                        if (i42 <= i35) {
                            i41 = i41;
                            m41778(c8348, i41, z3);
                            if (i43 >= 0) {
                                c23879.m53360(i43);
                            }
                            this.f58681[i38] = i39;
                            return false;
                        }
                        i41 = i41;
                        i4 -= 2;
                        i42--;
                        if (c23879.m53350()) {
                            this.f58670 = true;
                            if (i43 >= 0) {
                                c23879.m53360(i43);
                            }
                            this.f58681[i38] = i39;
                            return false;
                        }
                    } else {
                        if (i42 >= i36) {
                            if (i43 >= 0) {
                                c23879.m53360(i43);
                            }
                            this.f58681[i38] = i39;
                            return false;
                        }
                        if (i4 >= i37) {
                            c23879.f77334 = true;
                            m41778(c8348, i4, true);
                            if (i43 >= 0) {
                                c23879.m53360(i43);
                            }
                            this.f58681[i38] = i39;
                            return false;
                        }
                        if (iCharAt != i11) {
                            m41778(c8348, i4, true);
                            if (i43 >= 0) {
                                c23879.m53360(i43);
                            }
                            this.f58681[i38] = i39;
                            return false;
                        }
                        i6 = i4 + 1;
                        if (i6 >= i37) {
                            c23879.f77334 = true;
                            m41778(c8348, i4, true);
                            if (i43 >= 0) {
                                c23879.m53360(i43);
                            }
                            this.f58681[i38] = i39;
                            return false;
                        }
                        if (charSequence.charAt(i6) != i10) {
                            m41778(c8348, i4, true);
                            if (i43 >= 0) {
                                c23879.m53360(i43);
                            }
                            this.f58681[i38] = i39;
                            return false;
                        }
                        i4 += 2;
                        i42++;
                        if (c23879.m53350()) {
                            this.f58670 = true;
                            if (i4 >= 0) {
                                c23879.m53360(i4);
                            }
                            this.f58681[i38] = i39;
                            return false;
                        }
                        i41 = i41;
                        i43 = i4;
                        i35 = i5;
                    }
                    z3 = z3;
                    c15676 = c156710;
                    i13 = i13;
                }
                break;
            case 4:
            default:
                return m41799(i, c8348, charSequence);
            case 5:
                if (m41814(i, c8348, charSequence)) {
                    int i48 = c23879.f77326;
                    int i49 = c15673.f50968;
                    int i50 = c15673.f50970;
                    int i51 = i + i49;
                    int i52 = i49;
                    while (i52 < i50) {
                        if (i51 >= i48) {
                            c23879.f77334 = true;
                        } else if (charSequence.charAt(i51) == i12) {
                            i51++;
                            m41794(i51);
                            i52++;
                            if (c23879.m53350()) {
                                this.f58670 = true;
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
                                c23879.f77334 = true;
                            } else if (charSequence.charAt(i7) == i13 && (c23879.f77316 != 1 || i7 + 1 == i48)) {
                                m41794(i7 + 1);
                                return true;
                            }
                            if (i52 <= i49) {
                                m41778(c8348, i51, z4);
                                return false;
                            }
                            i7--;
                            i52--;
                        } while (!c23879.m53350());
                        this.f58670 = true;
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
                            c23879.f77334 = true;
                        } else if (charSequence.charAt(i7) == i13) {
                            m41794(i7 + 1);
                            return true;
                        }
                        if (i52 <= i49) {
                            m41778(c8348, i51, z4);
                            return false;
                        }
                        i7--;
                        i52--;
                    } while (!c23879.m53350());
                    this.f58670 = true;
                    return false;
                }
                return false;
            case 6:
                if (c23879.f77324) {
                    return m41799(i, c8348, charSequence);
                }
                int i53 = c8348.f27358;
                int i54 = c15673.f50968;
                int i55 = c15673.f50970;
                int i56 = c23879.f77326;
                int i57 = 0;
                int i58 = i;
                boolean z11 = false;
                while (i57 < i54) {
                    if (i58 >= i56) {
                        c23879.f77334 = true;
                        m41778(c8348, i58, true);
                        if (i57 > 0) {
                            int[] iArr7 = c23879.f77327;
                            iArr7[i53] = i58 - 2;
                            iArr7[i53 + 1] = i58;
                            return z11;
                        }
                    } else {
                        try {
                            if (charSequence.charAt(i58) != i11) {
                                m41778(c8348, i58, true);
                                if (i57 > 0) {
                                    int[] iArr8 = c23879.f77327;
                                    iArr8[i53] = i58 - 2;
                                    iArr8[i53 + 1] = i58;
                                    return z11;
                                }
                            } else {
                                int i59 = i58 + 1;
                                if (i59 >= i56) {
                                    c23879.f77334 = true;
                                    m41778(c8348, i58, true);
                                    if (i57 > 0) {
                                        int[] iArr9 = c23879.f77327;
                                        iArr9[i53] = i58 - 2;
                                        iArr9[i53 + 1] = i58;
                                        return z11;
                                    }
                                } else if (charSequence.charAt(i59) != i10) {
                                    m41778(c8348, i58, true);
                                    if (i57 > 0) {
                                        int[] iArr10 = c23879.f77327;
                                        iArr10[i53] = i58 - 2;
                                        iArr10[i53 + 1] = i58;
                                        return z11;
                                    }
                                } else {
                                    z5 = false;
                                    i8 = i58 + 2;
                                    try {
                                        m41794(i8);
                                        i57++;
                                        if (c23879.m53350()) {
                                            this.f58670 = true;
                                            if (i57 > 0) {
                                                int[] iArr11 = c23879.f77327;
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
                                            int[] iArr12 = c23879.f77327;
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
                                int[] iArr13 = c23879.f77327;
                                iArr13[i53] = i8 - 2;
                                iArr13[i53 + 1] = i8;
                            }
                            throw th2;
                        }
                    }
                    return false;
                }
                z5 = false;
                if (c23879.f77347) {
                    this.f58670 = true;
                    if (i57 <= 0) {
                        return false;
                    }
                    int[] iArr14 = c23879.f77327;
                    iArr14[i53] = i58 - 2;
                    iArr14[i53 + 1] = i58;
                    return false;
                }
                while (i57 < i55) {
                    if (i58 >= i56) {
                        c23879.f77334 = true;
                    } else if (charSequence.charAt(i58) == i11) {
                        int i60 = i58 + 1;
                        if (i60 >= i56) {
                            c23879.f77334 = true;
                        } else if (charSequence.charAt(i60) == i10) {
                            i8 = i58 + 2;
                            m41794(i8);
                            i57++;
                            if (c23879.m53350()) {
                                this.f58670 = true;
                                if (i57 > 0) {
                                    int[] iArr15 = c23879.f77327;
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
                        c23879.f77334 = true;
                    } else if (charSequence.charAt(i58) == i13 && (c23879.f77316 != 1 || i58 + 1 == i56)) {
                        m41794(i58 + 1);
                        if (i57 > 0) {
                            int[] iArr16 = c23879.f77327;
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
                    m41778(c8348, i58, z6);
                    if (i57 > 0) {
                        return false;
                    }
                    int[] iArr17 = c23879.f77327;
                    iArr17[i53] = i58 - 2;
                    iArr17[i53 + 1] = i58;
                    return false;
                }
                if (i58 >= i56) {
                    c23879.f77334 = true;
                } else if (charSequence.charAt(i58) == i13) {
                    m41794(i58 + 1);
                    if (i57 > 0) {
                        int[] iArr18 = c23879.f77327;
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
                m41778(c8348, i58, z6);
                if (i57 > 0) {
                    return false;
                }
                int[] iArr19 = c23879.f77327;
                iArr19[i53] = i58 - 2;
                iArr19[i53 + 1] = i58;
                return false;
            case 7:
                if (m41814(i, c8348, charSequence)) {
                    int i61 = c15673.f50970;
                    int i62 = c23879.f77326;
                    int i63 = c15673.f50968;
                    int i64 = i + i63;
                    do {
                        int iCharAt2 = i64 < i62 ? charSequence.charAt(i64) : -1;
                        if (iCharAt2 < 0) {
                            c23879.f77334 = true;
                        } else if (iCharAt2 == i13 && (c23879.f77316 != 1 || i64 + 1 == i62)) {
                            m41794(i64 + 1);
                            return true;
                        }
                        if (i63 < i61) {
                            if (iCharAt2 < 0 || iCharAt2 != i12) {
                                m41778(c8348, i64, true);
                                return false;
                            }
                            i64++;
                            m41794(i64);
                            i63++;
                        }
                    } while (!c23879.m53350());
                    this.f58670 = true;
                    return false;
                }
                return false;
            case 8:
                if (m41814(i, c8348, charSequence)) {
                    int i65 = c23879.f77326;
                    int i66 = c15673.f50970;
                    int i67 = c15673.f50968;
                    int i68 = i + i67;
                    while (i67 < i66) {
                        if (i68 >= i65) {
                            c23879.f77334 = true;
                        } else if (charSequence.charAt(i68) == i12) {
                            i68++;
                            m41794(i68);
                            i67++;
                            if (c23879.m53350()) {
                                this.f58670 = true;
                                return false;
                            }
                        }
                        if (i68 >= i65) {
                            c23879.f77334 = true;
                        } else if (charSequence.charAt(i68) == i13 && (c23879.f77316 != 1 || i68 + 1 == i65)) {
                            m41794(i68 + 1);
                            return true;
                        }
                        m41778(c8348, i68, i67 < i66);
                        return false;
                    }
                    if (i68 >= i65) {
                        c23879.f77334 = true;
                    } else if (charSequence.charAt(i68) == i13) {
                        m41794(i68 + 1);
                        return true;
                    }
                    m41778(c8348, i68, i67 < i66);
                    return false;
                }
                return false;
            case 9:
                if (m41814(i, c8348, charSequence)) {
                    int i69 = c23879.f77326;
                    int i70 = c15673.f50968;
                    int i71 = c15673.f50970;
                    int i72 = i + i70;
                    int i73 = i70;
                    while (i73 < i71) {
                        if (i72 >= i69) {
                            c23879.f77334 = true;
                        } else if (charSequence.charAt(i72) == i12) {
                            i72++;
                            m41794(i72);
                            i73++;
                        }
                        if (i73 == i71) {
                            if (i72 >= i69) {
                                c23879.f77334 = true;
                            } else if (charSequence.charAt(i72) == i12 && (c23879.f77316 != 1 || i72 + 1 == i69)) {
                                m41794(i72 + 1);
                                return true;
                            }
                        }
                        if (i73 > i70 || (c23879.f77316 == 1 && i72 != i69)) {
                            m41778(c8348, i72, i73 < i71);
                            return false;
                        }
                        m41794(i72);
                        return true;
                    }
                    if (i73 == i71) {
                        if (i72 >= i69) {
                            c23879.f77334 = true;
                        } else if (charSequence.charAt(i72) == i12) {
                            m41794(i72 + 1);
                            return true;
                        }
                    }
                    if (i73 > i70) {
                    }
                    m41778(c8348, i72, i73 < i71);
                    return false;
                }
                return false;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m41774(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f58681[i] = i3;
        C23879 c23879 = this.f58674;
        int[] iArr = c23879.f77327;
        iArr[i2] = i4;
        iArr[i2 + 1] = i5;
        if (i6 >= 0) {
            c23879.f77321.m29920(i6);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private boolean m41824(C8348 c8348, int i, int i2, CharSequence charSequence) {
        C15673 c15673 = c8348.f27360;
        int i3 = c15673.f50970;
        int i4 = c15673.f50969;
        int i5 = c8348.f27359;
        int i6 = c8348.f27351;
        int i7 = c8348.f27365;
        int i8 = i;
        int i9 = i2;
        while (true) {
            C23879 c23879 = this.f58674;
            int iM41761 = m41761(i7, i8, c23879.f77326, charSequence);
            if (iM41761 >= 0 && c23879.f77316 == 1 && iM41761 != c23879.f77326) {
                iM41761 = -1;
            }
            if (iM41761 >= 0) {
                m41794(iM41761);
                return true;
            }
            if (i9 >= i3) {
                return false;
            }
            int i10 = i3;
            int iM41764 = m41764(i5, i6, charSequence, i8, c23879.f77326);
            if (iM41764 < 0) {
                m41778(c8348, i8, true);
                return false;
            }
            c23879.m53360(iM41764);
            m41772(i4, i8, iM41764);
            i9++;
            if (c23879.m53350()) {
                this.f58670 = true;
                return false;
            }
            i8 = iM41764;
            i3 = i10;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m41784(C8348 c8348, int i, int i2, CharSequence charSequence) {
        int i3;
        int i4;
        int i5;
        C15673 c15673 = c8348.f27360;
        int i6 = c15673.f50970;
        int i7 = c15673.f50969;
        int i8 = c8348.f27359;
        int i9 = c8348.f27351;
        int i10 = c8348.f27365;
        C23879 c23879 = this.f58674;
        C11944 c11944 = c23879.f77321;
        int[] iArr = c23879.f77327;
        int i11 = iArr[i7];
        int i12 = i7 + 1;
        int i13 = iArr[i12];
        int size = c23879.f77324 ? c11944.f38467.size() : -1;
        int iM41764 = i;
        int i14 = i2;
        while (true) {
            if (i14 >= i6) {
                i3 = i14;
                i4 = iM41764;
                i5 = size;
                break;
            }
            int i15 = i8;
            int i16 = i9;
            int i17 = i8;
            i3 = i14;
            int i18 = iM41764;
            int i19 = i9;
            i5 = size;
            iM41764 = m41764(i15, i16, charSequence, iM41764, c23879.f77326);
            if (iM41764 < 0) {
                i4 = i18;
                break;
            }
            c23879.m53360(iM41764);
            m41772(i7, i18, iM41764);
            i14 = i3 + 1;
            if (!c23879.m53350()) {
                size = i5;
                i8 = i17;
                i9 = i19;
            }
            this.f58670 = true;
            return false;
        }
        boolean z = i3 < i6;
        int i20 = i4;
        int i21 = i3;
        while (true) {
            if (i21 == i2) {
                if (i5 >= 0) {
                    c11944.m29920(i5);
                }
                int[] iArr2 = c23879.f77327;
                iArr2[i7] = i11;
                iArr2[i12] = i13;
            }
            int iM41761 = m41761(i10, i20, c23879.f77326, charSequence);
            if (iM41761 >= 0 && c23879.f77316 == 1 && iM41761 != c23879.f77326) {
                iM41761 = -1;
            }
            if (iM41761 >= 0) {
                if (i21 > i2) {
                    m41772(i7, i20 - 2, i20);
                }
                m41794(iM41761);
                return true;
            }
            if (i21 <= i2) {
                m41778(c8348, i4, z);
                return false;
            }
            int i22 = i20 - 2;
            i21--;
            m41772(i7, i20 - 4, i22);
            if (c23879.m53350()) {
                this.f58670 = true;
                return false;
            }
            i20 = i22;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m41764(int i, int i2, CharSequence charSequence, int i3, int i4) {
        C23879 c23879 = this.f58674;
        if (i3 >= i4) {
            c23879.f77334 = true;
            return -1;
        }
        if (charSequence.charAt(i3) != i) {
            return -1;
        }
        int i5 = i3 + 1;
        if (i5 >= i4) {
            c23879.f77334 = true;
            return -1;
        }
        if (charSequence.charAt(i5) == i2) {
            return i3 + 2;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m41772(int i, int i2, int i3) {
        C23879 c23879 = this.f58674;
        if (c23879.f77324) {
            c23879.f77321.m29921(i, i2, i3, c23879.f77327);
        }
        int[] iArr = c23879.f77327;
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
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private boolean m41799(int i, C8348 c8348, CharSequence charSequence) {
        int i2;
        int i3;
        int i4;
        EnumC9355 enumC9355;
        boolean z;
        int i5;
        boolean z2;
        int i6;
        int i7;
        int i8;
        int i9;
        int iM41816;
        C15673 c15673;
        boolean z3;
        int iM41817;
        int i10;
        int iM41826;
        C8348 c8349 = c8348;
        C23879 c23879 = this.f58674;
        C11944 c11944 = c23879.f77321;
        C15673 c15674 = c8349.f27360;
        int i11 = c8349.f27361;
        int i12 = c15674.f50965;
        EnumC9355 enumC9356 = c15674.f50966;
        int i13 = c15674.f50970;
        int i14 = c15674.f50968;
        boolean z4 = c15674.f50964;
        int i15 = c15674.f50969;
        int i16 = i12 >= 0 ? this.f58681[i12] : 0;
        int i17 = z4 ? c23879.f77327[i15] : 0;
        int i18 = z4 ? c23879.f77327[i15 + 1] : 0;
        int size = (!c23879.f77324 || (i12 >= 0 && !z4)) ? -1 : c11944.f38467.size();
        int i19 = i13;
        if (i12 >= 0) {
            this.f58681[i12] = -1;
        }
        int i20 = i;
        int i21 = 0;
        while (i21 < i14) {
            int i22 = i14;
            try {
                int iM41827 = m41826(i20, c8349, charSequence);
                if (this.f58670) {
                    if (i12 >= 0) {
                        this.f58681[i12] = i16;
                    }
                    if (z4) {
                        int[] iArr = c23879.f77327;
                        iArr[i15] = i17;
                        iArr[i15 + 1] = i18;
                    }
                    if (size < 0) {
                        return false;
                    }
                } else if (iM41827 < 0) {
                    m41778(c8349, i20, true);
                    if (i12 >= 0) {
                        this.f58681[i12] = i16;
                    }
                    if (z4) {
                        int[] iArr2 = c23879.f77327;
                        iArr2[i15] = i17;
                        iArr2[i15 + 1] = i18;
                    }
                    if (size < 0) {
                        return false;
                    }
                } else {
                    m41777(c8349, i20, iM41827);
                    m41779(c15674, i20, iM41827);
                    i21++;
                    if (c23879.m53350()) {
                        this.f58670 = true;
                        if (i12 >= 0) {
                            this.f58681[i12] = i16;
                        }
                        if (z4) {
                            int[] iArr3 = c23879.f77327;
                            iArr3[i15] = i17;
                            iArr3[i15 + 1] = i18;
                        }
                        if (size < 0) {
                            return false;
                        }
                    } else {
                        i20 = iM41827;
                        i14 = i22;
                    }
                }
                c11944.m29920(size);
                return false;
            } catch (Throwable th) {
                if (i12 >= 0) {
                    this.f58681[i12] = i16;
                }
                if (z4) {
                    int[] iArr4 = c23879.f77327;
                    iArr4[i15] = i17;
                    iArr4[i15 + 1] = i18;
                }
                if (size >= 0) {
                    c11944.m29920(size);
                }
                throw th;
            }
        }
        int i23 = i14;
        if (c15674.f50967 || i12 >= 0 || !c23879.f77347) {
            EnumC9355 enumC9357 = enumC9356;
            if (enumC9357 == EnumC9355.LAZY) {
                while (true) {
                    int iM41818 = m41816(i20, c8349, charSequence);
                    C15673 c15675 = c15674;
                    if (this.f58670) {
                        if (i12 >= 0) {
                            this.f58681[i12] = i16;
                        }
                        if (z4) {
                            int[] iArr5 = c23879.f77327;
                            iArr5[i15] = i17;
                            iArr5[i15 + 1] = i18;
                        }
                        if (size >= 0) {
                            break;
                        }
                        return false;
                    }
                    if (iM41818 >= 0) {
                        m41794(iM41818);
                        return true;
                    }
                    int i24 = i19;
                    if (i21 >= i24) {
                        if (i12 >= 0) {
                            this.f58681[i12] = i16;
                        }
                        if (z4) {
                            int[] iArr6 = c23879.f77327;
                            iArr6[i15] = i17;
                            iArr6[i15 + 1] = i18;
                        }
                        if (size >= 0) {
                            break;
                        }
                        return false;
                    }
                    int iM41828 = m41826(i20, c8349, charSequence);
                    if (this.f58670) {
                        if (i12 >= 0) {
                            this.f58681[i12] = i16;
                        }
                        if (z4) {
                            int[] iArr7 = c23879.f77327;
                            iArr7[i15] = i17;
                            iArr7[i15 + 1] = i18;
                        }
                        if (size >= 0) {
                            break;
                        }
                        return false;
                    }
                    if (iM41828 < 0) {
                        m41778(c8349, i20, true);
                        if (i12 >= 0) {
                            this.f58681[i12] = i16;
                        }
                        if (z4) {
                            int[] iArr8 = c23879.f77327;
                            iArr8[i15] = i17;
                            iArr8[i15 + 1] = i18;
                        }
                        if (size >= 0) {
                            break;
                        }
                        return false;
                    }
                    m41777(c8349, i20, iM41828);
                    m41779(c15675, i20, iM41828);
                    i21++;
                    if (c23879.m53350()) {
                        this.f58670 = true;
                        if (i12 >= 0) {
                            this.f58681[i12] = i16;
                        }
                        if (z4) {
                            int[] iArr9 = c23879.f77327;
                            iArr9[i15] = i17;
                            iArr9[i15 + 1] = i18;
                        }
                        if (size >= 0) {
                            break;
                        }
                        return false;
                    }
                    i19 = i24;
                    i20 = iM41828;
                    c15674 = c15675;
                }
            } else {
                C15673 c15676 = c15674;
                int i25 = i19;
                int i26 = z4 ? c23879.f77327[i15] : 0;
                int i27 = z4 ? c23879.f77327[i15 + 1] : 0;
                if (z4) {
                    i2 = i27;
                    int size2 = c23879.f77324 ? c11944.f38467.size() : -1;
                    int i28 = i26;
                    i3 = i21;
                    int i29 = size2;
                    i4 = i20;
                    while (true) {
                        if (i3 < i25) {
                            enumC9355 = enumC9357;
                            break;
                        }
                        i10 = i25;
                        enumC9355 = enumC9357;
                        iM41826 = m41826(i4, c8349, charSequence);
                        if (this.f58670) {
                            if (i12 >= 0) {
                                this.f58681[i12] = i16;
                            }
                            if (z4) {
                                int[] iArr10 = c23879.f77327;
                                iArr10[i15] = i17;
                                iArr10[i15 + 1] = i18;
                            }
                            if (size < 0) {
                                return false;
                            }
                        } else {
                            if (iM41826 < 0) {
                                i25 = i10;
                                break;
                            }
                            m41777(c8349, i4, iM41826);
                            m41779(c15676, i4, iM41826);
                            i3++;
                            if (c23879.m53350()) {
                                this.f58670 = true;
                                if (i12 >= 0) {
                                    this.f58681[i12] = i16;
                                }
                                if (z4) {
                                    int[] iArr11 = c23879.f77327;
                                    iArr11[i15] = i17;
                                    iArr11[i15 + 1] = i18;
                                }
                                if (size < 0) {
                                    return false;
                                }
                            } else {
                                i4 = iM41826;
                                enumC9357 = enumC9355;
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
                    if (enumC9355 == EnumC9355.POSSESSIVE) {
                        iM41817 = m41816(i4, c8349, charSequence);
                        if (this.f58670) {
                            if (i12 >= 0) {
                                this.f58681[i12] = i16;
                            }
                            if (z4) {
                                int[] iArr12 = c23879.f77327;
                                iArr12[i15] = i17;
                                iArr12[i15 + 1] = i18;
                            }
                            if (size < 0) {
                                return false;
                            }
                        } else {
                            if (iM41817 >= 0) {
                                m41794(iM41817);
                                return true;
                            }
                            m41778(c8349, i4, z);
                            if (i12 >= 0) {
                                this.f58681[i12] = i16;
                            }
                            if (z4) {
                                int[] iArr13 = c23879.f77327;
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
                                    c11944.m29920(i30);
                                    i29 = i30;
                                }
                                int[] iArr14 = c23879.f77327;
                                iArr14[i15] = i28;
                                iArr14[i15 + 1] = i2;
                            } else {
                                c15676 = c15676;
                            }
                            iM41816 = m41816(i6, c8349, charSequence);
                            if (this.f58670) {
                                if (i12 >= 0) {
                                    this.f58681[i12] = i16;
                                }
                                if (z4) {
                                    int[] iArr15 = c23879.f77327;
                                    iArr15[i15] = i17;
                                    iArr15[i15 + 1] = i18;
                                }
                                if (size < 0) {
                                    return false;
                                }
                            } else {
                                if (iM41816 >= 0) {
                                    if (i12 >= 0 && i7 > i9) {
                                        m41779(c15676, i6 - i11, i6);
                                    }
                                    m41794(iM41816);
                                    return true;
                                }
                                c15673 = c15676;
                                if (i7 <= i9) {
                                    m41778(c8349, i8, z2);
                                    if (i12 >= 0) {
                                        this.f58681[i12] = i16;
                                    }
                                    if (z4) {
                                        int[] iArr16 = c23879.f77327;
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
                                    m41779(c15673, i6 - i11, i6);
                                    if (c23879.m53350()) {
                                        this.f58670 = true;
                                        if (i12 >= 0) {
                                            this.f58681[i12] = i16;
                                        }
                                        if (z4) {
                                            int[] iArr17 = c23879.f77327;
                                            iArr17[i15] = i17;
                                            iArr17[i15 + 1] = i18;
                                        }
                                        if (size >= 0) {
                                            return false;
                                        }
                                        c11944.m29920(size);
                                        return false;
                                    }
                                    c8349 = c8348;
                                    z2 = z3;
                                    i4 = i8;
                                    c15676 = c15673;
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
                        enumC9355 = enumC9357;
                        break;
                    }
                    i10 = i25;
                    enumC9355 = enumC9357;
                    iM41826 = m41826(i4, c8349, charSequence);
                    if (this.f58670) {
                        if (i12 >= 0) {
                            this.f58681[i12] = i16;
                        }
                        if (z4) {
                            int[] iArr18 = c23879.f77327;
                            iArr18[i15] = i17;
                            iArr18[i15 + 1] = i18;
                        }
                        if (size < 0) {
                            return false;
                        }
                    } else {
                        if (iM41826 < 0) {
                            i25 = i10;
                            break;
                        }
                        m41777(c8349, i4, iM41826);
                        m41779(c15676, i4, iM41826);
                        i3++;
                        if (c23879.m53350()) {
                            this.f58670 = true;
                            if (i12 >= 0) {
                                this.f58681[i12] = i16;
                            }
                            if (z4) {
                                int[] iArr19 = c23879.f77327;
                                iArr19[i15] = i17;
                                iArr19[i15 + 1] = i18;
                            }
                            if (size < 0) {
                                return false;
                            }
                        } else {
                            i4 = iM41826;
                            enumC9357 = enumC9355;
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
                if (enumC9355 == EnumC9355.POSSESSIVE) {
                    iM41817 = m41816(i4, c8349, charSequence);
                    if (this.f58670) {
                        if (i12 >= 0) {
                            this.f58681[i12] = i16;
                        }
                        if (z4) {
                            int[] iArr110 = c23879.f77327;
                            iArr110[i15] = i17;
                            iArr110[i15 + 1] = i18;
                        }
                        if (size < 0) {
                            return false;
                        }
                    } else {
                        if (iM41817 >= 0) {
                            m41794(iM41817);
                            return true;
                        }
                        m41778(c8349, i4, z);
                        if (i12 >= 0) {
                            this.f58681[i12] = i16;
                        }
                        if (z4) {
                            int[] iArr111 = c23879.f77327;
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
                            c15676 = c15676;
                        } else {
                            c15676 = c15676;
                        }
                        iM41816 = m41816(i6, c8349, charSequence);
                        if (this.f58670) {
                            if (i12 >= 0) {
                                this.f58681[i12] = i16;
                            }
                            if (z4) {
                                int[] iArr112 = c23879.f77327;
                                iArr112[i15] = i17;
                                iArr112[i15 + 1] = i18;
                            }
                            if (size < 0) {
                                return false;
                            }
                        } else {
                            if (iM41816 >= 0) {
                                if (i12 >= 0) {
                                    m41779(c15676, i6 - i11, i6);
                                }
                                m41794(iM41816);
                                return true;
                            }
                            c15673 = c15676;
                            if (i7 <= i9) {
                                m41778(c8349, i8, z2);
                                if (i12 >= 0) {
                                    this.f58681[i12] = i16;
                                }
                                if (z4) {
                                    int[] iArr113 = c23879.f77327;
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
                                m41779(c15673, i6 - i11, i6);
                                if (c23879.m53350()) {
                                    this.f58670 = true;
                                    if (i12 >= 0) {
                                        this.f58681[i12] = i16;
                                    }
                                    if (z4) {
                                        int[] iArr114 = c23879.f77327;
                                        iArr114[i15] = i17;
                                        iArr114[i15 + 1] = i18;
                                    }
                                    if (size >= 0) {
                                        return false;
                                    }
                                    c11944.m29920(size);
                                    return false;
                                }
                                c8349 = c8348;
                                z2 = z3;
                                i4 = i8;
                                c15676 = c15673;
                            }
                        }
                    }
                }
            }
        } else {
            this.f58670 = true;
            if (i12 >= 0) {
                this.f58681[i12] = i16;
            }
            if (z4) {
                int[] iArr20 = c23879.f77327;
                iArr20[i15] = i17;
                iArr20[i15 + 1] = i18;
            }
            if (size < 0) {
                return false;
            }
        }
        c11944.m29920(size);
        return false;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private boolean m41814(int i, C8348 c8348, CharSequence charSequence) {
        int i2 = c8348.f27353;
        int i3 = c8348.f27360.f50968;
        C23879 c23879 = this.f58674;
        int i4 = c23879.f77326;
        int i5 = 0;
        while (i5 < i3) {
            if (i >= i4) {
                c23879.f77334 = true;
                m41778(c8348, i, true);
                return false;
            }
            if (charSequence.charAt(i) != i2) {
                m41778(c8348, i, true);
                return false;
            }
            i++;
            m41794(i);
            i5++;
            if (c23879.m53350()) {
                this.f58670 = true;
                return false;
            }
        }
        if (!c23879.f77347) {
            return true;
        }
        this.f58670 = true;
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m41778(C8348 c8348, int i, boolean z) {
        if (z && c8348.f27364) {
            this.f58682 = i;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m41777(C8348 c8348, int i, int i2) {
        boolean z = c8348.f27355;
        C23879 c23879 = this.f58674;
        if (z) {
            int[] iArr = c23879.f77327;
            int i3 = c8348.f27358;
            int i4 = iArr[i3];
            int i5 = i3 + 1;
            int i6 = iArr[i5];
            iArr[i3] = i;
            iArr[i5] = i2;
            if (c23879.f77324 && i4 != -1 && i6 != -1) {
                C11944 c11944 = c23879.f77321;
                c11944.f38467.add(new C6483(i3 / 2, i4, i6));
            }
        }
        c23879.m53360(i2);
        if (c8348.f27360.f50965 < 0) {
            int[] iArr2 = c23879.f77327;
            iArr2[0] = c23879.f77329;
            iArr2[1] = i2;
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private int m41826(int i, C8348 c8348, CharSequence charSequence) {
        C23879 c23879 = this.f58674;
        int i2 = c23879.f77326;
        if (!c8348.f27348) {
            int i3 = c8348.f27353;
            if (i3 >= 0) {
                return m41761(i3, i, i2, charSequence);
            }
            int i4 = c8348.f27363;
            return i4 >= 0 ? m41762(i4, i, i2, c8348.f27344, charSequence) : m41765(i, i2, charSequence, c8348.f27350);
        }
        if (i >= i2) {
            c23879.f77334 = true;
            return -1;
        }
        if (charSequence.charAt(i) != c8348.f27359) {
            return -1;
        }
        int i5 = i + 1;
        if (i5 >= i2) {
            c23879.f77334 = true;
            return -1;
        }
        if (charSequence.charAt(i5) == c8348.f27351) {
            return i + 2;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m41761(int i, int i2, int i3, CharSequence charSequence) {
        if (i2 >= i3) {
            this.f58674.f77334 = true;
            return -1;
        }
        if (charSequence.charAt(i2) == i) {
            return i2 + 1;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m41762(int i, int i2, int i3, InterfaceC2885 interfaceC2885, CharSequence charSequence) {
        if (i2 >= i3) {
            this.f58674.f77334 = true;
            return -1;
        }
        char cCharAt = charSequence.charAt(i2);
        if (cCharAt >= 128 ? interfaceC2885 == null || !interfaceC2885.mo1303(cCharAt) : cCharAt != i) {
            return -1;
        }
        return i2 + 1;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private int m41816(int i, C8348 c8348, CharSequence charSequence) {
        int iM41762;
        C23879 c23879 = this.f58674;
        int i2 = c23879.f77326;
        int i3 = c8348.f27365;
        if (i3 >= 0) {
            iM41762 = m41761(i3, i, i2, charSequence);
        } else {
            int i4 = c8348.f27349;
            iM41762 = i4 >= 0 ? m41762(i4, i, i2, c8348.f27346, charSequence) : m41765(i, i2, charSequence, c8348.f27352);
        }
        if (iM41762 < 0) {
            return -1;
        }
        if (c23879.f77316 != 1 || iM41762 == c23879.f77326) {
            return iM41762;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m41794(int i) {
        C23879 c23879 = this.f58674;
        int[] iArr = c23879.f77327;
        iArr[0] = c23879.f77329;
        c23879.m53360(i);
        iArr[1] = i;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private boolean m41830(int i, CharSequence charSequence) {
        C20149 c20149 = this.f58680;
        int i2 = c20149.f64735;
        int[] iArr = c20149.f64740;
        Object[] objArr = c20149.f64738;
        C23879 c23879 = this.f58674;
        int i3 = c23879.f77326;
        while (true) {
            if (c23879.m53350()) {
                this.f58670 = true;
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
                                c23879.f77334 = true;
                                return false;
                            }
                            int i6 = i + 1;
                            if (iArr2[i5] == charSequence.charAt(i)) {
                                if (c23879.m53350()) {
                                    this.f58670 = true;
                                    return false;
                                }
                                i5++;
                                i = i6;
                            }
                        }
                        i2 = iArr[i2 + 1];
                    } else if (i4 == 4) {
                        InterfaceC2885 interfaceC2885 = (InterfaceC2885) objArr[iArr[i2 + 2]];
                        int i7 = i;
                        while (i7 < i3 && interfaceC2885.mo1303(charSequence.charAt(i7))) {
                            i7++;
                            if (c23879.m53350()) {
                                this.f58670 = true;
                                return false;
                            }
                        }
                        if (i7 >= i3) {
                            c23879.f77334 = true;
                        }
                        if (i7 - i >= iArr[i2 + 3]) {
                            i = i7;
                            i2 = iArr[i2 + 1];
                        }
                    } else {
                        if (i4 == 7) {
                            m41803(iArr[i2 + 2], i);
                        } else if (i4 == 8) {
                            int iM41810 = m41810(iArr[i2 + 2]);
                            if (iM41810 < 0) {
                                c23879.m53360(i);
                                return true;
                            }
                            int i8 = iArr[i2 + 3];
                            if (i8 != 0) {
                                m41812(i8, iM41810);
                                m41812(i8 + 1, i);
                            }
                        } else if (i4 == 11) {
                            continue;
                        } else if (i4 == 16) {
                            int i9 = i2 + 2;
                            if (C20895.m47760(iArr[i9], iArr[i2 + 3] != 0, c23879, i, charSequence)) {
                                if (iArr[i9] == 0) {
                                    m41828(Integer.MIN_VALUE, i);
                                }
                            }
                        } else if (i4 == 28 || i4 == 29) {
                            i = C16419.m38983((int[]) objArr[iArr[i2 + 2]], iArr[i2 + 3], c23879, charSequence, i);
                            if (i == -2) {
                                this.f58670 = true;
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
                        c23879.f77334 = true;
                        return false;
                    }
                    int i10 = i + 1;
                    if (((InterfaceC2885) objArr[iArr[i2 + 2]]).mo1303(charSequence.charAt(i))) {
                        i = i10;
                        i2 = iArr[i2 + 1];
                    }
                }
            } else if (c23879.f77316 != 1 || i == i3) {
                int[] iArr3 = c23879.f77327;
                iArr3[0] = c23879.f77329;
                c23879.m53360(i);
                iArr3[1] = i;
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private boolean m41813(int i, CharSequence charSequence) {
        C20149 c20149 = this.f58680;
        int i2 = c20149.f64735;
        int[] iArr = c20149.f64740;
        Object[] objArr = c20149.f64738;
        C23879 c23879 = this.f58674;
        int i3 = c23879.f77326;
        while (true) {
            if (c23879.m53350()) {
                this.f58670 = true;
                return false;
            }
            int i4 = iArr[i2];
            if (i4 != 1) {
                if (i4 != 16) {
                    if (i4 == 20) {
                        int iM41767 = m41767((C2250) objArr[iArr[i2 + 2]], charSequence, i, i3);
                        if (!this.f58670 && iM41767 >= 0) {
                            int[] iArr2 = c23879.f77327;
                            iArr2[0] = c23879.f77329;
                            c23879.m53360(iM41767);
                            iArr2[1] = iM41767;
                            return true;
                        }
                    } else if (i4 == 3) {
                        int[] iArr3 = (int[]) objArr[iArr[i2 + 2]];
                        int i5 = 0;
                        while (i5 < iArr3.length) {
                            if (i >= i3) {
                                c23879.f77334 = true;
                                return false;
                            }
                            int i6 = i + 1;
                            if (iArr3[i5] == charSequence.charAt(i)) {
                                if (c23879.m53350()) {
                                    this.f58670 = true;
                                    return false;
                                }
                                i5++;
                                i = i6;
                            }
                        }
                        i2 = iArr[i2 + 1];
                    } else if (i4 == 4) {
                        InterfaceC2885 interfaceC2885 = (InterfaceC2885) objArr[iArr[i2 + 2]];
                        int i7 = i;
                        while (i7 < i3 && interfaceC2885.mo1303(charSequence.charAt(i7))) {
                            i7++;
                            if (c23879.m53350()) {
                                this.f58670 = true;
                                return false;
                            }
                        }
                        if (i7 >= i3) {
                            c23879.f77334 = true;
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
                if (!C20895.m47760(iArr[i2 + 2], iArr[i2 + 3] != 0, c23879, i, charSequence)) {
                    return false;
                }
                i2 = iArr[i2 + 1];
            } else {
                if (i >= i3) {
                    c23879.f77334 = true;
                    return false;
                }
                int i8 = i + 1;
                if (!((InterfaceC2885) objArr[iArr[i2 + 2]]).mo1303(charSequence.charAt(i))) {
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
      PHI (r1v7 l.ܽ᩺ۤ) = 
      (r1v3 l.ܽ᩺ۤ)
      (r1v3 l.ܽ᩺ۤ)
      (r1v11 l.ܽ᩺ۤ)
      (r1v11 l.ܽ᩺ۤ)
      (r1v11 l.ܽ᩺ۤ)
      (r1v12 l.ܽ᩺ۤ)
      (r1v12 l.ܽ᩺ۤ)
      (r1v13 l.ܽ᩺ۤ)
      (r1v13 l.ܽ᩺ۤ)
      (r1v13 l.ܽ᩺ۤ)
      (r1v14 l.ܽ᩺ۤ)
      (r1v14 l.ܽ᩺ۤ)
      (r1v15 l.ܽ᩺ۤ)
      (r1v16 l.ܽ᩺ۤ)
      (r1v21 l.ܽ᩺ۤ)
      (r1v28 l.ܽ᩺ۤ)
      (r1v54 l.ܽ᩺ۤ)
      (r1v61 l.ܽ᩺ۤ)
      (r1v117 l.ܽ᩺ۤ)
     binds: [B:670:0x0b2c, B:667:0x0b22, B:658:0x0af2, B:656:0x0aef, B:641:0x0ab0, B:636:0x0a9c, B:634:0x0a87, B:630:0x0a7a, B:628:0x0a6a, B:625:0x0a59, B:620:0x0a46, B:621:0x0a48, B:829:0x0b2e, B:583:0x09ae, B:557:0x0956, B:526:0x08b5, B:425:0x0710, B:413:0x06db, B:319:0x0524] A[DONT_GENERATE, DONT_INLINE]
      PHI (r3v7 l.ܽ᩺ۤ) = 
      (r3v2 l.ܽ᩺ۤ)
      (r3v2 l.ܽ᩺ۤ)
      (r3v2 l.ܽ᩺ۤ)
      (r3v2 l.ܽ᩺ۤ)
      (r3v2 l.ܽ᩺ۤ)
      (r3v2 l.ܽ᩺ۤ)
      (r3v2 l.ܽ᩺ۤ)
      (r3v2 l.ܽ᩺ۤ)
      (r3v2 l.ܽ᩺ۤ)
      (r3v2 l.ܽ᩺ۤ)
      (r3v2 l.ܽ᩺ۤ)
      (r3v2 l.ܽ᩺ۤ)
      (r3v2 l.ܽ᩺ۤ)
      (r3v2 l.ܽ᩺ۤ)
      (r3v9 l.ܽ᩺ۤ)
      (r3v2 l.ܽ᩺ۤ)
      (r3v2 l.ܽ᩺ۤ)
      (r3v2 l.ܽ᩺ۤ)
      (r3v2 l.ܽ᩺ۤ)
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
      PHI (r15v1 l.᩹᩺ۤ) = 
      (r15v0 l.᩹᩺ۤ)
      (r15v0 l.᩹᩺ۤ)
      (r15v6 l.᩹᩺ۤ)
      (r15v6 l.᩹᩺ۤ)
      (r15v6 l.᩹᩺ۤ)
      (r15v7 l.᩹᩺ۤ)
      (r15v7 l.᩹᩺ۤ)
      (r15v8 l.᩹᩺ۤ)
      (r15v8 l.᩹᩺ۤ)
      (r15v8 l.᩹᩺ۤ)
      (r15v9 l.᩹᩺ۤ)
      (r15v9 l.᩹᩺ۤ)
      (r15v10 l.᩹᩺ۤ)
      (r15v12 l.᩹᩺ۤ)
      (r4v2 l.᩹᩺ۤ)
      (r15v18 l.᩹᩺ۤ)
      (r15v29 l.᩹᩺ۤ)
      (r15v32 l.᩹᩺ۤ)
      (r15v51 l.᩹᩺ۤ)
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
    
        if (l.C20895.m47762((l.C3874) r8[r7[r16 + 2]], r4, r9, r5) == false) goto L319;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x013a, code lost:
    
        if (r9 == (-1)) goto L319;
     */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean m41822(int r27, int r28, java.lang.CharSequence r29) {
        /*
            Method dump skipped, instruction units count: 3312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17911.m41822(int, int, java.lang.CharSequence):boolean");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m41785(C11198 c11198, int i, int i2, CharSequence charSequence) {
        char cCharAt;
        int[] iArr = c11198.f35335;
        return iArr == null || iArr[i] < 0 || i2 >= this.f58674.f77326 || (cCharAt = charSequence.charAt(i2)) >= 128 || cCharAt == iArr[i];
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private C15673 m41800(int i) {
        return (C15673) this.f58680.f64738[this.f58675[i + 16]];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m41760(int i, int i2, int i3, int i4, int i5, boolean z) {
        int i6;
        m41811();
        C15673 c15673 = (C15673) this.f58680.f64738[i];
        int i7 = this.f58683;
        int[] iArr = this.f58675;
        iArr[i7] = z ? 6 : 5;
        iArr[i7 + 1] = i3;
        iArr[i7 + 2] = i4;
        iArr[i7 + 3] = i2;
        iArr[i7 + 4] = this.f58685;
        iArr[i7 + 5] = this.f58684;
        int i8 = i7 + 6;
        C23879 c23879 = this.f58674;
        iArr[i8] = (!c23879.f77324 || (!c15673.f50964 && (z || c15673.f50965 >= 0))) ? -1 : c23879.f77321.f38467.size();
        int[] iArr2 = this.f58675;
        iArr2[i7 + 12] = this.f58686;
        iArr2[i7 + 13] = 0;
        iArr2[i7 + 16] = i;
        iArr2[i7 + 17] = 0;
        iArr2[i7 + 18] = i5;
        iArr2[i7 + 19] = 0;
        iArr2[i7 + 20] = i5;
        iArr2[i7 + 21] = this.f58684;
        int i9 = i7 + 22;
        int i10 = c15673.f50965;
        int i11 = c15673.f50969;
        iArr2[i9] = i10 >= 0 ? m41810(i10) : 0;
        int[] iArr3 = this.f58675;
        int i12 = i7 + 23;
        boolean z2 = c15673.f50964;
        iArr3[i12] = z2 ? c23879.f77327[i11] : 0;
        iArr3[i7 + 24] = z2 ? c23879.f77327[i11 + 1] : 0;
        this.f58683 += 32;
        if (!z && (i6 = c15673.f50965) >= 0) {
            m41801(i6, -1);
        }
        m41773(7, 0, i4, i7, 0);
        return i7;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m41776(int i, int i2, boolean z) {
        int[] iArr = this.f58675;
        iArr[i + 17] = i2;
        iArr[i + 13] = !z ? 1 : 0;
        int i3 = this.f58684;
        iArr[i + 21] = i3;
        this.f58673[iArr[i + 4] + 3] = i3;
        this.f58686 = z ? i : iArr[i + 12];
        this.f58688 = iArr[(z ? 3 : 1) + i];
        this.f58669 = iArr[i + 2];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m41758(int i) {
        C15673 c15673M41800 = m41800(i);
        if (c15673M41800.f50965 < 0 && this.f58674.f77347) {
            this.f58670 = true;
            return false;
        }
        EnumC9355 enumC9355 = c15673M41800.f50966;
        if (enumC9355 == EnumC9355.GREEDY) {
            int[] iArr = this.f58675;
            iArr[i + 17] = 1;
            m41818(i, iArr[i + 2], iArr[i + 18]);
            return true;
        }
        if (enumC9355 == EnumC9355.LAZY) {
            m41776(i, 2, false);
            return true;
        }
        if (this.f58675[i + 18] < c15673M41800.f50970) {
            m41776(i, 4, true);
            return true;
        }
        m41776(i, 1, false);
        return true;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m41818(int i, int i2, int i3) {
        C15673 c15673M41800 = m41800(i);
        int[] iArr = this.f58675;
        iArr[i + 13] = 1;
        this.f58686 = iArr[i + 12];
        int i4 = c15673M41800.f50965;
        int i5 = c15673M41800.f50970;
        if (i4 < 0 && i3 >= i5) {
            m41776(i, iArr[i + 17], false);
            this.f58669 = i2;
            return;
        }
        int iM41760 = m41760(iArr[i + 16], iArr[i + 3], iArr[i + 1], i2, i3, true);
        if (i3 < i5) {
            m41776(iM41760, 5, true);
        } else {
            m41831(iM41760);
            m41776(iM41760, 9, false);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m41781(int i, boolean z) {
        int i2;
        int i3;
        C15673 c15673M41800 = m41800(i);
        int[] iArr = this.f58675;
        int i4 = i + 17;
        int i5 = iArr[i4];
        int i6 = i + 2;
        int i7 = iArr[i6];
        int i8 = i + 18;
        int i9 = iArr[i8];
        C23879 c23879 = this.f58674;
        switch (i5) {
            case 0:
                if (!z) {
                    m41827(i);
                    return false;
                }
                m41779(c15673M41800, i7, c23879.f77335);
                int[] iArr2 = this.f58675;
                iArr2[i6] = c23879.f77335;
                int i10 = i9 + 1;
                iArr2[i8] = i10;
                if (i10 >= c15673M41800.f50968) {
                    return m41758(i);
                }
                m41776(i, 0, true);
                return true;
            case 1:
            case 9:
            case 13:
                m41827(i);
                return false;
            case 2:
                if (i9 < c15673M41800.f50970) {
                    m41776(i, 3, true);
                    return true;
                }
                m41827(i);
                return false;
            case 3:
                if (!z || i7 == (i2 = c23879.f77335)) {
                    m41827(i);
                    return false;
                }
                m41779(c15673M41800, i7, i2);
                int[] iArr3 = this.f58675;
                iArr3[i6] = c23879.f77335;
                iArr3[i8] = i9 + 1;
                m41776(i, 2, false);
                return true;
            case 4:
                if (z) {
                    m41779(c15673M41800, i7, c23879.f77335);
                    int i11 = c23879.f77335;
                    if (i7 != i11) {
                        int[] iArr4 = this.f58675;
                        iArr4[i6] = i11;
                        int i12 = i9 + 1;
                        iArr4[i8] = i12;
                        if (i12 < c15673M41800.f50970) {
                            m41776(i, 4, true);
                            return true;
                        }
                    }
                }
                m41776(i, 1, false);
                return true;
            case 5:
                if (!z || (i3 = c23879.f77335) == i7 || (c15673M41800.f50965 >= 0 && i3 < i7)) {
                    if (z && c15673M41800.f50965 >= 0) {
                        iArr[i6] = c23879.f77335;
                    }
                    m41831(i);
                    m41776(i, 9, false);
                    return true;
                }
                iArr[i + 19] = i3 - i7;
                return m41792(i);
            case 6:
                if (!z) {
                    return m41802(i);
                }
                int i13 = iArr[i + 19] + i7;
                int i14 = c23879.f77335;
                if (i13 != i14) {
                    iArr[i4] = 7;
                    int i15 = c15673M41800.f50965;
                    if (i15 < 0) {
                        i7 = i14;
                    }
                    if (i15 < 0) {
                        i9++;
                    }
                    m41818(i, i7, i9);
                    return true;
                }
                return m41792(i);
            case 7:
                return m41802(i);
            case 8:
                int i16 = iArr[i + 19];
                int i17 = i7 - i16;
                m41779(c15673M41800, i17 - i16, i17);
                int[] iArr5 = this.f58675;
                iArr5[i6] = i17;
                iArr5[i8] = i9 - 1;
                return m41802(i);
            case 10:
                if (z) {
                    iArr[i6] = c23879.f77335;
                    iArr[i + 20] = i7;
                    m41776(i, 11, false);
                    return true;
                }
                if (c15673M41800.f50966 != EnumC9355.LAZY) {
                    m41776(i, 13, false);
                    return true;
                }
                m41827(i);
                return false;
            case 11:
                if (c15673M41800.f50966 == EnumC9355.GREEDY) {
                    iArr[i6] = iArr[i + 20];
                    m41776(i, 13, false);
                    return true;
                }
                m41827(i);
                return false;
            case 12:
                m41776(i, 10, true);
                return true;
            default:
                throw new IllegalStateException("Invalid quantifier continuation");
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private boolean m41792(int i) {
        int[] iArr = this.f58675;
        int i2 = i + 2;
        int i3 = iArr[i2];
        int i4 = iArr[i + 19] + i3;
        C15673 c15673M41800 = m41800(i);
        m41779(c15673M41800, i3, i4);
        int[] iArr2 = this.f58675;
        iArr2[i2] = i4;
        int i5 = i + 18;
        int i6 = iArr2[i5] + 1;
        iArr2[i5] = i6;
        if (i6 >= c15673M41800.f50970) {
            return m41802(i);
        }
        m41776(i, 6, true);
        return true;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    private boolean m41802(int i) {
        int[] iArr = this.f58675;
        int i2 = iArr[i + 18];
        int i3 = iArr[i + 20];
        if (m41800(i).f50965 >= 0) {
            if (i2 <= i3) {
                m41831(i);
                m41776(i, 9, false);
                return true;
            }
        } else if (i2 < i3) {
            m41827(i);
            return false;
        }
        m41776(i, 8, false);
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m41779(C15673 c15673, int i, int i2) {
        boolean z = c15673.f50964;
        int i3 = c15673.f50969;
        if (z) {
            C23879 c23879 = this.f58674;
            if (c23879.f77324) {
                c23879.f77321.m29921(i3, i, i2, c23879.f77327);
            }
            int[] iArr = c23879.f77327;
            iArr[i3] = i;
            iArr[i3 + 1] = i2;
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private void m41831(int i) {
        C15673 c15673M41800 = m41800(i);
        if (c15673M41800.f50964) {
            int i2 = this.f58675[i + 6];
            C23879 c23879 = this.f58674;
            if (i2 >= 0) {
                c23879.f77321.m29920(i2);
            }
            int[] iArr = c23879.f77327;
            int i3 = c15673M41800.f50969;
            int[] iArr2 = this.f58675;
            iArr[i3] = iArr2[i + 23];
            iArr[i3 + 1] = iArr2[i + 24];
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m41827(int i) {
        m41771(i);
        int[] iArr = this.f58675;
        this.f58685 = iArr[i + 4];
        this.f58683 = i;
        this.f58686 = iArr[i + 12];
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m41811() {
        int[] iArr = this.f58675;
        int length = iArr.length;
        int i = this.f58683;
        if (length - i >= 32) {
            return;
        }
        int iM41766 = m41766(iArr.length, ((long) i) + 32);
        long jM41793 = m41793();
        int[] iArr2 = this.f58675;
        if ((((long) (iM41766 - iArr2.length)) * 4) + jM41793 > 33554432) {
            throw new C17165();
        }
        this.f58675 = Arrays.copyOf(iArr2, iM41766);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x002e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0034 A[RETURN] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m41791(boolean z) {
        int i = this.f58686;
        if (i < 0) {
            throw new IllegalStateException("Regex condition returned without a control scope");
        }
        int[] iArr = this.f58675;
        boolean z2 = iArr[i] >= 5;
        int i2 = iArr[(z2 ? 21 : 5) + i];
        C23879 c23879 = this.f58674;
        if (z) {
            if (!c23879.f77324) {
                C20149 c20149 = this.f58680;
                if (c20149.f64728 || c20149.f64731 || c20149.f64732) {
                    if (!m41805(i2)) {
                        return false;
                    }
                }
            } else if (!m41805(i2)) {
                return false;
            }
            if (!this.f58680.f64732) {
                for (int i3 = this.f58684 - 2; i3 >= i2; i3 -= 2) {
                    int[] iArr2 = this.f58677;
                    int i4 = iArr2[i3];
                    if (i4 < 0 && i4 != Integer.MIN_VALUE) {
                        this.f58681[~i4] = iArr2[i3 + 1];
                    }
                }
            }
            this.f58684 = i2;
        } else {
            m41809(i2);
        }
        this.f58683 = i + 32;
        int[] iArr3 = this.f58675;
        int i5 = i + 4;
        this.f58685 = iArr3[i5] + 6;
        this.f58686 = iArr3[i + 12];
        if (z2) {
            return m41781(i, z);
        }
        m41808(i);
        int[] iArr4 = this.f58675;
        int i6 = iArr4[i];
        if (z != (i6 == 0 || i6 == 2 || i6 == 4)) {
            m41771(i);
            this.f58685 = this.f58675[i5];
            this.f58683 = i;
            return false;
        }
        iArr4[i + 13] = 1;
        this.f58688 = iArr4[i + 1];
        this.f58669 = i6 == 4 ? c23879.f77335 : iArr4[i + 2];
        return true;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private boolean m41798(int i, CharSequence charSequence) {
        int[] iArr = this.f58675;
        int i2 = iArr[i];
        if (i2 >= 5) {
            if (iArr[i + 13] == 0) {
                this.f58686 = i;
                return m41791(false);
            }
            return m41781(i, false);
        }
        if (iArr[i + 13] == 0) {
            this.f58686 = i;
            if (i2 == 2 || i2 == 3) {
                int i3 = i + 10;
                int i4 = iArr[i3];
                int i5 = iArr[i + 11];
                int iM41763 = i4 - ((iArr[i + 14] == 0 || i4 <= i5) ? 1 : m41763(i4, -1, charSequence));
                if (this.f58670) {
                    return false;
                }
                if (iM41763 >= i5) {
                    int[] iArr2 = this.f58675;
                    iArr2[i3] = iM41763;
                    this.f58688 = iArr2[i + 3];
                    this.f58669 = iM41763;
                    return true;
                }
            }
            return m41791(false);
        }
        m41771(i);
        int[] iArr3 = this.f58675;
        this.f58685 = iArr3[i + 4];
        this.f58683 = i;
        this.f58686 = iArr3[i + 12];
        return false;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    private void m41808(int i) {
        int[] iArr = this.f58675;
        int i2 = iArr[i];
        C23879 c23879 = this.f58674;
        if (i2 == 0 || i2 == 1) {
            c23879.f77326 = iArr[i + 7];
        } else if (i2 == 2 || i2 == 3) {
            c23879.f77318 = iArr[i + 8];
            c23879.f77346 = iArr[i + 9];
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m41771(int i) {
        int i2;
        int[] iArr = this.f58675;
        if (iArr[i + 13] == 2) {
            return;
        }
        if (iArr[i] >= 5) {
            C15673 c15673M41800 = m41800(i);
            int[] iArr2 = this.f58675;
            if (iArr2[i] == 5 && (i2 = c15673M41800.f50965) >= 0) {
                m41801(i2, iArr2[i + 22]);
            }
            m41831(i);
        } else {
            m41808(i);
        }
        int i3 = this.f58675[i + 6];
        if (i3 >= 0) {
            this.f58674.f77321.m29920(i3);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m41763(int i, int i2, CharSequence charSequence) {
        if (i2 == 1 && i >= 0 && i < charSequence.length() && !Character.isHighSurrogate(charSequence.charAt(i))) {
            return 1;
        }
        int length = charSequence.length();
        C23879 c23879 = this.f58674;
        int i3 = 0;
        if (i2 >= 0) {
            int i4 = i;
            while (i4 < length && i3 < i2) {
                int i5 = i4 + 1;
                i4 = (Character.isHighSurrogate(charSequence.charAt(i4)) && i5 < length && Character.isLowSurrogate(charSequence.charAt(i5))) ? i4 + 2 : i5;
                if (c23879.m53350()) {
                    this.f58670 = true;
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
            if (c23879.m53350()) {
                this.f58670 = true;
                return i - i7;
            }
            i3++;
        }
        return i - i7;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m41769(C18044 c18044, CharSequence charSequence, int i, int i2) {
        int i3;
        int i4 = 0;
        do {
            int i5 = c18044.f59083;
            C23879 c23879 = this.f58674;
            if (i4 < i5) {
                if (i >= i2) {
                    c23879.f77334 = true;
                } else {
                    char cCharAt = charSequence.charAt(i);
                    int[] iArr = c18044.f59080;
                    if (cCharAt >= iArr.length) {
                        int i6 = 0;
                        while (true) {
                            InterfaceC2885[] interfaceC2885Arr = c18044.f59082;
                            if (i6 >= interfaceC2885Arr.length) {
                                i3 = 0;
                                break;
                            }
                            if (interfaceC2885Arr[i6].mo1303(cCharAt)) {
                                i3 = c18044.f59084[i6];
                                break;
                            }
                            if (c23879.m53350()) {
                                this.f58670 = true;
                                return -1;
                            }
                            i6++;
                        }
                    } else {
                        i3 = iArr[cCharAt];
                    }
                    if (i3 != 0) {
                        m41812(i3, i);
                        i++;
                        m41812(i3 + 1, i);
                        i4++;
                    }
                }
            }
            if (i4 >= c18044.f59081 && (c23879.f77316 != 1 || i == i2)) {
                return i;
            }
        } while (!m41804());
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:61:0x009e  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ae  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m41767(C2250 c2250, CharSequence charSequence, int i, int i2) {
        int i3;
        int i4 = 0;
        do {
            int i5 = c2250.f7358;
            InterfaceC2885 interfaceC2885 = c2250.f7357;
            boolean z = c2250.f7366;
            boolean z2 = c2250.f7363;
            C23879 c23879 = this.f58674;
            if (i4 < i5) {
                if (i >= i2) {
                    c23879.f77334 = true;
                } else {
                    int iCharAt = z2 ? charSequence.charAt(i) : Character.codePointAt(charSequence, i);
                    int iCharCount = (z2 ? 1 : Character.charCount(iCharAt)) + i;
                    if (iCharCount > i2) {
                        c23879.f77334 = true;
                    }
                    if (iCharCount <= i2 && c2250.f7362.mo1303(iCharAt)) {
                        i = iCharCount;
                    } else if (iCharAt == c2250.f7360) {
                        int i6 = i + 1;
                        if (i6 >= i2) {
                            c23879.f77334 = true;
                        } else {
                            int iCharAt2 = z ? charSequence.charAt(i6) : Character.codePointAt(charSequence, i6);
                            int iCharCount2 = i6 + (z ? 1 : Character.charCount(iCharAt2));
                            if (iCharCount2 > i2) {
                                c23879.f77334 = true;
                            } else if (c2250.f7364.mo1303(iCharAt2)) {
                                i = iCharCount2;
                            }
                        }
                    }
                    i4++;
                }
            }
            if (i4 < c2250.f7365) {
                break;
            }
            if (interfaceC2885 == null) {
                if (i >= i2) {
                    c23879.f77334 = true;
                    return -1;
                }
                if (c2250.f7361.mo1303(charSequence.charAt(i))) {
                    break;
                }
                i3 = i + 1;
                if (c23879.f77316 == 1) {
                }
                return i3;
            }
            int i7 = i;
            while (i7 < i2 && interfaceC2885.mo1303(charSequence.charAt(i7))) {
                i7++;
                if (c23879.m53350()) {
                    this.f58670 = true;
                    return -1;
                }
            }
            if (i7 >= i2) {
                c23879.f77334 = true;
            }
            if (i7 - i < c2250.f7359) {
                break;
            }
            i = i7;
            if (i >= i2) {
                c23879.f77334 = true;
                return -1;
            }
            if (c2250.f7361.mo1303(charSequence.charAt(i))) {
                break;
            }
            i3 = i + 1;
            if (c23879.f77316 == 1 || i3 == i2) {
                return i3;
            }
        } while (!m41804());
        return -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m41768(C14314 c14314, CharSequence charSequence, int i, int i2) {
        char cCharAt;
        C3874 c3874 = c14314.f45178;
        int[][] iArr = c14314.f45180;
        C23879 c23879 = this.f58674;
        if (C20895.m47762(c3874, c23879, i, charSequence)) {
            int[] iArr2 = (i >= i2 || (cCharAt = charSequence.charAt(i)) >= 128) ? null : c14314.f45179[cCharAt];
            int length = iArr2 == null ? iArr.length : iArr2.length;
            for (int i3 = 0; i3 < length; i3++) {
                if (c23879.m53350()) {
                    this.f58670 = true;
                    return -1;
                }
                int iM41765 = m41765(i, i2, charSequence, iArr[iArr2 == null ? i3 : iArr2[i3]]);
                if (this.f58670) {
                    break;
                }
                if (iM41765 >= 0 && C20895.m47762(c14314.f45177, c23879, iM41765, charSequence) && (c23879.f77316 != 1 || iM41765 == i2)) {
                    return iM41765;
                }
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m41765(int i, int i2, CharSequence charSequence, Object obj) {
        boolean z = obj instanceof InterfaceC2885;
        C23879 c23879 = this.f58674;
        if (z) {
            InterfaceC2885 interfaceC2885 = (InterfaceC2885) obj;
            if (i >= i2) {
                c23879.f77334 = true;
                return -1;
            }
            if (interfaceC2885.mo1303(charSequence.charAt(i))) {
                return i + 1;
            }
            return -1;
        }
        int[] iArr = (int[]) obj;
        for (int i3 = 0; i3 < iArr.length; i3++) {
            int i4 = i + i3;
            if (i4 >= i2) {
                c23879.f77334 = true;
                return -1;
            }
            if (iArr[i3] != charSequence.charAt(i4)) {
                return -1;
            }
            if (c23879.m53350()) {
                this.f58670 = true;
                return -1;
            }
        }
        return i + iArr.length;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m41773(int i, int i2, int i3, int i4, int i5) {
        int[] iArr = this.f58673;
        int length = iArr.length;
        int i6 = this.f58685;
        if (length - i6 < 6) {
            int iM41766 = m41766(iArr.length, ((long) i6) + 6);
            m41796(this.f58681.length, iM41766, this.f58677.length);
            this.f58673 = Arrays.copyOf(this.f58673, iM41766);
        }
        int i7 = this.f58685;
        int[] iArr2 = this.f58673;
        iArr2[i7] = i;
        iArr2[i7 + 1] = i2;
        iArr2[i7 + 2] = i3;
        iArr2[i7 + 3] = this.f58684;
        iArr2[i7 + 4] = i4;
        iArr2[i7 + 5] = i5;
        this.f58685 = i7 + 6;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private int m41810(int i) {
        return this.f58680.f64732 ? this.f58674.f77328[i] : this.f58681[i];
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    private void m41801(int i, int i2) {
        if (this.f58680.f64732) {
            this.f58674.f77328[i] = i2;
        } else {
            this.f58681[i] = i2;
        }
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    private void m41807(int i) {
        if ((i & 1073741824) != 0) {
            throw new C17165();
        }
        m41828(~(1073741824 | i), m41810(i));
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m41803(int i, int i2) {
        if (this.f58680.f64732 || this.f58685 != 0) {
            m41828(~i, m41810(i));
        }
        m41801(i, i2);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m41812(int i, int i2) {
        C23879 c23879 = this.f58674;
        m41828(i, c23879.f77327[i]);
        c23879.f77327[i] = i2;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m41828(int i, int i2) {
        int[] iArr = this.f58677;
        int length = iArr.length;
        int i3 = this.f58684;
        if (length - i3 < 2) {
            int iM41766 = m41766(iArr.length, ((long) i3) + 2);
            m41796(this.f58681.length, this.f58673.length, iM41766);
            this.f58677 = Arrays.copyOf(this.f58677, iM41766);
        }
        int[] iArr2 = this.f58677;
        int i4 = this.f58684;
        int i5 = i4 + 1;
        this.f58684 = i5;
        iArr2[i4] = i;
        this.f58684 = i4 + 2;
        iArr2[i5] = i2;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m41809(int i) {
        while (true) {
            int i2 = this.f58684;
            if (i2 <= i) {
                return;
            }
            int[] iArr = this.f58677;
            int i3 = i2 - 1;
            this.f58684 = i3;
            int i4 = iArr[i3];
            int i5 = i2 - 2;
            this.f58684 = i5;
            int i6 = iArr[i5];
            if (i6 != Integer.MIN_VALUE && i6 != -2147483647) {
                if (i6 < 0) {
                    m41801((~i6) & (-1073741825), i4);
                } else {
                    this.f58674.f77327[i6] = i4;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private boolean m41805(int i) {
        int iM41759 = this.f58683 - 32;
        int i2 = this.f58684 - 2;
        boolean z = true;
        while (i2 >= i) {
            iM41759 = m41759(iM41759, i2 + 2);
            if (!this.f58670) {
                int i3 = this.f58677[i2];
                if (i3 != -2147483647) {
                    boolean z2 = (i3 >= 0 || i3 == Integer.MIN_VALUE || ((~i3) & 1073741824) == 0) ? false : true;
                    C23879 c23879 = this.f58674;
                    if (z && i3 != Integer.MIN_VALUE && !z2) {
                        if (m41804()) {
                        }
                    } else if (c23879.m53350()) {
                        this.f58670 = true;
                        return false;
                    }
                    if (z2) {
                        m41801((~i3) & (-1073741825), this.f58677[i2 + 1]);
                        this.f58677[i2] = -2147483647;
                    } else if (this.f58680.f64732 && i3 < 0 && i3 != Integer.MIN_VALUE) {
                        this.f58677[i2] = -2147483647;
                    } else if (i3 == Integer.MIN_VALUE) {
                        int[] iArr = c23879.f77327;
                        int i4 = this.f58677[i2 + 1];
                        iArr[0] = i4;
                        c23879.f77329 = i4;
                        iArr[1] = c23879.f77335;
                    } else if (i3 > 1 && (i3 & 1) != 0) {
                        int[] iArr2 = this.f58677;
                        int i5 = iArr2[i2 + 1];
                        int i6 = iArr2[i2 - 1];
                        if (c23879.f77324 && i6 != -1 && i5 != -1) {
                            c23879.f77321.f38467.add(new C6483(i3 / 2, i6, i5));
                        }
                        i2 -= 2;
                    }
                    z = false;
                }
                i2 -= 2;
            }
            return false;
        }
        m41759(iM41759, i);
        return !this.f58670;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m41759(int i, int i2) {
        while (i >= 0) {
            int[] iArr = this.f58675;
            int i3 = i + 13;
            int i4 = iArr[i3];
            if (i4 == 0 || iArr[i + 5] < i2) {
                break;
            }
            if (i4 != 2 && iArr[i] == 6 && iArr[i + 17] == 8) {
                int i5 = iArr[i + 2];
                m41779(m41800(i), i5 - this.f58675[i + 19], i5);
            }
            this.f58675[i3] = 2;
            i -= 32;
            if (this.f58674.m53350()) {
                this.f58670 = true;
                break;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41832() {
        if (this.f58676 != 0) {
            this.f58671++;
            Arrays.fill(this.f58667, 0L);
            this.f58676 = 0;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private boolean m41821(int i, int i2) {
        if (this.f58680.f64732) {
            this.f58674.f77319[i].getClass();
        }
        long[] jArr = this.f58667;
        if (jArr.length == 0) {
            return false;
        }
        long j = (((long) i2) + 1) | (((long) i) << 32);
        return !this.f58670 && this.f58671 == this.f58671 && this.f58667[m41770(jArr, j)] == j;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m41795(int i, int i2) {
        boolean z = this.f58680.f64732;
        C23879 c23879 = this.f58674;
        if (z) {
            c23879.f77319[i].getClass();
        }
        int i3 = this.f58671;
        long j = (((long) i2) + 1) | (((long) i) << 32);
        long[] jArr = this.f58667;
        if (jArr.length != 0) {
            int iM41770 = m41770(jArr, j);
            if (this.f58670 || i3 != this.f58671 || this.f58667[iM41770] == j) {
                return;
            }
        }
        int i4 = this.f58676;
        long[] jArr2 = this.f58667;
        if (i4 >= jArr2.length / 2) {
            int iM41766 = m41766(jArr2.length, ((long) jArr2.length) + 1);
            if (((iM41766 - 1) & iM41766) == 0) {
                if ((((long) (iM41766 - this.f58667.length)) * 8) + m41793() <= 33554432) {
                    long[] jArr3 = new long[iM41766];
                    for (int i5 = 0; i5 < this.f58667.length; i5++) {
                        if (c23879.m53350()) {
                            this.f58670 = true;
                            return;
                        }
                        if (i3 != this.f58671) {
                            return;
                        }
                        long j2 = this.f58667[i5];
                        if (j2 != 0) {
                            int iM41771 = m41770(jArr3, j2);
                            if (this.f58670 || i3 != this.f58671) {
                                return;
                            } else {
                                jArr3[iM41771] = j2;
                            }
                        }
                    }
                    if (i3 != this.f58671) {
                        return;
                    } else {
                        this.f58667 = jArr3;
                    }
                }
            }
            throw new C17165();
        }
        int iM41772 = m41770(this.f58667, j);
        if (this.f58670 || i3 != this.f58671) {
            return;
        }
        this.f58667[iM41772] = j;
        this.f58676++;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m41770(long[] jArr, long j) {
        long j2 = ((j >>> 33) ^ j) * (-49064778989728563L);
        int length = jArr.length - 1;
        int i = ((int) (j2 ^ (j2 >>> 33))) & length;
        while (true) {
            long j3 = jArr[i];
            if (j3 == 0 || j3 == j) {
                break;
            }
            if (this.f58674.m53350()) {
                this.f58670 = true;
                return 0;
            }
            i = (i + 1) & length;
        }
        return i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m41786(C14314 c14314, int i, CharSequence charSequence) {
        C23879 c23879 = this.f58674;
        if (c23879.m53350()) {
            this.f58670 = true;
            return false;
        }
        int iM41768 = m41768(c14314, charSequence, i, c23879.f77326);
        if (this.f58670 || iM41768 < 0) {
            return false;
        }
        int[] iArr = c23879.f77327;
        iArr[0] = c23879.f77329;
        c23879.m53360(iM41768);
        iArr[1] = iM41768;
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m41787(C18044 c18044, int i, CharSequence charSequence) {
        C23879 c23879 = this.f58674;
        if (c23879.m53350()) {
            this.f58670 = true;
            return false;
        }
        int iM41769 = m41769(c18044, charSequence, i, c23879.f77326);
        if (this.f58670 || iM41769 < 0) {
            m41809(0);
            return false;
        }
        int[] iArr = c23879.f77327;
        iArr[0] = c23879.f77329;
        c23879.m53360(iM41769);
        iArr[1] = iM41769;
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m41790(C23133 c23133, int i, CharSequence charSequence) {
        char cCharAt;
        C23879 c23879 = this.f58674;
        if (c23879.m53350()) {
            this.f58670 = true;
            return false;
        }
        int i2 = c23879.f77326;
        C11198 c11198 = c23133.f75006;
        int[] iArr = c11198.f35334;
        if (i < i2 && (cCharAt = charSequence.charAt(i)) < 128) {
            int i3 = c11198.f35333[cCharAt];
            return i3 != 0 && m41822(iArr[Integer.numberOfTrailingZeros(i3)], i, charSequence);
        }
        m41773(3, c23133.f75007, i, 1, 0);
        return m41822(iArr[0], i, charSequence);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private int m41815(int i, int i2, int i3, InterfaceC2885 interfaceC2885, CharSequence charSequence) {
        while (i2 < i3) {
            C23879 c23879 = this.f58674;
            if (!c23879.m53350()) {
                c23879.m53365();
                String strNormalize = Normalizer.normalize(TextUtils.substring(charSequence, i, i3), Normalizer.Form.NFC);
                if (!c23879.m53374()) {
                    Thread threadCurrentThread = this.f58678;
                    if (threadCurrentThread == null) {
                        threadCurrentThread = Thread.currentThread();
                        this.f58678 = threadCurrentThread;
                    }
                    if (!c23879.m53346(threadCurrentThread)) {
                        if (strNormalize.codePointCount(0, strNormalize.length()) == 1 && interfaceC2885.mo1303(strNormalize.codePointAt(0))) {
                            return i3;
                        }
                        i3 -= Character.charCount(Character.codePointBefore(charSequence, i3));
                    }
                }
                this.f58670 = true;
                break;
            }
            this.f58670 = true;
            return -1;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private boolean m41804() {
        C23879 c23879 = this.f58674;
        if (!c23879.m53350()) {
            if (c23879.f77323) {
                return false;
            }
            Thread threadCurrentThread = this.f58678;
            if (threadCurrentThread == null) {
                threadCurrentThread = Thread.currentThread();
                this.f58678 = threadCurrentThread;
            }
            if (!c23879.m53346(threadCurrentThread)) {
                return false;
            }
        }
        this.f58670 = true;
        return true;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m41796(int i, int i2, int i3) {
        if (((((long) this.f58687.length) + ((long) this.f58675.length)) * 4) + ((((long) this.f58679.length) + ((long) this.f58667.length)) * 8) + ((((long) i) + ((long) i2) + ((long) i3)) * 4) > 33554432) {
            throw new C17165();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m41766(int i, long j) {
        if (j > 2147483639) {
            throw new C17165();
        }
        return (int) Math.min(2147483639L, Math.max(j, Math.max(64L, ((long) i) * 2)));
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private long m41793() {
        return ((((long) this.f58679.length) + ((long) this.f58667.length)) * 8) + ((((long) this.f58681.length) + ((long) this.f58673.length) + ((long) this.f58677.length) + ((long) this.f58687.length) + ((long) this.f58675.length)) * 4);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m41789(C22387 c22387, C23879 c23879, int i, CharSequence charSequence) {
        int i2 = c22387.f72482;
        Object obj = c22387.f72483;
        if (i2 != 16) {
            if (i2 == 1) {
                if (i >= c23879.f77326) {
                    c23879.f77334 = true;
                    return true;
                }
                return !((InterfaceC2885) obj).mo1303(charSequence.charAt(i));
            }
            C21862 c21862 = (C21862) obj;
            int i3 = c21862.f69693 + i;
            if (i3 >= i && i3 < c23879.f77326) {
                char cCharAt = charSequence.charAt(i3);
                if (!c21862.f69694 ? c21862.f69695.mo1303(cCharAt) : cCharAt == c21862.f69692) {
                }
            }
            return false;
        }
        boolean z = c23879.f77334;
        boolean z2 = c23879.f77311;
        if (C20895.m47760(c22387.f72480, c22387.f72481, c23879, i, charSequence)) {
            c23879.f77334 = z;
            c23879.f77311 = z2;
            return false;
        }
        return true;
    }
}
