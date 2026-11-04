package l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.֡ۚۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C0206 {
    public static void $default$forEachRemaining(InterfaceC7664 interfaceC7664, IntConsumer intConsumer) {
        while (interfaceC7664.tryAdvance(intConsumer)) {
        }
    }

    public static boolean b(InterfaceC7664 interfaceC7664, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            return interfaceC7664.tryAdvance((IntConsumer) consumer);
        }
        if (AbstractC21658.a) {
            AbstractC21658.a(interfaceC7664.getClass(), "{0} calling Spliterator.OfInt.tryAdvance((IntConsumer) action::accept)");
            throw null;
        }
        C17359.requireNonNull(consumer);
        return interfaceC7664.tryAdvance((IntConsumer) new C13453(consumer, 0));
    }

    public static void a(InterfaceC7664 interfaceC7664, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            interfaceC7664.forEachRemaining((IntConsumer) consumer);
        } else {
            if (AbstractC21658.a) {
                AbstractC21658.a(interfaceC7664.getClass(), "{0} calling Spliterator.OfInt.forEachRemaining((IntConsumer) action::accept)");
                throw null;
            }
            C17359.requireNonNull(consumer);
            interfaceC7664.forEachRemaining((IntConsumer) new C13453(consumer, 0));
        }
    }
}
