package l;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: renamed from: l.ۨ᩶᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Y9TO */
/* JADX INFO: loaded from: classes4.dex */
public class C12616 extends C10467 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public View.OnClickListener f40478;

    public C12616(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C12616(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // android.widget.AdapterView, android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f40478 = onClickListener;
    }

    @Override // l.C10467, android.widget.Spinner, android.view.View
    public final boolean performClick() {
        View.OnClickListener onClickListener = this.f40478;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            return true;
        }
        return super.performClick();
    }
}
