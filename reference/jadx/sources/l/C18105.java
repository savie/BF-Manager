package l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܿۚۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C18105 {
    public static void $default$forEachRemaining(InterfaceC8409 interfaceC8409, Consumer consumer) {
        while (interfaceC8409.tryAdvance(consumer)) {
        }
    }

    public static long $default$getExactSizeIfKnown(InterfaceC8409 interfaceC8409) {
        if ((interfaceC8409.characteristics() & 64) == 0) {
            return -1L;
        }
        return interfaceC8409.estimateSize();
    }

    public static boolean $default$hasCharacteristics(InterfaceC8409 interfaceC8409, int i) {
        return (interfaceC8409.characteristics() & i) == i;
    }

    public static Comparator $default$getComparator(InterfaceC8409 interfaceC8409) {
        throw new IllegalStateException();
    }
}
