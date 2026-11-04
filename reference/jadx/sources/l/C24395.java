package l;

import java.util.Comparator;
import java.util.Map;
import java.util.SortedSet;

/* JADX INFO: renamed from: l.᩺ܶ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 5SO */
/* JADX INFO: loaded from: classes2.dex */
public final class C24395 extends AbstractC20228 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C6601 f79138 = new C6601(1);

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22377 f79139;

    public C24395(C22377 c22377) {
        this.f79139 = c22377;
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return ((C7240) this.f79139.mo19865(((InterfaceC5969) obj).mo14179())).mo19859();
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return ((C7240) this.f79139.mo19864(((InterfaceC5969) obj).mo14179(), ((InterfaceC5969) obj2).mo14179())).mo19859();
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return ((C7240) this.f79139.mo19860(((InterfaceC5969) obj).mo14179())).mo19859();
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return this.f79138;
    }

    @Override // l.AbstractC20228, l.AbstractC5312, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC6847 iterator() {
        return new C21411(this.f79139);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj == null || !(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry.getKey() == null || !(entry.getKey() instanceof Character)) {
            return false;
        }
        return entry.equals(this.f79139.m50461(((Character) entry.getKey()).charValue()));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry.getKey() != null && entry.getKey() != null && (entry.getKey() instanceof Character)) {
            char cCharValue = ((Character) entry.getKey()).charValue();
            C22377 c22377 = this.f79139;
            C14697 c14697M50461 = c22377.m50461(cCharValue);
            if (c14697M50461 != null && C17359.equals(c14697M50461.f66378, entry.getValue())) {
                c22377.mo11585(c14697M50461.f66377);
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f79139.f72458;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f79139.clear();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return this.f79139.f72453;
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return this.f79139.f72460;
    }
}
