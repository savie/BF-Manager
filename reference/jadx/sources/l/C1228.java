package l;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: renamed from: l.֨ܰ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: J63W */
/* JADX INFO: loaded from: classes3.dex */
public final class C1228 extends AbstractC11800 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Drawable f4472;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f4473;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public ColorStateList f4474;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final SparseArray f4475;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f4476;

    public C1228(View view) {
        super(view);
        SparseArray sparseArray = new SparseArray(4);
        this.f4475 = sparseArray;
        TextView textView = (TextView) view.findViewById(R.id.title);
        sparseArray.put(R.id.title, textView);
        sparseArray.put(R.id.summary, view.findViewById(R.id.summary));
        sparseArray.put(R.id.icon, view.findViewById(R.id.icon));
        sparseArray.put(bin.mt.plus.R.id.MT_Protector, view.findViewById(bin.mt.plus.R.id.MT_Protector));
        sparseArray.put(R.id.icon_frame, view.findViewById(R.id.icon_frame));
        this.f4472 = view.getBackground();
        if (textView != null) {
            this.f4474 = textView.getTextColors();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final View m4463(int i) {
        SparseArray sparseArray = this.f4475;
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
    public final boolean m4461() {
        return this.f4473;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4460(boolean z) {
        this.f4473 = z;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m4465() {
        return this.f4476;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m4464(boolean z) {
        this.f4476 = z;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m4462() {
        ColorStateList colorStateList;
        Drawable background = this.itemView.getBackground();
        Drawable drawable = this.f4472;
        if (background != drawable) {
            View view = this.itemView;
            int i = C22666.f73603;
            view.setBackground(drawable);
        }
        TextView textView = (TextView) m4463(R.id.title);
        if (textView == null || (colorStateList = this.f4474) == null || textView.getTextColors().equals(colorStateList)) {
            return;
        }
        textView.setTextColor(colorStateList);
    }
}
