package l;

import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ۢۚۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC9900 extends InterfaceC9154 {
    @Override // l.InterfaceC8409
    void forEachRemaining(Consumer consumer);

    void forEachRemaining(LongConsumer longConsumer);

    @Override // l.InterfaceC8409, l.InterfaceC7664
    boolean tryAdvance(Consumer consumer);

    boolean tryAdvance(LongConsumer longConsumer);

    @Override // l.InterfaceC9154, l.InterfaceC8409
    InterfaceC9900 trySplit();
}
