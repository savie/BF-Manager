package l;

import android.graphics.Rect;
import android.transition.Transition;

/* JADX INFO: renamed from: l.ۚۘۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 451G */
/* JADX INFO: loaded from: classes2.dex */
public final class C5096 extends Transition.EpicenterCallback {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Rect f17760;

    public C5096(Rect rect) {
        this.f17760 = rect;
    }

    @Override // android.transition.Transition.EpicenterCallback
    public final Rect onGetEpicenter(Transition transition) {
        return this.f17760;
    }
}
