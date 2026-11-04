package l;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: renamed from: l.ۡ֡᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: Y64E */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9016 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f29367 = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Rect f29368 = new Rect();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC21169 f29369;

    /* JADX INFO: renamed from: ۙ */
    public abstract int mo3267();

    /* JADX INFO: renamed from: ۙ */
    public abstract int mo3268(View view);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo3269(int i);

    /* JADX INFO: renamed from: ۤ */
    public abstract int mo3270();

    /* JADX INFO: renamed from: ۤ */
    public abstract int mo3271(View view);

    /* JADX INFO: renamed from: ۫ */
    public abstract int mo3272();

    /* JADX INFO: renamed from: ܳ */
    public abstract int mo3273();

    /* JADX INFO: renamed from: ܳ */
    public abstract int mo3274(View view);

    /* JADX INFO: renamed from: ᩴ */
    public abstract int mo3275();

    /* JADX INFO: renamed from: ᩴ */
    public abstract int mo3276(View view);

    /* JADX INFO: renamed from: ᩷ */
    public abstract int mo3277();

    /* JADX INFO: renamed from: ᩷ */
    public abstract int mo3278(View view);

    /* JADX INFO: renamed from: ᩸ */
    public abstract int mo3279();

    /* JADX INFO: renamed from: ᩸ */
    public abstract int mo3280(View view);

    public AbstractC9016(AbstractC21169 abstractC21169) {
        this.f29369 = abstractC21169;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24072() {
        this.f29367 = mo3272();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m24073() {
        if (Integer.MIN_VALUE == this.f29367) {
            return 0;
        }
        return mo3272() - this.f29367;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC9016 m24071(AbstractC21169 abstractC21169, int i) {
        if (i == 0) {
            return new C9761(abstractC21169);
        }
        if (i != 1) {
            throw new IllegalArgumentException("invalid orientation");
        }
        return new C0813(abstractC21169);
    }
}
