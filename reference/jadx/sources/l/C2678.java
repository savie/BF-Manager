package l;

import com.google.android.material.badge.BadgeDrawable;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* JADX INFO: renamed from: l.ۖܿᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2678 extends AbstractC9114 implements InterfaceC21584, InterfaceC12413, Comparable {
    public static final ConcurrentMapC13783 d = new ConcurrentMapC13783(16, 0.75f, 4);
    public static final ConcurrentMapC13783 e = new ConcurrentMapC13783(16, 0.75f, 4);
    public static final C2678 f = e0(0);
    public static final C2678 g = e0(-64800);
    public static final C2678 h = e0(64800);
    public static final long serialVersionUID = 2357656521762053153L;
    public final int b;
    public final transient String c;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return ((C2678) obj).b - this.b;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x008e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:33:0x009f  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a7  */
    /* JADX WARN: Multi-variable type inference failed */
    public static C2678 c0(String str) {
        int iF0;
        int iF1;
        int iF2;
        char cCharAt;
        C13638.requireNonNull(str, "offsetId");
        C2678 c2678 = (C2678) e.get(str);
        if (c2678 != null) {
            return c2678;
        }
        int length = str.length();
        if (length == 2) {
            str = str.charAt(0) + "0" + str.charAt(1);
        } else {
            if (length != 3) {
                if (length == 5) {
                    iF0 = f0(str, 1, false);
                    iF1 = f0(str, 3, false);
                } else {
                    if (length == 6) {
                        iF0 = f0(str, 1, false);
                        iF1 = f0(str, 4, true);
                    } else if (length == 7) {
                        iF0 = f0(str, 1, false);
                        iF1 = f0(str, 3, false);
                        iF2 = f0(str, 5, false);
                    } else if (length == 9) {
                        iF0 = f0(str, 1, false);
                        iF1 = f0(str, 4, true);
                        iF2 = f0(str, 7, true);
                    } else {
                        throw new C15464("Invalid ID for ZoneOffset, invalid format: ".concat(str));
                    }
                    cCharAt = str.charAt(0);
                    if (cCharAt == '+' && cCharAt != '-') {
                        throw new C15464("Invalid ID for ZoneOffset, plus/minus not found when expected: ".concat(str));
                    }
                    if (cCharAt == '-') {
                        return d0(-iF0, -iF1, -iF2);
                    }
                    return d0(iF0, iF1, iF2);
                }
            }
            iF2 = 0;
            cCharAt = str.charAt(0);
            if (cCharAt == '+') {
            }
            if (cCharAt == '-') {
                return d0(-iF0, -iF1, -iF2);
            }
            return d0(iF0, iF1, iF2);
        }
        iF0 = f0(str, 1, false);
        iF1 = 0;
        iF2 = 0;
        cCharAt = str.charAt(0);
        if (cCharAt == '+') {
        }
        if (cCharAt == '-') {
            return d0(-iF0, -iF1, -iF2);
        }
        return d0(iF0, iF1, iF2);
    }

    @Override // l.AbstractC9114
    public final C15380 W() {
        C13638.requireNonNull(this, "offset");
        return new C15380(this);
    }

    public static int f0(CharSequence charSequence, int i, boolean z) {
        if (z) {
            String str = (String) charSequence;
            if (str.charAt(i - 1) != ':') {
                throw new C15464("Invalid ID for ZoneOffset, colon not found when expected: " + ((Object) str));
            }
        }
        String str2 = (String) charSequence;
        char cCharAt = str2.charAt(i);
        char cCharAt2 = str2.charAt(i + 1);
        if (cCharAt >= '0' && cCharAt <= '9' && cCharAt2 >= '0' && cCharAt2 <= '9') {
            return (cCharAt2 - '0') + ((cCharAt - '0') * 10);
        }
        throw new C15464("Invalid ID for ZoneOffset, non numeric characters found: " + ((Object) str2));
    }

    public static C2678 b0(InterfaceC21584 interfaceC21584) {
        C13638.requireNonNull(interfaceC21584, "temporal");
        C2678 c2678 = (C2678) interfaceC21584.T(AbstractC23702.d);
        if (c2678 != null) {
            return c2678;
        }
        throw new C15464("Unable to obtain ZoneOffset from TemporalAccessor: " + interfaceC21584 + " of type " + interfaceC21584.getClass().getName());
    }

    public static C2678 d0(int i, int i2, int i3) {
        if (i < -18 || i > 18) {
            throw new C15464("Zone offset hours not in valid range: value " + i + " is not in the range -18 to 18");
        }
        if (i > 0) {
            if (i2 < 0 || i3 < 0) {
                throw new C15464("Zone offset minutes and seconds must be positive because hours is positive");
            }
        } else if (i < 0) {
            if (i2 > 0 || i3 > 0) {
                throw new C15464("Zone offset minutes and seconds must be negative because hours is negative");
            }
        } else if ((i2 > 0 && i3 < 0) || (i2 < 0 && i3 > 0)) {
            throw new C15464("Zone offset minutes and seconds must have the same sign");
        }
        if (i2 < -59 || i2 > 59) {
            throw new C15464("Zone offset minutes not in valid range: value " + i2 + " is not in the range -59 to 59");
        }
        if (i3 < -59 || i3 > 59) {
            throw new C15464("Zone offset seconds not in valid range: value " + i3 + " is not in the range -59 to 59");
        }
        if (Math.abs(i) != 18 || (i2 | i3) == 0) {
            return e0((i2 * 60) + (i * 3600) + i3);
        }
        throw new C15464("Zone offset not in valid range: -18:00 to +18:00");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C2678 e0(int i) {
        if (i < -64800 || i > 64800) {
            throw new C15464("Zone offset not in valid range: -18:00 to +18:00");
        }
        if (i % EnumC12167.f40710 == 0) {
            Integer numValueOf = Integer.valueOf(i);
            ConcurrentMapC13783 concurrentMapC13783 = d;
            C2678 c2678 = (C2678) concurrentMapC13783.get(numValueOf);
            if (c2678 != null) {
                return c2678;
            }
            concurrentMapC13783.putIfAbsent(numValueOf, new C2678(i));
            C2678 c2679 = (C2678) concurrentMapC13783.get(numValueOf);
            e.putIfAbsent(c2679.c, c2679);
            return c2679;
        }
        return new C2678(i);
    }

    public C2678(int i) {
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

    @Override // l.AbstractC9114
    public final String k() {
        return this.c;
    }

    @Override // l.InterfaceC21584
    public final boolean e(InterfaceC11002 interfaceC11002) {
        if (interfaceC11002 instanceof EnumC18762) {
            return interfaceC11002 == EnumC18762.OFFSET_SECONDS;
        }
        return interfaceC11002 != null && interfaceC11002.l(this);
    }

    @Override // l.InterfaceC21584
    public final C1828 n(InterfaceC11002 interfaceC11002) {
        return AbstractC23702.d(this, interfaceC11002);
    }

    @Override // l.InterfaceC21584
    public final int l(InterfaceC11002 interfaceC11002) {
        if (interfaceC11002 == EnumC18762.OFFSET_SECONDS) {
            return this.b;
        }
        if (interfaceC11002 instanceof EnumC18762) {
            throw new C14530(AbstractC21107.a("Unsupported field: ", interfaceC11002));
        }
        return AbstractC23702.d(this, interfaceC11002).a(G(interfaceC11002), interfaceC11002);
    }

    @Override // l.InterfaceC21584
    public final long G(InterfaceC11002 interfaceC11002) {
        if (interfaceC11002 == EnumC18762.OFFSET_SECONDS) {
            return this.b;
        }
        if (interfaceC11002 instanceof EnumC18762) {
            throw new C14530(AbstractC21107.a("Unsupported field: ", interfaceC11002));
        }
        return interfaceC11002.C(this);
    }

    @Override // l.InterfaceC21584
    public final Object T(C22935 c22935) {
        return (c22935 == AbstractC23702.d || c22935 == AbstractC23702.e) ? this : AbstractC23702.c(this, c22935);
    }

    @Override // l.InterfaceC12413
    public final InterfaceC15235 s(InterfaceC15235 interfaceC15235) {
        return interfaceC15235.c(this.b, EnumC18762.OFFSET_SECONDS);
    }

    @Override // l.AbstractC9114
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2678) && this.b == ((C2678) obj).b;
    }

    @Override // l.AbstractC9114
    public final int hashCode() {
        return this.b;
    }

    @Override // l.AbstractC9114
    public final String toString() {
        return this.c;
    }

    private Object writeReplace() {
        return new C3944((byte) 8, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // l.AbstractC9114
    public final void a0(DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(8);
        h0(dataOutput);
    }

    public final void h0(DataOutput dataOutput) throws IOException {
        int i = this.b;
        int i2 = i % EnumC12167.f40710 == 0 ? i / EnumC12167.f40710 : 127;
        dataOutput.writeByte(i2);
        if (i2 == 127) {
            dataOutput.writeInt(i);
        }
    }

    public static C2678 g0(DataInput dataInput) throws IOException {
        byte b = dataInput.readByte();
        return b == 127 ? e0(dataInput.readInt()) : e0(b * 900);
    }
}
