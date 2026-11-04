package l;

import android.database.DataSetObserver;

/* JADX INFO: renamed from: l.᩶۠᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: I5V7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21190 extends DataSetObserver implements InterfaceC4739, InterfaceC13730 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f67659;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0307 f67660;

    public C21190(C0307 c0307) {
        this.f67660 = c0307;
    }

    @Override // l.InterfaceC4739
    public final void onPageScrolled(int i, float f, int i2) {
        if (f > 0.5f) {
            i++;
        }
        this.f67660.mo1890(f, false, i);
    }

    @Override // l.InterfaceC4739
    public final void onPageSelected(int i) {
        if (this.f67659 == 0) {
            C0307 c0307 = this.f67660;
            C15179 c15179 = c0307.f1647;
            c0307.m1892(c15179.f49522, c15179.f49541);
            float f = c0307.f1640;
            if (f < 0.0f) {
                f = 0.0f;
            }
            c0307.mo1890(f, true, c0307.f1647.f49522);
        }
    }

    @Override // l.InterfaceC4739
    public final void onPageScrollStateChanged(int i) {
        this.f67659 = i;
    }

    @Override // l.InterfaceC13730
    public final void onAdapterChanged(C15179 c15179, AbstractC6274 abstractC6274, AbstractC6274 abstractC6275) {
        this.f67660.m1893(abstractC6274, abstractC6275);
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        C0307 c0307 = this.f67660;
        C15179 c15179 = c0307.f1647;
        c0307.m1892(c15179.f49522, c15179.f49541);
        float f = c0307.f1640;
        if (f < 0.0f) {
            f = 0.0f;
        }
        c0307.mo1890(f, true, c0307.f1647.f49522);
    }
}
