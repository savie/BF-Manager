package l;

import java.util.stream.Stream;

/* JADX INFO: renamed from: l.᩵ۡᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: U5 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19366 extends C12620 implements InterfaceC18660, InterfaceC22810 {
    public static final long serialVersionUID = -7046029254386353129L;

    @Override // l.C12620, java.util.Collection
    public /* synthetic */ Stream parallelStream() {
        return C2223.convert(parallelStream());
    }

    @Override // l.C12620, java.util.Collection
    public /* synthetic */ Stream stream() {
        return C2223.convert(stream());
    }

    @Override // l.C12620, java.util.Collection
    public final boolean remove(Object obj) {
        boolean zRemove;
        synchronized (this.f42174) {
            zRemove = this.f42173.remove(obj);
        }
        return zRemove;
    }

    @Override // l.C12620, l.InterfaceC0624, java.util.Collection, java.lang.Iterable, l.InterfaceC18660, java.util.Set
    public final InterfaceC6269 iterator() {
        return this.f42173.iterator();
    }

    @Override // l.C12620, java.util.Collection, l.InterfaceC10441
    public final InterfaceC5046 stream() {
        return C9030.stream(this.f42173);
    }

    @Override // l.C12620, java.util.Collection, l.InterfaceC10441
    public final InterfaceC5046 parallelStream() {
        return C9030.parallelStream(this.f42173);
    }
}
