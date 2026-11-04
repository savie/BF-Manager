package l;

import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.᩶ۧ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 86EK */
/* JADX INFO: loaded from: classes5.dex */
public final class C21277 implements Iterator {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f67837;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f67838;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final List f67839;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f67840;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final BitSet f67841;

    public C21277(BitSet bitSet, int i, List list) {
        this.f67841 = bitSet;
        this.f67837 = i;
        this.f67839 = list;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f67840 != this.f67837;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int iNextSetBit = this.f67841.nextSetBit(this.f67838);
        if (iNextSetBit == -1) {
            throw new NoSuchElementException();
        }
        this.f67838 = iNextSetBit + 1;
        this.f67840++;
        return (C21943) this.f67839.get(iNextSetBit);
    }
}
