package l;

import android.content.Context;
import android.view.MotionEvent;

/* JADX INFO: renamed from: l.۟ۤ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: W1V4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7835 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C24179 f26118;

    public C7835(Context context, C1123 c1123) {
        C24179 c24179 = new C24179(context, new C18276(c1123));
        this.f26118 = c24179;
        c24179.m54154(new GestureDetectorOnDoubleTapListenerC0377(c1123));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21360(MotionEvent motionEvent) {
        this.f26118.m54155(motionEvent);
    }
}
