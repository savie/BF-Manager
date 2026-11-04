package l;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ܶ۟᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: R6U3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15948 implements Iterator {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f51786;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f51787;

    public C15948(C20424 c20424, boolean z) {
        this.f51787 = z;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f51786 = arrayDeque;
        C23408 c23408 = c20424.f65428;
        if (c23408 != null) {
            arrayDeque.push(c23408);
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f51786.isEmpty();
    }

    @Override // java.util.Iterator
    public final Object next() {
        ArrayDeque arrayDeque = this.f51786;
        if (arrayDeque.isEmpty()) {
            throw new NoSuchElementException();
        }
        C23408 c23408 = (C23408) arrayDeque.pop();
        while (true) {
            Object obj = c23408.f75775;
            C23408 c23409 = c23408.f75773;
            c23408 = c23408.f75771;
            if (obj != null) {
                return obj;
            }
            boolean z = this.f51787;
            arrayDeque.push(z ? c23408 : c23409);
            if (z) {
                c23408 = c23409;
            }
        }
    }
}
