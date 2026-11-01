package l;

import com.google.android.material.textfield.IndicatorViewController;

/* JADX INFO: renamed from: l.ܽ᩹᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 0AST */
/* JADX INFO: loaded from: classes4.dex */
public final class C16938 extends AbstractC21803 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final C16938 f54136 = new C16938(6);

    @Override // l.AbstractC21803
    /* JADX INFO: renamed from: ۙ */
    public final int mo14892(Object obj) {
        C20466 c20466 = (C20466) obj;
        return c20466.f66404.hashCode() + ((((c20466.f66406.f7775 + IndicatorViewController.DEFAULT_CAPTION_TRANSLATION_Y_ANIMATION_DURATION) * 31) + c20466.f66405) * 31);
    }

    @Override // l.AbstractC21803
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo14893(Object obj, Object obj2) {
        C20466 c20466 = (C20466) obj;
        C20466 c20467 = (C20466) obj2;
        if (c20466 == c20467) {
            return true;
        }
        return c20467 != null && c20466.f66406.f7775 == c20467.f66406.f7775 && c20466.f66405 == c20467.f66405 && c20466.f66404.equals(c20467.f66404);
    }
}
