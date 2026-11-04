package l;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ܽᩴܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: I31W */
/* JADX INFO: loaded from: classes5.dex */
public final class C17786 extends AbstractC14890 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public transient int f58372;

    @Override // l.AbstractC5854, l.InterfaceC23229
    public final /* bridge */ /* synthetic */ Collection values() {
        throw null;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static C17786 m41612() {
        C15416 c15416 = new C15416();
        c15416.m36916(12);
        C17786 c17786 = new C17786(c15416);
        C19278.m44623(3, "expectedValuesPerKey");
        c17786.f58372 = 3;
        return c17786;
    }

    @Override // l.AbstractC20024
    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final Collection mo41614() {
        return new ArrayList(this.f58372);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        C25005.m55839(this, objectOutputStream);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f58372 = 3;
        int i = objectInputStream.readInt();
        C15416 c15416 = new C15416();
        c15416.m36916(3);
        m46064((Map) c15416);
        for (int i2 = 0; i2 < i; i2++) {
            List list = get(objectInputStream.readObject());
            int i3 = objectInputStream.readInt();
            for (int i4 = 0; i4 < i3; i4++) {
                list.add(objectInputStream.readObject());
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m41613(Iterable iterable, Object obj) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            return !collection.isEmpty() && get(obj).addAll(collection);
        }
        Iterator it = iterable.iterator();
        return it.hasNext() && C7676.m20914(get(obj), it);
    }
}
