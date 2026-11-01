package l;

import java.util.Deque;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.᩻ۗᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC23433 extends AbstractC8650 implements InterfaceC10110 {
    @Override // l.InterfaceC10110
    public final boolean tryAdvance(Object obj) {
        InterfaceC0853 interfaceC0853;
        if (!c()) {
            return false;
        }
        boolean zTryAdvance = ((InterfaceC10110) this.d).tryAdvance(obj);
        if (!zTryAdvance) {
            if (this.c == null && (interfaceC0853 = (InterfaceC0853) AbstractC8650.a(this.e)) != null) {
                InterfaceC10110 interfaceC10110Spliterator = interfaceC0853.spliterator();
                this.d = interfaceC10110Spliterator;
                return interfaceC10110Spliterator.tryAdvance(obj);
            }
            this.a = null;
        }
        return zTryAdvance;
    }

    @Override // l.InterfaceC10110
    public final void forEachRemaining(Object obj) {
        if (this.a == null) {
            return;
        }
        if (this.d == null) {
            InterfaceC20693 interfaceC20693 = this.c;
            if (interfaceC20693 == null) {
                Deque dequeB = b();
                while (true) {
                    InterfaceC0853 interfaceC0853 = (InterfaceC0853) AbstractC8650.a(dequeB);
                    if (interfaceC0853 != null) {
                        interfaceC0853.g(obj);
                    } else {
                        this.a = null;
                        return;
                    }
                }
            } else {
                ((InterfaceC10110) interfaceC20693).forEachRemaining(obj);
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
