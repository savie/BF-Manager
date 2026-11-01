package l;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.᩷ۘۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5GB */
/* JADX INFO: loaded from: classes5.dex */
public final class C20624 extends AbstractC19338 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ List f67180;

    public C20624(List list) {
        this.f67180 = list;
    }

    @Override // l.AbstractC19338, java.util.AbstractSequentialList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return AbstractC15939.m37894(this.f67180).m37896(C0162.f1245).iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f67180.size();
    }
}
