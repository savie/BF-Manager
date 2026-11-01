package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: renamed from: l.ۨ֡ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11356 implements InterfaceC9819, InterfaceC15235, InterfaceC12413, Serializable {
    public static final long serialVersionUID = 4556003607393004514L;
    public final transient InterfaceC17579 a;
    public final transient C3363 b;

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: L */
    public final /* synthetic */ int compareTo(InterfaceC9819 interfaceC9819) {
        return AbstractC1726.c(this, interfaceC9819);
    }

    @Override // l.InterfaceC21584
    public final /* synthetic */ Object T(C22935 c22935) {
        return AbstractC1726.h(this, c22935);
    }

    @Override // l.InterfaceC9819
    public final /* synthetic */ long r(C2678 c2678) {
        return AbstractC1726.j(this, c2678);
    }

    public static C11356 V(InterfaceC21233 interfaceC21233, InterfaceC15235 interfaceC15235) {
        C11356 c11356 = (C11356) interfaceC15235;
        if (interfaceC21233.equals(c11356.a.a())) {
            return c11356;
        }
        throw new ClassCastException("Chronology mismatch, required: " + interfaceC21233.k() + ", actual: " + c11356.a.a().k());
    }

    public C11356(InterfaceC17579 interfaceC17579, C3363 c3363) {
        C13638.requireNonNull(interfaceC17579, "date");
        C13638.requireNonNull(c3363, "time");
        this.a = interfaceC17579;
        this.b = c3363;
    }

    public final C11356 Z(InterfaceC15235 interfaceC15235, C3363 c3363) {
        InterfaceC17579 interfaceC17579 = this.a;
        return (interfaceC17579 == interfaceC15235 && this.b == c3363) ? this : new C11356(AbstractC14758.V(interfaceC17579.a(), interfaceC15235), c3363);
    }

    @Override // l.InterfaceC15235
    /* JADX INFO: renamed from: C */
    public final InterfaceC15235 w(long j, EnumC22996 enumC22996) {
        return V(this.a.a(), AbstractC23702.b(this, j, enumC22996));
    }

    @Override // l.InterfaceC9819
    public final InterfaceC21233 a() {
        return this.a.a();
    }

    @Override // l.InterfaceC9819
    public final InterfaceC17579 f() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public final String toString() {
        return this.a.toString() + "T" + this.b.toString();
    }

    @Override // l.InterfaceC9819
    public final C3363 b() {
        return this.b;
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
            if (!((EnumC18762) interfaceC11002).V()) {
                return this.a.n(interfaceC11002);
            }
            C3363 c3363 = this.b;
            c3363.getClass();
            return AbstractC23702.d(c3363, interfaceC11002);
        }
        return interfaceC11002.m(this);
    }

    @Override // l.InterfaceC21584
    public final int l(InterfaceC11002 interfaceC11002) {
        if (interfaceC11002 instanceof EnumC18762) {
            return ((EnumC18762) interfaceC11002).V() ? this.b.l(interfaceC11002) : this.a.l(interfaceC11002);
        }
        return n(interfaceC11002).a(G(interfaceC11002), interfaceC11002);
    }

    @Override // l.InterfaceC21584
    public final long G(InterfaceC11002 interfaceC11002) {
        if (interfaceC11002 instanceof EnumC18762) {
            return ((EnumC18762) interfaceC11002).V() ? this.b.G(interfaceC11002) : this.a.G(interfaceC11002);
        }
        return interfaceC11002.C(this);
    }

    @Override // l.InterfaceC15235
    public final InterfaceC15235 m(C18991 c18991) {
        return Z(c18991, this.b);
    }

    @Override // l.InterfaceC15235
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public final C11356 c(long j, InterfaceC11002 interfaceC11002) {
        if (interfaceC11002 instanceof EnumC18762) {
            if (((EnumC18762) interfaceC11002).V()) {
                return Z(this.a, this.b.c(j, interfaceC11002));
            }
            return Z(this.a.c(j, interfaceC11002), this.b);
        }
        return V(this.a.a(), interfaceC11002.G(this, j));
    }

    @Override // l.InterfaceC15235
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public final C11356 d(long j, InterfaceC18056 interfaceC18056) {
        if (!(interfaceC18056 instanceof EnumC22996)) {
            return V(this.a.a(), interfaceC18056.m(this, j));
        }
        switch (AbstractC4299.a[((EnumC22996) interfaceC18056).ordinal()]) {
            case 1:
                return X(this.a, 0L, 0L, 0L, j);
            case 2:
                C11356 c11356Z = Z(this.a.d(j / 86400000000L, (InterfaceC18056) EnumC22996.DAYS), this.b);
                return c11356Z.X(c11356Z.a, 0L, 0L, 0L, (j % 86400000000L) * 1000);
            case 3:
                C11356 c11356Z2 = Z(this.a.d(j / 86400000, (InterfaceC18056) EnumC22996.DAYS), this.b);
                return c11356Z2.X(c11356Z2.a, 0L, 0L, 0L, (j % 86400000) * 1000000);
            case 4:
                return X(this.a, 0L, 0L, j, 0L);
            case 5:
                return X(this.a, 0L, j, 0L, 0L);
            case 6:
                return X(this.a, j, 0L, 0L, 0L);
            case 7:
                C11356 c11356Z3 = Z(this.a.d(j / 256, (InterfaceC18056) EnumC22996.DAYS), this.b);
                return c11356Z3.X(c11356Z3.a, (j % 256) * 12, 0L, 0L, 0L);
            default:
                return Z(this.a.d(j, interfaceC18056), this.b);
        }
    }

    public final C11356 X(InterfaceC17579 interfaceC17579, long j, long j2, long j3, long j4) {
        if ((j | j2 | j3 | j4) == 0) {
            return Z(interfaceC17579, this.b);
        }
        long j5 = j / 24;
        long j6 = ((j % 24) * 3600000000000L) + ((j2 % 1440) * 60000000000L) + ((j3 % 86400) * 1000000000) + (j4 % 86400000000000L);
        long jH0 = this.b.h0();
        long j7 = j6 + jH0;
        long jZ = AbstractC1726.z(j7, 86400000000000L) + j5 + (j2 / 1440) + (j3 / 86400) + (j4 / 86400000000000L);
        long jO = AbstractC1726.O(j7, 86400000000000L);
        return Z(interfaceC17579.d(jZ, (InterfaceC18056) EnumC22996.DAYS), jO == jH0 ? this.b : C3363.a0(jO));
    }

    @Override // l.InterfaceC9819
    public final InterfaceC20402 D(AbstractC9114 abstractC9114) {
        return C22645.V(abstractC9114, null, this);
    }

    @Override // l.InterfaceC15235
    public final long g(InterfaceC15235 interfaceC15235, InterfaceC18056 interfaceC18056) {
        int i;
        C13638.requireNonNull(interfaceC15235, "endExclusive");
        InterfaceC9819 interfaceC9819J = this.a.a().J(interfaceC15235);
        if (!(interfaceC18056 instanceof EnumC22996)) {
            C13638.requireNonNull(interfaceC18056, "unit");
            return interfaceC18056.l(this, interfaceC9819J);
        }
        EnumC22996 enumC22996 = (EnumC22996) interfaceC18056;
        EnumC22996 enumC22997 = EnumC22996.DAYS;
        if (enumC22996.compareTo(enumC22997) >= 0) {
            InterfaceC17579 interfaceC17579F = interfaceC9819J.f();
            if (interfaceC9819J.b().compareTo(this.b) < 0) {
                interfaceC17579F = interfaceC17579F.w(1L, enumC22997);
            }
            return this.a.g(interfaceC17579F, interfaceC18056);
        }
        EnumC18762 enumC18762 = EnumC18762.EPOCH_DAY;
        long jG = interfaceC9819J.G(enumC18762) - this.a.G(enumC18762);
        switch (AbstractC4299.a[enumC22996.ordinal()]) {
            case 1:
                jG = AbstractC1726.Q(jG, 86400000000000L);
                break;
            case 2:
                jG = AbstractC1726.Q(jG, 86400000000L);
                break;
            case 3:
                jG = AbstractC1726.Q(jG, 86400000L);
                break;
            case 4:
                i = 86400;
                jG = AbstractC1726.Q(jG, i);
                break;
            case 5:
                i = 1440;
                jG = AbstractC1726.Q(jG, i);
                break;
            case 6:
                i = 24;
                jG = AbstractC1726.Q(jG, i);
                break;
            case 7:
                i = 2;
                jG = AbstractC1726.Q(jG, i);
                break;
        }
        return AbstractC1726.P(jG, this.b.g(interfaceC9819J.b(), interfaceC18056));
    }

    @Override // l.InterfaceC12413
    public final InterfaceC15235 s(InterfaceC15235 interfaceC15235) {
        return interfaceC15235.c(f().H(), EnumC18762.EPOCH_DAY).c(b().h0(), EnumC18762.NANO_OF_DAY);
    }

    private Object writeReplace() {
        return new C3467((byte) 2, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InterfaceC9819) && AbstractC1726.c(this, (InterfaceC9819) obj) == 0;
    }
}
