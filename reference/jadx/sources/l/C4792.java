package l;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: l.ۙܿܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6A7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4792 implements InterfaceC15046 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC5498 f16848;

    public C4792(AbstractC5498 abstractC5498) {
        this.f16848 = abstractC5498;
    }

    @Override // l.InterfaceC15046
    public final View getChildAt(int i) {
        return this.f16848.getChildAt(i);
    }

    @Override // l.InterfaceC15046
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo13304() {
        return this.f16848.getPaddingLeft();
    }

    @Override // l.InterfaceC15046
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int mo13306() {
        AbstractC5498 abstractC5498 = this.f16848;
        return abstractC5498.getWidth() - abstractC5498.getPaddingRight();
    }

    @Override // l.InterfaceC15046
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo13305(View view) {
        return this.f16848.getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) ((C22432) view.getLayoutParams())).leftMargin;
    }

    @Override // l.InterfaceC15046
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int mo13307(View view) {
        return this.f16848.getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) ((C22432) view.getLayoutParams())).rightMargin;
    }
}
