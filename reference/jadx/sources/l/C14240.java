package l;

import android.content.Context;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܰ֡᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: U2CZ */
/* JADX INFO: loaded from: classes5.dex */
public class C14240 extends C15688 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f44993;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public InterfaceC3800 f44994;

    public C14240(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C14240(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m34562();
        if (isInEditMode()) {
            return;
        }
        setOnClickListener(new ViewOnClickListenerC23938(this, 0));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m34561(C14240 c14240) {
        if (c14240.f44993 == 2) {
            c14240.m34563(0);
        } else {
            c14240.m34563(2);
        }
        InterfaceC3800 interfaceC3800 = c14240.f44994;
        if (interfaceC3800 != null) {
            interfaceC3800.mo12333(c14240.f44993);
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m34562() {
        int i = this.f44993;
        if (i == 0) {
            setImageResource(R.drawable.MT_Protector);
            return;
        }
        if (i == 1) {
            setImageResource(R.drawable.MT_Protector);
            if (isInEditMode()) {
                return;
            }
            getDrawable().setColorFilter(C3296.f10738, PorterDuff.Mode.SRC_IN);
            return;
        }
        if (i != 2) {
            return;
        }
        setImageResource(R.drawable.MT_Protector);
        if (isInEditMode()) {
            return;
        }
        getDrawable().setColorFilter(C3296.f10738, PorterDuff.Mode.SRC_IN);
    }

    @Override // android.view.View
    @InterfaceC19352
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
    public final void m34563(int i) {
        if (this.f44993 != i) {
            this.f44993 = i;
            m34562();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34564(InterfaceC3800 interfaceC3800) {
        this.f44994 = interfaceC3800;
    }
}
