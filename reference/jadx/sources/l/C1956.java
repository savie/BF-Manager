package l;

import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֫ܽ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 51V0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1956 extends AbstractSet {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f7365;

    public C1956(ArrayList arrayList) {
        this.f7365 = arrayList;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return this.f7365.iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f7365.size();
    }
}
