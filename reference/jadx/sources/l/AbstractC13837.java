package l;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.۬ۨܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1AZL */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC13837 implements Iterator {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21869 f43917;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f43918;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C4715 f43919;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C4715 f43920 = null;

    public AbstractC13837(C21869 c21869) {
        this.f43917 = c21869;
        this.f43919 = c21869.f69704.f16629;
        this.f43918 = c21869.f69701;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f43919 != this.f43917.f69704;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C4715 m33789() {
        C4715 c4715 = this.f43919;
        C21869 c21869 = this.f43917;
        if (c4715 == c21869.f69704) {
            throw new NoSuchElementException();
        }
        if (c21869.f69701 != this.f43918) {
            throw new ConcurrentModificationException();
        }
        this.f43919 = c4715.f16629;
        this.f43920 = c4715;
        return c4715;
    }

    @Override // java.util.Iterator
    public final void remove() {
        C4715 c4715 = this.f43920;
        if (c4715 == null) {
            throw new IllegalStateException();
        }
        C21869 c21869 = this.f43917;
        c21869.m49564(c4715, true);
        this.f43920 = null;
        this.f43918 = c21869.f69701;
    }

    @Override // java.util.Iterator
    public Object next() {
        return m33789();
    }
}
