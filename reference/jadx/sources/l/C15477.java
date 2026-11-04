package l;

import com.google.android.material.textfield.IndicatorViewController;

/* JADX INFO: renamed from: l.ܳܽۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0AST */
/* JADX INFO: loaded from: classes5.dex */
public final class C15477 extends AbstractC4279 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C15477 f50389 = new C15477();

    @Override // l.AbstractC4279
    /* JADX INFO: renamed from: ۙ */
    public final int mo13639(Object obj) {
        C22937 c22937 = (C22937) obj;
        return c22937.f74516.hashCode() + ((((c22937.f74514.f58209 + IndicatorViewController.DEFAULT_CAPTION_TRANSLATION_Y_ANIMATION_DURATION) * 31) + c22937.f74512) * 31);
    }

    @Override // l.AbstractC4279
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo13640(Object obj, Object obj2) {
        C22937 c22937 = (C22937) obj;
        C22937 c22938 = (C22937) obj2;
        if (c22937 == c22938) {
            return true;
        }
        return c22938 != null && c22937.f74514.f58209 == c22938.f74514.f58209 && c22937.f74512 == c22938.f74512 && c22937.f74516.equals(c22938.f74516);
    }
}
