package l;

import java.util.AbstractCollection;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۠᩹ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y5EV */
/* JADX INFO: loaded from: classes3.dex */
public final class C8938 extends AbstractCollection {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7447 f29179;

    public C8938(C7447 c7447) {
        this.f29179 = c7447;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        C7447 c7447 = this.f29179;
        return C7676.m20912(AbstractC1928.of(c7447.f24508.iterator(), c7447.f24512.iterator()), AbstractC18753.m43550());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        C7447 c7447 = this.f29179;
        return c7447.f24512.size() + c7447.f24508.size();
    }
}
