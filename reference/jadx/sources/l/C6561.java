package l;

import java.util.NoSuchElementException;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۛܿ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: N1QM */
/* JADX INFO: loaded from: classes3.dex */
public final class C6561 extends AbstractC3798 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4323 f22034;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6561(C4323 c4323, int i) {
        super(i);
        this.f22034 = c4323;
    }

    @Override // l.AbstractC23936
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int mo18481(int i) {
        C4323 c4323 = this.f22034;
        return c4323.f15669.f48233[c4323.f64763 + i];
    }

    @Override // l.AbstractC3798
    /* JADX INFO: renamed from: ۙ */
    public final void mo12328(int i, int i2) {
        this.f22034.add(i, i2);
    }

    @Override // l.AbstractC3798
    /* JADX INFO: renamed from: ᩷ */
    public final void mo12331(int i, int i2) {
        this.f22034.set(i, i2);
    }

    @Override // l.AbstractC23936
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void mo18480(int i) {
        this.f22034.mo14697(i);
    }

    @Override // l.AbstractC23936
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo18479() {
        C4323 c4323 = this.f22034;
        return c4323.f64764 - c4323.f64763;
    }

    @Override // l.AbstractC23936, l.InterfaceC20343
    public final int nextInt() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        C4323 c4323 = this.f22034;
        int[] iArr = c4323.f15669.f48233;
        int i = c4323.f64763;
        int i2 = this.f77493;
        this.f77493 = i2 + 1;
        this.f77492 = i2;
        return iArr[i + i2];
    }

    @Override // l.AbstractC3798, l.InterfaceC8273
    /* JADX INFO: renamed from: ܽۙ */
    public final int mo12330() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        C4323 c4323 = this.f22034;
        int[] iArr = c4323.f15669.f48233;
        int i = c4323.f64763;
        int i2 = this.f77493 - 1;
        this.f77493 = i2;
        this.f77492 = i2;
        return iArr[i + i2];
    }

    @Override // l.AbstractC13668, l.InterfaceC24073
    public final void forEachRemaining(IntConsumer intConsumer) {
        C4323 c4323 = this.f22034;
        int[] iArr = c4323.f15669.f48233;
        int i = c4323.f64764 - c4323.f64763;
        while (true) {
            int i2 = this.f77493;
            if (i2 >= i) {
                return;
            }
            int i3 = c4323.f64763;
            this.f77493 = i2 + 1;
            this.f77492 = i2;
            intConsumer.accept(iArr[i3 + i2]);
        }
    }
}
