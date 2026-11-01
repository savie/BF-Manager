package l;

/* JADX INFO: renamed from: l.᩻֡ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: DAUC */
/* JADX INFO: loaded from: classes.dex */
public final class C23344 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C12760 f75628;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f75629;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f75630;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C10644[] f75632;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public String f75633;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f75634;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C2175 f75635;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f75636;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C5704[] f75637;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f75638;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C10644[] f75640;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C5704[] f75627 = new C5704[256];

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f75639 = 1;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C2175 f75631 = new C2175();

    public C23344(C12760 c12760) {
        this.f75628 = c12760;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m51459() {
        return this.f75636;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m51465() {
        return this.f75633;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m51464(int i, String str) {
        this.f75636 = i;
        this.f75633 = str;
        return m51437(7, str).f54335;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m51461() {
        return this.f75639;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m51440() {
        return this.f75631.f7888;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m51468(C2175 c2175) {
        c2175.m6771(this.f75639);
        C2175 c2176 = this.f75631;
        c2175.m6768(0, c2176.f7888, c2176.f7887);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m51442() {
        if (this.f75635 == null) {
            return 0;
        }
        m51441("BootstrapMethods");
        return this.f75635.f7888 + 8;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51458(C2175 c2175) {
        if (this.f75635 != null) {
            c2175.m6771(m51441("BootstrapMethods"));
            c2175.m6773(this.f75635.f7888 + 2);
            c2175.m6771(this.f75630);
            C2175 c2176 = this.f75635;
            c2175.m6768(0, c2176.f7888, c2176.f7887);
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private C5704 m51432(int i) {
        C5704[] c5704Arr = this.f75627;
        return c5704Arr[i % c5704Arr.length];
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m51439(C5704 c5704) {
        int i = this.f75634;
        C5704[] c5704Arr = this.f75627;
        if (i > (c5704Arr.length * 3) / 4) {
            int length = c5704Arr.length;
            int i2 = (length * 2) + 1;
            C5704[] c5704Arr2 = new C5704[i2];
            while (true) {
                length--;
                if (length < 0) {
                    break;
                }
                C5704 c5705 = this.f75627[length];
                while (c5705 != null) {
                    int i3 = c5705.f19444 % i2;
                    C5704 c5706 = c5705.f19443;
                    c5705.f19443 = c5704Arr2[i3];
                    c5704Arr2[i3] = c5705;
                    c5705 = c5706;
                }
            }
            this.f75627 = c5704Arr2;
        }
        this.f75634++;
        int i4 = c5704.f19444;
        C5704[] c5704Arr3 = this.f75627;
        int length2 = i4 % c5704Arr3.length;
        c5704.f19443 = c5704Arr3[length2];
        c5704Arr3[length2] = c5704;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5704 m51452(Object obj) {
        if (obj instanceof Integer) {
            return m51438(3, ((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return m51438(3, ((Byte) obj).intValue());
        }
        if (obj instanceof Character) {
            return m51438(3, ((Character) obj).charValue());
        }
        if (obj instanceof Short) {
            return m51438(3, ((Short) obj).intValue());
        }
        if (obj instanceof Boolean) {
            return m51438(3, ((Boolean) obj).booleanValue() ? 1 : 0);
        }
        if (obj instanceof Float) {
            return m51448(((Float) obj).floatValue());
        }
        if (obj instanceof Long) {
            return m51434(5, ((Long) obj).longValue());
        }
        if (obj instanceof Double) {
            return m51447(((Double) obj).doubleValue());
        }
        if (obj instanceof String) {
            return m51437(8, (String) obj);
        }
        if (obj instanceof C14172) {
            C14172 c14172 = (C14172) obj;
            int iM34269 = c14172.m34269();
            if (iM34269 == 10) {
                return m51437(7, c14172.m34266());
            }
            return iM34269 == 11 ? m51437(16, c14172.m34268()) : m51437(7, c14172.m34268());
        }
        if (obj instanceof C19110) {
            C19110 c19110 = (C19110) obj;
            return m51450(c19110.m43910(), c19110.m43913(), c19110.m43914(), c19110.m43911(), c19110.m43912());
        }
        if (!(obj instanceof C3586)) {
            throw new IllegalArgumentException("value ".concat(String.valueOf(obj)));
        }
        C3586 c3586 = (C3586) obj;
        return m51435(c3586.m10601(), 17, m51457(c3586.m10600(), c3586.m10602()).f54335, c3586.m10598());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5704 m51453(String str) {
        return m51437(7, str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5704 m51454(String str, String str2, String str3) {
        return m51436(str, 9, str2, str3);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5704 m51455(String str, String str2, String str3, boolean z) {
        return m51436(str, z ? 11 : 10, str2, str3);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5704 m51449(int i) {
        return m51438(3, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5704 m51448(float f) {
        return m51438(4, Float.floatToRawIntBits(f));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private C5704 m51438(int i, int i2) {
        int i3 = (i + i2) & Integer.MAX_VALUE;
        for (C5704 c5704M51432 = m51432(i3); c5704M51432 != null; c5704M51432 = c5704M51432.f19443) {
            if (c5704M51432.f54336 == i && c5704M51432.f19444 == i3 && c5704M51432.f54332 == i2) {
                return c5704M51432;
            }
        }
        C2175 c2175 = this.f75631;
        c2175.m6764(i);
        c2175.m6773(i2);
        int i4 = this.f75639;
        this.f75639 = i4 + 1;
        C5704 c5704 = new C5704(i4, i, i3, i2);
        m51439(c5704);
        return c5704;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5704 m51451(long j) {
        return m51434(5, j);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5704 m51447(double d) {
        return m51434(6, Double.doubleToRawLongBits(d));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C5704 m51434(int i, long j) {
        int i2 = (((int) j) + i + ((int) (j >>> 32))) & Integer.MAX_VALUE;
        for (C5704 c5704M51432 = m51432(i2); c5704M51432 != null; c5704M51432 = c5704M51432.f19443) {
            if (c5704M51432.f54336 == i && c5704M51432.f19444 == i2 && c5704M51432.f54332 == j) {
                return c5704M51432;
            }
        }
        int i3 = this.f75639;
        C2175 c2175 = this.f75631;
        c2175.m6764(i);
        c2175.m6769(j);
        this.f75639 += 2;
        C5704 c5704 = new C5704(i3, i, i2, j);
        m51439(c5704);
        return c5704;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5704 m51456(String str, String str2, C19110 c19110, Object... objArr) {
        return m51435(str, 18, m51457(c19110, objArr).f54335, str2);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C5704 m51466(String str) {
        return m51437(19, str);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C5704 m51463(String str) {
        return m51437(20, str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5704 m51457(C19110 c19110, Object... objArr) {
        C2175 c2175 = this.f75635;
        if (c2175 == null) {
            c2175 = new C2175();
            this.f75635 = c2175;
        }
        int length = objArr.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = m51452(objArr[i]).f54335;
        }
        int i2 = c2175.f7888;
        c2175.m6771(m51450(c19110.m43910(), c19110.m43913(), c19110.m43914(), c19110.m43911(), c19110.m43912()).f54335);
        c2175.m6771(length);
        for (int i3 = 0; i3 < length; i3++) {
            c2175.m6771(iArr[i3]);
        }
        int i4 = c2175.f7888 - i2;
        int iHashCode = c19110.hashCode();
        for (Object obj : objArr) {
            iHashCode ^= obj.hashCode();
        }
        int i5 = iHashCode & Integer.MAX_VALUE;
        byte[] bArr = this.f75635.f7887;
        for (C5704 c5704M51432 = m51432(i5); c5704M51432 != null; c5704M51432 = c5704M51432.f19443) {
            if (c5704M51432.f54336 == 64 && c5704M51432.f19444 == i5) {
                int i6 = (int) c5704M51432.f54332;
                int i7 = 0;
                while (true) {
                    if (i7 < i4) {
                        if (bArr[i2 + i7] != bArr[i6 + i7]) {
                            break;
                        }
                        i7++;
                    } else {
                        this.f75635.f7888 = i2;
                        return c5704M51432;
                    }
                }
            }
        }
        int i8 = this.f75630;
        this.f75630 = i8 + 1;
        C5704 c5704 = new C5704(i8, 64, i5, i2);
        m51439(c5704);
        return c5704;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C5704 m51462(int i) {
        return this.f75637[i];
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C9938 m51467(int i) {
        return this.f75640[(int) this.f75637[i].f54332].f36314;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m51443(int i, int i2) {
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
        for (C5704 c5704M51432 = m51432(i3); c5704M51432 != null; c5704M51432 = c5704M51432.f19443) {
            if (c5704M51432.f54336 == 131 && c5704M51432.f19444 == i3 && c5704M51432.f54332 == j3) {
                return c5704M51432.f54334;
            }
        }
        C5704[] c5704Arr = this.f75637;
        String strReplace = c5704Arr[i].f54330;
        String str = c5704Arr[i2].f54330;
        ClassLoader classLoader = C12760.class.getClassLoader();
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
                int iM51460 = m51460(strReplace);
                C5704 c5704 = new C5704(this.f75638, 131, i3, j3);
                m51439(c5704);
                c5704.f54334 = iM51460;
                return iM51460;
            } catch (ClassNotFoundException e) {
                throw new TypeNotPresentException(str, e);
            }
        } catch (ClassNotFoundException e2) {
            throw new TypeNotPresentException(strReplace, e2);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m51433(C5704 c5704) {
        if (this.f75637 == null) {
            this.f75637 = new C5704[16];
        }
        int i = this.f75638;
        C5704[] c5704Arr = this.f75637;
        if (i == c5704Arr.length) {
            C5704[] c5704Arr2 = new C5704[c5704Arr.length * 2];
            System.arraycopy(c5704Arr, 0, c5704Arr2, 0, c5704Arr.length);
            this.f75637 = c5704Arr2;
        }
        C5704[] c5704Arr3 = this.f75637;
        int i2 = this.f75638;
        this.f75638 = i2 + 1;
        c5704Arr3[i2] = c5704;
        m51439(c5704);
        return c5704.f54335;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m51446(C9938 c9938) {
        if (this.f75632 == null) {
            this.f75632 = new C10644[16];
            this.f75640 = new C10644[16];
        }
        int iIdentityHashCode = System.identityHashCode(c9938);
        C10644[] c10644Arr = this.f75632;
        C10644 c10644 = c10644Arr[iIdentityHashCode % c10644Arr.length];
        while (c10644 != null && c10644.f36314 != c9938) {
            c10644 = c10644.f36313;
        }
        if (c10644 == null) {
            int i = this.f75629;
            C10644[] c10644Arr2 = this.f75632;
            if (i > (c10644Arr2.length * 3) / 4) {
                int length = c10644Arr2.length;
                int i2 = (length * 2) + 1;
                C10644[] c10644Arr3 = new C10644[i2];
                while (true) {
                    length--;
                    if (length < 0) {
                        break;
                    }
                    C10644 c10645 = this.f75632[length];
                    while (c10645 != null) {
                        int iIdentityHashCode2 = System.identityHashCode(c10645.f36314) % i2;
                        C10644 c10646 = c10645.f36313;
                        c10645.f36313 = c10644Arr3[iIdentityHashCode2];
                        c10644Arr3[iIdentityHashCode2] = c10645;
                        c10645 = c10646;
                    }
                }
                this.f75632 = c10644Arr3;
            }
            int i3 = this.f75629;
            C10644[] c10644Arr4 = this.f75640;
            if (i3 == c10644Arr4.length) {
                C10644[] c10644Arr5 = new C10644[c10644Arr4.length * 2];
                System.arraycopy(c10644Arr4, 0, c10644Arr5, 0, c10644Arr4.length);
                this.f75640 = c10644Arr5;
            }
            int i4 = this.f75629;
            c10644 = new C10644(i4, c9938);
            C10644[] c10644Arr6 = this.f75632;
            int length2 = iIdentityHashCode % c10644Arr6.length;
            c10644.f36313 = c10644Arr6[length2];
            c10644Arr6[length2] = c10644;
            C10644[] c10644Arr7 = this.f75640;
            this.f75629 = i4 + 1;
            c10644Arr7[i4] = c10644;
        }
        int i5 = c10644.f36312;
        int i6 = (i5 + 130) & Integer.MAX_VALUE;
        for (C5704 c5704M51432 = m51432(i6); c5704M51432 != null; c5704M51432 = c5704M51432.f19443) {
            if (c5704M51432.f54336 == 130 && c5704M51432.f19444 == i6 && c5704M51432.f54332 == i5 && c5704M51432.f54330.equals("")) {
                return c5704M51432.f54335;
            }
        }
        return m51433(new C5704(this.f75638, 130, i6, i5, ""));
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private C5704 m51437(int i, String str) {
        int iHashCode = (str.hashCode() + i) & Integer.MAX_VALUE;
        for (C5704 c5704M51432 = m51432(iHashCode); c5704M51432 != null; c5704M51432 = c5704M51432.f19443) {
            if (c5704M51432.f54336 == i && c5704M51432.f19444 == iHashCode && c5704M51432.f54330.equals(str)) {
                return c5704M51432;
            }
        }
        this.f75631.m6772(i, m51441(str));
        int i2 = this.f75639;
        this.f75639 = i2 + 1;
        C5704 c5704 = new C5704(i2, i, iHashCode, str);
        m51439(c5704);
        return c5704;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m51441(String str) {
        int iHashCode = (str.hashCode() + 1) & Integer.MAX_VALUE;
        for (C5704 c5704M51432 = m51432(iHashCode); c5704M51432 != null; c5704M51432 = c5704M51432.f19443) {
            if (c5704M51432.f54336 == 1 && c5704M51432.f19444 == iHashCode && c5704M51432.f54330.equals(str)) {
                return c5704M51432.f54335;
            }
        }
        C2175 c2175 = this.f75631;
        c2175.m6764(1);
        c2175.m6770(str);
        int i = this.f75639;
        this.f75639 = i + 1;
        m51439(new C5704(i, 1, iHashCode, str));
        return i;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m51460(String str) {
        int iHashCode = (str.hashCode() + 128) & Integer.MAX_VALUE;
        for (C5704 c5704M51432 = m51432(iHashCode); c5704M51432 != null; c5704M51432 = c5704M51432.f19443) {
            if (c5704M51432.f54336 == 128 && c5704M51432.f19444 == iHashCode && c5704M51432.f54330.equals(str)) {
                return c5704M51432.f54335;
            }
        }
        return m51433(new C5704(this.f75638, 128, iHashCode, str));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m51444(int i, String str) {
        int iHashCode = (str.hashCode() + 129 + i) & Integer.MAX_VALUE;
        for (C5704 c5704M51432 = m51432(iHashCode); c5704M51432 != null; c5704M51432 = c5704M51432.f19443) {
            if (c5704M51432.f54336 == 129 && c5704M51432.f19444 == iHashCode && c5704M51432.f54332 == i && c5704M51432.f54330.equals(str)) {
                return c5704M51432.f54335;
            }
        }
        return m51433(new C5704(this.f75638, 129, iHashCode, i, str));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m51445(String str, String str2) {
        int iHashCode = ((str2.hashCode() * str.hashCode()) + 12) & Integer.MAX_VALUE;
        for (C5704 c5704M51432 = m51432(iHashCode); c5704M51432 != null; c5704M51432 = c5704M51432.f19443) {
            if (c5704M51432.f54336 == 12 && c5704M51432.f19444 == iHashCode && c5704M51432.f54331.equals(str) && c5704M51432.f54330.equals(str2)) {
                return c5704M51432.f54335;
            }
        }
        this.f75631.m6766(12, m51441(str), m51441(str2));
        int i = this.f75639;
        this.f75639 = i + 1;
        m51439(new C5704(str, i, iHashCode, str2));
        return i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C5704 m51435(String str, int i, int i2, String str2) {
        int iM1692 = C0252.m1692(i2, 1, str2.hashCode() * str.hashCode(), i) & Integer.MAX_VALUE;
        for (C5704 c5704M51432 = m51432(iM1692); c5704M51432 != null; c5704M51432 = c5704M51432.f19443) {
            if (c5704M51432.f54336 == i && c5704M51432.f19444 == iM1692 && c5704M51432.f54332 == i2 && c5704M51432.f54331.equals(str) && c5704M51432.f54330.equals(str2)) {
                return c5704M51432;
            }
        }
        this.f75631.m6766(i, i2, m51445(str, str2));
        int i3 = this.f75639;
        this.f75639 = i3 + 1;
        C5704 c5704 = new C5704(i3, i, null, str, str2, i2, iM1692);
        m51439(c5704);
        return c5704;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C5704 m51436(String str, int i, String str2, String str3) {
        int iHashCode = ((str3.hashCode() * str2.hashCode() * str.hashCode()) + i) & Integer.MAX_VALUE;
        for (C5704 c5704M51432 = m51432(iHashCode); c5704M51432 != null; c5704M51432 = c5704M51432.f19443) {
            if (c5704M51432.f54336 == i && c5704M51432.f19444 == iHashCode && c5704M51432.f54333.equals(str) && c5704M51432.f54331.equals(str2) && c5704M51432.f54330.equals(str3)) {
                return c5704M51432;
            }
        }
        this.f75631.m6766(i, m51437(7, str).f54335, m51445(str2, str3));
        int i2 = this.f75639;
        this.f75639 = i2 + 1;
        C5704 c5704 = new C5704(i2, i, str, str2, str3, 0L, iHashCode);
        m51439(c5704);
        return c5704;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5704 m51450(int i, String str, String str2, String str3, boolean z) {
        int i2 = (i <= 4 || !z) ? i : i << 8;
        int iHashCode = Integer.MAX_VALUE & ((str3.hashCode() * str2.hashCode() * str.hashCode() * i2) + 15);
        for (C5704 c5704M51432 = m51432(iHashCode); c5704M51432 != null; c5704M51432 = c5704M51432.f19443) {
            if (c5704M51432.f54336 == 15 && c5704M51432.f19444 == iHashCode && c5704M51432.f54332 == i2 && c5704M51432.f54333.equals(str) && c5704M51432.f54331.equals(str2) && c5704M51432.f54330.equals(str3)) {
                return c5704M51432;
            }
        }
        C2175 c2175 = this.f75631;
        if (i <= 4) {
            c2175.m6774(i, m51436(str, 9, str2, str3).f54335);
        } else {
            c2175.m6774(i, m51455(str, str2, str3, z).f54335);
        }
        int i3 = this.f75639;
        this.f75639 = i3 + 1;
        C5704 c5704 = new C5704(i3, 15, str, str2, str3, i2, iHashCode);
        m51439(c5704);
        return c5704;
    }
}
