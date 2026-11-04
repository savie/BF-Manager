package l;

import java.io.DataOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۗ۫ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 970R */
/* JADX INFO: loaded from: classes3.dex */
public final class C3416 implements InterfaceC16840 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC0433 f11088;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final byte[] f11089;

    @Override // l.InterfaceC16840
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long mo11177(int i, int i2) {
        return mo11169();
    }

    public C3416(AbstractC0433 abstractC0433, byte[] bArr) {
        if (abstractC0433.mo2248() != bArr.length || bArr.length == 0) {
            throw new IllegalArgumentException("Invalid literal patch layer");
        }
        this.f11088 = abstractC0433;
        this.f11089 = bArr;
    }

    @Override // l.InterfaceC16840
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo11171(final int i, final byte[] bArr, int i2, final int i3) {
        this.f11088.mo2243(i, i2, new InterfaceC25046() { // from class: l.᩹۫ܳ
            @Override // l.InterfaceC25046
            /* JADX INFO: renamed from: ۙ */
            public final void mo16641(int i4, int i5) {
                C3416.m11168(this.f76085, bArr, i3, i, i4, i5);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m11168(C3416 c3416, byte[] bArr, int i, int i2, int i3, int i4) {
        bArr[(i + i4) - i2] = c3416.f11089[i3];
    }

    @Override // l.InterfaceC16840
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo11173(final byte[] bArr, final int i, int i2, final long[] jArr) {
        this.f11088.mo2243(i, i2, new InterfaceC25046() { // from class: l.ܽ۫ܳ
            @Override // l.InterfaceC25046
            /* JADX INFO: renamed from: ۙ */
            public final void mo16641(int i3, int i4) {
                C3416.m11167(this.f57105, i, bArr, jArr, i3, i4);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m11167(C3416 c3416, int i, byte[] bArr, long[] jArr, int i2, int i3) {
        int i4 = i3 - i;
        bArr[i4] = c3416.f11089[i2];
        int i5 = i4 >>> 6;
        jArr[i5] = jArr[i5] | (1 << (i4 & 63));
    }

    @Override // l.InterfaceC16840
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo11170(final int i, int i2, final long[] jArr) {
        this.f11088.mo2243(i, i2, new InterfaceC25046() { // from class: l.ܶ۫ܳ
            @Override // l.InterfaceC25046
            /* JADX INFO: renamed from: ۙ */
            public final void mo16641(int i3, int i4) {
                int i5 = i4 - i;
                int i6 = i5 >>> 6;
                long[] jArr2 = jArr;
                jArr2[i6] = jArr2[i6] | (1 << (i5 & 63));
            }
        });
    }

    @Override // l.InterfaceC16840
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo11174(int i, int i2) {
        return this.f11088.mo2240(i, i2) != 0;
    }

    @Override // l.InterfaceC16840
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final long mo11176() {
        return this.f11088.mo2251() + ((long) this.f11089.length);
    }

    @Override // l.InterfaceC16840
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long mo11169() {
        return (((long) this.f11088.mo2248()) * 9) + 128;
    }

    @Override // l.InterfaceC16840
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo11175(InterfaceC16840 interfaceC16840) {
        return (interfaceC16840 instanceof C3416) && this.f11088.mo2247(((C3416) interfaceC16840).f11088);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11172(DataOutputStream dataOutputStream, int i, int i2) throws IOException {
        AbstractC0433 abstractC0433 = this.f11088;
        dataOutputStream.writeInt(abstractC0433.mo2240(i, i2));
        for (int i3 = 0; i3 < abstractC0433.mo2248(); i3++) {
            int iMo2249 = abstractC0433.mo2249(i3);
            if (iMo2249 >= i && iMo2249 < i2) {
                dataOutputStream.writeInt(iMo2249 - i);
                dataOutputStream.writeByte(this.f11089[i3]);
            }
        }
    }
}
