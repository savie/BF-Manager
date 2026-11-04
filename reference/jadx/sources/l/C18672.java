package l;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.SpinnerAdapter;

/* JADX INFO: renamed from: l.ܿ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: N5WL */
/* JADX INFO: loaded from: classes5.dex */
public final class C18672 extends C16960 implements InterfaceC19418 {

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public final Rect f60712;

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public CharSequence f60713;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public ListAdapter f60714;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10467 f60715;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public int f60716;

    @Override // l.InterfaceC19418
    /* JADX INFO: renamed from: ۙ */
    public final void mo18834(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        boolean zIsShowing = this.f55402.isShowing();
        m43424();
        m39955();
        show();
        C9479 c9479 = this.f55410;
        c9479.setChoiceMode(1);
        c9479.setTextDirection(i);
        c9479.setTextAlignment(i2);
        C10467 c10467 = this.f60715;
        m39953(c10467.getSelectedItemPosition());
        if (zIsShowing || (viewTreeObserver = c10467.getViewTreeObserver()) == null) {
            return;
        }
        ViewTreeObserverOnGlobalLayoutListenerC14942 viewTreeObserverOnGlobalLayoutListenerC14942 = new ViewTreeObserverOnGlobalLayoutListenerC14942(this);
        viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC14942);
        m39947(new C21656(this, viewTreeObserverOnGlobalLayoutListenerC14942));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18672(C10467 c10467, Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f60715 = c10467;
        this.f60712 = new Rect();
        m39944(c10467);
        m39956();
        m39945(new C4502(this));
    }

    @Override // l.C16960, l.InterfaceC19418
    /* JADX INFO: renamed from: ۙ */
    public final void mo18835(ListAdapter listAdapter) {
        super.mo18835(listAdapter);
        this.f60714 = listAdapter;
    }

    @Override // l.InterfaceC19418
    /* JADX INFO: renamed from: ᩷ */
    public final CharSequence mo18839() {
        return this.f60713;
    }

    @Override // l.InterfaceC19418
    /* JADX INFO: renamed from: ۙ */
    public final void mo18836(CharSequence charSequence) {
        this.f60713 = charSequence;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m43424() {
        int i;
        C10467 c10467 = this.f60715;
        Rect rect = c10467.f33313;
        PopupWindow popupWindow = this.f55402;
        Drawable background = popupWindow.getBackground();
        if (background != null) {
            background.getPadding(rect);
            int i2 = C19374.f62602;
            if (c10467.getLayoutDirection() == 1) {
                i = rect.right;
            } else {
                i = -rect.left;
            }
        } else {
            i = 0;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = c10467.getPaddingLeft();
        int paddingRight = c10467.getPaddingRight();
        int width = c10467.getWidth();
        int i3 = c10467.f33319;
        if (i3 == -2) {
            int iM26890 = c10467.m26890((SpinnerAdapter) this.f60714, popupWindow.getBackground());
            int i4 = (c10467.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
            if (iM26890 > i4) {
                iM26890 = i4;
            }
            m39961(Math.max(iM26890, (width - paddingLeft) - paddingRight));
        } else if (i3 == -1) {
            m39961((width - paddingLeft) - paddingRight);
        } else {
            m39961(i3);
        }
        int i5 = C19374.f62602;
        m39942(c10467.getLayoutDirection() == 1 ? (((width - paddingRight) - m39940()) - this.f60716) + i : paddingLeft + this.f60716 + i);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m43423(View view) {
        return view.isAttachedToWindow() && view.getGlobalVisibleRect(this.f60712);
    }

    @Override // l.InterfaceC19418
    /* JADX INFO: renamed from: ۤ */
    public final void mo18838(int i) {
        this.f60716 = i;
    }
}
