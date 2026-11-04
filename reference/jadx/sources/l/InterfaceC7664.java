package l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.۟ۚۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC7664 extends InterfaceC9154 {
    @Override // l.InterfaceC8409
    void forEachRemaining(Consumer consumer);

    void forEachRemaining(IntConsumer intConsumer);

    boolean tryAdvance(Consumer consumer);

    boolean tryAdvance(IntConsumer intConsumer);

    @Override // l.InterfaceC9154, l.InterfaceC8409
    InterfaceC7664 trySplit();
}
