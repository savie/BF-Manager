package l;

import android.animation.Animator;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;

/* JADX INFO: renamed from: l.۫ܶ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 35SE */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC12500 extends AbstractC17438 implements Animatable {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Animator[] f41798;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f41799;

    @Override // l.AbstractC16733, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        super.draw(canvas);
        for (Animator animator : this.f41798) {
            if (animator.isStarted()) {
                invalidateSelf();
                return;
            }
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        for (Animator animator : this.f41798) {
            if (animator.isStarted()) {
                return;
            }
        }
        for (Animator animator2 : this.f41798) {
            animator2.start();
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        for (Animator animator : this.f41798) {
            animator.end();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        for (Animator animator : this.f41798) {
            if (animator.isRunning()) {
                return true;
            }
        }
        return false;
    }
}
