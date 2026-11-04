package l;

import java.util.Comparator;
import java.util.Map;
import java.util.SortedSet;

/* JADX INFO: renamed from: l.ۚܰ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 0JF */
/* JADX INFO: loaded from: classes3.dex */
public final class C5705 extends AbstractC20228 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C7777 f19704 = new C7777(1);

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18383 f19705;

    public C5705(C18383 c18383) {
        this.f19705 = c18383;
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return ((C4213) this.f19705.mo13472(((InterfaceC5903) obj).mo3870())).mo13468();
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return ((C4213) this.f19705.mo13473(((InterfaceC5903) obj).mo3870(), ((InterfaceC5903) obj2).mo3870())).mo13468();
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return ((C4213) this.f19705.mo13475(((InterfaceC5903) obj).mo3870())).mo13468();
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return this.f19704;
    }

    @Override // l.AbstractC20228, l.AbstractC5312, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC6847 iterator() {
        return new C25097(this.f19705);
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
        return entry.equals(this.f19705.m42894(((Integer) entry.getKey()).intValue()));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry.getKey() != null && entry.getKey() != null && (entry.getKey() instanceof Integer)) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            C18383 c18383 = this.f19705;
            C11670 c11670M42894 = c18383.m42894(iIntValue);
            if (c11670M42894 != null && C17359.equals(c11670M42894.f3593, entry.getValue())) {
                c18383.remove(c11670M42894.f3592);
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f19705.f59893;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f19705.clear();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return this.f19705.f59888;
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return this.f19705.f59895;
    }
}
