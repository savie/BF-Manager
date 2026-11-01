package l;

import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;

/* JADX INFO: renamed from: l.ۢۤᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y7LE */
/* JADX INFO: loaded from: classes3.dex */
public final class C9529 extends AbstractC14468 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3177 f32219;

    @Override // l.AbstractC14468
    /* JADX INFO: renamed from: ۙ */
    public final void mo16284(int i) {
    }

    public C9529(C3177 c3177) {
        this.f32219 = c3177;
    }

    @Override // l.AbstractC14468
    /* JADX INFO: renamed from: ۙ */
    public final int mo16283() {
        return this.f32219.f53230.size();
    }

    @Override // l.AbstractC14468
    /* JADX INFO: renamed from: ۙ */
    public final void mo16285(int i, float f, int i2) {
        C3177 c3177 = this.f32219;
        float fM39022 = (c3177.m39022() * 2) + c3177.m39018();
        ViewParent parent = ((ImageView) c3177.f53230.get(i)).getParent();
        C13465.m32963((Object) parent, "null cannot be cast to non-null type android.view.ViewGroup");
        float left = (fM39022 * f) + ((ViewGroup) parent).getLeft();
        C15909 c15909 = c3177.f11942;
        if (c15909 != null) {
            c15909.m37819(left);
        }
    }
}
