package l;

import java.util.AbstractSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܽۗ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: E63W */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16378 extends AbstractSet {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f52705;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C17684 f52706;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f52707;

    /* JADX INFO: renamed from: ۙ */
    public abstract C12041 mo13813(C18825 c18825);

    public AbstractC16378(C17684 c17684, int i, int i2) {
        this.f52706 = c17684;
        this.f52707 = i;
        this.f52705 = i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C0149(this, this.f52706, this.f52707, this.f52705);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f52705;
    }
}
