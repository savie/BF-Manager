package l;

import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ܳ᩶ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: H6V3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14744 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C16072 f48220;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f48221;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AbstractC0631 f48222;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f48223;

    public C14744(AbstractC0631 abstractC0631, int i, int i2, C16072 c16072) {
        this.f48220 = c16072;
        this.f48222 = abstractC0631;
        this.f48221 = i;
        this.f48223 = i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14744 m35326(int i, int i2, C16072 c16072) {
        return new C14744(null, i, i2, c16072);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m35340(C14744 c14744) {
        return this.f48222 == c14744.f48222;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m35338() {
        AbstractC0631 abstractC0631 = this.f48222;
        if (abstractC0631 == null) {
            return 0;
        }
        return abstractC0631.f2726;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m35332() {
        AbstractC0631 abstractC0631 = this.f48222;
        if (abstractC0631 == null) {
            return -1;
        }
        return abstractC0631.f2724;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m35339() {
        AbstractC0631 abstractC0631 = this.f48222;
        if (abstractC0631 == null) {
            return 0;
        }
        return abstractC0631.f2727;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14744 m35337(C14744 c14744) {
        C16072 c16072 = c14744.f48220;
        C16072 c16073 = this.f48220;
        if (c16073 == c16072) {
            int i = c14744.f48221;
            int i2 = this.f48221;
            if (i2 == i) {
                int i3 = c14744.f48223;
                int i4 = this.f48223;
                if (i4 == i3) {
                    m35329(m35339(), 0, c14744.m35339());
                    return new C14744(m35325(this.f48222, c14744.f48222, new Object()), i2, i4, c16073);
                }
            }
        }
        throw new IllegalArgumentException("Text fragments belong to different stores");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m35328(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            StringBuilder sbM2791 = C0589.m2791("Invalid text range: ", i, "..", "/", i2);
            sbM2791.append(i3);
            throw new IndexOutOfBoundsException(sbM2791.toString());
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m35329(int i, int i2, int i3) {
        long j = (((long) i) - ((long) i2)) + ((long) i3);
        if (j > 2147483647L || j < 0) {
            throw new IllegalArgumentException("Text exceeds UTF-16 coordinate limit");
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0097  */
    /* JADX WARN: Code duplicated, block: B:32:0x009a A[Catch: all -> 0x00cb, LOOP:1: B:31:0x0098->B:32:0x009a, LOOP_END, TryCatch #2 {all -> 0x00cb, blocks: (B:14:0x0048, B:19:0x0056, B:21:0x0059, B:33:0x00a5, B:22:0x0061, B:24:0x0065, B:25:0x0073, B:27:0x007b, B:29:0x0084, B:32:0x009a), top: B:70:0x0048, outer: #0 }] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14744 m35335(int i, int i2, CharSequence charSequence, Object obj) {
        int iMin;
        int i3;
        int i4;
        int i5;
        int i6 = i;
        C16072 c16072 = this.f48220;
        int i7 = this.f48223;
        int i8 = this.f48221;
        if (i6 == i2) {
            return new C14744(null, i8, i7, c16072);
        }
        int i9 = i2 - i6;
        int i10 = i8 - (i8 / 8);
        if (i9 <= i8) {
            iMin = 1;
        } else {
            long j = i10;
            iMin = Math.min((int) (((((long) i9) + j) - 1) / j), i9 / (i8 / 2));
        }
        int i11 = i9 / iMin;
        int i12 = i9 % iMin;
        ArrayList arrayList = new ArrayList(iMin);
        C2042 c2042 = new C2042(c16072, i8);
        try {
            C4159 c4159Mo33951 = charSequence instanceof C17565 ? ((C17565) charSequence).mo33951(i6) : null;
            try {
                char[] cArrM6538 = c2042.m6538();
                int i13 = 0;
                int i14 = 0;
                while (i14 < iMin) {
                    int i15 = (i14 < i12 ? 1 : 0) + i11;
                    if (c4159Mo33951 != null) {
                        c4159Mo33951.m11800(cArrM6538, i13, i15);
                        i3 = i12;
                        i4 = iMin;
                    } else if (charSequence instanceof String) {
                        i3 = i12;
                        i4 = iMin;
                        ((String) charSequence).getChars(i6, i6 + i15, cArrM6538, 0);
                    } else {
                        i3 = i12;
                        i4 = iMin;
                        if (charSequence instanceof CharBuffer) {
                            CharBuffer charBuffer = (CharBuffer) charSequence;
                            if (charBuffer.hasArray()) {
                                System.arraycopy(charBuffer.array(), charBuffer.arrayOffset() + charBuffer.position() + i6, cArrM6538, 0, i15);
                            } else {
                                for (i5 = 0; i5 < i15; i5++) {
                                    cArrM6538[i5] = charSequence.charAt(i6 + i5);
                                }
                            }
                        } else {
                            while (i5 < i15) {
                                cArrM6538[i5] = charSequence.charAt(i6 + i5);
                            }
                        }
                    }
                    int i16 = i14;
                    char[] cArr = cArrM6538;
                    arrayList.add(new C16155(obj, this.f48221, cArrM6538, 0, i15, this.f48220));
                    i6 += i15;
                    i14 = i16 + 1;
                    i13 = 0;
                    i12 = i3;
                    cArrM6538 = cArr;
                    iMin = i4;
                }
                if (c4159Mo33951 != null) {
                    c4159Mo33951.close();
                }
                c2042.close();
                while (arrayList.size() > 1) {
                    int size = ((arrayList.size() + i7) - 1) / i7;
                    int size2 = arrayList.size() / size;
                    int size3 = arrayList.size() % size;
                    ArrayList arrayList2 = new ArrayList(size);
                    int i17 = 0;
                    int i18 = 0;
                    while (i18 < size) {
                        int i19 = (i18 < size3 ? 1 : 0) + size2 + i17;
                        arrayList2.add(new C1337(obj, (AbstractC0631[]) arrayList.subList(i17, i19).toArray(new AbstractC0631[0])));
                        i18++;
                        i17 = i19;
                    }
                    arrayList = arrayList2;
                }
                return new C14744((AbstractC0631) arrayList.get(0), i8, i7, c16072);
            } catch (Throwable th) {
                if (c4159Mo33951 == null) {
                    throw th;
                }
                try {
                    c4159Mo33951.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (Throwable th3) {
            try {
                c2042.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0048 A[Catch: Error | RuntimeException -> 0x0059, RuntimeException -> 0x005b, LOOP:0: B:16:0x0046->B:17:0x0048, LOOP_END, TryCatch #2 {Error | RuntimeException -> 0x0059, blocks: (B:5:0x000e, B:7:0x0017, B:18:0x0053, B:8:0x001d, B:10:0x0021, B:11:0x0027, B:13:0x002b, B:15:0x0034, B:17:0x0048), top: B:37:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:40:? A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11216 m35333(int i, int i2, CharSequence charSequence) {
        int i3 = i2 - i;
        C16072 c16072 = this.f48220;
        int i4 = this.f48221;
        if (i3 <= i4) {
            C2042 c2042 = new C2042(c16072, i3);
            try {
                char[] cArrM6538 = c2042.m6538();
                if (charSequence instanceof C17565) {
                    ((C17565) charSequence).getChars(i, i2, cArrM6538, 0);
                } else if (charSequence instanceof String) {
                    ((String) charSequence).getChars(i, i2, cArrM6538, 0);
                } else if (charSequence instanceof CharBuffer) {
                    CharBuffer charBuffer = (CharBuffer) charSequence;
                    if (charBuffer.hasArray()) {
                        System.arraycopy(charBuffer.array(), charBuffer.arrayOffset() + charBuffer.position() + i, cArrM6538, 0, i3);
                    } else {
                        for (int i5 = 0; i5 < i3; i5++) {
                            cArrM6538[i5] = charSequence.charAt(i + i5);
                        }
                    }
                } else {
                    while (i5 < i3) {
                        cArrM6538[i5] = charSequence.charAt(i + i5);
                    }
                }
                return new C11216(cArrM6538, null, i3, c2042);
            } catch (Error | RuntimeException e) {
                c2042.close();
                throw e;
            }
        }
        if (charSequence instanceof C17565) {
            C17565 c17565 = (C17565) charSequence;
            C14744 c14744M40840 = c17565.m40840();
            if (c14744M40840.f48221 == i4 && c14744M40840.f48223 == this.f48223 && c14744M40840.f48220 == c16072) {
                return new C11216(null, c14744M40840.m35334(c17565.mo33950() + i, c17565.mo33950() + i2).f48222, i3, null);
            }
        }
        return new C11216(null, m35335(i, i2, charSequence, new Object()).f48222, i3, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14744 m35336(int i, int i2, C11216 c11216, Object obj) {
        int i3;
        if (i == i2 && c11216.f37948 == 0) {
            return this;
        }
        AbstractC0631 c16155 = c11216.f37945;
        char[] cArr = c11216.f37946;
        AbstractC0631 abstractC0631 = this.f48222;
        C16072 c16072 = this.f48220;
        int i4 = this.f48223;
        int i5 = this.f48221;
        if (cArr != null) {
            if (abstractC0631 != null) {
                i3 = i5;
                AbstractC0631 abstractC0631M35324 = m35324(abstractC0631, i, i2, cArr, c11216.f37948, obj, true);
                if (abstractC0631M35324 != null) {
                    return new C14744(abstractC0631M35324, i3, i4, c16072);
                }
            } else {
                i3 = i5;
            }
            int i6 = c11216.f37948;
            if (i6 == 0) {
                c16155 = null;
            } else {
                c16155 = new C16155(obj, this.f48221, c11216.f37946, 0, i6, this.f48220);
            }
        } else {
            i3 = i5;
        }
        C23916 c23916M35327 = m35327(abstractC0631, i, obj);
        return new C14744(m35325(m35325(c23916M35327.f77478, c16155, obj), m35327(c23916M35327.f77479, i2 - i, obj).f77479, obj), i3, i4, c16072);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private AbstractC0631 m35324(AbstractC0631 abstractC0631, int i, int i2, char[] cArr, int i3, Object obj, boolean z) {
        AbstractC0631 abstractC0632;
        int i4;
        AbstractC0631 abstractC0631M35324;
        if (abstractC0631 instanceof C16155) {
            int i5 = (abstractC0631.f2727 - (i2 - i)) + i3;
            int i6 = this.f48221;
            if (i5 > i6) {
                return null;
            }
            if ((z || i5 >= i6 / 2) && i5 != 0) {
                return ((C16155) abstractC0631).m38244(obj, i, i2, cArr, i3);
            }
            return null;
        }
        C1337 c1337 = (C1337) abstractC0631;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            AbstractC0631[] abstractC0631Arr = c1337.f5650;
            if (i8 < abstractC0631Arr.length) {
                abstractC0632 = abstractC0631Arr[i8];
                i4 = abstractC0632.f2727 + i7;
                if (i < i4 || i8 == abstractC0631Arr.length - 1) {
                    break;
                }
                i8++;
                i7 = i4;
            } else {
                throw new AssertionError();
            }
        }
        if (i2 > i4 || (abstractC0631M35324 = m35324(abstractC0632, i - i7, i2 - i7, cArr, i3, obj, false)) == null) {
            return null;
        }
        if (c1337.f2723 != obj) {
            c1337 = new C1337(obj, (AbstractC0631[]) c1337.f5650.clone());
        }
        c1337.f5650[i8] = abstractC0631M35324;
        c1337.m4741();
        return c1337;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14744 m35334(int i, int i2) {
        m35328(i, i2, m35339());
        if (i == 0 && i2 == m35339()) {
            return this;
        }
        Object obj = new Object();
        return new C14744(m35327(m35327(this.f48222, i, obj).f77479, i2 - i, obj).f77478, this.f48221, this.f48223, this.f48220);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C23916 m35327(AbstractC0631 abstractC0631, int i, Object obj) {
        if (abstractC0631 == null) {
            return new C23916(null, null);
        }
        if (i == 0) {
            return new C23916(null, abstractC0631);
        }
        if (i == abstractC0631.f2727) {
            return new C23916(abstractC0631, null);
        }
        if (abstractC0631 instanceof C16155) {
            C2042 c2042 = new C2042(this.f48220, abstractC0631.f2727);
            try {
                char[] cArrM6538 = c2042.m6538();
                ((C16155) abstractC0631).m38245(cArrM6538, abstractC0631.f2727, 0);
                C23916 c23916 = new C23916(new C16155(obj, this.f48221, cArrM6538, 0, i, this.f48220), new C16155(obj, this.f48221, cArrM6538, i, abstractC0631.f2727 - i, this.f48220));
                c2042.close();
                return c23916;
            } catch (Throwable th) {
                try {
                    c2042.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        AbstractC0631[] abstractC0631Arr = ((C1337) abstractC0631).f5650;
        int i2 = 0;
        while (true) {
            AbstractC0631 abstractC0632 = abstractC0631Arr[i2];
            int i3 = abstractC0632.f2727;
            if (i <= i3) {
                C23916 c23916M35327 = m35327(abstractC0632, i, obj);
                return new C23916(m35325(m35323(obj, (AbstractC0631[]) Arrays.copyOfRange(abstractC0631Arr, 0, i2)), c23916M35327.f77478, obj), m35325(c23916M35327.f77479, m35323(obj, (AbstractC0631[]) Arrays.copyOfRange(abstractC0631Arr, i2 + 1, abstractC0631Arr.length)), obj));
            }
            i2++;
            i -= i3;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC0631 m35323(Object obj, AbstractC0631[] abstractC0631Arr) {
        if (abstractC0631Arr.length == 0) {
            return null;
        }
        return abstractC0631Arr.length == 1 ? abstractC0631Arr[0] : new C1337(obj, abstractC0631Arr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private AbstractC0631 m35325(AbstractC0631 abstractC0631, AbstractC0631 abstractC0632, Object obj) {
        if (abstractC0631 == null) {
            return abstractC0632;
        }
        return abstractC0632 == null ? abstractC0631 : m35323(obj, m35330(abstractC0631, abstractC0632, obj));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private AbstractC0631[] m35330(AbstractC0631 abstractC0631, AbstractC0631 abstractC0632, Object obj) {
        AbstractC0631[] abstractC0631Arr;
        int i;
        int i2 = abstractC0631.f2724;
        if (i2 == 0 && abstractC0632.f2724 == 0) {
            int i3 = abstractC0631.f2727;
            int i4 = abstractC0632.f2727;
            int i5 = i3 + i4;
            int i6 = this.f48221;
            if (i5 > i6 && i3 >= (i = i6 / 2) && i4 >= i) {
                return new AbstractC0631[]{abstractC0631, abstractC0632};
            }
            C2042 c2042 = new C2042(this.f48220, i5);
            try {
                char[] cArrM6538 = c2042.m6538();
                ((C16155) abstractC0631).m38245(cArrM6538, abstractC0631.f2727, 0);
                ((C16155) abstractC0632).m38245(cArrM6538, abstractC0632.f2727, abstractC0631.f2727);
                int i7 = this.f48221;
                if (i5 > i7) {
                    int i8 = i5 / 2;
                    AbstractC0631[] abstractC0631Arr2 = {new C16155(obj, i7, cArrM6538, 0, i8, this.f48220), new C16155(obj, this.f48221, cArrM6538, i8, i5 - i8, this.f48220)};
                    c2042.close();
                    return abstractC0631Arr2;
                }
                AbstractC0631[] abstractC0631Arr3 = {new C16155(obj, i7, cArrM6538, 0, i5, this.f48220)};
                c2042.close();
                return abstractC0631Arr3;
            } catch (Throwable th) {
                try {
                    c2042.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        }
        int i9 = abstractC0632.f2724;
        if (i2 == i9) {
            AbstractC0631[] abstractC0631Arr4 = ((C1337) abstractC0631).f5650;
            AbstractC0631[] abstractC0631Arr5 = ((C1337) abstractC0632).f5650;
            abstractC0631Arr = new AbstractC0631[abstractC0631Arr4.length + abstractC0631Arr5.length];
            System.arraycopy(abstractC0631Arr4, 0, abstractC0631Arr, 0, abstractC0631Arr4.length);
            System.arraycopy(abstractC0631Arr5, 0, abstractC0631Arr, abstractC0631Arr4.length, abstractC0631Arr5.length);
        } else if (i2 > i9) {
            AbstractC0631[] abstractC0631Arr6 = ((C1337) abstractC0631).f5650;
            AbstractC0631[] abstractC0631ArrM35330 = m35330(abstractC0631Arr6[abstractC0631Arr6.length - 1], abstractC0632, obj);
            abstractC0631Arr = (AbstractC0631[]) Arrays.copyOf(abstractC0631Arr6, (abstractC0631Arr6.length - 1) + abstractC0631ArrM35330.length);
            System.arraycopy(abstractC0631ArrM35330, 0, abstractC0631Arr, abstractC0631Arr6.length - 1, abstractC0631ArrM35330.length);
        } else {
            AbstractC0631[] abstractC0631Arr7 = ((C1337) abstractC0632).f5650;
            AbstractC0631[] abstractC0631ArrM35331 = m35330(abstractC0631, abstractC0631Arr7[0], obj);
            abstractC0631Arr = new AbstractC0631[(abstractC0631ArrM35331.length + abstractC0631Arr7.length) - 1];
            System.arraycopy(abstractC0631ArrM35331, 0, abstractC0631Arr, 0, abstractC0631ArrM35331.length);
            System.arraycopy(abstractC0631Arr7, 1, abstractC0631Arr, abstractC0631ArrM35331.length, abstractC0631Arr7.length - 1);
        }
        if (abstractC0631Arr.length <= this.f48223) {
            return new AbstractC0631[]{new C1337(obj, abstractC0631Arr)};
        }
        int length = abstractC0631Arr.length / 2;
        return new AbstractC0631[]{new C1337(obj, (AbstractC0631[]) Arrays.copyOfRange(abstractC0631Arr, 0, length)), new C1337(obj, (AbstractC0631[]) Arrays.copyOfRange(abstractC0631Arr, length, abstractC0631Arr.length))};
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final char m35331(int i) {
        AbstractC0631 abstractC0631 = this.f48222;
        while (abstractC0631 instanceof C1337) {
            for (AbstractC0631 abstractC0632 : ((C1337) abstractC0631).f5650) {
                int i2 = abstractC0632.f2727;
                if (i < i2) {
                    abstractC0631 = abstractC0632;
                    break;
                }
                i -= i2;
            }
        }
        return ((C16155) abstractC0631).m38242(i);
    }
}
