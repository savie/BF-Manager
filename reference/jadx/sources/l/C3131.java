package l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* JADX INFO: renamed from: l.ۗۗ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 5AG9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3131 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Object f10140;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final TextView f10141;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final TextView f10142;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ViewGroup f10143;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C1255 f10144;

    public C3131(View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        this.f10143 = viewGroup;
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.getChildAt(0);
        this.f10142 = (TextView) viewGroup2.getChildAt(0);
        this.f10141 = viewGroup2.getChildCount() > 1 ? (TextView) viewGroup2.getChildAt(1) : null;
        C1255 c1255 = viewGroup.getChildCount() > 1 ? (C1255) viewGroup.getChildAt(1) : null;
        this.f10144 = c1255;
        if (c1255 != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: l.᩹ۗ۫
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C1255 c1256 = this.f75413.f10144;
                    c1256.setChecked(!c1256.isChecked());
                }
            });
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10211(boolean z) {
        ViewGroup viewGroup = this.f10143;
        viewGroup.setFocusable(z);
        viewGroup.setClickable(z);
        this.f10142.setEnabled(z);
        TextView textView = this.f10141;
        if (textView != null) {
            textView.setAlpha(z ? 1.0f : 0.3f);
        }
        C1255 c1255 = this.f10144;
        if (c1255 != null) {
            c1255.setEnabled(z);
        }
    }
}
