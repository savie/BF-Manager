package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: renamed from: l.֫ܽᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1952 implements InterfaceC15235, InterfaceC12413, InterfaceC9819, Serializable {
    public static final C1952 c = Y(C18991.d, C3363.e);
    public static final C1952 d = Y(C18991.e, C3363.f);
    public static final long serialVersionUID = 6207766400415563566L;
    public final C18991 a;
    public final C3363 b;

    @Override // l.InterfaceC9819
    public final /* synthetic */ long r(C2678 c2678) {
        return AbstractC1726.j(this, c2678);
    }

    @Override // l.InterfaceC9819
    public final InterfaceC21233 a() {
        return ((C18991) f()).a();
    }

    @Override // l.InterfaceC9819
    public final InterfaceC20402 D(AbstractC9114 abstractC9114) {
        return C10525.W(this, abstractC9114, null);
    }

    public static C1952 Y(C18991 c18991, C3363 c3363) {
        C13638.requireNonNull(c18991, "date");
        C13638.requireNonNull(c3363, "time");
        return new C1952(c18991, c3363);
    }

    @Override // l.InterfaceC12413
    public final InterfaceC15235 s(InterfaceC15235 interfaceC15235) {
        return interfaceC15235.c(((C18991) f()).H(), EnumC18762.EPOCH_DAY).c(b().h0(), EnumC18762.NANO_OF_DAY);
    }

    public static C1952 Z(long j, int i, C2678 c2678) {
        C13638.requireNonNull(c2678, "offset");
        long j2 = i;
        EnumC18762.NANO_OF_SECOND.T(j2);
        long j3 = j + ((long) c2678.b);
        long j4 = 86400;
        return new C1952(C18991.i0(AbstractC1726.z(j3, j4)), C3363.a0((((long) ((int) AbstractC1726.O(j3, j4))) * 1000000000) + j2));
    }

    public static C1952 W(InterfaceC21584 interfaceC21584) {
        if (interfaceC21584 instanceof C1952) {
            return (C1952) interfaceC21584;
        }
        if (!(interfaceC21584 instanceof C10525)) {
            if (!(interfaceC21584 instanceof C8408)) {
                try {
                    return new C1952(C18991.X(interfaceC21584), C3363.X(interfaceC21584));
                } catch (C15464 e) {
                    throw new C15464("Unable to obtain LocalDateTime from TemporalAccessor: " + interfaceC21584 + " of type " + interfaceC21584.getClass().getName(), e);
                }
            }
            return ((C8408) interfaceC21584).a;
        }
        return ((C10525) interfaceC21584).a;
    }

    public C1952(C18991 c18991, C3363 c3363) {
        this.a = c18991;
        this.b = c3363;
    }

    public final C1952 e0(C18991 c18991, C3363 c3363) {
        return (this.a == c18991 && this.b == c3363) ? this : new C1952(c18991, c3363);
    }

    @Override // l.InterfaceC21584
    public final boolean e(InterfaceC11002 interfaceC11002) {
        if (!(interfaceC11002 instanceof EnumC18762)) {
            return interfaceC11002 != null && interfaceC11002.l(this);
        }
        EnumC18762 enumC18762 = (EnumC18762) interfaceC11002;
        return enumC18762.isDateBased() || enumC18762.V();
    }

    @Override // l.InterfaceC21584
    public final C1828 n(InterfaceC11002 interfaceC11002) {
        if (interfaceC11002 instanceof EnumC18762) {
            if (((EnumC18762) interfaceC11002).V()) {
                C3363 c3363 = this.b;
                c3363.getClass();
                return AbstractC23702.d(c3363, interfaceC11002);
            }
            return this.a.n(interfaceC11002);
        }
        return interfaceC11002.m(this);
    }

    @Override // l.InterfaceC21584
    public final int l(InterfaceC11002 interfaceC11002) {
        if (interfaceC11002 instanceof EnumC18762) {
            return ((EnumC18762) interfaceC11002).V() ? this.b.l(interfaceC11002) : this.a.l(interfaceC11002);
        }
        return AbstractC23702.a(this, interfaceC11002);
    }

    @Override // l.InterfaceC21584
    public final long G(InterfaceC11002 interfaceC11002) {
        if (interfaceC11002 instanceof EnumC18762) {
            return ((EnumC18762) interfaceC11002).V() ? this.b.G(interfaceC11002) : this.a.G(interfaceC11002);
        }
        return interfaceC11002.C(this);
    }

    @Override // l.InterfaceC9819
    public final InterfaceC17579 f() {
        return this.a;
    }

    @Override // l.InterfaceC9819
    public final C3363 b() {
        return this.b;
    }

    @Override // l.InterfaceC15235
    public final InterfaceC15235 m(C18991 c18991) {
        return e0(c18991, this.b);
    }

    @Override // l.InterfaceC15235
    /* JADX INFO: renamed from: d0, reason: merged with bridge method [inline-methods] */
    public final C1952 c(long j, InterfaceC11002 interfaceC11002) {
        if (interfaceC11002 instanceof EnumC18762) {
            if (((EnumC18762) interfaceC11002).V()) {
                return e0(this.a, this.b.c(j, interfaceC11002));
            }
            return e0(this.a.c(j, interfaceC11002), this.b);
        }
        return (C1952) interfaceC11002.G(this, j);
    }

    @Override // l.InterfaceC15235
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    public final C1952 d(long j, InterfaceC18056 interfaceC18056) {
        if (!(interfaceC18056 instanceof EnumC22996)) {
            return (C1952) interfaceC18056.m(this, j);
        }
        switch (AbstractC14654.a[((EnumC22996) interfaceC18056).ordinal()]) {
            case 1:
                return c0(this.a, 0L, 0L, 0L, j);
            case 2:
                C1952 c1952E0 = e0(this.a.l0(j / 86400000000L), this.b);
                return c1952E0.c0(c1952E0.a, 0L, 0L, 0L, (j % 86400000000L) * 1000);
            case 3:
                C1952 c1952E1 = e0(this.a.l0(j / 86400000), this.b);
                return c1952E1.c0(c1952E1.a, 0L, 0L, 0L, (j % 86400000) * 1000000);
            case 4:
                return b0(j);
            case 5:
                return c0(this.a, 0L, j, 0L, 0L);
            case 6:
                return c0(this.a, j, 0L, 0L, 0L);
            case 7:
                C1952 c1952E2 = e0(this.a.l0(j / 256), this.b);
                return c1952E2.c0(c1952E2.a, (j % 256) * 12, 0L, 0L, 0L);
            default:
                return e0(this.a.d(j, interfaceC18056), this.b);
        }
    }

    public final C1952 b0(long j) {
        return c0(this.a, 0L, 0L, j, 0L);
    }

    @Override // l.InterfaceC15235
    /* JADX INFO: renamed from: C */
    public final InterfaceC15235 w(long j, EnumC22996 enumC22996) {
        return j == Long.MIN_VALUE ? d(C17492.FOREVER_NS, enumC22996).d(1L, enumC22996) : d(-j, enumC22996);
    }

    public final C1952 c0(C18991 c18991, long j, long j2, long j3, long j4) {
        if ((j | j2 | j3 | j4) == 0) {
            return e0(c18991, this.b);
        }
        long j5 = 1;
        long jH0 = this.b.h0();
        long j6 = ((((j % 24) * 3600000000000L) + ((j2 % 1440) * 60000000000L) + ((j3 % 86400) * 1000000000) + (j4 % 86400000000000L)) * j5) + jH0;
        long jZ = AbstractC1726.z(j6, 86400000000000L) + (((j / 24) + (j2 / 1440) + (j3 / 86400) + (j4 / 86400000000000L)) * j5);
        long jO = AbstractC1726.O(j6, 86400000000000L);
        return e0(c18991.l0(jZ), jO == jH0 ? this.b : C3363.a0(jO));
    }

    @Override // l.InterfaceC21584
    public final Object T(C22935 c22935) {
        if (c22935 == AbstractC23702.f) {
            return this.a;
        }
        return AbstractC1726.h(this, c22935);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:35:0x00d7  */
    @Override // l.InterfaceC15235
    public final long g(InterfaceC15235 interfaceC15235, InterfaceC18056 interfaceC18056) {
        long jQ;
        long j;
        C1952 c1952W = W(interfaceC15235);
        if (!(interfaceC18056 instanceof EnumC22996)) {
            return interfaceC18056.l(this, c1952W);
        }
        EnumC22996 enumC22996 = (EnumC22996) interfaceC18056;
        if (enumC22996.compareTo(EnumC22996.DAYS) >= 0) {
            C18991 c18991L0 = c1952W.a;
            C18991 c18991 = this.a;
            if (c18991 == null) {
                if (c18991L0.H() > c18991.H()) {
                    if (c1952W.b.compareTo(this.b) < 0) {
                        c18991L0 = c18991L0.l0(-1L);
                    }
                }
                return this.a.g(c18991L0, interfaceC18056);
            }
            c18991L0.getClass();
            if (c18991L0.V(c18991) > 0) {
                if (c1952W.b.compareTo(this.b) < 0) {
                    c18991L0 = c18991L0.l0(-1L);
                }
            }
            return this.a.g(c18991L0, interfaceC18056);
            if (c18991L0.c0(this.a) && c1952W.b.compareTo(this.b) > 0) {
                c18991L0 = c18991L0.l0(1L);
            }
            return this.a.g(c18991L0, interfaceC18056);
        }
        C18991 c18992 = this.a;
        C18991 c18993 = c1952W.a;
        c18992.getClass();
        long jH = c18993.H() - c18992.H();
        if (jH == 0) {
            return this.b.g(c1952W.b, interfaceC18056);
        }
        long jH0 = c1952W.b.h0() - this.b.h0();
        if (jH > 0) {
            jQ = jH - 1;
            j = jH0 + 86400000000000L;
        } else {
            jQ = jH + 1;
            j = jH0 - 86400000000000L;
        }
        switch (AbstractC14654.a[enumC22996.ordinal()]) {
            case 1:
                jQ = AbstractC1726.Q(jQ, 86400000000000L);
                break;
            case 2:
                jQ = AbstractC1726.Q(jQ, 86400000000L);
                j /= 1000;
                break;
            case 3:
                jQ = AbstractC1726.Q(jQ, 86400000L);
                j /= 1000000;
                break;
            case 4:
                jQ = AbstractC1726.Q(jQ, 86400);
                j /= 1000000000;
                break;
            case 5:
                jQ = AbstractC1726.Q(jQ, 1440);
                j /= 60000000000L;
                break;
            case 6:
                jQ = AbstractC1726.Q(jQ, 24);
                j /= 3600000000000L;
                break;
            case 7:
                jQ = AbstractC1726.Q(jQ, 2);
                j /= 43200000000000L;
                break;
        }
        return AbstractC1726.P(jQ, j);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public final int compareTo(InterfaceC9819 interfaceC9819) {
        if (interfaceC9819 instanceof C1952) {
            return V((C1952) interfaceC9819);
        }
        return AbstractC1726.c(this, interfaceC9819);
    }

    public final int V(C1952 c1952) {
        int iV = this.a.V(c1952.a);
        return iV == 0 ? this.b.compareTo(c1952.b) : iV;
    }

    public final boolean X(InterfaceC9819 interfaceC9819) {
        if (interfaceC9819 instanceof C1952) {
            return V((C1952) interfaceC9819) < 0;
        }
        long jH = this.a.H();
        long jH2 = interfaceC9819.f().H();
        if (jH >= jH2) {
            return jH == jH2 && this.b.h0() < interfaceC9819.b().h0();
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1952) {
            C1952 c1952 = (C1952) obj;
            if (this.a.equals(c1952.a) && this.b.equals(c1952.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public final String toString() {
        return this.a.toString() + "T" + this.b.toString();
    }

    private Object writeReplace() {
        return new C3944((byte) 5, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
