package l;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۘܽۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: R6U3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4055 implements Iterator {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f14956;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f14957;

    public C4055(C15346 c15346, boolean z) {
        this.f14957 = z;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f14956 = arrayDeque;
        C6878 c6878 = c15346.f49958;
        if (c6878 != null) {
            arrayDeque.push(c6878);
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f14956.isEmpty();
    }

    @Override // java.util.Iterator
    public final Object next() {
        ArrayDeque arrayDeque = this.f14956;
        if (arrayDeque.isEmpty()) {
            throw new NoSuchElementException();
        }
        C6878 c6878 = (C6878) arrayDeque.pop();
        while (true) {
            Object obj = c6878.f23174;
            C6878 c6879 = c6878.f23175;
            c6878 = c6878.f23173;
            if (obj != null) {
                return obj;
            }
            boolean z = this.f14957;
            arrayDeque.push(z ? c6878 : c6879);
            if (z) {
                c6878 = c6879;
            }
        }
    }
}
