package l;

import java.util.Comparator;
import java.util.Map;
import java.util.SortedSet;

/* JADX INFO: renamed from: l.۬᩶᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: X5U */
/* JADX INFO: loaded from: classes4.dex */
public final class C14105 extends AbstractC20228 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13272 f44615;

    public C14105(C13272 c13272) {
        this.f44615 = c13272;
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return ((C13272) this.f44615.mo13472(((InterfaceC5903) obj).mo3870())).mo13468();
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return ((C13272) this.f44615.mo13473(((InterfaceC5903) obj).mo3870(), ((InterfaceC5903) obj2).mo3870())).mo13468();
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return ((C13272) this.f44615.mo13475(((InterfaceC5903) obj).mo3870())).mo13468();
    }

    @Override // l.AbstractC20228, l.AbstractC5312, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC6847 iterator() {
        return new C11034(this.f44615);
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((C10376) this.f44615.f42394.mo13468()).f33006;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry.getKey() != null && (entry.getKey() instanceof Integer)) {
            C13272 c13272 = this.f44615;
            C9630 c9630M29554 = c13272.f42394.m29554(((Integer) entry.getKey()).intValue());
            if (c9630M29554 != null && c13272.m32818(c9630M29554.f3592) && entry.equals(c9630M29554)) {
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
        if (entry.getKey() != null && (entry.getKey() instanceof Integer)) {
            C13272 c13272 = this.f44615;
            C9630 c9630M29554 = c13272.f42394.m29554(((Integer) entry.getKey()).intValue());
            if (c9630M29554 != null && c13272.m32818(c9630M29554.f3592) && C17359.equals(c9630M29554.f3593, entry.getValue())) {
                c13272.remove(c9630M29554.f3592);
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Object it = iterator();
        int i = 0;
        while (((C5815) it).hasNext()) {
            i++;
            ((C11034) it).next();
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f44615.clear();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return this.f44615.firstEntry();
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return this.f44615.lastEntry();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        C13272 c13272 = this.f44615;
        C9630 c9630 = c13272.f42394.f38056;
        return !(c13272.firstEntry() != null);
    }
}
