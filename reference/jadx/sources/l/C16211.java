package l;

import java.util.NoSuchElementException;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ܺ᩸ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: QCDS */
/* JADX INFO: loaded from: classes5.dex */
public final class C16211 extends AbstractC4110 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0687 f52322;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16211(C0687 c0687, int i) {
        super(i);
        this.f52322 = c0687;
    }

    @Override // l.AbstractC13284
    /* JADX INFO: renamed from: ܰ */
    public final long mo17137(int i) {
        C0687 c0687 = this.f52322;
        return c0687.f2868.f54097[c0687.f37626 + i];
    }

    @Override // l.AbstractC4110
    /* JADX INFO: renamed from: ۙ */
    public final void mo11696(int i, long j) {
        this.f52322.mo27937(i, j);
    }

    @Override // l.AbstractC4110
    /* JADX INFO: renamed from: ܰ */
    public final void mo11698(int i, long j) {
        this.f52322.set(i, j);
    }

    @Override // l.AbstractC13284
    /* JADX INFO: renamed from: ۨ */
    public final void mo17136(int i) {
        this.f52322.mo27941(i);
    }

    @Override // l.AbstractC13284
    /* JADX INFO: renamed from: ۙ */
    public final int mo17135() {
        C0687 c0687 = this.f52322;
        return c0687.f37625 - c0687.f37626;
    }

    @Override // l.AbstractC13284, l.InterfaceC12932
    public final long nextLong() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        C0687 c0687 = this.f52322;
        long[] jArr = c0687.f2868.f54097;
        int i = c0687.f37626;
        int i2 = this.f44123;
        this.f44123 = i2 + 1;
        this.f44122 = i2;
        return jArr[i + i2];
    }

    @Override // l.AbstractC4110, l.InterfaceC18222
    /* JADX INFO: renamed from: ۚۙ */
    public final long mo11697() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        C0687 c0687 = this.f52322;
        long[] jArr = c0687.f2868.f54097;
        int i = c0687.f37626;
        int i2 = this.f44123 - 1;
        this.f44123 = i2;
        this.f44122 = i2;
        return jArr[i + i2];
    }

    @Override // l.AbstractC0500, l.InterfaceC3758
    public final void forEachRemaining(LongConsumer longConsumer) {
        C0687 c0687 = this.f52322;
        long[] jArr = c0687.f2868.f54097;
        int i = c0687.f37625 - c0687.f37626;
        while (true) {
            int i2 = this.f44123;
            if (i2 >= i) {
                return;
            }
            int i3 = c0687.f37626;
            this.f44123 = i2 + 1;
            this.f44122 = i2;
            longConsumer.accept(jArr[i3 + i2]);
        }
    }
}
