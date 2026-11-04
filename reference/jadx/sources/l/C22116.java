package l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩷ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 422Y */
/* JADX INFO: loaded from: classes.dex */
public final class C22116 implements InterfaceC7419 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ LayoutInflaterFactory2C24354 f71286;

    public C22116(LayoutInflaterFactory2C24354 layoutInflaterFactory2C24354) {
        this.f71286 = layoutInflaterFactory2C24354;
    }

    @Override // l.InterfaceC7419
    /* JADX INFO: renamed from: ۙ */
    public final Context mo15398() {
        return this.f71286.m54409();
    }

    @Override // l.InterfaceC7419
    /* JADX INFO: renamed from: ۤ */
    public final Drawable mo15401() {
        C5204 c5204M15648 = C5204.m15648(this.f71286.m54409(), (AttributeSet) null, new int[]{R.attr.MT_Protector});
        Drawable drawableM15669 = c5204M15648.m15669(0);
        c5204M15648.m15664();
        return drawableM15669;
    }

    @Override // l.InterfaceC7419
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo15402() {
        AbstractC2944 abstractC2944Mo5039 = this.f71286.mo5039();
        return (abstractC2944Mo5039 == null || (abstractC2944Mo5039.mo9632() & 4) == 0) ? false : true;
    }

    @Override // l.InterfaceC7419
    /* JADX INFO: renamed from: ۙ */
    public final void mo15400(Drawable drawable, int i) {
        AbstractC2944 abstractC2944Mo5039 = this.f71286.mo5039();
        if (abstractC2944Mo5039 != null) {
            abstractC2944Mo5039.mo9625(drawable);
            abstractC2944Mo5039.mo9624(i);
        }
    }

    @Override // l.InterfaceC7419
    /* JADX INFO: renamed from: ۙ */
    public final void mo15399(int i) {
        AbstractC2944 abstractC2944Mo5039 = this.f71286.mo5039();
        if (abstractC2944Mo5039 != null) {
            abstractC2944Mo5039.mo9624(0);
        }
    }
}
