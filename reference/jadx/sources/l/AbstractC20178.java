package l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ᩴ᩻ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: TUG */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC20178 implements InterfaceC8409 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC8409 f64809;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f64810;

    @Override // l.InterfaceC8409
    public /* synthetic */ void forEachRemaining(Consumer consumer) {
        C18105.$default$forEachRemaining(this, consumer);
    }

    @Override // l.InterfaceC8409
    public /* synthetic */ Comparator getComparator() {
        return C18105.$default$getComparator(this);
    }

    @Override // l.InterfaceC8409
    public /* synthetic */ long getExactSizeIfKnown() {
        return C18105.$default$getExactSizeIfKnown(this);
    }

    @Override // l.InterfaceC8409
    public /* synthetic */ boolean hasCharacteristics(int i) {
        return C18105.$default$hasCharacteristics(this, i);
    }

    public AbstractC20178(InterfaceC8409 interfaceC8409, long j) {
        this.f64809 = interfaceC8409;
        this.f64810 = j;
    }

    @Override // l.InterfaceC8409
    public final InterfaceC8409 trySplit() {
        InterfaceC8409 interfaceC8409TrySplit = this.f64809.trySplit();
        if (interfaceC8409TrySplit == null) {
            return null;
        }
        long j = this.f64810;
        C11227 c11227 = new C11227(interfaceC8409TrySplit, j, ((C11227) this).f35417);
        this.f64810 = interfaceC8409TrySplit.getExactSizeIfKnown() + j;
        return c11227;
    }

    @Override // l.InterfaceC8409
    public final long estimateSize() {
        return this.f64809.estimateSize();
    }

    @Override // l.InterfaceC8409
    public final int characteristics() {
        return this.f64809.characteristics() & 16464;
    }
}
