package l;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.stream.BaseStream;

/* JADX INFO: renamed from: l.ᩴۗᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C18493 implements BaseStream {
    public final /* synthetic */ InterfaceC6124 a;

    public /* synthetic */ C18493(InterfaceC6124 interfaceC6124) {
        this.a = interfaceC6124;
    }

    public static /* synthetic */ BaseStream b(InterfaceC6124 interfaceC6124) {
        if (interfaceC6124 == null) {
            return null;
        }
        if (interfaceC6124 instanceof C2264) {
            return ((C2264) interfaceC6124).a;
        }
        if (interfaceC6124 instanceof InterfaceC19386) {
            return C22208.b((InterfaceC19386) interfaceC6124);
        }
        if (interfaceC6124 instanceof InterfaceC13514) {
            return C4340.convert((InterfaceC13514) interfaceC6124);
        }
        if (interfaceC6124 instanceof InterfaceC18796) {
            return C2567.b((InterfaceC18796) interfaceC6124);
        }
        return interfaceC6124 instanceof InterfaceC5046 ? C2223.convert((InterfaceC5046) interfaceC6124) : new C18493(interfaceC6124);
    }

    @Override // java.util.stream.BaseStream, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC6124 interfaceC6124 = this.a;
        if (obj instanceof C18493) {
            obj = ((C18493) obj).a;
        }
        return interfaceC6124.equals(obj);
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
        return C7287.convert(this.a.spliterator());
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream unordered() {
        return b(this.a.unordered());
    }
}
