package l;

import java.util.AbstractCollection;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۖ᩹ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y5EV */
/* JADX INFO: loaded from: classes2.dex */
public final class C2972 extends AbstractCollection {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7447 f9666;

    public C2972(C7447 c7447) {
        this.f9666 = c7447;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        C7447 c7447 = this.f9666;
        return C7676.m20912(AbstractC1928.of((Object) c7447.f24510.iterator(), (Object) c7447.f24515.iterator()), AbstractC18753.m43550());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        C7447 c7447 = this.f9666;
        return c7447.f24515.size() + c7447.f24510.size();
    }
}
