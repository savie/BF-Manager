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

/* JADX INFO: renamed from: l.ۨ۫ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12356 implements Externalizable {
    public static final long serialVersionUID = -8885321777449118786L;
    public byte a;
    public Object b;

    public C12356() {
    }

    public C12356(byte b, Object obj) {
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
                C6391 c6391 = (C6391) obj;
                c(c6391.a, objectOutput);
                d(c6391.c, objectOutput);
                d(c6391.d, objectOutput);
                return;
            }
            if (b == 3) {
                ((C14593) obj).b(objectOutput);
                return;
            } else {
                if (b != 100) {
                    throw new InvalidClassException("Unknown serialized type");
                }
                objectOutput.writeUTF(((C21307) obj).g.getID());
                return;
            }
        }
        C21307 c21307 = (C21307) obj;
        objectOutput.writeInt(c21307.a.length);
        for (long j : c21307.a) {
            c(j, objectOutput);
        }
        for (C11149 c11149 : c21307.b) {
            d(c11149, objectOutput);
        }
        objectOutput.writeInt(c21307.c.length);
        for (long j2 : c21307.c) {
            c(j2, objectOutput);
        }
        for (C11149 c111410 : c21307.e) {
            d(c111410, objectOutput);
        }
        objectOutput.writeByte(c21307.f.length);
        for (C14593 c14593 : c21307.f) {
            c14593.b(objectOutput);
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        Object c21307;
        byte b = objectInput.readByte();
        this.a = b;
        if (b == 1) {
            long[] jArr = C21307.i;
            int i = objectInput.readInt();
            long[] jArr2 = i == 0 ? jArr : new long[i];
            for (int i2 = 0; i2 < i; i2++) {
                jArr2[i2] = a(objectInput);
            }
            int i3 = i + 1;
            C11149[] c11149Arr = new C11149[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                c11149Arr[i4] = b(objectInput);
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
            C11149[] c11149Arr2 = new C11149[i7];
            for (int i8 = 0; i8 < i7; i8++) {
                c11149Arr2[i8] = b(objectInput);
            }
            int i9 = objectInput.readByte();
            C14593[] c14593Arr = i9 == 0 ? C21307.j : new C14593[i9];
            for (int i10 = 0; i10 < i9; i10++) {
                c14593Arr[i10] = C14593.a(objectInput);
            }
            c21307 = new C21307(jArr2, c11149Arr, jArr3, c11149Arr2, c14593Arr);
        } else if (b == 2) {
            int i11 = C6391.e;
            long jA = a(objectInput);
            C11149 c11149B = b(objectInput);
            C11149 c11149B2 = b(objectInput);
            if (c11149B.equals(c11149B2)) {
                throw new IllegalArgumentException("Offsets must not be equal");
            }
            c21307 = new C6391(jA, c11149B, c11149B2);
        } else if (b == 3) {
            c21307 = C14593.a(objectInput);
        } else {
            if (b != 100) {
                throw new StreamCorruptedException("Unknown serialized type");
            }
            c21307 = new C21307(TimeZone.getTimeZone(objectInput.readUTF()));
        }
        this.b = c21307;
    }

    private Object readResolve() {
        return this.b;
    }

    public static void d(C11149 c11149, DataOutput dataOutput) throws IOException {
        int totalSeconds = c11149.getTotalSeconds();
        int i = totalSeconds % EnumC5810.f19974 == 0 ? totalSeconds / EnumC5810.f19974 : 127;
        dataOutput.writeByte(i);
        if (i == 127) {
            dataOutput.writeInt(totalSeconds);
        }
    }

    public static C11149 b(DataInput dataInput) throws IOException {
        byte b = dataInput.readByte();
        return b == 127 ? C11149.ofTotalSeconds(dataInput.readInt()) : C11149.ofTotalSeconds(b * 900);
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
}
