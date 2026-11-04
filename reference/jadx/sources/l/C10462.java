package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۢ᩺᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: C682 */
/* JADX INFO: loaded from: classes4.dex */
public class C10462 extends AbstractC14937 {

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public String f33303;

    public C10462(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9430.f30599, i, i2);
        if (typedArrayObtainStyledAttributes.getBoolean(0, typedArrayObtainStyledAttributes.getBoolean(0, false))) {
            m12575((InterfaceC24044) C19413.m44914());
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public C10462(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public C10462(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2506.m8385(context, R.attr.MT_Protector, android.R.attr.editTextPreferenceStyle));
    }

    public C10462(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m26888(String str) {
        boolean zMo12584 = mo12584();
        this.f33303 = str;
        m12601(str);
        boolean zMo12585 = mo12584();
        if (zMo12585 != zMo12584) {
            mo12603(zMo12585);
        }
        mo7306();
    }

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public final String m26889() {
        return this.f33303;
    }

    @Override // l.C3906
    /* JADX INFO: renamed from: ۙ */
    public final Object mo5996(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    @Override // l.C3906
    /* JADX INFO: renamed from: ۙ */
    public final void mo5998(Object obj) {
        m26888(m12561((String) obj));
    }

    @Override // l.C3906
    /* JADX INFO: renamed from: ۤۙ */
    public final boolean mo12584() {
        return TextUtils.isEmpty(this.f33303) || super.mo12584();
    }

    @Override // l.C3906
    /* JADX INFO: renamed from: ۖ */
    public final Parcelable mo5994() {
        super.mo5994();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (m12591()) {
            return absSavedState;
        }
        C8226 c8226 = new C8226();
        c8226.f27076 = this.f33303;
        return c8226;
    }

    @Override // l.C3906
    /* JADX INFO: renamed from: ۙ */
    public final void mo5997(Parcelable parcelable) {
        if (!parcelable.getClass().equals(C8226.class)) {
            super.mo5997(parcelable);
            return;
        }
        C8226 c8226 = (C8226) parcelable;
        super.mo5997(c8226.getSuperState());
        m26888(c8226.f27076);
    }
}
