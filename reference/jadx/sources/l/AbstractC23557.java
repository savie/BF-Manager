package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Map;

/* JADX INFO: renamed from: l.᩹۫ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: V656 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC23557 extends AbstractC8639 {
    /* JADX INFO: renamed from: ۧ */
    public abstract C19609 mo27163();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return mo27163().size();
    }

    @Override // l.AbstractC4911, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = mo27163().get(entry.getKey());
        return obj2 != null && obj2.equals(entry.getValue());
    }

    @Override // l.AbstractC4911
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo14905() {
        return mo27163().mo33237();
    }

    @Override // l.AbstractC8639
    /* JADX INFO: renamed from: ۚ */
    public final boolean mo23283() {
        mo27163().getClass();
        return false;
    }

    @Override // l.AbstractC8639, java.util.Collection, java.util.Set
    public final int hashCode() {
        return mo27163().hashCode();
    }

    @Override // l.AbstractC8639, l.AbstractC4911
    public Object writeReplace() {
        return new C16097(mo27163());
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use EntrySetSerializedForm");
    }
}
