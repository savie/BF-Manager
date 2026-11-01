package l;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Path;

/* JADX INFO: renamed from: l.᩶ܶ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: K5RN */
/* JADX INFO: loaded from: classes4.dex */
public final class C20261 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final Path f65703;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Path f65704;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final Path f65705;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final Path f65706;

    static {
        Path path = new Path();
        f65706 = path;
        path.moveTo(-522.6f, 0.0f);
        path.rCubicTo(48.89972f, 0.0f, 166.02657f, 0.0f, 301.2173f, 0.0f);
        path.rCubicTo(197.58128f, 0.0f, 420.9827f, 0.0f, 420.9827f, 0.0f);
        Path path2 = new Path();
        f65704 = path2;
        path2.moveTo(0.0f, 0.1f);
        path2.lineTo(1.0f, 0.8268492f);
        path2.lineTo(2.0f, 0.1f);
        Path path3 = new Path();
        f65703 = path3;
        path3.moveTo(-197.6f, 0.0f);
        path3.rCubicTo(14.28182f, 0.0f, 85.07782f, 0.0f, 135.54689f, 0.0f);
        path3.rCubicTo(54.26191f, 0.0f, 90.42461f, 0.0f, 168.24332f, 0.0f);
        path3.rCubicTo(144.72154f, 0.0f, 316.40982f, 0.0f, 316.40982f, 0.0f);
        Path path4 = new Path();
        f65705 = path4;
        path4.moveTo(0.0f, 0.1f);
        path4.lineTo(1.0f, 0.5713795f);
        path4.lineTo(2.0f, 0.90995026f);
        path4.lineTo(3.0f, 0.1f);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AnimatorSet m45770(Object obj) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(obj, "translateX", (String) null, f65706);
        objectAnimatorOfFloat.setDuration(2000L);
        objectAnimatorOfFloat.setInterpolator(C14617.f47826);
        objectAnimatorOfFloat.setRepeatCount(-1);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(obj, (String) null, "scaleX", f65704);
        objectAnimatorOfFloat2.setDuration(2000L);
        objectAnimatorOfFloat2.setInterpolator(C23789.f76916);
        objectAnimatorOfFloat2.setRepeatCount(-1);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        return animatorSet;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static AnimatorSet m45771(Object obj) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(obj, "translateX", (String) null, f65703);
        objectAnimatorOfFloat.setDuration(2000L);
        objectAnimatorOfFloat.setInterpolator(C9678.f32623);
        objectAnimatorOfFloat.setRepeatCount(-1);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(obj, (String) null, "scaleX", f65705);
        objectAnimatorOfFloat2.setDuration(2000L);
        objectAnimatorOfFloat2.setInterpolator(C1915.f7261);
        objectAnimatorOfFloat2.setRepeatCount(-1);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        return animatorSet;
    }
}
