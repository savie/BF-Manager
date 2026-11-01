package l;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: renamed from: l.ۢܿܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: C3A0 */
/* JADX INFO: loaded from: classes4.dex */
public class C9733 extends AbstractC19611 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final transient AbstractC23844 f32759;

    public C9733(AbstractC6910 abstractC6910, int i) {
        super(abstractC6910, i);
        int i2 = AbstractC23844.f77093;
        this.f32759 = C4275.f15410;
    }

    @Override // l.AbstractC19611, l.InterfaceC19425
    public final AbstractC23844 get(Object obj) {
        return (AbstractC23844) C15483.m37071((AbstractC23844) this.f62963.get(obj), this.f32759);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        AbstractC23844 abstractC23844 = this.f32759;
        objectOutputStream.writeObject(abstractC23844 instanceof AbstractC0934 ? ((AbstractC0934) abstractC23844).f3735 : null);
        C18387.m42663(this, objectOutputStream);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        Serializable serializableM3685;
        objectInputStream.defaultReadObject();
        Comparator comparator = (Comparator) objectInputStream.readObject();
        int i = objectInputStream.readInt();
        if (i < 0) {
            throw new InvalidObjectException(C8479.m22141(i, "Invalid key count "));
        }
        C13261 c13261M18530 = AbstractC6910.m18530();
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object object = objectInputStream.readObject();
            C13638.requireNonNull(object);
            int i4 = objectInputStream.readInt();
            if (i4 <= 0) {
                throw new InvalidObjectException(C8479.m22141(i4, "Invalid value count "));
            }
            C6204 c6204 = comparator == null ? new C6204() : new C5168(comparator);
            for (int i5 = 0; i5 < i4; i5++) {
                Object object2 = objectInputStream.readObject();
                C13638.requireNonNull(object2);
                c6204.mo13308(object2);
            }
            AbstractC23844 abstractC23844Mo14317 = c6204.mo14317();
            if (abstractC23844Mo14317.size() != i4) {
                throw new InvalidObjectException(C9023.m23354(object, "Duplicate key-value pairs exist for key "));
            }
            c13261M18530.mo32741(object, abstractC23844Mo14317);
            i2 += i4;
        }
        try {
            C18905.f61192.m48728(this, c13261M18530.mo32742());
            C18905.f61193.m48727(this, i2);
            C21915 c21915 = C1970.f7403;
            if (comparator == null) {
                int i6 = AbstractC23844.f77093;
                serializableM3685 = C4275.f15410;
            } else {
                serializableM3685 = AbstractC0934.m3685(comparator);
            }
            c21915.m48728(this, serializableM3685);
        } catch (IllegalArgumentException e) {
            throw ((InvalidObjectException) new InvalidObjectException(e.getMessage()).initCause(e));
        }
    }
}
