package l;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۤۗۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5GB */
/* JADX INFO: loaded from: classes4.dex */
public final class C10584 extends AbstractC13894 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ List f33617;

    public C10584(List list) {
        this.f33617 = list;
    }

    @Override // l.AbstractC13894, java.util.AbstractSequentialList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return AbstractC0501.m2460(this.f33617).m2462(C15059.f49165).iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f33617.size();
    }
}
