package l;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.᩺ܽܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: I31W */
/* JADX INFO: loaded from: classes2.dex */
public final class C23119 extends AbstractC7120 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public transient int f75089;

    @Override // l.AbstractC22413, l.InterfaceC19425
    public final /* bridge */ /* synthetic */ Collection values() {
        throw null;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static C23119 m51120() {
        C23119 c23119 = new C23119(C11705.m29231(12));
        C20296.m45806(3, "expectedValuesPerKey");
        c23119.f75089 = 3;
        return c23119;
    }

    @Override // l.AbstractC11830
    /* JADX INFO: renamed from: ֨ */
    public final Collection mo29507() {
        return new ArrayList(this.f75089);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        C18387.m42663(this, objectOutputStream);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f75089 = 3;
        int i = objectInputStream.readInt();
        m29510((Map) C11705.m29221());
        for (int i2 = 0; i2 < i; i2++) {
            List list = get(objectInputStream.readObject());
            int i3 = objectInputStream.readInt();
            for (int i4 = 0; i4 < i3; i4++) {
                list.add(objectInputStream.readObject());
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m51121(Iterable iterable, Object obj) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            return !collection.isEmpty() && get(obj).addAll(collection);
        }
        Iterator it = iterable.iterator();
        return it.hasNext() && C16458.m38723(get(obj), it);
    }
}
