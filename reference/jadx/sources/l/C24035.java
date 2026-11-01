package l;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.᩻᩻᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: Z556 */
/* JADX INFO: loaded from: classes.dex */
public final class C24035 extends AbstractC19338 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11770 f77858;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ List f77859;

    public C24035(C11770 c11770, List list) {
        this.f77858 = c11770;
        this.f77859 = list;
    }

    @Override // l.AbstractC19338, java.util.AbstractSequentialList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        Iterator it;
        C11770 c11770 = this.f77858;
        List listM29400 = c11770.m29400();
        C4007 c4007Mo25747 = c11770.mo25747();
        if (c4007Mo25747 != null) {
            it = c4007Mo25747.m11512();
        } else {
            it = AbstractC23844.of().iterator();
        }
        return new C19200(this.f77859, listM29400, it);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f77859.size();
    }
}
