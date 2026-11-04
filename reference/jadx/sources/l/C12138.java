package l;

import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ۨۚۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C12138 {
    public static void $default$forEachRemaining(InterfaceC6173 interfaceC6173, LongConsumer longConsumer) {
        C17359.requireNonNull(longConsumer);
        while (interfaceC6173.hasNext()) {
            longConsumer.accept(interfaceC6173.nextLong());
        }
    }

    public static Long $default$next(InterfaceC6173 interfaceC6173) {
        if (AbstractC21658.a) {
            AbstractC21658.a(interfaceC6173.getClass(), "{0} calling PrimitiveIterator.OfLong.nextLong()");
            throw null;
        }
        return Long.valueOf(interfaceC6173.nextLong());
    }
}
