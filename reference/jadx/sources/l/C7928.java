package l;

import java.io.EOFException;

/* JADX INFO: renamed from: l.۠ۘܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: B8HW */
/* JADX INFO: loaded from: classes3.dex */
public final class C7928 implements InterfaceC8011 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] f26038 = new byte[4096];

    @Override // l.InterfaceC8011
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo8113(long j) {
    }

    @Override // l.InterfaceC8011
    /* JADX INFO: renamed from: ۙ */
    public final void mo8114(long j, int i, int i2, int i3, C18594 c18594) {
    }

    @Override // l.InterfaceC8011
    /* JADX INFO: renamed from: ۙ */
    public final void mo8116(C7648 c7648) {
    }

    @Override // l.InterfaceC8011
    /* JADX INFO: renamed from: ܰ */
    public final int mo8117(InterfaceC6942 interfaceC6942, int i, boolean z) throws EOFException {
        byte[] bArr = this.f26038;
        int i2 = interfaceC6942.read(bArr, 0, Math.min(bArr.length, i));
        if (i2 != -1) {
            return i2;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // l.InterfaceC8011
    /* JADX INFO: renamed from: ۙ */
    public final void mo8112(int i, C2460 c2460) {
        c2460.m7535(i);
    }

    @Override // l.InterfaceC8011
    /* JADX INFO: renamed from: ۙ */
    public final void mo8115(C2460 c2460, int i, int i2) {
        c2460.m7535(i);
    }

    @Override // l.InterfaceC8011
    /* JADX INFO: renamed from: ۙ */
    public final int mo8111(InterfaceC6942 interfaceC6942, int i, boolean z) {
        return mo8117(interfaceC6942, i, z);
    }
}
