package l;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܶۤܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28G3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15171 extends AbstractC0414 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7409 f49547;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Drawable[] f49548;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String[] f49549;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String[] f49550;

    @Override // l.AbstractC0414
    public final long getItemId(int i) {
        return i;
    }

    @Override // l.AbstractC0414
    public final void onBindViewHolder(AbstractC12554 abstractC12554, int i) {
        C22932 c22932 = (C22932) abstractC12554;
        if (m36394(i)) {
            c22932.itemView.setLayoutParams(new C22432(-1, -2));
        } else {
            c22932.itemView.setLayoutParams(new C22432(0, 0));
        }
        c22932.f74544.setText(this.f49550[i]);
        String[] strArr = this.f49549;
        if (strArr[i] == null) {
            c22932.f74543.setVisibility(8);
        } else {
            c22932.f74543.setText(strArr[i]);
        }
        Drawable[] drawableArr = this.f49548;
        if (drawableArr[i] == null) {
            c22932.f74542.setVisibility(8);
        } else {
            c22932.f74542.setImageDrawable(drawableArr[i]);
        }
    }

    public C15171(C7409 c7409, String[] strArr, Drawable[] drawableArr) {
        this.f49547 = c7409;
        this.f49550 = strArr;
        this.f49549 = new String[strArr.length];
        this.f49548 = drawableArr;
    }

    @Override // l.AbstractC0414
    public final AbstractC12554 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C7409 c7409 = this.f49547;
        return new C22932(c7409, LayoutInflater.from(c7409.getContext()).inflate(R.layout.MT_Protector, viewGroup, false));
    }

    @Override // l.AbstractC0414
    public final int getItemCount() {
        return this.f49550.length;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36395(int i, String str) {
        this.f49549[i] = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m36396() {
        return m36394(1) || m36394(0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m36394(int i) {
        C7409 c7409 = this.f49547;
        if (c7409.f24662 == null) {
            return false;
        }
        if (i == 0) {
            return c7409.f24662.mo25841(13);
        }
        if (i != 1) {
            return true;
        }
        return c7409.f24662.mo25841(30) && c7409.f24662.mo25841(29);
    }
}
