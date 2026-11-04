package l;

import android.view.animation.Interpolator;

/* JADX INFO: renamed from: l.ۗۖܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 21VS */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3111 implements Cloneable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public float f10078;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Interpolator f10079 = null;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f10080 = false;

    @Override // 
    public abstract AbstractC3111 clone();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo10181(Object obj);

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public abstract Float mo10182();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Interpolator m10179() {
        return this.f10079;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10180(Interpolator interpolator) {
        this.f10079 = interpolator;
    }
}
