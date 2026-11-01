package l;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ܺۗ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: K60O */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC15673 implements ListIterator {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f50892;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f50893;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C17684 f50894;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f50895;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f50896;

    /* JADX INFO: renamed from: ۙ */
    public abstract Object mo1249(C18825 c18825, int i);

    public AbstractC15673(C17684 c17684, int i, int i2) {
        this.f50894 = c17684;
        this.f50893 = i;
        this.f50892 = i;
        this.f50895 = i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m37344() {
        return this.f50892;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f50896 < this.f50895;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public Object next() {
        if (this.f50896 >= this.f50895) {
            throw new NoSuchElementException();
        }
        C18825 c18825M42184 = this.f50894.m41166().m42184(this.f50892);
        int i = this.f50896;
        this.f50896 = i + 1;
        Object objMo1249 = mo1249(c18825M42184, i);
        this.f50892 = c18825M42184.m43447();
        c18825M42184.m43450();
        return objMo1249;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f50896 > 0;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.f50896 - 1;
        C18825 c18825M42184 = this.f50894.m41166().m42184(this.f50893);
        this.f50896 = 0;
        while (true) {
            int i2 = this.f50896;
            if (i2 < i) {
                this.f50896 = i2 + 1;
                mo1249(c18825M42184, i2);
            } else {
                this.f50896 = i2 + 1;
                Object objMo1249 = mo1249(c18825M42184, i2);
                this.f50892 = c18825M42184.m43447();
                c18825M42184.m43450();
                return objMo1249;
            }
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f50896;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f50896 - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }
}
