package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: renamed from: l.۫ܺܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: O51Z */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC12514 extends C4751 {

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public boolean f41878;

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public boolean f41879;

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f41880;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public int f41881;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public int f41882;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public final C12274 f41883;

    public AbstractC12514(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f41883 = new C12274();
        new Handler(Looper.getMainLooper());
        this.f41878 = true;
        this.f41881 = 0;
        this.f41879 = false;
        this.f41882 = Integer.MAX_VALUE;
        this.f41880 = new ArrayList();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6993.f23527, i, i2);
        this.f41878 = typedArrayObtainStyledAttributes.getBoolean(2, typedArrayObtainStyledAttributes.getBoolean(2, true));
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            m31073(typedArrayObtainStyledAttributes.getInt(1, typedArrayObtainStyledAttributes.getInt(1, Integer.MAX_VALUE)));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public AbstractC12514(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public AbstractC12514(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void m31073(int i) {
        if (i != Integer.MAX_VALUE) {
            m13174();
        }
        this.f41882 = i;
    }

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public final int m31076() {
        return this.f41882;
    }

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public final int m31075() {
        return this.f41880.size();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C4751 m31078(int i) {
        return (C4751) this.f41880.get(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31074(C4751 c4751) {
        long jM15456;
        if (this.f41880.contains(c4751)) {
            return;
        }
        if (c4751.m13157() != null) {
            AbstractC12514 parent = this;
            while (parent.getParent() != null) {
                parent = parent.getParent();
            }
            parent.m31077((CharSequence) c4751.m13157());
        }
        if (c4751.m13173() == Integer.MAX_VALUE) {
            if (this.f41878) {
                int i = this.f41881;
                this.f41881 = i + 1;
                c4751.m13129(i);
            }
            if (c4751 instanceof AbstractC12514) {
                ((AbstractC12514) c4751).f41878 = this.f41878;
            }
        }
        int iBinarySearch = Collections.binarySearch(this.f41880, c4751);
        if (iBinarySearch < 0) {
            iBinarySearch = (iBinarySearch * (-1)) - 1;
        }
        int i2 = iBinarySearch;
        c4751.m13162(mo13155());
        synchronized (this) {
            this.f41880.add(i2, c4751);
        }
        C5582 c5582M13176 = m13176();
        String strM13157 = c4751.m13157();
        if (strM13157 != null && this.f41883.containsKey(strM13157)) {
            jM15456 = ((Long) this.f41883.getOrDefault(strM13157, null)).longValue();
            this.f41883.remove(strM13157);
        } else {
            jM15456 = c5582M13176.m15456();
        }
        c4751.m13147(c5582M13176, jM15456);
        c4751.m13148(this);
        if (this.f41879) {
            c4751.mo4129();
        }
        m13156();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C4751 m31077(CharSequence charSequence) {
        C4751 c4751M31077;
        if (charSequence == null) {
            throw new IllegalArgumentException("Key cannot be null");
        }
        if (TextUtils.equals(m13157(), charSequence)) {
            return this;
        }
        int size = this.f41880.size();
        for (int i = 0; i < size; i++) {
            C4751 c4751M31078 = m31078(i);
            if (TextUtils.equals(c4751M31078.m13157(), charSequence)) {
                return c4751M31078;
            }
            if ((c4751M31078 instanceof AbstractC12514) && (c4751M31077 = ((AbstractC12514) c4751M31078).m31077(charSequence)) != null) {
                return c4751M31077;
            }
        }
        return null;
    }

    @Override // l.C4751
    /* JADX INFO: renamed from: ۧ */
    public final void mo4129() {
        super.mo4129();
        this.f41879 = true;
        int size = this.f41880.size();
        for (int i = 0; i < size; i++) {
            m31078(i).mo4129();
        }
    }

    @Override // l.C4751
    /* JADX INFO: renamed from: ܳ */
    public final void mo13172() {
        super.mo13172();
        this.f41879 = false;
        int size = this.f41880.size();
        for (int i = 0; i < size; i++) {
            m31078(i).mo13172();
        }
    }

    @Override // l.C4751
    /* JADX INFO: renamed from: ܰ */
    public final void mo13170(boolean z) {
        super.mo13170(z);
        int size = this.f41880.size();
        for (int i = 0; i < size; i++) {
            m31078(i).m13162(z);
        }
    }

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public final void m31079() {
        synchronized (this) {
            Collections.sort(this.f41880);
        }
    }

    @Override // l.C4751
    /* JADX INFO: renamed from: ܰ */
    public final void mo13167(Bundle bundle) {
        super.mo13167(bundle);
        int size = this.f41880.size();
        for (int i = 0; i < size; i++) {
            m31078(i).mo13167(bundle);
        }
    }

    @Override // l.C4751
    /* JADX INFO: renamed from: ۙ */
    public final void mo13138(Bundle bundle) {
        super.mo13138(bundle);
        int size = this.f41880.size();
        for (int i = 0; i < size; i++) {
            m31078(i).mo13138(bundle);
        }
    }

    @Override // l.C4751
    /* JADX INFO: renamed from: ֫ */
    public final Parcelable mo13128() {
        super.mo13128();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        return new C16747(this.f41882);
    }

    @Override // l.C4751
    /* JADX INFO: renamed from: ۙ */
    public final void mo13139(Parcelable parcelable) {
        if (!parcelable.getClass().equals(C16747.class)) {
            super.mo13139(parcelable);
            return;
        }
        C16747 c16747 = (C16747) parcelable;
        this.f41882 = c16747.f53626;
        super.mo13139(c16747.getSuperState());
    }
}
