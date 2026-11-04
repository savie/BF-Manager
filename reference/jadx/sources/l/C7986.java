package l;

import java.util.Comparator;
import java.util.Map;
import java.util.SortedSet;

/* JADX INFO: renamed from: l.۟ܶ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 5SO */
/* JADX INFO: loaded from: classes4.dex */
public final class C7986 extends AbstractC20228 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7240 f26524;

    public C7986(C7240 c7240) {
        this.f26524 = c7240;
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return ((C7240) this.f26524.mo19865(((InterfaceC5969) obj).mo14179())).mo19859();
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return ((C7240) this.f26524.mo19864(((InterfaceC5969) obj).mo14179(), ((InterfaceC5969) obj2).mo14179())).mo19859();
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return ((C7240) this.f26524.mo19860(((InterfaceC5969) obj).mo14179())).mo19859();
    }

    @Override // l.AbstractC20228, l.AbstractC5312, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC6847 iterator() {
        return new C1274(this.f26524);
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((C24395) this.f26524.f23878.mo19859()).f79138;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry.getKey() != null && (entry.getKey() instanceof Character)) {
            C7240 c7240 = this.f26524;
            C14697 c14697M50461 = c7240.f23878.m50461(((Character) entry.getKey()).charValue());
            if (c14697M50461 != null && c7240.m19858(c14697M50461.f66377) && entry.equals(c14697M50461)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry.getKey() != null && (entry.getKey() instanceof Character)) {
            C7240 c7240 = this.f26524;
            C14697 c14697M50461 = c7240.f23878.m50461(((Character) entry.getKey()).charValue());
            if (c14697M50461 != null && c7240.m19858(c14697M50461.f66377) && C17359.equals(c14697M50461.f66378, entry.getValue())) {
                c7240.mo11585(c14697M50461.f66377);
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Object it = iterator();
        int i = 0;
        while (((C13951) it).hasNext()) {
            i++;
            ((C1274) it).next();
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f26524.clear();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return this.f26524.firstEntry();
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return this.f26524.lastEntry();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        C7240 c7240 = this.f26524;
        C14697 c14697 = c7240.f23878.f72453;
        return !(c7240.firstEntry() != null);
    }
}
