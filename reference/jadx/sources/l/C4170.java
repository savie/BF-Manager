package l;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: renamed from: l.ۘ᩶ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: J63W */
/* JADX INFO: loaded from: classes3.dex */
public final class C4170 extends AbstractC12554 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f15215;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Drawable f15216;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public ColorStateList f15217;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f15218;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final SparseArray f15219;

    public C4170(View view) {
        super(view);
        SparseArray sparseArray = new SparseArray(4);
        this.f15219 = sparseArray;
        TextView textView = (TextView) view.findViewById(R.id.title);
        sparseArray.put(R.id.title, textView);
        sparseArray.put(R.id.summary, view.findViewById(R.id.summary));
        sparseArray.put(R.id.icon, view.findViewById(R.id.icon));
        sparseArray.put(bin.mt.plus.R.id.MT_Protector, view.findViewById(bin.mt.plus.R.id.MT_Protector));
        sparseArray.put(R.id.icon_frame, view.findViewById(R.id.icon_frame));
        this.f15216 = view.getBackground();
        if (textView != null) {
            this.f15217 = textView.getTextColors();
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final View m11813(int i) {
        SparseArray sparseArray = this.f15219;
        View view = (View) sparseArray.get(i);
        if (view != null) {
            return view;
        }
        View viewFindViewById = this.itemView.findViewById(i);
        if (viewFindViewById != null) {
            sparseArray.put(i, viewFindViewById);
        }
        return viewFindViewById;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m11811() {
        return this.f15218;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11810(boolean z) {
        this.f15218 = z;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m11815() {
        return this.f15215;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m11814(boolean z) {
        this.f15215 = z;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m11812() {
        ColorStateList colorStateList;
        Drawable background = this.itemView.getBackground();
        Drawable drawable = this.f15216;
        if (background != drawable) {
            View view = this.itemView;
            int i = C5031.f17539;
            view.setBackground(drawable);
        }
        TextView textView = (TextView) m11813(R.id.title);
        if (textView == null || (colorStateList = this.f15217) == null || textView.getTextColors().equals(colorStateList)) {
            return;
        }
        textView.setTextColor(colorStateList);
    }
}
