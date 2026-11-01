package l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;

/* JADX INFO: renamed from: l.ۜۖ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6470 extends AbstractC14316 implements IntConsumer, InterfaceC18576 {
    public final IntPredicate e;
    public int f;

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return C7100.$default$andThen(this, intConsumer);
    }

    @Override // l.AbstractC14316, l.InterfaceC20693
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C17870.a(this, consumer);
    }

    @Override // l.InterfaceC10110
    public final /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        C17870.$default$forEachRemaining(this, intConsumer);
    }

    @Override // l.InterfaceC20693
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C17870.b(this, consumer);
    }

    public AbstractC6470(InterfaceC18576 interfaceC18576, IntPredicate intPredicate) {
        super(interfaceC18576);
        this.e = intPredicate;
    }

    public AbstractC6470(InterfaceC18576 interfaceC18576, AbstractC6470 abstractC6470) {
        super(interfaceC18576, abstractC6470);
        this.e = abstractC6470.e;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        this.d = (this.d + 1) & 63;
        this.f = i;
    }

    @Override // l.InterfaceC10110
    public /* bridge */ /* synthetic */ boolean tryAdvance(Object obj) {
        return tryAdvance((IntConsumer) obj);
    }
}
