package l;

import java.util.Iterator;
import java.util.stream.BaseStream;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/* JADX INFO: renamed from: l.ۗܶۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C3494 implements InterfaceC19924 {
    public final /* synthetic */ BaseStream a;

    public /* synthetic */ C3494(BaseStream baseStream) {
        this.a = baseStream;
    }

    public static /* synthetic */ InterfaceC19924 b(BaseStream baseStream) {
        if (baseStream == null) {
            return null;
        }
        if (baseStream instanceof C19156) {
            return ((C19156) baseStream).a;
        }
        if (baseStream instanceof DoubleStream) {
            return C1301.b((DoubleStream) baseStream);
        }
        if (baseStream instanceof IntStream) {
            return C25146.convert((IntStream) baseStream);
        }
        if (baseStream instanceof LongStream) {
            return C18785.b((LongStream) baseStream);
        }
        return baseStream instanceof Stream ? C18410.b((Stream) baseStream) : new C3494(baseStream);
    }

    @Override // l.InterfaceC19924, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        BaseStream baseStream = this.a;
        if (obj instanceof C3494) {
            obj = ((C3494) obj).a;
        }
        return baseStream.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // l.InterfaceC19924
    public final /* synthetic */ boolean isParallel() {
        return this.a.isParallel();
    }

    @Override // l.InterfaceC19924
    public final /* synthetic */ Iterator iterator() {
        return this.a.iterator();
    }

    @Override // l.InterfaceC19924
    public final /* synthetic */ InterfaceC19924 onClose(Runnable runnable) {
        return b(this.a.onClose(runnable));
    }

    @Override // l.InterfaceC19924
    public final /* synthetic */ InterfaceC19924 parallel() {
        return b(this.a.parallel());
    }

    @Override // l.InterfaceC19924
    public final /* synthetic */ InterfaceC19924 sequential() {
        return b(this.a.sequential());
    }

    @Override // l.InterfaceC19924
    public final /* synthetic */ InterfaceC8409 spliterator() {
        return C19553.a(this.a.spliterator());
    }

    @Override // l.InterfaceC19924
    public final /* synthetic */ InterfaceC19924 unordered() {
        return b(this.a.unordered());
    }
}
