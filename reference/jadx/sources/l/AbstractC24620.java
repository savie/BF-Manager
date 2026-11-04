package l;

import java.util.Comparator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩺᩺ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC24620 implements InterfaceC8409 {
    public final InterfaceC8409 a;
    public final AtomicBoolean b;
    public boolean c;
    public int d;

    public abstract InterfaceC8409 b(InterfaceC8409 interfaceC8409);

    @Override // l.InterfaceC8409
    public /* synthetic */ void forEachRemaining(Consumer consumer) {
        C18105.$default$forEachRemaining(this, consumer);
    }

    @Override // l.InterfaceC8409
    public final long getExactSizeIfKnown() {
        return -1L;
    }

    @Override // l.InterfaceC8409
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return C18105.$default$hasCharacteristics(this, i);
    }

    public AbstractC24620(InterfaceC8409 interfaceC8409) {
        this.c = true;
        this.a = interfaceC8409;
        this.b = new AtomicBoolean();
    }

    public AbstractC24620(InterfaceC8409 interfaceC8409, AbstractC24620 abstractC24620) {
        this.c = true;
        this.a = interfaceC8409;
        this.b = abstractC24620.b;
    }

    @Override // l.InterfaceC8409
    public final long estimateSize() {
        return this.a.estimateSize();
    }

    @Override // l.InterfaceC8409
    public final int characteristics() {
        return this.a.characteristics() & (-16449);
    }

    @Override // l.InterfaceC8409
    public final Comparator getComparator() {
        return this.a.getComparator();
    }

    @Override // l.InterfaceC8409
    public InterfaceC8409 trySplit() {
        InterfaceC8409 interfaceC8409TrySplit = this.a.trySplit();
        if (interfaceC8409TrySplit != null) {
            return b(interfaceC8409TrySplit);
        }
        return null;
    }

    public final boolean a() {
        return (this.d == 0 && this.b.get()) ? false : true;
    }

    @Override // l.InterfaceC8409
    public /* bridge */ /* synthetic */ InterfaceC7664 trySplit() {
        return (InterfaceC7664) trySplit();
    }

    @Override // l.InterfaceC8409
    public /* bridge */ /* synthetic */ InterfaceC9900 trySplit() {
        return (InterfaceC9900) trySplit();
    }

    @Override // l.InterfaceC8409
    public /* bridge */ /* synthetic */ InterfaceC3012 trySplit() {
        return (InterfaceC3012) trySplit();
    }

    @Override // l.InterfaceC8409
    public /* bridge */ /* synthetic */ InterfaceC9154 trySplit() {
        return (InterfaceC9154) trySplit();
    }
}
