package l;

import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;

/* JADX INFO: renamed from: l.ۛ᩸ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6676 implements Externalizable {
    public static final long serialVersionUID = -6103370247208168577L;
    public byte a;
    public Object b;

    public C6676() {
    }

    public C6676(byte b, Object obj) {
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
                objectOutput.writeUTF(((AbstractC11895) obj).getId());
                return;
            case 2:
                C14878 c14878 = (C14878) obj;
                objectOutput.writeObject(c14878.a);
                objectOutput.writeObject(c14878.b);
                return;
            case 3:
                C9657 c9657 = (C9657) obj;
                objectOutput.writeObject(c9657.a);
                objectOutput.writeObject(c9657.b);
                objectOutput.writeObject(c9657.c);
                return;
            case 4:
                C11807 c11807 = (C11807) obj;
                c11807.getClass();
                objectOutput.writeInt(AbstractC17577.a(c11807, EnumC8692.YEAR));
                objectOutput.writeByte(AbstractC17577.a(c11807, EnumC8692.MONTH_OF_YEAR));
                objectOutput.writeByte(AbstractC17577.a(c11807, EnumC8692.DAY_OF_MONTH));
                return;
            case 5:
                objectOutput.writeByte(((C25234) obj).a);
                return;
            case 6:
                C11061 c11061 = (C11061) obj;
                objectOutput.writeObject(c11061.a);
                objectOutput.writeInt(AbstractC17577.a(c11061, EnumC8692.YEAR));
                objectOutput.writeByte(AbstractC17577.a(c11061, EnumC8692.MONTH_OF_YEAR));
                objectOutput.writeByte(AbstractC17577.a(c11061, EnumC8692.DAY_OF_MONTH));
                return;
            case 7:
                C23830 c23830 = (C23830) obj;
                c23830.getClass();
                objectOutput.writeInt(AbstractC17577.a(c23830, EnumC8692.YEAR));
                objectOutput.writeByte(AbstractC17577.a(c23830, EnumC8692.MONTH_OF_YEAR));
                objectOutput.writeByte(AbstractC17577.a(c23830, EnumC8692.DAY_OF_MONTH));
                return;
            case 8:
                C19354 c19354 = (C19354) obj;
                c19354.getClass();
                objectOutput.writeInt(AbstractC17577.a(c19354, EnumC8692.YEAR));
                objectOutput.writeByte(AbstractC17577.a(c19354, EnumC8692.MONTH_OF_YEAR));
                objectOutput.writeByte(AbstractC17577.a(c19354, EnumC8692.DAY_OF_MONTH));
                return;
            case 9:
                C18608 c18608 = (C18608) obj;
                objectOutput.writeUTF(c18608.a.getId());
                objectOutput.writeInt(c18608.b);
                objectOutput.writeInt(c18608.c);
                objectOutput.writeInt(c18608.d);
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
                ConcurrentMapC17249 concurrentMapC17249 = AbstractC11895.a;
                objT = AbstractC2946.t(objectInput.readUTF());
                break;
            case 2:
                objT = ((InterfaceC17116) objectInput.readObject()).E((C10052) objectInput.readObject());
                break;
            case 3:
                objT = ((InterfaceC12641) objectInput.readObject()).A((C11149) objectInput.readObject()).x((AbstractC22338) objectInput.readObject());
                break;
            case 4:
                C7816 c7816 = C11807.d;
                int i = objectInput.readInt();
                byte b2 = objectInput.readByte();
                byte b3 = objectInput.readByte();
                C5842.c.getClass();
                objT = new C11807(C7816.of(i, b2, b3));
                break;
            case 5:
                C25234 c25234 = C25234.d;
                objT = C25234.m(objectInput.readByte());
                break;
            case 6:
                C5096 c5096 = (C5096) objectInput.readObject();
                int i2 = objectInput.readInt();
                byte b4 = objectInput.readByte();
                byte b5 = objectInput.readByte();
                c5096.getClass();
                objT = new C11061(c5096, i2, b4, b5);
                break;
            case 7:
                int i3 = objectInput.readInt();
                byte b6 = objectInput.readByte();
                byte b7 = objectInput.readByte();
                C25322.c.getClass();
                objT = new C23830(C7816.of(i3 + 1911, b6, b7));
                break;
            case 8:
                int i4 = objectInput.readInt();
                byte b8 = objectInput.readByte();
                byte b9 = objectInput.readByte();
                C21592.c.getClass();
                objT = new C19354(C7816.of(i4 - 543, b8, b9));
                break;
            case 9:
                int i5 = C18608.e;
                objT = new C18608(AbstractC2946.t(objectInput.readUTF()), objectInput.readInt(), objectInput.readInt(), objectInput.readInt());
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
