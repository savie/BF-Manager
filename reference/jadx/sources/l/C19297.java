package l;

import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: renamed from: l.᩵ۜۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: S5C6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C19297 extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new C8008();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final long[][] f62271;

    public C19297(Parcelable parcelable, Drawable... drawableArr) {
        super(parcelable);
        this.f62271 = new long[drawableArr.length][];
        for (int i = 0; i < drawableArr.length; i++) {
            Drawable drawable = drawableArr[i];
            if (drawable instanceof C4479) {
                this.f62271[i] = ((C4479) drawable).f15939.m52923();
            } else {
                this.f62271[i] = null;
            }
        }
    }

    public C19297(Parcel parcel) {
        super(parcel);
        this.f62271 = new long[parcel.readInt()][];
        int i = 0;
        while (true) {
            long[][] jArr = this.f62271;
            if (i >= jArr.length) {
                return;
            }
            jArr[i] = parcel.createLongArray();
            i++;
        }
    }

    public C19297(Parcelable parcelable, long[] jArr) {
        super(parcelable);
        this.f62271 = new long[][]{jArr};
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        long[][] jArr = this.f62271;
        parcel.writeInt(jArr.length);
        for (long[] jArr2 : jArr) {
            parcel.writeLongArray(jArr2);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44284(Drawable drawable, int i) {
        long[] jArr = this.f62271[i];
        if (jArr == null || !(drawable instanceof C4479)) {
            return;
        }
        C4479 c4479 = (C4479) drawable;
        c4479.m12503(c4479.f15939.m52900(jArr, c4479.f15944));
    }
}
