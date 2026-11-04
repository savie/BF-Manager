package l;

import com.google.android.material.badge.BadgeDrawable;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: renamed from: l.ۤ᩸ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11149 extends AbstractC22338 implements InterfaceC9437, InterfaceC1916, Comparable, Serializable {
    public static final ConcurrentMapC17249 d = new ConcurrentMapC17249(16, 0.75f, 4);
    public static final ConcurrentMapC17249 e = new ConcurrentMapC17249(16, 0.75f, 4);
    public static final C11149 f = ofTotalSeconds(0);
    public static final C11149 g = ofTotalSeconds(-64800);
    public static final C11149 h = ofTotalSeconds(64800);
    public static final long serialVersionUID = 2357656521762053153L;
    public final int b;
    public final transient String c;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return ((C11149) obj).b - this.b;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x008e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:33:0x009f  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a7  */
    /* JADX WARN: Multi-variable type inference failed */
    public static C11149 Y(String str) {
        int iA0;
        int iA1;
        int iA2;
        char cCharAt;
        C17359.requireNonNull(str, "offsetId");
        C11149 c11149 = (C11149) e.get(str);
        if (c11149 != null) {
            return c11149;
        }
        int length = str.length();
        if (length == 2) {
            str = str.charAt(0) + "0" + str.charAt(1);
        } else {
            if (length != 3) {
                if (length == 5) {
                    iA0 = a0(str, 1, false);
                    iA1 = a0(str, 3, false);
                } else {
                    if (length == 6) {
                        iA0 = a0(str, 1, false);
                        iA1 = a0(str, 4, true);
                    } else if (length == 7) {
                        iA0 = a0(str, 1, false);
                        iA1 = a0(str, 3, false);
                        iA2 = a0(str, 5, false);
                    } else if (length == 9) {
                        iA0 = a0(str, 1, false);
                        iA1 = a0(str, 4, true);
                        iA2 = a0(str, 7, true);
                    } else {
                        throw new C21241("Invalid ID for ZoneOffset, invalid format: ".concat(str));
                    }
                    cCharAt = str.charAt(0);
                    if (cCharAt == '+' && cCharAt != '-') {
                        throw new C21241("Invalid ID for ZoneOffset, plus/minus not found when expected: ".concat(str));
                    }
                    if (cCharAt == '-') {
                        return Z(-iA0, -iA1, -iA2);
                    }
                    return Z(iA0, iA1, iA2);
                }
            }
            iA2 = 0;
            cCharAt = str.charAt(0);
            if (cCharAt == '+') {
            }
            if (cCharAt == '-') {
                return Z(-iA0, -iA1, -iA2);
            }
            return Z(iA0, iA1, iA2);
        }
        iA0 = a0(str, 1, false);
        iA1 = 0;
        iA2 = 0;
        cCharAt = str.charAt(0);
        if (cCharAt == '+') {
        }
        if (cCharAt == '-') {
            return Z(-iA0, -iA1, -iA2);
        }
        return Z(iA0, iA1, iA2);
    }

    @Override // l.AbstractC22338
    public final C21307 S() {
        C17359.requireNonNull(this, "offset");
        return new C21307(this);
    }

    public static int a0(CharSequence charSequence, int i, boolean z) {
        if (z) {
            String str = (String) charSequence;
            if (str.charAt(i - 1) != ':') {
                throw new C21241("Invalid ID for ZoneOffset, colon not found when expected: " + ((Object) str));
            }
        }
        String str2 = (String) charSequence;
        char cCharAt = str2.charAt(i);
        char cCharAt2 = str2.charAt(i + 1);
        if (cCharAt >= '0' && cCharAt <= '9' && cCharAt2 >= '0' && cCharAt2 <= '9') {
            return (cCharAt2 - '0') + ((cCharAt - '0') * 10);
        }
        throw new C21241("Invalid ID for ZoneOffset, non numeric characters found: " + ((Object) str2));
    }

    public static C11149 X(InterfaceC9437 interfaceC9437) {
        C17359.requireNonNull(interfaceC9437, "temporal");
        C11149 c11149 = (C11149) interfaceC9437.P(AbstractC17577.d);
        if (c11149 != null) {
            return c11149;
        }
        throw new C21241("Unable to obtain ZoneOffset from TemporalAccessor: " + interfaceC9437 + " of type " + interfaceC9437.getClass().getName());
    }

    public static C11149 Z(int i, int i2, int i3) {
        if (i < -18 || i > 18) {
            throw new C21241("Zone offset hours not in valid range: value " + i + " is not in the range -18 to 18");
        }
        if (i > 0) {
            if (i2 < 0 || i3 < 0) {
                throw new C21241("Zone offset minutes and seconds must be positive because hours is positive");
            }
        } else if (i < 0) {
            if (i2 > 0 || i3 > 0) {
                throw new C21241("Zone offset minutes and seconds must be negative because hours is negative");
            }
        } else if ((i2 > 0 && i3 < 0) || (i2 < 0 && i3 > 0)) {
            throw new C21241("Zone offset minutes and seconds must have the same sign");
        }
        if (i2 < -59 || i2 > 59) {
            throw new C21241("Zone offset minutes not in valid range: value " + i2 + " is not in the range -59 to 59");
        }
        if (i3 < -59 || i3 > 59) {
            throw new C21241("Zone offset seconds not in valid range: value " + i3 + " is not in the range -59 to 59");
        }
        if (Math.abs(i) != 18 || (i2 | i3) == 0) {
            return ofTotalSeconds((i2 * 60) + (i * 3600) + i3);
        }
        throw new C21241("Zone offset not in valid range: -18:00 to +18:00");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C11149 ofTotalSeconds(int i) {
        if (i < -64800 || i > 64800) {
            throw new C21241("Zone offset not in valid range: -18:00 to +18:00");
        }
        if (i % EnumC5810.f19974 == 0) {
            Integer numValueOf = Integer.valueOf(i);
            ConcurrentMapC17249 concurrentMapC17249 = d;
            C11149 c11149 = (C11149) concurrentMapC17249.get(numValueOf);
            if (c11149 != null) {
                return c11149;
            }
            concurrentMapC17249.putIfAbsent(numValueOf, new C11149(i));
            C11149 c111410 = (C11149) concurrentMapC17249.get(numValueOf);
            e.putIfAbsent(c111410.c, c111410);
            return c111410;
        }
        return new C11149(i);
    }

    public C11149(int i) {
        String string;
        this.b = i;
        if (i == 0) {
            string = "Z";
        } else {
            int iAbs = Math.abs(i);
            StringBuilder sb = new StringBuilder();
            int i2 = iAbs / 3600;
            int i3 = (iAbs / 60) % 60;
            sb.append(i < 0 ? "-" : BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX);
            sb.append(i2 < 10 ? "0" : "");
            sb.append(i2);
            sb.append(i3 < 10 ? ":0" : ":");
            sb.append(i3);
            int i4 = iAbs % 60;
            if (i4 != 0) {
                sb.append(i4 < 10 ? ":0" : ":");
                sb.append(i4);
            }
            string = sb.toString();
        }
        this.c = string;
    }

    public int getTotalSeconds() {
        return this.b;
    }

    @Override // l.AbstractC22338
    public final String getId() {
        return this.c;
    }

    @Override // l.InterfaceC9437
    public final boolean d(InterfaceC16831 interfaceC16831) {
        if (interfaceC16831 instanceof EnumC8692) {
            return interfaceC16831 == EnumC8692.OFFSET_SECONDS;
        }
        return interfaceC16831 != null && interfaceC16831.i(this);
    }

    @Override // l.InterfaceC9437
    public final C23545 k(InterfaceC16831 interfaceC16831) {
        return AbstractC17577.d(this, interfaceC16831);
    }

    @Override // l.InterfaceC9437
    public final int i(InterfaceC16831 interfaceC16831) {
        if (interfaceC16831 == EnumC8692.OFFSET_SECONDS) {
            return this.b;
        }
        if (interfaceC16831 instanceof EnumC8692) {
            throw new C16085(AbstractC15624.a("Unsupported field: ", interfaceC16831));
        }
        return AbstractC17577.d(this, interfaceC16831).a(C(interfaceC16831), interfaceC16831);
    }

    @Override // l.InterfaceC9437
    public final long C(InterfaceC16831 interfaceC16831) {
        if (interfaceC16831 == EnumC8692.OFFSET_SECONDS) {
            return this.b;
        }
        if (interfaceC16831 instanceof EnumC8692) {
            throw new C16085(AbstractC15624.a("Unsupported field: ", interfaceC16831));
        }
        return interfaceC16831.z(this);
    }

    @Override // l.InterfaceC9437
    public final Object P(C14435 c14435) {
        return (c14435 == AbstractC17577.d || c14435 == AbstractC17577.e) ? this : AbstractC17577.c(this, c14435);
    }

    @Override // l.InterfaceC1916
    public final InterfaceC1235 p(InterfaceC1235 interfaceC1235) {
        return interfaceC1235.b(this.b, EnumC8692.OFFSET_SECONDS);
    }

    @Override // l.AbstractC22338
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C11149) && this.b == ((C11149) obj).b;
    }

    @Override // l.AbstractC22338
    public final int hashCode() {
        return this.b;
    }

    @Override // l.AbstractC22338
    public final String toString() {
        return this.c;
    }

    private Object writeReplace() {
        return new C21372((byte) 8, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // l.AbstractC22338
    public final void W(DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(8);
        c0(dataOutput);
    }

    public final void c0(DataOutput dataOutput) throws IOException {
        int i = this.b;
        int i2 = i % EnumC5810.f19974 == 0 ? i / EnumC5810.f19974 : 127;
        dataOutput.writeByte(i2);
        if (i2 == 127) {
            dataOutput.writeInt(i);
        }
    }

    public static C11149 b0(DataInput dataInput) throws IOException {
        byte b = dataInput.readByte();
        return b == 127 ? ofTotalSeconds(dataInput.readInt()) : ofTotalSeconds(b * 900);
    }
}
