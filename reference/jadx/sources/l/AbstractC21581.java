package l;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: renamed from: l.᩸۫ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y64E */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC21581 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f70031 = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Rect f70032 = new Rect();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC5498 f70033;

    /* JADX INFO: renamed from: ֨ */
    public abstract int mo36471();

    /* JADX INFO: renamed from: ۖ */
    public abstract int mo36472();

    /* JADX INFO: renamed from: ۖ */
    public abstract int mo36473(View view);

    /* JADX INFO: renamed from: ۙ */
    public abstract int mo36474();

    /* JADX INFO: renamed from: ۙ */
    public abstract int mo36475(View view);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo36476(int i);

    /* JADX INFO: renamed from: ۚ */
    public abstract int mo36477();

    /* JADX INFO: renamed from: ۚ */
    public abstract int mo36478(View view);

    /* JADX INFO: renamed from: ۨ */
    public abstract int mo36479();

    /* JADX INFO: renamed from: ۨ */
    public abstract int mo36480(View view);

    /* JADX INFO: renamed from: ܰ */
    public abstract int mo36481();

    /* JADX INFO: renamed from: ܰ */
    public abstract int mo36482(View view);

    /* JADX INFO: renamed from: ᩹ */
    public abstract int mo36483();

    /* JADX INFO: renamed from: ᩹ */
    public abstract int mo36484(View view);

    public AbstractC21581(AbstractC5498 abstractC5498) {
        this.f70033 = abstractC5498;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m48294() {
        this.f70031 = mo36471();
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int m48295() {
        if (Integer.MIN_VALUE == this.f70031) {
            return 0;
        }
        return mo36471() - this.f70031;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC21581 m48293(AbstractC5498 abstractC5498, int i) {
        if (i == 0) {
            return new C22993(abstractC5498);
        }
        if (i != 1) {
            throw new IllegalArgumentException("invalid orientation");
        }
        return new C15232(abstractC5498);
    }
}
