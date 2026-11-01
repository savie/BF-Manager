package l;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ܳᩳܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: SBH8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14693 implements InterfaceC13303 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f48011;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1991 f48012;

    public C14693(C1991 c1991) {
        this.f48012 = c1991;
        this.f48011 = C9754.m24745(0, c1991.f7444);
    }

    @Override // l.InterfaceC13303
    public final boolean hasNext() {
        return this.f48011 >= 0;
    }

    @Override // l.InterfaceC13303
    public final int next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f48011;
        this.f48011 = C9754.m24745(i + 1, this.f48012.f7444);
        return i;
    }
}
