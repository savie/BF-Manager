package l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩶᩺᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: H7TS */
/* JADX INFO: loaded from: classes5.dex */
public class C20490 extends C8973 {

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public float f66450;

    public C20490(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f66450 = 1.0f;
    }

    public C20490(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f66450 = 1.0f;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46295(float f) {
        this.f66450 = f;
        m10196();
    }

    @Override // android.view.View
    public final void setAlpha(float f) {
        super.setAlpha(f);
        m10196();
    }

    @Override // l.AbstractC3472
    /* JADX INFO: renamed from: ۙ */
    public final void mo10199(C5444 c5444) {
        int i;
        C16257 c16257;
        super.mo10199(c5444);
        float alpha = getAlpha();
        for (int i2 = 0; i2 < this.f12751; i2++) {
            View viewById = c5444.getViewById(this.f12747[i2]);
            if (viewById != null) {
                viewById.setAlpha(alpha);
            }
        }
        float f = this.f66450;
        for (int i3 = 0; i3 < this.f12751 && (i = this.f12747[i3]) != R.id.divider_left && i != R.id.divider_right; i3++) {
            View viewById2 = c5444.getViewById(i);
            if (viewById2 != null) {
                Drawable background = viewById2.getBackground();
                C13638.requireNonNull(background);
                if (!(background instanceof C16257)) {
                    if (i == R.id.shadow_left_top || i == R.id.shadow_right_top) {
                        c16257 = new C16257(background, 1);
                    } else if (i == R.id.shadow_left_bottom || i == R.id.shadow_right_bottom) {
                        c16257 = new C16257(background, 3);
                    } else if (i == R.id.shadow_left) {
                        c16257 = new C16257(background, 2);
                    } else if (i == R.id.shadow_right) {
                        c16257 = new C16257(background, 0);
                    } else {
                        throw new RuntimeException();
                    }
                    background = c16257;
                    viewById2.setBackground(background);
                }
                ((C16257) background).m38405(f);
            }
        }
    }
}
