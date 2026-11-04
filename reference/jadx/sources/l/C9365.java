package l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۡۨ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 28G3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9365 extends AbstractC12964 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String[] f30430;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f30431;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final float[] f30432;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12921 f30433;

    @Override // l.AbstractC12964
    public final void onBindViewHolder(AbstractC11800 abstractC11800, final int i) {
        C13840 c13840 = (C13840) abstractC11800;
        String[] strArr = this.f30430;
        if (i < strArr.length) {
            c13840.f43936.setText(strArr[i]);
        }
        if (i == this.f30431) {
            c13840.itemView.setSelected(true);
            c13840.f43935.setVisibility(0);
        } else {
            c13840.itemView.setSelected(false);
            c13840.f43935.setVisibility(4);
        }
        c13840.itemView.setOnClickListener(new View.OnClickListener() { // from class: l.֨ۨ᩷
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C9365.m24676(this.f4291, i);
            }
        });
    }

    public C9365(C12921 c12921, String[] strArr, float[] fArr) {
        this.f30433 = c12921;
        this.f30430 = strArr;
        this.f30432 = fArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24678(float f) {
        int i = 0;
        int i2 = 0;
        float f2 = Float.MAX_VALUE;
        while (true) {
            float[] fArr = this.f30432;
            if (i < fArr.length) {
                float fAbs = Math.abs(f - fArr[i]);
                if (fAbs < f2) {
                    i2 = i;
                    f2 = fAbs;
                }
                i++;
            } else {
                this.f30431 = i2;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m24677() {
        return this.f30430[this.f30431];
    }

    @Override // l.AbstractC12964
    public final AbstractC11800 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C13840(LayoutInflater.from(this.f30433.getContext()).inflate(R.layout.MT_Protector, viewGroup, false));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m24676(C9365 c9365, int i) {
        C12921 c12921 = c9365.f30433;
        if (i != c9365.f30431) {
            C12921.m32008(c12921, c9365.f30432[i]);
        }
        c12921.f41348.dismiss();
    }

    @Override // l.AbstractC12964
    public final int getItemCount() {
        return this.f30430.length;
    }
}
