package l;

import java.util.AbstractSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۟۬ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 02RL */
/* JADX INFO: loaded from: classes3.dex */
public final class C7910 extends AbstractSet {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC19097 f26272;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9400 f26273;

    public C7910(AbstractC19097 abstractC19097, C9400 c9400) {
        this.f26272 = abstractC19097;
        this.f26273 = c9400;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        AbstractC14621 abstractC14621 = (AbstractC14621) obj;
        boolean zM35263 = abstractC14621.m35263();
        AbstractC19097 abstractC19097 = this.f26272;
        if (!zM35263) {
            abstractC14621.f46061 = this.f26273;
            AbstractC19097.m44213(abstractC19097, abstractC14621);
            return true;
        }
        throw new IllegalArgumentException(abstractC19097.mo26260());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C0452(AbstractC19097.m44212(this.f26272).iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return AbstractC19097.m44212(this.f26272).size();
    }
}
