package l;

import android.view.animation.Interpolator;

/* JADX INFO: renamed from: l.ۨ᩵ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 21VS */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11914 implements Cloneable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public float f40006;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public Interpolator f40005 = null;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f40007 = false;

    @Override // 
    public abstract AbstractC11914 clone();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo29722(Object obj);

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public abstract Float mo29723();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Interpolator m29720() {
        return this.f40005;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29721(Interpolator interpolator) {
        this.f40005 = interpolator;
    }
}
