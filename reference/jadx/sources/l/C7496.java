package l;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.۟۬᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: Y4D9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7496 extends AbstractC20902 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC23725 f24962;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f24963;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f24964 = 0;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f24964 < this.f24963;
    }

    @Override // l.InterfaceC16669
    public final byte nextByte() {
        int i = this.f24964;
        if (i >= this.f24963) {
            throw new NoSuchElementException();
        }
        this.f24964 = i + 1;
        return this.f24962.mo16492(i);
    }

    public C7496(AbstractC23725 abstractC23725) {
        this.f24962 = abstractC23725;
        this.f24963 = abstractC23725.size();
    }
}
