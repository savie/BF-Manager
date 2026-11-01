package l;

import java.util.AbstractCollection;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۚܽܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: M3XQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C5479 extends AbstractCollection {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC11830 f18866;

    public C5479(AbstractC11830 abstractC11830) {
        this.f18866 = abstractC11830;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f18866.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f18866.mo44700(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f18866.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C20526(this.f18866);
    }
}
