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

/* JADX INFO: renamed from: l.ᩳ᩸᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 18UV */
/* JADX INFO: loaded from: classes5.dex */
public final class C19369 extends AbstractC7436 implements InterfaceC21156 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final AbstractC18753 f62578 = AbstractC18753.m43551(new C14324(1));

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f62579 = 0;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C24591 f62580;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public Thread f62581;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C18412 f62582;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C13796 f62583;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C20861 f62584;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Object f62585;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public Boolean f62586;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Context f62587;

    @Override // l.AbstractC11076
    /* JADX INFO: renamed from: ۤ */
    public final InterfaceC21156 mo27989() {
        return this;
    }

    public C19369(ContextWrapper contextWrapper) {
        C13796 c13796 = new C13796();
        C20861 c20861 = C20861.f66765;
        this.f62585 = new Object();
        this.f62587 = contextWrapper.getApplicationContext();
        this.f62583 = c13796;
        if (c20861 != null) {
            this.f62584 = c20861;
        } else {
            c20861.getClass();
            C3707 c3707 = new C3707(c20861);
            c3707.m12050(c20861);
            this.f62584 = new C20861(c3707, 0);
        }
        this.f62582 = C18412.f59977;
        boolean z = this.f62584.f66768;
    }

    @Override // l.AbstractC11076
    /* JADX INFO: renamed from: ᩴ */
    public final void mo27990() {
        C24591 c24591;
        synchronized (this.f62585) {
            Thread thread = this.f62581;
            if (thread != null) {
                C20782.m47567("DefaultTrackSelector is accessed on the wrong thread.", thread == Thread.currentThread());
            }
        }
        if (Build.VERSION.SDK_INT >= 32 && (c24591 = this.f62580) != null) {
            c24591.m54911();
            this.f62580 = null;
        }
        super.mo27990();
    }

    @Override // l.AbstractC11076
    /* JADX INFO: renamed from: ᩷ */
    public final C3125 mo27991() {
        C20861 c20861;
        synchronized (this.f62585) {
            c20861 = this.f62584;
        }
        return c20861;
    }

    @Override // l.AbstractC11076
    /* JADX INFO: renamed from: ۙ */
    public final void mo27985(C3125 c3125) {
        C20861 c20861;
        if (c3125 instanceof C20861) {
            m44791((C20861) c3125);
        }
        synchronized (this.f62585) {
            c20861 = this.f62584;
        }
        C3707 c3707 = new C3707(c20861);
        c3707.m12050(c3125);
        m44791(new C20861(c3707, 0));
    }

    @Override // l.AbstractC11076
    /* JADX INFO: renamed from: ۙ */
    public final void mo27986(C18412 c18412) {
        if (this.f62582.equals(c18412)) {
            return;
        }
        this.f62582 = c18412;
        m44793();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m44791(C20861 c20861) {
        boolean zEquals;
        synchronized (this.f62585) {
            zEquals = this.f62584.equals(c20861);
            this.f62584 = c20861;
        }
        if (zEquals) {
            return;
        }
        if (c20861.f66768 && this.f62587 == null) {
            C1896.m6517("Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        m27992();
    }

    /* JADX WARN: Code duplicated, block: B:147:0x02b5  */
    @Override // l.AbstractC7436
    /* JADX INFO: renamed from: ۙ */
    public final Pair mo20379(C8927 c8927, int[][][] iArr, final int[] iArr2, C8402 c8402, AbstractC24755 abstractC24755) {
        final C20861 c20861;
        int i;
        int i2;
        final boolean z;
        final String str;
        final String languageTag;
        boolean z2;
        AbstractC11164 c5199;
        int i3;
        int[][] iArr3;
        CaptioningManager captioningManager;
        Locale locale;
        Context context;
        synchronized (this.f62585) {
            this.f62581 = Thread.currentThread();
            c20861 = this.f62584;
        }
        if (this.f62586 == null && (context = this.f62587) != null) {
            this.f62586 = Boolean.valueOf(C7116.m19498(context));
        }
        if (c20861.f66768 && Build.VERSION.SDK_INT >= 32 && this.f62580 == null) {
            this.f62580 = new C24591(this.f62587, this, this.f62586);
        }
        int iM23834 = c8927.m23834();
        Context context2 = this.f62587;
        int iM23835 = c8927.m23834();
        C10418[] c10418Arr = new C10418[iM23835];
        int i4 = 0;
        while (true) {
            i = 2;
            i2 = 1;
            if (i4 >= c8927.m23834()) {
                z = false;
                break;
            }
            if (2 == c8927.m23835(i4) && c8927.m23839(i4).f10965 > 0) {
                z = true;
                break;
            }
            i4++;
        }
        Pair pairM44787 = m44787(1, c8927, iArr, new InterfaceC14893() { // from class: l.ۚ᩸᩷
            @Override // l.InterfaceC14893
            /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
            public final List mo17300(int i5, C16549 c16549, int[] iArr4) {
                C5945 c5945 = this;
                C19369 c19369 = c5945.f20359;
                C20861 c20862 = c20861;
                C17131 c17131 = new C17131(c19369, c20862);
                int i6 = iArr2[i5];
                int i7 = AbstractC1928.f6477;
                C22811 c22811 = new C22811();
                int i8 = 0;
                while (i8 < c16549.f53567) {
                    c22811.m19807(new C17877(i5, c16549, i8, c20862, iArr4[i8], z, c17131, i6));
                    i8++;
                    c5945 = this;
                }
                return c22811.m51441();
            }
        }, new C2216());
        if (pairM44787 != null) {
            c10418Arr[((Integer) pairM44787.second).intValue()] = (C10418) pairM44787.first;
        }
        if (pairM44787 == null) {
            str = null;
        } else {
            C10418 c10418 = (C10418) pairM44787.first;
            str = c10418.f33115.m39194(c10418.f33116[0]).f50811;
        }
        c20861.f10111.getClass();
        final Point pointM19478 = (!c20861.f10120 || context2 == null) ? null : C7116.m19478(context2);
        Pair pairM44788 = m44787(2, c8927, iArr, new InterfaceC14893() { // from class: l.ܳ᩸᩷
            /* JADX WARN: Code duplicated, block: B:28:0x004a  */
            @Override // l.InterfaceC14893
            /* JADX INFO: renamed from: ۙ */
            public final List mo17300(int i5, C16549 c16549, int[] iArr4) {
                int i6;
                int i7;
                int i8;
                int i9;
                Point point;
                C15639 c15639 = this;
                int i10 = iArr2[i5];
                C20861 c20862 = c20861;
                Point point2 = pointM19478;
                int i11 = point2 != null ? point2.x : c20862.f10108;
                int i12 = point2 != null ? point2.y : c20862.f10106;
                boolean z3 = c20862.f10115;
                if (i11 == Integer.MAX_VALUE || i12 == Integer.MAX_VALUE) {
                    i6 = Integer.MAX_VALUE;
                } else {
                    int i13 = Integer.MAX_VALUE;
                    for (int i14 = 0; i14 < c16549.f53567; i14++) {
                        C15648 c15648M39194 = c16549.m39194(i14);
                        int i15 = c15648M39194.f50814;
                        int i16 = c15648M39194.f50852;
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
                                point = new Point(i9, C7116.m19459(i18, i15));
                            } else {
                                point = new Point(C7116.m19459(i17, i16), i8);
                            }
                            int i19 = c15648M39194.f50814;
                            int i20 = i19 * i16;
                            if (i19 >= ((int) (point.x * 0.98f)) && i16 >= ((int) (point.y * 0.98f)) && i20 < i13) {
                                i13 = i20;
                            }
                        }
                    }
                    i6 = i13;
                }
                int i21 = AbstractC1928.f6477;
                C22811 c22811 = new C22811();
                int i22 = 0;
                while (i22 < c16549.f53567) {
                    C15648 c15648M39195 = c16549.m39194(i22);
                    int i23 = c15648M39195.f50814;
                    int i24 = (i23 == -1 || (i7 = c15648M39195.f50852) == -1) ? -1 : i23 * i7;
                    c22811.m19807(new C8182(i5, c16549, i22, c20862, iArr4[i22], str, i10, i6 == Integer.MAX_VALUE || (i24 != -1 && i24 <= i6)));
                    i22++;
                    c15639 = this;
                }
                return c22811.m51441();
            }
        }, new C13402());
        int i5 = 4;
        Pair pairM44789 = (c20861.f10122 || pairM44788 == null) ? m44787(4, c8927, iArr, new InterfaceC14893() { // from class: l.᩸᩸᩷
            @Override // l.InterfaceC14893
            /* JADX INFO: renamed from: ۙ */
            public final List mo17300(int i6, C16549 c16549, int[] iArr4) {
                int i7 = AbstractC1928.f6477;
                C22811 c22811 = new C22811();
                for (int i8 = 0; i8 < c16549.f53567; i8++) {
                    int i9 = i8;
                    c22811.m19807(new C16385(i6, c16549, i9, c20861, iArr4[i8]));
                }
                return c22811.m51441();
            }
        }, new C20115()) : null;
        if (pairM44789 != null) {
            c10418Arr[((Integer) pairM44789.second).intValue()] = (C10418) pairM44789.first;
        } else if (pairM44788 != null) {
            c10418Arr[((Integer) pairM44788.second).intValue()] = (C10418) pairM44788.first;
        }
        if (!c20861.f10116 || context2 == null || (captioningManager = (CaptioningManager) context2.getSystemService("captioning")) == null || !captioningManager.isEnabled() || (locale = captioningManager.getLocale()) == null) {
            languageTag = null;
        } else {
            String str2 = C7116.f23455;
            languageTag = locale.toLanguageTag();
        }
        int i6 = 3;
        Pair pairM447810 = m44787(3, c8927, iArr, new InterfaceC14893() { // from class: l.ۧ᩸᩷
            @Override // l.InterfaceC14893
            /* JADX INFO: renamed from: ۙ */
            public final List mo17300(int i7, C16549 c16549, int[] iArr4) {
                int i8 = AbstractC1928.f6477;
                C22811 c22811 = new C22811();
                for (int i9 = 0; i9 < c16549.f53567; i9++) {
                    int i10 = i9;
                    c22811.m19807(new C4453(i7, c16549, i10, c20861, iArr4[i9], str, languageTag));
                }
                return c22811.m51441();
            }
        }, new C25337());
        if (pairM447810 != null) {
            c10418Arr[((Integer) pairM447810.second).intValue()] = (C10418) pairM447810.first;
        }
        int i7 = 0;
        while (i7 < iM23835) {
            int iM23836 = c8927.m23835(i7);
            if (iM23836 == i || iM23836 == i2 || iM23836 == i6 || iM23836 == i5) {
                i3 = iM23835;
            } else {
                C3356 c3356M23839 = c8927.m23839(i7);
                int[][] iArr4 = iArr[i7];
                int i8 = 0;
                int i9 = 0;
                C16549 c16549 = null;
                C23845 c23845 = null;
                while (i8 < c3356M23839.f10965) {
                    C16549 c16549M11056 = c3356M23839.m11056(i8);
                    int[] iArr5 = iArr4[i8];
                    C3356 c3356 = c3356M23839;
                    int i10 = 0;
                    while (i10 < c16549M11056.f53567) {
                        int i11 = iM23835;
                        if (C14442.m34867(iArr5[i10], c20861.f66772)) {
                            iArr3 = iArr4;
                            C23845 c23846 = new C23845(c16549M11056.m39194(i10), iArr5[i10]);
                            if (c23845 == null || c23846.compareTo(c23845) > 0) {
                                c23845 = c23846;
                                i9 = i10;
                                c16549 = c16549M11056;
                            }
                        } else {
                            iArr3 = iArr4;
                        }
                        i10++;
                        iM23835 = i11;
                        iArr4 = iArr3;
                    }
                    i8++;
                    c3356M23839 = c3356;
                }
                i3 = iM23835;
                c10418Arr[i7] = c16549 == null ? null : new C10418(0, c16549, new int[]{i9});
            }
            i7++;
            i6 = 3;
            i = 2;
            i2 = 1;
            i5 = 4;
            iM23835 = i3;
        }
        int iM23837 = c8927.m23834();
        HashMap map = new HashMap();
        for (int i12 = 0; i12 < iM23837; i12++) {
            m44789(c8927.m23839(i12), c20861, map);
        }
        m44789(c8927.m23838(), c20861, map);
        for (int i13 = 0; i13 < iM23837; i13++) {
            C17295 c17295 = (C17295) map.get(Integer.valueOf(c8927.m23835(i13)));
            if (c17295 != null) {
                C16549 c165410 = c17295.f56324;
                AbstractC1928 abstractC1928 = c17295.f56325;
                c10418Arr[i13] = (abstractC1928.isEmpty() || c8927.m23839(i13).m11054(c165410) == -1) ? null : new C10418(0, c165410, C18444.m42973(abstractC1928));
            }
        }
        int iM23838 = c8927.m23834();
        for (int i14 = 0; i14 < iM23838; i14++) {
            C3356 c3356M238310 = c8927.m23839(i14);
            if (c20861.m47688(i14, c3356M238310)) {
                if (c20861.m47686(i14, c3356M238310) != null) {
                    throw null;
                }
                c10418Arr[i14] = null;
            }
        }
        for (int i15 = 0; i15 < iM23834; i15++) {
            int iM23839 = c8927.m23835(i15);
            if (c20861.m47687(i15) || c20861.f10131.contains(Integer.valueOf(iM23839))) {
                c10418Arr[i15] = null;
            }
        }
        C13796 c13796 = this.f62583;
        InterfaceC17043 interfaceC17043M27984 = m27984();
        c13796.getClass();
        AbstractC1928 abstractC1928M15622 = C5199.m15622(c10418Arr);
        InterfaceC1470[] interfaceC1470Arr = new InterfaceC1470[c10418Arr.length];
        int i16 = 0;
        while (i16 < c10418Arr.length) {
            C10418 c10419 = c10418Arr[i16];
            if (c10419 != null) {
                int[] iArr6 = c10419.f33116;
                if (iArr6.length == 0) {
                    c10418Arr = c10418Arr;
                    interfaceC1470Arr = interfaceC1470Arr;
                    i16 = i16;
                } else {
                    if (iArr6.length == 1) {
                        c5199 = new C9672(c10419.f33115, new int[]{iArr6[0]});
                    } else {
                        long j = 25000;
                        c5199 = new C5199(c10419.f33115, iArr6, interfaceC17043M27984, 10000, j, j, (AbstractC1928) abstractC1928M15622.get(i16));
                    }
                    interfaceC1470Arr[i16] = c5199;
                }
            } else {
                c10418Arr = c10418Arr;
                interfaceC1470Arr = interfaceC1470Arr;
                i16 = i16;
            }
            i16++;
            c10418Arr = c10418Arr;
            interfaceC1470Arr = interfaceC1470Arr;
        }
        InterfaceC1470[] interfaceC1470Arr2 = interfaceC1470Arr;
        C0273[] c0273Arr = new C0273[iM23834];
        for (int i17 = 0; i17 < iM23834; i17++) {
            c0273Arr[i17] = (c20861.m47687(i17) || c20861.f10131.contains(Integer.valueOf(c8927.m23835(i17))) || (c8927.m23835(i17) != -2 && interfaceC1470Arr2[i17] == null)) ? null : C0273.f1569;
        }
        if (c20861.f66776) {
            int i18 = -1;
            int i19 = 0;
            int i20 = -1;
            while (true) {
                if (i19 >= c8927.m23834()) {
                    z2 = true;
                    break;
                }
                int iM238310 = c8927.m23835(i19);
                InterfaceC1470 interfaceC1470 = interfaceC1470Arr2[i19];
                if ((iM238310 == 1 || iM238310 == 2) && interfaceC1470 != null) {
                    int[][] iArr7 = iArr[i19];
                    int iM11054 = c8927.m23839(i19).m11054(interfaceC1470.mo17236());
                    int i21 = 0;
                    while (true) {
                        if (i21 >= interfaceC1470.length()) {
                            if (iM238310 != 1) {
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
                        if ((iArr7[iM11054][interfaceC1470.mo9649(i21)] & 32) != 32) {
                            break;
                        }
                        i21++;
                    }
                }
                i19++;
            }
            if (z2 & ((i20 == -1 || i18 == -1) ? false : true)) {
                C0273 c0273 = new C0273(0, true);
                c0273Arr[i20] = c0273;
                c0273Arr[i18] = c0273;
            }
        }
        c20861.f10111.getClass();
        return Pair.create(c0273Arr, interfaceC1470Arr2);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0064 A[FALL_THROUGH] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m44792(C19369 c19369, C20861 c20861, C15648 c15648) {
        Boolean bool;
        C24591 c24591;
        C24591 c24592;
        if (c20861.f66768 && ((bool = c19369.f62586) == null || !bool.booleanValue())) {
            int i = c15648.f50843;
            if (i != -1 && i > 2) {
                String str = c15648.f50848;
                if (str != null) {
                    switch (str) {
                        case "audio/eac3-joc":
                        case "audio/ac3":
                        case "audio/ac4":
                        case "audio/eac3":
                            if (Build.VERSION.SDK_INT >= 32 && (c24592 = c19369.f62580) != null && c24592.m54909()) {
                            }
                        default:
                            if (Build.VERSION.SDK_INT >= 32) {
                                break;
                            }
                            return false;
                    }
                } else if (Build.VERSION.SDK_INT >= 32 || (c24591 = c19369.f62580) == null || !c24591.m54909() || !c19369.f62580.m54907() || !c19369.f62580.m54910() || !c19369.f62580.m54908(c19369.f62582, c15648)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Pair m44787(int i, C8927 c8927, int[][][] iArr, InterfaceC14893 interfaceC14893, Comparator comparator) {
        int i2;
        RandomAccess randomAccessOf;
        ArrayList arrayList = new ArrayList();
        int iM23834 = c8927.m23834();
        int i3 = 0;
        while (i3 < iM23834) {
            if (i == c8927.m23835(i3)) {
                C3356 c3356M23839 = c8927.m23839(i3);
                for (int i4 = 0; i4 < c3356M23839.f10965; i4++) {
                    C16549 c16549M11056 = c3356M23839.m11056(i4);
                    List listMo17300 = interfaceC14893.mo17300(i3, c16549M11056, iArr[i3][i4]);
                    int i5 = c16549M11056.f53567;
                    boolean[] zArr = new boolean[i5];
                    int i6 = 0;
                    while (i6 < i5) {
                        AbstractC21607 abstractC21607 = (AbstractC21607) listMo17300.get(i6);
                        int iMo14149 = abstractC21607.mo14149();
                        if (zArr[i6] || iMo14149 == 0) {
                            i2 = iM23834;
                        } else {
                            if (iMo14149 == 1) {
                                randomAccessOf = AbstractC1928.of((Object) abstractC21607);
                                i2 = iM23834;
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(abstractC21607);
                                int i7 = i6 + 1;
                                while (i7 < i5) {
                                    AbstractC21607 abstractC21608 = (AbstractC21607) listMo17300.get(i7);
                                    int i8 = iM23834;
                                    if (abstractC21608.mo14149() == 2 && abstractC21607.mo14151(abstractC21608)) {
                                        arrayList2.add(abstractC21608);
                                        zArr[i7] = true;
                                    }
                                    i7++;
                                    iM23834 = i8;
                                }
                                i2 = iM23834;
                                randomAccessOf = arrayList2;
                            }
                            arrayList.add(randomAccessOf);
                        }
                        i6++;
                        iM23834 = i2;
                    }
                }
            }
            i3++;
            iM23834 = iM23834;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i9 = 0; i9 < list.size(); i9++) {
            iArr2[i9] = ((AbstractC21607) list.get(i9)).f69018;
        }
        AbstractC21607 abstractC21609 = (AbstractC21607) list.get(0);
        return Pair.create(new C10418(0, abstractC21609.f69020, iArr2), Integer.valueOf(abstractC21609.f69021));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public void m44793() {
        boolean z;
        C24591 c24591;
        synchronized (this.f62585) {
            z = this.f62584.f66768 && Build.VERSION.SDK_INT >= 32 && (c24591 = this.f62580) != null && c24591.m54909();
        }
        if (z) {
            m27992();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m44795(AbstractC25280 abstractC25280) {
        boolean z;
        synchronized (this.f62585) {
            z = this.f62584.f66771;
        }
        if (z) {
            m27988(abstractC25280);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m44789(C3356 c3356, C3125 c3125, HashMap map) {
        for (int i = 0; i < c3356.f10965; i++) {
            C17295 c17295 = (C17295) c3125.f10119.get(c3356.m11056(i));
            if (c17295 != null) {
                C16549 c16549 = c17295.f56324;
                C17295 c17296 = (C17295) map.get(Integer.valueOf(c16549.f53565));
                if (c17296 == null || (c17296.f56325.isEmpty() && !c17295.f56325.isEmpty())) {
                    map.put(Integer.valueOf(c16549.f53565), c17295);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m44788(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m44786(C15648 c15648, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(c15648.f50811)) {
            return 4;
        }
        String strM44788 = m44788(str);
        String strM44789 = m44788(c15648.f50811);
        if (strM44789 == null || strM44788 == null) {
            return (z && strM44789 == null) ? 1 : 0;
        }
        if (strM44789.startsWith(strM44788) || strM44788.startsWith(strM44789)) {
            return 3;
        }
        String str2 = C7116.f23455;
        return strM44789.split("-", 2)[0].equals(strM44788.split("-", 2)[0]) ? 2 : 0;
    }
}
