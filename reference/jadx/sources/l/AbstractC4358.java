package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۙۖܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: J7MN */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4358 extends AbstractC3216 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public byte[] f15591;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public volatile boolean f15592;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo12200(int i, byte[] bArr);

    public AbstractC4358(InterfaceC15785 interfaceC15785, C12257 c12257, C7648 c7648, int i, Object obj, byte[] bArr) {
        super(interfaceC15785, c12257, 3, c7648, i, obj, -9223372036854775807L, -9223372036854775807L);
        this.f15591 = bArr == null ? C17983.f57507 : bArr;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final byte[] m12201() {
        return this.f15591;
    }

    @Override // l.InterfaceC1411
    /* JADX INFO: renamed from: ܰ */
    public final void mo2335() {
        this.f15592 = true;
    }

    @Override // l.InterfaceC1411
    /* JADX INFO: renamed from: ۙ */
    public final void mo2330() {
        try {
            this.f12012.mo9272(this.f12016);
            int i = 0;
            int i2 = 0;
            while (i != -1 && !this.f15592) {
                byte[] bArr = this.f15591;
                if (bArr.length < i2 + 16384) {
                    this.f15591 = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                i = this.f12012.read(this.f15591, i2, 16384);
                if (i != -1) {
                    i2 += i;
                }
            }
            if (!this.f15592) {
                mo12200(i2, this.f15591);
            }
        } finally {
            C22851.m50584(this.f12012);
        }
    }
}
