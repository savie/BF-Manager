package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۘۤ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: J7MN */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4102 extends AbstractC24240 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public byte[] f13967;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public volatile boolean f13968;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo13194(int i, byte[] bArr);

    public AbstractC4102(InterfaceC13433 interfaceC13433, C25368 c25368, C15648 c15648, int i, Object obj, byte[] bArr) {
        super(interfaceC13433, c25368, 3, c15648, i, obj, -9223372036854775807L, -9223372036854775807L);
        this.f13967 = bArr == null ? C7116.f23453 : bArr;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final byte[] m13195() {
        return this.f13967;
    }

    @Override // l.InterfaceC0636
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2803() {
        this.f13968 = true;
    }

    @Override // l.InterfaceC0636
    /* JADX INFO: renamed from: ۙ */
    public final void mo2802() {
        try {
            this.f78507.mo8326(this.f78513);
            int i = 0;
            int i2 = 0;
            while (i != -1 && !this.f13968) {
                byte[] bArr = this.f13967;
                if (bArr.length < i2 + 16384) {
                    this.f13967 = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                i = this.f78507.read(this.f13967, i2, 16384);
                if (i != -1) {
                    i2 += i;
                }
            }
            if (!this.f13968) {
                mo13194(i2, this.f13967);
            }
        } finally {
            C18856.m43745(this.f78507);
        }
    }
}
