package l;

import com.google.android.material.slider.BasicLabelFormatter;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: renamed from: l.ۗܽᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3363 implements InterfaceC15235, InterfaceC12413, Comparable, Serializable {
    public static final C3363 e;
    public static final C3363 f;
    public static final C3363 g;
    public static final C3363[] h = new C3363[24];
    public static final long serialVersionUID = 6414437269572265201L;
    public final byte a;
    public final byte b;
    public final byte c;
    public final int d;

    static {
        int i = 0;
        while (true) {
            C3363[] c3363Arr = h;
            if (i < c3363Arr.length) {
                c3363Arr[i] = new C3363(i, 0, 0, 0);
                i++;
            } else {
                C3363 c3363 = c3363Arr[0];
                g = c3363;
                C3363 c3364 = c3363Arr[12];
                e = c3363;
                f = new C3363(23, 59, 59, 999999999);
                return;
            }
        }
    }

    public static C3363 Z(int i, int i2, int i3, int i4) {
        EnumC18762.HOUR_OF_DAY.T(i);
        EnumC18762.MINUTE_OF_HOUR.T(i2);
        EnumC18762.SECOND_OF_MINUTE.T(i3);
        EnumC18762.NANO_OF_SECOND.T(i4);
        return W(i, i2, i3, i4);
    }

    public static C3363 a0(long j) {
        EnumC18762.NANO_OF_DAY.T(j);
        int i = (int) (j / 3600000000000L);
        long j2 = j - (((long) i) * 3600000000000L);
        int i2 = (int) (j2 / 60000000000L);
        long j3 = j2 - (((long) i2) * 60000000000L);
        int i3 = (int) (j3 / 1000000000);
        return W(i, i2, i3, (int) (j3 - (((long) i3) * 1000000000)));
    }

    public static C3363 X(InterfaceC21584 interfaceC21584) {
        C13638.requireNonNull(interfaceC21584, "temporal");
        C3363 c3363 = (C3363) interfaceC21584.T(AbstractC23702.g);
        if (c3363 != null) {
            return c3363;
        }
        throw new C15464("Unable to obtain LocalTime from TemporalAccessor: " + interfaceC21584 + " of type " + interfaceC21584.getClass().getName());
    }

    public static C3363 W(int i, int i2, int i3, int i4) {
        if ((i2 | i3 | i4) == 0) {
            return h[i];
        }
        return new C3363(i, i2, i3, i4);
    }

    public C3363(int i, int i2, int i3, int i4) {
        this.a = (byte) i;
        this.b = (byte) i2;
        this.c = (byte) i3;
        this.d = i4;
    }

    @Override // l.InterfaceC21584
    public final boolean e(InterfaceC11002 interfaceC11002) {
        if (interfaceC11002 instanceof EnumC18762) {
            return ((EnumC18762) interfaceC11002).V();
        }
        return interfaceC11002 != null && interfaceC11002.l(this);
    }

    @Override // l.InterfaceC21584
    public final C1828 n(InterfaceC11002 interfaceC11002) {
        return AbstractC23702.d(this, interfaceC11002);
    }

    @Override // l.InterfaceC21584
    public final int l(InterfaceC11002 interfaceC11002) {
        if (interfaceC11002 instanceof EnumC18762) {
            return Y(interfaceC11002);
        }
        return AbstractC23702.a(this, interfaceC11002);
    }

    @Override // l.InterfaceC21584
    public final long G(InterfaceC11002 interfaceC11002) {
        if (interfaceC11002 instanceof EnumC18762) {
            if (interfaceC11002 == EnumC18762.NANO_OF_DAY) {
                return h0();
            }
            if (interfaceC11002 == EnumC18762.MICRO_OF_DAY) {
                return h0() / 1000;
            }
            return Y(interfaceC11002);
        }
        return interfaceC11002.C(this);
    }

    public final int Y(InterfaceC11002 interfaceC11002) {
        switch (AbstractC9715.a[((EnumC18762) interfaceC11002).ordinal()]) {
            case 1:
                return this.d;
            case 2:
                throw new C14530("Invalid field 'NanoOfDay' for get() method, use getLong() instead");
            case 3:
                return this.d / 1000;
            case 4:
                throw new C14530("Invalid field 'MicroOfDay' for get() method, use getLong() instead");
            case 5:
                return this.d / BasicLabelFormatter.MILLION;
            case 6:
                return (int) (h0() / 1000000);
            case 7:
                return this.c;
            case 8:
                return i0();
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
                throw new C14530(AbstractC21107.a("Unsupported field: ", interfaceC11002));
        }
    }

    @Override // l.InterfaceC15235
    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
    public final C3363 c(long j, InterfaceC11002 interfaceC11002) {
        if (!(interfaceC11002 instanceof EnumC18762)) {
            return (C3363) interfaceC11002.G(this, j);
        }
        EnumC18762 enumC18762 = (EnumC18762) interfaceC11002;
        enumC18762.T(j);
        switch (AbstractC9715.a[enumC18762.ordinal()]) {
            case 1:
                return k0((int) j);
            case 2:
                return a0(j);
            case 3:
                return k0(((int) j) * 1000);
            case 4:
                return a0(j * 1000);
            case 5:
                return k0(((int) j) * BasicLabelFormatter.MILLION);
            case 6:
                return a0(j * 1000000);
            case 7:
                int i = (int) j;
                if (this.c != i) {
                    EnumC18762.SECOND_OF_MINUTE.T(i);
                    return W(this.a, this.b, i, this.d);
                }
                return this;
            case 8:
                return f0(j - ((long) i0()));
            case 9:
                int i2 = (int) j;
                if (this.b != i2) {
                    EnumC18762.MINUTE_OF_HOUR.T(i2);
                    return W(this.a, i2, this.c, this.d);
                }
                return this;
            case 10:
                return d0(j - ((long) ((this.a * 60) + this.b)));
            case 11:
                return c0(j - ((long) (this.a % 12)));
            case 12:
                if (j == 12) {
                    j = 0;
                }
                return c0(j - ((long) (this.a % 12)));
            case 13:
                int i3 = (int) j;
                if (this.a != i3) {
                    EnumC18762.HOUR_OF_DAY.T(i3);
                    return W(i3, this.b, this.c, this.d);
                }
                return this;
            case 14:
                if (j == 24) {
                    j = 0;
                }
                int i4 = (int) j;
                if (this.a != i4) {
                    EnumC18762.HOUR_OF_DAY.T(i4);
                    return W(i4, this.b, this.c, this.d);
                }
                return this;
            case 15:
                return c0((j - ((long) (this.a / 12))) * 12);
            default:
                throw new C14530(AbstractC21107.a("Unsupported field: ", interfaceC11002));
        }
    }

    public final C3363 k0(int i) {
        if (this.d == i) {
            return this;
        }
        EnumC18762.NANO_OF_SECOND.T(i);
        return W(this.a, this.b, this.c, i);
    }

    @Override // l.InterfaceC15235
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public final C3363 d(long j, InterfaceC18056 interfaceC18056) {
        if (interfaceC18056 instanceof EnumC22996) {
            switch (AbstractC9715.b[((EnumC22996) interfaceC18056).ordinal()]) {
                case 1:
                    return e0(j);
                case 2:
                    return e0((j % 86400000000L) * 1000);
                case 3:
                    return e0((j % 86400000) * 1000000);
                case 4:
                    return f0(j);
                case 5:
                    return d0(j);
                case 6:
                    return c0(j);
                case 7:
                    return c0((j % 2) * 12);
                default:
                    throw new C14530("Unsupported unit: " + interfaceC18056);
            }
        }
        return (C3363) interfaceC18056.m(this, j);
    }

    public final C3363 c0(long j) {
        return j == 0 ? this : W(((((int) (j % 24)) + this.a) + 24) % 24, this.b, this.c, this.d);
    }

    public final C3363 d0(long j) {
        if (j != 0) {
            int i = (this.a * 60) + this.b;
            int i2 = ((((int) (j % 1440)) + i) + 1440) % 1440;
            if (i != i2) {
                return W(i2 / 60, i2 % 60, this.c, this.d);
            }
        }
        return this;
    }

    public final C3363 f0(long j) {
        if (j != 0) {
            int i = (this.b * 60) + (this.a * 3600) + this.c;
            int i2 = ((((int) (j % 86400)) + i) + 86400) % 86400;
            if (i != i2) {
                return W(i2 / 3600, (i2 / 60) % 60, i2 % 60, this.d);
            }
        }
        return this;
    }

    public final C3363 e0(long j) {
        if (j != 0) {
            long jH0 = h0();
            long j2 = (((j % 86400000000000L) + jH0) + 86400000000000L) % 86400000000000L;
            if (jH0 != j2) {
                return W((int) (j2 / 3600000000000L), (int) ((j2 / 60000000000L) % 60), (int) ((j2 / 1000000000) % 60), (int) (j2 % 1000000000));
            }
        }
        return this;
    }

    @Override // l.InterfaceC15235
    /* JADX INFO: renamed from: C */
    public final InterfaceC15235 w(long j, EnumC22996 enumC22996) {
        return j == Long.MIN_VALUE ? d(C17492.FOREVER_NS, enumC22996).d(1L, enumC22996) : d(-j, enumC22996);
    }

    @Override // l.InterfaceC21584
    public final Object T(C22935 c22935) {
        if (c22935 == AbstractC23702.b || c22935 == AbstractC23702.a || c22935 == AbstractC23702.e || c22935 == AbstractC23702.d) {
            return null;
        }
        if (c22935 == AbstractC23702.g) {
            return this;
        }
        if (c22935 == AbstractC23702.f) {
            return null;
        }
        if (c22935 == AbstractC23702.c) {
            return EnumC22996.NANOS;
        }
        return c22935.h(this);
    }

    @Override // l.InterfaceC12413
    public final InterfaceC15235 s(InterfaceC15235 interfaceC15235) {
        return interfaceC15235.c(h0(), EnumC18762.NANO_OF_DAY);
    }

    @Override // l.InterfaceC15235
    public final long g(InterfaceC15235 interfaceC15235, InterfaceC18056 interfaceC18056) {
        C3363 c3363X = X(interfaceC15235);
        if (interfaceC18056 instanceof EnumC22996) {
            long jH0 = c3363X.h0() - h0();
            switch (AbstractC9715.b[((EnumC22996) interfaceC18056).ordinal()]) {
                case 1:
                    return jH0;
                case 2:
                    return jH0 / 1000;
                case 3:
                    return jH0 / 1000000;
                case 4:
                    return jH0 / 1000000000;
                case 5:
                    return jH0 / 60000000000L;
                case 6:
                    return jH0 / 3600000000000L;
                case 7:
                    return jH0 / 43200000000000L;
                default:
                    throw new C14530("Unsupported unit: " + interfaceC18056);
            }
        }
        return interfaceC18056.l(this, c3363X);
    }

    public final int i0() {
        return (this.b * 60) + (this.a * 3600) + this.c;
    }

    public final long h0() {
        return (((long) this.c) * 1000000000) + (((long) this.b) * 60000000000L) + (((long) this.a) * 3600000000000L) + ((long) this.d);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C3363 c3363) {
        int iCompare = Integer.compare(this.a, c3363.a);
        return (iCompare == 0 && (iCompare = Integer.compare(this.b, c3363.b)) == 0 && (iCompare = Integer.compare(this.c, c3363.c)) == 0) ? Integer.compare(this.d, c3363.d) : iCompare;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3363) {
            C3363 c3363 = (C3363) obj;
            if (this.a == c3363.a && this.b == c3363.b && this.c == c3363.c && this.d == c3363.d) {
                return true;
            }
        }
        return false;
    }

    @Override // l.InterfaceC15235
    public final InterfaceC15235 m(C18991 c18991) {
        return (C3363) AbstractC1726.a(c18991, this);
    }

    public final int hashCode() {
        long jH0 = h0();
        return (int) (jH0 ^ (jH0 >>> 32));
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
        return new C3944((byte) 4, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public final void l0(DataOutput dataOutput) throws IOException {
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

    public static C3363 g0(DataInput dataInput) throws IOException {
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
            return Z(i4, i5, i, i2);
        }
        i4 = ~i4;
        i3 = 0;
        i = i3;
        i2 = 0;
        return Z(i4, i5, i, i2);
    }
}
