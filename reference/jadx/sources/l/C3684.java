package l;

import android.graphics.Rect;
import android.transition.Transition;

/* JADX INFO: renamed from: l.ۘۘۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 451G */
/* JADX INFO: loaded from: classes2.dex */
public final class C3684 extends Transition.EpicenterCallback {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Rect f13461;

    public C3684(Rect rect) {
        this.f13461 = rect;
    }

    @Override // android.transition.Transition.EpicenterCallback
    public final Rect onGetEpicenter(Transition transition) {
        Rect rect = this.f13461;
        if (rect == null || rect.isEmpty()) {
            return null;
        }
        return rect;
    }
}
