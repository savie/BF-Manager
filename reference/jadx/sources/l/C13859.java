package l;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Comparator;

/* JADX INFO: renamed from: l.۬۫ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: C3A0 */
/* JADX INFO: loaded from: classes4.dex */
public class C13859 extends AbstractC6403 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final transient AbstractC8639 f43974;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public transient C13859 f43975;

    public C13859(AbstractC17589 abstractC17589, int i, Comparator comparator) {
        AbstractC8639 abstractC8639M16230;
        super(abstractC17589, i);
        if (comparator == null) {
            int i2 = AbstractC8639.f28224;
            abstractC8639M16230 = C13070.f41806;
        } else {
            abstractC8639M16230 = AbstractC5439.m16230(comparator);
        }
        this.f43974 = abstractC8639M16230;
    }

    @Override // l.InterfaceC23229
    public final AbstractC8639 get(Object obj) {
        return (AbstractC8639) C20333.m46713((AbstractC8639) this.f21604.get(obj), this.f43974);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        AbstractC8639 abstractC8639 = this.f43974;
        objectOutputStream.writeObject(abstractC8639 instanceof AbstractC5439 ? ((AbstractC5439) abstractC8639).f18990 : null);
        C25005.m55839(this, objectOutputStream);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Comparator comparator = (Comparator) objectInputStream.readObject();
        int i = objectInputStream.readInt();
        if (i < 0) {
            throw new InvalidObjectException(C13645.m33382(i, "Invalid key count "));
        }
        C25049 c25049M41247 = AbstractC17589.m41247();
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object object = objectInputStream.readObject();
            C17359.requireNonNull(object);
            int i4 = objectInputStream.readInt();
            if (i4 <= 0) {
                throw new InvalidObjectException(C13645.m33382(i4, "Invalid value count "));
            }
            C9384 c9384 = comparator == null ? new C9384() : new C15133(comparator);
            for (int i5 = 0; i5 < i4; i5++) {
                Object object2 = objectInputStream.readObject();
                C17359.requireNonNull(object2);
                c9384.mo24710(object2);
            }
            AbstractC8639 abstractC8639Mo24709 = c9384.mo24709();
            if (abstractC8639Mo24709.size() != i4) {
                throw new InvalidObjectException(C14483.m34971("Duplicate key-value pairs exist for key ", object));
            }
            c25049M41247.mo14569(object, abstractC8639Mo24709);
            i2 += i4;
        }
        try {
            this.f43975 = new C13859(c25049M41247.mo14570(), i2, comparator);
        } catch (IllegalArgumentException e) {
            throw ((InvalidObjectException) new InvalidObjectException(e.getMessage()).initCause(e));
        }
    }

    private Object readResolve() {
        C13859 c13859 = this.f43975;
        C17359.requireNonNull(c13859);
        return c13859;
    }
}
