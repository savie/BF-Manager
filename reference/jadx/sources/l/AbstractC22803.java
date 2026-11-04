package l;

import java.util.AbstractSequentialList;
import java.util.ListIterator;

/* JADX INFO: renamed from: l.᩸۫ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: 365W */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC22803 extends AbstractSequentialList {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C24975 f73934;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f73935;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f73936;

    /* JADX INFO: renamed from: ۙ */
    public abstract Object mo25986(C8565 c8565, int i);

    public AbstractC22803(C24975 c24975, int i, int i2) {
        this.f73934 = c24975;
        this.f73936 = i;
        this.f73935 = i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f73935;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return new C10868(this, this.f73934, this.f73936, this.f73935);
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        C10868 c10868 = new C10868(this, this.f73934, this.f73936, this.f73935);
        for (int i2 = 0; i2 < i; i2++) {
            c10868.next();
        }
        return c10868;
    }
}
