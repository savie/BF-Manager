package l;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: l.ۛ۟᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6A7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6253 implements InterfaceC9562 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC21169 f21223;

    public C6253(AbstractC21169 abstractC21169) {
        this.f21223 = abstractC21169;
    }

    @Override // l.InterfaceC9562
    public final View getChildAt(int i) {
        return this.f21223.getChildAt(i);
    }

    @Override // l.InterfaceC9562
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo17899() {
        return this.f21223.getPaddingLeft();
    }

    @Override // l.InterfaceC9562
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int mo17901() {
        AbstractC21169 abstractC21169 = this.f21223;
        return abstractC21169.getWidth() - abstractC21169.getPaddingRight();
    }

    @Override // l.InterfaceC9562
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo17900(View view) {
        return this.f21223.getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) ((C18185) view.getLayoutParams())).leftMargin;
    }

    @Override // l.InterfaceC9562
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int mo17902(View view) {
        return this.f21223.getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) ((C18185) view.getLayoutParams())).rightMargin;
    }
}
