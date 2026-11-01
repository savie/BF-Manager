package l;

import android.view.View;

/* JADX INFO: renamed from: l.ۚ֨᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: H1J5 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractViewOnClickListenerC5030 extends AbstractC12554 implements View.OnClickListener, View.OnLongClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C3534 f17534;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C9886 f17535;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C24018 f17536;

    public AbstractViewOnClickListenerC5030(C9886 c9886, View view) {
        super(view);
        this.f17535 = c9886;
        C0674.m3031(view);
        view.setOnClickListener(this);
        view.setOnLongClickListener(this);
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        C9886 c9886 = this.f17535;
        if (c9886.m25023()) {
            if (!c9886.m25019(this.f17534)) {
                return false;
            }
            c9886.m25003(this);
            return true;
        }
        return c9886.m25010(view, this.f17534, this);
    }
}
