package l;

import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۗۚۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3189 {
    public static void $default$forEachRemaining(InterfaceC20343 interfaceC20343, IntConsumer intConsumer) {
        C17359.requireNonNull(intConsumer);
        while (interfaceC20343.hasNext()) {
            intConsumer.accept(interfaceC20343.nextInt());
        }
    }

    public static Integer $default$next(InterfaceC20343 interfaceC20343) {
        if (AbstractC21658.a) {
            AbstractC21658.a(interfaceC20343.getClass(), "{0} calling PrimitiveIterator.OfInt.nextInt()");
            throw null;
        }
        return Integer.valueOf(interfaceC20343.nextInt());
    }
}
