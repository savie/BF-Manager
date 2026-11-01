package l;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Point;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import android.view.accessibility.CaptioningManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.RandomAccess;

/* JADX INFO: renamed from: l.۬ۚܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 18UV */
/* JADX INFO: loaded from: classes4.dex */
public final class C12909 extends AbstractC17847 implements InterfaceC11841 {

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static final AbstractC10959 f42905 = AbstractC10959.m27715(new C8593());

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f42906 = 0;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C1536 f42907;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Context f42908;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C4441 f42909;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public Boolean f42910;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C17764 f42911;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C2708 f42912;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public Thread f42913;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Object f42914;

    @Override // l.AbstractC8676
    /* JADX INFO: renamed from: ۨ */
    public final InterfaceC11841 mo22499() {
        return this;
    }

    public C12909(ContextWrapper contextWrapper) {
        C17764 c17764 = new C17764();
        C1536 c1536 = C1536.f6235;
        this.f42914 = new Object();
        this.f42908 = contextWrapper.getApplicationContext();
        this.f42911 = c17764;
        if (c1536 != null) {
            this.f42907 = c1536;
        } else {
            c1536.getClass();
            C14238 c14238 = new C14238(c1536);
            c14238.m34369(c1536);
            this.f42907 = new C1536(c14238, 0);
        }
        this.f42912 = C2708.f10419;
        boolean z = this.f42907.f6246;
    }

    @Override // l.AbstractC8676
    /* JADX INFO: renamed from: ۚ */
    public final void mo22498() {
        C4441 c4441;
        synchronized (this.f42914) {
            Thread thread = this.f42913;
            if (thread != null) {
                C2023.m6509("DefaultTrackSelector is accessed on the wrong thread.", thread == Thread.currentThread());
            }
        }
        if (Build.VERSION.SDK_INT >= 32 && (c4441 = this.f42909) != null) {
            c4441.m12392();
            this.f42909 = null;
        }
        super.mo22498();
    }

    @Override // l.AbstractC8676
    /* JADX INFO: renamed from: ܰ */
    public final C14395 mo22500() {
        C1536 c1536;
        synchronized (this.f42914) {
            c1536 = this.f42907;
        }
        return c1536;
    }

    @Override // l.AbstractC8676
    /* JADX INFO: renamed from: ۙ */
    public final void mo22495(C14395 c14395) {
        C1536 c1536;
        if (c14395 instanceof C1536) {
            m31990((C1536) c14395);
        }
        synchronized (this.f42914) {
            c1536 = this.f42907;
        }
        C14238 c14238 = new C14238(c1536);
        c14238.m34369(c14395);
        m31990(new C1536(c14238, 0));
    }

