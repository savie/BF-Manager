package l;

import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: l.ۖ᩻ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC3012 extends InterfaceC9154 {
    void forEachRemaining(DoubleConsumer doubleConsumer);

    boolean tryAdvance(DoubleConsumer doubleConsumer);

    @Override // l.InterfaceC9154, l.InterfaceC8409
    InterfaceC3012 trySplit();
}
