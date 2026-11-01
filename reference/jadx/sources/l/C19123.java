package l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* JADX INFO: renamed from: l.᩵֨֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 5AG9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C19123 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C12562 f61781;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Object f61782;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final TextView f61783;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final TextView f61784;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ViewGroup f61785;

    public C19123(View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        this.f61785 = viewGroup;
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.getChildAt(0);
        this.f61783 = (TextView) viewGroup2.getChildAt(0);
        this.f61784 = viewGroup2.getChildCount() > 1 ? (TextView) viewGroup2.getChildAt(1) : null;
        C12562 c12562 = viewGroup.getChildCount() > 1 ? (C12562) viewGroup.getChildAt(1) : null;
        this.f61781 = c12562;
        if (c12562 != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: l.۠֨֨
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C12562 c12563 = this.f25779.f61781;
                    c12563.setChecked(!c12563.isChecked());
                }
            });
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43938(boolean z) {
        ViewGroup viewGroup = this.f61785;
        viewGroup.setFocusable(z);
        viewGroup.setClickable(z);
        this.f61783.setEnabled(z);
        TextView textView = this.f61784;
        if (textView != null) {
            textView.setAlpha(z ? 1.0f : 0.3f);
        }
        C12562 c12562 = this.f61781;
        if (c12562 != null) {
            c12562.setEnabled(z);
        }
    }
}
