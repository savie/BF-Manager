package l;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.ۖۛܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8539 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2344 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        C5167 c5167 = new C5167();
        c5167.f17935 = parcel.readInt();
        c5167.f17934 = parcel.readInt();
        c5167.f17933 = parcel.readInt() == 1;
        int i = parcel.readInt();
        if (i > 0) {
            int[] iArr = new int[i];
            c5167.f17936 = iArr;
            parcel.readIntArray(iArr);
        }
        return c5167;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new C5167[i];
    }
}
