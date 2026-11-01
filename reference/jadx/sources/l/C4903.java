package l;

import android.view.View;
import bin.mt.plus.Main;

/* JADX INFO: renamed from: l.ۙ᩷᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 37CJ */
/* JADX INFO: loaded from: classes.dex */
public final class C4903 extends AbstractViewOnClickListenerC10549 {

    /* JADX INFO: renamed from: ᩹֨᩺, reason: not valid java name and contains not printable characters */
    private static final short[] f17188;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C12665 f17189;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean f17190;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC12068 f17191;

    static {
        ApplicationC6132.m17119(72);
        f17188 = new short[]{7782, 31823, 31829, -3656, 10438, 12133};
    }

    @Override // android.view.View.OnClickListener
    public native void onClick(View view);

    @Override // l.AbstractC14389
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int mo13629() {
        return 6;
    }

    public C4903(Main main, C12665 c12665) {
        super(main);
        this.f17189 = c12665;
        this.f17191 = null;
        this.f17190 = true;
    }

    public C4903(Main main, C12665 c12665, AbstractC12068 abstractC12068) {
        super(main);
        this.f17189 = c12665;
        this.f17191 = abstractC12068;
        this.f17190 = false;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m13628() {
        return this.f17190;
    }
}
