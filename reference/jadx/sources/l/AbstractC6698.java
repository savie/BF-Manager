package l;

import java.util.Deque;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ۛ᩹ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6698 extends AbstractC12818 implements InterfaceC9154 {
    @Override // l.InterfaceC9154
    public final boolean tryAdvance(Object obj) {
        InterfaceC9459 interfaceC9459;
        if (!c()) {
            return false;
        }
        boolean zTryAdvance = ((InterfaceC9154) this.d).tryAdvance(obj);
        if (!zTryAdvance) {
            if (this.c == null && (interfaceC9459 = (InterfaceC9459) AbstractC12818.a(this.e)) != null) {
                InterfaceC9154 interfaceC9154Spliterator = interfaceC9459.spliterator();
                this.d = interfaceC9154Spliterator;
                return interfaceC9154Spliterator.tryAdvance(obj);
            }
            this.a = null;
        }
        return zTryAdvance;
    }

    @Override // l.InterfaceC9154
    public final void forEachRemaining(Object obj) {
        if (this.a == null) {
            return;
        }
        if (this.d == null) {
            InterfaceC8409 interfaceC8409 = this.c;
            if (interfaceC8409 == null) {
                Deque dequeB = b();
                while (true) {
                    InterfaceC9459 interfaceC9459 = (InterfaceC9459) AbstractC12818.a(dequeB);
                    if (interfaceC9459 != null) {
                        interfaceC9459.g(obj);
                    } else {
                        this.a = null;
                        return;
                    }
                }
            } else {
                ((InterfaceC9154) interfaceC8409).forEachRemaining(obj);
            }
        } else {
            while (tryAdvance(obj)) {
            }
        }
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return tryAdvance((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        forEachRemaining((Object) longConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return tryAdvance((Object) longConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        forEachRemaining((Object) doubleConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return tryAdvance((Object) doubleConsumer);
    }
}
