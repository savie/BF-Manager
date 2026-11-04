package l;

import java.util.AbstractSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۚ۫ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: E63W */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5649 extends AbstractSet {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C24975 f19514;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f19515;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f19516;

    /* JADX INFO: renamed from: ۙ */
    public abstract C4420 mo6598(C8565 c8565);

    public AbstractC5649(C24975 c24975, int i, int i2) {
        this.f19514 = c24975;
        this.f19516 = i;
        this.f19515 = i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C13106(this, this.f19514, this.f19516, this.f19515);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f19515;
    }
}
