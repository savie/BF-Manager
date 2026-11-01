package l;

import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.᩵ۛᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC19282 extends InterfaceC10110 {
    @Override // l.InterfaceC20693
    void forEachRemaining(Consumer consumer);

    void forEachRemaining(LongConsumer longConsumer);

    @Override // l.InterfaceC20693
    boolean tryAdvance(Consumer consumer);

    boolean tryAdvance(LongConsumer longConsumer);

    @Override // l.InterfaceC10110, l.InterfaceC20693
    InterfaceC19282 trySplit();
}
