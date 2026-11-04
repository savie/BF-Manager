package l;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۜۨ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 28G3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7129 extends AbstractC12964 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Drawable[] f23486;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String[] f23487;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String[] f23488;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12921 f23489;

    @Override // l.AbstractC12964
    public final long getItemId(int i) {
        return i;
    }

    @Override // l.AbstractC12964
    public final void onBindViewHolder(AbstractC11800 abstractC11800, int i) {
        C8620 c8620 = (C8620) abstractC11800;
        if (m19526(i)) {
            c8620.itemView.setLayoutParams(new C18185(-1, -2));
        } else {
            c8620.itemView.setLayoutParams(new C18185(0, 0));
        }
        c8620.f28179.setText(this.f23488[i]);
        String[] strArr = this.f23487;
        if (strArr[i] == null) {
            c8620.f28178.setVisibility(8);
        } else {
            c8620.f28178.setText(strArr[i]);
        }
        Drawable[] drawableArr = this.f23486;
        if (drawableArr[i] == null) {
            c8620.f28177.setVisibility(8);
        } else {
            c8620.f28177.setImageDrawable(drawableArr[i]);
        }
    }

    public C7129(C12921 c12921, String[] strArr, Drawable[] drawableArr) {
        this.f23489 = c12921;
        this.f23488 = strArr;
        this.f23487 = new String[strArr.length];
        this.f23486 = drawableArr;
    }

    @Override // l.AbstractC12964
    public final AbstractC11800 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C12921 c12921 = this.f23489;
        return new C8620(c12921, LayoutInflater.from(c12921.getContext()).inflate(R.layout.MT_Protector, viewGroup, false));
    }

    @Override // l.AbstractC12964
    public final int getItemCount() {
        return this.f23488.length;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19527(int i, String str) {
        this.f23487[i] = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m19528() {
        return m19526(1) || m19526(0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m19526(int i) {
        C12921 c12921 = this.f23489;
        if (c12921.f41312 == null) {
            return false;
        }
        if (i == 0) {
            return c12921.f41312.mo21703(13);
        }
        if (i != 1) {
            return true;
        }
        return c12921.f41312.mo21703(30) && c12921.f41312.mo21703(29);
    }
}
