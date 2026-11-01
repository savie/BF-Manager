package l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩸ۛᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C21398 {
    public static void $default$forEachRemaining(InterfaceC20693 interfaceC20693, Consumer consumer) {
        while (interfaceC20693.tryAdvance(consumer)) {
        }
    }

    public static long $default$getExactSizeIfKnown(InterfaceC20693 interfaceC20693) {
        if ((interfaceC20693.characteristics() & 64) == 0) {
            return -1L;
        }
        return interfaceC20693.estimateSize();
    }

    public static boolean $default$hasCharacteristics(InterfaceC20693 interfaceC20693, int i) {
        return (interfaceC20693.characteristics() & i) == i;
    }

    public static Comparator $default$getComparator(InterfaceC20693 interfaceC20693) {
        throw new IllegalStateException();
    }
}
