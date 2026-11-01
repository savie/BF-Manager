package l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ᩴۛᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC18576 extends InterfaceC10110 {
    @Override // l.InterfaceC20693
    void forEachRemaining(Consumer consumer);

    void forEachRemaining(IntConsumer intConsumer);

    @Override // l.InterfaceC20693
    boolean tryAdvance(Consumer consumer);

    boolean tryAdvance(IntConsumer intConsumer);

    @Override // l.InterfaceC10110, l.InterfaceC20693
    InterfaceC18576 trySplit();
}
