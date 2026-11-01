package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩺ܰ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public final class C23030 extends AbstractC15706 {
    @Override // l.AbstractC15706
    public final AbstractC15706 e(InterfaceC20693 interfaceC20693) {
        return new C23030(this.b, interfaceC20693, this.a);
    }

    @Override // l.AbstractC15706
    public final void d() {
        C0335 c0335 = new C0335();
        this.h = c0335;
        C13638.requireNonNull(c0335);
        this.e = this.b.g0(new C3004(c0335, 0));
        this.f = new C5295(19, this);
    }

    @Override // l.InterfaceC20693
    public final boolean tryAdvance(Consumer consumer) {
        Object obj;
        C13638.requireNonNull(consumer);
        boolean zA = a();
        if (!zA) {
            return zA;
        }
        C0335 c0335 = (C0335) this.h;
        long j = this.g;
        if (c0335.c != 0) {
            if (j >= c0335.count()) {
                throw new IndexOutOfBoundsException(Long.toString(j));
            }
            for (int i = 0; i <= c0335.c; i++) {
                long j2 = c0335.d[i];
                Object[] objArr = c0335.f[i];
                if (j < ((long) objArr.length) + j2) {
                    obj = objArr[(int) (j - j2)];
                }
            }
            throw new IndexOutOfBoundsException(Long.toString(j));
        }
        if (j < c0335.b) {
            obj = c0335.e[(int) j];
        } else {
            throw new IndexOutOfBoundsException(Long.toString(j));
        }
        consumer.n(obj);
        return zA;
    }

    @Override // l.InterfaceC20693
    public final void forEachRemaining(Consumer consumer) {
        if (this.h == null && !this.i) {
            C13638.requireNonNull(consumer);
            c();
            C13638.requireNonNull(consumer);
            C3004 c3004 = new C3004(consumer, 1);
            this.b.f0(this.d, c3004);
            this.i = true;
            return;
        }
        while (tryAdvance(consumer)) {
        }
    }
}
