package l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۘۤܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28G3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3880 extends AbstractC0414 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7409 f14505;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String[] f14506;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f14507;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final float[] f14508;

    @Override // l.AbstractC0414
    public final void onBindViewHolder(AbstractC12554 abstractC12554, final int i) {
        C21520 c21520 = (C21520) abstractC12554;
        String[] strArr = this.f14506;
        if (i < strArr.length) {
            c21520.f69920.setText(strArr[i]);
        }
        if (i == this.f14507) {
            c21520.itemView.setSelected(true);
            c21520.f69919.setVisibility(0);
        } else {
            c21520.itemView.setSelected(false);
            c21520.f69919.setVisibility(4);
        }
        c21520.itemView.setOnClickListener(new View.OnClickListener() { // from class: l.۬ۤܰ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C3880.m11253(this.f43514, i);
            }
        });
    }

    public C3880(C7409 c7409, String[] strArr, float[] fArr) {
        this.f14505 = c7409;
        this.f14506 = strArr;
        this.f14508 = fArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11255(float f) {
        int i = 0;
        int i2 = 0;
        float f2 = Float.MAX_VALUE;
        while (true) {
            float[] fArr = this.f14508;
            if (i < fArr.length) {
                float fAbs = Math.abs(f - fArr[i]);
                if (fAbs < f2) {
                    i2 = i;
                    f2 = fAbs;
                }
                i++;
            } else {
                this.f14507 = i2;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m11254() {
        return this.f14506[this.f14507];
    }

    @Override // l.AbstractC0414
    public final AbstractC12554 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C21520(LayoutInflater.from(this.f14505.getContext()).inflate(R.layout.MT_Protector, viewGroup, false));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m11253(C3880 c3880, int i) {
        C7409 c7409 = c3880.f14505;
        if (i != c3880.f14507) {
            C7409.m19770(c7409, c3880.f14508[i]);
        }
        c7409.f24630.dismiss();
    }

    @Override // l.AbstractC0414
    public final int getItemCount() {
        return this.f14506.length;
    }
}
