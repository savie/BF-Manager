package l;

import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۡᩴܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51V0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9580 extends AbstractSet {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f31011;

    public C9580(ArrayList arrayList) {
        this.f31011 = arrayList;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return this.f31011.iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f31011.size();
    }
}
