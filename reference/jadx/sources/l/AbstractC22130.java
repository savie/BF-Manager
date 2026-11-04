package l;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.᩷ܳܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: O2OZ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC22130 implements Iterator {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15416 f71299;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f71300;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f71301;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f71302;

    /* JADX INFO: renamed from: ᩷ */
    public abstract Object mo20161(int i);

    public AbstractC22130(C15416 c15416) {
        this.f71299 = c15416;
        this.f71302 = c15416.f50238;
        this.f71300 = c15416.isEmpty() ? -1 : 0;
        this.f71301 = -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f71300 >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C15416 c15416 = this.f71299;
        if (c15416.f50238 == this.f71302) {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i = this.f71300;
            this.f71301 = i;
            Object objMo20161 = mo20161(i);
            this.f71300 = c15416.m36917(this.f71300);
            return objMo20161;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        C15416 c15416 = this.f71299;
        if (c15416.f50238 == this.f71302) {
            C12128.m30314("no calls to next() since the last call to remove()", this.f71301 >= 0);
            this.f71302 += 32;
            c15416.remove(C15416.m36898(c15416, this.f71301));
            this.f71300--;
            this.f71301 = -1;
            return;
        }
        throw new ConcurrentModificationException();
    }
}
