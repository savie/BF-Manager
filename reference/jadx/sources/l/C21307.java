package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TimeZone;

/* JADX INFO: renamed from: l.᩶۫ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21307 implements Serializable {
    public static final long[] i = new long[0];
    public static final C14593[] j = new C14593[0];
    public static final C19003[] k = new C19003[0];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final C6391[] f82081l = new C6391[0];
    public static final long serialVersionUID = 3044319355680032515L;
    public final long[] a;
    public final C11149[] b;
    public final long[] c;
    public final C19003[] d;
    public final C11149[] e;
    public final C14593[] f;
    public final TimeZone g;
    public final transient ConcurrentMapC17249 h = new ConcurrentMapC17249();

    public static Object a(C19003 c19003, C6391 c6391) {
        C19003 c19004 = c6391.b;
        if (c6391.i()) {
            if (c19003.T(c19004)) {
                return c6391.c;
            }
            if (!c19003.T(c6391.b.W(c6391.d.getTotalSeconds() - c6391.c.getTotalSeconds()))) {
                return c6391.d;
            }
        } else {
            if (!c19003.T(c19004)) {
                return c6391.d;
            }
            if (c19003.T(c6391.b.W(c6391.d.getTotalSeconds() - c6391.c.getTotalSeconds()))) {
                return c6391.c;
            }
        }
        return c6391;
    }

    public C21307(long[] jArr, C11149[] c11149Arr, long[] jArr2, C11149[] c11149Arr2, C14593[] c14593Arr) {
        this.a = jArr;
        this.b = c11149Arr;
        this.c = jArr2;
        this.e = c11149Arr2;
        this.f = c14593Arr;
        if (jArr2.length == 0) {
            this.d = k;
        } else {
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            while (i2 < jArr2.length) {
                int i3 = i2 + 1;
                C6391 c6391 = new C6391(jArr2[i2], c11149Arr2[i2], c11149Arr2[i3]);
                if (c6391.i()) {
                    arrayList.add(c6391.b);
                    arrayList.add(c6391.b.W(c6391.d.getTotalSeconds() - c6391.c.getTotalSeconds()));
                } else {
                    arrayList.add(c6391.b.W(c6391.d.getTotalSeconds() - c6391.c.getTotalSeconds()));
                    arrayList.add(c6391.b);
                }
                i2 = i3;
            }
            this.d = (C19003[]) arrayList.toArray(new C19003[arrayList.size()]);
        }
        this.g = null;
    }

    public C21307(C11149 c11149) {
        C11149[] c11149Arr = {c11149};
        this.b = c11149Arr;
        long[] jArr = i;
        this.a = jArr;
        this.c = jArr;
        this.d = k;
        this.e = c11149Arr;
        this.f = j;
        this.g = null;
    }

    public C21307(TimeZone timeZone) {
        C11149[] c11149Arr = {h(timeZone.getRawOffset())};
        this.b = c11149Arr;
        long[] jArr = i;
        this.a = jArr;
        this.c = jArr;
        this.d = k;
        this.e = c11149Arr;
        this.f = j;
        this.g = timeZone;
    }

    public static C11149 h(int i2) {
        return C11149.ofTotalSeconds(i2 / 1000);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C12356(this.g != null ? (byte) 100 : (byte) 1, this);
    }

    public final C11149 d(C0358 c0358) {
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            return h(timeZone.getOffset(c0358.toEpochMilli()));
        }
        if (this.c.length == 0) {
            return this.b[0];
        }
        long epochSecond = c0358.getEpochSecond();
        if (this.f.length > 0) {
            long[] jArr = this.c;
            if (epochSecond > jArr[jArr.length - 1]) {
                C11149[] c11149Arr = this.e;
                C6391[] c6391ArrB = b(c(epochSecond, c11149Arr[c11149Arr.length - 1]));
                C6391 c6391 = null;
                for (int i2 = 0; i2 < c6391ArrB.length; i2++) {
                    c6391 = c6391ArrB[i2];
                    if (epochSecond < c6391.a) {
                        return c6391.c;
                    }
                }
                return c6391.d;
            }
        }
        int iBinarySearch = Arrays.binarySearch(this.c, epochSecond);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 2;
        }
        return this.e[iBinarySearch + 1];
    }

    public final List f(C19003 c19003) {
        Object objE = e(c19003);
        if (!(objE instanceof C6391)) {
            return Collections.singletonList((C11149) objE);
        }
        C6391 c6391 = (C6391) objE;
        return c6391.i() ? Collections.EMPTY_LIST : AbstractC1758.B(new Object[]{c6391.c, c6391.d});
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0065, code lost:
    
        if (r9.R(r0) > 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0090, code lost:
    
        if (r9.toLocalTime().c0() <= r0.toLocalTime().c0()) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(l.C19003 r9) {
        /*
            Method dump skipped, instruction units count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C21307.e(l.ᩳۤۗ):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C6391[] b(int i2) {
        C7816 c7816S;
        C6391[] c6391Arr = f82081l;
        Integer numValueOf = Integer.valueOf(i2);
        C6391[] c6391Arr2 = (C6391[]) this.h.get(numValueOf);
        if (c6391Arr2 != null) {
            return c6391Arr2;
        }
        long j2 = 1;
        int i3 = 0;
        if (this.g != null) {
            if (i2 < 1800) {
                return c6391Arr;
            }
            C19003 c19003 = C19003.c;
            C7816 c7816Of = C7816.of(i2 - 1, 12, 31);
            EnumC8692.HOUR_OF_DAY.P(0);
            long j3 = AbstractC1758.j(new C19003(c7816Of, C10052.h[0]), this.b[0]);
            int offset = this.g.getOffset(j3 * 1000);
            long j4 = 31968000 + j3;
            while (j3 < j4) {
                long j5 = j3 + 7776000;
                long j6 = j2;
                if (offset != this.g.getOffset(j5 * 1000)) {
                    for (long j7 = j6; j5 - j3 > j7; j7 = 1) {
                        long jZ = AbstractC1758.z(j5 + j3, 2L);
                        long j8 = j3;
                        if (this.g.getOffset(jZ * 1000) == offset) {
                            j3 = jZ;
                        } else {
                            j5 = jZ;
                            j3 = j8;
                        }
                    }
                    long j9 = j3;
                    j3 = this.g.getOffset(j9 * 1000) != offset ? j9 : j5;
                    C11149 c11149H = h(offset);
                    int offset2 = this.g.getOffset(j3 * 1000);
                    C11149 c11149H2 = h(offset2);
                    if (c(j3, c11149H2) == i2) {
                        c6391Arr = (C6391[]) Arrays.copyOf(c6391Arr, c6391Arr.length + 1);
                        c6391Arr[c6391Arr.length - 1] = new C6391(j3, c11149H, c11149H2);
                    }
                    offset = offset2;
                } else {
                    j3 = j5;
                }
                j2 = 1;
            }
            if (1916 <= i2 && i2 < 2100) {
                this.h.putIfAbsent(numValueOf, c6391Arr);
            }
            return c6391Arr;
        }
        C14593[] c14593Arr = this.f;
        C6391[] c6391Arr3 = new C6391[c14593Arr.length];
        int i4 = 0;
        while (i4 < c14593Arr.length) {
            C14593 c14593 = c14593Arr[i4];
            byte b = c14593.b;
            if (b < 0) {
                EnumC6456 enumC6456 = c14593.a;
                long j10 = i2;
                int iS = enumC6456.S(C20012.c.O(j10)) + 1 + c14593.b;
                C7816 c7816 = C7816.d;
                EnumC8692.YEAR.P(j10);
                C17359.requireNonNull(enumC6456, "month");
                EnumC8692.DAY_OF_MONTH.P(iS);
                c7816S = C7816.S(i2, enumC6456.getValue(), iS);
                EnumC13387 enumC13387 = c14593.c;
                if (enumC13387 != null) {
                    c7816S = c7816S.j(new C11610(enumC13387.getValue(), 1));
                }
            } else {
                EnumC6456 enumC6457 = c14593.a;
                C7816 c7817 = C7816.d;
                EnumC8692.YEAR.P(i2);
                C17359.requireNonNull(enumC6457, "month");
                EnumC8692.DAY_OF_MONTH.P(b);
                c7816S = C7816.S(i2, enumC6457.getValue(), b);
                EnumC13387 enumC13388 = c14593.c;
                if (enumC13388 != null) {
                    c7816S = c7816S.j(new C11610(enumC13388.getValue(), i3));
                }
            }
            if (c14593.e) {
                c7816S = c7816S.g0(1L);
            }
            C19003 c19003Of = C19003.of(c7816S, c14593.d);
            EnumC4153 enumC4153 = c14593.f;
            C11149 c11149 = c14593.g;
            C11149 c111410 = c14593.h;
            enumC4153.getClass();
            int i5 = AbstractC24291.a[enumC4153.ordinal()];
            if (i5 == 1) {
                c19003Of = c19003Of.W(c111410.getTotalSeconds() - C11149.f.getTotalSeconds());
            } else if (i5 == 2) {
                c19003Of = c19003Of.W(c111410.getTotalSeconds() - c11149.getTotalSeconds());
            }
            c6391Arr3[i4] = new C6391(c19003Of, c14593.h, c14593.i);
            i4++;
            i3 = 0;
        }
        if (i2 < 2100) {
            this.h.putIfAbsent(numValueOf, c6391Arr3);
        }
        return c6391Arr3;
    }

    public final boolean g(C0358 c0358) {
        C11149 c11149H;
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            c11149H = h(timeZone.getRawOffset());
        } else if (this.c.length == 0) {
            c11149H = this.b[0];
        } else {
            int iBinarySearch = Arrays.binarySearch(this.a, c0358.getEpochSecond());
            if (iBinarySearch < 0) {
                iBinarySearch = (-iBinarySearch) - 2;
            }
            c11149H = this.b[iBinarySearch + 1];
        }
        return !c11149H.equals(d(c0358));
    }

    public static int c(long j2, C11149 c11149) {
        return C7816.d0(AbstractC1758.z(j2 + ((long) c11149.getTotalSeconds()), 86400)).getYear();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C21307) {
            C21307 c21307 = (C21307) obj;
            if (C17359.equals(this.g, c21307.g) && Arrays.equals(this.a, c21307.a) && Arrays.equals(this.b, c21307.b) && Arrays.equals(this.c, c21307.c) && Arrays.equals(this.e, c21307.e) && Arrays.equals(this.f, c21307.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((C17359.hashCode(this.g) ^ Arrays.hashCode(this.a)) ^ Arrays.hashCode(this.b)) ^ Arrays.hashCode(this.c)) ^ Arrays.hashCode(this.e)) ^ Arrays.hashCode(this.f);
    }

    public final String toString() {
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            return "ZoneRules[timeZone=" + timeZone.getID() + "]";
        }
        C11149[] c11149Arr = this.b;
        return "ZoneRules[currentStandardOffset=" + c11149Arr[c11149Arr.length - 1] + "]";
    }
}
