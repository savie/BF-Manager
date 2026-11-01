package l;

import java.util.AbstractSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۬ۛ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 02RL */
/* JADX INFO: loaded from: classes3.dex */
public final class C12933 extends AbstractSet {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC3759 f42982;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15050 f42983;

    public C12933(AbstractC3759 abstractC3759, C15050 c15050) {
        this.f42982 = abstractC3759;
        this.f42983 = c15050;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        AbstractC2348 abstractC2348 = (AbstractC2348) obj;
        boolean zM7134 = abstractC2348.m7134();
        AbstractC3759 abstractC3759 = this.f42982;
        if (!zM7134) {
            abstractC2348.f8288 = this.f42983;
            AbstractC3759.m10987(abstractC3759, abstractC2348);
            return true;
        }
        throw new IllegalArgumentException(abstractC3759.mo10988());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C0937(AbstractC3759.m10986(this.f42982).iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return AbstractC3759.m10986(this.f42982).size();
    }
}
