package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۬᩷ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: C682 */
/* JADX INFO: loaded from: classes4.dex */
public class C13365 extends AbstractC14071 {

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public String f44290;

    public C13365(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6993.f23523, i, i2);
        if (typedArrayObtainStyledAttributes.getBoolean(0, typedArrayObtainStyledAttributes.getBoolean(0, false))) {
            m13145((InterfaceC3485) C1369.m4814());
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public C13365(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public C13365(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C12398.m30832(context, R.attr.MT_Protector, android.R.attr.editTextPreferenceStyle));
    }

    public C13365(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m32862(String str) {
        boolean zMo13155 = mo13155();
        this.f44290 = str;
        m13168(str);
        boolean zMo13156 = mo13155();
        if (zMo13156 != zMo13155) {
            mo13170(zMo13156);
        }
        mo8453();
    }

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final String m32863() {
        return this.f44290;
    }

    @Override // l.C4751
    /* JADX INFO: renamed from: ۙ */
    public final Object mo13134(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    @Override // l.C4751
    /* JADX INFO: renamed from: ۙ */
    public final void mo13142(Object obj) {
        m32862(m13135((String) obj));
    }

    @Override // l.C4751
    /* JADX INFO: renamed from: ۚۙ */
    public final boolean mo13155() {
        return TextUtils.isEmpty(this.f44290) || super.mo13155();
    }

    @Override // l.C4751
    /* JADX INFO: renamed from: ֫ */
    public final Parcelable mo13128() {
        super.mo13128();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (m13175()) {
            return absSavedState;
        }
        C22537 c22537 = new C22537();
        c22537.f73507 = this.f44290;
        return c22537;
    }

    @Override // l.C4751
    /* JADX INFO: renamed from: ۙ */
    public final void mo13139(Parcelable parcelable) {
        if (!parcelable.getClass().equals(C22537.class)) {
            super.mo13139(parcelable);
            return;
        }
        C22537 c22537 = (C22537) parcelable;
        super.mo13139(c22537.getSuperState());
        m32862(c22537.f73507);
    }
}
