package l;

import java.util.Iterator;
import java.util.stream.BaseStream;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/* JADX INFO: renamed from: l.ۖۗᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2264 implements InterfaceC6124 {
    public final /* synthetic */ BaseStream a;

    public /* synthetic */ C2264(BaseStream baseStream) {
        this.a = baseStream;
    }

    public static /* synthetic */ InterfaceC6124 b(BaseStream baseStream) {
        if (baseStream == null) {
            return null;
        }
        if (baseStream instanceof C18493) {
            return ((C18493) baseStream).a;
        }
        if (baseStream instanceof DoubleStream) {
            return C10692.b((DoubleStream) baseStream);
        }
        if (baseStream instanceof IntStream) {
            return C3301.convert((IntStream) baseStream);
        }
        if (baseStream instanceof LongStream) {
            return C17116.b((LongStream) baseStream);
        }
        return baseStream instanceof Stream ? C4381.b((Stream) baseStream) : new C2264(baseStream);
    }

    @Override // l.InterfaceC6124, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        BaseStream baseStream = this.a;
        if (obj instanceof C2264) {
            obj = ((C2264) obj).a;
        }
        return baseStream.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // l.InterfaceC6124
    public final /* synthetic */ boolean isParallel() {
        return this.a.isParallel();
    }

    @Override // l.InterfaceC6124
    public final /* synthetic */ Iterator iterator() {
        return this.a.iterator();
    }

    @Override // l.InterfaceC6124
    public final /* synthetic */ InterfaceC6124 onClose(Runnable runnable) {
        return b(this.a.onClose(runnable));
    }

    @Override // l.InterfaceC6124, l.InterfaceC19386
    public final /* synthetic */ InterfaceC6124 parallel() {
        return b(this.a.parallel());
    }

    @Override // l.InterfaceC6124, l.InterfaceC19386
    public final /* synthetic */ InterfaceC6124 sequential() {
        return b(this.a.sequential());
    }

    @Override // l.InterfaceC6124
    public final /* synthetic */ InterfaceC20693 spliterator() {
        return C12696.a(this.a.spliterator());
    }

    @Override // l.InterfaceC6124
    public final /* synthetic */ InterfaceC6124 unordered() {
        return b(this.a.unordered());
    }
}
