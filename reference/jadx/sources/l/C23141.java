package l;

import com.alipay.sdk.m.p.a;
import com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate;
import com.umeng.analytics.pro.bo;
import com.umeng.analytics.pro.cb;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.᩺ܿᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public final class C23141 implements Serializable {
    public static final long serialVersionUID = 6889046316657758795L;
    public final EnumC13824 a;
    public final byte b;
    public final EnumC16169 c;
    public final C3363 d;
    public final boolean e;
    public final EnumC6912 f;
    public final C2678 g;
    public final C2678 h;
    public final C2678 i;

    public C23141(EnumC13824 enumC13824, int i, EnumC16169 enumC16169, C3363 c3363, boolean z, EnumC6912 enumC6912, C2678 c2678, C2678 c2679, C2678 c26710) {
        this.a = enumC13824;
        this.b = (byte) i;
        this.c = enumC16169;
        this.d = c3363;
        this.e = z;
        this.f = enumC6912;
        this.g = c2678;
        this.h = c2679;
        this.i = c26710;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C1267((byte) 3, this);
    }

    public final void b(DataOutput dataOutput) {
        byte b;
        int iI0 = this.e ? 86400 : this.d.i0();
        int i = this.g.b;
        int i2 = this.h.b - i;
        int i3 = this.i.b - i;
        if (iI0 % 3600 == 0) {
            b = this.e ? (byte) 24 : this.d.a;
        } else {
            b = bo.j;
        }
        int i4 = i % EnumC12167.f40710 == 0 ? (i / EnumC12167.f40710) + 128 : 255;
        int i5 = (i2 == 0 || i2 == 1800 || i2 == 3600) ? i2 / LinearIndeterminateDisjointAnimatorDelegate.TOTAL_DURATION_IN_MS : 3;
        int i6 = (i3 == 0 || i3 == 1800 || i3 == 3600) ? i3 / LinearIndeterminateDisjointAnimatorDelegate.TOTAL_DURATION_IN_MS : 3;
        EnumC16169 enumC16169 = this.c;
        dataOutput.writeInt((this.a.getValue() << 28) + ((this.b + UTF8.S_CS3) << 22) + ((enumC16169 == null ? 0 : enumC16169.getValue()) << 19) + (b << cb.f77931l) + (this.f.ordinal() << 12) + (i4 << 4) + (i5 << 2) + i6);
        if (b == 31) {
            dataOutput.writeInt(iI0);
        }
        if (i4 == 255) {
            dataOutput.writeInt(i);
        }
        if (i5 == 3) {
            dataOutput.writeInt(this.h.b);
        }
        if (i6 == 3) {
            dataOutput.writeInt(this.i.b);
        }
    }

    public static C23141 a(DataInput dataInput) {
        C3363 c3363W;
        int i;
        int i2;
        int i3 = dataInput.readInt();
        EnumC13824 enumC13824Y = EnumC13824.Y(i3 >>> 28);
        int i4 = ((264241152 & i3) >>> 22) - 32;
        int i5 = (3670016 & i3) >>> 19;
        EnumC16169 enumC16169V = i5 == 0 ? null : EnumC16169.V(i5);
        int i6 = (507904 & i3) >>> 14;
        EnumC6912 enumC6912 = EnumC6912.values()[(i3 & 12288) >>> 12];
        int i7 = (i3 & 4080) >>> 4;
        int i8 = (i3 & 12) >>> 2;
        int i9 = i3 & 3;
        if (i6 == 31) {
            long j = dataInput.readInt();
            C3363 c3363 = C3363.e;
            EnumC18762.SECOND_OF_DAY.T(j);
            int i10 = (int) (j / 3600);
            long j2 = j - ((long) (i10 * 3600));
            int i11 = (int) (j2 / 60);
            c3363W = C3363.W(i10, i11, (int) (j2 - ((long) (i11 * 60))), 0);
        } else {
            int i12 = i6 % 24;
            C3363 c3364 = C3363.e;
            EnumC18762.HOUR_OF_DAY.T(i12);
            c3363W = C3363.h[i12];
        }
        C2678 c2678E0 = C2678.e0(i7 == 255 ? dataInput.readInt() : (i7 + a.g) * EnumC12167.f40710);
        if (i8 == 3) {
            i = dataInput.readInt();
        } else {
            i = (i8 * LinearIndeterminateDisjointAnimatorDelegate.TOTAL_DURATION_IN_MS) + c2678E0.b;
        }
        C2678 c2678E1 = C2678.e0(i);
        if (i9 == 3) {
            i2 = dataInput.readInt();
        } else {
            i2 = c2678E0.b + (i9 * LinearIndeterminateDisjointAnimatorDelegate.TOTAL_DURATION_IN_MS);
        }
        C2678 c2678E2 = C2678.e0(i2);
        boolean z = i6 == 24;
        C13638.requireNonNull(enumC13824Y, "month");
        C13638.requireNonNull(c3363W, "time");
        C13638.requireNonNull(enumC6912, "timeDefnition");
        C13638.requireNonNull(c2678E0, "standardOffset");
        C13638.requireNonNull(c2678E1, "offsetBefore");
        C13638.requireNonNull(c2678E2, "offsetAfter");
        if (i4 < -28 || i4 > 31 || i4 == 0) {
            throw new IllegalArgumentException("Day of month indicator must be between -28 and 31 inclusive excluding zero");
        }
        if (z && !c3363W.equals(C3363.g)) {
            throw new IllegalArgumentException("Time must be midnight when end of day flag is true");
        }
        if (c3363W.d != 0) {
            throw new IllegalArgumentException("Time's nano-of-second must be zero");
        }
        return new C23141(enumC13824Y, i4, enumC16169V, c3363W, z, enumC6912, c2678E0, c2678E1, c2678E2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C23141) {
            C23141 c23141 = (C23141) obj;
            if (this.a == c23141.a && this.b == c23141.b && this.c == c23141.c && this.f == c23141.f && this.d.equals(c23141.d) && this.e == c23141.e && this.g.equals(c23141.g) && this.h.equals(c23141.h) && this.i.equals(c23141.i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iI0 = ((this.d.i0() + (this.e ? 1 : 0)) << 15) + (this.a.ordinal() << 11) + ((this.b + UTF8.S_CS3) << 5);
        EnumC16169 enumC16169 = this.c;
        return ((this.g.b ^ (this.f.ordinal() + (iI0 + ((enumC16169 == null ? 7 : enumC16169.ordinal()) << 2)))) ^ this.h.b) ^ this.i.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransitionRule[");
        sb.append(this.i.b - this.h.b > 0 ? "Gap " : "Overlap ");
        sb.append(this.h);
        sb.append(" to ");
        sb.append(this.i);
        sb.append(", ");
        EnumC16169 enumC16169 = this.c;
        if (enumC16169 != null) {
            byte b = this.b;
            if (b == -1) {
                sb.append(enumC16169.name());
                sb.append(" on or before last day of ");
                sb.append(this.a.name());
            } else if (b < 0) {
                sb.append(enumC16169.name());
                sb.append(" on or before last day minus ");
                sb.append((-this.b) - 1);
                sb.append(" of ");
                sb.append(this.a.name());
            } else {
                sb.append(enumC16169.name());
                sb.append(" on or after ");
                sb.append(this.a.name());
                sb.append(' ');
                sb.append((int) this.b);
            }
        } else {
            sb.append(this.a.name());
            sb.append(' ');
            sb.append((int) this.b);
        }
        sb.append(" at ");
        sb.append(this.e ? "24:00" : this.d.toString());
        sb.append(" ");
        sb.append(this.f);
        sb.append(", standard offset ");
        sb.append(this.g);
        sb.append(']');
        return sb.toString();
    }
}
