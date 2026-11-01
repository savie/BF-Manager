package l;

import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܰ۟ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 27KL */
/* JADX INFO: loaded from: classes4.dex */
public final class C13679 extends AbstractC14468 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2388 f45139;

    @Override // l.AbstractC14468
    /* JADX INFO: renamed from: ۙ */
    public final void mo16284(int i) {
    }

    public C13679(C2388 c2388) {
        this.f45139 = c2388;
    }

    @Override // l.AbstractC14468
    /* JADX INFO: renamed from: ۙ */
    public final int mo16283() {
        return this.f45139.f53230.size();
    }

    @Override // l.AbstractC14468
    /* JADX INFO: renamed from: ۙ */
    public final void mo16285(int i, float f, int i2) {
        float fM39018;
        C2388 c2388 = this.f45139;
        ArrayList arrayList = c2388.f53230;
        ViewParent parent = ((ImageView) arrayList.get(i)).getParent();
        C13465.m32963((Object) parent, "null cannot be cast to non-null type android.view.ViewGroup");
        float left = ((ViewGroup) parent).getLeft();
        if (i2 != -1) {
            i = i2;
        }
        ViewParent parent2 = ((ImageView) arrayList.get(i)).getParent();
        C13465.m32963((Object) parent2, "null cannot be cast to non-null type android.view.ViewGroup");
        float left2 = ((ViewGroup) parent2).getLeft();
        if (0.0f <= f && f <= 0.1f) {
            fM39018 = c2388.m39018();
        } else if (0.1f <= f && f <= 0.9f) {
            fM39018 = (left2 - left) + c2388.m39018();
        } else {
            left = left2;
            fM39018 = c2388.m39018();
        }
        C15909 c15909 = c2388.f9585;
        if (c15909 != null) {
            c15909.m37819(left);
        }
        C15909 c159010 = c2388.f9587;
        if (c159010 != null) {
            c159010.m37819(fM39018);
        }
    }
}
