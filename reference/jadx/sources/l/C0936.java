package l;

import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.֨ۛᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C0936 {
    public static void $default$forEachRemaining(InterfaceC12932 interfaceC12932, LongConsumer longConsumer) {
        C13638.requireNonNull(longConsumer);
        while (interfaceC12932.hasNext()) {
            longConsumer.accept(interfaceC12932.nextLong());
        }
    }

    public static Long $default$next(InterfaceC12932 interfaceC12932) {
        if (AbstractC15297.a) {
            AbstractC15297.a(interfaceC12932.getClass(), "{0} calling PrimitiveIterator.OfLong.nextLong()");
            throw null;
        }
        return Long.valueOf(interfaceC12932.nextLong());
    }
}
