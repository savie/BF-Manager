package l;

import android.content.Context;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.umeng.commonsdk.statistics.UMErrorCode;

/* JADX INFO: renamed from: l.֫᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: V659 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2221 implements InterfaceC5315 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C8407 f7283;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16390 f7284;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C9898 f7285;

    @Override // l.InterfaceC5315
    public final boolean flagActionItems() {
        return false;
    }

    @Override // l.InterfaceC5315
    public final int getId() {
        return 0;
    }

    @Override // l.InterfaceC5315
    public final void onCloseMenu(C9898 c9898, boolean z) {
    }

    @Override // l.InterfaceC5315
    public final void onRestoreInstanceState(Parcelable parcelable) {
    }

    @Override // l.InterfaceC5315
    public final Parcelable onSaveInstanceState() {
        return null;
    }

    @Override // l.InterfaceC5315
    public final boolean onSubMenuSelected(SubMenuC12026 subMenuC12026) {
        return false;
    }

    public C2221(C16390 c16390) {
        this.f7284 = c16390;
    }

    @Override // l.InterfaceC5315
    public final void initForMenu(Context context, C9898 c9898) {
        C8407 c8407;
        C9898 c9899 = this.f7285;
        if (c9899 != null && (c8407 = this.f7283) != null) {
            c9899.collapseItemActionView(c8407);
        }
        this.f7285 = c9898;
    }

    @Override // l.InterfaceC5315
    public final void updateMenuView(boolean z) {
        if (this.f7283 != null) {
            C9898 c9898 = this.f7285;
            if (c9898 != null) {
                int size = c9898.size();
                for (int i = 0; i < size; i++) {
                    if (this.f7285.getItem(i) == this.f7283) {
                        return;
                    }
                }
            }
            collapseItemActionView(this.f7285, this.f7283);
        }
    }

    @Override // l.InterfaceC5315
    public final boolean expandItemActionView(C9898 c9898, C8407 c8407) {
        C16390 c16390 = this.f7284;
        c16390.ensureCollapseButtonView();
        ViewParent parent = c16390.mCollapseButtonView.getParent();
        if (parent != c16390) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(c16390.mCollapseButtonView);
            }
            c16390.addView(c16390.mCollapseButtonView);
        }
        View actionView = c8407.getActionView();
        c16390.mExpandedActionView = actionView;
        this.f7283 = c8407;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != c16390) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(c16390.mExpandedActionView);
            }
            C11915 c11915GenerateDefaultLayoutParams = c16390.generateDefaultLayoutParams();
            c11915GenerateDefaultLayoutParams.f5085 = (c16390.mButtonGravity & UMErrorCode.E_UM_BE_DEFLATE_FAILED) | 8388611;
            c11915GenerateDefaultLayoutParams.f38394 = 2;
            c16390.mExpandedActionView.setLayoutParams(c11915GenerateDefaultLayoutParams);
            c16390.addView(c16390.mExpandedActionView);
        }
        c16390.removeChildrenForExpandedActionView();
        c16390.requestLayout();
        c8407.m22590(true);
        KeyEvent.Callback callback = c16390.mExpandedActionView;
        if (callback instanceof InterfaceC1168) {
            ((InterfaceC1168) callback).mo4307();
        }
        c16390.updateBackInvokedCallbackState();
        return true;
    }

    @Override // l.InterfaceC5315
    public final boolean collapseItemActionView(C9898 c9898, C8407 c8407) {
        C16390 c16390 = this.f7284;
        KeyEvent.Callback callback = c16390.mExpandedActionView;
        if (callback instanceof InterfaceC1168) {
            ((InterfaceC1168) callback).mo4308();
        }
        c16390.removeView(c16390.mExpandedActionView);
        c16390.removeView(c16390.mCollapseButtonView);
        c16390.mExpandedActionView = null;
        c16390.addChildrenForExpandedActionView();
        this.f7283 = null;
        c16390.requestLayout();
        c8407.m22590(false);
        c16390.updateBackInvokedCallbackState();
        return true;
    }
}
