package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.۬ۗۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13563 extends AbstractC24753 {
    @Override // l.AbstractC24753
    public final AbstractC24753 e(InterfaceC8409 interfaceC8409) {
        return new C13563(this.b, interfaceC8409, this.a);
    }

    @Override // l.AbstractC24753
    public final void d() {
        C17664 c17664 = new C17664();
        this.h = c17664;
        C17359.requireNonNull(c17664);
        this.e = this.b.g0(new C21023(c17664, 0));
        this.f = new C3249(20, this);
    }

    @Override // l.InterfaceC8409, l.InterfaceC7664
    public final boolean tryAdvance(Consumer consumer) {
        Object obj;
        C17359.requireNonNull(consumer);
        boolean zA = a();
        if (!zA) {
            return zA;
        }
        C17664 c17664 = (C17664) this.h;
        long j = this.g;
        if (c17664.c != 0) {
            if (j >= c17664.count()) {
                throw new IndexOutOfBoundsException(Long.toString(j));
            }
            for (int i = 0; i <= c17664.c; i++) {
                long j2 = c17664.d[i];
                Object[] objArr = c17664.f[i];
                if (j < ((long) objArr.length) + j2) {
                    obj = objArr[(int) (j - j2)];
                }
            }
            throw new IndexOutOfBoundsException(Long.toString(j));
        }
        if (j < c17664.b) {
            obj = c17664.e[(int) j];
        } else {
            throw new IndexOutOfBoundsException(Long.toString(j));
        }
        consumer.n(obj);
        return zA;
    }

    @Override // l.InterfaceC8409
    public final void forEachRemaining(Consumer consumer) {
        if (this.h == null && !this.i) {
            C17359.requireNonNull(consumer);
            c();
            C17359.requireNonNull(consumer);
            C21023 c21023 = new C21023(consumer, 1);
            this.b.f0(this.d, c21023);
            this.i = true;
            return;
        }
        while (tryAdvance(consumer)) {
        }
    }
}
