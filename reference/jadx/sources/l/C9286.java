package l;

import android.content.Context;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l.ۢۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 43T5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9286 implements InterfaceC14225 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final CharSequence f31544;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C6938 f31545;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Drawable f31546;

    @Override // l.InterfaceC14225
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo8984() {
        return true;
    }

    public C9286(C6938 c6938) {
        this.f31545 = c6938;
        this.f31546 = c6938.getNavigationIcon();
        this.f31544 = c6938.getNavigationContentDescription();
    }

    @Override // l.InterfaceC14225
    /* JADX INFO: renamed from: ۙ */
    public final void mo8982(Drawable drawable, int i) {
        this.f31545.setNavigationIcon(drawable);
        mo8981(i);
    }

    @Override // l.InterfaceC14225
    /* JADX INFO: renamed from: ۙ */
    public final void mo8981(int i) {
        C6938 c6938 = this.f31545;
        if (i == 0) {
            c6938.setNavigationContentDescription(this.f31544);
        } else {
            c6938.setNavigationContentDescription(i);
        }
    }

    @Override // l.InterfaceC14225
    /* JADX INFO: renamed from: ۨ */
    public final Drawable mo8983() {
        return this.f31546;
    }

    @Override // l.InterfaceC14225
    /* JADX INFO: renamed from: ۙ */
    public final Context mo8980() {
        return this.f31545.getContext();
    }
}
