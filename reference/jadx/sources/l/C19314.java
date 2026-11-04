package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ᩳ᩶ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: R2TM */
/* JADX INFO: loaded from: classes5.dex */
public final class C19314 implements Iterator {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f62405 = 0;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10363 f62406;

    public C19314(C10363 c10363) {
        this.f62406 = c10363;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        C10363 c10363;
        while (true) {
            int i = this.f62405;
            c10363 = this.f62406;
            if (i >= c10363.f32985 || !C10363.m26644(c10363, c10363.f32983[this.f62405])) {
                break;
            }
            this.f62405++;
        }
        return this.f62405 < c10363.f32985;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C10363 c10363 = this.f62406;
        String[] strArr = c10363.f32983;
        int i = this.f62405;
        C8127 c8127 = new C8127(strArr[i], (String) c10363.f32984[i], c10363);
        this.f62405++;
        return c8127;
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.f62405 - 1;
        this.f62405 = i;
        this.f62406.remove(i);
    }
}
