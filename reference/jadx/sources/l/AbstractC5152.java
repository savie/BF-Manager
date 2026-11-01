package l;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۚۚ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 1AZL */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5152 implements Iterator {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C22086 f17894;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f17895;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0918 f17896;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C22086 f17897 = null;

    public AbstractC5152(C0918 c0918) {
        this.f17896 = c0918;
        this.f17894 = c0918.f3681.f71544;
        this.f17895 = c0918.f3682;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f17894 != this.f17896.f3681;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22086 m14300() {
        C22086 c22086 = this.f17894;
        C0918 c0918 = this.f17896;
        if (c22086 == c0918.f3681) {
            throw new NoSuchElementException();
        }
        if (c0918.f3682 != this.f17895) {
            throw new ConcurrentModificationException();
        }
        this.f17894 = c22086.f71544;
        this.f17897 = c22086;
        return c22086;
    }

    @Override // java.util.Iterator
    public final void remove() {
        C22086 c22086 = this.f17897;
        if (c22086 == null) {
            throw new IllegalStateException();
        }
        C0918 c0918 = this.f17896;
        c0918.m3644(c22086, true);
        this.f17897 = null;
        this.f17895 = c0918.f3682;
    }

    @Override // java.util.Iterator
    public Object next() {
        return m14300();
    }
}
