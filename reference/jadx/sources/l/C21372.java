package l;

import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;

/* JADX INFO: renamed from: l.᩶ܳۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21372 implements Externalizable {
    public static final long serialVersionUID = -7683839454370182990L;
    public byte a;
    public Object b;

    public C21372() {
    }

    public C21372(byte b, Object obj) {
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
                C18257 c18257 = (C18257) obj;
                objectOutput.writeLong(c18257.a);
                objectOutput.writeInt(c18257.b);
                return;
            case 2:
                C0358 c0358 = (C0358) obj;
                objectOutput.writeLong(c0358.a);
                objectOutput.writeInt(c0358.b);
                return;
            case 3:
                C7816 c7816 = (C7816) obj;
                objectOutput.writeInt(c7816.a);
                objectOutput.writeByte(c7816.b);
                objectOutput.writeByte(c7816.c);
                return;
            case 4:
                ((C10052) obj).g0(objectOutput);
                return;
            case 5:
                C19003 c19003 = (C19003) obj;
                C7816 c7817 = c19003.a;
                objectOutput.writeInt(c7817.a);
                objectOutput.writeByte(c7817.b);
                objectOutput.writeByte(c7817.c);
                c19003.b.g0(objectOutput);
                return;
            case 6:
                C23084 c23084 = (C23084) obj;
                C19003 c19004 = c23084.a;
                C7816 c7818 = c19004.a;
                objectOutput.writeInt(c7818.a);
                objectOutput.writeByte(c7818.b);
                objectOutput.writeByte(c7818.c);
                c19004.b.g0(objectOutput);
                c23084.b.c0(objectOutput);
                c23084.c.W(objectOutput);
                return;
            case 7:
                objectOutput.writeUTF(((C7947) obj).b);
                return;
            case 8:
                ((C11149) obj).c0(objectOutput);
                return;
            case 9:
                C2595 c2595 = (C2595) obj;
                c2595.a.g0(objectOutput);
                c2595.b.c0(objectOutput);
                return;
            case 10:
                C9306 c9306 = (C9306) obj;
                C19003 c19005 = c9306.a;
                C7816 c7819 = c19005.a;
                objectOutput.writeInt(c7819.a);
                objectOutput.writeByte(c7819.b);
                objectOutput.writeByte(c7819.c);
                c19005.b.g0(objectOutput);
                c9306.b.c0(objectOutput);
                return;
            case 11:
                objectOutput.writeInt(((C13781) obj).a);
                return;
            case 12:
                C5184 c5184 = (C5184) obj;
                objectOutput.writeInt(c5184.a);
                objectOutput.writeByte(c5184.b);
                return;
            case 13:
                C1104 c1104 = (C1104) obj;
                objectOutput.writeByte(c1104.a);
                objectOutput.writeByte(c1104.b);
                return;
            case 14:
                C8561 c8561 = (C8561) obj;
                objectOutput.writeInt(c8561.a);
                objectOutput.writeInt(c8561.b);
                objectOutput.writeInt(c8561.c);
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
                C18257 c18257 = C18257.ZERO;
                return C18257.ofSeconds(objectInput.readLong(), objectInput.readInt());
            case 2:
                C0358 c0358 = C0358.EPOCH;
                return C0358.ofEpochSecond(objectInput.readLong(), objectInput.readInt());
            case 3:
                C7816 c7816 = C7816.d;
                return C7816.of(objectInput.readInt(), objectInput.readByte(), objectInput.readByte());
            case 4:
                return C10052.b0(objectInput);
            case 5:
                C19003 c19003 = C19003.c;
                C7816 c7817 = C7816.d;
                return C19003.of(C7816.of(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), C10052.b0(objectInput));
            case 6:
                C19003 c19004 = C19003.c;
                C7816 c7818 = C7816.d;
                C19003 c19003Of = C19003.of(C7816.of(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), C10052.b0(objectInput));
                C11149 c11149B0 = C11149.b0(objectInput);
                AbstractC22338 abstractC22338 = (AbstractC22338) a(objectInput.readByte(), objectInput);
                C17359.requireNonNull(c19003Of, "localDateTime");
                C17359.requireNonNull(c11149B0, "offset");
                C17359.requireNonNull(abstractC22338, "zone");
                if (!(abstractC22338 instanceof C11149) || c11149B0.equals(abstractC22338)) {
                    return new C23084(c19003Of, c11149B0, abstractC22338);
                }
                throw new IllegalArgumentException("ZoneId must match ZoneOffset");
            case 7:
                int i = C7947.d;
                return AbstractC22338.T(objectInput.readUTF(), false);
            case 8:
                return C11149.b0(objectInput);
            case 9:
                int i2 = C2595.c;
                return C2595.of(C10052.b0(objectInput), C11149.b0(objectInput));
            case 10:
                int i3 = C9306.c;
                C7816 c7819 = C7816.d;
                return C9306.of(C19003.of(C7816.of(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), C10052.b0(objectInput)), C11149.b0(objectInput));
            case 11:
                int i4 = C13781.b;
                return C13781.of(objectInput.readInt());
            case 12:
                int i5 = C5184.c;
                return C5184.of(objectInput.readInt(), objectInput.readByte());
            case 13:
                int i6 = C1104.c;
                return C1104.of(objectInput.readByte(), objectInput.readByte());
            case 14:
                C8561 c8561 = C8561.d;
                return C8561.of(objectInput.readInt(), objectInput.readInt(), objectInput.readInt());
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
    }

    private Object readResolve() {
        return this.b;
    }
}
