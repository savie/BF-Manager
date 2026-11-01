package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Map;

/* JADX INFO: renamed from: l.ܶܿܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: V656 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC15378 extends AbstractC23844 {
    /* JADX INFO: renamed from: ۜ */
    public abstract C2345 mo12442();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return mo12442().size();
    }

    @Override // l.AbstractC1826, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = mo12442().get(entry.getKey());
        return obj2 != null && obj2.equals(entry.getValue());
    }

    @Override // l.AbstractC1826
    /* JADX INFO: renamed from: ᩹ */
    public final boolean mo5042() {
        return mo12442().mo7131();
    }

    @Override // l.AbstractC23844
    /* JADX INFO: renamed from: ۬ */
    public final boolean mo12085() {
        mo12442().getClass();
        return false;
    }

    @Override // l.AbstractC23844, java.util.Collection, java.util.Set
    public final int hashCode() {
        return mo12442().hashCode();
    }

    @Override // l.AbstractC23844, l.AbstractC1826
    public Object writeReplace() {
        return new C23139(mo12442());
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use EntrySetSerializedForm");
    }
}
