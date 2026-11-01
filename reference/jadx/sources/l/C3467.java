package l;

import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;

/* JADX INFO: renamed from: l.ۗ᩶ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3467 implements Externalizable {
    public static final long serialVersionUID = -6103370247208168577L;
    public byte a;
    public Object b;

    public C3467() {
    }

    public C3467(byte b, Object obj) {
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
                objectOutput.writeUTF(((AbstractC16874) obj).k());
                return;
            case 2:
                C11356 c11356 = (C11356) obj;
                objectOutput.writeObject(c11356.a);
                objectOutput.writeObject(c11356.b);
                return;
            case 3:
                C22645 c22645 = (C22645) obj;
                objectOutput.writeObject(c22645.a);
                objectOutput.writeObject(c22645.b);
                objectOutput.writeObject(c22645.c);
                return;
            case 4:
                C16295 c16295 = (C16295) obj;
                c16295.getClass();
                objectOutput.writeInt(AbstractC23702.a(c16295, EnumC18762.YEAR));
                objectOutput.writeByte(AbstractC23702.a(c16295, EnumC18762.MONTH_OF_YEAR));
                objectOutput.writeByte(AbstractC23702.a(c16295, EnumC18762.DAY_OF_MONTH));
                return;
            case 5:
                objectOutput.writeByte(((C12062) obj).a);
                return;
            case 6:
                C8534 c8534 = (C8534) obj;
                objectOutput.writeObject(c8534.a);
                objectOutput.writeInt(AbstractC23702.a(c8534, EnumC18762.YEAR));
                objectOutput.writeByte(AbstractC23702.a(c8534, EnumC18762.MONTH_OF_YEAR));
                objectOutput.writeByte(AbstractC23702.a(c8534, EnumC18762.DAY_OF_MONTH));
                return;
            case 7:
                C23930 c23930 = (C23930) obj;
                c23930.getClass();
                objectOutput.writeInt(AbstractC23702.a(c23930, EnumC18762.YEAR));
                objectOutput.writeByte(AbstractC23702.a(c23930, EnumC18762.MONTH_OF_YEAR));
                objectOutput.writeByte(AbstractC23702.a(c23930, EnumC18762.DAY_OF_MONTH));
                return;
            case 8:
                C12767 c12767 = (C12767) obj;
                c12767.getClass();
                objectOutput.writeInt(AbstractC23702.a(c12767, EnumC18762.YEAR));
                objectOutput.writeByte(AbstractC23702.a(c12767, EnumC18762.MONTH_OF_YEAR));
                objectOutput.writeByte(AbstractC23702.a(c12767, EnumC18762.DAY_OF_MONTH));
                return;
            case 9:
                C5005 c5005 = (C5005) obj;
                objectOutput.writeUTF(c5005.a.k());
                objectOutput.writeInt(c5005.b);
                objectOutput.writeInt(c5005.c);
                objectOutput.writeInt(c5005.d);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        Object objT;
        byte b = objectInput.readByte();
        this.a = b;
        switch (b) {
            case 1:
                ConcurrentMapC13783 concurrentMapC13783 = AbstractC16874.a;
                objT = AbstractC14884.t(objectInput.readUTF());
                break;
            case 2:
                objT = ((InterfaceC17579) objectInput.readObject()).I((C3363) objectInput.readObject());
                break;
            case 3:
                objT = ((InterfaceC9819) objectInput.readObject()).D((C2678) objectInput.readObject()).A((AbstractC9114) objectInput.readObject());
                break;
            case 4:
                C18991 c18991 = C16295.d;
                int i = objectInput.readInt();
                byte b2 = objectInput.readByte();
                byte b3 = objectInput.readByte();
                C19823.c.getClass();
                objT = new C16295(C18991.h0(i, b2, b3));
                break;
            case 5:
                C12062 c12062 = C12062.d;
                objT = C12062.o(objectInput.readByte());
                break;
            case 6:
                C7828 c7828 = (C7828) objectInput.readObject();
                int i2 = objectInput.readInt();
                byte b4 = objectInput.readByte();
                byte b5 = objectInput.readByte();
                c7828.getClass();
                objT = new C8534(c7828, i2, b4, b5);
                break;
            case 7:
                int i3 = objectInput.readInt();
                byte b6 = objectInput.readByte();
                byte b7 = objectInput.readByte();
                C12641.c.getClass();
                objT = new C23930(C18991.h0(i3 + 1911, b6, b7));
                break;
            case 8:
                int i4 = objectInput.readInt();
                byte b8 = objectInput.readByte();
                byte b9 = objectInput.readByte();
                C2182.c.getClass();
                objT = new C12767(C18991.h0(i4 - 543, b8, b9));
                break;
            case 9:
                int i5 = C5005.e;
                objT = new C5005(AbstractC14884.t(objectInput.readUTF()), objectInput.readInt(), objectInput.readInt(), objectInput.readInt());
                break;
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
        this.b = objT;
    }

    private Object readResolve() {
        return this.b;
    }
}
