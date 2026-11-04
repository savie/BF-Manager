package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: renamed from: l.ۡ᩸ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9657 implements InterfaceC5930, Serializable {
    public static final long serialVersionUID = -5261813987200935591L;
    public final transient C14878 a;
    public final transient C11149 b;
    public final transient AbstractC22338 c;

    @Override // l.InterfaceC9437
    public final /* synthetic */ Object P(C14435 c14435) {
        return AbstractC1758.i(this, c14435);
    }

    @Override // l.InterfaceC5930
    public final /* synthetic */ long Q() {
        return AbstractC1758.k(this);
    }

    @Override // l.InterfaceC9437
    public final /* synthetic */ int i(InterfaceC16831 interfaceC16831) {
        return AbstractC1758.e(this, interfaceC16831);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return AbstractC1758.d(this, (InterfaceC5930) obj);
    }

    public static C9657 R(AbstractC22338 abstractC22338, C11149 c11149, C14878 c14878) {
        C17359.requireNonNull(c14878, "localDateTime");
        C17359.requireNonNull(abstractC22338, "zone");
        if (abstractC22338 instanceof C11149) {
            return new C9657(abstractC22338, (C11149) abstractC22338, c14878);
        }
        C21307 c21307S = abstractC22338.S();
        C19003 c19003S = C19003.S(c14878);
        List listF = c21307S.f(c19003S);
        if (listF.size() == 1) {
            c11149 = (C11149) listF.get(0);
        } else if (listF.size() != 0) {
            if (c11149 == null || !listF.contains(c11149)) {
                c11149 = (C11149) listF.get(0);
            }
        } else {
            Object objE = c21307S.e(c19003S);
            C6391 c6391 = objE instanceof C6391 ? (C6391) objE : null;
            c14878 = c14878.T(c14878.a, 0L, 0L, C18257.ofSeconds(c6391.d.getTotalSeconds() - c6391.c.getTotalSeconds()).getSeconds(), 0L);
            c11149 = c6391.d;
        }
        C17359.requireNonNull(c11149, "offset");
        return new C9657(abstractC22338, c11149, c14878);
    }

    public static C9657 S(InterfaceC8912 interfaceC8912, C0358 c0358, AbstractC22338 abstractC22338) {
        C11149 c11149D = abstractC22338.S().d(c0358);
        C17359.requireNonNull(c11149D, "offset");
        return new C9657(abstractC22338, c11149D, (C14878) interfaceC8912.F(C19003.U(c0358.getEpochSecond(), c0358.getNano(), c11149D)));
    }

    @Override // l.InterfaceC9437
    public final C23545 k(InterfaceC16831 interfaceC16831) {
        if (interfaceC16831 instanceof EnumC8692) {
            if (interfaceC16831 != EnumC8692.INSTANT_SECONDS && interfaceC16831 != EnumC8692.OFFSET_SECONDS) {
                return ((C14878) q()).k(interfaceC16831);
            }
            return ((EnumC8692) interfaceC16831).b;
        }
        return interfaceC16831.j(this);
    }

    public static C9657 p(InterfaceC8912 interfaceC8912, InterfaceC1235 interfaceC1235) {
        C9657 c9657 = (C9657) interfaceC1235;
        if (interfaceC8912.equals(c9657.a())) {
            return c9657;
        }
        throw new ClassCastException("Chronology mismatch, required: " + interfaceC8912.getId() + ", actual: " + c9657.a().getId());
    }

    @Override // l.InterfaceC9437
    public final long C(InterfaceC16831 interfaceC16831) {
        if (interfaceC16831 instanceof EnumC8692) {
            int i = AbstractC8167.a[((EnumC8692) interfaceC16831).ordinal()];
            if (i == 1) {
                return Q();
            }
            if (i == 2) {
                return getOffset().getTotalSeconds();
            }
            return ((C14878) q()).C(interfaceC16831);
        }
        return interfaceC16831.z(this);
    }

    public C9657(AbstractC22338 abstractC22338, C11149 c11149, C14878 c14878) {
        this.a = (C14878) C17359.requireNonNull(c14878, "dateTime");
        this.b = (C11149) C17359.requireNonNull(c11149, "offset");
        this.c = (AbstractC22338) C17359.requireNonNull(abstractC22338, "zone");
    }

    @Override // l.InterfaceC5930
    public final C11149 getOffset() {
        return this.b;
    }

    @Override // l.InterfaceC5930
    public final InterfaceC17116 e() {
        return ((C14878) q()).e();
    }

    @Override // l.InterfaceC5930
    public final C10052 toLocalTime() {
        return ((C14878) q()).toLocalTime();
    }

    public final int hashCode() {
        return (this.a.hashCode() ^ this.b.b) ^ Integer.rotateLeft(this.c.hashCode(), 3);
    }

    @Override // l.InterfaceC5930
    public final InterfaceC12641 q() {
        return this.a;
    }

    public final String toString() {
        String str = this.a.toString() + this.b.c;
        C11149 c11149 = this.b;
        AbstractC22338 abstractC22338 = this.c;
        if (c11149 == abstractC22338) {
            return str;
        }
        return str + "[" + abstractC22338.toString() + "]";
    }

    @Override // l.InterfaceC5930
    public final AbstractC22338 getZone() {
        return this.c;
    }

    @Override // l.InterfaceC5930
    public final InterfaceC8912 a() {
        return e().a();
    }

    @Override // l.InterfaceC5930
    public final InterfaceC5930 x(AbstractC22338 abstractC22338) {
        return R(abstractC22338, this.b, this.a);
    }

    @Override // l.InterfaceC5930
    public final InterfaceC5930 g(AbstractC22338 abstractC22338) {
        C17359.requireNonNull(abstractC22338, "zone");
        if (this.c.equals(abstractC22338)) {
            return this;
        }
        C14878 c14878 = this.a;
        C11149 c11149 = this.b;
        c14878.getClass();
        return S(a(), AbstractC1758.l(c14878, c11149), abstractC22338);
    }

    @Override // l.InterfaceC9437
    public final boolean d(InterfaceC16831 interfaceC16831) {
        if (interfaceC16831 instanceof EnumC8692) {
            return true;
        }
        return interfaceC16831 != null && interfaceC16831.i(this);
    }

    @Override // l.InterfaceC1235
    public final InterfaceC1235 b(long j, InterfaceC16831 interfaceC16831) {
        if (!(interfaceC16831 instanceof EnumC8692)) {
            return p(a(), interfaceC16831.C(this, j));
        }
        EnumC8692 enumC8692 = (EnumC8692) interfaceC16831;
        int i = AbstractC10403.a[enumC8692.ordinal()];
        if (i == 1) {
            return c(j - AbstractC1758.k(this), EnumC10183.SECONDS);
        }
        if (i != 2) {
            return R(this.c, this.b, this.a.b(j, interfaceC16831));
        }
        C11149 c11149OfTotalSeconds = C11149.ofTotalSeconds(enumC8692.b.a(j, enumC8692));
        C14878 c14878 = this.a;
        c14878.getClass();
        return S(a(), AbstractC1758.l(c14878, c11149OfTotalSeconds), this.c);
    }

    @Override // l.InterfaceC1235
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public final C9657 c(long j, InterfaceC2726 interfaceC2726) {
        if (interfaceC2726 instanceof EnumC10183) {
            return p(a(), this.a.c(j, interfaceC2726).p(this));
        }
        return p(a(), interfaceC2726.j(this, j));
    }

    @Override // l.InterfaceC1235
    public final long f(InterfaceC1235 interfaceC1235, InterfaceC2726 interfaceC2726) {
        C17359.requireNonNull(interfaceC1235, "endExclusive");
        InterfaceC5930 interfaceC5930M = a().m(interfaceC1235);
        if (interfaceC2726 instanceof EnumC10183) {
            return this.a.f(interfaceC5930M.g(this.b).q(), interfaceC2726);
        }
        C17359.requireNonNull(interfaceC2726, "unit");
        return interfaceC2726.i(this, interfaceC5930M);
    }

    private Object writeReplace() {
        return new C6676((byte) 3, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InterfaceC5930) && AbstractC1758.d(this, (InterfaceC5930) obj) == 0;
    }

    @Override // l.InterfaceC1235
    /* JADX INFO: renamed from: j */
    public final InterfaceC1235 y(C7816 c7816) {
        return p(a(), c7816.p(this));
    }

    @Override // l.InterfaceC1235
    public final InterfaceC1235 z(long j, EnumC10183 enumC10183) {
        return p(a(), AbstractC17577.b(this, j, enumC10183));
    }

    @Override // l.InterfaceC5930
    public final C0358 toInstant() {
        return C0358.ofEpochSecond(Q(), toLocalTime().getNano());
    }
}
