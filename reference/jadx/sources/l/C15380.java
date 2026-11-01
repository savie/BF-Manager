package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TimeZone;

/* JADX INFO: renamed from: l.ܶܿᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15380 implements Serializable {
    public static final long[] i = new long[0];
    public static final C23141[] j = new C23141[0];
    public static final C1952[] k = new C1952[0];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final C13263[] f77966l = new C13263[0];
    public static final long serialVersionUID = 3044319355680032515L;
    public final long[] a;
    public final C2678[] b;
    public final long[] c;
    public final C1952[] d;
    public final C2678[] e;
    public final C23141[] f;
    public final TimeZone g;
    public final transient ConcurrentMapC13783 h = new ConcurrentMapC13783();

    public static Object a(C1952 c1952, C13263 c13263) {
        C1952 c1953 = c13263.b;
        if (c13263.l()) {
            if (c1952.X(c1953)) {
                return c13263.c;
            }
            if (!c1952.X(c13263.b.b0(c13263.d.b - c13263.c.b))) {
                return c13263.d;
            }
        } else {
            if (!c1952.X(c1953)) {
                return c13263.d;
            }
            if (c1952.X(c13263.b.b0(c13263.d.b - c13263.c.b))) {
                return c13263.c;
            }
        }
        return c13263;
    }

    public C15380(long[] jArr, C2678[] c2678Arr, long[] jArr2, C2678[] c2678Arr2, C23141[] c23141Arr) {
        this.a = jArr;
        this.b = c2678Arr;
        this.c = jArr2;
        this.e = c2678Arr2;
        this.f = c23141Arr;
        if (jArr2.length == 0) {
            this.d = k;
        } else {
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            while (i2 < jArr2.length) {
                int i3 = i2 + 1;
                C13263 c13263 = new C13263(jArr2[i2], c2678Arr2[i2], c2678Arr2[i3]);
                if (c13263.l()) {
                    arrayList.add(c13263.b);
                    arrayList.add(c13263.b.b0(c13263.d.b - c13263.c.b));
                } else {
                    arrayList.add(c13263.b.b0(c13263.d.b - c13263.c.b));
                    arrayList.add(c13263.b);
                }
                i2 = i3;
            }
            this.d = (C1952[]) arrayList.toArray(new C1952[arrayList.size()]);
        }
        this.g = null;
    }

    public C15380(C2678 c2678) {
        C2678[] c2678Arr = {c2678};
        this.b = c2678Arr;
        long[] jArr = i;
        this.a = jArr;
        this.c = jArr;
        this.d = k;
        this.e = c2678Arr;
        this.f = j;
        this.g = null;
    }

    public C15380(TimeZone timeZone) {
        C2678[] c2678Arr = {h(timeZone.getRawOffset())};
        this.b = c2678Arr;
        long[] jArr = i;
        this.a = jArr;
        this.c = jArr;
        this.d = k;
        this.e = c2678Arr;
        this.f = j;
        this.g = timeZone;
    }

    public static C2678 h(int i2) {
        return C2678.e0(i2 / 1000);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C1267(this.g != null ? (byte) 100 : (byte) 1, this);
    }

    public static int c(long j2, C2678 c2678) {
        return C18991.i0(AbstractC1726.z(j2 + ((long) c2678.b), 86400)).a;
    }

    public final C2678 d(C18285 c18285) {
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            return h(timeZone.getOffset(c18285.toEpochMilli()));
        }
        if (this.c.length == 0) {
            return this.b[0];
        }
        long epochSecond = c18285.getEpochSecond();
        if (this.f.length > 0) {
            long[] jArr = this.c;
            if (epochSecond > jArr[jArr.length - 1]) {
                C2678[] c2678Arr = this.e;
                C13263[] c13263ArrB = b(c(epochSecond, c2678Arr[c2678Arr.length - 1]));
                C13263 c13263 = null;
                for (int i2 = 0; i2 < c13263ArrB.length; i2++) {
                    c13263 = c13263ArrB[i2];
                    if (epochSecond < c13263.a) {
                        return c13263.c;
                    }
                }
                return c13263.d;
            }
        }
        int iBinarySearch = Arrays.binarySearch(this.c, epochSecond);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 2;
        }
        return this.e[iBinarySearch + 1];
    }

    public final List f(C1952 c1952) {
        Object objE = e(c1952);
        if (!(objE instanceof C13263)) {
            return Collections.singletonList((C2678) objE);
        }
        C13263 c13263 = (C13263) objE;
        return c13263.l() ? Collections.EMPTY_LIST : AbstractC1726.B(new Object[]{c13263.c, c13263.d});
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0063, code lost:
    
        if (r9.V(r0) > 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0086, code lost:
    
        if (r9.b.h0() <= r0.b.h0()) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(l.C1952 r9) {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C15380.e(l.֫ܽᩴ):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C13263[] b(int i2) {
        C18991 c18991W;
        C13263[] c13263Arr = f77966l;
        Integer numValueOf = Integer.valueOf(i2);
        C13263[] c13263Arr2 = (C13263[]) this.h.get(numValueOf);
        if (c13263Arr2 != null) {
            return c13263Arr2;
        }
        long j2 = 1;
        int i3 = 0;
        if (this.g != null) {
            if (i2 < 1800) {
                return c13263Arr;
            }
            C1952 c1952 = C1952.c;
            C18991 c18991H0 = C18991.h0(i2 - 1, 12, 31);
            EnumC18762.HOUR_OF_DAY.T(0);
            long j3 = AbstractC1726.j(new C1952(c18991H0, C3363.h[0]), this.b[0]);
            int offset = this.g.getOffset(j3 * 1000);
            long j4 = 31968000 + j3;
            while (j3 < j4) {
                long j5 = j3 + 7776000;
                long j6 = j2;
                if (offset != this.g.getOffset(j5 * 1000)) {
                    for (long j7 = j6; j5 - j3 > j7; j7 = 1) {
                        long jZ = AbstractC1726.z(j5 + j3, 2L);
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
                    C2678 c2678H = h(offset);
                    int offset2 = this.g.getOffset(j3 * 1000);
                    C2678 c2678H2 = h(offset2);
                    if (c(j3, c2678H2) == i2) {
                        c13263Arr = (C13263[]) Arrays.copyOf(c13263Arr, c13263Arr.length + 1);
                        c13263Arr[c13263Arr.length - 1] = new C13263(j3, c2678H, c2678H2);
                    }
                    offset = offset2;
                } else {
                    j3 = j5;
                }
                j2 = 1;
            }
            if (1916 <= i2 && i2 < 2100) {
                this.h.putIfAbsent(numValueOf, c13263Arr);
            }
            return c13263Arr;
        }
        C23141[] c23141Arr = this.f;
        C13263[] c13263Arr3 = new C13263[c23141Arr.length];
        int i4 = 0;
        while (i4 < c23141Arr.length) {
            C23141 c23141 = c23141Arr[i4];
            byte b = c23141.b;
            if (b < 0) {
                EnumC13824 enumC13824 = c23141.a;
                long j10 = i2;
                int iW = enumC13824.W(C7122.c.S(j10)) + 1 + c23141.b;
                C18991 c18991 = C18991.d;
                EnumC18762.YEAR.T(j10);
                C13638.requireNonNull(enumC13824, "month");
                EnumC18762.DAY_OF_MONTH.T(iW);
                c18991W = C18991.W(i2, enumC13824.getValue(), iW);
                EnumC16169 enumC16169 = c23141.c;
                if (enumC16169 != null) {
                    c18991W = c18991W.B(new C17351(enumC16169.getValue(), 1));
                }
            } else {
                EnumC13824 enumC13825 = c23141.a;
                C18991 c18992 = C18991.d;
                EnumC18762.YEAR.T(i2);
                C13638.requireNonNull(enumC13825, "month");
                EnumC18762.DAY_OF_MONTH.T(b);
                c18991W = C18991.W(i2, enumC13825.getValue(), b);
                EnumC16169 enumC161610 = c23141.c;
                if (enumC161610 != null) {
                    c18991W = c18991W.B(new C17351(enumC161610.getValue(), i3));
                }
            }
            if (c23141.e) {
                c18991W = c18991W.l0(1L);
            }
            C1952 c1952Y = C1952.Y(c18991W, c23141.d);
            EnumC6912 enumC6912 = c23141.f;
            C2678 c2678 = c23141.g;
            C2678 c2679 = c23141.h;
            enumC6912.getClass();
            int i5 = AbstractC4089.a[enumC6912.ordinal()];
            if (i5 == 1) {
                c1952Y = c1952Y.b0(c2679.b - C2678.f.b);
            } else if (i5 == 2) {
                c1952Y = c1952Y.b0(c2679.b - c2678.b);
            }
            c13263Arr3[i4] = new C13263(c1952Y, c23141.h, c23141.i);
            i4++;
            i3 = 0;
        }
        if (i2 < 2100) {
            this.h.putIfAbsent(numValueOf, c13263Arr3);
        }
        return c13263Arr3;
    }

    public final boolean g(C18285 c18285) {
        C2678 c2678H;
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            c2678H = h(timeZone.getRawOffset());
        } else if (this.c.length == 0) {
            c2678H = this.b[0];
        } else {
            int iBinarySearch = Arrays.binarySearch(this.a, c18285.getEpochSecond());
            if (iBinarySearch < 0) {
                iBinarySearch = (-iBinarySearch) - 2;
            }
            c2678H = this.b[iBinarySearch + 1];
        }
        return !c2678H.equals(d(c18285));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C15380) {
            C15380 c15380 = (C15380) obj;
            if (C13638.equals(this.g, c15380.g) && Arrays.equals(this.a, c15380.a) && Arrays.equals(this.b, c15380.b) && Arrays.equals(this.c, c15380.c) && Arrays.equals(this.e, c15380.e) && Arrays.equals(this.f, c15380.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((C13638.hashCode(this.g) ^ Arrays.hashCode(this.a)) ^ Arrays.hashCode(this.b)) ^ Arrays.hashCode(this.c)) ^ Arrays.hashCode(this.e)) ^ Arrays.hashCode(this.f);
    }

    public final String toString() {
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            return "ZoneRules[timeZone=" + timeZone.getID() + "]";
        }
        C2678[] c2678Arr = this.b;
        return "ZoneRules[currentStandardOffset=" + c2678Arr[c2678Arr.length - 1] + "]";
    }
}
