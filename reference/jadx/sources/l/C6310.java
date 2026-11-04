package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ۛۢۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: E5GV */
/* JADX INFO: loaded from: classes3.dex */
public final class C6310 extends AbstractC10739 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C12275[] f21392;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C12275[] f21393;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C20480[] f21394;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C20480[] f21395;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C4072 f21396;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C6310 c6310 = (C6310) obj;
        C4072 c4072 = this.f21396;
        if (c4072 == null) {
            return c6310.f21396 == null ? 0 : -1;
        }
        C4072 c4073 = c6310.f21396;
        if (c4073 == null) {
            return 1;
        }
        return c4072.f34103 - c4073.f34103;
    }

    public C6310(C24738 c24738) {
        super(c24738);
        this.f21396 = null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6310 m18003(C24738 c24738) {
        C20480[] c20480Arr;
        C20480[] c20480Arr2;
        C12275[] c12275Arr;
        C12275[] c12275Arr2;
        C20480[] c20480Arr3 = this.f21395;
        if (c20480Arr3 == null || c20480Arr3.length == 0) {
            c20480Arr = null;
        } else {
            c20480Arr = new C20480[c20480Arr3.length];
            int length = c20480Arr3.length;
            for (int i = 0; i < length; i++) {
                C20480 c20480 = this.f21395[i];
                c20480Arr[i] = new C20480(c20480.f65617.m33265(c24738), c20480.f65616);
            }
        }
        C20480[] c20480Arr4 = this.f21394;
        if (c20480Arr4 == null || c20480Arr4.length == 0) {
            c20480Arr2 = null;
        } else {
            c20480Arr2 = new C20480[c20480Arr4.length];
            int length2 = c20480Arr4.length;
            for (int i2 = 0; i2 < length2; i2++) {
                C20480 c20481 = this.f21394[i2];
                c20480Arr2[i2] = new C20480(c20481.f65617.m33265(c24738), c20481.f65616);
            }
        }
        C12275[] c12275Arr3 = this.f21392;
        if (c12275Arr3 == null || c12275Arr3.length == 0) {
            c12275Arr = null;
        } else {
            c12275Arr = new C12275[c12275Arr3.length];
            int length3 = c12275Arr3.length;
            for (int i3 = 0; i3 < length3; i3++) {
                C12275 c12275 = this.f21392[i3];
                C5520 c5520M16436 = c12275.f39463.m16436(c24738);
                int i4 = c12275.f39462;
                C7033 c7033 = c12275.f39464;
                c12275Arr[i3] = new C12275(c5520M16436, i4, c7033 != null ? c7033.m19358(c24738) : null);
            }
        }
        C12275[] c12275Arr4 = this.f21393;
        if (c12275Arr4 == null || c12275Arr4.length == 0) {
            c12275Arr2 = null;
        } else {
            c12275Arr2 = new C12275[c12275Arr4.length];
            int length4 = c12275Arr4.length;
            for (int i5 = 0; i5 < length4; i5++) {
                C12275 c12276 = this.f21393[i5];
                C5520 c5520M16437 = c12276.f39463.m16436(c24738);
                int i6 = c12276.f39462;
                C7033 c7034 = c12276.f39464;
                c12275Arr2[i5] = new C12275(c5520M16437, i6, c7034 != null ? c7034.m19358(c24738) : null);
            }
        }
        C6310 c6310 = new C6310(c24738);
        c6310.f21396 = null;
        if (c20480Arr == null) {
            c20480Arr = new C20480[0];
        }
        c6310.f21395 = c20480Arr;
        if (c20480Arr2 == null) {
            c20480Arr2 = new C20480[0];
        }
        c6310.f21394 = c20480Arr2;
        if (c12275Arr == null) {
            c12275Arr = new C12275[0];
        }
        c6310.f21392 = c12275Arr;
        if (c12275Arr2 == null) {
            c12275Arr2 = new C12275[0];
        }
        c6310.f21393 = c12275Arr2;
        return (C6310) c24738.f80111.m38079(c6310);
    }

    @Override // l.AbstractC10739
    /* JADX INFO: renamed from: ۙ */
    public final void mo10825(C4028 c4028, C17452 c17452) {
        C24738 c24738;
        this.f21395 = new C20480[c4028.m12998()];
        this.f21394 = new C20480[c4028.m12998()];
        this.f21392 = new C12275[c4028.m12998()];
        this.f21393 = new C12275[c4028.m12998()];
        int length = this.f21395.length;
        C12275 c12275 = null;
        int i = 0;
        int i2 = 0;
        C20480 c20480 = null;
        while (true) {
            c24738 = this.f34102;
            if (i2 >= length) {
                break;
            }
            try {
                C20480[] c20480Arr = this.f21395;
                C20480 c20481 = new C20480(c24738, c4028, c20480);
                c20480Arr[i2] = c20481;
                i2++;
                c20480 = c20481;
            } catch (Exception e) {
                throw C14468.m34931("Error while reading static field at index " + i2, e);
            }
        }
        int length2 = this.f21394.length;
        int i3 = 0;
        C20480 c20482 = null;
        while (i3 < length2) {
            try {
                C20480[] c20480Arr2 = this.f21394;
                C20480 c20483 = new C20480(c24738, c4028, c20482);
                c20480Arr2[i3] = c20483;
                i3++;
                c20482 = c20483;
            } catch (Exception e2) {
                throw C14468.m34931("Error while reading instance field at index " + i3, e2);
            }
        }
        int length3 = this.f21392.length;
        int i4 = 0;
        C12275 c12276 = null;
        while (i4 < length3) {
            try {
                C12275[] c12275Arr = this.f21392;
                C12275 c12277 = new C12275(c24738, c17452, c4028, c12276);
                c12275Arr[i4] = c12277;
                i4++;
                c12276 = c12277;
            } catch (Exception e3) {
                throw C14468.m34931("Error while reading direct method at index " + i4, e3);
            }
        }
        int length4 = this.f21393.length;
        while (i < length4) {
            try {
                C12275[] c12275Arr2 = this.f21393;
                C12275 c12278 = new C12275(c24738, c17452, c4028, c12275);
                c12275Arr2[i] = c12278;
                i++;
                c12275 = c12278;
            } catch (Exception e4) {
                throw C14468.m34931("Error while reading virtual method at index " + i, e4);
            }
        }
    }

    @Override // l.AbstractC10739
    /* JADX INFO: renamed from: ۙ */
    public final int mo10821(int i) {
        int iM19213 = C6929.m19213(this.f21393.length) + C6929.m19213(this.f21392.length) + C6929.m19213(this.f21394.length) + C6929.m19213(this.f21395.length) + i;
        C20480[] c20480Arr = this.f21395;
        int length = c20480Arr.length;
        C12275 c12275 = null;
        int i2 = 0;
        int i3 = 0;
        C20480 c20480 = null;
        while (i3 < length) {
            C20480 c20481 = c20480Arr[i3];
            iM19213 = C20480.m46981(c20481, iM19213, c20480);
            i3++;
            c20480 = c20481;
        }
        C20480[] c20480Arr2 = this.f21394;
        int length2 = c20480Arr2.length;
        int i4 = 0;
        C20480 c20482 = null;
        while (i4 < length2) {
            C20480 c20483 = c20480Arr2[i4];
            iM19213 = C20480.m46981(c20483, iM19213, c20482);
            i4++;
            c20482 = c20483;
        }
        C12275[] c12275Arr = this.f21392;
        int length3 = c12275Arr.length;
        int i5 = 0;
        C12275 c12276 = null;
        while (i5 < length3) {
            C12275 c12277 = c12275Arr[i5];
            iM19213 = C12275.m30652(c12277, iM19213, c12276);
            i5++;
            c12276 = c12277;
        }
        C12275[] c12275Arr2 = this.f21393;
        int length4 = c12275Arr2.length;
        while (i2 < length4) {
            C12275 c12278 = c12275Arr2[i2];
            iM19213 = C12275.m30652(c12278, iM19213, c12275);
            i2++;
            c12275 = c12278;
        }
        return iM19213;
    }

    @Override // l.AbstractC10739
    /* JADX INFO: renamed from: ۙ */
    public final void mo10826(C24166 c24166) {
        c24166.m54135(this.f21395.length);
        c24166.m54135(this.f21394.length);
        c24166.m54135(this.f21392.length);
        c24166.m54135(this.f21393.length);
        C20480[] c20480Arr = this.f21395;
        int length = c20480Arr.length;
        C12275 c12275 = null;
        int i = 0;
        int i2 = 0;
        C20480 c20480 = null;
        while (i2 < length) {
            C20480 c20481 = c20480Arr[i2];
            C20480.m46982(c20481, c24166, c20480);
            i2++;
            c20480 = c20481;
        }
        C20480[] c20480Arr2 = this.f21394;
        int length2 = c20480Arr2.length;
        int i3 = 0;
        C20480 c20482 = null;
        while (i3 < length2) {
            C20480 c20483 = c20480Arr2[i3];
            C20480.m46982(c20483, c24166, c20482);
            i3++;
            c20482 = c20483;
        }
        C12275[] c12275Arr = this.f21392;
        int length3 = c12275Arr.length;
        int i4 = 0;
        C12275 c12276 = null;
        while (i4 < length3) {
            C12275 c12277 = c12275Arr[i4];
            C12275.m30653(c12277, c24166, c12276);
            i4++;
            c12276 = c12277;
        }
        C12275[] c12275Arr2 = this.f21393;
        int length4 = c12275Arr2.length;
        while (i < length4) {
            C12275 c12278 = c12275Arr2[i];
            C12275.m30653(c12278, c24166, c12275);
            i++;
            c12275 = c12278;
        }
    }

    @Override // l.AbstractC10739
    /* JADX INFO: renamed from: ۙ */
    public final String mo10823() {
        if (this.f21396 == null) {
            return C4791.m14766(new StringBuilder("class_data_item @0x"), this.f34103);
        }
        return "class_data_item @0x" + Integer.toHexString(this.f34103) + " (" + this.f21396.m13151() + MotionUtils.EASING_TYPE_FORMAT_END;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18007(C4072 c4072) {
        this.f21396 = c4072;
    }

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public final C20480[] m18002() {
        return this.f21395;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18006(int i, C20480 c20480, String str) {
        if (i >= -1) {
            C20480[] c20480Arr = this.f21395;
            if (i > c20480Arr.length - 1) {
                return;
            }
            c20480Arr[i] = c20480;
            C23246 c23246M39175 = this.f21396.m13153().m39175();
            AbstractC14294 abstractC14294M18001 = null;
            if (!c20480.m46983()) {
                AbstractC14294[] abstractC14294Arr = c23246M39175.f75324;
                if (i < abstractC14294Arr.length) {
                    abstractC14294Arr[i] = null;
                    return;
                }
                return;
            }
            AbstractC14294[] abstractC14294Arr2 = c23246M39175.f75324;
            int length = abstractC14294Arr2.length;
            C20480[] c20480Arr2 = this.f21395;
            if (length < c20480Arr2.length) {
                AbstractC14294[] abstractC14294Arr3 = new AbstractC14294[c20480Arr2.length];
                c23246M39175.f75324 = abstractC14294Arr3;
                System.arraycopy(abstractC14294Arr2, 0, abstractC14294Arr3, 0, abstractC14294Arr2.length);
            }
            AbstractC14294[] abstractC14294Arr4 = this.f21396.m13153().m39175().f75324;
            String strM46860 = c20480.f65617.f43033.m46860();
            C24738 c24738 = this.f34102;
            if (!strM46860.startsWith("[")) {
                try {
                    int iHashCode = strM46860.hashCode();
                    if (iHashCode != 70) {
                        if (iHashCode != 83) {
                            if (iHashCode != 90) {
                                if (iHashCode != 1379658506) {
                                    if (iHashCode != 73) {
                                        if (iHashCode != 74) {
                                            switch (iHashCode) {
                                                case 66:
                                                    if (strM46860.equals("B")) {
                                                        abstractC14294M18001 = new C12057(Integer.valueOf(str).byteValue());
                                                    }
                                                    break;
                                                case 67:
                                                    if (strM46860.equals("C")) {
                                                        abstractC14294M18001 = new C6092(str.charAt(0));
                                                    }
                                                    break;
                                                case 68:
                                                    if (strM46860.equals("D")) {
                                                        abstractC14294M18001 = new C23992(Double.valueOf(str).doubleValue());
                                                    }
                                                    break;
                                            }
                                        } else if (strM46860.equals("J")) {
                                            abstractC14294M18001 = new C18770(Long.valueOf(str).longValue());
                                        }
                                    } else if (strM46860.equals("I")) {
                                        abstractC14294M18001 = new C7583(Integer.valueOf(str).intValue());
                                    }
                                } else if (strM46860.equals("Ljava/lang/String;")) {
                                    abstractC14294M18001 = new C2362(new C3282(c24738, C23420.m52620(str, c24738)));
                                }
                            } else if (strM46860.equals("Z")) {
                                abstractC14294M18001 = new C20262(str.equals("true"));
                            }
                        } else if (strM46860.equals("S")) {
                            abstractC14294M18001 = new C9073(Short.valueOf(str).shortValue());
                        }
                    } else if (strM46860.equals("F")) {
                        abstractC14294M18001 = new C0125(Float.valueOf(str).floatValue());
                    }
                } catch (Throwable unused) {
                    abstractC14294M18001 = m18001(strM46860, c24738);
                }
            }
            abstractC14294Arr4[i] = abstractC14294M18001;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18005(int i, C20480 c20480) {
        if (i >= -1) {
            C20480[] c20480Arr = this.f21394;
            if (i > c20480Arr.length - 1) {
                return;
            }
            c20480Arr[i] = c20480;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18004(int i, C12275 c12275) {
        if (i >= -1) {
            C12275[] c12275Arr = this.f21392;
            if (i > c12275Arr.length - 1) {
                return;
            }
            c12275Arr[i] = c12275;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m18015(int i, C12275 c12275) {
        if (i >= -1) {
            C12275[] c12275Arr = this.f21393;
            if (i > c12275Arr.length - 1) {
                return;
            }
            c12275Arr[i] = c12275;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18009(C20480 c20480) {
        if (c20480.m46984()) {
            C20480[] c20480Arr = this.f21395;
            int length = c20480Arr.length;
            int i = length + 1;
            C20480[] c20480Arr2 = new C20480[i];
            this.f21395 = c20480Arr2;
            System.arraycopy(c20480Arr, 0, c20480Arr2, 0, length);
            this.f21395[length] = c20480;
            C23246 c23246M39175 = this.f21396.m13153().m39175();
            AbstractC14294[] abstractC14294Arr = c23246M39175.f75324;
            AbstractC14294[] abstractC14294Arr2 = new AbstractC14294[i];
            c23246M39175.f75324 = abstractC14294Arr2;
            System.arraycopy(abstractC14294Arr, 0, abstractC14294Arr2, 0, abstractC14294Arr.length);
            if (c20480.m46983()) {
                c23246M39175.f75324[length] = m18001(c20480.f65617.f43033.m46860(), this.f34102);
                return;
            }
            return;
        }
        C20480[] c20480Arr3 = this.f21394;
        int length2 = c20480Arr3.length;
        C20480[] c20480Arr4 = new C20480[length2 + 1];
        this.f21394 = c20480Arr4;
        System.arraycopy(c20480Arr3, 0, c20480Arr4, 0, length2);
        this.f21394[length2] = c20480;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18008(C12275 c12275) {
        if (c12275.m30654()) {
            C12275[] c12275Arr = this.f21392;
            int length = c12275Arr.length;
            C12275[] c12275Arr2 = new C12275[length + 1];
            this.f21392 = c12275Arr2;
            System.arraycopy(c12275Arr, 0, c12275Arr2, 0, length);
            this.f21392[length] = c12275;
            return;
        }
        C12275[] c12275Arr3 = this.f21393;
        int length2 = c12275Arr3.length;
        C12275[] c12275Arr4 = new C12275[length2 + 1];
        this.f21393 = c12275Arr4;
        System.arraycopy(c12275Arr3, 0, c12275Arr4, 0, length2);
        this.f21393[length2] = c12275;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m18014(int i) {
        C12275[] c12275Arr = this.f21392;
        int length = c12275Arr.length;
        C12275[] c12275Arr2 = new C12275[length - 1];
        this.f21392 = c12275Arr2;
        System.arraycopy(c12275Arr, i + 1, c12275Arr2, i, (length - i) - 1);
        System.arraycopy(c12275Arr, 0, this.f21392, 0, i);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m18011(int i) {
        C12275[] c12275Arr = this.f21393;
        int length = c12275Arr.length;
        C12275[] c12275Arr2 = new C12275[length - 1];
        this.f21393 = c12275Arr2;
        System.arraycopy(c12275Arr, i + 1, c12275Arr2, i, (length - i) - 1);
        System.arraycopy(c12275Arr, 0, this.f21393, 0, i);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m18013(int i) {
        C23246 c23246M39175 = this.f21396.m13153().m39175();
        int length = this.f21395.length;
        AbstractC14294[] abstractC14294Arr = c23246M39175.f75324;
        if (abstractC14294Arr.length < length) {
            AbstractC14294[] abstractC14294Arr2 = new AbstractC14294[length];
            c23246M39175.f75324 = abstractC14294Arr2;
            System.arraycopy(abstractC14294Arr, 0, abstractC14294Arr2, 0, abstractC14294Arr.length);
        }
        C20480[] c20480Arr = this.f21395;
        AbstractC14294[] abstractC14294Arr3 = c23246M39175.f75324;
        int i2 = length - 1;
        C20480[] c20480Arr2 = new C20480[i2];
        this.f21395 = c20480Arr2;
        c23246M39175.f75324 = new AbstractC14294[i2];
        int i3 = i + 1;
        int i4 = (length - i) - 1;
        System.arraycopy(c20480Arr, i3, c20480Arr2, i, i4);
        System.arraycopy(c20480Arr, 0, this.f21395, 0, i);
        System.arraycopy(abstractC14294Arr3, i3, c23246M39175.f75324, i, i4);
        System.arraycopy(abstractC14294Arr3, 0, c23246M39175.f75324, 0, i);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m18017(int i) {
        C20480[] c20480Arr = this.f21394;
        int length = c20480Arr.length;
        C20480[] c20480Arr2 = new C20480[length - 1];
        this.f21394 = c20480Arr2;
        System.arraycopy(c20480Arr, i + 1, c20480Arr2, i, (length - i) - 1);
        System.arraycopy(c20480Arr, 0, this.f21394, 0, i);
    }

    /* JADX INFO: renamed from: ۜ᩷, reason: not valid java name and contains not printable characters */
    public final C20480[] m18010() {
        return this.f21394;
    }

    /* JADX INFO: renamed from: ᩷ۤ, reason: not valid java name and contains not printable characters */
    public final C12275[] m18016() {
        return this.f21392;
    }

    /* JADX INFO: renamed from: ܳۤ, reason: not valid java name and contains not printable characters */
    public final C12275[] m18012() {
        return this.f21393;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC14294 m18001(String str, C24738 c24738) {
        if (str.startsWith("[")) {
            return null;
        }
        switch (str) {
            case "B":
                return new C12057((byte) 0);
            case "C":
                return new C6092('C');
            case "D":
                return new C23992(0.0d);
            case "F":
                return new C0125(0.0f);
            case "I":
                return new C7583(0);
            case "J":
                return new C18770(0L);
            case "S":
                return new C9073((short) 0);
            case "Z":
                return new C20262(false);
            case "Ljava/lang/String;":
                return new C2362(new C3282(c24738, C23420.m52620("", c24738)));
            default:
                return null;
        }
    }
}
