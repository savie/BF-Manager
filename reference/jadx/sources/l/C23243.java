package l;

/* JADX INFO: renamed from: l.᩹ۖۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: DAUC */
/* JADX INFO: loaded from: classes.dex */
public final class C23243 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f75300;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f75301;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f75302;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public String f75303;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C15783[] f75304;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C17275[] f75307;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f75308;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f75309;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C4047 f75311;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C0318 f75312;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C15783[] f75313;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C17275[] f75305 = new C17275[256];

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f75306 = 1;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C4047 f75310 = new C4047();

    public C23243(C0318 c0318) {
        this.f75312 = c0318;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m52257() {
        return this.f75308;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m52260() {
        return this.f75303;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m52259(int i, String str) {
        this.f75308 = i;
        this.f75303 = str;
        return m52233(7, str).f53507;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m52254() {
        return this.f75306;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m52264() {
        return this.f75310.f13788;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m52263(C4047 c4047) {
        c4047.m13021(this.f75306);
        C4047 c4048 = this.f75310;
        c4047.m13018(0, c4048.f13788, c4048.f13787);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m52237() {
        if (this.f75311 == null) {
            return 0;
        }
        m52265("BootstrapMethods");
        return this.f75311.f13788 + 8;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52253(C4047 c4047) {
        if (this.f75311 != null) {
            c4047.m13021(m52265("BootstrapMethods"));
            c4047.m13023(this.f75311.f13788 + 2);
            c4047.m13021(this.f75301);
            C4047 c4048 = this.f75311;
            c4047.m13018(0, c4048.f13788, c4048.f13787);
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private C17275 m52236(int i) {
        C17275[] c17275Arr = this.f75305;
        return c17275Arr[i % c17275Arr.length];
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m52235(C17275 c17275) {
        int i = this.f75302;
        C17275[] c17275Arr = this.f75305;
        if (i > (c17275Arr.length * 3) / 4) {
            int length = c17275Arr.length;
            int i2 = (length * 2) + 1;
            C17275[] c17275Arr2 = new C17275[i2];
            while (true) {
                length--;
                if (length < 0) {
                    break;
                }
                C17275 c17276 = this.f75305[length];
                while (c17276 != null) {
                    int i3 = c17276.f56269 % i2;
                    C17275 c17277 = c17276.f56268;
                    c17276.f56268 = c17275Arr2[i3];
                    c17275Arr2[i3] = c17276;
                    c17276 = c17277;
                }
            }
            this.f75305 = c17275Arr2;
        }
        this.f75302++;
        int i4 = c17275.f56269;
        C17275[] c17275Arr3 = this.f75305;
        int length2 = i4 % c17275Arr3.length;
        c17275.f56268 = c17275Arr3[length2];
        c17275Arr3[length2] = c17275;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17275 m52247(Object obj) {
        if (obj instanceof Integer) {
            return m52234(3, ((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return m52234(3, ((Byte) obj).intValue());
        }
        if (obj instanceof Character) {
            return m52234(3, ((Character) obj).charValue());
        }
        if (obj instanceof Short) {
            return m52234(3, ((Short) obj).intValue());
        }
        if (obj instanceof Boolean) {
            return m52234(3, ((Boolean) obj).booleanValue() ? 1 : 0);
        }
        if (obj instanceof Float) {
            return m52243(((Float) obj).floatValue());
        }
        if (obj instanceof Long) {
            return m52230(5, ((Long) obj).longValue());
        }
        if (obj instanceof Double) {
            return m52242(((Double) obj).doubleValue());
        }
        if (obj instanceof String) {
            return m52233(8, (String) obj);
        }
        if (obj instanceof C3105) {
            C3105 c3105 = (C3105) obj;
            int iM10140 = c3105.m10140();
            if (iM10140 == 10) {
                return m52233(7, c3105.m10142());
            }
            return iM10140 == 11 ? m52233(16, c3105.m10138()) : m52233(7, c3105.m10138());
        }
        if (obj instanceof C4597) {
            C4597 c4597 = (C4597) obj;
            return m52245(c4597.m14406(), c4597.m14403(), c4597.m14405(), c4597.m14402(), c4597.m14404());
        }
        if (!(obj instanceof C18963)) {
            throw new IllegalArgumentException("value ".concat(String.valueOf(obj)));
        }
        C18963 c18963 = (C18963) obj;
        return m52231(c18963.m44050(), 17, m52252(c18963.m44048(), c18963.m44049()).f53507, c18963.m44053());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17275 m52248(String str) {
        return m52233(7, str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17275 m52249(String str, String str2, String str3) {
        return m52232(str, 9, str2, str3);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17275 m52250(String str, String str2, String str3, boolean z) {
        return m52232(str, z ? 11 : 10, str2, str3);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17275 m52244(int i) {
        return m52234(3, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17275 m52243(float f) {
        return m52234(4, Float.floatToRawIntBits(f));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private C17275 m52234(int i, int i2) {
        int i3 = (i + i2) & Integer.MAX_VALUE;
        for (C17275 c17275M52236 = m52236(i3); c17275M52236 != null; c17275M52236 = c17275M52236.f56268) {
            if (c17275M52236.f53505 == i && c17275M52236.f56269 == i3 && c17275M52236.f53502 == i2) {
                return c17275M52236;
            }
        }
        C4047 c4047 = this.f75310;
        c4047.m13014(i);
        c4047.m13023(i2);
        int i4 = this.f75306;
        this.f75306 = i4 + 1;
        C17275 c17275 = new C17275(i4, i, i3, i2);
        m52235(c17275);
        return c17275;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17275 m52246(long j) {
        return m52230(5, j);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17275 m52242(double d) {
        return m52230(6, Double.doubleToRawLongBits(d));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C17275 m52230(int i, long j) {
        int i2 = (((int) j) + i + ((int) (j >>> 32))) & Integer.MAX_VALUE;
        for (C17275 c17275M52236 = m52236(i2); c17275M52236 != null; c17275M52236 = c17275M52236.f56268) {
            if (c17275M52236.f53505 == i && c17275M52236.f56269 == i2 && c17275M52236.f53502 == j) {
                return c17275M52236;
            }
        }
        int i3 = this.f75306;
        C4047 c4047 = this.f75310;
        c4047.m13014(i);
        c4047.m13019(j);
        this.f75306 += 2;
        C17275 c17275 = new C17275(i3, i, i2, j);
        m52235(c17275);
        return c17275;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17275 m52251(String str, String str2, C4597 c4597, Object... objArr) {
        return m52231(str, 18, m52252(c4597, objArr).f53507, str2);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C17275 m52262(String str) {
        return m52233(19, str);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C17275 m52256(String str) {
        return m52233(20, str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17275 m52252(C4597 c4597, Object... objArr) {
        C4047 c4047 = this.f75311;
        if (c4047 == null) {
            c4047 = new C4047();
            this.f75311 = c4047;
        }
        int length = objArr.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = m52247(objArr[i]).f53507;
        }
        int i2 = c4047.f13788;
        c4047.m13021(m52245(c4597.m14406(), c4597.m14403(), c4597.m14405(), c4597.m14402(), c4597.m14404()).f53507);
        c4047.m13021(length);
        for (int i3 = 0; i3 < length; i3++) {
            c4047.m13021(iArr[i3]);
        }
        int i4 = c4047.f13788 - i2;
        int iHashCode = c4597.hashCode();
        for (Object obj : objArr) {
            iHashCode ^= obj.hashCode();
        }
        int i5 = iHashCode & Integer.MAX_VALUE;
        byte[] bArr = this.f75311.f13787;
        for (C17275 c17275M52236 = m52236(i5); c17275M52236 != null; c17275M52236 = c17275M52236.f56268) {
            if (c17275M52236.f53505 == 64 && c17275M52236.f56269 == i5) {
                int i6 = (int) c17275M52236.f53502;
                int i7 = 0;
                while (true) {
                    if (i7 < i4) {
                        if (bArr[i2 + i7] != bArr[i6 + i7]) {
                            break;
                        }
                        i7++;
                    } else {
                        this.f75311.f13788 = i2;
                        return c17275M52236;
                    }
                }
            }
        }
        int i8 = this.f75301;
        this.f75301 = i8 + 1;
        C17275 c17275 = new C17275(i8, 64, i5, i2);
        m52235(c17275);
        return c17275;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C17275 m52255(int i) {
        return this.f75307[i];
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C10562 m52261(int i) {
        return this.f75313[(int) this.f75307[i].f53502].f51365;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m52238(int i, int i2) {
        long j;
        long j2;
        if (i < i2) {
            j = i;
            j2 = i2;
        } else {
            j = i2;
            j2 = i;
        }
        long j3 = j | (j2 << 32);
        int i3 = (i + i2 + 131) & Integer.MAX_VALUE;
        for (C17275 c17275M52236 = m52236(i3); c17275M52236 != null; c17275M52236 = c17275M52236.f56268) {
            if (c17275M52236.f53505 == 131 && c17275M52236.f56269 == i3 && c17275M52236.f53502 == j3) {
                return c17275M52236.f53503;
            }
        }
        C17275[] c17275Arr = this.f75307;
        String strReplace = c17275Arr[i].f53504;
        String str = c17275Arr[i2].f53504;
        ClassLoader classLoader = C0318.class.getClassLoader();
        try {
            Class<?> cls = Class.forName(strReplace.replace('/', '.'), false, classLoader);
            try {
                Class<?> cls2 = Class.forName(str.replace('/', '.'), false, classLoader);
                if (!cls.isAssignableFrom(cls2)) {
                    if (cls2.isAssignableFrom(cls)) {
                        strReplace = str;
                    } else if (cls.isInterface() || cls2.isInterface()) {
                        strReplace = "java/lang/Object";
                    } else {
                        do {
                            cls = cls.getSuperclass();
                        } while (!cls.isAssignableFrom(cls2));
                        strReplace = cls.getName().replace('.', '/');
                    }
                }
                int iM52258 = m52258(strReplace);
                C17275 c17275 = new C17275(this.f75309, 131, i3, j3);
                m52235(c17275);
                c17275.f53503 = iM52258;
                return iM52258;
            } catch (ClassNotFoundException e) {
                throw new TypeNotPresentException(str, e);
            }
        } catch (ClassNotFoundException e2) {
            throw new TypeNotPresentException(strReplace, e2);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m52229(C17275 c17275) {
        if (this.f75307 == null) {
            this.f75307 = new C17275[16];
        }
        int i = this.f75309;
        C17275[] c17275Arr = this.f75307;
        if (i == c17275Arr.length) {
            C17275[] c17275Arr2 = new C17275[c17275Arr.length * 2];
            System.arraycopy(c17275Arr, 0, c17275Arr2, 0, c17275Arr.length);
            this.f75307 = c17275Arr2;
        }
        C17275[] c17275Arr3 = this.f75307;
        int i2 = this.f75309;
        this.f75309 = i2 + 1;
        c17275Arr3[i2] = c17275;
        m52235(c17275);
        return c17275.f53507;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m52241(C10562 c10562) {
        if (this.f75304 == null) {
            this.f75304 = new C15783[16];
            this.f75313 = new C15783[16];
        }
        int iIdentityHashCode = System.identityHashCode(c10562);
        C15783[] c15783Arr = this.f75304;
        C15783 c15783 = c15783Arr[iIdentityHashCode % c15783Arr.length];
        while (c15783 != null && c15783.f51365 != c10562) {
            c15783 = c15783.f51364;
        }
        if (c15783 == null) {
            int i = this.f75300;
            C15783[] c15783Arr2 = this.f75304;
            if (i > (c15783Arr2.length * 3) / 4) {
                int length = c15783Arr2.length;
                int i2 = (length * 2) + 1;
                C15783[] c15783Arr3 = new C15783[i2];
                while (true) {
                    length--;
                    if (length < 0) {
                        break;
                    }
                    C15783 c15784 = this.f75304[length];
                    while (c15784 != null) {
                        int iIdentityHashCode2 = System.identityHashCode(c15784.f51365) % i2;
                        C15783 c15785 = c15784.f51364;
                        c15784.f51364 = c15783Arr3[iIdentityHashCode2];
                        c15783Arr3[iIdentityHashCode2] = c15784;
                        c15784 = c15785;
                    }
                }
                this.f75304 = c15783Arr3;
            }
            int i3 = this.f75300;
            C15783[] c15783Arr4 = this.f75313;
            if (i3 == c15783Arr4.length) {
                C15783[] c15783Arr5 = new C15783[c15783Arr4.length * 2];
                System.arraycopy(c15783Arr4, 0, c15783Arr5, 0, c15783Arr4.length);
                this.f75313 = c15783Arr5;
            }
            int i4 = this.f75300;
            c15783 = new C15783(i4, c10562);
            C15783[] c15783Arr6 = this.f75304;
            int length2 = iIdentityHashCode % c15783Arr6.length;
            c15783.f51364 = c15783Arr6[length2];
            c15783Arr6[length2] = c15783;
            C15783[] c15783Arr7 = this.f75313;
            this.f75300 = i4 + 1;
            c15783Arr7[i4] = c15783;
        }
        int i5 = c15783.f51363;
        int i6 = (i5 + 130) & Integer.MAX_VALUE;
        for (C17275 c17275M52236 = m52236(i6); c17275M52236 != null; c17275M52236 = c17275M52236.f56268) {
            if (c17275M52236.f53505 == 130 && c17275M52236.f56269 == i6 && c17275M52236.f53502 == i5 && c17275M52236.f53504.equals("")) {
                return c17275M52236.f53507;
            }
        }
        return m52229(new C17275(this.f75309, 130, i6, i5, ""));
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private C17275 m52233(int i, String str) {
        int iHashCode = (str.hashCode() + i) & Integer.MAX_VALUE;
        for (C17275 c17275M52236 = m52236(iHashCode); c17275M52236 != null; c17275M52236 = c17275M52236.f56268) {
            if (c17275M52236.f53505 == i && c17275M52236.f56269 == iHashCode && c17275M52236.f53504.equals(str)) {
                return c17275M52236;
            }
        }
        this.f75310.m13022(i, m52265(str));
        int i2 = this.f75306;
        this.f75306 = i2 + 1;
        C17275 c17275 = new C17275(i2, i, iHashCode, str);
        m52235(c17275);
        return c17275;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m52258(String str) {
        int iHashCode = (str.hashCode() + 128) & Integer.MAX_VALUE;
        for (C17275 c17275M52236 = m52236(iHashCode); c17275M52236 != null; c17275M52236 = c17275M52236.f56268) {
            if (c17275M52236.f53505 == 128 && c17275M52236.f56269 == iHashCode && c17275M52236.f53504.equals(str)) {
                return c17275M52236.f53507;
            }
        }
        return m52229(new C17275(this.f75309, 128, iHashCode, str));
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m52265(String str) {
        int iHashCode = (str.hashCode() + 1) & Integer.MAX_VALUE;
        for (C17275 c17275M52236 = m52236(iHashCode); c17275M52236 != null; c17275M52236 = c17275M52236.f56268) {
            if (c17275M52236.f53505 == 1 && c17275M52236.f56269 == iHashCode && c17275M52236.f53504.equals(str)) {
                return c17275M52236.f53507;
            }
        }
        C4047 c4047 = this.f75310;
        c4047.m13014(1);
        c4047.m13020(str);
        int i = this.f75306;
        this.f75306 = i + 1;
        m52235(new C17275(i, 1, iHashCode, str));
        return i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m52239(int i, String str) {
        int iHashCode = (str.hashCode() + 129 + i) & Integer.MAX_VALUE;
        for (C17275 c17275M52236 = m52236(iHashCode); c17275M52236 != null; c17275M52236 = c17275M52236.f56268) {
            if (c17275M52236.f53505 == 129 && c17275M52236.f56269 == iHashCode && c17275M52236.f53502 == i && c17275M52236.f53504.equals(str)) {
                return c17275M52236.f53507;
            }
        }
        return m52229(new C17275(this.f75309, 129, iHashCode, i, str));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m52240(String str, String str2) {
        int iHashCode = ((str2.hashCode() * str.hashCode()) + 12) & Integer.MAX_VALUE;
        for (C17275 c17275M52236 = m52236(iHashCode); c17275M52236 != null; c17275M52236 = c17275M52236.f56268) {
            if (c17275M52236.f53505 == 12 && c17275M52236.f56269 == iHashCode && c17275M52236.f53508.equals(str) && c17275M52236.f53504.equals(str2)) {
                return c17275M52236.f53507;
            }
        }
        this.f75310.m13016(12, m52265(str), m52265(str2));
        int i = this.f75306;
        this.f75306 = i + 1;
        m52235(new C17275(str, i, iHashCode, str2));
        return i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C17275 m52231(String str, int i, int i2, String str2) {
        int iM31441 = C12669.m31441(i2, 1, str2.hashCode() * str.hashCode(), i) & Integer.MAX_VALUE;
        for (C17275 c17275M52236 = m52236(iM31441); c17275M52236 != null; c17275M52236 = c17275M52236.f56268) {
            if (c17275M52236.f53505 == i && c17275M52236.f56269 == iM31441 && c17275M52236.f53502 == i2 && c17275M52236.f53508.equals(str) && c17275M52236.f53504.equals(str2)) {
                return c17275M52236;
            }
        }
        this.f75310.m13016(i, i2, m52240(str, str2));
        int i3 = this.f75306;
        this.f75306 = i3 + 1;
        C17275 c17275 = new C17275(i3, i, null, str, str2, i2, iM31441);
        m52235(c17275);
        return c17275;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C17275 m52232(String str, int i, String str2, String str3) {
        int iHashCode = ((str3.hashCode() * str2.hashCode() * str.hashCode()) + i) & Integer.MAX_VALUE;
        for (C17275 c17275M52236 = m52236(iHashCode); c17275M52236 != null; c17275M52236 = c17275M52236.f56268) {
            if (c17275M52236.f53505 == i && c17275M52236.f56269 == iHashCode && c17275M52236.f53506.equals(str) && c17275M52236.f53508.equals(str2) && c17275M52236.f53504.equals(str3)) {
                return c17275M52236;
            }
        }
        this.f75310.m13016(i, m52233(7, str).f53507, m52240(str2, str3));
        int i2 = this.f75306;
        this.f75306 = i2 + 1;
        C17275 c17275 = new C17275(i2, i, str, str2, str3, 0L, iHashCode);
        m52235(c17275);
        return c17275;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17275 m52245(int i, String str, String str2, String str3, boolean z) {
        int i2 = (i <= 4 || !z) ? i : i << 8;
        int iHashCode = Integer.MAX_VALUE & ((str3.hashCode() * str2.hashCode() * str.hashCode() * i2) + 15);
        for (C17275 c17275M52236 = m52236(iHashCode); c17275M52236 != null; c17275M52236 = c17275M52236.f56268) {
            if (c17275M52236.f53505 == 15 && c17275M52236.f56269 == iHashCode && c17275M52236.f53502 == i2 && c17275M52236.f53506.equals(str) && c17275M52236.f53508.equals(str2) && c17275M52236.f53504.equals(str3)) {
                return c17275M52236;
            }
        }
        C4047 c4047 = this.f75310;
        if (i <= 4) {
            c4047.m13024(i, m52232(str, 9, str2, str3).f53507);
        } else {
            c4047.m13024(i, m52250(str, str2, str3, z).f53507);
        }
        int i3 = this.f75306;
        this.f75306 = i3 + 1;
        C17275 c17275 = new C17275(i3, 15, str, str2, str3, i2, iHashCode);
        m52235(c17275);
        return c17275;
    }
}
