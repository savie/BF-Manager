package l;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.ܽۧܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: C3Y0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16603 extends AbstractC7120 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public transient InterfaceC23949 f53285;

    @Override // l.AbstractC11830, l.AbstractC22413
    /* JADX INFO: renamed from: ۨ */
    public final Set mo29511() {
        return m29509();
    }

    @Override // l.AbstractC11830, l.AbstractC22413
    /* JADX INFO: renamed from: ܰ */
    public final Map mo29513() {
        return m29512();
    }

    @Override // l.AbstractC11830
    /* JADX INFO: renamed from: ֨ */
    public final Collection mo29507() {
        return (List) this.f53285.get();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f53285);
        objectOutputStream.writeObject(m29514());
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Object object = objectInputStream.readObject();
        C13638.requireNonNull(object);
        this.f53285 = (InterfaceC23949) object;
        Object object2 = objectInputStream.readObject();
        C13638.requireNonNull(object2);
        m29510((Map) object2);
    }
}
