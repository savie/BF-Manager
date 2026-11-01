package l;

import java.util.AbstractList;

/* JADX INFO: renamed from: l.ۡܳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: T65P */
/* JADX INFO: loaded from: classes3.dex */
public final class C8948 extends AbstractList {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f30670;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9654 f30671;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f30672;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f30673;

    public C8948(C9654 c9654, int i, int i2, int i3) {
        this.f30671 = c9654;
        this.f30673 = i;
        this.f30672 = i2;
        this.f30670 = i3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        if (i < 0 || i >= this.f30673) {
            throw new IndexOutOfBoundsException();
        }
        C9654 c9654 = this.f30671;
        boolean z = c9654.f32459;
        int i2 = this.f30670;
        int i3 = this.f30672;
        if (z) {
            return new C16709(c9654, (i * i2) + i3);
        }
        return new C0480(c9654, (i * i2) + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f30673;
    }
}
