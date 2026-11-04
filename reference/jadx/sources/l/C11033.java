package l;

import android.text.NoCopySpan;
import android.text.Selection;
import android.text.SpanWatcher;
import android.text.Spanned;
import android.text.TextWatcher;
import com.google.android.material.motion.MotionUtils;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.IdentityHashMap;

/* JADX INFO: renamed from: l.ۤܿ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: O6UZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C11033 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f34824;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5068 f34825;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int[] f34826;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public long f34827;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long[] f34828;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public long[] f34829;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f34830;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public long f34831;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public long[] f34832;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public Object[] f34833;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f34834;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public long f34835;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public IdentityHashMap f34836;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int[] f34837;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static Object[] f34823 = new Object[0];

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static Object[] f34821 = new Object[73];

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static final int[][] f34822 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 6, 0);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m27900(long j, long j2) {
        return C2764.m9137(C2458.m8289(MotionUtils.EASING_TYPE_FORMAT_START, " ... ", j), j2, MotionUtils.EASING_TYPE_FORMAT_END);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static int m27912(int i) {
        return i + (((i + 1) & (~i)) >> 1);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m27913(int i) {
        return i - (((i + 1) & (~i)) >> 1);
    }

    public C11033(C5068 c5068, CharSequence charSequence, int i) {
        this.f34825 = c5068;
        long length = c5068.length();
        long jMax = Math.max(8L, 2 * length);
        this.f34831 = jMax;
        this.f34827 = length;
        this.f34835 = jMax - length;
        this.f34830 = 0;
        this.f34824 = 0;
        this.f34833 = new Object[0];
        this.f34832 = new long[0];
        this.f34829 = new long[0];
        this.f34826 = new int[0];
        this.f34828 = new long[0];
        this.f34837 = new int[0];
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            for (Object obj : spanned.getSpans(0, i, Object.class)) {
                if (!(obj instanceof NoCopySpan)) {
                    int spanStart = spanned.getSpanStart(obj);
                    int spanEnd = spanned.getSpanEnd(obj);
                    int spanFlags = spanned.getSpanFlags(obj);
                    spanStart = spanStart < 0 ? 0 : spanStart;
                    spanStart = spanStart > i ? i : spanStart;
                    spanEnd = spanEnd < 0 ? 0 : spanEnd;
                    m27905(false, obj, spanStart, spanEnd > i ? i : spanEnd, spanFlags, false);
                }
            }
            m27916();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27920() {
        int i = this.f34830;
        while (true) {
            i--;
            if (i < 0) {
                break;
            }
            Object[] objArr = this.f34833;
            Object obj = objArr[i];
            long j = this.f34832[i];
            long j2 = this.f34829[i];
            long j3 = this.f34827;
            if (j > j3) {
                j -= this.f34835;
            }
            if (j2 > j3) {
                j2 -= this.f34835;
            }
            this.f34830 = i;
            objArr[i] = null;
            IdentityHashMap identityHashMap = this.f34836;
            if (identityHashMap != null) {
                identityHashMap.remove(obj);
            }
            m27917(obj, j, j2);
        }
        IdentityHashMap identityHashMap2 = this.f34836;
        if (identityHashMap2 != null) {
            identityHashMap2.clear();
        }
        this.f34824 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m27907(int i, int i2, int i3, boolean z) {
        int i4 = i3 & 1;
        if (i4 == 0 || m27915(this.f34828[i3]) < i || !m27907(i, i2, m27913(i3), z)) {
            if (i3 >= this.f34830) {
                return false;
            }
            if ((this.f34826[i3] & 33) == 33) {
                long j = this.f34832[i3];
                long j2 = i;
                if (j >= j2) {
                    long j3 = this.f34827;
                    long j4 = this.f34835 + j3;
                    if (j < j4) {
                        long j5 = this.f34829[i3];
                        if (j5 >= j2 && j5 < j4 && (z || j > j2 || j5 < j3)) {
                            this.f34836.remove(this.f34833[i3]);
                            m27918(i3);
                            return true;
                        }
                    }
                }
            }
            if (m27915(this.f34832[i3]) > i2 || i4 == 0 || !m27907(i, i2, m27912(i3), z)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0232  */
    /* JADX WARN: Code duplicated, block: B:124:0x0239  */
    /* JADX WARN: Code duplicated, block: B:125:0x023c  */
    /* JADX WARN: Code duplicated, block: B:135:0x0255  */
    /* JADX WARN: Code duplicated, block: B:195:0x0393  */
    /* JADX WARN: Code duplicated, block: B:268:0x04e8  */
    /* JADX WARN: Code duplicated, block: B:283:0x050c  */
    /* JADX WARN: Code duplicated, block: B:309:0x01a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:320:0x025e A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x0110  */
    /* JADX WARN: Code duplicated, block: B:78:0x0186  */
    /* JADX WARN: Code duplicated, block: B:79:0x018b  */
    /* JADX WARN: Code duplicated, block: B:81:0x0194  */
    /* JADX WARN: Code duplicated, block: B:82:0x0197  */
    /* JADX WARN: Code duplicated, block: B:85:0x019c  */
    /* JADX WARN: Code duplicated, block: B:86:0x019f  */
    /* JADX WARN: Code duplicated, block: B:88:0x01a6  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27921(int i, int i2, CharSequence charSequence, int i3, int i4, boolean z) {
        C5068 c5068;
        int selectionStart;
        int selectionEnd;
        int i5;
        long j;
        int i6;
        int i7;
        int i8;
        int i9;
        long j2;
        boolean z2;
        long j3;
        boolean z3;
        long j4;
        int i10;
        boolean z4;
        int i11;
        long j5;
        int i12;
        long j6;
        long j7;
        long j8;
        int i13;
        int i14;
        long j9;
        long j10;
        int i15;
        int i16;
        long j11;
        long j12;
        long j13 = i;
        long j14 = i2;
        long j15 = j14;
        m27904("replace", j13, j14);
        int i17 = i2 - i;
        int i18 = i4 - i3;
        Class<Object> cls = Object.class;
        if (i17 == 0 && i18 == 0) {
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                Object[] spans = spanned.getSpans(i3, i3, cls);
                int length = spans.length;
                int i19 = 0;
                while (i19 < length) {
                    int i20 = length;
                    Spanned spanned2 = spanned;
                    if (spanned.getSpanFlags(spans[i19]) == 33) {
                        i19++;
                        length = i20;
                        spanned = spanned2;
                    }
                }
                return;
            }
            return;
        }
        TextWatcher[] textWatcherArr = (TextWatcher[]) m27923(i, i + i17, TextWatcher.class);
        int length2 = textWatcherArr.length;
        int i21 = 0;
        while (true) {
            c5068 = this.f34825;
            if (i21 >= length2) {
                break;
            }
            textWatcherArr[i21].beforeTextChanged(c5068, i, i17, i18);
            i21++;
            length2 = length2;
        }
        boolean z5 = (i17 == 0 || i18 == 0) ? false : true;
        if (z5 || z) {
            selectionStart = Selection.getSelectionStart(c5068);
            selectionEnd = Selection.getSelectionEnd(c5068);
        } else {
            selectionEnd = 0;
            selectionStart = 0;
        }
        int i22 = i18 - i17;
        int i23 = selectionEnd;
        int i24 = this.f34830 - 1;
        boolean z6 = false;
        while (i24 >= 0) {
            int i25 = i22;
            long j16 = this.f34832[i24];
            Class<Object> cls2 = cls;
            TextWatcher[] textWatcherArr2 = textWatcherArr;
            long j17 = this.f34827;
            if (j16 > j17) {
                j16 -= this.f34835;
            }
            long j18 = this.f34829[i24];
            if (j18 > j17) {
                j18 -= this.f34835;
            }
            if ((this.f34826[i24] & 51) == 51) {
                int length3 = c5068.length();
                if (j16 > j13) {
                    j11 = j15;
                    if (j16 <= j11) {
                        j9 = j11;
                        while (j9 < length3 && (j9 <= j11 || m27895(j9 - 1) != '\n')) {
                            j9++;
                        }
                    }
                    if (j18 > j13 || j18 > j11) {
                        j12 = j13;
                        j10 = j18;
                    } else {
                        j10 = j11;
                        j12 = j13;
                        while (j10 < length3 && (j10 <= j11 || m27895(j10 - 1) != '\n')) {
                            j10++;
                        }
                    }
                    if (j9 == j16 || j10 != j18) {
                        i14 = 32768;
                        selectionStart = selectionStart;
                        i25 = i25;
                        c5068 = c5068;
                        j7 = j11;
                        textWatcherArr2 = textWatcherArr2;
                        cls2 = cls2;
                        i23 = i23;
                        i17 = i17;
                        i18 = i18;
                        j8 = j12;
                        m27905(false, this.f34833[i24], j9, j10, this.f34826[i24], true);
                        z6 = true;
                    } else {
                        i13 = 32768;
                        j7 = j11;
                        j18 = j10;
                        j16 = j9;
                        j8 = j12;
                    }
                    if (j9 == j8) {
                        i16 = 4096;
                        i15 = i25;
                    } else {
                        i15 = i25;
                        if (j9 == i2 + i15) {
                            i16 = 8192;
                        } else {
                            i16 = 0;
                        }
                    }
                    if (j10 == j8) {
                        i16 |= 16384;
                    } else if (j10 == i2 + i15) {
                        i16 |= i14;
                    }
                    int[] iArr = this.f34826;
                    iArr[i24] = i16 | iArr[i24];
                    i24--;
                    i22 = i15;
                    c5068 = c5068;
                    j13 = j8;
                    selectionStart = selectionStart;
                    j15 = j7;
                    textWatcherArr = textWatcherArr2;
                    i17 = i17;
                    i18 = i18;
                    cls = cls2;
                    i23 = i23;
                } else {
                    j11 = j15;
                }
                j9 = j16;
                if (j18 > j13) {
                    j12 = j13;
                    j10 = j18;
                } else {
                    j12 = j13;
                    j10 = j18;
                }
                if (j9 == j16) {
                }
                i14 = 32768;
                selectionStart = selectionStart;
                i25 = i25;
                c5068 = c5068;
                j7 = j11;
                textWatcherArr2 = textWatcherArr2;
                cls2 = cls2;
                i23 = i23;
                i17 = i17;
                i18 = i18;
                j8 = j12;
                m27905(false, this.f34833[i24], j9, j10, this.f34826[i24], true);
                z6 = true;
                if (j9 == j8) {
                    i16 = 4096;
                    i15 = i25;
                } else {
                    i15 = i25;
                    if (j9 == i2 + i15) {
                        i16 = 8192;
                    } else {
                        i16 = 0;
                    }
                }
                if (j10 == j8) {
                    i16 |= 16384;
                } else if (j10 == i2 + i15) {
                    i16 |= i14;
                }
                int[] iArr2 = this.f34826;
                iArr2[i24] = i16 | iArr2[i24];
                i24--;
                i22 = i15;
                c5068 = c5068;
                j13 = j8;
                selectionStart = selectionStart;
                j15 = j7;
                textWatcherArr = textWatcherArr2;
                i17 = i17;
                i18 = i18;
                cls = cls2;
                i23 = i23;
            } else {
                j7 = j15;
                j8 = j13;
                i13 = 32768;
            }
            i14 = i13;
            j10 = j18;
            j9 = j16;
            if (j9 == j8) {
                i16 = 4096;
                i15 = i25;
            } else {
                i15 = i25;
                if (j9 == i2 + i15) {
                    i16 = 8192;
                } else {
                    i16 = 0;
                }
            }
            if (j10 == j8) {
                i16 |= 16384;
            } else if (j10 == i2 + i15) {
                i16 |= i14;
            }
            int[] iArr3 = this.f34826;
            iArr3[i24] = i16 | iArr3[i24];
            i24--;
            i22 = i15;
            c5068 = c5068;
            j13 = j8;
            selectionStart = selectionStart;
            j15 = j7;
            textWatcherArr = textWatcherArr2;
            i17 = i17;
            i18 = i18;
            cls = cls2;
            i23 = i23;
        }
        Class<Object> cls3 = cls;
        TextWatcher[] textWatcherArr3 = textWatcherArr;
        int i26 = i17;
        int i27 = i18;
        long j19 = j13;
        long j20 = j15;
        int i28 = selectionStart;
        int i29 = i23;
        int i30 = i22;
        C5068 c5069 = c5068;
        if (z6) {
            m27916();
        }
        if (j20 != this.f34827) {
            boolean z7 = i2 == c5069.length();
            if (this.f34830 != 0) {
                boolean z8 = false;
                for (int i31 = 0; i31 < this.f34830; i31++) {
                    long[] jArr = this.f34832;
                    long j21 = jArr[i31];
                    long[] jArr2 = this.f34829;
                    long j22 = jArr2[i31];
                    long j23 = this.f34827;
                    if (j21 > j23) {
                        j21 -= this.f34835;
                    }
                    if (j21 > j20) {
                        j5 = this.f34835;
                    } else {
                        if (j21 == j20 && ((i11 = (this.f34826[i31] & 240) >> 4) == 2 || (z7 && i11 == 3))) {
                            j5 = this.f34835;
                        }
                        if (j22 > j23) {
                            j22 -= this.f34835;
                        }
                        if (j22 > j20) {
                            j6 = this.f34835;
                        } else {
                            if (j22 == j20 && ((i12 = this.f34826[i31] & 15) == 2 || (z7 && i12 == 3))) {
                                j6 = this.f34835;
                            }
                            jArr[i31] = j21;
                            jArr2[i31] = j22;
                            if (i31 <= 0 && j21 < jArr[i31 - 1]) {
                                z8 = true;
                            }
                        }
                        j22 += j6;
                        jArr[i31] = j21;
                        jArr2[i31] = j22;
                        if (i31 <= 0) {
                        }
                    }
                    j21 += j5;
                    if (j22 > j23) {
                        j22 -= this.f34835;
                    }
                    if (j22 > j20) {
                        j6 = this.f34835;
                    } else {
                        if (j22 == j20) {
                            j6 = this.f34835;
                        }
                        jArr[i31] = j21;
                        jArr2[i31] = j22;
                        if (i31 <= 0) {
                        }
                    }
                    j22 += j6;
                    jArr[i31] = j21;
                    jArr2[i31] = j22;
                    if (i31 <= 0) {
                    }
                }
                if (z8) {
                    m27916();
                } else {
                    m27898(m27910());
                }
            }
            this.f34827 = j20;
        }
        long j24 = i30;
        long j25 = this.f34835;
        if (j24 >= j25) {
            long j26 = this.f34831;
            long j27 = (j26 + j24) - j25;
            if (j27 + 1 > j26) {
                long jMax = Math.max(8L, j27 * 2);
                long j28 = jMax - j26;
                this.f34831 = jMax;
                long j29 = this.f34835 + j28;
                this.f34835 = j29;
                if (j29 < 1) {
                    new Exception("mGapLength < 1");
                }
                if (this.f34830 != 0) {
                    for (int i32 = 0; i32 < this.f34830; i32++) {
                        long[] jArr3 = this.f34832;
                        long j30 = jArr3[i32];
                        long j31 = this.f34827;
                        if (j30 > j31) {
                            jArr3[i32] = j30 + j28;
                        }
                        long[] jArr4 = this.f34829;
                        long j32 = jArr4[i32];
                        if (j32 > j31) {
                            jArr4[i32] = j32 + j28;
                        }
                    }
                    m27898(m27910());
                }
            }
        }
        boolean z9 = i27 == 0;
        if (i26 <= 0) {
            i5 = i2;
            break;
        }
        do {
            if (this.f34830 <= 0) {
                i5 = i2;
                break;
            }
            i5 = i2;
        } while (m27907(i, i5, m27910(), z9));
        c5069.m15338(i, i2, charSequence, i3, i4);
        this.f34827 += j24;
        long j33 = this.f34835 - j24;
        this.f34835 = j33;
        if (j33 < 1) {
            new Exception("mGapLength < 1");
        }
        if (i26 > 0) {
            boolean z10 = this.f34827 + this.f34835 == this.f34831;
            int i33 = 0;
            while (i33 < this.f34830) {
                int i34 = (this.f34826[i33] & 240) >> 4;
                long[] jArr5 = this.f34832;
                long j34 = jArr5[i33];
                int i35 = i33;
                boolean z11 = z10;
                long j35 = j24;
                int i36 = i5;
                boolean z12 = z9;
                jArr5[i35] = m27899(i, i30, i34, j34, z11, z12);
                int i37 = this.f34826[i35] & 15;
                long[] jArr6 = this.f34829;
                jArr6[i35] = m27899(i, i30, i37, jArr6[i35], z11, z12);
                i33 = i35 + 1;
                i5 = i36;
                j24 = j35;
            }
            j = j24;
            i6 = i5;
            m27916();
        } else {
            j = j24;
            i6 = i5;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned3 = (Spanned) charSequence;
            int i38 = i4;
            Object[] spans2 = spanned3.getSpans(i3, i38, cls3);
            int i39 = 0;
            for (int length4 = spans2.length; i39 < length4; length4 = length4) {
                Object obj = spans2[i39];
                if (!(obj instanceof TextWatcher)) {
                    int spanStart = spanned3.getSpanStart(obj);
                    int spanEnd = spanned3.getSpanEnd(obj);
                    if (spanStart < i3) {
                        spanStart = i3;
                    }
                    if (spanEnd > i38) {
                        spanEnd = i38;
                    }
                    if (m27924(obj) < 0) {
                        m27905(false, obj, (spanStart - i3) + i, (spanEnd - i3) + i, spanned3.getSpanFlags(obj) | 2048, false);
                    }
                }
                i39++;
                i38 = i4;
                i30 = i30;
                spans2 = spans2;
            }
            i7 = i30;
            m27916();
        } else {
            i7 = i30;
        }
        if (z5) {
            if (i28 <= i || i28 >= i6) {
                i10 = i28;
                z4 = false;
            } else {
                long j36 = (((long) (i28 - i)) * ((long) i27)) / ((long) i26);
                int i40 = (int) j36;
                if (j36 != i40) {
                    throw new ArithmeticException();
                }
                i10 = i + i40;
                long j37 = i10;
                m27905(false, Selection.SELECTION_START, j37, j37, 34, true);
                z4 = true;
            }
            if (i29 <= i || i29 >= i6) {
                i8 = i29;
            } else {
                long j38 = (((long) (i29 - i)) * ((long) i27)) / ((long) i26);
                int i41 = (int) j38;
                if (j38 != i41) {
                    throw new ArithmeticException();
                }
                i8 = i + i41;
                long j39 = i8;
                m27905(false, Selection.SELECTION_END, j39, j39, 34, true);
                z4 = true;
            }
            if (z4) {
                m27916();
            }
            i9 = i10;
        } else {
            i8 = i29;
            i9 = i28;
        }
        if (z) {
            if (i9 >= 0) {
                long j40 = i9;
                m27905(false, Selection.SELECTION_START, j40, j40, 34, true);
            }
            if (i8 >= 0) {
                long j41 = i8;
                m27905(false, Selection.SELECTION_END, j41, j41, 34, true);
            }
            m27916();
        }
        c5069.m15349();
        for (TextWatcher textWatcher : textWatcherArr3) {
            textWatcher.onTextChanged(c5069, i, i26, i27);
        }
        for (TextWatcher textWatcher2 : textWatcherArr3) {
            textWatcher2.afterTextChanged(c5069);
        }
        int i42 = 32768;
        for (int i43 = 0; i43 < this.f34830; i43++) {
            int i44 = this.f34826[i43];
            if ((i44 & 2048) == 0) {
                long j42 = this.f34832[i43];
                long j43 = this.f34829[i43];
                long j44 = this.f34827;
                if (j42 > j44) {
                    j42 -= this.f34835;
                }
                long j45 = j42;
                if (j43 > j44) {
                    j43 -= this.f34835;
                }
                long j46 = j43;
                long j47 = i6 + i7;
                if (j45 > j47) {
                    if (i7 != 0) {
                        j2 = j45 - j;
                        z2 = true;
                    } else {
                        z2 = false;
                        j2 = j45;
                    }
                } else if (j45 < j19 || ((j45 == j19 && (i44 & 4096) == 4096) || (j45 == j47 && (i44 & 8192) == 8192))) {
                    z2 = false;
                    j2 = j45;
                } else {
                    j2 = j45;
                    z2 = true;
                }
                if (j46 > j47) {
                    if (i7 != 0) {
                        j3 = j46 - j;
                        j4 = j3;
                        z3 = true;
                    } else {
                        z3 = z2;
                        j4 = j46;
                    }
                } else if (j46 < j19 || ((j46 == j19 && (i44 & 16384) == 16384) || (j46 == j47 && (i44 & i42) == 32768))) {
                    z3 = z2;
                    j4 = j46;
                } else {
                    j3 = j46;
                    j4 = j3;
                    z3 = true;
                }
                if (z3) {
                    i42 = 32768;
                    m27903(this.f34833[i43], j2, j4, j45, j46);
                } else {
                    i42 = 32768;
                }
                int[] iArr4 = this.f34826;
                iArr4[i43] = iArr4[i43] & (-61441);
            }
        }
        for (int i45 = 0; i45 < this.f34830; i45++) {
            int[] iArr5 = this.f34826;
            int i46 = iArr5[i45];
            if ((i46 & 2048) != 0) {
                iArr5[i45] = i46 & (-2049);
                long j48 = this.f34832[i45];
                long j49 = this.f34829[i45];
                long j50 = this.f34827;
                if (j48 > j50) {
                    j48 -= this.f34835;
                }
                if (j49 > j50) {
                    j49 -= this.f34835;
                }
                m27902(this.f34833[i45], j48, j49);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private long m27899(int i, int i2, int i3, long j, boolean z, boolean z2) {
        long j2 = i;
        if (j >= j2) {
            long j3 = this.f34827;
            long j4 = this.f34835;
            if (j < j3 + j4) {
                if (i3 == 2) {
                    if (z2 || j > j2) {
                        return j3 + j4;
                    }
                } else {
                    if (i3 != 3) {
                        return (z2 || j < j3 - ((long) i2)) ? j2 : j3;
                    }
                    if (z) {
                        return j3 + j4;
                    }
                }
            }
        }
        return j;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m27918(int i) {
        Object[] objArr = this.f34833;
        Object obj = objArr[i];
        long j = this.f34832[i];
        long j2 = this.f34829[i];
        long j3 = this.f34827;
        if (j > j3) {
            j -= this.f34835;
        }
        if (j2 > j3) {
            j2 -= this.f34835;
        }
        int i2 = i + 1;
        int i3 = this.f34830 - i2;
        System.arraycopy(objArr, i2, objArr, i, i3);
        long[] jArr = this.f34832;
        System.arraycopy(jArr, i2, jArr, i, i3);
        long[] jArr2 = this.f34829;
        System.arraycopy(jArr2, i2, jArr2, i, i3);
        int[] iArr = this.f34826;
        System.arraycopy(iArr, i2, iArr, i, i3);
        int[] iArr2 = this.f34837;
        System.arraycopy(iArr2, i2, iArr2, i, i3);
        this.f34830--;
        this.f34834 = Math.min(i, this.f34834);
        this.f34833[this.f34830] = null;
        m27916();
        m27917(obj, j, j2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27922(Object obj, int i, int i2, int i3) {
        m27905(true, obj, i, i2, i3, true);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x009f  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:45:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:59:0x0103  */
    /* JADX WARN: Code duplicated, block: B:62:0x0116  */
    /* JADX WARN: Code duplicated, block: B:65:0x0129  */
    /* JADX WARN: Code duplicated, block: B:68:0x013c  */
    /* JADX WARN: Code duplicated, block: B:71:0x0151  */
    /* JADX WARN: Code duplicated, block: B:74:0x017d  */
    /* JADX WARN: Code duplicated, block: B:76:0x0183  */
    /* JADX WARN: Code duplicated, block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m27905(boolean z, Object obj, long j, long j2, int i, boolean z2) {
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        IdentityHashMap identityHashMap;
        Object[] objArrCopyOf;
        int i2;
        long[] jArrCopyOf;
        int i3;
        long[] jArrCopyOf2;
        int i4;
        int[] iArrCopyOf;
        int i5;
        int[] iArrCopyOf2;
        int i6;
        int iM27910;
        Integer num;
        m27904("setSpan", j, j2);
        int i7 = (i & 240) >> 4;
        if (m27908(i7, j)) {
            if (z2) {
                StringBuilder sbM8289 = C2458.m8289("PARAGRAPH span must start at paragraph boundary (", " follows ", j);
                sbM8289.append(m27895(j - 1));
                sbM8289.append(MotionUtils.EASING_TYPE_FORMAT_END);
                throw new RuntimeException(sbM8289.toString());
            }
            return;
        }
        int i8 = i & 15;
        if (m27908(i8, j2)) {
            if (z2) {
                StringBuilder sbM82810 = C2458.m8289("PARAGRAPH span must end at paragraph boundary (", " follows ", j2);
                sbM82810.append(m27895(j2 - 1));
                sbM82810.append(MotionUtils.EASING_TYPE_FORMAT_END);
                throw new RuntimeException(sbM82810.toString());
            }
            return;
        }
        if (i7 == 2 && i8 == 1 && j == j2) {
            return;
        }
        long j8 = this.f34827;
        C5068 c5068 = this.f34825;
        if (j <= j8) {
            if (j == j8 && (i7 == 2 || (i7 == 3 && j == c5068.length()))) {
                j4 = this.f34835;
            } else {
                j3 = j;
            }
            j5 = this.f34827;
            if (j2 > j5) {
                if (j2 == j5 || !(i8 == 2 || (i8 == 3 && j2 == c5068.length()))) {
                    j6 = j2;
                } else {
                    j7 = this.f34835;
                }
                identityHashMap = this.f34836;
                if (identityHashMap == null && (num = (Integer) identityHashMap.get(obj)) != null) {
                    int iIntValue = num.intValue();
                    long[] jArr = this.f34832;
                    long j9 = jArr[iIntValue];
                    long[] jArr2 = this.f34829;
                    long j10 = jArr2[iIntValue];
                    long j11 = this.f34827;
                    if (j9 > j11) {
                        j9 -= this.f34835;
                    }
                    if (j10 > j11) {
                        j10 -= this.f34835;
                    }
                    jArr[iIntValue] = j3;
                    jArr2[iIntValue] = j6;
                    this.f34826[iIntValue] = i;
                    if (z) {
                        m27916();
                        m27903(obj, j9, j10, j, j2);
                        return;
                    }
                    return;
                }
                objArrCopyOf = this.f34833;
                i2 = this.f34830;
                if (i2 == objArrCopyOf.length) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, C22222.m50278(i2));
                }
                objArrCopyOf[i2] = obj;
                this.f34833 = objArrCopyOf;
                jArrCopyOf = this.f34832;
                i3 = this.f34830;
                if (i3 == jArrCopyOf.length) {
                    jArrCopyOf = Arrays.copyOf(jArrCopyOf, C22222.m50278(i3));
                }
                jArrCopyOf[i3] = j3;
                this.f34832 = jArrCopyOf;
                jArrCopyOf2 = this.f34829;
                i4 = this.f34830;
                if (i4 == jArrCopyOf2.length) {
                    jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, C22222.m50278(i4));
                }
                jArrCopyOf2[i4] = j6;
                this.f34829 = jArrCopyOf2;
                iArrCopyOf = this.f34826;
                i5 = this.f34830;
                if (i5 == iArrCopyOf.length) {
                    iArrCopyOf = Arrays.copyOf(iArrCopyOf, C22222.m50278(i5));
                }
                iArrCopyOf[i5] = i;
                this.f34826 = iArrCopyOf;
                iArrCopyOf2 = this.f34837;
                i6 = this.f34830;
                int i9 = this.f34824;
                if (i6 == iArrCopyOf2.length) {
                    iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, C22222.m50278(i6));
                }
                iArrCopyOf2[i6] = i9;
                this.f34837 = iArrCopyOf2;
                this.f34834 = Math.min(this.f34830, this.f34834);
                this.f34830++;
                this.f34824++;
                iM27910 = (m27910() * 2) + 1;
                if (this.f34828.length < iM27910) {
                    this.f34828 = new long[iM27910];
                }
                if (z) {
                    m27916();
                    m27902(obj, j, j2);
                }
            }
            j7 = this.f34835;
            j6 = j7 + j2;
            identityHashMap = this.f34836;
            if (identityHashMap == null) {
            }
            objArrCopyOf = this.f34833;
            i2 = this.f34830;
            if (i2 == objArrCopyOf.length) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, C22222.m50278(i2));
            }
            objArrCopyOf[i2] = obj;
            this.f34833 = objArrCopyOf;
            jArrCopyOf = this.f34832;
            i3 = this.f34830;
            if (i3 == jArrCopyOf.length) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, C22222.m50278(i3));
            }
            jArrCopyOf[i3] = j3;
            this.f34832 = jArrCopyOf;
            jArrCopyOf2 = this.f34829;
            i4 = this.f34830;
            if (i4 == jArrCopyOf2.length) {
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, C22222.m50278(i4));
            }
            jArrCopyOf2[i4] = j6;
            this.f34829 = jArrCopyOf2;
            iArrCopyOf = this.f34826;
            i5 = this.f34830;
            if (i5 == iArrCopyOf.length) {
                iArrCopyOf = Arrays.copyOf(iArrCopyOf, C22222.m50278(i5));
            }
            iArrCopyOf[i5] = i;
            this.f34826 = iArrCopyOf;
            iArrCopyOf2 = this.f34837;
            i6 = this.f34830;
            int i10 = this.f34824;
            if (i6 == iArrCopyOf2.length) {
                iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, C22222.m50278(i6));
            }
            iArrCopyOf2[i6] = i10;
            this.f34837 = iArrCopyOf2;
            this.f34834 = Math.min(this.f34830, this.f34834);
            this.f34830++;
            this.f34824++;
            iM27910 = (m27910() * 2) + 1;
            if (this.f34828.length < iM27910) {
                this.f34828 = new long[iM27910];
            }
            if (z) {
                m27916();
                m27902(obj, j, j2);
            }
        }
        j4 = this.f34835;
        j3 = j4 + j;
        j5 = this.f34827;
        if (j2 > j5) {
            if (j2 == j5) {
            }
            j6 = j2;
            identityHashMap = this.f34836;
            if (identityHashMap == null) {
            }
            objArrCopyOf = this.f34833;
            i2 = this.f34830;
            if (i2 == objArrCopyOf.length) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, C22222.m50278(i2));
            }
            objArrCopyOf[i2] = obj;
            this.f34833 = objArrCopyOf;
            jArrCopyOf = this.f34832;
            i3 = this.f34830;
            if (i3 == jArrCopyOf.length) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, C22222.m50278(i3));
            }
            jArrCopyOf[i3] = j3;
            this.f34832 = jArrCopyOf;
            jArrCopyOf2 = this.f34829;
            i4 = this.f34830;
            if (i4 == jArrCopyOf2.length) {
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, C22222.m50278(i4));
            }
            jArrCopyOf2[i4] = j6;
            this.f34829 = jArrCopyOf2;
            iArrCopyOf = this.f34826;
            i5 = this.f34830;
            if (i5 == iArrCopyOf.length) {
                iArrCopyOf = Arrays.copyOf(iArrCopyOf, C22222.m50278(i5));
            }
            iArrCopyOf[i5] = i;
            this.f34826 = iArrCopyOf;
            iArrCopyOf2 = this.f34837;
            i6 = this.f34830;
            int i11 = this.f34824;
            if (i6 == iArrCopyOf2.length) {
                iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, C22222.m50278(i6));
            }
            iArrCopyOf2[i6] = i11;
            this.f34837 = iArrCopyOf2;
            this.f34834 = Math.min(this.f34830, this.f34834);
            this.f34830++;
            this.f34824++;
            iM27910 = (m27910() * 2) + 1;
            if (this.f34828.length < iM27910) {
                this.f34828 = new long[iM27910];
            }
            if (z) {
                m27916();
                m27902(obj, j, j2);
            }
        }
        j7 = this.f34835;
        j6 = j7 + j2;
        identityHashMap = this.f34836;
        if (identityHashMap == null) {
        }
        objArrCopyOf = this.f34833;
        i2 = this.f34830;
        if (i2 == objArrCopyOf.length) {
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, C22222.m50278(i2));
        }
        objArrCopyOf[i2] = obj;
        this.f34833 = objArrCopyOf;
        jArrCopyOf = this.f34832;
        i3 = this.f34830;
        if (i3 == jArrCopyOf.length) {
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, C22222.m50278(i3));
        }
        jArrCopyOf[i3] = j3;
        this.f34832 = jArrCopyOf;
        jArrCopyOf2 = this.f34829;
        i4 = this.f34830;
        if (i4 == jArrCopyOf2.length) {
            jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, C22222.m50278(i4));
        }
        jArrCopyOf2[i4] = j6;
        this.f34829 = jArrCopyOf2;
        iArrCopyOf = this.f34826;
        i5 = this.f34830;
        if (i5 == iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, C22222.m50278(i5));
        }
        iArrCopyOf[i5] = i;
        this.f34826 = iArrCopyOf;
        iArrCopyOf2 = this.f34837;
        i6 = this.f34830;
        int i12 = this.f34824;
        if (i6 == iArrCopyOf2.length) {
            iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, C22222.m50278(i6));
        }
        iArrCopyOf2[i6] = i12;
        this.f34837 = iArrCopyOf2;
        this.f34834 = Math.min(this.f34830, this.f34834);
        this.f34830++;
        this.f34824++;
        iM27910 = (m27910() * 2) + 1;
        if (this.f34828.length < iM27910) {
            this.f34828 = new long[iM27910];
        }
        if (z) {
            m27916();
            m27902(obj, j, j2);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m27902(Object obj, long j, long j2) {
        Object obj2 = Selection.SELECTION_START;
        C5068 c5068 = this.f34825;
        if (obj == obj2 || obj == Selection.SELECTION_END) {
            c5068.m15349();
        }
        int i = (int) j;
        long j3 = i;
        if (j != j3) {
            throw new ArithmeticException();
        }
        int i2 = (int) j2;
        long j4 = i2;
        if (j2 != j4) {
            throw new ArithmeticException();
        }
        for (SpanWatcher spanWatcher : (SpanWatcher[]) m27923(i, i2, SpanWatcher.class)) {
            if (j != j3) {
                throw new ArithmeticException();
            }
            if (j2 != j4) {
                throw new ArithmeticException();
            }
            spanWatcher.onSpanAdded(c5068, obj, i, i2);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m27903(Object obj, long j, long j2, long j3, long j4) {
        Object obj2 = Selection.SELECTION_START;
        C5068 c5068 = this.f34825;
        if (obj == obj2 || obj == Selection.SELECTION_END) {
            c5068.m15349();
        }
        long jMin = Math.min(j, j3);
        int i = (int) jMin;
        if (jMin != i) {
            throw new ArithmeticException();
        }
        long jMin2 = Math.min(Math.max(j2, j4), c5068.length());
        int i2 = (int) jMin2;
        if (jMin2 != i2) {
            throw new ArithmeticException();
        }
        SpanWatcher[] spanWatcherArr = (SpanWatcher[]) m27923(i, i2, SpanWatcher.class);
        int length = spanWatcherArr.length;
        int i3 = 0;
        while (i3 < length) {
            SpanWatcher spanWatcher = spanWatcherArr[i3];
            int i4 = (int) j;
            if (j != i4) {
                throw new ArithmeticException();
            }
            int i5 = (int) j2;
            int i6 = i3;
            int i7 = length;
            if (j2 != i5) {
                throw new ArithmeticException();
            }
            int i8 = (int) j3;
            if (j3 != i8) {
                throw new ArithmeticException();
            }
            int i9 = (int) j4;
            SpanWatcher[] spanWatcherArr2 = spanWatcherArr;
            if (j4 != i9) {
                throw new ArithmeticException();
            }
            spanWatcher.onSpanChanged(c5068, obj, i4, i5, i8, i9);
            i3 = i6 + 1;
            length = i7;
            spanWatcherArr = spanWatcherArr2;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m27917(Object obj, long j, long j2) {
        Object obj2 = Selection.SELECTION_START;
        C5068 c5068 = this.f34825;
        if (obj == obj2 || obj == Selection.SELECTION_END) {
            c5068.m15349();
        }
        int i = (int) j;
        long j3 = i;
        if (j != j3) {
            throw new ArithmeticException();
        }
        int i2 = (int) j2;
        long j4 = i2;
        if (j2 != j4) {
            throw new ArithmeticException();
        }
        for (SpanWatcher spanWatcher : (SpanWatcher[]) m27923(i, i2, SpanWatcher.class)) {
            if (j != j3) {
                throw new ArithmeticException();
            }
            if (j2 != j4) {
                throw new ArithmeticException();
            }
            spanWatcher.onSpanRemoved(c5068, obj, i, i2);
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m27927(Object obj) {
        Integer num;
        IdentityHashMap identityHashMap = this.f34836;
        if (identityHashMap == null || (num = (Integer) identityHashMap.remove(obj)) == null) {
            return;
        }
        m27918(num.intValue());
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private int m27915(long j) {
        if (j > this.f34827) {
            j -= this.f34835;
        }
        int i = (int) j;
        if (j == i) {
            return i;
        }
        throw new ArithmeticException();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m27924(Object obj) {
        Integer num;
        IdentityHashMap identityHashMap = this.f34836;
        if (identityHashMap == null || (num = (Integer) identityHashMap.get(obj)) == null) {
            return -1;
        }
        return m27915(this.f34832[num.intValue()]);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m27919(Object obj) {
        Integer num;
        IdentityHashMap identityHashMap = this.f34836;
        if (identityHashMap == null || (num = (Integer) identityHashMap.get(obj)) == null) {
            return -1;
        }
        return m27915(this.f34829[num.intValue()]);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m27926(Object obj) {
        Integer num;
        IdentityHashMap identityHashMap = this.f34836;
        if (identityHashMap == null || (num = (Integer) identityHashMap.get(obj)) == null) {
            return 0;
        }
        return this.f34826[num.intValue()];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object[] m27923(int i, int i2, Class cls) {
        if (cls == null) {
            return m27909(Object.class);
        }
        if (this.f34830 == 0) {
            return m27909(cls);
        }
        int iM27896 = m27896(i, i2, m27910(), cls);
        if (iM27896 == 0) {
            return m27909(cls);
        }
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) cls, iM27896);
        int[] iArrM27911 = m27911(iM27896);
        int[] iArrM27912 = m27911(iM27896);
        m27897(i, i2, cls, m27910(), objArr, iArrM27911, iArrM27912, 0);
        int length = objArr.length;
        int i3 = length / 2;
        while (true) {
            i3--;
            if (i3 < 0) {
                break;
            }
            m27901(i3, objArr, length, iArrM27911, iArrM27912);
        }
        while (true) {
            length--;
            if (length <= 0) {
                m27906(iArrM27911);
                m27906(iArrM27912);
                return objArr;
            }
            Object obj = objArr[0];
            objArr[0] = objArr[length];
            objArr[length] = obj;
            int i4 = iArrM27911[0];
            iArrM27911[0] = iArrM27911[length];
            iArrM27911[length] = i4;
            int i5 = iArrM27912[0];
            iArrM27912[0] = iArrM27912[length];
            iArrM27912[length] = i5;
            m27901(0, objArr, length, iArrM27911, iArrM27912);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object[] m27909(Class cls) {
        if (cls == Object.class) {
            return f34823;
        }
        int iIdentityHashCode = ((System.identityHashCode(cls) / 8) & Integer.MAX_VALUE) % 73;
        Object[] objArr = f34821;
        Object objNewInstance = objArr[iIdentityHashCode];
        if (objNewInstance == null || objNewInstance.getClass().getComponentType() != cls) {
            objNewInstance = Array.newInstance((Class<?>) cls, 0);
            objArr[iIdentityHashCode] = objNewInstance;
        }
        return (Object[]) objNewInstance;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001f  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m27896(int i, int i2, int i3, Class cls) {
        int iM27896;
        int i4 = i3 & 1;
        if (i4 != 0) {
            int iM27913 = m27913(i3);
            long j = this.f34828[iM27913];
            if (j > this.f34827) {
                j -= this.f34835;
            }
            if (j >= i) {
                iM27896 = m27896(i, i2, iM27913, cls);
            } else {
                iM27896 = 0;
            }
        } else {
            iM27896 = 0;
        }
        if (i3 >= this.f34830) {
            return iM27896;
        }
        long j2 = this.f34832[i3];
        long j3 = this.f34827;
        if (j2 > j3) {
            j2 -= this.f34835;
        }
        long j4 = i2;
        if (j2 > j4) {
            return iM27896;
        }
        long j5 = this.f34829[i3];
        if (j5 > j3) {
            j5 -= this.f34835;
        }
        long j6 = i;
        if (j5 >= j6 && ((j2 == j5 || i == i2 || (j2 != j4 && j5 != j6)) && (Object.class == cls || cls.isInstance(this.f34833[i3])))) {
            iM27896++;
        }
        return i4 != 0 ? iM27896 + m27896(i, i2, m27912(i3), cls) : iM27896;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003b  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m27897(int i, int i2, Class cls, int i3, Object[] objArr, int[] iArr, int[] iArr2, int i4) {
        int iM27897;
        int i5 = i3 & 1;
        if (i5 != 0) {
            int iM27913 = m27913(i3);
            long j = this.f34828[iM27913];
            if (j > this.f34827) {
                j -= this.f34835;
            }
            if (j >= i) {
                iM27897 = m27897(i, i2, cls, iM27913, objArr, iArr, iArr2, i4);
            } else {
                iM27897 = i4;
            }
        } else {
            iM27897 = i4;
        }
        if (i3 < this.f34830) {
            long j2 = this.f34832[i3];
            long j3 = this.f34827;
            if (j2 > j3) {
                j2 -= this.f34835;
            }
            long j4 = i2;
            if (j2 <= j4) {
                long j5 = this.f34829[i3];
                if (j5 > j3) {
                    j5 -= this.f34835;
                }
                long j6 = i;
                if (j5 >= j6 && ((j2 == j5 || i == i2 || (j2 != j4 && j5 != j6)) && (Object.class == cls || cls.isInstance(this.f34833[i3])))) {
                    iArr[iM27897] = this.f34826[i3] & 16711680;
                    iArr2[iM27897] = this.f34837[i3];
                    objArr[iM27897] = this.f34833[i3];
                    iM27897++;
                }
                int i6 = iM27897;
                return (i6 >= objArr.length || i5 == 0) ? i6 : m27897(i, i2, cls, m27912(i3), objArr, iArr, iArr2, i6);
            }
        }
        return iM27897;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static int[] m27911(int i) {
        int[] iArr;
        int[][] iArr2 = f34822;
        synchronized (iArr2) {
            int length = iArr2.length - 1;
            int i2 = -1;
            while (true) {
                if (length < 0) {
                    length = i2;
                    break;
                }
                int[] iArr3 = f34822[length];
                if (iArr3 != null) {
                    if (iArr3.length >= i) {
                        break;
                    }
                    if (i2 == -1) {
                        i2 = length;
                    }
                }
                length--;
            }
            iArr = null;
            if (length != -1) {
                int[][] iArr4 = f34822;
                int[] iArr5 = iArr4[length];
                iArr4[length] = null;
                iArr = iArr5;
            }
        }
        return (iArr == null || i > iArr.length) ? new int[C22222.m50278(i)] : iArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m27906(int[] iArr) {
        int i;
        synchronized (f34822) {
            while (true) {
                int[][] iArr2 = f34822;
                if (i < iArr2.length) {
                    int[] iArr3 = iArr2[i];
                    i = (iArr3 != null && iArr.length <= iArr3.length) ? i + 1 : 0;
                    iArr2[i] = iArr;
                    break;
                }
                break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m27901(int i, Object[] objArr, int i2, int[] iArr, int[] iArr2) {
        int iCompare;
        int iCompare2;
        int i3 = (i * 2) + 1;
        while (i3 < i2) {
            if (i3 < i2 - 1) {
                int i4 = i3 + 1;
                int i5 = iArr[i3];
                int i6 = iArr[i4];
                if (i5 == i6) {
                    iCompare2 = Integer.compare(iArr2[i3], iArr2[i4]);
                } else {
                    iCompare2 = Integer.compare(i6, i5);
                }
                if (iCompare2 < 0) {
                    i3 = i4;
                }
            }
            int i7 = iArr[i];
            int i8 = iArr[i3];
            if (i7 == i8) {
                iCompare = Integer.compare(iArr2[i], iArr2[i3]);
            } else {
                iCompare = Integer.compare(i8, i7);
            }
            if (iCompare >= 0) {
                return;
            }
            Object obj = objArr[i];
            objArr[i] = objArr[i3];
            objArr[i3] = obj;
            int i9 = iArr[i];
            iArr[i] = iArr[i3];
            iArr[i3] = i9;
            int i10 = iArr2[i];
            iArr2[i] = iArr2[i3];
            iArr2[i3] = i10;
            int i11 = i3;
            i3 = (i3 * 2) + 1;
            i = i11;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m27925(int i, int i2, Class cls) {
        if (this.f34830 == 0) {
            return i2;
        }
        if (cls == null) {
            cls = Object.class;
        }
        return m27914(i, i2, m27910(), cls);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private int m27914(int i, int i2, int i3, Class cls) {
        int i4 = i3 & 1;
        if (i4 != 0) {
            int iM27913 = m27913(i3);
            if (m27915(this.f34828[iM27913]) > i) {
                i2 = m27914(i, i2, iM27913, cls);
            }
        }
        if (i3 >= this.f34830) {
            return i2;
        }
        int iM27915 = m27915(this.f34832[i3]);
        int iM27916 = m27915(this.f34829[i3]);
        if (iM27915 > i && iM27915 < i2 && cls.isInstance(this.f34833[i3])) {
            i2 = iM27915;
        }
        if (iM27916 <= i || iM27916 >= i2 || !cls.isInstance(this.f34833[i3])) {
            iM27916 = i2;
        }
        return (iM27915 >= iM27916 || i4 == 0) ? iM27916 : m27914(i, iM27916, m27912(i3), cls);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private int m27910() {
        return Integer.highestOneBit(this.f34830) - 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private long m27898(int i) {
        int i2 = i & 1;
        long jM27898 = i2 != 0 ? m27898(m27913(i)) : 0L;
        if (i < this.f34830) {
            jM27898 = Math.max(jM27898, this.f34829[i]);
            if (i2 != 0) {
                jM27898 = Math.max(jM27898, m27898(m27912(i)));
            }
        }
        this.f34828[i] = jM27898;
        return jM27898;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m27916() {
        Object[] objArr;
        long[] jArr;
        long[] jArr2;
        int[] iArr;
        int[] iArr2;
        int i;
        if (this.f34830 == 0) {
            return;
        }
        for (int i2 = 1; i2 < this.f34830; i2++) {
            long[] jArr3 = this.f34832;
            long j = jArr3[i2];
            if (j < jArr3[i2 - 1]) {
                Object obj = this.f34833[i2];
                long j2 = this.f34829[i2];
                int i3 = this.f34826[i2];
                int i4 = this.f34837[i2];
                int i5 = i2;
                while (true) {
                    objArr = this.f34833;
                    int i6 = i5 - 1;
                    objArr[i5] = objArr[i6];
                    jArr = this.f34832;
                    jArr[i5] = jArr[i6];
                    jArr2 = this.f34829;
                    jArr2[i5] = jArr2[i6];
                    iArr = this.f34826;
                    iArr[i5] = iArr[i6];
                    iArr2 = this.f34837;
                    iArr2[i5] = iArr2[i6];
                    i = i5 - 1;
                    if (i <= 0 || j >= jArr[i5 - 2]) {
                        break;
                    } else {
                        i5 = i;
                    }
                }
                objArr[i] = obj;
                jArr[i] = j;
                jArr2[i] = j2;
                iArr[i] = i3;
                iArr2[i] = i4;
                this.f34834 = Math.min(i, this.f34834);
            }
        }
        m27898(m27910());
        if (this.f34836 == null) {
            this.f34836 = new IdentityHashMap();
        }
        for (int i7 = this.f34834; i7 < this.f34830; i7++) {
            Integer num = (Integer) this.f34836.get(this.f34833[i7]);
            if (num == null || num.intValue() != i7) {
                this.f34836.put(this.f34833[i7], Integer.valueOf(i7));
            }
        }
        this.f34834 = Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m27904(String str, long j, long j2) {
        if (j2 < j) {
            throw new IndexOutOfBoundsException(C8947.m23910(C3188.m10405(str, " "), m27900(j, j2), " has end before start"));
        }
        int length = this.f34825.length();
        long j3 = length;
        if (j <= j3 && j2 <= j3) {
            if (j < 0 || j2 < 0) {
                throw new IndexOutOfBoundsException(C8947.m23910(C3188.m10405(str, " "), m27900(j, j2), " starts before 0"));
            }
        } else {
            StringBuilder sbM10405 = C3188.m10405(str, " ");
            sbM10405.append(m27900(j, j2));
            sbM10405.append(" ends beyond length ");
            sbM10405.append(length);
            throw new IndexOutOfBoundsException(sbM10405.toString());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m27908(int i, long j) {
        return (i != 3 || j == 0 || j == ((long) this.f34825.length()) || m27895(j - 1) == '\n') ? false : true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private char m27895(long j) {
        int i = (int) j;
        if (j == i) {
            return this.f34825.charAt(i);
        }
        throw new ArithmeticException();
    }
}
