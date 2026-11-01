package l;

import android.database.DataSetObserver;

/* JADX INFO: renamed from: l.ۙۢܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: I5V7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4565 extends DataSetObserver implements InterfaceC21499, InterfaceC15150 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f16213;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11622 f16214;

    public C4565(C11622 c11622) {
        this.f16214 = c11622;
    }

    @Override // l.InterfaceC21499
    public final void onPageScrolled(int i, float f, int i2) {
        if (f > 0.5f) {
            i++;
        }
        this.f16214.mo8750(f, false, i);
    }

    @Override // l.InterfaceC21499
    public final void onPageSelected(int i) {
        if (this.f16213 == 0) {
            C11622 c11622 = this.f16214;
            C19383 c19383 = c11622.f39041;
            c11622.m28964(c19383.f62481, c19383.f62507);
            float f = c11622.f39047;
            if (f < 0.0f) {
                f = 0.0f;
            }
            c11622.mo8750(f, true, c11622.f39041.f62481);
        }
    }

    @Override // l.InterfaceC21499
    public final void onPageScrollStateChanged(int i) {
        this.f16213 = i;
    }

    @Override // l.InterfaceC15150
    public final void onAdapterChanged(C19383 c19383, AbstractC14217 abstractC14217, AbstractC14217 abstractC14218) {
        this.f16214.m28965(abstractC14217, abstractC14218);
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        C11622 c11622 = this.f16214;
        C19383 c19383 = c11622.f39041;
        c11622.m28964(c19383.f62481, c19383.f62507);
        float f = c11622.f39047;
        if (f < 0.0f) {
            f = 0.0f;
        }
        c11622.mo8750(f, true, c11622.f39041.f62481);
    }
}
