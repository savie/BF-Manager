package l;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.View;
import android.widget.GridView;

/* JADX INFO: renamed from: l.۫ۖܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 64W8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12806 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C7172 f41031;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final SparseArray f41035 = new SparseArray();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f41032 = 50;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f41028 = 10;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f41034 = 200;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f41029 = true;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public long f41030 = -1;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f41033 = -1;

    public C12806(C7172 c7172) {
        this.f41031 = c7172;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31767() {
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.f41035;
            if (i < sparseArray.size()) {
                ((Animator) sparseArray.get(sparseArray.keyAt(i))).end();
                i++;
            } else {
                sparseArray.clear();
                this.f41033 = -1;
                this.f41030 = -1L;
                this.f41029 = true;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31769(View view) {
        int iHashCode = view.hashCode();
        SparseArray sparseArray = this.f41035;
        Animator animator = (Animator) sparseArray.get(iHashCode);
        if (animator != null) {
            animator.end();
            sparseArray.remove(iHashCode);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31768(int i, View view, Animator[] animatorArr) {
        if (this.f41029) {
            if (this.f41033 == -1) {
                this.f41033 = i;
            }
            if (this.f41030 == -1) {
                this.f41030 = SystemClock.uptimeMillis();
            }
            view.setAlpha(0.0f);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(animatorArr);
            C7172 c7172 = this.f41031;
            int iM19747 = c7172.m19747() - c7172.m19743();
            int i2 = this.f41033;
            int i3 = (i - 1) - i2;
            int i4 = iM19747 + 1;
            int iMax = this.f41028;
            if (i4 < i3) {
                if (c7172.m19745() instanceof GridView) {
                    iMax += (i % ((GridView) c7172.m19745()).getNumColumns()) * iMax;
                }
            } else {
                iMax = Math.max(0, (int) ((-SystemClock.uptimeMillis()) + this.f41030 + ((long) this.f41032) + ((long) ((i - i2) * iMax))));
            }
            animatorSet.setStartDelay(iMax);
            animatorSet.setDuration(this.f41034);
            animatorSet.start();
            this.f41035.put(view.hashCode(), animatorSet);
        }
    }
}
