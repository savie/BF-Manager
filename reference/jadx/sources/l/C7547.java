package l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Rect;
import android.view.View;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۟֨᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: A65W */
/* JADX INFO: loaded from: classes4.dex */
public final class C7547 extends AnimatorListenerAdapter implements InterfaceC12261 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Rect f24886;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f24887;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f24888;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean f24889;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f24890;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f24891;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f24892;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final View f24893;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f24894;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f24895;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f24896;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Rect f24897;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f24898;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f24899;

    @Override // l.InterfaceC12261
    public final void onTransitionEnd(AbstractC0329 abstractC0329) {
        throw null;
    }

    @Override // l.InterfaceC12261
    public final void onTransitionEnd(AbstractC0329 abstractC0329, boolean z) {
    }

    @Override // l.InterfaceC12261
    public final void onTransitionStart(AbstractC0329 abstractC0329) {
        throw null;
    }

    @Override // l.InterfaceC12261
    public final void onTransitionStart(AbstractC0329 abstractC0329, boolean z) {
    }

    public C7547(View view, Rect rect, boolean z, Rect rect2, boolean z2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.f24893 = view;
        this.f24886 = rect;
        this.f24890 = z;
        this.f24897 = rect2;
        this.f24889 = z2;
        this.f24899 = i;
        this.f24895 = i2;
        this.f24894 = i3;
        this.f24888 = i4;
        this.f24898 = i5;
        this.f24892 = i6;
        this.f24896 = i7;
        this.f24887 = i8;
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
        int i = this.f24894;
        int i2 = this.f24899;
        int i3 = this.f24896;
        int i4 = this.f24898;
        int iMax = Math.max(i - i2, i3 - i4);
        int i5 = this.f24888;
        int i6 = this.f24895;
        int i7 = this.f24887;
        int i8 = this.f24892;
        int iMax2 = Math.max(i5 - i6, i7 - i8);
        if (z) {
            i2 = i4;
        }
        if (z) {
            i6 = i8;
        }
        View view = this.f24893;
        C11319.m28607(view, i2, i6, iMax + i2, iMax2 + i6);
        view.setClipBounds(z ? this.f24897 : this.f24886);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (this.f24891) {
            return;
        }
        Rect rect = null;
        if (z) {
            if (!this.f24890) {
                rect = this.f24886;
            }
        } else if (!this.f24889) {
            rect = this.f24897;
        }
        View view = this.f24893;
        view.setClipBounds(rect);
        if (z) {
            C11319.m28607(view, this.f24899, this.f24895, this.f24894, this.f24888);
        } else {
            C11319.m28607(view, this.f24898, this.f24892, this.f24896, this.f24887);
        }
    }

    @Override // l.InterfaceC12261
    public final void onTransitionCancel(AbstractC0329 abstractC0329) {
        this.f24891 = true;
    }

    @Override // l.InterfaceC12261
    public final void onTransitionPause(AbstractC0329 abstractC0329) {
        View view = this.f24893;
        view.setTag(R.id.MT_Protector, view.getClipBounds());
        view.setClipBounds(this.f24889 ? null : this.f24897);
    }

    @Override // l.InterfaceC12261
    public final void onTransitionResume(AbstractC0329 abstractC0329) {
        View view = this.f24893;
        Rect rect = (Rect) view.getTag(R.id.MT_Protector);
        view.setTag(R.id.MT_Protector, null);
        view.setClipBounds(rect);
    }
}
