package l;

import java.util.stream.Stream;

/* JADX INFO: renamed from: l.ۢ۠᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: U5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10003 extends C22684 implements InterfaceC7767, InterfaceC14375 {
    public static final long serialVersionUID = -7046029254386353129L;

    @Override // l.C22684, java.util.Collection
    public /* synthetic */ Stream parallelStream() {
        return C3516.convert(mo52748parallelStream());
    }

    @Override // l.C22684, java.util.Collection
    public /* synthetic */ Stream stream() {
        return C3516.convert(mo52749stream());
    }

    @Override // l.C22684, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        boolean zRemove;
        synchronized (this.f73659) {
            zRemove = this.f73658.remove(obj);
        }
        return zRemove;
    }

    @Override // l.C22684, l.InterfaceC21938, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC15224 iterator() {
        return this.f73658.iterator();
    }

    @Override // l.C22684, java.util.Collection, l.InterfaceC9372
    /* JADX INFO: renamed from: stream */
    public final InterfaceC20670 mo52749stream() {
        return C1170.stream(this.f73658);
    }

    @Override // l.C22684, java.util.Collection, l.InterfaceC9372
    /* JADX INFO: renamed from: parallelStream */
    public final InterfaceC20670 mo52748parallelStream() {
        return C1170.parallelStream(this.f73658);
    }
}
