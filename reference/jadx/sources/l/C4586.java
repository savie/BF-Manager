package l;

import java.io.EOFException;

/* JADX INFO: renamed from: l.ۙ֫᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: B8HW */
/* JADX INFO: loaded from: classes3.dex */
public final class C4586 implements InterfaceC22024 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] f16302 = new byte[4096];

    @Override // l.InterfaceC22024
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ void mo14382(long j) {
    }

    @Override // l.InterfaceC22024
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo14383(long j, int i, int i2, int i3, C4870 c4870) {
    }

    @Override // l.InterfaceC22024
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo14384(C15648 c15648) {
    }

    @Override // l.InterfaceC22024
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int mo14386(InterfaceC9461 interfaceC9461, int i, boolean z) throws EOFException {
        byte[] bArr = this.f16302;
        int i2 = interfaceC9461.read(bArr, 0, Math.min(bArr.length, i));
        if (i2 != -1) {
            return i2;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // l.InterfaceC22024
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo14381(int i, C21287 c21287) {
        c21287.m48503(i);
    }

    @Override // l.InterfaceC22024
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo14385(C21287 c21287, int i, int i2) {
        c21287.m48503(i);
    }

    @Override // l.InterfaceC22024
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo14380(InterfaceC9461 interfaceC9461, int i, boolean z) {
        return mo14386(interfaceC9461, i, z);
    }
}
