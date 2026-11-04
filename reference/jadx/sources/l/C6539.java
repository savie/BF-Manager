package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.ۛܽ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: CCCZ */
/* JADX INFO: loaded from: classes3.dex */
public class C6539 extends AbstractC9520 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC24439 f21975;

    public C6539(AbstractC24439 abstractC24439) {
        this.f21975 = abstractC24439;
    }

    @Override // l.InterfaceC12835
    /* JADX INFO: renamed from: ۫ */
    public final boolean mo5936(char c) {
        return this.f21975.mo19857(c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f21975.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f21975.clear();
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        this.f21975.comparator();
        return null;
    }
}
