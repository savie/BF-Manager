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

/* JADX INFO: renamed from: l.ܺ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: N5WL */
/* JADX INFO: loaded from: classes5.dex */
public final class C16237 extends C7022 implements InterfaceC16942 {

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public final Rect f52378;

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public CharSequence f52379;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public int f52380;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public ListAdapter f52381;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12709 f52382;

    @Override // l.InterfaceC16942
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo38350(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        PopupWindow popupWindow = this.f23602;
        boolean zIsShowing = popupWindow.isShowing();
        m38355();
        m18841();
        show();
        C6129 c6129 = this.f23605;
        c6129.setChoiceMode(1);
        c6129.setTextDirection(i);
        c6129.setTextAlignment(i2);
        C12709 c12709 = this.f52382;
        int selectedItemPosition = c12709.getSelectedItemPosition();
        C6129 c61210 = this.f23605;
        if (popupWindow.isShowing() && c61210 != null) {
            c61210.m17110(false);
            c61210.setSelection(selectedItemPosition);
            if (c61210.getChoiceMode() != 0) {
                c61210.setItemChecked(selectedItemPosition, true);
            }
        }
        if (zIsShowing || (viewTreeObserver = c12709.getViewTreeObserver()) == null) {
            return;
        }
        ViewTreeObserverOnGlobalLayoutListenerC7770 viewTreeObserverOnGlobalLayoutListenerC7770 = new ViewTreeObserverOnGlobalLayoutListenerC7770(this);
        viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC7770);
        m18834(new C21175(this, viewTreeObserverOnGlobalLayoutListenerC7770));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16237(C12709 c12709, Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f52382 = c12709;
        this.f52378 = new Rect();
        m18830(c12709);
        m18843();
        m18831(new C10593(this));
    }

    @Override // l.C7022, l.InterfaceC16942
    /* JADX INFO: renamed from: ۙ */
    public final void mo18833(ListAdapter listAdapter) {
        super.mo18833(listAdapter);
        this.f52381 = listAdapter;
    }

    @Override // l.InterfaceC16942
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final CharSequence mo38353() {
        return this.f52379;
    }

    @Override // l.InterfaceC16942
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo38351(CharSequence charSequence) {
        this.f52379 = charSequence;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m38355() {
        int i;
        C12709 c12709 = this.f52382;
        Rect rect = c12709.f42388;
        PopupWindow popupWindow = this.f23602;
        Drawable background = popupWindow.getBackground();
        if (background != null) {
            background.getPadding(rect);
            int i2 = C20344.f65886;
            if (c12709.getLayoutDirection() == 1) {
                i = rect.right;
            } else {
                i = -rect.left;
            }
        } else {
            i = 0;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = c12709.getPaddingLeft();
        int paddingRight = c12709.getPaddingRight();
        int width = c12709.getWidth();
        int i3 = c12709.f42393;
        if (i3 == -2) {
            int iM31553 = c12709.m31553((SpinnerAdapter) this.f52381, popupWindow.getBackground());
            int i4 = (c12709.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
            if (iM31553 > i4) {
                iM31553 = i4;
            }
            m18824(Math.max(iM31553, (width - paddingLeft) - paddingRight));
        } else if (i3 == -1) {
            m18824((width - paddingLeft) - paddingRight);
        } else {
            m18824(i3);
        }
        int i5 = C20344.f65886;
        m18828(c12709.getLayoutDirection() == 1 ? (((width - paddingRight) - m18825()) - this.f52380) + i : paddingLeft + this.f52380 + i);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m38354(View view) {
        return view.isAttachedToWindow() && view.getGlobalVisibleRect(this.f52378);
    }

    @Override // l.InterfaceC16942
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void mo38352(int i) {
        this.f52380 = i;
    }
}
