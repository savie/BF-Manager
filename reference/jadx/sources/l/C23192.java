package l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩹֡᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: H7TS */
/* JADX INFO: loaded from: classes.dex */
public class C23192 extends C0465 {

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public float f75159;

    public C23192(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f75159 = 1.0f;
    }

    public C23192(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f75159 = 1.0f;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52117(float f) {
        this.f75159 = f;
        m32668();
    }

    @Override // android.view.View
    public final void setAlpha(float f) {
        super.setAlpha(f);
        m32668();
    }

    @Override // l.AbstractC13143
    /* JADX INFO: renamed from: ۙ */
    public final void mo32672(C16872 c16872) {
        int i;
        C15732 c15732;
        super.mo32672(c16872);
        float alpha = getAlpha();
        for (int i2 = 0; i2 < this.f42035; i2++) {
            View viewById = c16872.getViewById(this.f42036[i2]);
            if (viewById != null) {
                viewById.setAlpha(alpha);
            }
        }
        float f = this.f75159;
        for (int i3 = 0; i3 < this.f42035 && (i = this.f42036[i3]) != R.id.divider_left && i != R.id.divider_right; i3++) {
            View viewById2 = c16872.getViewById(i);
            if (viewById2 != null) {
                Drawable background = viewById2.getBackground();
                C17359.requireNonNull(background);
                if (!(background instanceof C15732)) {
                    if (i == R.id.shadow_left_top || i == R.id.shadow_right_top) {
                        c15732 = new C15732(background, 1);
                    } else if (i == R.id.shadow_left_bottom || i == R.id.shadow_right_bottom) {
                        c15732 = new C15732(background, 3);
                    } else if (i == R.id.shadow_left) {
                        c15732 = new C15732(background, 2);
                    } else if (i == R.id.shadow_right) {
                        c15732 = new C15732(background, 0);
                    } else {
                        throw new RuntimeException();
                    }
                    background = c15732;
                    viewById2.setBackground(background);
                }
                ((C15732) background).m37641(f);
            }
        }
    }
}
