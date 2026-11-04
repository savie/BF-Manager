package l;

import android.view.View;
import bin.mt.plus.Main;

/* JADX INFO: renamed from: l.ۤۡܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 37CJ */
/* JADX INFO: loaded from: classes.dex */
public final class C10763 extends AbstractViewOnClickListenerC21206 {

    /* JADX INFO: renamed from: ᩸ۤۡ, reason: not valid java name and contains not printable characters */
    private static final short[] f34167;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final AbstractC0148 f34168;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final boolean f34169;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C9271 f34170;

    static {
        ApplicationC23172.m52091(95);
        f34167 = new short[]{1887, 8919, 8909, 21963, -22892, -23928};
    }

    @Override // android.view.View.OnClickListener
    public native void onClick(View view);

    @Override // l.AbstractC6796
    /* JADX INFO: renamed from: ᩷ */
    public final int mo3322() {
        return 6;
    }

    public C10763(Main main, C9271 c9271) {
        super(main);
        this.f34170 = c9271;
        this.f34168 = null;
        this.f34169 = true;
    }

    public C10763(Main main, C9271 c9271, AbstractC0148 abstractC0148) {
        super(main);
        this.f34170 = c9271;
        this.f34168 = abstractC0148;
        this.f34169 = false;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m27432() {
        return this.f34169;
    }
}
