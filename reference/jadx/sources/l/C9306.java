package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import org.bouncycastle.i18n.TextBundle;

/* JADX INFO: renamed from: l.ۡۤۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9306 implements InterfaceC1235, InterfaceC1916, Comparable, Serializable {
    public static final /* synthetic */ int c = 0;
    public static final long serialVersionUID = 2287754244819255394L;
    public final C19003 a;
    public final C11149 b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        int iCompare;
        C9306 c9306 = (C9306) obj;
        if (getOffset().equals(c9306.getOffset())) {
            iCompare = toLocalDateTime().compareTo(c9306.toLocalDateTime());
        } else {
            C19003 c19003 = this.a;
            C11149 c11149 = this.b;
            c19003.getClass();
            long j = AbstractC1758.j(c19003, c11149);
            C19003 c19004 = c9306.a;
            C11149 c111410 = c9306.b;
            c19004.getClass();
            iCompare = Long.compare(j, AbstractC1758.j(c19004, c111410));
            if (iCompare == 0) {
                iCompare = this.a.toLocalTime().getNano() - c9306.a.toLocalTime().getNano();
            }
        }
        return iCompare == 0 ? toLocalDateTime().compareTo(c9306.toLocalDateTime()) : iCompare;
    }

    static {
        C19003 c19003 = C19003.c;
        C11149 c11149 = C11149.h;
        c19003.getClass();
        of(c19003, c11149);
        C19003 c19004 = C19003.d;
        C11149 c111410 = C11149.g;
        c19004.getClass();
        of(c19004, c111410);
    }

    public static C9306 of(C19003 c19003, C11149 c11149) {
        return new C9306(c19003, c11149);
    }

    public static C9306 S(C0358 c0358, AbstractC22338 abstractC22338) {
        C17359.requireNonNull(c0358, "instant");
        C17359.requireNonNull(abstractC22338, "zone");
        C11149 c11149D = abstractC22338.S().d(c0358);
        return new C9306(C19003.U(c0358.getEpochSecond(), c0358.getNano(), c11149D), c11149D);
    }

    public static C9306 R(InterfaceC9437 interfaceC9437) {
        if (interfaceC9437 instanceof C9306) {
            return (C9306) interfaceC9437;
        }
        try {
            C11149 c11149X = C11149.X(interfaceC9437);
            C7816 c7816 = (C7816) interfaceC9437.P(AbstractC17577.f);
            C10052 c10052 = (C10052) interfaceC9437.P(AbstractC17577.g);
            if (c7816 != null && c10052 != null) {
                return new C9306(C19003.of(c7816, c10052), c11149X);
            }
            return S(C0358.S(interfaceC9437), c11149X);
        } catch (C21241 e) {
            throw new C21241("Unable to obtain OffsetDateTime from TemporalAccessor: " + interfaceC9437 + " of type " + interfaceC9437.getClass().getName(), e);
        }
    }

    public static C9306 parse(CharSequence charSequence) {
        String string;
        C23742 c23742 = C23742.g;
        C17359.requireNonNull(c23742, "formatter");
        C14435 c14435 = new C14435(1);
        c23742.getClass();
        C17359.requireNonNull(charSequence, TextBundle.TEXT_ENTRY);
        C17359.requireNonNull(c14435, "query");
        try {
            return (C9306) c23742.a(charSequence).P(c14435);
        } catch (C16896 e) {
            throw e;
        } catch (RuntimeException e2) {
            if (charSequence.length() > 64) {
                string = charSequence.subSequence(0, 64).toString() + "...";
            } else {
                string = charSequence.toString();
            }
            C16896 c16896 = new C16896("Text '" + string + "' could not be parsed: " + e2.getMessage(), e2);
            charSequence.toString();
            throw c16896;
        }
    }

    public C9306(C19003 c19003, C11149 c11149) {
        this.a = (C19003) C17359.requireNonNull(c19003, "dateTime");
        this.b = (C11149) C17359.requireNonNull(c11149, "offset");
    }

    public final C9306 U(C19003 c19003, C11149 c11149) {
        return (this.a == c19003 && this.b.equals(c11149)) ? this : new C9306(c19003, c11149);
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
            if (interfaceC16831 != EnumC8692.INSTANT_SECONDS && interfaceC16831 != EnumC8692.OFFSET_SECONDS) {
                return this.a.k(interfaceC16831);
            }
            return ((EnumC8692) interfaceC16831).b;
        }
        return interfaceC16831.j(this);
    }

    @Override // l.InterfaceC9437
    public final int i(InterfaceC16831 interfaceC16831) {
        if (interfaceC16831 instanceof EnumC8692) {
            int i = AbstractC4218.a[((EnumC8692) interfaceC16831).ordinal()];
            if (i == 1) {
                throw new C16085("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i == 2) {
                return getOffset().getTotalSeconds();
            }
            return this.a.i(interfaceC16831);
        }
        return AbstractC17577.a(this, interfaceC16831);
    }

    @Override // l.InterfaceC9437
    public final long C(InterfaceC16831 interfaceC16831) {
        if (!(interfaceC16831 instanceof EnumC8692)) {
            return interfaceC16831.z(this);
        }
        int i = AbstractC4218.a[((EnumC8692) interfaceC16831).ordinal()];
        if (i != 1) {
            return i != 2 ? this.a.C(interfaceC16831) : getOffset().getTotalSeconds();
        }
        C19003 c19003 = this.a;
        C11149 c11149 = this.b;
        c19003.getClass();
        return AbstractC1758.j(c19003, c11149);
    }

    public C11149 getOffset() {
        return this.b;
    }

    public C19003 toLocalDateTime() {
        return this.a;
    }

    public int getNano() {
        return this.a.b.getNano();
    }

    @Override // l.InterfaceC1235
    /* JADX INFO: renamed from: j */
    public final InterfaceC1235 y(C7816 c7816) {
        C19003 c19003 = this.a;
        return U(c19003.Z(c7816, c19003.b), this.b);
    }

    @Override // l.InterfaceC1235
    public final InterfaceC1235 b(long j, InterfaceC16831 interfaceC16831) {
        if (interfaceC16831 instanceof EnumC8692) {
            EnumC8692 enumC8692 = (EnumC8692) interfaceC16831;
            int i = AbstractC4218.a[enumC8692.ordinal()];
            if (i == 1) {
                return S(C0358.ofEpochSecond(j, getNano()), this.b);
            }
            if (i == 2) {
                return U(this.a, C11149.ofTotalSeconds(enumC8692.b.a(j, enumC8692)));
            }
            return U(this.a.b(j, interfaceC16831), this.b);
        }
        return (C9306) interfaceC16831.C(this, j);
    }

    @Override // l.InterfaceC1235
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public final C9306 c(long j, InterfaceC2726 interfaceC2726) {
        if (interfaceC2726 instanceof EnumC10183) {
            return U(this.a.c(j, interfaceC2726), this.b);
        }
        return (C9306) interfaceC2726.j(this, j);
    }

    @Override // l.InterfaceC1235
    public final InterfaceC1235 z(long j, EnumC10183 enumC10183) {
        return j == Long.MIN_VALUE ? c(C25227.FOREVER_NS, enumC10183).c(1L, enumC10183) : c(-j, enumC10183);
    }

    @Override // l.InterfaceC9437
    public final Object P(C14435 c14435) {
        if (c14435 == AbstractC17577.d || c14435 == AbstractC17577.e) {
            return getOffset();
        }
        if (c14435 == AbstractC17577.a) {
            return null;
        }
        if (c14435 == AbstractC17577.f) {
            return this.a.e();
        }
        if (c14435 == AbstractC17577.g) {
            return this.a.toLocalTime();
        }
        if (c14435 == AbstractC17577.b) {
            return C20012.c;
        }
        if (c14435 == AbstractC17577.c) {
            return EnumC10183.NANOS;
        }
        return c14435.g(this);
    }

    @Override // l.InterfaceC1916
    public final InterfaceC1235 p(InterfaceC1235 interfaceC1235) {
        return interfaceC1235.b(this.a.e().D(), EnumC8692.EPOCH_DAY).b(this.a.toLocalTime().c0(), EnumC8692.NANO_OF_DAY).b(getOffset().getTotalSeconds(), EnumC8692.OFFSET_SECONDS);
    }

    @Override // l.InterfaceC1235
    public final long f(InterfaceC1235 interfaceC1235, InterfaceC2726 interfaceC2726) {
        C9306 c9306R = R(interfaceC1235);
        if (interfaceC2726 instanceof EnumC10183) {
            C11149 c11149 = this.b;
            if (!c11149.equals(c9306R.b)) {
                c9306R = new C9306(c9306R.a.W(c11149.getTotalSeconds() - c9306R.b.getTotalSeconds()), c11149);
            }
            return this.a.f(c9306R.a, interfaceC2726);
        }
        return interfaceC2726.i(this, c9306R);
    }

    public C0358 toInstant() {
        C19003 c19003 = this.a;
        C11149 c11149 = this.b;
        c19003.getClass();
        return AbstractC1758.l(c19003, c11149);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C9306) {
            C9306 c9306 = (C9306) obj;
            if (this.a.equals(c9306.a) && this.b.equals(c9306.b)) {
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
        return new C21372((byte) 10, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
