package l;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: l.᩺۟᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6A7 */
/* JADX INFO: loaded from: classes.dex */
public final class C24153 implements InterfaceC9562 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC21169 f78164;

    public C24153(AbstractC21169 abstractC21169) {
        this.f78164 = abstractC21169;
    }

    @Override // l.InterfaceC9562
    public final View getChildAt(int i) {
        return this.f78164.getChildAt(i);
    }

    @Override // l.InterfaceC9562
    /* JADX INFO: renamed from: ۙ */
    public final int mo17899() {
        return this.f78164.getPaddingTop();
    }

    @Override // l.InterfaceC9562
    /* JADX INFO: renamed from: ᩷ */
    public final int mo17901() {
        AbstractC21169 abstractC21169 = this.f78164;
        return abstractC21169.getHeight() - abstractC21169.getPaddingBottom();
    }

    @Override // l.InterfaceC9562
    /* JADX INFO: renamed from: ۙ */
    public final int mo17900(View view) {
        return this.f78164.getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) ((C18185) view.getLayoutParams())).topMargin;
    }

    @Override // l.InterfaceC9562
    /* JADX INFO: renamed from: ᩷ */
    public final int mo17902(View view) {
        return this.f78164.getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) ((C18185) view.getLayoutParams())).bottomMargin;
    }
}
