package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۚۛᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: R2TM */
/* JADX INFO: loaded from: classes2.dex */
public final class C5169 implements Iterator {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f17938 = 0;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22103 f17939;

    public C5169(C22103 c22103) {
        this.f17939 = c22103;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f17938 < this.f17939.f71581;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C22103 c22103 = this.f17939;
        String[] strArr = c22103.f71579;
        int i = this.f17938;
        String str = strArr[i];
        String str2 = c22103.f71580[i];
        if (str == null) {
            str = "";
        }
        C2346 c2346 = new C2346(str2, str, c22103);
        this.f17938++;
        return c2346;
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.f17938 - 1;
        this.f17938 = i;
        C22103.m49043(this.f17939, i);
    }
}
