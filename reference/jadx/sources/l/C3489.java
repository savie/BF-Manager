package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ۗ᩷᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: E5GV */
/* JADX INFO: loaded from: classes2.dex */
public final class C3489 extends AbstractC9011 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C2078[] f12793;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C9841[] f12794;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C2078[] f12795;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C9841[] f12796;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C13929 f12797;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C3489 c3489 = (C3489) obj;
        C13929 c13929 = this.f12797;
        if (c13929 == null) {
            return c3489.f12797 == null ? 0 : -1;
        }
        C13929 c139210 = c3489.f12797;
        if (c139210 == null) {
            return 1;
        }
        return c13929.f30807 - c139210.f30807;
    }

    public C3489(C12063 c12063) {
        super(c12063);
        this.f12797 = null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3489 m10224(C12063 c12063) {
        C2078[] c2078Arr;
        C2078[] c2078Arr2;
        C9841[] c9841Arr;
        C9841[] c9841Arr2;
        C2078[] c2078Arr3 = this.f12793;
        if (c2078Arr3 == null || c2078Arr3.length == 0) {
            c2078Arr = null;
        } else {
            c2078Arr = new C2078[c2078Arr3.length];
            int length = c2078Arr3.length;
            for (int i = 0; i < length; i++) {
                C2078 c2078 = this.f12793[i];
                c2078Arr[i] = new C2078(c2078.f7681.m43562(c12063), c2078.f7680);
            }
        }
        C2078[] c2078Arr4 = this.f12795;
        if (c2078Arr4 == null || c2078Arr4.length == 0) {
            c2078Arr2 = null;
        } else {
            c2078Arr2 = new C2078[c2078Arr4.length];
            int length2 = c2078Arr4.length;
            for (int i2 = 0; i2 < length2; i2++) {
                C2078 c2079 = this.f12795[i2];
                c2078Arr2[i2] = new C2078(c2079.f7681.m43562(c12063), c2079.f7680);
            }
        }
        C9841[] c9841Arr3 = this.f12796;
        if (c9841Arr3 == null || c9841Arr3.length == 0) {
            c9841Arr = null;
        } else {
            c9841Arr = new C9841[c9841Arr3.length];
            int length3 = c9841Arr3.length;
            for (int i3 = 0; i3 < length3; i3++) {
                C9841 c9841 = this.f12796[i3];
                C20299 c20299M45812 = c9841.f33621.m45812(c12063);
                int i4 = c9841.f33622;
                C17706 c17706 = c9841.f33623;
                c9841Arr[i3] = new C9841(c20299M45812, i4, c17706 != null ? c17706.m41252(c12063) : null);
            }
        }
        C9841[] c9841Arr4 = this.f12794;
        if (c9841Arr4 == null || c9841Arr4.length == 0) {
            c9841Arr2 = null;
        } else {
            c9841Arr2 = new C9841[c9841Arr4.length];
            int length4 = c9841Arr4.length;
            for (int i5 = 0; i5 < length4; i5++) {
                C9841 c9842 = this.f12794[i5];
                C20299 c20299M45813 = c9842.f33621.m45812(c12063);
                int i6 = c9842.f33622;
                C17706 c17707 = c9842.f33623;
                c9841Arr2[i5] = new C9841(c20299M45813, i6, c17707 != null ? c17707.m41252(c12063) : null);
            }
        }
        C3489 c3489 = new C3489(c12063);
        c3489.f12797 = null;
        if (c2078Arr == null) {
            c2078Arr = new C2078[0];
        }
        c3489.f12793 = c2078Arr;
        if (c2078Arr2 == null) {
            c2078Arr2 = new C2078[0];
        }
        c3489.f12795 = c2078Arr2;
        if (c9841Arr == null) {
            c9841Arr = new C9841[0];
        }
        c3489.f12796 = c9841Arr;
        if (c9841Arr2 == null) {
            c9841Arr2 = new C9841[0];
        }
        c3489.f12794 = c9841Arr2;
        return (C3489) c12063.f40351.m28060(c3489);
    }

    @Override // l.AbstractC9011
    /* JADX INFO: renamed from: ۙ */
    public final void mo6320(C13825 c13825, C6187 c6187) {
        C12063 c12063;
        this.f12793 = new C2078[c13825.m33647()];
        this.f12795 = new C2078[c13825.m33647()];
        this.f12796 = new C9841[c13825.m33647()];
        this.f12794 = new C9841[c13825.m33647()];
        int length = this.f12793.length;
        C9841 c9841 = null;
        int i = 0;
        int i2 = 0;
        C2078 c2078 = null;
        while (true) {
            c12063 = this.f30808;
            if (i2 >= length) {
                break;
            }
            try {
                C2078[] c2078Arr = this.f12793;
                C2078 c2079 = new C2078(c12063, c13825, c2078);
                c2078Arr[i2] = c2079;
                i2++;
                c2078 = c2079;
            } catch (Exception e) {
                throw C11708.m29248("Error while reading static field at index " + i2, e);
            }
        }
        int length2 = this.f12795.length;
        int i3 = 0;
        C2078 c20710 = null;
        while (i3 < length2) {
            try {
                C2078[] c2078Arr2 = this.f12795;
                C2078 c20711 = new C2078(c12063, c13825, c20710);
                c2078Arr2[i3] = c20711;
                i3++;
                c20710 = c20711;
            } catch (Exception e2) {
                throw C11708.m29248("Error while reading instance field at index " + i3, e2);
            }
        }
        int length3 = this.f12796.length;
        int i4 = 0;
        C9841 c9842 = null;
        while (i4 < length3) {
            try {
                C9841[] c9841Arr = this.f12796;
                C9841 c9843 = new C9841(c12063, c6187, c13825, c9842);
                c9841Arr[i4] = c9843;
                i4++;
                c9842 = c9843;
            } catch (Exception e3) {
                throw C11708.m29248("Error while reading direct method at index " + i4, e3);
            }
        }
        int length4 = this.f12794.length;
        while (i < length4) {
            try {
                C9841[] c9841Arr2 = this.f12794;
                C9841 c9844 = new C9841(c12063, c6187, c13825, c9841);
                c9841Arr2[i] = c9844;
                i++;
                c9841 = c9844;
            } catch (Exception e4) {
                throw C11708.m29248("Error while reading virtual method at index " + i, e4);
            }
        }
    }

    @Override // l.AbstractC9011
    /* JADX INFO: renamed from: ۙ */
    public final int mo6315(int i) {
        int iM33072 = C13530.m33072(this.f12794.length) + C13530.m33072(this.f12796.length) + C13530.m33072(this.f12795.length) + C13530.m33072(this.f12793.length) + i;
        C2078[] c2078Arr = this.f12793;
        int length = c2078Arr.length;
        C9841 c9841 = null;
        int i2 = 0;
        int i3 = 0;
        C2078 c2078 = null;
        while (i3 < length) {
            C2078 c2079 = c2078Arr[i3];
            iM33072 = C2078.m6595(c2079, iM33072, c2078);
            i3++;
            c2078 = c2079;
        }
        C2078[] c2078Arr2 = this.f12795;
        int length2 = c2078Arr2.length;
        int i4 = 0;
        C2078 c20710 = null;
        while (i4 < length2) {
            C2078 c20711 = c2078Arr2[i4];
            iM33072 = C2078.m6595(c20711, iM33072, c20710);
            i4++;
            c20710 = c20711;
        }
        C9841[] c9841Arr = this.f12796;
        int length3 = c9841Arr.length;
        int i5 = 0;
        C9841 c9842 = null;
        while (i5 < length3) {
            C9841 c9843 = c9841Arr[i5];
            iM33072 = C9841.m24945(c9843, iM33072, c9842);
            i5++;
            c9842 = c9843;
        }
        C9841[] c9841Arr2 = this.f12794;
        int length4 = c9841Arr2.length;
        while (i2 < length4) {
            C9841 c9844 = c9841Arr2[i2];
            iM33072 = C9841.m24945(c9844, iM33072, c9841);
            i2++;
            c9841 = c9844;
        }
        return iM33072;
    }

    @Override // l.AbstractC9011
    /* JADX INFO: renamed from: ۙ */
    public final void mo6319(C4651 c4651) {
        c4651.m12842(this.f12793.length);
        c4651.m12842(this.f12795.length);
        c4651.m12842(this.f12796.length);
        c4651.m12842(this.f12794.length);
        C2078[] c2078Arr = this.f12793;
        int length = c2078Arr.length;
        C9841 c9841 = null;
        int i = 0;
        int i2 = 0;
        C2078 c2078 = null;
        while (i2 < length) {
            C2078 c2079 = c2078Arr[i2];
            C2078.m6596(c2079, c4651, c2078);
            i2++;
            c2078 = c2079;
        }
        C2078[] c2078Arr2 = this.f12795;
        int length2 = c2078Arr2.length;
        int i3 = 0;
        C2078 c20710 = null;
        while (i3 < length2) {
            C2078 c20711 = c2078Arr2[i3];
            C2078.m6596(c20711, c4651, c20710);
            i3++;
            c20710 = c20711;
        }
        C9841[] c9841Arr = this.f12796;
        int length3 = c9841Arr.length;
        int i4 = 0;
        C9841 c9842 = null;
        while (i4 < length3) {
            C9841 c9843 = c9841Arr[i4];
            C9841.m24946(c9843, c4651, c9842);
            i4++;
            c9842 = c9843;
        }
        C9841[] c9841Arr2 = this.f12794;
        int length4 = c9841Arr2.length;
        while (i < length4) {
            C9841 c9844 = c9841Arr2[i];
            C9841.m24946(c9844, c4651, c9841);
            i++;
            c9841 = c9844;
        }
    }

    @Override // l.AbstractC9011
    /* JADX INFO: renamed from: ۙ */
    public final String mo6317() {
        if (this.f12797 == null) {
            return C9576.m24440(new StringBuilder("class_data_item @0x"), this.f30807);
        }
        return "class_data_item @0x" + Integer.toHexString(this.f30807) + " (" + this.f12797.m33765() + MotionUtils.EASING_TYPE_FORMAT_END;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10230(C13929 c13929) {
        this.f12797 = c13929;
    }

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public final C2078[] m10237() {
        return this.f12793;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10226(int i, C2078 c2078, String str) {
        if (i >= -1) {
            C2078[] c2078Arr = this.f12793;
            if (i > c2078Arr.length - 1) {
                return;
            }
            c2078Arr[i] = c2078;
            C23352 c23352M39781 = this.f12797.m33767().m39781();
            AbstractC11833 abstractC11833M10222 = null;
            if (!c2078.m6597()) {
                AbstractC11833[] abstractC11833Arr = c23352M39781.f75657;
                if (i < abstractC11833Arr.length) {
                    abstractC11833Arr[i] = null;
                    return;
                }
                return;
            }
            AbstractC11833[] abstractC11833Arr2 = c23352M39781.f75657;
            int length = abstractC11833Arr2.length;
            C2078[] c2078Arr2 = this.f12793;
            if (length < c2078Arr2.length) {
                AbstractC11833[] abstractC11833Arr3 = new AbstractC11833[c2078Arr2.length];
                c23352M39781.f75657 = abstractC11833Arr3;
                System.arraycopy(abstractC11833Arr2, 0, abstractC11833Arr3, 0, abstractC11833Arr2.length);
            }
            AbstractC11833[] abstractC11833Arr4 = this.f12797.m33767().m39781().f75657;
            String strM6314 = c2078.f7681.f61160.m6314();
            C12063 c12063 = this.f30808;
            if (!strM6314.startsWith("[")) {
                try {
                    int iHashCode = strM6314.hashCode();
                    if (iHashCode != 70) {
                        if (iHashCode != 83) {
                            if (iHashCode != 90) {
                                if (iHashCode != 1379658506) {
                                    if (iHashCode != 73) {
                                        if (iHashCode != 74) {
                                            switch (iHashCode) {
                                                case 66:
                                                    if (strM6314.equals("B")) {
                                                        abstractC11833M10222 = new C9241(Integer.valueOf(str).byteValue());
                                                    }
                                                    break;
                                                case 67:
                                                    if (strM6314.equals("C")) {
                                                        abstractC11833M10222 = new C2889(str.charAt(0));
                                                    }
                                                    break;
                                                case 68:
                                                    if (strM6314.equals("D")) {
                                                        abstractC11833M10222 = new C4776(Double.valueOf(str).doubleValue());
                                                    }
                                                    break;
                                            }
                                        } else if (strM6314.equals("J")) {
                                            abstractC11833M10222 = new C13244(Long.valueOf(str).longValue());
                                        }
                                    } else if (strM6314.equals("I")) {
                                        abstractC11833M10222 = new C1248(Integer.valueOf(str).intValue());
                                    }
                                } else if (strM6314.equals("Ljava/lang/String;")) {
                                    abstractC11833M10222 = new C15361(new C14655(c12063, C23827.m52502(str, c12063)));
                                }
                            } else if (strM6314.equals("Z")) {
                                abstractC11833M10222 = new C1478(str.equals("true"));
                            }
                        } else if (strM6314.equals("S")) {
                            abstractC11833M10222 = new C23122(Short.valueOf(str).shortValue());
                        }
                    } else if (strM6314.equals("F")) {
                        abstractC11833M10222 = new C22416(Float.valueOf(str).floatValue());
                    }
                } catch (Throwable unused) {
                    abstractC11833M10222 = m10222(strM6314, c12063);
                }
            }
            abstractC11833Arr4[i] = abstractC11833M10222;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10225(int i, C2078 c2078) {
        if (i >= -1) {
            C2078[] c2078Arr = this.f12795;
            if (i > c2078Arr.length - 1) {
                return;
            }
            c2078Arr[i] = c2078;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10227(int i, C9841 c9841) {
        if (i >= -1) {
            C9841[] c9841Arr = this.f12796;
            if (i > c9841Arr.length - 1) {
                return;
            }
            c9841Arr[i] = c9841;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m10235(int i, C9841 c9841) {
        if (i >= -1) {
            C9841[] c9841Arr = this.f12794;
            if (i > c9841Arr.length - 1) {
                return;
            }
            c9841Arr[i] = c9841;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10228(C2078 c2078) {
        if (c2078.m6598()) {
            C2078[] c2078Arr = this.f12793;
            int length = c2078Arr.length;
            int i = length + 1;
            C2078[] c2078Arr2 = new C2078[i];
            this.f12793 = c2078Arr2;
            System.arraycopy(c2078Arr, 0, c2078Arr2, 0, length);
            this.f12793[length] = c2078;
            C23352 c23352M39781 = this.f12797.m33767().m39781();
            AbstractC11833[] abstractC11833Arr = c23352M39781.f75657;
            AbstractC11833[] abstractC11833Arr2 = new AbstractC11833[i];
            c23352M39781.f75657 = abstractC11833Arr2;
            System.arraycopy(abstractC11833Arr, 0, abstractC11833Arr2, 0, abstractC11833Arr.length);
            if (c2078.m6597()) {
                c23352M39781.f75657[length] = m10222(c2078.f7681.f61160.m6314(), this.f30808);
                return;
            }
            return;
        }
        C2078[] c2078Arr3 = this.f12795;
        int length2 = c2078Arr3.length;
        C2078[] c2078Arr4 = new C2078[length2 + 1];
        this.f12795 = c2078Arr4;
        System.arraycopy(c2078Arr3, 0, c2078Arr4, 0, length2);
        this.f12795[length2] = c2078;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10229(C9841 c9841) {
        if (c9841.m24947()) {
            C9841[] c9841Arr = this.f12796;
            int length = c9841Arr.length;
            C9841[] c9841Arr2 = new C9841[length + 1];
            this.f12796 = c9841Arr2;
            System.arraycopy(c9841Arr, 0, c9841Arr2, 0, length);
            this.f12796[length] = c9841;
            return;
        }
        C9841[] c9841Arr3 = this.f12794;
        int length2 = c9841Arr3.length;
        C9841[] c9841Arr4 = new C9841[length2 + 1];
        this.f12794 = c9841Arr4;
        System.arraycopy(c9841Arr3, 0, c9841Arr4, 0, length2);
        this.f12794[length2] = c9841;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m10234(int i) {
        C9841[] c9841Arr = this.f12796;
        int length = c9841Arr.length;
        C9841[] c9841Arr2 = new C9841[length - 1];
        this.f12796 = c9841Arr2;
        System.arraycopy(c9841Arr, i + 1, c9841Arr2, i, (length - i) - 1);
        System.arraycopy(c9841Arr, 0, this.f12796, 0, i);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m10238(int i) {
        C9841[] c9841Arr = this.f12794;
        int length = c9841Arr.length;
        C9841[] c9841Arr2 = new C9841[length - 1];
        this.f12794 = c9841Arr2;
        System.arraycopy(c9841Arr, i + 1, c9841Arr2, i, (length - i) - 1);
        System.arraycopy(c9841Arr, 0, this.f12794, 0, i);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m10231(int i) {
        C23352 c23352M39781 = this.f12797.m33767().m39781();
        int length = this.f12793.length;
        AbstractC11833[] abstractC11833Arr = c23352M39781.f75657;
        if (abstractC11833Arr.length < length) {
            AbstractC11833[] abstractC11833Arr2 = new AbstractC11833[length];
            c23352M39781.f75657 = abstractC11833Arr2;
            System.arraycopy(abstractC11833Arr, 0, abstractC11833Arr2, 0, abstractC11833Arr.length);
        }
        C2078[] c2078Arr = this.f12793;
        AbstractC11833[] abstractC11833Arr3 = c23352M39781.f75657;
        int i2 = length - 1;
        C2078[] c2078Arr2 = new C2078[i2];
        this.f12793 = c2078Arr2;
        c23352M39781.f75657 = new AbstractC11833[i2];
        int i3 = i + 1;
        int i4 = (length - i) - 1;
        System.arraycopy(c2078Arr, i3, c2078Arr2, i, i4);
        System.arraycopy(c2078Arr, 0, this.f12793, 0, i);
        System.arraycopy(abstractC11833Arr3, i3, c23352M39781.f75657, i, i4);
        System.arraycopy(abstractC11833Arr3, 0, c23352M39781.f75657, 0, i);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m10223(int i) {
        C2078[] c2078Arr = this.f12795;
        int length = c2078Arr.length;
        C2078[] c2078Arr2 = new C2078[length - 1];
        this.f12795 = c2078Arr2;
        System.arraycopy(c2078Arr, i + 1, c2078Arr2, i, (length - i) - 1);
        System.arraycopy(c2078Arr, 0, this.f12795, 0, i);
    }

    /* JADX INFO: renamed from: ۢܰ, reason: not valid java name and contains not printable characters */
    public final C2078[] m10233() {
        return this.f12795;
    }

    /* JADX INFO: renamed from: ܰۨ, reason: not valid java name and contains not printable characters */
    public final C9841[] m10236() {
        return this.f12796;
    }

    /* JADX INFO: renamed from: ۚۨ, reason: not valid java name and contains not printable characters */
    public final C9841[] m10232() {
        return this.f12794;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC11833 m10222(String str, C12063 c12063) {
        if (str.startsWith("[")) {
            return null;
        }
        switch (str) {
            case "B":
                return new C9241((byte) 0);
            case "C":
                return new C2889('C');
            case "D":
                return new C4776(0.0d);
            case "F":
                return new C22416(0.0f);
            case "I":
                return new C1248(0);
            case "J":
                return new C13244(0L);
            case "S":
                return new C23122((short) 0);
            case "Z":
                return new C1478(false);
            case "Ljava/lang/String;":
                return new C15361(new C14655(c12063, C23827.m52502("", c12063)));
            default:
                return null;
        }
    }
}
