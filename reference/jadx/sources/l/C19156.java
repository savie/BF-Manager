package l;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.stream.BaseStream;

/* JADX INFO: renamed from: l.ᩳܶۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C19156 implements BaseStream {
    public final /* synthetic */ InterfaceC19924 a;

    public /* synthetic */ C19156(InterfaceC19924 interfaceC19924) {
        this.a = interfaceC19924;
    }

    public static /* synthetic */ BaseStream b(InterfaceC19924 interfaceC19924) {
        if (interfaceC19924 == null) {
            return null;
        }
        if (interfaceC19924 instanceof C3494) {
            return ((C3494) interfaceC19924).a;
        }
        if (interfaceC19924 instanceof InterfaceC20648) {
            return C15426.b((InterfaceC20648) interfaceC19924);
        }
        if (interfaceC19924 instanceof InterfaceC17686) {
            return C16940.convert((InterfaceC17686) interfaceC19924);
        }
        if (interfaceC19924 instanceof InterfaceC16194) {
            return C23018.b((InterfaceC16194) interfaceC19924);
        }
        return interfaceC19924 instanceof InterfaceC20670 ? C3516.convert((InterfaceC20670) interfaceC19924) : new C19156(interfaceC19924);
    }

    @Override // java.util.stream.BaseStream, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC19924 interfaceC19924 = this.a;
        if (obj instanceof C19156) {
            obj = ((C19156) obj).a;
        }
        return interfaceC19924.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ boolean isParallel() {
        return this.a.isParallel();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ Iterator iterator() {
        return this.a.iterator();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream onClose(Runnable runnable) {
        return b(this.a.onClose(runnable));
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream parallel() {
        return b(this.a.parallel());
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream sequential() {
        return b(this.a.sequential());
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ Spliterator spliterator() {
        return C2443.convert(this.a.spliterator());
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream unordered() {
        return b(this.a.unordered());
    }
}
