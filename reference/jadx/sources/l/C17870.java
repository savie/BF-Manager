package l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ᩳۛᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C17870 {
    public static void $default$forEachRemaining(InterfaceC18576 interfaceC18576, IntConsumer intConsumer) {
        while (interfaceC18576.tryAdvance(intConsumer)) {
        }
    }

    public static boolean b(InterfaceC18576 interfaceC18576, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            return interfaceC18576.tryAdvance((IntConsumer) consumer);
        }
        if (AbstractC15297.a) {
            AbstractC15297.a(interfaceC18576.getClass(), "{0} calling Spliterator.OfInt.tryAdvance((IntConsumer) action::accept)");
            throw null;
        }
        C13638.requireNonNull(consumer);
        return interfaceC18576.tryAdvance((IntConsumer) new C24034(consumer, 0));
    }

    public static void a(InterfaceC18576 interfaceC18576, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            interfaceC18576.forEachRemaining((IntConsumer) consumer);
        } else {
            if (AbstractC15297.a) {
                AbstractC15297.a(interfaceC18576.getClass(), "{0} calling Spliterator.OfInt.forEachRemaining((IntConsumer) action::accept)");
                throw null;
            }
            C13638.requireNonNull(consumer);
            interfaceC18576.forEachRemaining((IntConsumer) new C24034(consumer, 0));
        }
    }
}
