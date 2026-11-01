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

/* JADX INFO: renamed from: l.ܳܺۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: O6UZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C14620 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public long[] f47831;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public IdentityHashMap f47832;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f47833;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11092 f47834;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f47835;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public long[] f47836;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public long f47837;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int[] f47838;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f47839;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public long[] f47840;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public long f47841;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Object[] f47842;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f47843;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int[] f47844;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static Object[] f47829 = new Object[0];

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static Object[] f47828 = new Object[73];

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static final int[][] f47830 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 6, 0);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m35103(long j, long j2) {
        return C15037.m36023(C17114.m39970(MotionUtils.EASING_TYPE_FORMAT_START, " ... ", j), j2, MotionUtils.EASING_TYPE_FORMAT_END);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static int m35113(int i) {
        return i + (((i + 1) & (~i)) >> 1);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int m35116(int i) {
        return i - (((i + 1) & (~i)) >> 1);
    }

    public C14620(C11092 c11092, CharSequence charSequence, int i) {
        this.f47834 = c11092;
        long length = c11092.length();
        long jMax = Math.max(8L, 2 * length);
        this.f47841 = jMax;
        this.f47837 = length;
        this.f47839 = jMax - length;
        this.f47843 = 0;
        this.f47833 = 0;
        this.f47842 = new Object[0];
        this.f47840 = new long[0];
        this.f47831 = new long[0];
        this.f47838 = new int[0];
        this.f47836 = new long[0];
        this.f47844 = new int[0];
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
                    m35108(false, obj, spanStart, spanEnd > i ? i : spanEnd, spanFlags, false);
                }
            }
            m35119();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35123() {
        int i = this.f47843;
        while (true) {
            i--;
            if (i < 0) {
                break;
            }
            Object[] objArr = this.f47842;
            Object obj = objArr[i];
            long j = this.f47840[i];
            long j2 = this.f47831[i];
            long j3 = this.f47837;
            if (j > j3) {
                j -= this.f47839;
            }
            if (j2 > j3) {
                j2 -= this.f47839;
            }
            this.f47843 = i;
            objArr[i] = null;
            IdentityHashMap identityHashMap = this.f47832;
            if (identityHashMap != null) {
                identityHashMap.remove(obj);
            }
            m35120(obj, j, j2);
        }
        IdentityHashMap identityHashMap2 = this.f47832;
        if (identityHashMap2 != null) {
            identityHashMap2.clear();
        }
        this.f47833 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m35110(int i, int i2, int i3, boolean z) {
        int i4 = i3 & 1;
        if (i4 == 0 || m35118(this.f47836[i3]) < i || !m35110(i, i2, m35116(i3), z)) {
            if (i3 >= this.f47843) {
                return false;
            }
            if ((this.f47838[i3] & 33) == 33) {
                long j = this.f47840[i3];
                long j2 = i;
                if (j >= j2) {
                    long j3 = this.f47837;
                    long j4 = this.f47839 + j3;
                    if (j < j4) {
                        long j5 = this.f47831[i3];
                        if (j5 >= j2 && j5 < j4 && (z || j > j2 || j5 < j3)) {
                            this.f47832.remove(this.f47842[i3]);
                            m35097(i3);
                            return true;
                        }
                    }
                }
            }
            if (m35118(this.f47840[i3]) > i2 || i4 == 0 || !m35110(i, i2, m35113(i3), z)) {
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
    public final void m35124(int i, int i2, CharSequence charSequence, int i3, int i4, boolean z) {
        C11092 c11092;
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
        m35107("replace", j13, j14);
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
        TextWatcher[] textWatcherArr = (TextWatcher[]) m35126(i, i + i17, TextWatcher.class);
        int length2 = textWatcherArr.length;
        int i21 = 0;
        while (true) {
            c11092 = this.f47834;
            if (i21 >= length2) {
                break;
            }
            textWatcherArr[i21].beforeTextChanged(c11092, i, i17, i18);
            i21++;
            length2 = length2;
        }
        boolean z5 = (i17 == 0 || i18 == 0) ? false : true;
        if (z5 || z) {
            selectionStart = Selection.getSelectionStart(c11092);
            selectionEnd = Selection.getSelectionEnd(c11092);
        } else {
            selectionEnd = 0;
            selectionStart = 0;
        }
        int i22 = i18 - i17;
        int i23 = selectionEnd;
        int i24 = this.f47843 - 1;
        boolean z6 = false;
        while (i24 >= 0) {
            int i25 = i22;
            long j16 = this.f47840[i24];
            Class<Object> cls2 = cls;
            TextWatcher[] textWatcherArr2 = textWatcherArr;
            long j17 = this.f47837;
            if (j16 > j17) {
                j16 -= this.f47839;
            }
            long j18 = this.f47831[i24];
            if (j18 > j17) {
                j18 -= this.f47839;
            }
            if ((this.f47838[i24] & 51) == 51) {
                int length3 = c11092.length();
                if (j16 > j13) {
                    j11 = j15;
                    if (j16 <= j11) {
                        j9 = j11;
                        while (j9 < length3 && (j9 <= j11 || m35098(j9 - 1) != '\n')) {
                            j9++;
                        }
                    }
                    if (j18 > j13 || j18 > j11) {
                        j12 = j13;
                        j10 = j18;
                    } else {
                        j10 = j11;
                        j12 = j13;
                        while (j10 < length3 && (j10 <= j11 || m35098(j10 - 1) != '\n')) {
                            j10++;
                        }
                    }
                    if (j9 == j16 || j10 != j18) {
                        i14 = 32768;
                        selectionStart = selectionStart;
                        i25 = i25;
                        c11092 = c11092;
                        j7 = j11;
                        textWatcherArr2 = textWatcherArr2;
                        cls2 = cls2;
                        i23 = i23;
                        i17 = i17;
                        i18 = i18;
                        j8 = j12;
                        m35108(false, this.f47842[i24], j9, j10, this.f47838[i24], true);
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
                    int[] iArr = this.f47838;
                    iArr[i24] = i16 | iArr[i24];
                    i24--;
                    i22 = i15;
                    c11092 = c11092;
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
                c11092 = c11092;
                j7 = j11;
                textWatcherArr2 = textWatcherArr2;
                cls2 = cls2;
                i23 = i23;
                i17 = i17;
                i18 = i18;
                j8 = j12;
                m35108(false, this.f47842[i24], j9, j10, this.f47838[i24], true);
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
                int[] iArr2 = this.f47838;
                iArr2[i24] = i16 | iArr2[i24];
                i24--;
                i22 = i15;
                c11092 = c11092;
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
            int[] iArr3 = this.f47838;
            iArr3[i24] = i16 | iArr3[i24];
            i24--;
            i22 = i15;
            c11092 = c11092;
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
        C11092 c11093 = c11092;
        if (z6) {
            m35119();
        }
        if (j20 != this.f47837) {
            boolean z7 = i2 == c11093.length();
            if (this.f47843 != 0) {
                boolean z8 = false;
                for (int i31 = 0; i31 < this.f47843; i31++) {
                    long[] jArr = this.f47840;
                    long j21 = jArr[i31];
                    long[] jArr2 = this.f47831;
                    long j22 = jArr2[i31];
                    long j23 = this.f47837;
                    if (j21 > j23) {
                        j21 -= this.f47839;
                    }
                    if (j21 > j20) {
                        j5 = this.f47839;
                    } else {
                        if (j21 == j20 && ((i11 = (this.f47838[i31] & 240) >> 4) == 2 || (z7 && i11 == 3))) {
                            j5 = this.f47839;
                        }
                        if (j22 > j23) {
                            j22 -= this.f47839;
                        }
                        if (j22 > j20) {
                            j6 = this.f47839;
                        } else {
                            if (j22 == j20 && ((i12 = this.f47838[i31] & 15) == 2 || (z7 && i12 == 3))) {
                                j6 = this.f47839;
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
                        j22 -= this.f47839;
                    }
                    if (j22 > j20) {
                        j6 = this.f47839;
                    } else {
                        if (j22 == j20) {
                            j6 = this.f47839;
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
                    m35119();
                } else {
                    m35101(m35114());
                }
            }
            this.f47837 = j20;
        }
        long j24 = i30;
        long j25 = this.f47839;
        if (j24 >= j25) {
            long j26 = this.f47841;
            long j27 = (j26 + j24) - j25;
            if (j27 + 1 > j26) {
                long jMax = Math.max(8L, j27 * 2);
                long j28 = jMax - j26;
                this.f47841 = jMax;
                long j29 = this.f47839 + j28;
                this.f47839 = j29;
                if (j29 < 1) {
                    new Exception("mGapLength < 1");
                }
                if (this.f47843 != 0) {
                    for (int i32 = 0; i32 < this.f47843; i32++) {
                        long[] jArr3 = this.f47840;
                        long j30 = jArr3[i32];
                        long j31 = this.f47837;
                        if (j30 > j31) {
                            jArr3[i32] = j30 + j28;
                        }
                        long[] jArr4 = this.f47831;
                        long j32 = jArr4[i32];
                        if (j32 > j31) {
                            jArr4[i32] = j32 + j28;
                        }
                    }
                    m35101(m35114());
                }
            }
        }
        boolean z9 = i27 == 0;
        if (i26 <= 0) {
            i5 = i2;
            break;
        }
        do {
            if (this.f47843 <= 0) {
                i5 = i2;
                break;
            }
            i5 = i2;
        } while (m35110(i, i5, m35114(), z9));
        c11093.m27992(i, i2, charSequence, i3, i4);
        this.f47837 += j24;
        long j33 = this.f47839 - j24;
        this.f47839 = j33;
        if (j33 < 1) {
            new Exception("mGapLength < 1");
        }
        if (i26 > 0) {
            boolean z10 = this.f47837 + this.f47839 == this.f47841;
            int i33 = 0;
            while (i33 < this.f47843) {
                int i34 = (this.f47838[i33] & 240) >> 4;
                long[] jArr5 = this.f47840;
                long j34 = jArr5[i33];
                int i35 = i33;
                boolean z11 = z10;
                long j35 = j24;
                int i36 = i5;
                boolean z12 = z9;
                jArr5[i35] = m35102(i, i30, i34, j34, z11, z12);
                int i37 = this.f47838[i35] & 15;
                long[] jArr6 = this.f47831;
                jArr6[i35] = m35102(i, i30, i37, jArr6[i35], z11, z12);
                i33 = i35 + 1;
                i5 = i36;
                j24 = j35;
            }
            j = j24;
            i6 = i5;
            m35119();
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
                    if (m35127(obj) < 0) {
                        m35108(false, obj, (spanStart - i3) + i, (spanEnd - i3) + i, spanned3.getSpanFlags(obj) | 2048, false);
                    }
                }
                i39++;
                i38 = i4;
                i30 = i30;
                spans2 = spans2;
            }
            i7 = i30;
            m35119();
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
                m35108(false, Selection.SELECTION_START, j37, j37, 34, true);
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
                m35108(false, Selection.SELECTION_END, j39, j39, 34, true);
                z4 = true;
            }
            if (z4) {
                m35119();
            }
            i9 = i10;
        } else {
            i8 = i29;
            i9 = i28;
        }
        if (z) {
            if (i9 >= 0) {
                long j40 = i9;
                m35108(false, Selection.SELECTION_START, j40, j40, 34, true);
            }
            if (i8 >= 0) {
                long j41 = i8;
                m35108(false, Selection.SELECTION_END, j41, j41, 34, true);
            }
            m35119();
        }
        c11093.m28000();
        for (TextWatcher textWatcher : textWatcherArr3) {
            textWatcher.onTextChanged(c11093, i, i26, i27);
        }
        for (TextWatcher textWatcher2 : textWatcherArr3) {
            textWatcher2.afterTextChanged(c11093);
        }
        int i42 = 32768;
        for (int i43 = 0; i43 < this.f47843; i43++) {
            int i44 = this.f47838[i43];
            if ((i44 & 2048) == 0) {
                long j42 = this.f47840[i43];
                long j43 = this.f47831[i43];
                long j44 = this.f47837;
                if (j42 > j44) {
                    j42 -= this.f47839;
                }
                long j45 = j42;
                if (j43 > j44) {
                    j43 -= this.f47839;
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
                    m35106(this.f47842[i43], j2, j4, j45, j46);
                } else {
                    i42 = 32768;
                }
                int[] iArr4 = this.f47838;
                iArr4[i43] = iArr4[i43] & (-61441);
            }
        }
        for (int i45 = 0; i45 < this.f47843; i45++) {
            int[] iArr5 = this.f47838;
            int i46 = iArr5[i45];
            if ((i46 & 2048) != 0) {
                iArr5[i45] = i46 & (-2049);
                long j48 = this.f47840[i45];
                long j49 = this.f47831[i45];
                long j50 = this.f47837;
                if (j48 > j50) {
                    j48 -= this.f47839;
                }
                if (j49 > j50) {
                    j49 -= this.f47839;
                }
                m35105(this.f47842[i45], j48, j49);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private long m35102(int i, int i2, int i3, long j, boolean z, boolean z2) {
        long j2 = i;
        if (j >= j2) {
            long j3 = this.f47837;
            long j4 = this.f47839;
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

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m35097(int i) {
        Object[] objArr = this.f47842;
        Object obj = objArr[i];
        long j = this.f47840[i];
        long j2 = this.f47831[i];
        long j3 = this.f47837;
        if (j > j3) {
            j -= this.f47839;
        }
        if (j2 > j3) {
            j2 -= this.f47839;
        }
        int i2 = i + 1;
        int i3 = this.f47843 - i2;
        System.arraycopy(objArr, i2, objArr, i, i3);
        long[] jArr = this.f47840;
        System.arraycopy(jArr, i2, jArr, i, i3);
        long[] jArr2 = this.f47831;
        System.arraycopy(jArr2, i2, jArr2, i, i3);
        int[] iArr = this.f47838;
        System.arraycopy(iArr, i2, iArr, i, i3);
        int[] iArr2 = this.f47844;
        System.arraycopy(iArr2, i2, iArr2, i, i3);
        this.f47843--;
        this.f47835 = Math.min(i, this.f47835);
        this.f47842[this.f47843] = null;
        m35119();
        m35120(obj, j, j2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35125(Object obj, int i, int i2, int i3) {
        m35108(true, obj, i, i2, i3, true);
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
    private void m35108(boolean z, Object obj, long j, long j2, int i, boolean z2) {
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
        int iM35114;
        Integer num;
        m35107("setSpan", j, j2);
        int i7 = (i & 240) >> 4;
        if (m35111(i7, j)) {
            if (z2) {
                StringBuilder sbM39970 = C17114.m39970("PARAGRAPH span must start at paragraph boundary (", " follows ", j);
                sbM39970.append(m35098(j - 1));
                sbM39970.append(MotionUtils.EASING_TYPE_FORMAT_END);
                throw new RuntimeException(sbM39970.toString());
            }
            return;
        }
        int i8 = i & 15;
        if (m35111(i8, j2)) {
            if (z2) {
                StringBuilder sbM39971 = C17114.m39970("PARAGRAPH span must end at paragraph boundary (", " follows ", j2);
                sbM39971.append(m35098(j2 - 1));
                sbM39971.append(MotionUtils.EASING_TYPE_FORMAT_END);
                throw new RuntimeException(sbM39971.toString());
            }
            return;
        }
        if (i7 == 2 && i8 == 1 && j == j2) {
            return;
        }
        long j8 = this.f47837;
        C11092 c11092 = this.f47834;
        if (j <= j8) {
            if (j == j8 && (i7 == 2 || (i7 == 3 && j == c11092.length()))) {
                j4 = this.f47839;
            } else {
                j3 = j;
            }
            j5 = this.f47837;
            if (j2 > j5) {
                if (j2 == j5 || !(i8 == 2 || (i8 == 3 && j2 == c11092.length()))) {
                    j6 = j2;
                } else {
                    j7 = this.f47839;
                }
                identityHashMap = this.f47832;
                if (identityHashMap == null && (num = (Integer) identityHashMap.get(obj)) != null) {
                    int iIntValue = num.intValue();
                    long[] jArr = this.f47840;
                    long j9 = jArr[iIntValue];
                    long[] jArr2 = this.f47831;
                    long j10 = jArr2[iIntValue];
                    long j11 = this.f47837;
                    if (j9 > j11) {
                        j9 -= this.f47839;
                    }
                    if (j10 > j11) {
                        j10 -= this.f47839;
                    }
                    jArr[iIntValue] = j3;
                    jArr2[iIntValue] = j6;
                    this.f47838[iIntValue] = i;
                    if (z) {
                        m35119();
                        m35106(obj, j9, j10, j, j2);
                        return;
                    }
                    return;
                }
                objArrCopyOf = this.f47842;
                i2 = this.f47843;
                if (i2 == objArrCopyOf.length) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, C23792.m52329(i2));
                }
                objArrCopyOf[i2] = obj;
                this.f47842 = objArrCopyOf;
                jArrCopyOf = this.f47840;
                i3 = this.f47843;
                if (i3 == jArrCopyOf.length) {
                    jArrCopyOf = Arrays.copyOf(jArrCopyOf, C23792.m52329(i3));
                }
                jArrCopyOf[i3] = j3;
                this.f47840 = jArrCopyOf;
                jArrCopyOf2 = this.f47831;
                i4 = this.f47843;
                if (i4 == jArrCopyOf2.length) {
                    jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, C23792.m52329(i4));
                }
                jArrCopyOf2[i4] = j6;
                this.f47831 = jArrCopyOf2;
                iArrCopyOf = this.f47838;
                i5 = this.f47843;
                if (i5 == iArrCopyOf.length) {
                    iArrCopyOf = Arrays.copyOf(iArrCopyOf, C23792.m52329(i5));
                }
                iArrCopyOf[i5] = i;
                this.f47838 = iArrCopyOf;
                iArrCopyOf2 = this.f47844;
                i6 = this.f47843;
                int i9 = this.f47833;
                if (i6 == iArrCopyOf2.length) {
                    iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, C23792.m52329(i6));
                }
                iArrCopyOf2[i6] = i9;
                this.f47844 = iArrCopyOf2;
                this.f47835 = Math.min(this.f47843, this.f47835);
                this.f47843++;
                this.f47833++;
                iM35114 = (m35114() * 2) + 1;
                if (this.f47836.length < iM35114) {
                    this.f47836 = new long[iM35114];
                }
                if (z) {
                    m35119();
                    m35105(obj, j, j2);
                }
            }
            j7 = this.f47839;
            j6 = j7 + j2;
            identityHashMap = this.f47832;
            if (identityHashMap == null) {
            }
            objArrCopyOf = this.f47842;
            i2 = this.f47843;
            if (i2 == objArrCopyOf.length) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, C23792.m52329(i2));
            }
            objArrCopyOf[i2] = obj;
            this.f47842 = objArrCopyOf;
            jArrCopyOf = this.f47840;
            i3 = this.f47843;
            if (i3 == jArrCopyOf.length) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, C23792.m52329(i3));
            }
            jArrCopyOf[i3] = j3;
            this.f47840 = jArrCopyOf;
            jArrCopyOf2 = this.f47831;
            i4 = this.f47843;
            if (i4 == jArrCopyOf2.length) {
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, C23792.m52329(i4));
            }
            jArrCopyOf2[i4] = j6;
            this.f47831 = jArrCopyOf2;
            iArrCopyOf = this.f47838;
            i5 = this.f47843;
            if (i5 == iArrCopyOf.length) {
                iArrCopyOf = Arrays.copyOf(iArrCopyOf, C23792.m52329(i5));
            }
            iArrCopyOf[i5] = i;
            this.f47838 = iArrCopyOf;
            iArrCopyOf2 = this.f47844;
            i6 = this.f47843;
            int i10 = this.f47833;
            if (i6 == iArrCopyOf2.length) {
                iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, C23792.m52329(i6));
            }
            iArrCopyOf2[i6] = i10;
            this.f47844 = iArrCopyOf2;
            this.f47835 = Math.min(this.f47843, this.f47835);
            this.f47843++;
            this.f47833++;
            iM35114 = (m35114() * 2) + 1;
            if (this.f47836.length < iM35114) {
                this.f47836 = new long[iM35114];
            }
            if (z) {
                m35119();
                m35105(obj, j, j2);
            }
        }
        j4 = this.f47839;
        j3 = j4 + j;
        j5 = this.f47837;
        if (j2 > j5) {
            if (j2 == j5) {
            }
            j6 = j2;
            identityHashMap = this.f47832;
            if (identityHashMap == null) {
            }
            objArrCopyOf = this.f47842;
            i2 = this.f47843;
            if (i2 == objArrCopyOf.length) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, C23792.m52329(i2));
            }
            objArrCopyOf[i2] = obj;
            this.f47842 = objArrCopyOf;
            jArrCopyOf = this.f47840;
            i3 = this.f47843;
            if (i3 == jArrCopyOf.length) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, C23792.m52329(i3));
            }
            jArrCopyOf[i3] = j3;
            this.f47840 = jArrCopyOf;
            jArrCopyOf2 = this.f47831;
            i4 = this.f47843;
            if (i4 == jArrCopyOf2.length) {
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, C23792.m52329(i4));
            }
            jArrCopyOf2[i4] = j6;
            this.f47831 = jArrCopyOf2;
            iArrCopyOf = this.f47838;
            i5 = this.f47843;
            if (i5 == iArrCopyOf.length) {
                iArrCopyOf = Arrays.copyOf(iArrCopyOf, C23792.m52329(i5));
            }
            iArrCopyOf[i5] = i;
            this.f47838 = iArrCopyOf;
            iArrCopyOf2 = this.f47844;
            i6 = this.f47843;
            int i11 = this.f47833;
            if (i6 == iArrCopyOf2.length) {
                iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, C23792.m52329(i6));
            }
            iArrCopyOf2[i6] = i11;
            this.f47844 = iArrCopyOf2;
            this.f47835 = Math.min(this.f47843, this.f47835);
            this.f47843++;
            this.f47833++;
            iM35114 = (m35114() * 2) + 1;
            if (this.f47836.length < iM35114) {
                this.f47836 = new long[iM35114];
            }
            if (z) {
                m35119();
                m35105(obj, j, j2);
            }
        }
        j7 = this.f47839;
        j6 = j7 + j2;
        identityHashMap = this.f47832;
        if (identityHashMap == null) {
        }
        objArrCopyOf = this.f47842;
        i2 = this.f47843;
        if (i2 == objArrCopyOf.length) {
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, C23792.m52329(i2));
        }
        objArrCopyOf[i2] = obj;
        this.f47842 = objArrCopyOf;
        jArrCopyOf = this.f47840;
        i3 = this.f47843;
        if (i3 == jArrCopyOf.length) {
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, C23792.m52329(i3));
        }
        jArrCopyOf[i3] = j3;
        this.f47840 = jArrCopyOf;
        jArrCopyOf2 = this.f47831;
        i4 = this.f47843;
        if (i4 == jArrCopyOf2.length) {
            jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, C23792.m52329(i4));
        }
        jArrCopyOf2[i4] = j6;
        this.f47831 = jArrCopyOf2;
        iArrCopyOf = this.f47838;
        i5 = this.f47843;
        if (i5 == iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, C23792.m52329(i5));
        }
        iArrCopyOf[i5] = i;
        this.f47838 = iArrCopyOf;
        iArrCopyOf2 = this.f47844;
        i6 = this.f47843;
        int i12 = this.f47833;
        if (i6 == iArrCopyOf2.length) {
            iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, C23792.m52329(i6));
        }
        iArrCopyOf2[i6] = i12;
        this.f47844 = iArrCopyOf2;
        this.f47835 = Math.min(this.f47843, this.f47835);
        this.f47843++;
        this.f47833++;
        iM35114 = (m35114() * 2) + 1;
        if (this.f47836.length < iM35114) {
            this.f47836 = new long[iM35114];
        }
        if (z) {
            m35119();
            m35105(obj, j, j2);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m35105(Object obj, long j, long j2) {
        Object obj2 = Selection.SELECTION_START;
        C11092 c11092 = this.f47834;
        if (obj == obj2 || obj == Selection.SELECTION_END) {
            c11092.m28000();
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
        for (SpanWatcher spanWatcher : (SpanWatcher[]) m35126(i, i2, SpanWatcher.class)) {
            if (j != j3) {
                throw new ArithmeticException();
            }
            if (j2 != j4) {
                throw new ArithmeticException();
            }
            spanWatcher.onSpanAdded(c11092, obj, i, i2);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m35106(Object obj, long j, long j2, long j3, long j4) {
        Object obj2 = Selection.SELECTION_START;
        C11092 c11092 = this.f47834;
        if (obj == obj2 || obj == Selection.SELECTION_END) {
            c11092.m28000();
        }
        long jMin = Math.min(j, j3);
        int i = (int) jMin;
        if (jMin != i) {
            throw new ArithmeticException();
        }
        long jMin2 = Math.min(Math.max(j2, j4), c11092.length());
        int i2 = (int) jMin2;
        if (jMin2 != i2) {
            throw new ArithmeticException();
        }
        SpanWatcher[] spanWatcherArr = (SpanWatcher[]) m35126(i, i2, SpanWatcher.class);
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
            spanWatcher.onSpanChanged(c11092, obj, i4, i5, i8, i9);
            i3 = i6 + 1;
            length = i7;
            spanWatcherArr = spanWatcherArr2;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m35120(Object obj, long j, long j2) {
        Object obj2 = Selection.SELECTION_START;
        C11092 c11092 = this.f47834;
        if (obj == obj2 || obj == Selection.SELECTION_END) {
            c11092.m28000();
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
        for (SpanWatcher spanWatcher : (SpanWatcher[]) m35126(i, i2, SpanWatcher.class)) {
            if (j != j3) {
                throw new ArithmeticException();
            }
            if (j2 != j4) {
                throw new ArithmeticException();
            }
            spanWatcher.onSpanRemoved(c11092, obj, i, i2);
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m35121(Object obj) {
        Integer num;
        IdentityHashMap identityHashMap = this.f47832;
        if (identityHashMap == null || (num = (Integer) identityHashMap.remove(obj)) == null) {
            return;
        }
        m35097(num.intValue());
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private int m35118(long j) {
        if (j > this.f47837) {
            j -= this.f47839;
        }
        int i = (int) j;
        if (j == i) {
            return i;
        }
        throw new ArithmeticException();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m35127(Object obj) {
        Integer num;
        IdentityHashMap identityHashMap = this.f47832;
        if (identityHashMap == null || (num = (Integer) identityHashMap.get(obj)) == null) {
            return -1;
        }
        return m35118(this.f47840[num.intValue()]);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m35122(Object obj) {
        Integer num;
        IdentityHashMap identityHashMap = this.f47832;
        if (identityHashMap == null || (num = (Integer) identityHashMap.get(obj)) == null) {
            return -1;
        }
        return m35118(this.f47831[num.intValue()]);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m35129(Object obj) {
        Integer num;
        IdentityHashMap identityHashMap = this.f47832;
        if (identityHashMap == null || (num = (Integer) identityHashMap.get(obj)) == null) {
            return 0;
        }
        return this.f47838[num.intValue()];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object[] m35126(int i, int i2, Class cls) {
        if (cls == null) {
            return m35112(Object.class);
        }
        if (this.f47843 == 0) {
            return m35112(cls);
        }
        int iM35099 = m35099(i, i2, m35114(), cls);
        if (iM35099 == 0) {
            return m35112(cls);
        }
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) cls, iM35099);
        int[] iArrM35115 = m35115(iM35099);
        int[] iArrM35116 = m35115(iM35099);
        m35100(i, i2, cls, m35114(), objArr, iArrM35115, iArrM35116, 0);
        int length = objArr.length;
        int i3 = length / 2;
        while (true) {
            i3--;
            if (i3 < 0) {
                break;
            }
            m35104(i3, objArr, length, iArrM35115, iArrM35116);
        }
        while (true) {
            length--;
            if (length <= 0) {
                m35109(iArrM35115);
                m35109(iArrM35116);
                return objArr;
            }
            Object obj = objArr[0];
            objArr[0] = objArr[length];
            objArr[length] = obj;
            int i4 = iArrM35115[0];
            iArrM35115[0] = iArrM35115[length];
            iArrM35115[length] = i4;
            int i5 = iArrM35116[0];
            iArrM35116[0] = iArrM35116[length];
            iArrM35116[length] = i5;
            m35104(0, objArr, length, iArrM35115, iArrM35116);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object[] m35112(Class cls) {
        if (cls == Object.class) {
            return f47829;
        }
        int iIdentityHashCode = ((System.identityHashCode(cls) / 8) & Integer.MAX_VALUE) % 73;
        Object[] objArr = f47828;
        Object objNewInstance = objArr[iIdentityHashCode];
        if (objNewInstance == null || objNewInstance.getClass().getComponentType() != cls) {
            objNewInstance = Array.newInstance((Class<?>) cls, 0);
            objArr[iIdentityHashCode] = objNewInstance;
        }
        return (Object[]) objNewInstance;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001f  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m35099(int i, int i2, int i3, Class cls) {
        int iM35099;
        int i4 = i3 & 1;
        if (i4 != 0) {
            int iM35116 = m35116(i3);
            long j = this.f47836[iM35116];
            if (j > this.f47837) {
                j -= this.f47839;
            }
            if (j >= i) {
                iM35099 = m35099(i, i2, iM35116, cls);
            } else {
                iM35099 = 0;
            }
        } else {
            iM35099 = 0;
        }
        if (i3 >= this.f47843) {
            return iM35099;
        }
        long j2 = this.f47840[i3];
        long j3 = this.f47837;
        if (j2 > j3) {
            j2 -= this.f47839;
        }
        long j4 = i2;
        if (j2 > j4) {
            return iM35099;
        }
        long j5 = this.f47831[i3];
        if (j5 > j3) {
            j5 -= this.f47839;
        }
        long j6 = i;
        if (j5 >= j6 && ((j2 == j5 || i == i2 || (j2 != j4 && j5 != j6)) && (Object.class == cls || cls.isInstance(this.f47842[i3])))) {
            iM35099++;
        }
        return i4 != 0 ? iM35099 + m35099(i, i2, m35113(i3), cls) : iM35099;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003b  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m35100(int i, int i2, Class cls, int i3, Object[] objArr, int[] iArr, int[] iArr2, int i4) {
        int iM35100;
        int i5 = i3 & 1;
        if (i5 != 0) {
            int iM35116 = m35116(i3);
            long j = this.f47836[iM35116];
            if (j > this.f47837) {
                j -= this.f47839;
            }
            if (j >= i) {
                iM35100 = m35100(i, i2, cls, iM35116, objArr, iArr, iArr2, i4);
            } else {
                iM35100 = i4;
            }
        } else {
            iM35100 = i4;
        }
        if (i3 < this.f47843) {
            long j2 = this.f47840[i3];
            long j3 = this.f47837;
            if (j2 > j3) {
                j2 -= this.f47839;
            }
            long j4 = i2;
            if (j2 <= j4) {
                long j5 = this.f47831[i3];
                if (j5 > j3) {
                    j5 -= this.f47839;
                }
                long j6 = i;
                if (j5 >= j6 && ((j2 == j5 || i == i2 || (j2 != j4 && j5 != j6)) && (Object.class == cls || cls.isInstance(this.f47842[i3])))) {
                    iArr[iM35100] = this.f47838[i3] & 16711680;
                    iArr2[iM35100] = this.f47844[i3];
                    objArr[iM35100] = this.f47842[i3];
                    iM35100++;
                }
                int i6 = iM35100;
                return (i6 >= objArr.length || i5 == 0) ? i6 : m35100(i, i2, cls, m35113(i3), objArr, iArr, iArr2, i6);
            }
        }
        return iM35100;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static int[] m35115(int i) {
        int[] iArr;
        int[][] iArr2 = f47830;
        synchronized (iArr2) {
            int length = iArr2.length - 1;
            int i2 = -1;
            while (true) {
                if (length < 0) {
                    length = i2;
                    break;
                }
                int[] iArr3 = f47830[length];
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
                int[][] iArr4 = f47830;
                int[] iArr5 = iArr4[length];
                iArr4[length] = null;
                iArr = iArr5;
            }
        }
        return (iArr == null || i > iArr.length) ? new int[C23792.m52329(i)] : iArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m35109(int[] iArr) {
        int i;
        synchronized (f47830) {
            while (true) {
                int[][] iArr2 = f47830;
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
    public static void m35104(int i, Object[] objArr, int i2, int[] iArr, int[] iArr2) {
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

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m35128(int i, int i2, Class cls) {
        if (this.f47843 == 0) {
            return i2;
        }
        if (cls == null) {
            cls = Object.class;
        }
        return m35117(i, i2, m35114(), cls);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private int m35117(int i, int i2, int i3, Class cls) {
        int i4 = i3 & 1;
        if (i4 != 0) {
            int iM35116 = m35116(i3);
            if (m35118(this.f47836[iM35116]) > i) {
                i2 = m35117(i, i2, iM35116, cls);
            }
        }
        if (i3 >= this.f47843) {
            return i2;
        }
        int iM35118 = m35118(this.f47840[i3]);
        int iM35119 = m35118(this.f47831[i3]);
        if (iM35118 > i && iM35118 < i2 && cls.isInstance(this.f47842[i3])) {
            i2 = iM35118;
        }
        if (iM35119 <= i || iM35119 >= i2 || !cls.isInstance(this.f47842[i3])) {
            iM35119 = i2;
        }
        return (iM35118 >= iM35119 || i4 == 0) ? iM35119 : m35117(i, iM35119, m35113(i3), cls);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private int m35114() {
        return Integer.highestOneBit(this.f47843) - 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private long m35101(int i) {
        int i2 = i & 1;
        long jM35101 = i2 != 0 ? m35101(m35116(i)) : 0L;
        if (i < this.f47843) {
            jM35101 = Math.max(jM35101, this.f47831[i]);
            if (i2 != 0) {
                jM35101 = Math.max(jM35101, m35101(m35113(i)));
            }
        }
        this.f47836[i] = jM35101;
        return jM35101;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m35119() {
        Object[] objArr;
        long[] jArr;
        long[] jArr2;
        int[] iArr;
        int[] iArr2;
        int i;
        if (this.f47843 == 0) {
            return;
        }
        for (int i2 = 1; i2 < this.f47843; i2++) {
            long[] jArr3 = this.f47840;
            long j = jArr3[i2];
            if (j < jArr3[i2 - 1]) {
                Object obj = this.f47842[i2];
                long j2 = this.f47831[i2];
                int i3 = this.f47838[i2];
                int i4 = this.f47844[i2];
                int i5 = i2;
                while (true) {
                    objArr = this.f47842;
                    int i6 = i5 - 1;
                    objArr[i5] = objArr[i6];
                    jArr = this.f47840;
                    jArr[i5] = jArr[i6];
                    jArr2 = this.f47831;
                    jArr2[i5] = jArr2[i6];
                    iArr = this.f47838;
                    iArr[i5] = iArr[i6];
                    iArr2 = this.f47844;
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
                this.f47835 = Math.min(i, this.f47835);
            }
        }
        m35101(m35114());
        if (this.f47832 == null) {
            this.f47832 = new IdentityHashMap();
        }
        for (int i7 = this.f47835; i7 < this.f47843; i7++) {
            Integer num = (Integer) this.f47832.get(this.f47842[i7]);
            if (num == null || num.intValue() != i7) {
                this.f47832.put(this.f47842[i7], Integer.valueOf(i7));
            }
        }
        this.f47835 = Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m35107(String str, long j, long j2) {
        if (j2 < j) {
            throw new IndexOutOfBoundsException(C22697.m50267(C3012.m8976(str, " "), m35103(j, j2), " has end before start"));
        }
        int length = this.f47834.length();
        long j3 = length;
        if (j <= j3 && j2 <= j3) {
            if (j < 0 || j2 < 0) {
                throw new IndexOutOfBoundsException(C22697.m50267(C3012.m8976(str, " "), m35103(j, j2), " starts before 0"));
            }
        } else {
            StringBuilder sbM8976 = C3012.m8976(str, " ");
            sbM8976.append(m35103(j, j2));
            sbM8976.append(" ends beyond length ");
            sbM8976.append(length);
            throw new IndexOutOfBoundsException(sbM8976.toString());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m35111(int i, long j) {
        return (i != 3 || j == 0 || j == ((long) this.f47834.length()) || m35098(j - 1) == '\n') ? false : true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private char m35098(long j) {
        int i = (int) j;
        if (j == i) {
            return this.f47834.charAt(i);
        }
        throw new ArithmeticException();
    }
}
