package l;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.View;
import android.widget.GridView;

/* JADX INFO: renamed from: l.ܿ۠ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 64W8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17227 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C10878 f54894;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final SparseArray f54895 = new SparseArray();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f54901 = 50;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f54896 = 10;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f54900 = 200;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f54899 = true;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public long f54898 = -1;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f54897 = -1;

    public C17227(C10878 c10878) {
        this.f54894 = c10878;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40165() {
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.f54895;
            if (i < sparseArray.size()) {
                ((Animator) sparseArray.get(sparseArray.keyAt(i))).end();
                i++;
            } else {
                sparseArray.clear();
                this.f54897 = -1;
                this.f54898 = -1L;
                this.f54899 = true;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40167(View view) {
        int iHashCode = view.hashCode();
        SparseArray sparseArray = this.f54895;
        Animator animator = (Animator) sparseArray.get(iHashCode);
        if (animator != null) {
            animator.end();
            sparseArray.remove(iHashCode);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40166(int i, View view, Animator[] animatorArr) {
        if (this.f54899) {
            if (this.f54897 == -1) {
                this.f54897 = i;
            }
            if (this.f54898 == -1) {
                this.f54898 = SystemClock.uptimeMillis();
            }
            view.setAlpha(0.0f);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(animatorArr);
            C10878 c10878 = this.f54894;
            int iM27249 = c10878.m27249() - c10878.m27247();
            int i2 = this.f54897;
            int i3 = (i - 1) - i2;
            int i4 = iM27249 + 1;
            int iMax = this.f54896;
            if (i4 < i3) {
                if (c10878.m27248() instanceof GridView) {
                    iMax += (i % ((GridView) c10878.m27248()).getNumColumns()) * iMax;
                }
            } else {
                iMax = Math.max(0, (int) ((-SystemClock.uptimeMillis()) + this.f54898 + ((long) this.f54901) + ((long) ((i - i2) * iMax))));
            }
            animatorSet.setStartDelay(iMax);
            animatorSet.setDuration(this.f54900);
            animatorSet.start();
            this.f54895.put(view.hashCode(), animatorSet);
        }
    }
}
