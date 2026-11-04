package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۘ֫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: Y4VB */
/* JADX INFO: loaded from: classes2.dex */
public final class C3839 implements Iterator {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f13075 = 0;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14279 f13076;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f13077;

    public C3839(C14279 c14279) {
        this.f13076 = c14279;
        this.f13077 = c14279.f45109.length;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f13075 < this.f13077;
    }

    @Override // java.util.Iterator
    public final Object next() {
        try {
            Object[] objArr = this.f13076.f45109;
            int i = this.f13075;
            this.f13075 = i + 1;
            return objArr[i];
        } catch (IndexOutOfBoundsException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }
}
