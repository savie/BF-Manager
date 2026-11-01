package l;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: l.ܰܿܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6A7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13966 implements InterfaceC15046 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC5498 f45942;

    public C13966(AbstractC5498 abstractC5498) {
        this.f45942 = abstractC5498;
    }

    @Override // l.InterfaceC15046
    public final View getChildAt(int i) {
        return this.f45942.getChildAt(i);
    }

    @Override // l.InterfaceC15046
    /* JADX INFO: renamed from: ۙ */
    public final int mo13304() {
        return this.f45942.getPaddingTop();
    }

    @Override // l.InterfaceC15046
    /* JADX INFO: renamed from: ܰ */
    public final int mo13306() {
        AbstractC5498 abstractC5498 = this.f45942;
        return abstractC5498.getHeight() - abstractC5498.getPaddingBottom();
    }

    @Override // l.InterfaceC15046
    /* JADX INFO: renamed from: ۙ */
    public final int mo13305(View view) {
        return this.f45942.getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) ((C22432) view.getLayoutParams())).topMargin;
    }

    @Override // l.InterfaceC15046
    /* JADX INFO: renamed from: ܰ */
    public final int mo13307(View view) {
        return this.f45942.getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) ((C22432) view.getLayoutParams())).bottomMargin;
    }
}
