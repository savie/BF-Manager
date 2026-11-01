package l;

import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: l.۟ܳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC7535 extends InterfaceC10110 {
    void forEachRemaining(DoubleConsumer doubleConsumer);

    boolean tryAdvance(DoubleConsumer doubleConsumer);

    @Override // l.InterfaceC10110, l.InterfaceC20693
    InterfaceC7535 trySplit();
}
