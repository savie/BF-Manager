package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۘ֫ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3825 extends AbstractC12028 implements Iterator {
    @Override // java.util.Iterator
    public final Object next() {
        C9790 c9790 = this.b;
        if (c9790 == null) {
            throw new NoSuchElementException();
        }
        Object obj = c9790.b;
        Object obj2 = c9790.c;
        this.j = c9790;
        a();
        return new C18741(obj, obj2, this.i);
    }
}
