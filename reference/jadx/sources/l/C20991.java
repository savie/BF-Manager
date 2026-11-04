package l;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.᩶֫ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: C3Y0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20991 extends AbstractC14890 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public transient InterfaceC6908 f67112;

    @Override // l.AbstractC20024, l.AbstractC5854
    /* JADX INFO: renamed from: ۤ */
    public final Set mo17040() {
        return m46063();
    }

    @Override // l.AbstractC20024, l.AbstractC5854
    /* JADX INFO: renamed from: ᩷ */
    public final Map mo17042() {
        return m46066();
    }

    @Override // l.AbstractC20024
    /* JADX INFO: renamed from: ۫ */
    public final Collection mo41614() {
        return (List) this.f67112.get();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f67112);
        objectOutputStream.writeObject(m46068());
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Object object = objectInputStream.readObject();
        C17359.requireNonNull(object);
        this.f67112 = (InterfaceC6908) object;
        Object object2 = objectInputStream.readObject();
        C17359.requireNonNull(object2);
        m46064((Map) object2);
    }
}
