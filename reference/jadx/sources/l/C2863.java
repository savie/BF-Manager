package l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Rect;
import android.view.View;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۖ᩻ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: A65W */
/* JADX INFO: loaded from: classes2.dex */
public final class C2863 extends AnimatorListenerAdapter implements InterfaceC24031 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f10813;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f10814;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final Rect f10815;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f10816;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f10817;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean f10818;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean f10819;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int f10820;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Rect f10821;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final int f10822;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final View f10823;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f10824;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f10825;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final int f10826;

    @Override // l.InterfaceC24031
    public final void onTransitionEnd(AbstractC11766 abstractC11766) {
        throw null;
    }

    @Override // l.InterfaceC24031
    public final void onTransitionEnd(AbstractC11766 abstractC11766, boolean z) {
    }

    @Override // l.InterfaceC24031
    public final void onTransitionStart(AbstractC11766 abstractC11766) {
        throw null;
    }

    @Override // l.InterfaceC24031
    public final void onTransitionStart(AbstractC11766 abstractC11766, boolean z) {
    }

    public C2863(View view, Rect rect, boolean z, Rect rect2, boolean z2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.f10823 = view;
        this.f10815 = rect;
        this.f10818 = z;
        this.f10821 = rect2;
        this.f10819 = z2;
        this.f10826 = i;
        this.f10824 = i2;
        this.f10822 = i3;
        this.f10820 = i4;
        this.f10814 = i5;
        this.f10825 = i6;
        this.f10817 = i7;
        this.f10816 = i8;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        onAnimationStart(animator, false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z) {
        int i = this.f10822;
        int i2 = this.f10826;
        int i3 = this.f10817;
        int i4 = this.f10814;
        int iMax = Math.max(i - i2, i3 - i4);
        int i5 = this.f10820;
        int i6 = this.f10824;
        int i7 = this.f10816;
        int i8 = this.f10825;
        int iMax2 = Math.max(i5 - i6, i7 - i8);
        if (z) {
            i2 = i4;
        }
        if (z) {
            i6 = i8;
        }
        View view = this.f10823;
        C16000.m37979(view, i2, i6, iMax + i2, iMax2 + i6);
        view.setClipBounds(z ? this.f10821 : this.f10815);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (this.f10813) {
            return;
        }
        Rect rect = null;
        if (z) {
            if (!this.f10818) {
                rect = this.f10815;
            }
        } else if (!this.f10819) {
            rect = this.f10821;
        }
        View view = this.f10823;
        view.setClipBounds(rect);
        if (z) {
            C16000.m37979(view, this.f10826, this.f10824, this.f10822, this.f10820);
        } else {
            C16000.m37979(view, this.f10814, this.f10825, this.f10817, this.f10816);
        }
    }

    @Override // l.InterfaceC24031
    public final void onTransitionCancel(AbstractC11766 abstractC11766) {
        this.f10813 = true;
    }

    @Override // l.InterfaceC24031
    public final void onTransitionPause(AbstractC11766 abstractC11766) {
        View view = this.f10823;
        view.setTag(R.id.MT_Protector, view.getClipBounds());
        view.setClipBounds(this.f10819 ? null : this.f10821);
    }

    @Override // l.InterfaceC24031
    public final void onTransitionResume(AbstractC11766 abstractC11766) {
        View view = this.f10823;
        Rect rect = (Rect) view.getTag(R.id.MT_Protector);
        view.setTag(R.id.MT_Protector, null);
        view.setClipBounds(rect);
    }
}
