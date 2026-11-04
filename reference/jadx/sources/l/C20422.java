package l;

import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: l.᩵۟᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 79A7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20422 extends AbstractC12217 implements RandomAccess {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f65424;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final AbstractC12217 f65425;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f65426;

    public C20422(AbstractC12217 abstractC12217, int i, int i2) {
        this.f65425 = abstractC12217;
        this.f65426 = i;
        C15946.m38063(i, i2, abstractC12217.mo4094());
        this.f65424 = i2 - i;
    }

    @Override // l.AbstractC17438
    /* JADX INFO: renamed from: ᩷ */
    public final int mo4094() {
        return this.f65424;
    }

    @Override // l.AbstractC12217, java.util.List
    public final List subList(int i, int i2) {
        C15946.m38063(i, i2, this.f65424);
        int i3 = this.f65426;
        return new C20422(this.f65425, i + i3, i3 + i2);
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.f65424;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(C6934.m19217("index: ", i, i2, ", size: "));
        }
        return this.f65425.get(this.f65426 + i);
    }
}
