package l;

import android.view.View;

/* JADX INFO: renamed from: l.ۢ᩺᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: H1J5 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractViewOnClickListenerC10466 extends AbstractC11800 implements View.OnClickListener, View.OnLongClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C14941 f33308;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C21655 f33309;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C14240 f33310;

    public AbstractViewOnClickListenerC10466(C14941 c14941, View view) {
        super(view);
        this.f33308 = c14941;
        C17423.m40915(view);
        view.setOnClickListener(this);
        view.setOnLongClickListener(this);
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        C14941 c14941 = this.f33308;
        if (c14941.m35959()) {
            if (!c14941.m35964(this.f33309)) {
                return false;
            }
            c14941.m35945(this);
            return true;
        }
        return c14941.m35952(view, this.f33309, this);
    }
}
