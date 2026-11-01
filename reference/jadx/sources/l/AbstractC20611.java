package l;

import java.util.AbstractSequentialList;
import java.util.ListIterator;

/* JADX INFO: renamed from: l.᩷ۗ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 365W */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC20611 extends AbstractSequentialList {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f67143;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C17684 f67144;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f67145;

    /* JADX INFO: renamed from: ۙ */
    public abstract Object mo15967(C18825 c18825, int i);

    public AbstractC20611(C17684 c17684, int i, int i2) {
        this.f67144 = c17684;
        this.f67145 = i;
        this.f67143 = i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f67143;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return new C7205(this, this.f67144, this.f67145, this.f67143);
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        C7205 c7205 = new C7205(this, this.f67144, this.f67145, this.f67143);
        for (int i2 = 0; i2 < i; i2++) {
            c7205.next();
        }
        return c7205;
    }
}
