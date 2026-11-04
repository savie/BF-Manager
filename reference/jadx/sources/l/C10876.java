package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۤ۫ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: A5TB */
/* JADX INFO: loaded from: classes4.dex */
public final class C10876 extends AbstractC8639 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final transient EnumSet f34422;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public transient int f34423;

    @Override // l.AbstractC4911
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo14905() {
        return false;
    }

    public /* synthetic */ C10876(EnumSet enumSet, int i) {
        this(enumSet);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC8639 m27618(EnumSet enumSet) {
        int size = enumSet.size();
        if (size == 0) {
            return C13070.f41806;
        }
        if (size != 1) {
            return new C10876(enumSet);
        }
        return new C6359((Enum) C16625.m39331((Collection) enumSet));
    }

    public C10876(EnumSet enumSet) {
        this.f34422 = enumSet;
    }

    @Override // l.AbstractC8639, l.AbstractC4911, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final AbstractC4516 iterator() {
        Iterator it = this.f34422.iterator();
        it.getClass();
        if (it instanceof AbstractC4516) {
            return (AbstractC4516) it;
        }
        return new C17371(it);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f34422.size();
    }

    @Override // l.AbstractC4911, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f34422.contains(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        if (collection instanceof C10876) {
            collection = ((C10876) collection).f34422;
        }
        return this.f34422.containsAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f34422.isEmpty();
    }

    @Override // l.AbstractC8639, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C10876) {
            obj = ((C10876) obj).f34422;
        }
        return this.f34422.equals(obj);
    }

    @Override // l.AbstractC8639, java.util.Collection, java.util.Set
    public final int hashCode() {
        int i = this.f34423;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.f34422.hashCode();
        this.f34423 = iHashCode;
        return iHashCode;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return this.f34422.toString();
    }

    @Override // l.AbstractC8639, l.AbstractC4911
    public Object writeReplace() {
        return new C22065(this.f34422);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }
}
