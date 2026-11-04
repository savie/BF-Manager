package l;

import com.alipay.sdk.m.p.a;
import com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.ܰ۫ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14593 implements Serializable {
    public static final long serialVersionUID = 6889046316657758795L;
    public final EnumC6456 a;
    public final byte b;
    public final EnumC13387 c;
    public final C10052 d;
    public final boolean e;
    public final EnumC4153 f;
    public final C11149 g;
    public final C11149 h;
    public final C11149 i;

    public C14593(EnumC6456 enumC6456, int i, EnumC13387 enumC13387, C10052 c10052, boolean z, EnumC4153 enumC4153, C11149 c11149, C11149 c111410, C11149 c111411) {
        this.a = enumC6456;
        this.b = (byte) i;
        this.c = enumC13387;
        this.d = c10052;
        this.e = z;
        this.f = enumC4153;
        this.g = c11149;
        this.h = c111410;
        this.i = c111411;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C12356((byte) 3, this);
    }

    public final void b(DataOutput dataOutput) {
        int hour;
        int iD0 = this.e ? 86400 : this.d.d0();
        int totalSeconds = this.g.getTotalSeconds();
        int totalSeconds2 = this.h.getTotalSeconds() - totalSeconds;
        int totalSeconds3 = this.i.getTotalSeconds() - totalSeconds;
        if (iD0 % 3600 == 0) {
            hour = this.e ? 24 : this.d.getHour();
        } else {
            hour = 31;
        }
        int i = totalSeconds % EnumC5810.f19974 == 0 ? (totalSeconds / EnumC5810.f19974) + 128 : 255;
        int i2 = (totalSeconds2 == 0 || totalSeconds2 == 1800 || totalSeconds2 == 3600) ? totalSeconds2 / LinearIndeterminateDisjointAnimatorDelegate.TOTAL_DURATION_IN_MS : 3;
        int i3 = (totalSeconds3 == 0 || totalSeconds3 == 1800 || totalSeconds3 == 3600) ? totalSeconds3 / LinearIndeterminateDisjointAnimatorDelegate.TOTAL_DURATION_IN_MS : 3;
        EnumC13387 enumC13387 = this.c;
        dataOutput.writeInt((this.a.getValue() << 28) + ((this.b + UTF8.S_CS3) << 22) + ((enumC13387 == null ? 0 : enumC13387.getValue()) << 19) + (hour << 14) + (this.f.ordinal() << 12) + (i << 4) + (i2 << 2) + i3);
        if (hour == 31) {
            dataOutput.writeInt(iD0);
        }
        if (i == 255) {
            dataOutput.writeInt(totalSeconds);
        }
        if (i2 == 3) {
            dataOutput.writeInt(this.h.getTotalSeconds());
        }
        if (i3 == 3) {
            dataOutput.writeInt(this.i.getTotalSeconds());
        }
    }

    public static C14593 a(DataInput dataInput) {
        C10052 c10052S;
        int totalSeconds;
        int i = dataInput.readInt();
        EnumC6456 enumC6456U = EnumC6456.U(i >>> 28);
        int i2 = ((264241152 & i) >>> 22) - 32;
        int i3 = (3670016 & i) >>> 19;
        EnumC13387 enumC13387R = i3 == 0 ? null : EnumC13387.R(i3);
        int i4 = (507904 & i) >>> 14;
        EnumC4153 enumC4153 = EnumC4153.values()[(i & 12288) >>> 12];
        int i5 = (i & 4080) >>> 4;
        int i6 = (i & 12) >>> 2;
        int i7 = i & 3;
        if (i4 == 31) {
            long j = dataInput.readInt();
            C10052 c10052 = C10052.e;
            EnumC8692.SECOND_OF_DAY.P(j);
            int i8 = (int) (j / 3600);
            long j2 = j - ((long) (i8 * 3600));
            int i9 = (int) (j2 / 60);
            c10052S = C10052.S(i8, i9, (int) (j2 - ((long) (i9 * 60))), 0);
        } else {
            int i10 = i4 % 24;
            C10052 c10053 = C10052.e;
            EnumC8692.HOUR_OF_DAY.P(i10);
            c10052S = C10052.h[i10];
        }
        C11149 c11149OfTotalSeconds = C11149.ofTotalSeconds(i5 == 255 ? dataInput.readInt() : (i5 + a.g) * EnumC5810.f19974);
        if (i6 == 3) {
            totalSeconds = dataInput.readInt();
        } else {
            totalSeconds = (i6 * LinearIndeterminateDisjointAnimatorDelegate.TOTAL_DURATION_IN_MS) + c11149OfTotalSeconds.getTotalSeconds();
        }
        C11149 c11149OfTotalSeconds2 = C11149.ofTotalSeconds(totalSeconds);
        C11149 c11149OfTotalSeconds3 = C11149.ofTotalSeconds(i7 == 3 ? dataInput.readInt() : c11149OfTotalSeconds.getTotalSeconds() + (i7 * LinearIndeterminateDisjointAnimatorDelegate.TOTAL_DURATION_IN_MS));
        boolean z = i4 == 24;
        C17359.requireNonNull(enumC6456U, "month");
        C17359.requireNonNull(c10052S, "time");
        C17359.requireNonNull(enumC4153, "timeDefnition");
        C17359.requireNonNull(c11149OfTotalSeconds, "standardOffset");
        C17359.requireNonNull(c11149OfTotalSeconds2, "offsetBefore");
        C17359.requireNonNull(c11149OfTotalSeconds3, "offsetAfter");
        if (i2 < -28 || i2 > 31 || i2 == 0) {
            throw new IllegalArgumentException("Day of month indicator must be between -28 and 31 inclusive excluding zero");
        }
        if (z && !c10052S.equals(C10052.g)) {
            throw new IllegalArgumentException("Time must be midnight when end of day flag is true");
        }
        if (c10052S.getNano() != 0) {
            throw new IllegalArgumentException("Time's nano-of-second must be zero");
        }
        return new C14593(enumC6456U, i2, enumC13387R, c10052S, z, enumC4153, c11149OfTotalSeconds, c11149OfTotalSeconds2, c11149OfTotalSeconds3);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C14593) {
            C14593 c14593 = (C14593) obj;
            if (this.a == c14593.a && this.b == c14593.b && this.c == c14593.c && this.f == c14593.f && this.d.equals(c14593.d) && this.e == c14593.e && this.g.equals(c14593.g) && this.h.equals(c14593.h) && this.i.equals(c14593.i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iD0 = ((this.d.d0() + (this.e ? 1 : 0)) << 15) + (this.a.ordinal() << 11) + ((this.b + UTF8.S_CS3) << 5);
        EnumC13387 enumC13387 = this.c;
        return ((this.g.b ^ (this.f.ordinal() + (iD0 + ((enumC13387 == null ? 7 : enumC13387.ordinal()) << 2)))) ^ this.h.b) ^ this.i.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransitionRule[");
        C11149 c11149 = this.h;
        C11149 c111410 = this.i;
        c11149.getClass();
        sb.append(c111410.b - c11149.b > 0 ? "Gap " : "Overlap ");
        sb.append(this.h);
        sb.append(" to ");
        sb.append(this.i);
        sb.append(", ");
        EnumC13387 enumC13387 = this.c;
        if (enumC13387 != null) {
            byte b = this.b;
            if (b == -1) {
                sb.append(enumC13387.name());
                sb.append(" on or before last day of ");
                sb.append(this.a.name());
            } else if (b < 0) {
                sb.append(enumC13387.name());
                sb.append(" on or before last day minus ");
                sb.append((-this.b) - 1);
                sb.append(" of ");
                sb.append(this.a.name());
            } else {
                sb.append(enumC13387.name());
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
