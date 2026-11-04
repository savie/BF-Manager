package l;

import android.content.DialogInterface;
import android.text.TextUtils;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩵ᩳ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: NA5M */
/* JADX INFO: loaded from: classes5.dex */
public final class C20744 extends AbstractC2432 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6574 f66480;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC17204 f66481;

    public C20744(AbstractActivityC17204 abstractActivityC17204, C6574 c6574) {
        this.f66481 = abstractActivityC17204;
        this.f66480 = c6574;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        m8191(this.f66481, R.string.MT_Protector);
        C13511 c13511 = this.f7780;
        C17359.requireNonNull(c13511);
        c13511.m33188(new RunnableC22836(5, c13511));
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() {
        C6574 c6574 = this.f66480;
        C24363 c24363M18496 = c6574.m18496();
        if (!c6574.f22050.isEmpty()) {
            C6463 c6463M54459 = c24363M18496.m54459();
            c6463M54459.m18273(new C18506(c6574.f22050));
            c24363M18496 = c6463M54459.m18265();
        }
        C5947 c5947 = new C5947(c24363M18496, c6574.f22053);
        if (!TextUtils.isEmpty(c6574.f22051)) {
            c5947.m17315(c6574.f22051, c6574.f22049, false);
        }
        c5947.m17320(c6574.f22053 + "/");
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        if (this.f7780.m33196()) {
            return;
        }
        C22673.m51152(R.string.MT_Protector);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        if (this.f7780.m33196()) {
            return;
        }
        this.f66481.m40401(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        if (this.f7780.m33196()) {
            return;
        }
        m8196();
    }
}
