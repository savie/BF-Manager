package l;

/* JADX INFO: renamed from: l.᩷۬᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: Y4D9 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC20902 implements InterfaceC16669 {
    @Override // java.util.Iterator
    public final Object next() {
        return Byte.valueOf(nextByte());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
