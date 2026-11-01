package l;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;
import java.util.TimeZone;

/* JADX INFO: renamed from: l.֨ܿᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1267 implements Externalizable {
    public static final long serialVersionUID = -8885321777449118786L;
    public byte a;
    public Object b;

    public C1267() {
    }

    public C1267(byte b, Object obj) {
        this.a = b;
        this.b = obj;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b = this.a;
        Object obj = this.b;
        objectOutput.writeByte(b);
        if (b != 1) {
            if (b == 2) {
                C13263 c13263 = (C13263) obj;
                c(c13263.a, objectOutput);
                d(c13263.c, objectOutput);
                d(c13263.d, objectOutput);
                return;
            }
            if (b == 3) {
                ((C23141) obj).b(objectOutput);
                return;
            } else {
                if (b != 100) {
                    throw new InvalidClassException("Unknown serialized type");
                }
                objectOutput.writeUTF(((C15380) obj).g.getID());
                return;
            }
        }
        C15380 c15380 = (C15380) obj;
        objectOutput.writeInt(c15380.a.length);
        for (long j : c15380.a) {
            c(j, objectOutput);
        }
        for (C2678 c2678 : c15380.b) {
            d(c2678, objectOutput);
        }
        objectOutput.writeInt(c15380.c.length);
        for (long j2 : c15380.c) {
            c(j2, objectOutput);
        }
        for (C2678 c2679 : c15380.e) {
            d(c2679, objectOutput);
        }
        objectOutput.writeByte(c15380.f.length);
        for (C23141 c23141 : c15380.f) {
            c23141.b(objectOutput);
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        Object c15380;
        byte b = objectInput.readByte();
        this.a = b;
        if (b == 1) {
            long[] jArr = C15380.i;
            int i = objectInput.readInt();
            long[] jArr2 = i == 0 ? jArr : new long[i];
            for (int i2 = 0; i2 < i; i2++) {
                jArr2[i2] = a(objectInput);
            }
            int i3 = i + 1;
            C2678[] c2678Arr = new C2678[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                c2678Arr[i4] = b(objectInput);
            }
            int i5 = objectInput.readInt();
            if (i5 != 0) {
                jArr = new long[i5];
            }
            long[] jArr3 = jArr;
            for (int i6 = 0; i6 < i5; i6++) {
                jArr3[i6] = a(objectInput);
            }
            int i7 = i5 + 1;
            C2678[] c2678Arr2 = new C2678[i7];
            for (int i8 = 0; i8 < i7; i8++) {
                c2678Arr2[i8] = b(objectInput);
            }
            int i9 = objectInput.readByte();
            C23141[] c23141Arr = i9 == 0 ? C15380.j : new C23141[i9];
            for (int i10 = 0; i10 < i9; i10++) {
                c23141Arr[i10] = C23141.a(objectInput);
            }
            c15380 = new C15380(jArr2, c2678Arr, jArr3, c2678Arr2, c23141Arr);
        } else if (b == 2) {
            int i11 = C13263.e;
            long jA = a(objectInput);
            C2678 c2678B = b(objectInput);
            C2678 c2678B2 = b(objectInput);
            if (c2678B.equals(c2678B2)) {
                throw new IllegalArgumentException("Offsets must not be equal");
            }
            c15380 = new C13263(jA, c2678B, c2678B2);
        } else if (b == 3) {
            c15380 = C23141.a(objectInput);
        } else {
            if (b != 100) {
                throw new StreamCorruptedException("Unknown serialized type");
            }
            c15380 = new C15380(TimeZone.getTimeZone(objectInput.readUTF()));
        }
        this.b = c15380;
    }

    private Object readResolve() {
        return this.b;
    }

    public static C2678 b(DataInput dataInput) throws IOException {
        byte b = dataInput.readByte();
        return b == 127 ? C2678.e0(dataInput.readInt()) : C2678.e0(b * 900);
    }

    public static void c(long j, DataOutput dataOutput) throws IOException {
        if (j >= -4575744000L && j < 10413792000L && j % 900 == 0) {
            int i = (int) ((j + 4575744000L) / 900);
            dataOutput.writeByte((i >>> 16) & 255);
            dataOutput.writeByte((i >>> 8) & 255);
            dataOutput.writeByte(i & 255);
            return;
        }
        dataOutput.writeByte(255);
        dataOutput.writeLong(j);
    }

    public static long a(DataInput dataInput) {
        int i = dataInput.readByte() & 255;
        if (i == 255) {
            return dataInput.readLong();
        }
        return (((long) (((i << 16) + ((dataInput.readByte() & 255) << 8)) + (dataInput.readByte() & 255))) * 900) - 4575744000L;
    }

    public static void d(C2678 c2678, DataOutput dataOutput) throws IOException {
        int i = c2678.b;
        int i2 = i % EnumC12167.f40710 == 0 ? i / EnumC12167.f40710 : 127;
        dataOutput.writeByte(i2);
        if (i2 == 127) {
            dataOutput.writeInt(i);
        }
    }
}
