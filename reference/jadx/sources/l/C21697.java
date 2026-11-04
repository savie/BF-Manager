package l;

import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: l.᩷֡᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: H6V3 */
/* JADX INFO: loaded from: classes.dex */
public final class C21697 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f69244;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AbstractC1339 f69245;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f69246;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C10046 f69247;

    public C21697(AbstractC1339 abstractC1339, int i, int i2, C10046 c10046) {
        this.f69247 = c10046;
        this.f69245 = abstractC1339;
        this.f69244 = i;
        this.f69246 = i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21697 m49247(int i, int i2, C10046 c10046) {
        return new C21697(null, i, i2, c10046);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m49260(C21697 c21697) {
        return this.f69245 == c21697.f69245;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m49258() {
        AbstractC1339 abstractC1339 = this.f69245;
        if (abstractC1339 == null) {
            return 0;
        }
        return abstractC1339.f4792;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m49252() {
        AbstractC1339 abstractC1339 = this.f69245;
        if (abstractC1339 == null) {
            return -1;
        }
        return abstractC1339.f4791;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m49259() {
        AbstractC1339 abstractC1339 = this.f69245;
        if (abstractC1339 == null) {
            return 0;
        }
        return abstractC1339.f4794;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21697 m49257(C21697 c21697) {
        C10046 c10046 = c21697.f69247;
        C10046 c10047 = this.f69247;
        if (c10047 == c10046) {
            int i = c21697.f69244;
            int i2 = this.f69244;
            if (i2 == i) {
                int i3 = c21697.f69246;
                int i4 = this.f69246;
                if (i4 == i3) {
                    m49249(m49259(), 0, c21697.m49259());
                    return new C21697(m49245(this.f69245, c21697.f69245, new Object()), i2, i4, c10047);
                }
            }
        }
        throw new IllegalArgumentException("Text fragments belong to different stores");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m49248(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            StringBuilder sbM5126 = C1402.m5126("Invalid text range: ", i, "..", "/", i2);
            sbM5126.append(i3);
            throw new IndexOutOfBoundsException(sbM5126.toString());
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m49249(int i, int i2, int i3) {
        long j = (((long) i) - ((long) i2)) + ((long) i3);
        if (j > 2147483647L || j < 0) {
            throw new IllegalArgumentException("Text exceeds UTF-16 coordinate limit");
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0097  */
    /* JADX WARN: Code duplicated, block: B:32:0x009a A[Catch: all -> 0x00cb, LOOP:1: B:31:0x0098->B:32:0x009a, LOOP_END, TryCatch #2 {all -> 0x00cb, blocks: (B:14:0x0048, B:19:0x0056, B:21:0x0059, B:33:0x00a5, B:22:0x0061, B:24:0x0065, B:25:0x0073, B:27:0x007b, B:29:0x0084, B:32:0x009a), top: B:70:0x0048, outer: #0 }] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21697 m49255(int i, int i2, CharSequence charSequence, Object obj) {
        int iMin;
        int i3;
        int i4;
        int i5;
        int i6 = i;
        C10046 c10046 = this.f69247;
        int i7 = this.f69246;
        int i8 = this.f69244;
        if (i6 == i2) {
            return new C21697(null, i8, i7, c10046);
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
        C10508 c10508 = new C10508(c10046, i8);
        try {
            C23714 c23714Mo16945 = charSequence instanceof C8796 ? ((C8796) charSequence).mo16945(i6) : null;
            try {
                char[] cArrM26971 = c10508.m26971();
                int i13 = 0;
                int i14 = 0;
                while (i14 < iMin) {
                    int i15 = (i14 < i12 ? 1 : 0) + i11;
                    if (c23714Mo16945 != null) {
                        c23714Mo16945.m52963(cArrM26971, i13, i15);
                        i3 = i12;
                        i4 = iMin;
                    } else if (charSequence instanceof String) {
                        i3 = i12;
                        i4 = iMin;
                        ((String) charSequence).getChars(i6, i6 + i15, cArrM26971, 0);
                    } else {
                        i3 = i12;
                        i4 = iMin;
                        if (charSequence instanceof CharBuffer) {
                            CharBuffer charBuffer = (CharBuffer) charSequence;
                            if (charBuffer.hasArray()) {
                                System.arraycopy(charBuffer.array(), charBuffer.arrayOffset() + charBuffer.position() + i6, cArrM26971, 0, i15);
                            } else {
                                for (i5 = 0; i5 < i15; i5++) {
                                    cArrM26971[i5] = charSequence.charAt(i6 + i5);
                                }
                            }
                        } else {
                            while (i5 < i15) {
                                cArrM26971[i5] = charSequence.charAt(i6 + i5);
                            }
                        }
                    }
                    int i16 = i14;
                    char[] cArr = cArrM26971;
                    arrayList.add(new C19238(obj, this.f69244, cArrM26971, 0, i15, this.f69247));
                    i6 += i15;
                    i14 = i16 + 1;
                    i13 = 0;
                    i12 = i3;
                    cArrM26971 = cArr;
                    iMin = i4;
                }
                if (c23714Mo16945 != null) {
                    c23714Mo16945.close();
                }
                c10508.close();
                while (arrayList.size() > 1) {
                    int size = ((arrayList.size() + i7) - 1) / i7;
                    int size2 = arrayList.size() / size;
                    int size3 = arrayList.size() % size;
                    ArrayList arrayList2 = new ArrayList(size);
                    int i17 = 0;
                    int i18 = 0;
                    while (i18 < size) {
                        int i19 = (i18 < size3 ? 1 : 0) + size2 + i17;
                        arrayList2.add(new C17746(obj, (AbstractC1339[]) arrayList.subList(i17, i19).toArray(new AbstractC1339[0])));
                        i18++;
                        i17 = i19;
                    }
                    arrayList = arrayList2;
                }
                return new C21697((AbstractC1339) arrayList.get(0), i8, i7, c10046);
            } catch (Throwable th) {
                if (c23714Mo16945 == null) {
                    throw th;
                }
                try {
                    c23714Mo16945.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (Throwable th3) {
            try {
                c10508.close();
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
    public final C14016 m49253(int i, int i2, CharSequence charSequence) {
        int i3 = i2 - i;
        C10046 c10046 = this.f69247;
        int i4 = this.f69244;
        if (i3 <= i4) {
            C10508 c10508 = new C10508(c10046, i3);
            try {
                char[] cArrM26971 = c10508.m26971();
                if (charSequence instanceof C8796) {
                    ((C8796) charSequence).getChars(i, i2, cArrM26971, 0);
                } else if (charSequence instanceof String) {
                    ((String) charSequence).getChars(i, i2, cArrM26971, 0);
                } else if (charSequence instanceof CharBuffer) {
                    CharBuffer charBuffer = (CharBuffer) charSequence;
                    if (charBuffer.hasArray()) {
                        System.arraycopy(charBuffer.array(), charBuffer.arrayOffset() + charBuffer.position() + i, cArrM26971, 0, i3);
                    } else {
                        for (int i5 = 0; i5 < i3; i5++) {
                            cArrM26971[i5] = charSequence.charAt(i + i5);
                        }
                    }
                } else {
                    while (i5 < i3) {
                        cArrM26971[i5] = charSequence.charAt(i + i5);
                    }
                }
                return new C14016(cArrM26971, null, i3, c10508);
            } catch (Error | RuntimeException e) {
                c10508.close();
                throw e;
            }
        }
        if (charSequence instanceof C8796) {
            C8796 c8796 = (C8796) charSequence;
            C21697 c21697M23622 = c8796.m23622();
            if (c21697M23622.f69244 == i4 && c21697M23622.f69246 == this.f69246 && c21697M23622.f69247 == c10046) {
                return new C14016(null, c21697M23622.m49254(c8796.mo16944() + i, c8796.mo16944() + i2).f69245, i3, null);
            }
        }
        return new C14016(null, m49255(i, i2, charSequence, new Object()).f69245, i3, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21697 m49256(int i, int i2, C14016 c14016, Object obj) {
        int i3;
        if (i == i2 && c14016.f44409 == 0) {
            return this;
        }
        AbstractC1339 c19238 = c14016.f44408;
        char[] cArr = c14016.f44407;
        AbstractC1339 abstractC1339 = this.f69245;
        C10046 c10046 = this.f69247;
        int i4 = this.f69246;
        int i5 = this.f69244;
        if (cArr != null) {
            if (abstractC1339 != null) {
                i3 = i5;
                AbstractC1339 abstractC1339M49244 = m49244(abstractC1339, i, i2, cArr, c14016.f44409, obj, true);
                if (abstractC1339M49244 != null) {
                    return new C21697(abstractC1339M49244, i3, i4, c10046);
                }
            } else {
                i3 = i5;
            }
            int i6 = c14016.f44409;
            if (i6 == 0) {
                c19238 = null;
            } else {
                c19238 = new C19238(obj, this.f69244, c14016.f44407, 0, i6, this.f69247);
            }
        } else {
            i3 = i5;
        }
        C4543 c4543M49246 = m49246(abstractC1339, i, obj);
        return new C21697(m49245(m49245(c4543M49246.f16152, c19238, obj), m49246(c4543M49246.f16153, i2 - i, obj).f16153, obj), i3, i4, c10046);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private AbstractC1339 m49244(AbstractC1339 abstractC1339, int i, int i2, char[] cArr, int i3, Object obj, boolean z) {
        AbstractC1339 abstractC13310;
        int i4;
        AbstractC1339 abstractC1339M49244;
        if (abstractC1339 instanceof C19238) {
            int i5 = (abstractC1339.f4794 - (i2 - i)) + i3;
            int i6 = this.f69244;
            if (i5 > i6) {
                return null;
            }
            if ((z || i5 >= i6 / 2) && i5 != 0) {
                return ((C19238) abstractC1339).m44570(obj, i, i2, cArr, i3);
            }
            return null;
        }
        C17746 c17746 = (C17746) abstractC1339;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            AbstractC1339[] abstractC1339Arr = c17746.f58291;
            if (i8 < abstractC1339Arr.length) {
                abstractC13310 = abstractC1339Arr[i8];
                i4 = abstractC13310.f4794 + i7;
                if (i < i4 || i8 == abstractC1339Arr.length - 1) {
                    break;
                }
                i8++;
                i7 = i4;
            } else {
                throw new AssertionError();
            }
        }
        if (i2 > i4 || (abstractC1339M49244 = m49244(abstractC13310, i - i7, i2 - i7, cArr, i3, obj, false)) == null) {
            return null;
        }
        if (c17746.f4795 != obj) {
            c17746 = new C17746(obj, (AbstractC1339[]) c17746.f58291.clone());
        }
        c17746.f58291[i8] = abstractC1339M49244;
        c17746.m41559();
        return c17746;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21697 m49254(int i, int i2) {
        m49248(i, i2, m49259());
        if (i == 0 && i2 == m49259()) {
            return this;
        }
        Object obj = new Object();
        return new C21697(m49246(m49246(this.f69245, i, obj).f16153, i2 - i, obj).f16152, this.f69244, this.f69246, this.f69247);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C4543 m49246(AbstractC1339 abstractC1339, int i, Object obj) {
        if (abstractC1339 == null) {
            return new C4543(null, null);
        }
        if (i == 0) {
            return new C4543(null, abstractC1339);
        }
        if (i == abstractC1339.f4794) {
            return new C4543(abstractC1339, null);
        }
        if (abstractC1339 instanceof C19238) {
            C10508 c10508 = new C10508(this.f69247, abstractC1339.f4794);
            try {
                char[] cArrM26971 = c10508.m26971();
                ((C19238) abstractC1339).m44571(cArrM26971, abstractC1339.f4794, 0);
                C4543 c4543 = new C4543(new C19238(obj, this.f69244, cArrM26971, 0, i, this.f69247), new C19238(obj, this.f69244, cArrM26971, i, abstractC1339.f4794 - i, this.f69247));
                c10508.close();
                return c4543;
            } catch (Throwable th) {
                try {
                    c10508.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        AbstractC1339[] abstractC1339Arr = ((C17746) abstractC1339).f58291;
        int i2 = 0;
        while (true) {
            AbstractC1339 abstractC13310 = abstractC1339Arr[i2];
            int i3 = abstractC13310.f4794;
            if (i <= i3) {
                C4543 c4543M49246 = m49246(abstractC13310, i, obj);
                return new C4543(m49245(m49243(obj, (AbstractC1339[]) Arrays.copyOfRange(abstractC1339Arr, 0, i2)), c4543M49246.f16152, obj), m49245(c4543M49246.f16153, m49243(obj, (AbstractC1339[]) Arrays.copyOfRange(abstractC1339Arr, i2 + 1, abstractC1339Arr.length)), obj));
            }
            i2++;
            i -= i3;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC1339 m49243(Object obj, AbstractC1339[] abstractC1339Arr) {
        if (abstractC1339Arr.length == 0) {
            return null;
        }
        return abstractC1339Arr.length == 1 ? abstractC1339Arr[0] : new C17746(obj, abstractC1339Arr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private AbstractC1339 m49245(AbstractC1339 abstractC1339, AbstractC1339 abstractC13310, Object obj) {
        if (abstractC1339 == null) {
            return abstractC13310;
        }
        return abstractC13310 == null ? abstractC1339 : m49243(obj, m49250(abstractC1339, abstractC13310, obj));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private AbstractC1339[] m49250(AbstractC1339 abstractC1339, AbstractC1339 abstractC13310, Object obj) {
        AbstractC1339[] abstractC1339Arr;
        int i;
        int i2 = abstractC1339.f4791;
        if (i2 == 0 && abstractC13310.f4791 == 0) {
            int i3 = abstractC1339.f4794;
            int i4 = abstractC13310.f4794;
            int i5 = i3 + i4;
            int i6 = this.f69244;
            if (i5 > i6 && i3 >= (i = i6 / 2) && i4 >= i) {
                return new AbstractC1339[]{abstractC1339, abstractC13310};
            }
            C10508 c10508 = new C10508(this.f69247, i5);
            try {
                char[] cArrM26971 = c10508.m26971();
                ((C19238) abstractC1339).m44571(cArrM26971, abstractC1339.f4794, 0);
                ((C19238) abstractC13310).m44571(cArrM26971, abstractC13310.f4794, abstractC1339.f4794);
                int i7 = this.f69244;
                if (i5 > i7) {
                    int i8 = i5 / 2;
                    AbstractC1339[] abstractC1339Arr2 = {new C19238(obj, i7, cArrM26971, 0, i8, this.f69247), new C19238(obj, this.f69244, cArrM26971, i8, i5 - i8, this.f69247)};
                    c10508.close();
                    return abstractC1339Arr2;
                }
                AbstractC1339[] abstractC1339Arr3 = {new C19238(obj, i7, cArrM26971, 0, i5, this.f69247)};
                c10508.close();
                return abstractC1339Arr3;
            } catch (Throwable th) {
                try {
                    c10508.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        }
        int i9 = abstractC13310.f4791;
        if (i2 == i9) {
            AbstractC1339[] abstractC1339Arr4 = ((C17746) abstractC1339).f58291;
            AbstractC1339[] abstractC1339Arr5 = ((C17746) abstractC13310).f58291;
            abstractC1339Arr = new AbstractC1339[abstractC1339Arr4.length + abstractC1339Arr5.length];
            System.arraycopy(abstractC1339Arr4, 0, abstractC1339Arr, 0, abstractC1339Arr4.length);
            System.arraycopy(abstractC1339Arr5, 0, abstractC1339Arr, abstractC1339Arr4.length, abstractC1339Arr5.length);
        } else if (i2 > i9) {
            AbstractC1339[] abstractC1339Arr6 = ((C17746) abstractC1339).f58291;
            AbstractC1339[] abstractC1339ArrM49250 = m49250(abstractC1339Arr6[abstractC1339Arr6.length - 1], abstractC13310, obj);
            abstractC1339Arr = (AbstractC1339[]) Arrays.copyOf(abstractC1339Arr6, (abstractC1339Arr6.length - 1) + abstractC1339ArrM49250.length);
            System.arraycopy(abstractC1339ArrM49250, 0, abstractC1339Arr, abstractC1339Arr6.length - 1, abstractC1339ArrM49250.length);
        } else {
            AbstractC1339[] abstractC1339Arr7 = ((C17746) abstractC13310).f58291;
            AbstractC1339[] abstractC1339ArrM49251 = m49250(abstractC1339, abstractC1339Arr7[0], obj);
            abstractC1339Arr = new AbstractC1339[(abstractC1339ArrM49251.length + abstractC1339Arr7.length) - 1];
            System.arraycopy(abstractC1339ArrM49251, 0, abstractC1339Arr, 0, abstractC1339ArrM49251.length);
            System.arraycopy(abstractC1339Arr7, 1, abstractC1339Arr, abstractC1339ArrM49251.length, abstractC1339Arr7.length - 1);
        }
        if (abstractC1339Arr.length <= this.f69246) {
            return new AbstractC1339[]{new C17746(obj, abstractC1339Arr)};
        }
        int length = abstractC1339Arr.length / 2;
        return new AbstractC1339[]{new C17746(obj, (AbstractC1339[]) Arrays.copyOfRange(abstractC1339Arr, 0, length)), new C17746(obj, (AbstractC1339[]) Arrays.copyOfRange(abstractC1339Arr, length, abstractC1339Arr.length))};
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final char m49251(int i) {
        AbstractC1339 abstractC1339 = this.f69245;
        while (abstractC1339 instanceof C17746) {
            for (AbstractC1339 abstractC13310 : ((C17746) abstractC1339).f58291) {
                int i2 = abstractC13310.f4794;
                if (i < i2) {
                    abstractC1339 = abstractC13310;
                    break;
                }
                i -= i2;
            }
        }
        return ((C19238) abstractC1339).m44568(i);
    }
}
