package l;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ܶۤۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z556 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16023 extends AbstractC13894 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4091 f51984;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ List f51985;

    public C16023(C4091 c4091, List list) {
        this.f51984 = c4091;
        this.f51985 = list;
    }

    @Override // l.AbstractC13894, java.util.AbstractSequentialList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        Iterator it;
        C4091 c4091 = this.f51984;
        List listM13183 = c4091.m13183();
        C7820 c7820Mo13175 = c4091.mo13175();
        if (c7820Mo13175 != null) {
            it = c7820Mo13175.m21297();
        } else {
            it = AbstractC8639.of().iterator();
        }
        return new C13916(this.f51985, listM13183, it);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f51985.size();
    }
}
