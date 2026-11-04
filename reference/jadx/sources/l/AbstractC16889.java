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

/* JADX INFO: renamed from: l.ܺܰ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: O51Z */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC16889 extends C3906 {

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public int f55237;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public int f55238;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f55239;

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public boolean f55240;

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public final C9086 f55241;

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public boolean f55242;

    public AbstractC16889(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f55241 = new C9086();
        new Handler(Looper.getMainLooper());
        this.f55240 = true;
        this.f55237 = 0;
        this.f55242 = false;
        this.f55238 = Integer.MAX_VALUE;
        this.f55239 = new ArrayList();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9430.f30591, i, i2);
        this.f55240 = typedArrayObtainStyledAttributes.getBoolean(2, typedArrayObtainStyledAttributes.getBoolean(2, true));
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            m39847(typedArrayObtainStyledAttributes.getInt(1, typedArrayObtainStyledAttributes.getInt(1, Integer.MAX_VALUE)));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public AbstractC16889(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public AbstractC16889(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void m39847(int i) {
        if (i != Integer.MAX_VALUE) {
            m12558();
        }
        this.f55238 = i;
    }

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public final int m39848() {
        return this.f55238;
    }

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final int m39845() {
        return this.f55239.size();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C3906 m39849(int i) {
        return (C3906) this.f55239.get(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39844(C3906 c3906) {
        long jM2340;
        if (this.f55239.contains(c3906)) {
            return;
        }
        if (c3906.m12557() != null) {
            AbstractC16889 parent = this;
            while (parent.getParent() != null) {
                parent = parent.getParent();
            }
            parent.m39850((CharSequence) c3906.m12557());
        }
        if (c3906.m12610() == Integer.MAX_VALUE) {
            if (this.f55240) {
                int i = this.f55237;
                this.f55237 = i + 1;
                c3906.m12606(i);
            }
            if (c3906 instanceof AbstractC16889) {
                ((AbstractC16889) c3906).f55240 = this.f55240;
            }
        }
        int iBinarySearch = Collections.binarySearch(this.f55239, c3906);
        if (iBinarySearch < 0) {
            iBinarySearch = (iBinarySearch * (-1)) - 1;
        }
        int i2 = iBinarySearch;
        c3906.m12583(mo12584());
        synchronized (this) {
            this.f55239.add(i2, c3906);
        }
        C0482 c0482M12590 = m12590();
        String strM12557 = c3906.m12557();
        if (strM12557 != null && this.f55241.containsKey(strM12557)) {
            jM2340 = ((Long) this.f55241.get(strM12557)).longValue();
            this.f55241.remove(strM12557);
        } else {
            jM2340 = c0482M12590.m2340();
        }
        c3906.m12569(c0482M12590, jM2340);
        c3906.m12574(this);
        if (this.f55242) {
            c3906.mo12582();
        }
        m12592();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C3906 m39850(CharSequence charSequence) {
        C3906 c3906M39850;
        if (charSequence == null) {
            throw new IllegalArgumentException("Key cannot be null");
        }
        if (TextUtils.equals(m12557(), charSequence)) {
            return this;
        }
        int size = this.f55239.size();
        for (int i = 0; i < size; i++) {
            C3906 c3906M39849 = m39849(i);
            if (TextUtils.equals(c3906M39849.m12557(), charSequence)) {
                return c3906M39849;
            }
            if ((c3906M39849 instanceof AbstractC16889) && (c3906M39850 = ((AbstractC16889) c3906M39849).m39850(charSequence)) != null) {
                return c3906M39850;
            }
        }
        return null;
    }

    @Override // l.C3906
    /* JADX INFO: renamed from: ۢ */
    public final void mo12582() {
        super.mo12582();
        this.f55242 = true;
        int size = this.f55239.size();
        for (int i = 0; i < size; i++) {
            m39849(i).mo12582();
        }
    }

    @Override // l.C3906
    /* JADX INFO: renamed from: ۡ */
    public final void mo12581() {
        super.mo12581();
        this.f55242 = false;
        int size = this.f55239.size();
        for (int i = 0; i < size; i++) {
            m39849(i).mo12581();
        }
    }

    @Override // l.C3906
    /* JADX INFO: renamed from: ᩷ */
    public final void mo12603(boolean z) {
        super.mo12603(z);
        int size = this.f55239.size();
        for (int i = 0; i < size; i++) {
            m39849(i).m12583(z);
        }
    }

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public final void m39846() {
        synchronized (this) {
            Collections.sort(this.f55239);
        }
    }

    @Override // l.C3906
    /* JADX INFO: renamed from: ᩷ */
    public final void mo12600(Bundle bundle) {
        super.mo12600(bundle);
        int size = this.f55239.size();
        for (int i = 0; i < size; i++) {
            m39849(i).mo12600(bundle);
        }
    }

    @Override // l.C3906
    /* JADX INFO: renamed from: ۙ */
    public final void mo12564(Bundle bundle) {
        super.mo12564(bundle);
        int size = this.f55239.size();
        for (int i = 0; i < size; i++) {
            m39849(i).mo12564(bundle);
        }
    }

    @Override // l.C3906
    /* JADX INFO: renamed from: ۖ */
    public final Parcelable mo5994() {
        super.mo5994();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        return new C25095(this.f55238);
    }

    @Override // l.C3906
    /* JADX INFO: renamed from: ۙ */
    public final void mo5997(Parcelable parcelable) {
        if (!parcelable.getClass().equals(C25095.class)) {
            super.mo5997(parcelable);
            return;
        }
        C25095 c25095 = (C25095) parcelable;
        this.f55238 = c25095.f81155;
        super.mo5997(c25095.getSuperState());
    }
}
