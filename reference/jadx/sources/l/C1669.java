package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import bin.mt.plus.R;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: l.֫ۘ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: A4UI */
/* JADX INFO: loaded from: classes3.dex */
public class C1669 extends AbstractC14937 {

    /* JADX INFO: renamed from: ۙ᩷, reason: not valid java name and contains not printable characters */
    public CharSequence[] f5770;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public CharSequence[] f5771;

    /* JADX INFO: renamed from: ᩷᩷, reason: not valid java name and contains not printable characters */
    public HashSet f5772;

    public C1669(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        this.f5772 = new HashSet();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9430.f30593, i, 0);
        CharSequence[] textArray = typedArrayObtainStyledAttributes.getTextArray(2);
        this.f5771 = textArray == null ? typedArrayObtainStyledAttributes.getTextArray(0) : textArray;
        CharSequence[] textArray2 = typedArrayObtainStyledAttributes.getTextArray(3);
        this.f5770 = textArray2 == null ? typedArrayObtainStyledAttributes.getTextArray(1) : textArray2;
        typedArrayObtainStyledAttributes.recycle();
    }

    public C1669(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2506.m8385(context, R.attr.MT_Protector, android.R.attr.dialogPreferenceStyle));
    }

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public final CharSequence[] m6000() {
        return this.f5771;
    }

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public final CharSequence[] m6001() {
        return this.f5770;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m5999(Set set) {
        HashSet hashSet = this.f5772;
        hashSet.clear();
        hashSet.addAll(set);
        m12602(set);
        mo7306();
    }

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public final HashSet m5995() {
        return this.f5772;
    }

    @Override // l.C3906
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo5996(TypedArray typedArray, int i) {
        CharSequence[] textArray = typedArray.getTextArray(i);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }

    @Override // l.C3906
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo5998(Object obj) {
        m5999(m12562((Set) obj));
    }

    @Override // l.C3906
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Parcelable mo5994() {
        super.mo5994();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (m12591()) {
            return absSavedState;
        }
        C5398 c5398 = new C5398();
        c5398.f18890 = this.f5772;
        return c5398;
    }

    @Override // l.C3906
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo5997(Parcelable parcelable) {
        if (!parcelable.getClass().equals(C5398.class)) {
            super.mo5997(parcelable);
            return;
        }
        C5398 c5398 = (C5398) parcelable;
        super.mo5997(c5398.getSuperState());
        m5999(c5398.f18890);
    }
}
