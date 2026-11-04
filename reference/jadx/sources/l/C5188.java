package l;

import java.util.AbstractList;

/* JADX INFO: renamed from: l.ۙ᩸ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: T65P */
/* JADX INFO: loaded from: classes2.dex */
public final class C5188 extends AbstractList {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f18095;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3696 f18096;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f18097;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f18098;

    public C5188(C3696 c3696, int i, int i2, int i3) {
        this.f18096 = c3696;
        this.f18098 = i;
        this.f18095 = i2;
        this.f18097 = i3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        if (i < 0 || i >= this.f18098) {
            throw new IndexOutOfBoundsException();
        }
        C3696 c3696 = this.f18096;
        boolean z = c3696.f12703;
        int i2 = this.f18097;
        int i3 = this.f18095;
        if (z) {
            return new C5934(c3696, (i * i2) + i3);
        }
        return new C13391(c3696, (i * i2) + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f18098;
    }
}
