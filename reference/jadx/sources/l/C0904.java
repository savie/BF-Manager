package l;

import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: renamed from: l.֨ۗ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: S5C6 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0904 extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new C9852();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long[][] f3394;

    public C0904(Parcelable parcelable, Drawable... drawableArr) {
        super(parcelable);
        this.f3394 = new long[drawableArr.length][];
        for (int i = 0; i < drawableArr.length; i++) {
            Drawable drawable = drawableArr[i];
            if (drawable instanceof C17311) {
                this.f3394[i] = ((C17311) drawable).f56376.m56821();
            } else {
                this.f3394[i] = null;
            }
        }
    }

    public C0904(Parcel parcel) {
        super(parcel);
        this.f3394 = new long[parcel.readInt()][];
        int i = 0;
        while (true) {
            long[][] jArr = this.f3394;
            if (i >= jArr.length) {
                return;
            }
            jArr[i] = parcel.createLongArray();
            i++;
        }
    }

    public C0904(Parcelable parcelable, long[] jArr) {
        super(parcelable);
        this.f3394 = new long[][]{jArr};
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        long[][] jArr = this.f3394;
        parcel.writeInt(jArr.length);
        for (long[] jArr2 : jArr) {
            parcel.writeLongArray(jArr2);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3670(Drawable drawable, int i) {
        long[] jArr = this.f3394[i];
        if (jArr == null || !(drawable instanceof C17311)) {
            return;
        }
        C17311 c17311 = (C17311) drawable;
        c17311.m40657(c17311.f56376.m56797(jArr, c17311.f56386));
    }
}
