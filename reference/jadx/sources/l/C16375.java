package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ܽۗܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 17NL */
/* JADX INFO: loaded from: classes4.dex */
public final class C16375 implements Iterator {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final String f52693;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f52694;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Iterator f52695;

    public C16375(String str) {
        this.f52693 = str;
        C12142 c12142 = new C12142(str);
        this.f52695 = c12142;
        this.f52694 = ((Integer) c12142.next()).intValue();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f52694;
        C12142 c12142 = (C12142) this.f52695;
        boolean zHasNext = c12142.hasNext();
        String str = this.f52693;
        if (zHasNext) {
            this.f52694 = ((Integer) c12142.next()).intValue();
        } else if (hasNext()) {
            this.f52694 = str.length();
        } else {
            throw new NoSuchElementException();
        }
        return str.substring(i, this.f52694);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f52694 < this.f52693.length();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("remove");
    }
}
