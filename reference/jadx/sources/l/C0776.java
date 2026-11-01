package l;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l.֨֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Y22J */
/* JADX INFO: loaded from: classes3.dex */
public final class C0776 extends C9950 {

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public C17212 f3354;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public C8746 f3355;

    public C0776(C0776 c0776, C14889 c14889, Resources resources) {
        super(c0776, c14889, resources);
        if (c0776 != null) {
            this.f34010 = c0776.f34010;
        } else {
            this.f34010 = new int[this.f58692.length][];
        }
        if (c0776 != null) {
            this.f3355 = c0776.f3355;
            this.f3354 = c0776.f3354;
        } else {
            this.f3355 = new C8746();
            this.f3354 = new C17212();
        }
    }

    @Override // l.C9950, l.AbstractC18416
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void mo3328() {
        this.f3355 = this.f3355.clone();
        this.f3354 = this.f3354.clone();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new C14889(this, null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new C14889(this, resources);
    }
}
