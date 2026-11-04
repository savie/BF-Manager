package l;

import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ᩳۚۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C18851 {
    public static void $default$forEachRemaining(InterfaceC9900 interfaceC9900, LongConsumer longConsumer) {
        while (interfaceC9900.tryAdvance(longConsumer)) {
        }
    }

    public static boolean b(InterfaceC9900 interfaceC9900, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            return interfaceC9900.tryAdvance((LongConsumer) consumer);
        }
        if (AbstractC21658.a) {
            AbstractC21658.a(interfaceC9900.getClass(), "{0} calling Spliterator.OfLong.tryAdvance((LongConsumer) action::accept)");
            throw null;
        }
        C17359.requireNonNull(consumer);
        return interfaceC9900.tryAdvance((LongConsumer) new C3758(consumer, 0));
    }

    public static void a(InterfaceC9900 interfaceC9900, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            interfaceC9900.forEachRemaining((LongConsumer) consumer);
        } else {
            if (AbstractC21658.a) {
                AbstractC21658.a(interfaceC9900.getClass(), "{0} calling Spliterator.OfLong.forEachRemaining((LongConsumer) action::accept)");
                throw null;
            }
            C17359.requireNonNull(consumer);
            interfaceC9900.forEachRemaining((LongConsumer) new C3758(consumer, 0));
        }
    }
}
