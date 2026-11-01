package l;

import android.content.Context;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩻᩺᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: U2CZ */
/* JADX INFO: loaded from: classes.dex */
public class C24018 extends C2830 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f77827;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public InterfaceC11318 f77828;

    public C24018(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C24018(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m52853();
        if (isInEditMode()) {
            return;
        }
        setOnClickListener(new ViewOnClickListenerC6378(0, this));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m52852(C24018 c24018) {
        if (c24018.f77827 == 2) {
            c24018.m52854(0);
        } else {
            c24018.m52854(2);
        }
        InterfaceC11318 interfaceC11318 = c24018.f77828;
        if (interfaceC11318 != null) {
            interfaceC11318.mo26770(c24018.f77827);
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m52853() {
        int i = this.f77827;
        if (i == 0) {
            setImageResource(R.drawable.MT_Protector);
            return;
        }
        if (i == 1) {
            setImageResource(R.drawable.MT_Protector);
            if (isInEditMode()) {
                return;
            }
            getDrawable().setColorFilter(C20368.f65970, PorterDuff.Mode.SRC_IN);
            return;
        }
        if (i != 2) {
            return;
        }
        setImageResource(R.drawable.MT_Protector);
        if (isInEditMode()) {
            return;
        }
        getDrawable().setColorFilter(C20368.f65970, PorterDuff.Mode.SRC_IN);
    }

    @Override // android.view.View
    @InterfaceC16341
    public void setScaleX(float f) {
        if (f == 0.0f) {
            setVisibility(8);
            f = 1.0f;
        }
        super.setScaleX(f);
        requestLayout();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        float scaleX = getScaleX();
        if (scaleX != 1.0f) {
            setMeasuredDimension((int) (getMeasuredWidth() * scaleX), getMeasuredHeight());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52854(int i) {
        if (this.f77827 != i) {
            this.f77827 = i;
            m52853();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52855(InterfaceC11318 interfaceC11318) {
        this.f77828 = interfaceC11318;
    }
}
