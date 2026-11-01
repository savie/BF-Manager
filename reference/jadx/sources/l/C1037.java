package l;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: renamed from: l.֨ۢܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q69A */
/* JADX INFO: loaded from: classes2.dex */
public final class C1037 implements InterfaceC11754 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Rect f4833 = new Rect();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19383 f4834;

    public C1037(C19383 c19383) {
        this.f4834 = c19383;
    }

    @Override // l.InterfaceC11754
    public final C15844 onApplyWindowInsets(View view, C15844 c15844) {
        C15844 c15844M14008 = C5031.m14008(view, c15844);
        if (c15844M14008.m37686()) {
            return c15844M14008;
        }
        int iM37683 = c15844M14008.m37683();
        Rect rect = this.f4833;
        rect.left = iM37683;
        rect.top = c15844M14008.m37681();
        rect.right = c15844M14008.m37672();
        rect.bottom = c15844M14008.m37670();
        C19383 c19383 = this.f4834;
        int childCount = c19383.getChildCount();
        for (int i = 0; i < childCount; i++) {
            C15844 c15844M13978 = C5031.m13978(c19383.getChildAt(i), c15844M14008);
            rect.left = Math.min(c15844M13978.m37683(), rect.left);
            rect.top = Math.min(c15844M13978.m37681(), rect.top);
            rect.right = Math.min(c15844M13978.m37672(), rect.right);
            rect.bottom = Math.min(c15844M13978.m37670(), rect.bottom);
        }
        int i2 = rect.left;
        int i3 = rect.top;
        int i4 = rect.right;
        int i5 = rect.bottom;
        C1025 c1025 = new C1025(c15844M14008);
        c1025.m3872(C13954.m33793(i2, i3, i4, i5));
        return c1025.m3869();
    }
}
