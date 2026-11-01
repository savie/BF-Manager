package l;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.ۘۧܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 067E */
/* JADX INFO: loaded from: classes3.dex */
public final class C3901 extends AbstractC13075 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC6724 f14591;

    public C3901(AbstractC6724 abstractC6724) {
        this.f14591 = abstractC6724;
    }

    @Override // l.AbstractC13075
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Map mo11354() {
        return this.f14591;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return this.f14591.mo18156();
    }
}
