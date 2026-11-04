package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.۟ܺۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: S5VI */
/* JADX INFO: loaded from: classes4.dex */
public final class C7996 extends C14707 implements Iterable {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18437 m21802(int i) {
        C12470 c12470 = this.f48049;
        return new C18437(c12470, (C21421) c12470.f40055[this.f48053], (int) ((((long) i) * this.f48050) + this.f48048));
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0538(this);
    }
}
