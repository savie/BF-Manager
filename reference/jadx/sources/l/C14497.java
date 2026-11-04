package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ܰۡ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: NAX7 */
/* JADX INFO: loaded from: classes4.dex */
public class C14497 implements Iterable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final char f45619 = (char) C16237.m38538(1, 0, 1);

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f45620 = 1;

    public final char getLast() {
        return this.f45619;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C21211(this.f45619, this.f45620);
    }
}
