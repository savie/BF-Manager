package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۠᩷ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: V685 */
/* JADX INFO: loaded from: classes4.dex */
public class C8426 extends AbstractC14071 {

    /* JADX INFO: renamed from: ۖܰ, reason: not valid java name and contains not printable characters */
    public boolean f29270;

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public CharSequence[] f29271;

    /* JADX INFO: renamed from: ۙܰ, reason: not valid java name and contains not printable characters */
    public CharSequence[] f29272;

    /* JADX INFO: renamed from: ۨܰ, reason: not valid java name and contains not printable characters */
    public String f29273;

    /* JADX INFO: renamed from: ܰܰ, reason: not valid java name and contains not printable characters */
    public String f29274;

    public C8426(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6993.f23526, i, i2);
        CharSequence[] textArray = typedArrayObtainStyledAttributes.getTextArray(2);
        this.f29271 = textArray == null ? typedArrayObtainStyledAttributes.getTextArray(0) : textArray;
        CharSequence[] textArray2 = typedArrayObtainStyledAttributes.getTextArray(3);
        this.f29272 = textArray2 == null ? typedArrayObtainStyledAttributes.getTextArray(1) : textArray2;
        if (typedArrayObtainStyledAttributes.getBoolean(4, typedArrayObtainStyledAttributes.getBoolean(4, false))) {
            m13145((InterfaceC3485) C19009.m43730());
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, C6993.f23522, i, i2);
        String string = typedArrayObtainStyledAttributes2.getString(33);
        this.f29274 = string == null ? typedArrayObtainStyledAttributes2.getString(7) : string;
        typedArrayObtainStyledAttributes2.recycle();
    }

    public C8426(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public C8426(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C12398.m30832(context, R.attr.MT_Protector, android.R.attr.dialogPreferenceStyle));
    }

    public C8426(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22070(CharSequence[] charSequenceArr) {
        this.f29271 = charSequenceArr;
    }

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final CharSequence[] m22074() {
        return this.f29271;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m22073(CharSequence[] charSequenceArr) {
        this.f29272 = charSequenceArr;
    }

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public final CharSequence[] m22075() {
        return this.f29272;
    }

    @Override // l.C4751
    /* JADX INFO: renamed from: ۙ */
    public final void mo13141(CharSequence charSequence) {
        super.mo13141(charSequence);
        if (charSequence == null) {
            this.f29274 = null;
        } else {
            this.f29274 = charSequence.toString();
        }
    }

    @Override // l.C4751
    /* JADX INFO: renamed from: ۡ */
    public final CharSequence mo13159() {
        if (m13161() != null) {
            return m13161().mo4815(this);
        }
        CharSequence charSequenceM22071 = m22071();
        CharSequence charSequenceMo13159 = super.mo13159();
        String str = this.f29274;
        if (str != null) {
            if (charSequenceM22071 == null) {
                charSequenceM22071 = "";
            }
            String str2 = String.format(str, charSequenceM22071);
            if (!TextUtils.equals(str2, charSequenceMo13159)) {
                return str2;
            }
        }
        return charSequenceMo13159;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m22069(String str) {
        boolean zEquals = TextUtils.equals(this.f29273, str);
        if (zEquals && this.f29270) {
            return;
        }
        this.f29273 = str;
        this.f29270 = true;
        m13168(str);
        if (zEquals) {
            return;
        }
        mo8453();
    }

    public final String getValue() {
        return this.f29273;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m22072(String str) {
        CharSequence[] charSequenceArr;
        if (str == null || (charSequenceArr = this.f29272) == null) {
            return -1;
        }
        int length = charSequenceArr.length;
        do {
            length--;
            if (length < 0) {
                return -1;
            }
        } while (!TextUtils.equals(this.f29272[length].toString(), str));
        return length;
    }

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public final CharSequence m22071() {
        CharSequence[] charSequenceArr;
        int iM22072 = m22072(this.f29273);
        if (iM22072 < 0 || (charSequenceArr = this.f29271) == null) {
            return null;
        }
        return charSequenceArr[iM22072];
    }

    @Override // l.C4751
    /* JADX INFO: renamed from: ۙ */
    public final Object mo13134(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    @Override // l.C4751
    /* JADX INFO: renamed from: ۙ */
    public final void mo13142(Object obj) {
        m22069(m13135((String) obj));
    }

    @Override // l.C4751
    /* JADX INFO: renamed from: ֫ */
    public final Parcelable mo13128() {
        super.mo13128();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (m13175()) {
            return absSavedState;
        }
        C18303 c18303 = new C18303();
        c18303.f58395 = this.f29273;
        return c18303;
    }

    @Override // l.C4751
    /* JADX INFO: renamed from: ۙ */
    public final void mo13139(Parcelable parcelable) {
        if (!parcelable.getClass().equals(C18303.class)) {
            super.mo13139(parcelable);
            return;
        }
        C18303 c18303 = (C18303) parcelable;
        super.mo13139(c18303.getSuperState());
        m22069(c18303.f58395);
    }
}
