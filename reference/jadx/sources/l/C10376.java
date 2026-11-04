package l;

import java.util.Comparator;
import java.util.Map;
import java.util.SortedSet;

/* JADX INFO: renamed from: l.ۢ᩶᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: X5U */
/* JADX INFO: loaded from: classes4.dex */
public final class C10376 extends AbstractC20228 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C24493 f33006 = new C24493(2);

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11780 f33007;

    public C10376(C11780 c11780) {
        this.f33007 = c11780;
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return ((C13272) this.f33007.mo13472(((InterfaceC5903) obj).mo3870())).mo13468();
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return ((C13272) this.f33007.mo13473(((InterfaceC5903) obj).mo3870(), ((InterfaceC5903) obj2).mo3870())).mo13468();
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return ((C13272) this.f33007.mo13475(((InterfaceC5903) obj).mo3870())).mo13468();
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return this.f33006;
    }

    @Override // l.AbstractC20228, l.AbstractC5312, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC6847 iterator() {
        return new C2919(this.f33007);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj == null || !(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry.getKey() == null || !(entry.getKey() instanceof Integer)) {
            return false;
        }
        return entry.equals(this.f33007.m29554(((Integer) entry.getKey()).intValue()));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry.getKey() == null || !(entry.getKey() instanceof Integer)) {
            return false;
        }
        int iIntValue = ((Integer) entry.getKey()).intValue();
        C11780 c11780 = this.f33007;
        C9630 c9630M29554 = c11780.m29554(iIntValue);
        if (c9630M29554 == null || !C17359.equals(c9630M29554.f3593, entry.getValue())) {
            return false;
        }
        c11780.remove(c9630M29554.f3592);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f33007.f38062;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f33007.clear();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return this.f33007.f38056;
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return this.f33007.f38064;
    }
}
