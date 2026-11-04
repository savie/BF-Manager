package l;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.ܰᩳ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 8539 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14783 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        C21497 c21497 = new C21497();
        c21497.f68717 = parcel.readInt();
        c21497.f68718 = parcel.readInt();
        c21497.f68719 = parcel.readInt() == 1;
        int i = parcel.readInt();
        if (i > 0) {
            int[] iArr = new int[i];
            c21497.f68720 = iArr;
            parcel.readIntArray(iArr);
        }
        return c21497;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new C21497[i];
    }
}
