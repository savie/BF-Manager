package l;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.֨ۛܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8539 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0933 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        C12929 c12929 = new C12929();
        c12929.f42970 = parcel.readInt();
        c12929.f42966 = parcel.readInt();
        int i = parcel.readInt();
        c12929.f42971 = i;
        if (i > 0) {
            int[] iArr = new int[i];
            c12929.f42964 = iArr;
            parcel.readIntArray(iArr);
        }
        int i2 = parcel.readInt();
        c12929.f42963 = i2;
        if (i2 > 0) {
            int[] iArr2 = new int[i2];
            c12929.f42969 = iArr2;
            parcel.readIntArray(iArr2);
        }
        c12929.f42965 = parcel.readInt() == 1;
        c12929.f42967 = parcel.readInt() == 1;
        c12929.f42968 = parcel.readInt() == 1;
        c12929.f42962 = parcel.readArrayList(C5167.class.getClassLoader());
        return c12929;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new C12929[i];
    }
}
