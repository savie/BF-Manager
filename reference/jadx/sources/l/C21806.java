package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩷ۘ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: V685 */
/* JADX INFO: loaded from: classes.dex */
public class C21806 extends AbstractC14937 {

    /* JADX INFO: renamed from: ۙ᩷, reason: not valid java name and contains not printable characters */
    public CharSequence[] f69537;

    /* JADX INFO: renamed from: ۤ᩷, reason: not valid java name and contains not printable characters */
    public String f69538;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public CharSequence[] f69539;

    /* JADX INFO: renamed from: ᩷᩷, reason: not valid java name and contains not printable characters */
    public String f69540;

    /* JADX INFO: renamed from: ᩸᩷, reason: not valid java name and contains not printable characters */
    public boolean f69541;

    public C21806(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9430.f30597, i, i2);
        CharSequence[] textArray = typedArrayObtainStyledAttributes.getTextArray(2);
        this.f69539 = textArray == null ? typedArrayObtainStyledAttributes.getTextArray(0) : textArray;
        CharSequence[] textArray2 = typedArrayObtainStyledAttributes.getTextArray(3);
        this.f69537 = textArray2 == null ? typedArrayObtainStyledAttributes.getTextArray(1) : textArray2;
        if (typedArrayObtainStyledAttributes.getBoolean(4, typedArrayObtainStyledAttributes.getBoolean(4, false))) {
            m12575((InterfaceC24044) C4652.m14507());
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, C9430.f30592, i, i2);
        String string = typedArrayObtainStyledAttributes2.getString(33);
        this.f69540 = string == null ? typedArrayObtainStyledAttributes2.getString(7) : string;
        typedArrayObtainStyledAttributes2.recycle();
    }

    public C21806(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public C21806(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2506.m8385(context, R.attr.MT_Protector, android.R.attr.dialogPreferenceStyle));
    }

    public C21806(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49456(CharSequence[] charSequenceArr) {
        this.f69539 = charSequenceArr;
    }

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public final CharSequence[] m49458() {
        return this.f69539;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m49459(CharSequence[] charSequenceArr) {
        this.f69537 = charSequenceArr;
    }

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public final CharSequence[] m49455() {
        return this.f69537;
    }

    @Override // l.C3906
    /* JADX INFO: renamed from: ۙ */
    public final void mo12567(CharSequence charSequence) {
        super.mo12567(charSequence);
        if (charSequence == null) {
            this.f69540 = null;
        } else {
            this.f69540 = charSequence.toString();
        }
    }

    @Override // l.C3906
    /* JADX INFO: renamed from: ᩵ */
    public final CharSequence mo12597() {
        if (m12586() != null) {
            return m12586().mo6271(this);
        }
        CharSequence charSequenceM49461 = m49461();
        CharSequence charSequenceMo12597 = super.mo12597();
        String str = this.f69540;
        if (str != null) {
            if (charSequenceM49461 == null) {
                charSequenceM49461 = "";
            }
            String str2 = String.format(str, charSequenceM49461);
            if (!TextUtils.equals(str2, charSequenceMo12597)) {
                return str2;
            }
        }
        return charSequenceMo12597;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m49460(String str) {
        boolean zEquals = TextUtils.equals(this.f69538, str);
        if (zEquals && this.f69541) {
            return;
        }
        this.f69538 = str;
        this.f69541 = true;
        m12601(str);
        if (zEquals) {
            return;
        }
        mo7306();
    }

    public final String getValue() {
        return this.f69538;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m49457(String str) {
        CharSequence[] charSequenceArr;
        if (str == null || (charSequenceArr = this.f69537) == null) {
            return -1;
        }
        int length = charSequenceArr.length;
        do {
            length--;
            if (length < 0) {
                return -1;
            }
        } while (!TextUtils.equals(this.f69537[length].toString(), str));
        return length;
    }

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public final CharSequence m49461() {
        CharSequence[] charSequenceArr;
        int iM49457 = m49457(this.f69538);
        if (iM49457 < 0 || (charSequenceArr = this.f69539) == null) {
            return null;
        }
        return charSequenceArr[iM49457];
    }

    @Override // l.C3906
    /* JADX INFO: renamed from: ۙ */
    public final Object mo5996(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    @Override // l.C3906
    /* JADX INFO: renamed from: ۙ */
    public final void mo5998(Object obj) {
        m49460(m12561((String) obj));
    }

    @Override // l.C3906
    /* JADX INFO: renamed from: ۖ */
    public final Parcelable mo5994() {
        super.mo5994();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (m12591()) {
            return absSavedState;
        }
        C14191 c14191 = new C14191();
        c14191.f44867 = this.f69538;
        return c14191;
    }

    @Override // l.C3906
    /* JADX INFO: renamed from: ۙ */
    public final void mo5997(Parcelable parcelable) {
        if (!parcelable.getClass().equals(C14191.class)) {
            super.mo5997(parcelable);
            return;
        }
        C14191 c14191 = (C14191) parcelable;
        super.mo5997(c14191.getSuperState());
        m49460(c14191.f44867);
    }
}