    @Override // l.AbstractC8676
    /* JADX INFO: renamed from: ۙ */
    public final void mo22494(C2708 c2708) {
        if (this.f42912.equals(c2708)) {
            return;
        }
        this.f42912 = c2708;
        m31986();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m31990(C1536 c1536) {
        boolean zEquals;
        synchronized (this.f42914) {
            zEquals = this.f42907.equals(c1536);
            this.f42907 = c1536;
        }
        if (zEquals) {
            return;
        }
        if (c1536.f6246 && this.f42908 == null) {
            C0303.m1848("Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        m22490();
    }

    /* JADX WARN: Code duplicated, block: B:147:0x02b5  */
    @Override // l.AbstractC17847
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Pair mo31995(C21375 c21375, int[][][] iArr, final int[] iArr2, C15274 c15274, AbstractC16511 abstractC16511) {
        final C1536 c1536;
        int i;
        int i2;
        final boolean z;
        final String str;
        final String languageTag;
        boolean z2;
        InterfaceC6558 c18470;
        int i3;
        int[][] iArr3;
        CaptioningManager captioningManager;
        Locale locale;
        Context context;
        synchronized (this.f42914) {
            this.f42913 = Thread.currentThread();
            c1536 = this.f42907;
        }
        if (this.f42910 == null && (context = this.f42908) != null) {
            this.f42910 = Boolean.valueOf(C17983.m41852(context));
        }
        if (c1536.f6246 && Build.VERSION.SDK_INT >= 32 && this.f42909 == null) {
            this.f42909 = new C4441(this.f42908, this, this.f42910);
        }
        int iM47908 = c21375.m47908();
        Context context2 = this.f42908;
        int iM47909 = c21375.m47908();
        C3735[] c3735Arr = new C3735[iM47909];
        int i4 = 0;
        while (true) {
            i = 2;
            i2 = 1;
            if (i4 >= c21375.m47908()) {
                z = false;
                break;
            }
            if (2 == c21375.m47909(i4) && c21375.m47913(i4).f76614 > 0) {
                z = true;
                break;
            }
            i4++;
        }
        Pair pairM31988 = m31988(1, c21375, iArr, new InterfaceC11498() { // from class: l.᩶ۖܰ
            @Override // l.InterfaceC11498
            /* JADX INFO: renamed from: ۙ */
            public final List mo25273(int i5, C17216 c17216, int[] iArr4) {
                C19882 c19882 = this;
                C12909 c12909 = c19882.f63739;
                C1536 c1537 = c1536;
                C17059 c17059 = new C17059(c12909, c1537);
                int i6 = iArr2[i5];
                int i7 = AbstractC22433.f73217;
                C4793 c4793 = new C4793();
                int i8 = 0;
                while (i8 < c17216.f54864) {
                    c4793.m52163(new C5770(i5, c17216, i8, c1537, iArr4[i8], z, c17059, i6));
                    i8++;
                    c19882 = this;
                }
                return c4793.m13309();
            }
        }, new C0125());
        if (pairM31988 != null) {
            c3735Arr[((Integer) pairM31988.second).intValue()] = (C3735) pairM31988.first;
        }
        if (pairM31988 == null) {
            str = null;
        } else {
            C3735 c3735 = (C3735) pairM31988.first;
            str = c3735.f13563.m40159(c3735.f13564[0]).f25269;
        }
        c1536.f47170.getClass();
        final Point pointM41831 = (!c1536.f47167 || context2 == null) ? null : C17983.m41831(context2);
        Pair pairM31989 = m31988(2, c21375, iArr, new InterfaceC11498() { // from class: l.᩷ۖܰ
            /* JADX WARN: Code duplicated, block: B:28:0x004a  */
            @Override // l.InterfaceC11498
            /* JADX INFO: renamed from: ۙ */
            public final List mo25273(int i5, C17216 c17216, int[] iArr4) {
                int i6;
                int i7;
                int i8;
                int i9;
                Point point;
                C20587 c20587 = this;
                int i10 = iArr2[i5];
                C1536 c1537 = c1536;
                Point point2 = pointM41831;
                int i11 = point2 != null ? point2.x : c1537.f47183;
                int i12 = point2 != null ? point2.y : c1537.f47178;
                boolean z3 = c1537.f47196;
                if (i11 == Integer.MAX_VALUE || i12 == Integer.MAX_VALUE) {
                    i6 = Integer.MAX_VALUE;
                } else {
                    int i13 = Integer.MAX_VALUE;
                    for (int i14 = 0; i14 < c17216.f54864; i14++) {
                        C7648 c7648M40159 = c17216.m40159(i14);
                        int i15 = c7648M40159.f25246;
                        int i16 = c7648M40159.f25253;
                        if (i15 > 0 && i16 > 0) {
                            if (!z3) {
                                i8 = i12;
                                i9 = i11;
                            } else if ((i15 > i16) != (i11 > i12)) {
                                i9 = i12;
                                i8 = i11;
                            } else {
                                i8 = i12;
                                i9 = i11;
                            }
                            int i17 = i15 * i8;
                            int i18 = i16 * i9;
                            if (i17 >= i18) {
                                point = new Point(i9, C17983.m41812(i18, i15));
                            } else {
                                point = new Point(C17983.m41812(i17, i16), i8);
                            }
                            int i19 = c7648M40159.f25246;
                            int i20 = i19 * i16;
                            if (i19 >= ((int) (point.x * 0.98f)) && i16 >= ((int) (point.y * 0.98f)) && i20 < i13) {
                                i13 = i20;
                            }
                        }
                    }
                    i6 = i13;
                }
                int i21 = AbstractC22433.f73217;
                C4793 c4793 = new C4793();
                int i22 = 0;
                while (i22 < c17216.f54864) {
                    C7648 c7648M401510 = c17216.m40159(i22);
                    int i23 = c7648M401510.f25246;
                    int i24 = (i23 == -1 || (i7 = c7648M401510.f25253) == -1) ? -1 : i23 * i7;
                    c4793.m52163(new C0913(i5, c17216, i22, c1537, iArr4[i22], str, i10, i6 == Integer.MAX_VALUE || (i24 != -1 && i24 <= i6)));
                    i22++;
                    c20587 = this;
                }
                return c4793.m13309();
            }
        }, new C15649());
        int i5 = 4;
        Pair pairM319810 = (c1536.f47194 || pairM31989 == null) ? m31988(4, c21375, iArr, new InterfaceC11498() { // from class: l.ۤۖܰ
            @Override // l.InterfaceC11498
            /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
            public final List mo25273(int i6, C17216 c17216, int[] iArr4) {
                int i7 = AbstractC22433.f73217;
                C4793 c4793 = new C4793();
                for (int i8 = 0; i8 < c17216.f54864; i8++) {
                    int i9 = i8;
                    c4793.m52163(new C10710(i6, c17216, i9, c1536, iArr4[i8]));
                }
                return c4793.m13309();
            }
        }, new C7181()) : null;
        if (pairM319810 != null) {
            c3735Arr[((Integer) pairM319810.second).intValue()] = (C3735) pairM319810.first;
        } else if (pairM31989 != null) {
            c3735Arr[((Integer) pairM31989.second).intValue()] = (C3735) pairM31989.first;
        }
        if (!c1536.f47172 || context2 == null || (captioningManager = (CaptioningManager) context2.getSystemService("captioning")) == null || !captioningManager.isEnabled() || (locale = captioningManager.getLocale()) == null) {
            languageTag = null;
        } else {
            String str2 = C17983.f57504;
            languageTag = locale.toLanguageTag();
        }
        int i6 = 3;
        Pair pairM319811 = m31988(3, c21375, iArr, new InterfaceC11498() { // from class: l.ܽۖܰ
            @Override // l.InterfaceC11498
            /* JADX INFO: renamed from: ۙ */
            public final List mo25273(int i7, C17216 c17216, int[] iArr4) {
                int i8 = AbstractC22433.f73217;
                C4793 c4793 = new C4793();
                for (int i9 = 0; i9 < c17216.f54864; i9++) {
                    int i10 = i9;
                    c4793.m52163(new C13615(i7, c17216, i10, c1536, iArr4[i9], str, languageTag));
                }
                return c4793.m13309();
            }
        }, new C12121());
        if (pairM319811 != null) {
            c3735Arr[((Integer) pairM319811.second).intValue()] = (C3735) pairM319811.first;
        }
        int i7 = 0;
        while (i7 < iM47909) {
            int iM479010 = c21375.m47909(i7);
            if (iM479010 == i || iM479010 == i2 || iM479010 == i6 || iM479010 == i5) {
                i3 = iM47909;
            } else {
                C23679 c23679M47913 = c21375.m47913(i7);
                int[][] iArr4 = iArr[i7];
                int i8 = 0;
                int i9 = 0;
                C17216 c17216 = null;
                C23410 c23410 = null;
                while (i8 < c23679M47913.f76614) {
                    C17216 c17216M52136 = c23679M47913.m52136(i8);
                    int[] iArr5 = iArr4[i8];
                    C23679 c23679 = c23679M47913;
                    int i10 = 0;
                    while (i10 < c17216M52136.f54864) {
                        int i11 = iM47909;
                        if (C13958.m33815(iArr5[i10], c1536.f6243)) {
                            iArr3 = iArr4;
                            C23410 c23411 = new C23410(c17216M52136.m40159(i10), iArr5[i10]);
                            if (c23410 == null || c23411.compareTo(c23410) > 0) {
                                c23410 = c23411;
                                i9 = i10;
                                c17216 = c17216M52136;
                            }
                        } else {
                            iArr3 = iArr4;
                        }
                        i10++;
                        iM47909 = i11;
                        iArr4 = iArr3;
                    }
                    i8++;
                    c23679M47913 = c23679;
                }
                i3 = iM47909;
                c3735Arr[i7] = c17216 == null ? null : new C3735(0, c17216, new int[]{i9});
            }
            i7++;
            i6 = 3;
            i = 2;
            i2 = 1;
            i5 = 4;
            iM47909 = i3;
        }
        int iM479011 = c21375.m47908();
        HashMap map = new HashMap();
        for (int i12 = 0; i12 < iM479011; i12++) {
            m31992(c21375.m47913(i12), c1536, map);
        }
        m31992(c21375.m47912(), c1536, map);
        for (int i13 = 0; i13 < iM479011; i13++) {
            C5927 c5927 = (C5927) map.get(Integer.valueOf(c21375.m47909(i13)));
            if (c5927 != null) {
                C17216 c17217 = c5927.f20187;
                AbstractC22433 abstractC22433 = c5927.f20188;
                c3735Arr[i13] = (abstractC22433.isEmpty() || c21375.m47913(i13).m52135(c17217) == -1) ? null : new C3735(0, c17217, C17039.m39821(abstractC22433));
            }
        }
        int iM479012 = c21375.m47908();
        for (int i14 = 0; i14 < iM479012; i14++) {
            C23679 c23679M47914 = c21375.m47913(i14);
            if (c1536.m5310(i14, c23679M47914)) {
                if (c1536.m5307(i14, c23679M47914) != null) {
                    throw null;
                }
                c3735Arr[i14] = null;
            }
        }
        for (int i15 = 0; i15 < iM47908; i15++) {
            int iM479013 = c21375.m47909(i15);
            if (c1536.m5309(i15) || c1536.f47182.contains(Integer.valueOf(iM479013))) {
                c3735Arr[i15] = null;
            }
        }
        C17764 c17764 = this.f42911;
        InterfaceC17142 interfaceC17142M22492 = m22492();
        c17764.getClass();
        AbstractC22433 abstractC22433M42830 = C18470.m42830(c3735Arr);
        InterfaceC6558[] interfaceC6558Arr = new InterfaceC6558[c3735Arr.length];
        int i16 = 0;
        while (i16 < c3735Arr.length) {
            C3735 c3736 = c3735Arr[i16];
            if (c3736 != null) {
                int[] iArr6 = c3736.f13564;
                if (iArr6.length == 0) {
                    c3735Arr = c3735Arr;
                    interfaceC6558Arr = interfaceC6558Arr;
                    i16 = i16;
                } else {
                    if (iArr6.length == 1) {
                        c18470 = new C22787(c3736.f13563, new int[]{iArr6[0]});
                    } else {
                        long j = 25000;
                        c18470 = new C18470(c3736.f13563, iArr6, interfaceC17142M22492, 10000, j, j, (AbstractC22433) abstractC22433M42830.get(i16));
                    }
                    interfaceC6558Arr[i16] = c18470;
                }
            } else {
                c3735Arr = c3735Arr;
                interfaceC6558Arr = interfaceC6558Arr;
                i16 = i16;
            }
            i16++;
            c3735Arr = c3735Arr;
            interfaceC6558Arr = interfaceC6558Arr;
        }
        InterfaceC6558[] interfaceC6558Arr2 = interfaceC6558Arr;
        C5490[] c5490Arr = new C5490[iM47908];
        for (int i17 = 0; i17 < iM47908; i17++) {
            c5490Arr[i17] = (c1536.m5309(i17) || c1536.f47182.contains(Integer.valueOf(c21375.m47909(i17))) || (c21375.m47909(i17) != -2 && interfaceC6558Arr2[i17] == null)) ? null : C5490.f18884;
        }
        if (c1536.f6249) {
            int i18 = -1;
            int i19 = 0;
            int i20 = -1;
            while (true) {
                if (i19 >= c21375.m47908()) {
                    z2 = true;
                    break;
                }
                int iM479014 = c21375.m47909(i19);
                InterfaceC6558 interfaceC6558 = interfaceC6558Arr2[i19];
                if ((iM479014 == 1 || iM479014 == 2) && interfaceC6558 != null) {
                    int[][] iArr7 = iArr[i19];
                    int iM52135 = c21375.m47913(i19).m52135(interfaceC6558.mo37959());
                    int i21 = 0;
                    while (true) {
                        if (i21 >= interfaceC6558.length()) {
                            if (iM479014 != 1) {
                                if (i18 == -1) {
                                    i18 = i19;
                                    break;
                                }
                                z2 = false;
                                break;
                            }
                            if (i20 == -1) {
                                i20 = i19;
                                break;
                            }
                            z2 = false;
                            break;
                        }
                        if ((iArr7[iM52135][interfaceC6558.mo36012(i21)] & 32) != 32) {
                            break;
                        }
                        i21++;
                    }
                }
                i19++;
            }
            if (z2 & ((i20 == -1 || i18 == -1) ? false : true)) {
                C5490 c5490 = new C5490(0, true);
                c5490Arr[i20] = c5490;
                c5490Arr[i18] = c5490;
            }
        }
        c1536.f47170.getClass();
        return Pair.create(c5490Arr, interfaceC6558Arr2);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0064 A[FALL_THROUGH] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m31993(C12909 c12909, C1536 c1536, C7648 c7648) {
        Boolean bool;
        C4441 c4441;
        C4441 c4442;
        if (c1536.f6246 && ((bool = c12909.f42910) == null || !bool.booleanValue())) {
            int i = c7648.f25249;
            if (i != -1 && i > 2) {
                String str = c7648.f25265;
                if (str != null) {
                    switch (str) {
                        case "audio/eac3-joc":
                        case "audio/ac3":
                        case "audio/ac4":
                        case "audio/eac3":
                            if (Build.VERSION.SDK_INT >= 32 && (c4442 = c12909.f42909) != null && c4442.m12395()) {
                            }
                        default:
                            if (Build.VERSION.SDK_INT >= 32) {
                                break;
                            }
                            return false;
                    }
                } else if (Build.VERSION.SDK_INT >= 32 || (c4441 = c12909.f42909) == null || !c4441.m12395() || !c12909.f42909.m12393() || !c12909.f42909.m12396() || !c12909.f42909.m12394(c12909.f42912, c7648)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Pair m31988(int i, C21375 c21375, int[][][] iArr, InterfaceC11498 interfaceC11498, Comparator comparator) {
        int i2;
        RandomAccess randomAccessOf;
        ArrayList arrayList = new ArrayList();
        int iM47908 = c21375.m47908();
        int i3 = 0;
        while (i3 < iM47908) {
            if (i == c21375.m47909(i3)) {
                C23679 c23679M47913 = c21375.m47913(i3);
                for (int i4 = 0; i4 < c23679M47913.f76614; i4++) {
                    C17216 c17216M52136 = c23679M47913.m52136(i4);
                    List listMo25273 = interfaceC11498.mo25273(i3, c17216M52136, iArr[i3][i4]);
                    int i5 = c17216M52136.f54864;
                    boolean[] zArr = new boolean[i5];
                    int i6 = 0;
                    while (i6 < i5) {
                        AbstractC2324 abstractC2324 = (AbstractC2324) listMo25273.get(i6);
                        int iMo3634 = abstractC2324.mo3634();
                        if (zArr[i6] || iMo3634 == 0) {
                            i2 = iM47908;
                        } else {
                            if (iMo3634 == 1) {
                                randomAccessOf = AbstractC22433.of((Object) abstractC2324);
                                i2 = iM47908;
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(abstractC2324);
                                int i7 = i6 + 1;
                                while (i7 < i5) {
                                    AbstractC2324 abstractC2325 = (AbstractC2324) listMo25273.get(i7);
                                    int i8 = iM47908;
                                    if (abstractC2325.mo3634() == 2 && abstractC2324.mo3635(abstractC2325)) {
                                        arrayList2.add(abstractC2325);
                                        zArr[i7] = true;
                                    }
                                    i7++;
                                    iM47908 = i8;
                                }
                                i2 = iM47908;
                                randomAccessOf = arrayList2;
                            }
                            arrayList.add(randomAccessOf);
                        }
                        i6++;
                        iM47908 = i2;
                    }
                }
            }
            i3++;
            iM47908 = iM47908;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i9 = 0; i9 < list.size(); i9++) {
            iArr2[i9] = ((AbstractC2324) list.get(i9)).f8253;
        }
        AbstractC2324 abstractC2326 = (AbstractC2324) list.get(0);
        return Pair.create(new C3735(0, abstractC2326.f8251, iArr2), Integer.valueOf(abstractC2326.f8254));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public void m31986() {
        boolean z;
        C4441 c4441;
        synchronized (this.f42914) {
            z = this.f42907.f6246 && Build.VERSION.SDK_INT >= 32 && (c4441 = this.f42909) != null && c4441.m12395();
        }
        if (z) {
            m22490();
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m31996(AbstractC16862 abstractC16862) {
        boolean z;
        synchronized (this.f42914) {
            z = this.f42907.f6245;
        }
        if (z) {
            m22496(abstractC16862);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m31992(C23679 c23679, C14395 c14395, HashMap map) {
        for (int i = 0; i < c23679.f76614; i++) {
            C5927 c5927 = (C5927) c14395.f47176.get(c23679.m52136(i));
            if (c5927 != null) {
                C17216 c17216 = c5927.f20187;
                C5927 c5928 = (C5927) map.get(Integer.valueOf(c17216.f54866));
                if (c5928 == null || (c5928.f20188.isEmpty() && !c5927.f20188.isEmpty())) {
                    map.put(Integer.valueOf(c17216.f54866), c5927);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m31989(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m31987(C7648 c7648, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(c7648.f25269)) {
            return 4;
        }
        String strM31989 = m31989(str);
        String strM319810 = m31989(c7648.f25269);
        if (strM319810 == null || strM31989 == null) {
            return (z && strM319810 == null) ? 1 : 0;
        }
        if (strM319810.startsWith(strM31989) || strM31989.startsWith(strM319810)) {
            return 3;
        }
        String str2 = C17983.f57504;
        return strM319810.split("-", 2)[0].equals(strM31989.split("-", 2)[0]) ? 2 : 0;
    }
}
