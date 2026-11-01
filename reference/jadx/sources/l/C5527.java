package l;

import android.content.Context;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.umeng.commonsdk.statistics.UMErrorCode;

/* JADX INFO: renamed from: l.ۚᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: V659 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5527 implements InterfaceC22026 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6938 f18946;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C23707 f18947;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C12418 f18948;

    @Override // l.InterfaceC22026
    public final boolean flagActionItems() {
        return false;
    }

    @Override // l.InterfaceC22026
    public final int getId() {
        return 0;
    }

    @Override // l.InterfaceC22026
    public final void onCloseMenu(C12418 c12418, boolean z) {
    }

    @Override // l.InterfaceC22026
    public final void onRestoreInstanceState(Parcelable parcelable) {
    }

    @Override // l.InterfaceC22026
    public final Parcelable onSaveInstanceState() {
        return null;
    }

    @Override // l.InterfaceC22026
    public final boolean onSubMenuSelected(SubMenuC7915 subMenuC7915) {
        return false;
    }

    public C5527(C6938 c6938) {
        this.f18946 = c6938;
    }

    @Override // l.InterfaceC22026
    public final void initForMenu(Context context, C12418 c12418) {
        C23707 c23707;
        C12418 c12419 = this.f18948;
        if (c12419 != null && (c23707 = this.f18947) != null) {
            c12419.collapseItemActionView(c23707);
        }
        this.f18948 = c12418;
    }

    @Override // l.InterfaceC22026
    public final void updateMenuView(boolean z) {
        if (this.f18947 != null) {
            C12418 c12418 = this.f18948;
            if (c12418 != null) {
                int size = c12418.size();
                for (int i = 0; i < size; i++) {
                    if (this.f18948.getItem(i) == this.f18947) {
                        return;
                    }
                }
            }
            collapseItemActionView(this.f18948, this.f18947);
        }
    }

    @Override // l.InterfaceC22026
    public final boolean expandItemActionView(C12418 c12418, C23707 c23707) {
        C6938 c6938 = this.f18946;
        c6938.ensureCollapseButtonView();
        ViewParent parent = c6938.mCollapseButtonView.getParent();
        if (parent != c6938) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(c6938.mCollapseButtonView);
            }
            c6938.addView(c6938.mCollapseButtonView);
        }
        View actionView = c23707.getActionView();
        c6938.mExpandedActionView = actionView;
        this.f18947 = c23707;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != c6938) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(c6938.mExpandedActionView);
            }
            C22461 c22461GenerateDefaultLayoutParams = c6938.generateDefaultLayoutParams();
            c22461GenerateDefaultLayoutParams.f54436 = (c6938.mButtonGravity & UMErrorCode.E_UM_BE_DEFLATE_FAILED) | 8388611;
            c22461GenerateDefaultLayoutParams.f73320 = 2;
            c6938.mExpandedActionView.setLayoutParams(c22461GenerateDefaultLayoutParams);
            c6938.addView(c6938.mExpandedActionView);
        }
        c6938.removeChildrenForExpandedActionView();
        c6938.requestLayout();
        c23707.m52174(true);
        KeyEvent.Callback callback = c6938.mExpandedActionView;
        if (callback instanceof InterfaceC17005) {
            ((InterfaceC17005) callback).mo5984();
        }
        c6938.updateBackInvokedCallbackState();
        return true;
    }

    @Override // l.InterfaceC22026
    public final boolean collapseItemActionView(C12418 c12418, C23707 c23707) {
        C6938 c6938 = this.f18946;
        KeyEvent.Callback callback = c6938.mExpandedActionView;
        if (callback instanceof InterfaceC17005) {
            ((InterfaceC17005) callback).mo5985();
        }
        c6938.removeView(c6938.mExpandedActionView);
        c6938.removeView(c6938.mCollapseButtonView);
        c6938.mExpandedActionView = null;
        c6938.addChildrenForExpandedActionView();
        this.f18947 = null;
        c6938.requestLayout();
        c23707.m52174(false);
        c6938.updateBackInvokedCallbackState();
        return true;
    }
}
