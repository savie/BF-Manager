package l;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.᩷᩶ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y4D9 */
/* JADX INFO: loaded from: classes.dex */
public final class C22306 extends AbstractC11117 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f72214;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC17084 f72215;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f72216 = 0;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f72216 < this.f72214;
    }

    @Override // l.InterfaceC13355
    public final byte nextByte() {
        int i = this.f72216;
        if (i >= this.f72214) {
            throw new NoSuchElementException();
        }
        this.f72216 = i + 1;
        return this.f72215.mo29727(i);
    }

    public C22306(AbstractC17084 abstractC17084) {
        this.f72215 = abstractC17084;
        this.f72214 = abstractC17084.size();
    }
}
