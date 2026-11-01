package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.᩺᩵ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: R2TM */
/* JADX INFO: loaded from: classes.dex */
public final class C23197 implements Iterator {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f75299 = 0;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15436 f75300;

    public C23197(C15436 c15436) {
        this.f75300 = c15436;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        C15436 c15436;
        while (true) {
            int i = this.f75299;
            c15436 = this.f75300;
            if (i >= c15436.f50306 || !C15436.m36927(c15436, c15436.f50305[this.f75299])) {
                break;
            }
            this.f75299++;
        }
        return this.f75299 < c15436.f50306;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C15436 c15436 = this.f75300;
        String[] strArr = c15436.f50305;
        int i = this.f75299;
        C6968 c6968 = new C6968(strArr[i], (String) c15436.f50304[i], c15436);
        this.f75299++;
        return c6968;
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.f75299 - 1;
        this.f75299 = i;
        this.f75300.remove(i);
    }
}
