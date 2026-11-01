package l;

import java.util.Spliterator;

/* JADX INFO: renamed from: l.ۚ᩹ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1N3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5648 extends AbstractC19157 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9177 f19312;

    @Override // l.AbstractC19157, java.util.Collection, java.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return C7287.convert(spliterator());
    }

    public C5648(C9177 c9177) {
        this.f19312 = c9177;
    }

    @Override // l.AbstractC19157, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, l.InterfaceC7162
    public final InterfaceC17040 iterator() {
        return new C8471(this.f19312);
    }

    @Override // l.AbstractC19157, java.util.Collection, java.lang.Iterable, l.InterfaceC10441, l.InterfaceC0624, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    public final InterfaceC20693 spliterator() {
        return new C19760(this.f19312);
    }

    @Override // l.InterfaceC12102
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo15546(InterfaceC0106 interfaceC0106) {
        C9177 c9177 = this.f19312;
        int[] iArr = c9177.f31228;
        byte[] bArr = c9177.f31233;
        if (c9177.f31234) {
            interfaceC0106.mo1138(bArr[c9177.f31231]);
        }
        int i = c9177.f31231;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            if (iArr[i2] != 0) {
                interfaceC0106.mo1138(bArr[i2]);
            }
            i = i2;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f19312.f31238;
    }

    @Override // l.InterfaceC7162
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean mo15545(byte b) {
        return this.f19312.m23609(b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f19312.clear();
    }
}
