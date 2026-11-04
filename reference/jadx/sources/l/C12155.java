package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۨۚ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: R2TM */
/* JADX INFO: loaded from: classes3.dex */
public final class C12155 implements Iterator {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f39079 = 0;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6190 f39080;

    public C12155(C6190 c6190) {
        this.f39080 = c6190;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f39079 < this.f39080.f21086;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C6190 c6190 = this.f39080;
        String[] strArr = c6190.f21085;
        int i = this.f39079;
        String str = strArr[i];
        String str2 = c6190.f21084[i];
        if (str == null) {
            str = "";
        }
        C20360 c20360 = new C20360(str2, str, c6190);
        this.f39079++;
        return c20360;
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.f39079 - 1;
        this.f39079 = i;
        C6190.m17837(this.f39080, i);
    }
}
