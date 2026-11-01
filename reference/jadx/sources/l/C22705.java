package l;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩺ۖܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 5BHG */
/* JADX INFO: loaded from: classes.dex */
public final class C22705 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int f73948;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f73949;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final ArrayList f73950;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C8863 f73951;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C14944 f73952;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final ArrayList f73953;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C0831 f73954;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C12391 f73955;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C5065[] f73956;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C6040[] f73957;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f73958;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C3653[] f73959;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f73960;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C18471 f73961;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C17661 m50324(C12391 c12391, C2325 c2325, C6559 c6559) {
        try {
            C22705 c22705 = new C22705(c12391, c2325, c6559);
            c22705.m50339();
            ArrayList arrayList = c22705.f73950;
            int size = arrayList.size();
            C5667 c5667 = new C5667(size);
            for (int i = 0; i < size; i++) {
                c5667.m15551(i, (C12018) arrayList.get(i));
            }
            c5667.mo9637();
            return new C17661(c5667, c22705.m50321(-1));
        } catch (C21293 e) {
            e.m20021("...while working on method " + c12391.mo30825().mo2376());
            throw e;
        }
    }

    public C22705(C12391 c12391, C2325 c2325, C6559 c6559) {
        this.f73955 = c12391;
        C8863 c8863M48281 = C21562.m48281(c12391);
        this.f73951 = c8863M48281;
        int iM36890 = c8863M48281.m36890();
        this.f73960 = iM36890;
        int iM30823 = c12391.m30823();
        this.f73948 = iM30823;
        C14944 c14944 = new C14944(this, c12391, c2325);
        this.f73952 = c14944;
        this.f73961 = new C18471(c14944, c12391, c6559);
        C6040[] c6040Arr = new C6040[iM36890];
        this.f73957 = c6040Arr;
        this.f73959 = new C3653[iM36890];
        this.f73950 = new ArrayList((c8863M48281.size() * 2) + 10);
        this.f73953 = new ArrayList((c8863M48281.size() * 2) + 10);
        this.f73956 = new C5065[iM36890];
        this.f73958 = false;
        c6040Arr[0] = new C6040(iM30823, c12391.m30829());
        C0831 c0831 = new C0831(iM36890);
        c0831.f3465 = c12391.m30819().size() + iM36890;
        this.f73954 = c0831;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m50321(int i) {
        return this.f73955.m30819().size() + this.f73960 + (~i);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m50319(int i) {
        int size = this.f73955.m30819().size() + this.f73960 + 7;
        ArrayList arrayList = this.f73950;
        C4129 c4129M29916 = ((C12018) arrayList.get(i)).m29916();
        int size2 = c4129M29916.size();
        arrayList.remove(i);
        this.f73953.remove(i);
        for (int i2 = 0; i2 < size2; i2++) {
            int i3 = c4129M29916.get(i2);
            if (i3 >= size) {
                int iM50334 = m50334(i3);
                if (iM50334 < 0) {
                    throw new RuntimeException("Invalid label ".concat(C22475.m49982(i3)));
                }
                m50319(iM50334);
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private int m50333() {
        int size = this.f73955.m30819().size() + this.f73960 + 7;
        Iterator it = this.f73950.iterator();
        while (it.hasNext()) {
            int iMo29913 = ((C12018) it.next()).mo29913();
            if (iMo29913 >= size) {
                size = iMo29913 + 1;
            }
        }
        return size;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private boolean m50332() {
        return (this.f73955.mo30824() & 32) != 0;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private boolean m50320() {
        return (this.f73955.mo30824() & 8) != 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m50341() {
        int iM30829 = this.f73955.m30829() + this.f73948;
        return m50332() ? iM30829 + 1 : iM30829;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private int m50334(int i) {
        ArrayList arrayList = this.f73950;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((C12018) arrayList.get(i2)).mo29913() == i) {
                return i2;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C12018 m50338(int i) {
        int iM50334 = m50334(i);
        if (iM50334 < 0) {
            throw new IllegalArgumentException("no such label ".concat(C22475.m49982(i)));
        }
        return (C12018) this.f73950.get(iM50334);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m50326(C12018 c12018, C4129 c4129) {
        this.f73950.add(c12018);
        c4129.m43642();
        this.f73953.add(c4129);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m50340(C22705 c22705, C12018 c12018, C4129 c4129) {
        ArrayList arrayList = c22705.f73953;
        ArrayList arrayList2 = c22705.f73950;
        int iM50334 = c22705.m50334(c12018.mo29913());
        if (iM50334 >= 0) {
            arrayList2.remove(iM50334);
            arrayList.remove(iM50334);
        }
        arrayList2.add(c12018);
        c4129.m43642();
        arrayList.add(c4129);
    }

    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object, java.lang.String, l.ܺ᩺ܶ] */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m50339() {
        ?? r6;
        char c;
        int i;
        int i2;
        ArrayList arrayList;
        ArrayList arrayList2;
        C21895 c21895;
        boolean z;
        int i3 = this.f73960;
        int[] iArrM24742 = C9754.m24742(i3);
        int i4 = 0;
        C9754.m24734(0, iArrM24742);
        C12391 c12391 = this.f73955;
        C1806 c1806M30820 = c12391.m30820();
        C11312 c11312M30821 = c12391.m30821(0);
        C9672 c9672M6222 = c12391.mo28689().m6222();
        int size = c9672M6222.size();
        C21895 c21896 = new C21895(size + 1);
        int i5 = 0;
        int iM9830 = 0;
        while (i5 < size) {
            C3320 c3320M15264get = c9672M6222.m15264get(i5);
            C14508 c14508M5897 = c1806M30820.m5897(i4, iM9830);
            C1806 c1806 = c1806M30820;
            int i6 = i5;
            c21896.m15260(i6, (AbstractC15546) new C9196(C6372.m17489(c3320M15264get), c11312M30821, c14508M5897 == null ? C16251.m38381(iM9830, c3320M15264get) : C16251.m38384(iM9830, c3320M15264get, c14508M5897.m34926()), C0727.f3015, C21665.m48398(iM9830)));
            iM9830 = c3320M15264get.m9830() + iM9830;
            i5 = i6 + 1;
            c1806M30820 = c1806;
            i4 = 0;
        }
        C12723 c12723 = C6372.f21606;
        C0727 c0727 = C0727.f3015;
        c21896.m15260(size, (AbstractC15546) new C10607(c12723, c11312M30821, (C16251) null, c0727));
        c21896.mo9637();
        boolean zM50332 = m50332();
        int iM50321 = zM50332 ? m50321(-4) : 0;
        C12018 c12018 = new C12018(m50321(-1), c21896, C4129.m11753(iM50321), iM50321);
        C4129 c4129 = C4129.f15128;
        m50326(c12018, c4129);
        int i7 = this.f73948;
        if (zM50332) {
            int iM30829 = c12391.m30829() + i7;
            if (iM30829 < 1) {
                iM30829 = 1;
            }
            C16251 c16251M38381 = C16251.m38381(iM30829, C3320.f12289);
            if (m50320()) {
                C14840 c14840 = new C14840(C6372.f21554, c11312M30821, c0727, C9672.f32573, c12391.mo30828());
                C21895 c21897 = new C21895(1);
                c21897.m15260(0, (AbstractC15546) c14840);
                c21895 = c21897;
                z = false;
                i = 1;
            } else {
                c21895 = new C21895(2);
                c21895.m15260(0, (AbstractC15546) new C9196(C6372.f21605, c11312M30821, c16251M38381, c0727, C21665.f70267));
                z = false;
                i = 1;
                c21895.m15260(1, (AbstractC15546) new C10607(c12723, c11312M30821, (C16251) null, c0727));
            }
            int iM50322 = m50321(-5);
            c21895.mo9637();
            m50326(new C12018(iM50321, c21895, C4129.m11753(iM50322), iM50322), c4129);
            C21895 c21898 = new C21895(m50320() ? 2 : 1);
            if (m50320()) {
                c21898.m15260(0, (AbstractC15546) new C10607(C6372.m17480(c16251M38381), c11312M30821, c16251M38381, c0727));
            }
            c21898.m15260(m50320() ? 1 : 0, (AbstractC15546) new C2138(C6372.f21464, c11312M30821, C0727.m3151(c16251M38381), C9672.f32573));
            c21898.mo9637();
            c = 0;
            m50326(new C12018(iM50322, c21898, C4129.m11753(0), 0), c4129);
            r6 = z;
        } else {
            i3 = i3;
            iArrM24742 = iArrM24742;
            i7 = i7;
            r6 = 0;
            c = 0;
            i = 1;
        }
        C1909 c1909Mo28689 = c12391.mo28689();
        C6040[] c6040Arr = this.f73957;
        c6040Arr[c].m16386(c1909Mo28689.m6222());
        c6040Arr[c].m16388();
        int[] iArr = iArrM24742;
        int i8 = 0;
        while (true) {
            int iM24745 = C9754.m24745(i8, iArr);
            if (iM24745 < 0) {
                break;
            }
            int i9 = i3;
            int i10 = i7;
            C9754.m24740(iM24745, iArr);
            try {
                m50328(this.f73951.m23002(iM24745), c6040Arr[iM24745], iArr);
                i8 = 0;
                i = 1;
                i3 = i9;
                i7 = i10;
            } catch (C21293 e) {
                e.m20021("...while working on block ".concat(C22475.m49982(iM24745)));
                throw e;
            }
        }
        C14944 c14944 = this.f73952;
        C12723 c12723M35696 = c14944.m35696();
        if (c12723M35696 == null) {
            i2 = i7;
        } else {
            C11312 c11312M35702 = c14944.m35702();
            int iM50323 = m50321(-2);
            if (m50332()) {
                C21895 c21899 = new C21895(i);
                C12723 c12724 = C6372.f21489;
                i2 = i7;
                int iM308210 = c12391.m30829() + i2;
                if (iM308210 < i) {
                    iM308210 = 1;
                }
                c21899.m15260(i8, (AbstractC15546) new C2138(c12724, c11312M35702, C0727.m3151(C16251.m38381(iM308210, C3320.f12289)), C9672.f32573));
                c21899.mo9637();
                int iM50324 = m50321(-3);
                m50326(new C12018(iM50323, c21899, C4129.m11753(iM50324), iM50324), C4129.f15128);
                iM50323 = iM50324;
            } else {
                i2 = i7;
            }
            C21895 c218910 = new C21895(i);
            InterfaceC14093 interfaceC14093M31578 = c12723M35696.m31578();
            c218910.m15260(i8, (AbstractC15546) new C10607(c12723M35696, c11312M35702, (C16251) r6, interfaceC14093M31578.size() == 0 ? C0727.f3015 : C0727.m3151(C16251.m38381(i8, interfaceC14093M31578.getType(i8)))));
            c218910.mo9637();
            C4129 c41210 = C4129.f15128;
            m50326(new C12018(iM50323, c218910, c41210, -1), c41210);
        }
        if (this.f73958) {
            C11312 c11312M30822 = c12391.m30821(i8);
            C3320 c3320 = C3320.f12274;
            C16251 c16251M38382 = C16251.m38381(i8, c3320);
            C21895 c218911 = new C21895(2);
            c3320.getClass();
            C9672 c9672 = C9672.f32573;
            c218911.m15260(i8, (AbstractC15546) new C10607(new C12723(4, c3320, c9672, r6), c11312M30822, c16251M38382, C0727.f3015));
            C12723 c12725 = C6372.f21489;
            int iM308211 = c12391.m30829() + i2;
            if (iM308211 < i) {
                iM308211 = 1;
            }
            c218911.m15260(i, (AbstractC15546) new C2138(c12725, c11312M30822, C0727.m3151(C16251.m38381(iM308211, C3320.f12289)), c9672));
            c218911.mo9637();
            int iM50325 = m50321(-7);
            C12018 c12019 = new C12018(m50321(-6), c218911, C4129.m11753(iM50325), iM50325);
            C4129 c41211 = C4129.f15128;
            m50326(c12019, c41211);
            C21895 c218912 = new C21895(i);
            c218912.m15260(i8, (AbstractC15546) new C2138(C6372.f21549, c11312M30822, C0727.m3151(c16251M38382), c9672));
            c218912.mo9637();
            m50326(new C12018(iM50325, c218912, c41211, -1), c41211);
        }
        C5065[] c5065Arr = this.f73956;
        int length = c5065Arr.length;
        for (int i11 = 0; i11 < length; i11++) {
            C5065 c5065 = c5065Arr[i11];
            if (c5065 != null) {
                for (C21999 c21999 : c5065.m14113()) {
                    C11312 c11312M37183 = m50338(i11).m29915().m37183();
                    C21895 c218913 = new C21895(2);
                    C3320 c3320M48811 = c21999.m48811();
                    c3320M48811.getClass();
                    C12723 c12726 = new C12723(4, c3320M48811, C9672.f32573, r6);
                    C16251 c16251M38383 = C16251.m38381(i2, c21999.m48811());
                    C0727 c0728 = C0727.f3015;
                    c218913.m15260(0, (AbstractC15546) new C10607(c12726, c11312M37183, c16251M38383, c0728));
                    c218913.m15260(1, (AbstractC15546) new C10607(C6372.f21606, c11312M37183, (C16251) r6, c0728));
                    c218913.mo9637();
                    m50326(new C12018(c21999.m48812(), c218913, C4129.m11753(i11), i11), c6040Arr[i11].m16379());
                }
            }
        }
        if (!this.f73949) {
            return;
        }
        C4129 c41212 = new C4129(4);
        int i12 = i3;
        m50327(m50338(0), new C11416(this, c41212), new BitSet(i12));
        int iM50333 = m50333();
        ArrayList arrayList3 = new ArrayList(iM50333);
        for (int i13 = 0; i13 < iM50333; i13++) {
            arrayList3.add(r6);
        }
        int i14 = 0;
        while (true) {
            arrayList = this.f73950;
            int size2 = arrayList.size();
            arrayList2 = this.f73953;
            if (i14 >= size2) {
                break;
            }
            C12018 c120110 = (C12018) arrayList.get(i14);
            if (c120110 != null) {
                arrayList3.set(c120110.mo29913(), (C4129) arrayList2.get(i14));
            }
            i14++;
        }
        int size3 = c41212.size();
        for (int i15 = 0; i15 < size3; i15++) {
            new C6476(this, new C12827(m50333()), arrayList3).m17672(m50338(c41212.get(i15)));
        }
        C4129 c41213 = new C4129(arrayList.size());
        arrayList2.clear();
        m50327(m50338(m50321(-1)), new C2242(c41213), new BitSet(i12));
        c41213.m11756();
        int size4 = arrayList.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                return;
            }
            int iM11755 = c41213.m11755(((C12018) arrayList.get(size4)).mo29913());
            if (iM11755 < 0) {
                iM11755 = -1;
            }
            if (iM11755 < 0) {
                arrayList.remove(size4);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m50328(C19446 c19446, C6040 c6040, int[] iArr) {
        int size;
        C3653 c3653;
        int i;
        C4129 c4129M11757;
        int i2;
        int i3;
        C11312 c11312M37183;
        C4129 c4129M11753;
        C7451 c7451M44494 = c19446.m44494();
        C9672 c9672M19933 = c7451M44494.m19933();
        C14944 c14944 = this.f73952;
        c14944.m35694(c9672M19933);
        C6040 c6040M16380 = c6040.m16380();
        this.f73961.m42843(c19446, c6040M16380);
        c6040M16380.m16388();
        int iM35699 = c14944.m35699();
        ArrayList arrayListM35704 = c14944.m35704();
        int size2 = arrayListM35704.size();
        int size3 = c7451M44494.size();
        C4129 c4129M44492 = c19446.m44492();
        boolean zM35697 = c14944.m35697();
        C3653[] c3653Arr = this.f73959;
        if (zM35697) {
            int i4 = c4129M44492.get(1);
            if (c3653Arr[i4] == null) {
                c3653Arr[i4] = new C3653(this, i4);
            }
            c3653Arr[i4].m10764(c19446.mo29913());
            c3653 = c3653Arr[i4];
            size = 1;
        } else {
            if (c14944.m35698()) {
                int iM33078 = c14944.m35701().m33078();
                C3653 c3654 = c3653Arr[iM33078];
                if (c3654 == null) {
                    int iMo29913 = c19446.mo29913();
                    C3653 c3655 = new C3653(this, iM33078);
                    c3655.m10767(iMo29913);
                    c3653Arr[iM33078] = c3655;
                } else {
                    c3654.m10767(c19446.mo29913());
                }
                C4129 c4129M10766 = c3653Arr[iM33078].m10766();
                c3653Arr[iM33078].m10765(c6040M16380, iArr);
                size = c4129M10766.size();
                c4129M44492 = c4129M10766;
            } else {
                size = c14944.m35703() ? size3 : 0;
            }
            c3653 = null;
        }
        C4129 c4129 = c4129M44492;
        C3653 c3656 = c3653;
        int size4 = c4129.size();
        int i5 = size;
        while (i5 < size4) {
            int i6 = c4129.get(i5);
            try {
                int i7 = i5;
                int i8 = size4;
                C4129 c41210 = c4129;
                m50325(i6, c19446.mo29913(), c3656, c6040M16380, iArr);
                i5 = i7 + 1;
                size4 = i8;
                c4129 = c41210;
            } catch (C21293 e) {
                e.m20021("...while merging to block ".concat(C22475.m49982(i6)));
                throw e;
            }
        }
        int i9 = size4;
        C4129 c41211 = c4129;
        if (i9 == 0 && c14944.m35695()) {
            c4129M11757 = C4129.m11753(m50321(-2));
            i = 1;
        } else {
            i = i9;
            c4129M11757 = c41211;
        }
        if (i == 0) {
            i2 = -1;
        } else {
            int iM35700 = c14944.m35700();
            if (iM35700 >= 0) {
                iM35700 = c4129M11757.get(iM35700);
            }
            i2 = iM35700;
        }
        boolean z = m50332() && c14944.m35705();
        if (z || size3 != 0) {
            C4129 c41212 = new C4129(i);
            boolean z2 = false;
            int i10 = 0;
            while (i10 < size3) {
                C10274 c10274M15269get = c7451M44494.m15269get(i10);
                C6143 c6143M26063 = c10274M15269get.m26063();
                int iM26062 = c10274M15269get.m26062();
                boolean z3 = (c6143M26063 == C6143.f20966) | z2;
                try {
                    C7451 c7451 = c7451M44494;
                    int i11 = i2;
                    int i12 = i10;
                    C4129 c41213 = c41212;
                    m50325(iM26062, c19446.mo29913(), null, c6040M16380.m16384(c6143M26063), iArr);
                    C5065[] c5065Arr = this.f73956;
                    C5065 c5065 = c5065Arr[iM26062];
                    if (c5065 == null) {
                        c5065 = new C5065(this);
                        c5065Arr[iM26062] = c5065;
                    }
                    c41213.add(c5065.m14114(c6143M26063.m17128()).m48812());
                    i10 = i12 + 1;
                    i2 = i11;
                    c41212 = c41213;
                    z2 = z3;
                    c7451M44494 = c7451;
                } catch (C21293 e2) {
                    e2.m20021("...while merging exception to block ".concat(C22475.m49982(iM26062)));
                    throw e2;
                }
            }
            i3 = i2;
            C4129 c41214 = c41212;
            if (z && !z2) {
                c41214.add(m50321(-6));
                this.f73958 = true;
                for (int i13 = (size2 - iM35699) - 1; i13 < size2; i13++) {
                    AbstractC15546 abstractC15546 = (AbstractC15546) arrayListM35704.get(i13);
                    if (abstractC15546.m37184()) {
                        arrayListM35704.set(i13, abstractC15546.mo6697(C3320.f12289));
                    }
                }
            }
            if (i3 >= 0) {
                c41214.add(i3);
            }
            c41214.mo9637();
            c4129M11757 = c41214;
        } else {
            i3 = i2;
        }
        int iM11755 = c4129M11757.m11755(i3);
        if (iM11755 < 0) {
            iM11755 = -1;
        }
        int i14 = i3;
        while (iM35699 > 0) {
            size2--;
            AbstractC15546 abstractC15547 = (AbstractC15546) arrayListM35704.get(size2);
            boolean z4 = abstractC15547.m37181().m31577() == 1;
            C21895 c21895 = new C21895(z4 ? 2 : 1);
            c21895.m15260(0, abstractC15547);
            if (z4) {
                c21895.m15260(1, (AbstractC15546) new C10607(C6372.f21606, abstractC15547.m37183(), (C16251) null, C0727.f3015));
                c4129M11753 = C4129.m11753(i14);
            } else {
                c4129M11753 = c4129M11757;
            }
            c21895.mo9637();
            int iM50333 = m50333();
            m50326(new C12018(iM50333, c21895, c4129M11753, i14), c6040M16380.m16379());
            c4129M11757 = c4129M11757.m11757();
            c4129M11757.set(iM11755, iM50333);
            c4129M11757.mo9637();
            iM35699--;
            i14 = iM50333;
        }
        AbstractC15546 abstractC15548 = size2 == 0 ? null : (AbstractC15546) arrayListM35704.get(size2 - 1);
        if (abstractC15548 == null || abstractC15548.m37181().m31577() == 1) {
            if (abstractC15548 == null) {
                c11312M37183 = C11312.f38175;
            } else {
                c11312M37183 = abstractC15548.m37183();
            }
            arrayListM35704.add(new C10607(C6372.f21606, c11312M37183, (C16251) null, C0727.f3015));
            size2++;
        }
        C21895 c21896 = new C21895(size2);
        for (int i15 = 0; i15 < size2; i15++) {
            c21896.m15260(i15, (AbstractC15546) arrayListM35704.get(i15));
        }
        c21896.mo9637();
        C12018 c12018 = new C12018(c19446.mo29913(), c21896, c4129M11757, i14);
        C4129 c4129M16379 = c6040M16380.m16379();
        int iM50334 = m50334(c12018.mo29913());
        if (iM50334 >= 0) {
            m50319(iM50334);
        }
        this.f73950.add(c12018);
        c4129M16379.m43642();
        this.f73953.add(c4129M16379);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m50325(int i, int i2, C3653 c3653, C6040 c6040, int[] iArr) {
        C6040 c6040M16382;
        C6040[] c6040Arr = this.f73957;
        C6040 c6041 = c6040Arr[i];
        if (c6041 == null) {
            if (c3653 != null) {
                c6040Arr[i] = c6040.m16381(i, i2);
            } else {
                c6040Arr[i] = c6040;
            }
            C9754.m24734(i, iArr);
            return;
        }
        if (c3653 != null) {
            c6040M16382 = c6041.m16383(c6040, c3653.m10763(), i2);
        } else {
            c6040M16382 = c6041.m16382(c6040);
        }
        if (c6040M16382 != c6041) {
            c6040Arr[i] = c6040M16382;
            C9754.m24734(i, iArr);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m50331(C22705 c22705, C12018 c12018) {
        C4129 c4129M29916 = c12018.m29916();
        if (c4129M29916.size() < 2) {
            return false;
        }
        int i = c4129M29916.get(1);
        C3653[] c3653Arr = c22705.f73959;
        return i < c3653Arr.length && c3653Arr[i] != null;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C3653 m50337(C22705 c22705, int i) {
        C3653[] c3653Arr = c22705.f73959;
        int length = c3653Arr.length;
        while (true) {
            length--;
            if (length < 0) {
                return null;
            }
            C3653 c3653 = c3653Arr[length];
            if (c3653 != null && c3653.f13391.get(i)) {
                return c3653;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003d  */
    /* JADX WARN: Code duplicated, block: B:18:0x0043  */
    /* JADX WARN: Code duplicated, block: B:23:0x004e A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m50327(C12018 c12018, InterfaceC14135 interfaceC14135, BitSet bitSet) {
        int iM50334;
        interfaceC14135.mo6886(c12018);
        bitSet.set(c12018.mo29913());
        C4129 c4129M29916 = c12018.m29916();
        int size = c4129M29916.size();
        for (int i = 0; i < size; i++) {
            int i2 = c4129M29916.get(i);
            if (!bitSet.get(i2)) {
                C4129 c4129M29917 = c12018.m29916();
                if (c4129M29917.size() >= 2) {
                    int i3 = c4129M29917.get(1);
                    C3653[] c3653Arr = this.f73959;
                    if (i3 >= c3653Arr.length || c3653Arr[i3] == null || i <= 0) {
                        iM50334 = m50334(i2);
                        if (iM50334 >= 0) {
                            m50327((C12018) this.f73950.get(iM50334), interfaceC14135, bitSet);
                        }
                    }
                } else {
                    iM50334 = m50334(i2);
                    if (iM50334 >= 0) {
                        m50327((C12018) this.f73950.get(iM50334), interfaceC14135, bitSet);
                    }
                }
            }
        }
    }
}
