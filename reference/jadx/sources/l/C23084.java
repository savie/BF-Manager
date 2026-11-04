package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: renamed from: l.᩸᩸ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class C23084 implements InterfaceC1235, InterfaceC5930, Serializable {
    public static final long serialVersionUID = -6260982410461394882L;
    public final C19003 a;
    public final C11149 b;
    public final AbstractC22338 c;

    @Override // l.InterfaceC5930
    public final /* synthetic */ long Q() {
        return AbstractC1758.k(this);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return AbstractC1758.d(this, (InterfaceC5930) obj);
    }

    @Override // l.InterfaceC5930
    public final InterfaceC8912 a() {
        return ((C7816) e()).a();
    }

    public static C23084 S(C19003 c19003, C11149 c11149, AbstractC22338 abstractC22338) {
        C17359.requireNonNull(c19003, "localDateTime");
        C17359.requireNonNull(abstractC22338, "zone");
        if (abstractC22338 instanceof C11149) {
            return new C23084(c19003, (C11149) abstractC22338, abstractC22338);
        }
        C21307 c21307S = abstractC22338.S();
        List listF = c21307S.f(c19003);
        if (listF.size() == 1) {
            c11149 = (C11149) listF.get(0);
        } else if (listF.size() != 0) {
            if (c11149 == null || !listF.contains(c11149)) {
                c11149 = (C11149) C17359.requireNonNull((C11149) listF.get(0), "offset");
            }
        } else {
            Object objE = c21307S.e(c19003);
            C6391 c6391 = objE instanceof C6391 ? (C6391) objE : null;
            c19003 = c19003.W(C18257.ofSeconds(c6391.d.getTotalSeconds() - c6391.c.getTotalSeconds()).getSeconds());
            c11149 = c6391.d;
        }
        return new C23084(c19003, c11149, abstractC22338);
    }

    public static C23084 ofInstant(C0358 c0358, AbstractC22338 abstractC22338) {
        C17359.requireNonNull(c0358, "instant");
        C17359.requireNonNull(abstractC22338, "zone");
        return p(c0358.getEpochSecond(), c0358.getNano(), abstractC22338);
    }

    public static C23084 ofInstant(C19003 c19003, C11149 c11149, AbstractC22338 abstractC22338) {
        C17359.requireNonNull(c19003, "localDateTime");
        C17359.requireNonNull(c11149, "offset");
        C17359.requireNonNull(abstractC22338, "zone");
        if (abstractC22338.S().f(c19003).contains(c11149)) {
            return new C23084(c19003, c11149, abstractC22338);
        }
        c19003.getClass();
        return p(AbstractC1758.j(c19003, c11149), c19003.b.getNano(), abstractC22338);
    }

    public static C23084 p(long j, int i, AbstractC22338 abstractC22338) {
        C11149 c11149D = abstractC22338.S().d(C0358.ofEpochSecond(j, i));
        return new C23084(C19003.U(j, i, c11149D), c11149D, abstractC22338);
    }

    @Override // l.InterfaceC5930
    public final C0358 toInstant() {
        return C0358.ofEpochSecond(Q(), toLocalTime().getNano());
    }

    public static C23084 R(InterfaceC9437 interfaceC9437) {
        if (interfaceC9437 instanceof C23084) {
            return (C23084) interfaceC9437;
        }
        try {
            AbstractC22338 abstractC22338R = AbstractC22338.R(interfaceC9437);
            EnumC8692 enumC8692 = EnumC8692.INSTANT_SECONDS;
            if (!interfaceC9437.d(enumC8692)) {
                return S(C19003.of(C7816.T(interfaceC9437), C10052.T(interfaceC9437)), null, abstractC22338R);
            }
            return p(interfaceC9437.C(enumC8692), interfaceC9437.i(EnumC8692.NANO_OF_SECOND), abstractC22338R);
        } catch (C21241 e) {
            throw new C21241("Unable to obtain ZonedDateTime from TemporalAccessor: " + interfaceC9437 + " of type " + interfaceC9437.getClass().getName(), e);
        }
    }

    public C23084(C19003 c19003, C11149 c11149, AbstractC22338 abstractC22338) {
        this.a = c19003;
        this.b = c11149;
        this.c = abstractC22338;
    }

    @Override // l.InterfaceC9437
    public final boolean d(InterfaceC16831 interfaceC16831) {
        if (interfaceC16831 instanceof EnumC8692) {
            return true;
        }
        return interfaceC16831 != null && interfaceC16831.i(this);
    }

    @Override // l.InterfaceC9437
    public final C23545 k(InterfaceC16831 interfaceC16831) {
        if (interfaceC16831 instanceof EnumC8692) {
            if (interfaceC16831 == EnumC8692.INSTANT_SECONDS || interfaceC16831 == EnumC8692.OFFSET_SECONDS) {
                return ((EnumC8692) interfaceC16831).b;
            }
            return this.a.k(interfaceC16831);
        }
        return interfaceC16831.j(this);
    }

    @Override // l.InterfaceC9437
    public final int i(InterfaceC16831 interfaceC16831) {
        if (interfaceC16831 instanceof EnumC8692) {
            int i = AbstractC19134.a[((EnumC8692) interfaceC16831).ordinal()];
            if (i == 1) {
                throw new C16085("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i == 2) {
                return getOffset().getTotalSeconds();
            }
            return this.a.i(interfaceC16831);
        }
        return AbstractC1758.e(this, interfaceC16831);
    }

    @Override // l.InterfaceC9437
    public final long C(InterfaceC16831 interfaceC16831) {
        if (!(interfaceC16831 instanceof EnumC8692)) {
            return interfaceC16831.z(this);
        }
        int i = AbstractC19134.a[((EnumC8692) interfaceC16831).ordinal()];
        if (i != 1) {
            return i != 2 ? this.a.C(interfaceC16831) : getOffset().getTotalSeconds();
        }
        return AbstractC1758.k(this);
    }

    @Override // l.InterfaceC5930
    public C11149 getOffset() {
        return this.b;
    }

    @Override // l.InterfaceC5930
    public AbstractC22338 getZone() {
        return this.c;
    }

    @Override // l.InterfaceC5930
    public final InterfaceC5930 x(AbstractC22338 abstractC22338) {
        C17359.requireNonNull(abstractC22338, "zone");
        return this.c.equals(abstractC22338) ? this : S(this.a, this.b, abstractC22338);
    }

    @Override // l.InterfaceC5930
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public final C23084 g(AbstractC22338 abstractC22338) {
        C17359.requireNonNull(abstractC22338, "zone");
        if (this.c.equals(abstractC22338)) {
            return this;
        }
        C19003 c19003 = this.a;
        C11149 c11149 = this.b;
        c19003.getClass();
        return p(AbstractC1758.j(c19003, c11149), this.a.b.getNano(), abstractC22338);
    }

    @Override // l.InterfaceC5930
    /* JADX INFO: renamed from: toLocalDateTime, reason: merged with bridge method [inline-methods] */
    public C19003 q() {
        return this.a;
    }

    @Override // l.InterfaceC5930
    public final InterfaceC17116 e() {
        return this.a.e();
    }

    @Override // l.InterfaceC5930
    public final C10052 toLocalTime() {
        return this.a.toLocalTime();
    }

    @Override // l.InterfaceC1235
    /* JADX INFO: renamed from: j */
    public final InterfaceC1235 y(C7816 c7816) {
        return S(C19003.of(c7816, this.a.toLocalTime()), this.b, this.c);
    }

    @Override // l.InterfaceC1235
    public final InterfaceC1235 b(long j, InterfaceC16831 interfaceC16831) {
        if (interfaceC16831 instanceof EnumC8692) {
            EnumC8692 enumC8692 = (EnumC8692) interfaceC16831;
            int i = AbstractC19134.a[enumC8692.ordinal()];
            if (i == 1) {
                return p(j, this.a.b.getNano(), this.c);
            }
            if (i != 2) {
                return S(this.a.b(j, interfaceC16831), this.b, this.c);
            }
            C11149 c11149OfTotalSeconds = C11149.ofTotalSeconds(enumC8692.b.a(j, enumC8692));
            return (c11149OfTotalSeconds.equals(this.b) || !this.c.S().f(this.a).contains(c11149OfTotalSeconds)) ? this : new C23084(this.a, c11149OfTotalSeconds, this.c);
        }
        return (C23084) interfaceC16831.C(this, j);
    }

    @Override // l.InterfaceC1235
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public final C23084 c(long j, InterfaceC2726 interfaceC2726) {
        if (interfaceC2726 instanceof EnumC10183) {
            EnumC10183 enumC10183 = (EnumC10183) interfaceC2726;
            if (enumC10183.compareTo(EnumC10183.DAYS) < 0 || enumC10183 == EnumC10183.FOREVER) {
                return ofInstant(this.a.c(j, interfaceC2726), this.b, this.c);
            }
            return S(this.a.c(j, interfaceC2726), this.b, this.c);
        }
        return (C23084) interfaceC2726.j(this, j);
    }

    @Override // l.InterfaceC1235
    public final InterfaceC1235 z(long j, EnumC10183 enumC10183) {
        return j == Long.MIN_VALUE ? c(C25227.FOREVER_NS, enumC10183).c(1L, enumC10183) : c(-j, enumC10183);
    }

    @Override // l.InterfaceC9437
    public final Object P(C14435 c14435) {
        if (c14435 == AbstractC17577.f) {
            return this.a.e();
        }
        return AbstractC1758.i(this, c14435);
    }

    @Override // l.InterfaceC1235
    public final long f(InterfaceC1235 interfaceC1235, InterfaceC2726 interfaceC2726) {
        C23084 c23084R = R(interfaceC1235);
        if (interfaceC2726 instanceof EnumC10183) {
            C23084 c23084G = c23084R.g(this.c);
            EnumC10183 enumC10183 = (EnumC10183) interfaceC2726;
            if (enumC10183.compareTo(EnumC10183.DAYS) >= 0 && enumC10183 != EnumC10183.FOREVER) {
                return this.a.f(c23084G.a, interfaceC2726);
            }
            return C9306.of(this.a, this.b).f(C9306.of(c23084G.a, c23084G.b), interfaceC2726);
        }
        return interfaceC2726.i(this, c23084R);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C23084) {
            C23084 c23084 = (C23084) obj;
            if (this.a.equals(c23084.a) && this.b.equals(c23084.b) && this.c.equals(c23084.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() ^ this.b.b) ^ Integer.rotateLeft(this.c.hashCode(), 3);
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

    private Object writeReplace() {
        return new C21372((byte) 6, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
