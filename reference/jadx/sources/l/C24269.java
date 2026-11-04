package l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩺ۨۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public final class C24269 implements InterfaceC8409, Consumer {
    public static final Object d = new Object();
    public final InterfaceC8409 a;
    public final ConcurrentMapC17249 b;
    public Object c;

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return C12312.$default$andThen(this, consumer);
    }

    @Override // l.InterfaceC8409
    public final /* synthetic */ long getExactSizeIfKnown() {
        return C18105.$default$getExactSizeIfKnown(this);
    }

    @Override // l.InterfaceC8409
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return C18105.$default$hasCharacteristics(this, i);
    }

    public C24269(InterfaceC8409 interfaceC8409, ConcurrentMapC17249 concurrentMapC17249) {
        this.a = interfaceC8409;
        this.b = concurrentMapC17249;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.c = obj;
    }

    @Override // l.InterfaceC8409, l.InterfaceC7664
    public final boolean tryAdvance(Consumer consumer) {
        while (this.a.tryAdvance(this)) {
            Object obj = this.c;
            if (obj == null) {
                obj = d;
            }
            if (this.b.putIfAbsent(obj, Boolean.TRUE) == null) {
                consumer.accept(this.c);
                this.c = null;
                return true;
            }
        }
        return false;
    }

    @Override // l.InterfaceC8409
    public final void forEachRemaining(Consumer consumer) {
        this.a.forEachRemaining(new C15602(8, this, consumer));
    }

    @Override // l.InterfaceC8409
    public final InterfaceC8409 trySplit() {
        InterfaceC8409 interfaceC8409TrySplit = this.a.trySplit();
        if (interfaceC8409TrySplit != null) {
            return new C24269(interfaceC8409TrySplit, this.b);
        }
        return null;
    }

    @Override // l.InterfaceC8409
    public final long estimateSize() {
        return this.a.estimateSize();
    }

    @Override // l.InterfaceC8409
    public final int characteristics() {
        return (this.a.characteristics() & (-16469)) | 1;
    }

    @Override // l.InterfaceC8409
    public final Comparator getComparator() {
        return this.a.getComparator();
    }
}
