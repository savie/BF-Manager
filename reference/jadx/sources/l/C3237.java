package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۗ۫ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: A5TB */
/* JADX INFO: loaded from: classes3.dex */
public final class C3237 extends AbstractC23844 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public transient int f12047;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final transient EnumSet f12048;

    @Override // l.AbstractC1826
    /* JADX INFO: renamed from: ᩹ */
    public final boolean mo5042() {
        return false;
    }

    public /* synthetic */ C3237(EnumSet enumSet, int i) {
        this(enumSet);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC23844 m9690(EnumSet enumSet) {
        int size = enumSet.size();
        if (size == 0) {
            return C4275.f15410;
        }
        if (size != 1) {
            return new C3237(enumSet);
        }
        return new C16271((Enum) C22808.m50467((Collection) enumSet));
    }

    public C3237(EnumSet enumSet) {
        this.f12048 = enumSet;
    }

    @Override // l.AbstractC23844, l.AbstractC1826, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public final AbstractC0477 iterator() {
        Iterator it = this.f12048.iterator();
        it.getClass();
        if (it instanceof AbstractC0477) {
            return (AbstractC0477) it;
        }
        return new C15047(it);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f12048.size();
    }

    @Override // l.AbstractC1826, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f12048.contains(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        if (collection instanceof C3237) {
            collection = ((C3237) collection).f12048;
        }
        return this.f12048.containsAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f12048.isEmpty();
    }

    @Override // l.AbstractC23844, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3237) {
            obj = ((C3237) obj).f12048;
        }
        return this.f12048.equals(obj);
    }

    @Override // l.AbstractC23844, java.util.Collection, java.util.Set
    public final int hashCode() {
        int i = this.f12047;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.f12048.hashCode();
        this.f12047 = iHashCode;
        return iHashCode;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return this.f12048.toString();
    }

    @Override // l.AbstractC23844, l.AbstractC1826
    public Object writeReplace() {
        return new C9589(this.f12048);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }
}
