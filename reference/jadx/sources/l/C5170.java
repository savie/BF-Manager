package l;

import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۚۛᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5170 {
    public static void $default$forEachRemaining(InterfaceC22104 interfaceC22104, IntConsumer intConsumer) {
        C13638.requireNonNull(intConsumer);
        while (interfaceC22104.hasNext()) {
            intConsumer.accept(interfaceC22104.nextInt());
        }
    }

    public static Integer $default$next(InterfaceC22104 interfaceC22104) {
        if (AbstractC15297.a) {
            AbstractC15297.a(interfaceC22104.getClass(), "{0} calling PrimitiveIterator.OfInt.nextInt()");
            throw null;
        }
        return Integer.valueOf(interfaceC22104.nextInt());
    }
}
