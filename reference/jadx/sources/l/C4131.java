package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۘۨۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4131 extends AbstractC14812 implements Consumer {
    public Object b;
    public C17664 c;

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return C12312.$default$andThen(this, consumer);
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
                    C17664 c17664 = new C17664();
                    this.c = c17664;
                    c17664.accept(this.b);
                    this.a++;
                }
                this.c.accept(obj);
                return;
            }
            throw new IllegalStateException();
        }
    }

    @Override // l.InterfaceC8409, l.InterfaceC7664
    public final boolean tryAdvance(Consumer consumer) {
        C17359.requireNonNull(consumer);
        if (this.a != -2) {
            return false;
        }
        consumer.accept(this.b);
        this.a = -1;
        return true;
    }

    @Override // l.InterfaceC8409
    public final void forEachRemaining(Consumer consumer) {
        C17359.requireNonNull(consumer);
        if (this.a == -2) {
            consumer.accept(this.b);
            this.a = -1;
        }
    }
}
