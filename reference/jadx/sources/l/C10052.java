package l;

import com.google.android.material.slider.BasicLabelFormatter;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: renamed from: l.ۢۤۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10052 implements InterfaceC1235, InterfaceC1916, Comparable, Serializable {
    public static final C10052 e;
    public static final C10052 f;
    public static final C10052 g;
    public static final C10052[] h = new C10052[24];
    public static final long serialVersionUID = 6414437269572265201L;
    public final byte a;
    public final byte b;
    public final byte c;
    public final int d;

    static {
        int i = 0;
        while (true) {
            C10052[] c10052Arr = h;
            if (i < c10052Arr.length) {
                c10052Arr[i] = new C10052(i, 0, 0, 0);
                i++;
            } else {
                C10052 c10052 = c10052Arr[0];
                g = c10052;
                C10052 c10053 = c10052Arr[12];
                e = c10052;
                f = new C10052(23, 59, 59, 999999999);
                return;
            }
        }
    }

    public static C10052 of(int i, int i2, int i3, int i4) {
        EnumC8692.HOUR_OF_DAY.P(i);
        EnumC8692.MINUTE_OF_HOUR.P(i2);
        EnumC8692.SECOND_OF_MINUTE.P(i3);
        EnumC8692.NANO_OF_SECOND.P(i4);
        return S(i, i2, i3, i4);
    }

    public static C10052 V(long j) {
        EnumC8692.NANO_OF_DAY.P(j);
        int i = (int) (j / 3600000000000L);
        long j2 = j - (((long) i) * 3600000000000L);
        int i2 = (int) (j2 / 60000000000L);
        long j3 = j2 - (((long) i2) * 60000000000L);
        int i3 = (int) (j3 / 1000000000);
        return S(i, i2, i3, (int) (j3 - (((long) i3) * 1000000000)));
    }

    public static C10052 T(InterfaceC9437 interfaceC9437) {
        C17359.requireNonNull(interfaceC9437, "temporal");
        C10052 c10052 = (C10052) interfaceC9437.P(AbstractC17577.g);
        if (c10052 != null) {
            return c10052;
        }
        throw new C21241("Unable to obtain LocalTime from TemporalAccessor: " + interfaceC9437 + " of type " + interfaceC9437.getClass().getName());
    }

    public static C10052 S(int i, int i2, int i3, int i4) {
        if ((i2 | i3 | i4) == 0) {
            return h[i];
        }
        return new C10052(i, i2, i3, i4);
    }

    public C10052(int i, int i2, int i3, int i4) {
        this.a = (byte) i;
        this.b = (byte) i2;
        this.c = (byte) i3;
        this.d = i4;
    }

    @Override // l.InterfaceC9437
    public final boolean d(InterfaceC16831 interfaceC16831) {
        if (interfaceC16831 instanceof EnumC8692) {
            return ((EnumC8692) interfaceC16831).R();
        }
        return interfaceC16831 != null && interfaceC16831.i(this);
    }

    @Override // l.InterfaceC9437
    public final C23545 k(InterfaceC16831 interfaceC16831) {
        return AbstractC17577.d(this, interfaceC16831);
    }

    @Override // l.InterfaceC9437
    public final int i(InterfaceC16831 interfaceC16831) {
        if (interfaceC16831 instanceof EnumC8692) {
            return U(interfaceC16831);
        }
        return AbstractC17577.a(this, interfaceC16831);
    }

    @Override // l.InterfaceC9437
    public final long C(InterfaceC16831 interfaceC16831) {
        if (interfaceC16831 instanceof EnumC8692) {
            if (interfaceC16831 == EnumC8692.NANO_OF_DAY) {
                return c0();
            }
            if (interfaceC16831 == EnumC8692.MICRO_OF_DAY) {
                return c0() / 1000;
            }
            return U(interfaceC16831);
        }
        return interfaceC16831.z(this);
    }

    public final int U(InterfaceC16831 interfaceC16831) {
        switch (AbstractC20626.a[((EnumC8692) interfaceC16831).ordinal()]) {
            case 1:
                return this.d;
            case 2:
                throw new C16085("Invalid field 'NanoOfDay' for get() method, use getLong() instead");
            case 3:
                return this.d / 1000;
            case 4:
                throw new C16085("Invalid field 'MicroOfDay' for get() method, use getLong() instead");
            case 5:
                return this.d / BasicLabelFormatter.MILLION;
            case 6:
                return (int) (c0() / 1000000);
            case 7:
                return this.c;
            case 8:
                return d0();
            case 9:
                return this.b;
            case 10:
                return (this.a * 60) + this.b;
            case 11:
                return this.a % 12;
            case 12:
                int i = this.a % 12;
                if (i % 12 == 0) {
                    return 12;
                }
                return i;
            case 13:
                return this.a;
            case 14:
                byte b = this.a;
                if (b == 0) {
                    return 24;
                }
                return b;
            case 15:
                return this.a / 12;
            default:
                throw new C16085(AbstractC15624.a("Unsupported field: ", interfaceC16831));
        }
    }

    public int getHour() {
        return this.a;
    }

    public int getMinute() {
        return this.b;
    }

    public int getSecond() {
        return this.c;
    }

    public int getNano() {
        return this.d;
    }

    @Override // l.InterfaceC1235
    /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
    public final C10052 b(long j, InterfaceC16831 interfaceC16831) {
        if (!(interfaceC16831 instanceof EnumC8692)) {
            return (C10052) interfaceC16831.C(this, j);
        }
        EnumC8692 enumC8692 = (EnumC8692) interfaceC16831;
        enumC8692.P(j);
        switch (AbstractC20626.a[enumC8692.ordinal()]) {
            case 1:
                return f0((int) j);
            case 2:
                return V(j);
            case 3:
                return f0(((int) j) * 1000);
            case 4:
                return V(j * 1000);
            case 5:
                return f0(((int) j) * BasicLabelFormatter.MILLION);
            case 6:
                return V(j * 1000000);
            case 7:
                int i = (int) j;
                if (this.c != i) {
                    EnumC8692.SECOND_OF_MINUTE.P(i);
                    return S(this.a, this.b, i, this.d);
                }
                return this;
            case 8:
                return a0(j - ((long) d0()));
            case 9:
                int i2 = (int) j;
                if (this.b != i2) {
                    EnumC8692.MINUTE_OF_HOUR.P(i2);
                    return S(this.a, i2, this.c, this.d);
                }
                return this;
            case 10:
                return Y(j - ((long) ((this.a * 60) + this.b)));
            case 11:
                return X(j - ((long) (this.a % 12)));
            case 12:
                if (j == 12) {
                    j = 0;
                }
                return X(j - ((long) (this.a % 12)));
            case 13:
                int i3 = (int) j;
                if (this.a != i3) {
                    EnumC8692.HOUR_OF_DAY.P(i3);
                    return S(i3, this.b, this.c, this.d);
                }
                return this;
            case 14:
                if (j == 24) {
                    j = 0;
                }
                int i4 = (int) j;
                if (this.a != i4) {
                    EnumC8692.HOUR_OF_DAY.P(i4);
                    return S(i4, this.b, this.c, this.d);
                }
                return this;
            case 15:
                return X((j - ((long) (this.a / 12))) * 12);
            default:
                throw new C16085(AbstractC15624.a("Unsupported field: ", interfaceC16831));
        }
    }

    public final C10052 f0(int i) {
        if (this.d == i) {
            return this;
        }
        EnumC8692.NANO_OF_SECOND.P(i);
        return S(this.a, this.b, this.c, i);
    }

    @Override // l.InterfaceC1235
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public final C10052 c(long j, InterfaceC2726 interfaceC2726) {
        if (interfaceC2726 instanceof EnumC10183) {
            switch (AbstractC20626.b[((EnumC10183) interfaceC2726).ordinal()]) {
                case 1:
                    return Z(j);
                case 2:
                    return Z((j % 86400000000L) * 1000);
                case 3:
                    return Z((j % 86400000) * 1000000);
                case 4:
                    return a0(j);
                case 5:
                    return Y(j);
                case 6:
                    return X(j);
                case 7:
                    return X((j % 2) * 12);
                default:
                    throw new C16085("Unsupported unit: " + interfaceC2726);
            }
        }
        return (C10052) interfaceC2726.j(this, j);
    }

    public final C10052 X(long j) {
        return j == 0 ? this : S(((((int) (j % 24)) + this.a) + 24) % 24, this.b, this.c, this.d);
    }

    public final C10052 Y(long j) {
        if (j != 0) {
            int i = (this.a * 60) + this.b;
            int i2 = ((((int) (j % 1440)) + i) + 1440) % 1440;
            if (i != i2) {
                return S(i2 / 60, i2 % 60, this.c, this.d);
            }
        }
        return this;
    }

    public final C10052 a0(long j) {
        if (j != 0) {
            int i = (this.b * 60) + (this.a * 3600) + this.c;
            int i2 = ((((int) (j % 86400)) + i) + 86400) % 86400;
            if (i != i2) {
                return S(i2 / 3600, (i2 / 60) % 60, i2 % 60, this.d);
            }
        }
        return this;
    }

    public final C10052 Z(long j) {
        if (j != 0) {
            long jC0 = c0();
            long j2 = (((j % 86400000000000L) + jC0) + 86400000000000L) % 86400000000000L;
            if (jC0 != j2) {
                return S((int) (j2 / 3600000000000L), (int) ((j2 / 60000000000L) % 60), (int) ((j2 / 1000000000) % 60), (int) (j2 % 1000000000));
            }
        }
        return this;
    }

    @Override // l.InterfaceC1235
    public final InterfaceC1235 z(long j, EnumC10183 enumC10183) {
        return j == Long.MIN_VALUE ? c(C25227.FOREVER_NS, enumC10183).c(1L, enumC10183) : c(-j, enumC10183);
    }

    @Override // l.InterfaceC9437
    public final Object P(C14435 c14435) {
        if (c14435 == AbstractC17577.b || c14435 == AbstractC17577.a || c14435 == AbstractC17577.e || c14435 == AbstractC17577.d) {
            return null;
        }
        if (c14435 == AbstractC17577.g) {
            return this;
        }
        if (c14435 == AbstractC17577.f) {
            return null;
        }
        if (c14435 == AbstractC17577.c) {
            return EnumC10183.NANOS;
        }
        return c14435.g(this);
    }

    @Override // l.InterfaceC1916
    public final InterfaceC1235 p(InterfaceC1235 interfaceC1235) {
        return interfaceC1235.b(c0(), EnumC8692.NANO_OF_DAY);
    }

    @Override // l.InterfaceC1235
    public final long f(InterfaceC1235 interfaceC1235, InterfaceC2726 interfaceC2726) {
        C10052 c10052T = T(interfaceC1235);
        if (interfaceC2726 instanceof EnumC10183) {
            long jC0 = c10052T.c0() - c0();
            switch (AbstractC20626.b[((EnumC10183) interfaceC2726).ordinal()]) {
                case 1:
                    return jC0;
                case 2:
                    return jC0 / 1000;
                case 3:
                    return jC0 / 1000000;
                case 4:
                    return jC0 / 1000000000;
                case 5:
                    return jC0 / 60000000000L;
                case 6:
                    return jC0 / 3600000000000L;
                case 7:
                    return jC0 / 43200000000000L;
                default:
                    throw new C16085("Unsupported unit: " + interfaceC2726);
            }
        }
        return interfaceC2726.i(this, c10052T);
    }

    public final int d0() {
        return (this.b * 60) + (this.a * 3600) + this.c;
    }

    public final long c0() {
        return (((long) this.c) * 1000000000) + (((long) this.b) * 60000000000L) + (((long) this.a) * 3600000000000L) + ((long) this.d);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C10052 c10052) {
        int iCompare = Integer.compare(this.a, c10052.a);
        return (iCompare == 0 && (iCompare = Integer.compare(this.b, c10052.b)) == 0 && (iCompare = Integer.compare(this.c, c10052.c)) == 0) ? Integer.compare(this.d, c10052.d) : iCompare;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C10052) {
            C10052 c10052 = (C10052) obj;
            if (this.a == c10052.a && this.b == c10052.b && this.c == c10052.c && this.d == c10052.d) {
                return true;
            }
        }
        return false;
    }

    @Override // l.InterfaceC1235
    /* JADX INFO: renamed from: j */
    public final InterfaceC1235 y(C7816 c7816) {
        return (C10052) AbstractC1758.a(c7816, this);
    }

    public final int hashCode() {
        long jC0 = c0();
        return (int) (jC0 ^ (jC0 >>> 32));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(18);
        byte b = this.a;
        byte b2 = this.b;
        byte b3 = this.c;
        int i = this.d;
        sb.append(b < 10 ? "0" : "");
        sb.append((int) b);
        sb.append(b2 < 10 ? ":0" : ":");
        sb.append((int) b2);
        if (b3 > 0 || i > 0) {
            sb.append(b3 < 10 ? ":0" : ":");
            sb.append((int) b3);
            if (i > 0) {
                sb.append('.');
                if (i % BasicLabelFormatter.MILLION == 0) {
                    sb.append(Integer.toString((i / BasicLabelFormatter.MILLION) + 1000).substring(1));
                } else if (i % 1000 == 0) {
                    sb.append(Integer.toString((i / 1000) + BasicLabelFormatter.MILLION).substring(1));
                } else {
                    sb.append(Integer.toString(i + BasicLabelFormatter.BILLION).substring(1));
                }
            }
        }
        return sb.toString();
    }

    private Object writeReplace() {
        return new C21372((byte) 4, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public final void g0(DataOutput dataOutput) throws IOException {
        if (this.d == 0) {
            if (this.c == 0) {
                if (this.b == 0) {
                    dataOutput.writeByte(~this.a);
                    return;
                } else {
                    dataOutput.writeByte(this.a);
                    dataOutput.writeByte(~this.b);
                    return;
                }
            }
            dataOutput.writeByte(this.a);
            dataOutput.writeByte(this.b);
            dataOutput.writeByte(~this.c);
            return;
        }
        dataOutput.writeByte(this.a);
        dataOutput.writeByte(this.b);
        dataOutput.writeByte(this.c);
        dataOutput.writeInt(this.d);
    }

    public static C10052 b0(DataInput dataInput) throws IOException {
        int i;
        int i2;
        int i3;
        int i4 = dataInput.readByte();
        int i5 = 0;
        if (i4 >= 0) {
            i5 = dataInput.readByte();
            if (i5 < 0) {
                i5 = ~i5;
                i2 = 0;
                i = 0;
            } else {
                i = dataInput.readByte();
                if (i < 0) {
                    i3 = ~i;
                } else {
                    i2 = dataInput.readInt();
                }
            }
            return of(i4, i5, i, i2);
        }
        i4 = ~i4;
        i3 = 0;
        i = i3;
        i2 = 0;
        return of(i4, i5, i, i2);
    }
}
