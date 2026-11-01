package l;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.ۨۧܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 067E */
/* JADX INFO: loaded from: classes4.dex */
public final class C11664 extends AbstractC13075 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC2490 f39206;

    public C11664(AbstractC2490 abstractC2490) {
        this.f39206 = abstractC2490;
    }

    @Override // l.AbstractC13075
    /* JADX INFO: renamed from: ܰ */
    public final Map mo11354() {
        return this.f39206;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return ((C1245) this.f39206).f5425.mo23246();
    }
}
