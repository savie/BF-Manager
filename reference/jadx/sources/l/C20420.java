package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import bin.mt.plus.R;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: l.᩶᩷ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: A4UI */
/* JADX INFO: loaded from: classes5.dex */
public class C20420 extends AbstractC14071 {

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public CharSequence[] f66189;

    /* JADX INFO: renamed from: ۙܰ, reason: not valid java name and contains not printable characters */
    public CharSequence[] f66190;

    /* JADX INFO: renamed from: ܰܰ, reason: not valid java name and contains not printable characters */
    public HashSet f66191;

    public C20420(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        this.f66191 = new HashSet();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6993.f23534, i, 0);
        CharSequence[] textArray = typedArrayObtainStyledAttributes.getTextArray(2);
        this.f66189 = textArray == null ? typedArrayObtainStyledAttributes.getTextArray(0) : textArray;
        CharSequence[] textArray2 = typedArrayObtainStyledAttributes.getTextArray(3);
        this.f66190 = textArray2 == null ? typedArrayObtainStyledAttributes.getTextArray(1) : textArray2;
        typedArrayObtainStyledAttributes.recycle();
    }

    public C20420(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C12398.m30832(context, R.attr.MT_Protector, android.R.attr.dialogPreferenceStyle));
    }

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final CharSequence[] m46191() {
        return this.f66189;
    }

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public final CharSequence[] m46189() {
        return this.f66190;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m46190(Set set) {
        HashSet hashSet = this.f66191;
        hashSet.clear();
        hashSet.addAll(set);
        m13169(set);
        mo8453();
    }

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public final HashSet m46192() {
        return this.f66191;
    }

    @Override // l.C4751
    /* JADX INFO: renamed from: ۙ */
    public final Object mo13134(TypedArray typedArray, int i) {
        CharSequence[] textArray = typedArray.getTextArray(i);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }

    @Override // l.C4751
    /* JADX INFO: renamed from: ۙ */
    public final void mo13142(Object obj) {
        m46190(m13136((Set) obj));
    }

    @Override // l.C4751
    /* JADX INFO: renamed from: ֫ */
    public final Parcelable mo13128() {
        super.mo13128();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (m13175()) {
            return absSavedState;
        }
        C16187 c16187 = new C16187();
        c16187.f52281 = this.f66191;
        return c16187;
    }

    @Override // l.C4751
    /* JADX INFO: renamed from: ۙ */
    public final void mo13139(Parcelable parcelable) {
        if (!parcelable.getClass().equals(C16187.class)) {
            super.mo13139(parcelable);
            return;
        }
        C16187 c16187 = (C16187) parcelable;
        super.mo13139(c16187.getSuperState());
        m46190(c16187.f52281);
    }
}
