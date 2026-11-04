package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: renamed from: l.ۖۤۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2595 implements InterfaceC1235, InterfaceC1916, Comparable, Serializable {
    public static final /* synthetic */ int c = 0;
    public static final long serialVersionUID = 7264499704384272492L;
    public final C10052 a;
    public final C11149 b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C2595 c2595 = (C2595) obj;
        if (this.b.equals(c2595.b)) {
            return this.a.compareTo(c2595.a);
        }
        int iCompare = Long.compare(S(), c2595.S());
        return iCompare == 0 ? this.a.compareTo(c2595.a) : iCompare;
    }

    static {
        C10052 c10052 = C10052.e;
        C11149 c11149 = C11149.h;
        c10052.getClass();
        of(c10052, c11149);
        C10052 c10053 = C10052.f;
        C11149 c111410 = C11149.g;
        c10053.getClass();
        of(c10053, c111410);
    }

    public static C2595 of(C10052 c10052, C11149 c11149) {
        return new C2595(c10052, c11149);
    }

    @Override // l.InterfaceC1235
    public final long f(InterfaceC1235 interfaceC1235, InterfaceC2726 interfaceC2726) {
        C2595 c2595;
        if (interfaceC1235 instanceof C2595) {
            c2595 = (C2595) interfaceC1235;
        } else {
            try {
                c2595 = new C2595(C10052.T(interfaceC1235), C11149.X(interfaceC1235));
            } catch (C21241 e) {
                throw new C21241("Unable to obtain OffsetTime from TemporalAccessor: " + interfaceC1235 + " of type " + interfaceC1235.getClass().getName(), e);
            }
        }
        if (interfaceC2726 instanceof EnumC10183) {
            long jS = c2595.S() - S();
            switch (AbstractC14658.a[((EnumC10183) interfaceC2726).ordinal()]) {
                case 1:
                    return jS;
                case 2:
                    return jS / 1000;
                case 3:
                    return jS / 1000000;
                case 4:
                    return jS / 1000000000;
                case 5:
                    return jS / 60000000000L;
                case 6:
                    return jS / 3600000000000L;
                case 7:
                    return jS / 43200000000000L;
                default:
                    throw new C16085("Unsupported unit: " + interfaceC2726);
            }
        }
        return interfaceC2726.i(this, c2595);
    }

    public C2595(C10052 c10052, C11149 c11149) {
        this.a = (C10052) C17359.requireNonNull(c10052, "time");
        this.b = (C11149) C17359.requireNonNull(c11149, "offset");
    }

    public final C2595 T(C10052 c10052, C11149 c11149) {
        return (this.a == c10052 && this.b.equals(c11149)) ? this : new C2595(c10052, c11149);
    }

    @Override // l.InterfaceC9437
    public final boolean d(InterfaceC16831 interfaceC16831) {
        if (interfaceC16831 instanceof EnumC8692) {
            return ((EnumC8692) interfaceC16831).R() || interfaceC16831 == EnumC8692.OFFSET_SECONDS;
        }
        return interfaceC16831 != null && interfaceC16831.i(this);
    }

    @Override // l.InterfaceC9437
    public final C23545 k(InterfaceC16831 interfaceC16831) {
        if (interfaceC16831 instanceof EnumC8692) {
            if (interfaceC16831 != EnumC8692.OFFSET_SECONDS) {
                C10052 c10052 = this.a;
                c10052.getClass();
                return AbstractC17577.d(c10052, interfaceC16831);
            }
            return ((EnumC8692) interfaceC16831).b;
        }
        return interfaceC16831.j(this);
    }

    @Override // l.InterfaceC9437
    public final int i(InterfaceC16831 interfaceC16831) {
        return AbstractC17577.a(this, interfaceC16831);
    }

    @Override // l.InterfaceC9437
    public final long C(InterfaceC16831 interfaceC16831) {
        if (interfaceC16831 instanceof EnumC8692) {
            if (interfaceC16831 == EnumC8692.OFFSET_SECONDS) {
                return this.b.getTotalSeconds();
            }
            return this.a.C(interfaceC16831);
        }
        return interfaceC16831.z(this);
    }

    public C11149 getOffset() {
        return this.b;
    }

    public C10052 toLocalTime() {
        return this.a;
    }

    @Override // l.InterfaceC1235
    public final InterfaceC1235 b(long j, InterfaceC16831 interfaceC16831) {
        if (interfaceC16831 instanceof EnumC8692) {
            if (interfaceC16831 == EnumC8692.OFFSET_SECONDS) {
                EnumC8692 enumC8692 = (EnumC8692) interfaceC16831;
                return T(this.a, C11149.ofTotalSeconds(enumC8692.b.a(j, enumC8692)));
            }
            return T(this.a.b(j, interfaceC16831), this.b);
        }
        return (C2595) interfaceC16831.C(this, j);
    }

    @Override // l.InterfaceC1235
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public final C2595 c(long j, InterfaceC2726 interfaceC2726) {
        if (interfaceC2726 instanceof EnumC10183) {
            return T(this.a.c(j, interfaceC2726), this.b);
        }
        return (C2595) interfaceC2726.j(this, j);
    }

    @Override // l.InterfaceC1235
    public final InterfaceC1235 z(long j, EnumC10183 enumC10183) {
        return j == Long.MIN_VALUE ? c(C25227.FOREVER_NS, enumC10183).c(1L, enumC10183) : c(-j, enumC10183);
    }

    @Override // l.InterfaceC9437
    public final Object P(C14435 c14435) {
        if (c14435 == AbstractC17577.d || c14435 == AbstractC17577.e) {
            return this.b;
        }
        if (((c14435 == AbstractC17577.a) || (c14435 == AbstractC17577.b)) || c14435 == AbstractC17577.f) {
            return null;
        }
        if (c14435 == AbstractC17577.g) {
            return this.a;
        }
        if (c14435 == AbstractC17577.c) {
            return EnumC10183.NANOS;
        }
        return c14435.g(this);
    }

    @Override // l.InterfaceC1916
    public final InterfaceC1235 p(InterfaceC1235 interfaceC1235) {
        return interfaceC1235.b(this.a.c0(), EnumC8692.NANO_OF_DAY).b(this.b.getTotalSeconds(), EnumC8692.OFFSET_SECONDS);
    }

    public final long S() {
        return this.a.c0() - (((long) this.b.getTotalSeconds()) * 1000000000);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2595) {
            C2595 c2595 = (C2595) obj;
            if (this.a.equals(c2595.a) && this.b.equals(c2595.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.b;
    }

    public final String toString() {
        return this.a.toString() + this.b.c;
    }

    private Object writeReplace() {
        return new C21372((byte) 9, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // l.InterfaceC1235
    /* JADX INFO: renamed from: j */
    public final InterfaceC1235 y(C7816 c7816) {
        return (C2595) AbstractC1758.a(c7816, this);
    }
}
