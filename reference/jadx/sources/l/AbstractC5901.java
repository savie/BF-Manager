package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.widget.TextView;
import java.io.Serializable;

/* JADX INFO: renamed from: l.ۚ᩶᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: Z681 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5901 extends C3906 {

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public boolean f20199;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public CharSequence f20200;

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public CharSequence f20201;

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public boolean f20202;

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public boolean f20203;

    public AbstractC5901(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public AbstractC5901(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public AbstractC5901(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AbstractC5901(Context context) {
        this(context, null);
    }

    @Override // l.C3906
    /* JADX INFO: renamed from: ֨ */
    public final void mo12556() {
        boolean z = !this.f20203;
        m12566((Serializable) Boolean.valueOf(z));
        m17138(z);
    }

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m17139() {
        return this.f20203;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void m17138(boolean z) {
        boolean z2 = this.f20203 != z;
        if (z2 || !this.f20199) {
            this.f20203 = z;
            this.f20199 = true;
            m12607(z);
            if (z2) {
                mo12603(mo12584());
                mo7306();
            }
        }
    }

    @Override // l.C3906
    /* JADX INFO: renamed from: ۤۙ */
    public final boolean mo12584() {
        boolean z;
        if (this.f20202) {
            z = this.f20203;
        } else {
            z = !this.f20203;
        }
        return z || super.mo12584();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m17141(String str) {
        this.f20201 = str;
        if (this.f20203) {
            mo7306();
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m17137(String str) {
        this.f20200 = str;
        if (this.f20203) {
            return;
        }
        mo7306();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m17136(boolean z) {
        this.f20202 = z;
    }

    @Override // l.C3906
    /* JADX INFO: renamed from: ۙ */
    public final Object mo5996(TypedArray typedArray, int i) {
        return Boolean.valueOf(typedArray.getBoolean(i, false));
    }

    @Override // l.C3906
    /* JADX INFO: renamed from: ۙ */
    public final void mo5998(Object obj) {
        if (obj == null) {
            obj = Boolean.FALSE;
        }
        m17138(m12576(((Boolean) obj).booleanValue()));
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0030  */
    /* JADX WARN: Code duplicated, block: B:20:0x003a  */
    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m17140(View view) {
        boolean z;
        int i;
        CharSequence charSequenceMo12597;
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            if (this.f20203 && !TextUtils.isEmpty(this.f20201)) {
                textView.setText(this.f20201);
            } else {
                if (this.f20203 || TextUtils.isEmpty(this.f20200)) {
                    z = true;
                } else {
                    textView.setText(this.f20200);
                }
                if (z) {
                    charSequenceMo12597 = mo12597();
                    if (!TextUtils.isEmpty(charSequenceMo12597)) {
                        textView.setText(charSequenceMo12597);
                        z = false;
                    }
                }
                i = z ? 8 : 0;
                if (i != textView.getVisibility()) {
                    textView.setVisibility(i);
                }
            }
            z = false;
            if (z) {
                charSequenceMo12597 = mo12597();
                if (!TextUtils.isEmpty(charSequenceMo12597)) {
                    textView.setText(charSequenceMo12597);
                    z = false;
                }
            }
            if (z) {
            }
            if (i != textView.getVisibility()) {
                textView.setVisibility(i);
            }
        }
    }

    @Override // l.C3906
    /* JADX INFO: renamed from: ۖ */
    public final Parcelable mo5994() {
        super.mo5994();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (m12591()) {
            return absSavedState;
        }
        C13358 c13358 = new C13358();
        c13358.f42592 = this.f20203;
        return c13358;
    }

    @Override // l.C3906
    /* JADX INFO: renamed from: ۙ */
    public final void mo5997(Parcelable parcelable) {
        if (!parcelable.getClass().equals(C13358.class)) {
            super.mo5997(parcelable);
            return;
        }
        C13358 c13358 = (C13358) parcelable;
        super.mo5997(c13358.getSuperState());
        m17138(c13358.f42592);
    }
}
