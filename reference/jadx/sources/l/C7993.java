package l;

import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.۠ۛᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C7993 {
    public static void $default$forEachRemaining(InterfaceC19282 interfaceC19282, LongConsumer longConsumer) {
        while (interfaceC19282.tryAdvance(longConsumer)) {
        }
    }

    public static boolean b(InterfaceC19282 interfaceC19282, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            return interfaceC19282.tryAdvance((LongConsumer) consumer);
        }
        if (AbstractC15297.a) {
            AbstractC15297.a(interfaceC19282.getClass(), "{0} calling Spliterator.OfLong.tryAdvance((LongConsumer) action::accept)");
            throw null;
        }
        C13638.requireNonNull(consumer);
        return interfaceC19282.tryAdvance((LongConsumer) new C5418(consumer, 0));
    }

    public static void a(InterfaceC19282 interfaceC19282, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            interfaceC19282.forEachRemaining((LongConsumer) consumer);
        } else {
            if (AbstractC15297.a) {
                AbstractC15297.a(interfaceC19282.getClass(), "{0} calling Spliterator.OfLong.forEachRemaining((LongConsumer) action::accept)");
                throw null;
            }
            C13638.requireNonNull(consumer);
            interfaceC19282.forEachRemaining((LongConsumer) new C5418(consumer, 0));
        }
    }
}
