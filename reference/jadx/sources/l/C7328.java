package l;

import java.util.NoSuchElementException;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ۜᩳ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: QCDS */
/* JADX INFO: loaded from: classes4.dex */
public final class C7328 extends AbstractC24220 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4828 f24144;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7328(C4828 c4828, int i) {
        super(i);
        this.f24144 = c4828;
    }

    @Override // l.AbstractC6320
    /* JADX INFO: renamed from: ᩷ */
    public final long mo18041(int i) {
        C4828 c4828 = this.f24144;
        return c4828.f16885.f70927[c4828.f50532 + i];
    }

    @Override // l.AbstractC24220
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo20101(int i, long j) {
        this.f24144.mo37193(i, j);
    }

    @Override // l.AbstractC24220
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo20102(int i, long j) {
        this.f24144.set(i, j);
    }

    @Override // l.AbstractC6320
    /* JADX INFO: renamed from: ۤ */
    public final void mo18040(int i) {
        this.f24144.mo37196(i);
    }

    @Override // l.AbstractC6320
    /* JADX INFO: renamed from: ۙ */
    public final int mo18039() {
        C4828 c4828 = this.f24144;
        return c4828.f50533 - c4828.f50532;
    }

    @Override // l.AbstractC6320, l.InterfaceC6173
    public final long nextLong() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        C4828 c4828 = this.f24144;
        long[] jArr = c4828.f16885.f70927;
        int i = c4828.f50532;
        int i2 = this.f21423;
        this.f21423 = i2 + 1;
        this.f21422 = i2;
        return jArr[i + i2];
    }

    @Override // l.AbstractC24220, l.InterfaceC0353
    /* JADX INFO: renamed from: ᩴۙ */
    public final long mo2123() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        C4828 c4828 = this.f24144;
        long[] jArr = c4828.f16885.f70927;
        int i = c4828.f50532;
        int i2 = this.f21423 - 1;
        this.f21423 = i2;
        this.f21422 = i2;
        return jArr[i + i2];
    }

    @Override // l.AbstractC5091, l.InterfaceC24073
    public final void forEachRemaining(LongConsumer longConsumer) {
        C4828 c4828 = this.f24144;
        long[] jArr = c4828.f16885.f70927;
        int i = c4828.f50533 - c4828.f50532;
        while (true) {
            int i2 = this.f21423;
            if (i2 >= i) {
                return;
            }
            int i3 = c4828.f50532;
            this.f21423 = i2 + 1;
            this.f21422 = i2;
            longConsumer.accept(jArr[i3 + i2]);
        }
    }
}
