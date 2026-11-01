package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.֫ۨ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1800 extends AbstractC9625 implements Consumer {
    public Object b;
    public C0335 c;

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return C1455.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.a;
        if (i == 0) {
            this.b = obj;
            this.a = i + 1;
        } else {
            if (i > 0) {
                if (this.c == null) {
                    C0335 c0335 = new C0335();
                    this.c = c0335;
                    c0335.accept(this.b);
                    this.a++;
                }
                this.c.accept(obj);
                return;
            }
            throw new IllegalStateException();
        }
    }

    @Override // l.InterfaceC20693
    public final boolean tryAdvance(Consumer consumer) {
        C13638.requireNonNull(consumer);
        if (this.a != -2) {
            return false;
        }
        consumer.accept(this.b);
        this.a = -1;
        return true;
    }

    @Override // l.InterfaceC20693
    public final void forEachRemaining(Consumer consumer) {
        C13638.requireNonNull(consumer);
        if (this.a == -2) {
            consumer.accept(this.b);
            this.a = -1;
        }
    }
}
