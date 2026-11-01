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

/* JADX INFO: renamed from: l.ܺ᩶ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z681 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16166 extends C4751 {

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public CharSequence f52239;

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public boolean f52240;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public boolean f52241;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public CharSequence f52242;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public boolean f52243;

    public AbstractC16166(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public AbstractC16166(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public AbstractC16166(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AbstractC16166(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m38263() {
        return this.f52240;
    }

    @Override // l.C4751
    /* JADX INFO: renamed from: ᩻ */
    public final void mo8454() {
        boolean z = !this.f52240;
        m13140((Serializable) Boolean.valueOf(z));
        m38259(z);
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void m38259(boolean z) {
        boolean z2 = this.f52240 != z;
        if (z2 || !this.f52241) {
            this.f52240 = z;
            this.f52241 = true;
            m13130(z);
            if (z2) {
                mo13170(mo13155());
                mo8453();
            }
        }
    }

    @Override // l.C4751
    /* JADX INFO: renamed from: ۚۙ */
    public final boolean mo13155() {
        boolean z;
        if (this.f52243) {
            z = this.f52240;
        } else {
            z = !this.f52240;
        }
        return z || super.mo13155();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m38260(String str) {
        this.f52239 = str;
        if (this.f52240) {
            mo8453();
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m38261(String str) {
        this.f52242 = str;
        if (this.f52240) {
            return;
        }
        mo8453();
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final void m38262(boolean z) {
        this.f52243 = z;
    }

    @Override // l.C4751
    /* JADX INFO: renamed from: ۙ */
    public final Object mo13134(TypedArray typedArray, int i) {
        return Boolean.valueOf(typedArray.getBoolean(i, false));
    }

    @Override // l.C4751
    /* JADX INFO: renamed from: ۙ */
    public final void mo13142(Object obj) {
        if (obj == null) {
            obj = Boolean.FALSE;
        }
        m38259(m13150(((Boolean) obj).booleanValue()));
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0030  */
    /* JADX WARN: Code duplicated, block: B:20:0x003a  */
    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m38264(View view) {
        boolean z;
        int i;
        CharSequence charSequenceMo13159;
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            if (this.f52240 && !TextUtils.isEmpty(this.f52239)) {
                textView.setText(this.f52239);
            } else {
                if (this.f52240 || TextUtils.isEmpty(this.f52242)) {
                    z = true;
                } else {
                    textView.setText(this.f52242);
                }
                if (z) {
                    charSequenceMo13159 = mo13159();
                    if (!TextUtils.isEmpty(charSequenceMo13159)) {
                        textView.setText(charSequenceMo13159);
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
                charSequenceMo13159 = mo13159();
                if (!TextUtils.isEmpty(charSequenceMo13159)) {
                    textView.setText(charSequenceMo13159);
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

    @Override // l.C4751
    /* JADX INFO: renamed from: ֫ */
    public final Parcelable mo13128() {
        super.mo13128();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (m13175()) {
            return absSavedState;
        }
        C21104 c21104 = new C21104();
        c21104.f68745 = this.f52240;
        return c21104;
    }

    @Override // l.C4751
    /* JADX INFO: renamed from: ۙ */
    public final void mo13139(Parcelable parcelable) {
        if (!parcelable.getClass().equals(C21104.class)) {
            super.mo13139(parcelable);
            return;
        }
        C21104 c21104 = (C21104) parcelable;
        super.mo13139(c21104.getSuperState());
        m38259(c21104.f68745);
    }
}
