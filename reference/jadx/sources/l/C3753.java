package l;

import java.util.Spliterator;

/* JADX INFO: renamed from: l.ۗ᩺᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 1N3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3753 extends AbstractC1296 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1516 f12871;

    @Override // l.AbstractC1296, java.util.Collection, java.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return C2443.convert(spliterator());
    }

    public C3753(C1516 c1516) {
        this.f12871 = c1516;
    }

    @Override // l.AbstractC1296, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final InterfaceC19963 iterator() {
        return new C19415(this.f12871);
    }

    @Override // l.AbstractC1296, java.util.Collection, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC21938, l.InterfaceC22091, l.InterfaceC13409
    public final InterfaceC8409 spliterator() {
        return new C10464(this.f12871);
    }

    @Override // l.InterfaceC22947
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo12190(InterfaceC22201 interfaceC22201) {
        C1516 c1516 = this.f12871;
        int[] iArr = c1516.f5295;
        byte[] bArr = c1516.f5289;
        if (c1516.f5294) {
            interfaceC22201.mo19900(bArr[c1516.f5288]);
        }
        int i = c1516.f5288;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            if (iArr[i2] != 0) {
                interfaceC22201.mo19900(bArr[i2]);
            }
            i = i2;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f12871.f5292;
    }

    @Override // l.InterfaceC8753
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean mo12189(byte b) {
        return this.f12871.m5391(b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f12871.clear();
    }
}
