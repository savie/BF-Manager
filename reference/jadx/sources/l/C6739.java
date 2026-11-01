package l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۜۨ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6739 extends AbstractC9625 implements IntConsumer, InterfaceC18576 {
    public int b;
    public C8463 c;

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return C7100.$default$andThen(this, intConsumer);
    }

    @Override // l.InterfaceC20693
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C17870.a(this, consumer);
    }

    @Override // l.InterfaceC20693
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C17870.b(this, consumer);
    }

    @Override // l.AbstractC9625, l.InterfaceC20693
    public final /* bridge */ /* synthetic */ InterfaceC10110 trySplit() {
        return null;
    }

    @Override // l.AbstractC9625, l.InterfaceC20693
    public final /* bridge */ /* synthetic */ InterfaceC18576 trySplit() {
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
                    C8463 c8463 = new C8463();
                    this.c = c8463;
                    c8463.accept(this.b);
                    this.a++;
                }
                this.c.accept(i);
                return;
            }
            throw new IllegalStateException();
        }
    }

    @Override // l.InterfaceC10110
    public final boolean tryAdvance(IntConsumer intConsumer) {
        C13638.requireNonNull(intConsumer);
        if (this.a != -2) {
            return false;
        }
        intConsumer.accept(this.b);
        this.a = -1;
        return true;
    }

    @Override // l.InterfaceC10110
    public final void forEachRemaining(IntConsumer intConsumer) {
        C13638.requireNonNull(intConsumer);
        if (this.a == -2) {
            intConsumer.accept(this.b);
            this.a = -1;
        }
    }
}
