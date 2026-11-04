package l;

import java.util.AbstractList;

/* JADX INFO: renamed from: l.ܿ᩷ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: M605 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18590 extends AbstractList {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22737 f60383;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f60384;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f60385;

    public C18590(C22737 c22737, int i, int i2) {
        this.f60383 = c22737;
        this.f60385 = i;
        this.f60384 = i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        C24975 c24975 = this.f60383.f73785;
        return c24975.m55822(c24975.m55818().m8721((i * 2) + this.f60385 + 4));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f60384;
    }
}
