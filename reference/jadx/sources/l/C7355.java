package l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۜ᩵ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7355 extends AbstractC14812 implements IntConsumer, InterfaceC7664 {
    public int b;
    public C7991 c;

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return C4109.$default$andThen(this, intConsumer);
    }

    @Override // l.InterfaceC8409
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C0206.a(this, consumer);
    }

    @Override // l.InterfaceC8409, l.InterfaceC7664
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C0206.b(this, consumer);
    }

    @Override // l.AbstractC14812, l.InterfaceC8409
    public final /* bridge */ /* synthetic */ InterfaceC7664 trySplit() {
        return null;
    }

    @Override // l.AbstractC14812, l.InterfaceC8409
    public final /* bridge */ /* synthetic */ InterfaceC9154 trySplit() {
        return null;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        int i2 = this.a;
        if (i2 == 0) {
            this.b = i;
            this.a = i2 + 1;
        } else {
            if (i2 > 0) {
                if (this.c == null) {
                    C7991 c7991 = new C7991();
                    this.c = c7991;
                    c7991.accept(this.b);
                    this.a++;
                }
                this.c.accept(i);
                return;
            }
            throw new IllegalStateException();
        }
    }

    @Override // l.InterfaceC9154
    public final boolean tryAdvance(IntConsumer intConsumer) {
        C17359.requireNonNull(intConsumer);
        if (this.a != -2) {
            return false;
        }
        intConsumer.accept(this.b);
        this.a = -1;
        return true;
    }

    @Override // l.InterfaceC9154
    public final void forEachRemaining(IntConsumer intConsumer) {
        C17359.requireNonNull(intConsumer);
        if (this.a == -2) {
            intConsumer.accept(this.b);
            this.a = -1;
        }
    }
}
