package l;

import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;

/* JADX INFO: renamed from: l.ۘ۫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3944 implements Externalizable {
    public static final long serialVersionUID = -7683839454370182990L;
    public byte a;
    public Object b;

    public C3944() {
    }

    public C3944(byte b, Object obj) {
        this.a = b;
        this.b = obj;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b = this.a;
        Object obj = this.b;
        objectOutput.writeByte(b);
        switch (b) {
            case 1:
                C21813 c21813 = (C21813) obj;
                objectOutput.writeLong(c21813.a);
                objectOutput.writeInt(c21813.b);
                return;
            case 2:
                C18285 c18285 = (C18285) obj;
                objectOutput.writeLong(c18285.a);
                objectOutput.writeInt(c18285.b);
                return;
            case 3:
                C18991 c18991 = (C18991) obj;
                objectOutput.writeInt(c18991.a);
                objectOutput.writeByte(c18991.b);
                objectOutput.writeByte(c18991.c);
                return;
            case 4:
                ((C3363) obj).l0(objectOutput);
                return;
            case 5:
                C1952 c1952 = (C1952) obj;
                C18991 c18992 = c1952.a;
                objectOutput.writeInt(c18992.a);
                objectOutput.writeByte(c18992.b);
                objectOutput.writeByte(c18992.c);
                c1952.b.l0(objectOutput);
                return;
            case 6:
                C10525 c10525 = (C10525) obj;
                C1952 c1953 = c10525.a;
                C18991 c18993 = c1953.a;
                objectOutput.writeInt(c18993.a);
                objectOutput.writeByte(c18993.b);
                objectOutput.writeByte(c18993.c);
                c1953.b.l0(objectOutput);
                c10525.b.h0(objectOutput);
                c10525.c.a0(objectOutput);
                return;
            case 7:
                objectOutput.writeUTF(((C5501) obj).b);
                return;
            case 8:
                ((C2678) obj).h0(objectOutput);
                return;
            case 9:
                C1122 c1122 = (C1122) obj;
                c1122.a.l0(objectOutput);
                c1122.b.h0(objectOutput);
                return;
            case 10:
                C8408 c8408 = (C8408) obj;
                C1952 c1954 = c8408.a;
                C18991 c18994 = c1954.a;
                objectOutput.writeInt(c18994.a);
                objectOutput.writeByte(c18994.b);
                objectOutput.writeByte(c18994.c);
                c1954.b.l0(objectOutput);
                c8408.b.h0(objectOutput);
                return;
            case 11:
                objectOutput.writeInt(((C4795) obj).a);
                return;
            case 12:
                C11852 c11852 = (C11852) obj;
                objectOutput.writeInt(c11852.a);
                objectOutput.writeByte(c11852.b);
                return;
            case 13:
                C2533 c2533 = (C2533) obj;
                objectOutput.writeByte(c2533.a);
                objectOutput.writeByte(c2533.b);
                return;
            case 14:
                C13118 c13118 = (C13118) obj;
                objectOutput.writeInt(c13118.a);
                objectOutput.writeInt(c13118.b);
                objectOutput.writeInt(c13118.c);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        byte b = objectInput.readByte();
        this.a = b;
        this.b = a(b, objectInput);
    }

    public static Object a(byte b, ObjectInput objectInput) throws IOException {
        switch (b) {
            case 1:
                C21813 c21813 = C21813.ZERO;
                return C21813.s(objectInput.readLong(), objectInput.readInt());
            case 2:
                C18285 c18285 = C18285.EPOCH;
                return C18285.ofEpochSecond(objectInput.readLong(), objectInput.readInt());
            case 3:
                C18991 c18991 = C18991.d;
                return C18991.h0(objectInput.readInt(), objectInput.readByte(), objectInput.readByte());
            case 4:
                return C3363.g0(objectInput);
            case 5:
                C1952 c1952 = C1952.c;
                C18991 c18992 = C18991.d;
                return C1952.Y(C18991.h0(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), C3363.g0(objectInput));
            case 6:
                C1952 c1953 = C1952.c;
                C18991 c18993 = C18991.d;
                C1952 c1952Y = C1952.Y(C18991.h0(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), C3363.g0(objectInput));
                C2678 c2678G0 = C2678.g0(objectInput);
                AbstractC9114 abstractC9114 = (AbstractC9114) a(objectInput.readByte(), objectInput);
                C13638.requireNonNull(c1952Y, "localDateTime");
                C13638.requireNonNull(c2678G0, "offset");
                C13638.requireNonNull(abstractC9114, "zone");
                if (!(abstractC9114 instanceof C2678) || c2678G0.equals(abstractC9114)) {
                    return new C10525(c1952Y, abstractC9114, c2678G0);
                }
                throw new IllegalArgumentException("ZoneId must match ZoneOffset");
            case 7:
                int i = C5501.d;
                return AbstractC9114.X(objectInput.readUTF(), false);
            case 8:
                return C2678.g0(objectInput);
            case 9:
                int i2 = C1122.c;
                return new C1122(C3363.g0(objectInput), C2678.g0(objectInput));
            case 10:
                int i3 = C8408.c;
                C18991 c18994 = C18991.d;
                return new C8408(C1952.Y(C18991.h0(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), C3363.g0(objectInput)), C2678.g0(objectInput));
            case 11:
                int i4 = C4795.b;
                return C4795.V(objectInput.readInt());
            case 12:
                int i5 = C11852.c;
                int i6 = objectInput.readInt();
                byte b2 = objectInput.readByte();
                EnumC18762.YEAR.T(i6);
                EnumC18762.MONTH_OF_YEAR.T(b2);
                return new C11852(i6, b2);
            case 13:
                int i7 = C2533.c;
                byte b3 = objectInput.readByte();
                byte b4 = objectInput.readByte();
                EnumC13824 enumC13824Y = EnumC13824.Y(b3);
                C13638.requireNonNull(enumC13824Y, "month");
                EnumC18762.DAY_OF_MONTH.T(b4);
                if (b4 <= enumC13824Y.X()) {
                    return new C2533(enumC13824Y.getValue(), b4);
                }
                throw new C15464("Illegal value for DayOfMonth field, value " + ((int) b4) + " is not valid for month " + enumC13824Y.name());
            case 14:
                C13118 c13118 = C13118.d;
                return C13118.a(objectInput.readInt(), objectInput.readInt(), objectInput.readInt());
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
    }

    private Object readResolve() {
        return this.b;
    }
}
