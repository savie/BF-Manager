package l;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.֡֫ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0096 extends AbstractC12028 implements Iterator, Enumeration {
    public final /* synthetic */ int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0096(C9790[] c9790Arr, int i, int i2, ConcurrentMapC17249 concurrentMapC17249, int i3) {
        super(c9790Arr, i, i2, concurrentMapC17249);
        this.k = i3;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.k) {
            case 0:
                C9790 c9790 = this.b;
                if (c9790 == null) {
                    throw new NoSuchElementException();
                }
                Object obj = c9790.b;
                this.j = c9790;
                a();
                return obj;
            default:
                C9790 c9791 = this.b;
                if (c9791 == null) {
                    throw new NoSuchElementException();
                }
                Object obj2 = c9791.c;
                this.j = c9791;
                a();
                return obj2;
        }
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        switch (this.k) {
            case 0:
                break;
        }
        return next();
    }
}
