package l;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.֡ᩳ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 8539 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0614 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        C8072 c8072 = new C8072();
        c8072.f26718 = parcel.readInt();
        c8072.f26711 = parcel.readInt();
        int i = parcel.readInt();
        c8072.f26713 = i;
        if (i > 0) {
            int[] iArr = new int[i];
            c8072.f26710 = iArr;
            parcel.readIntArray(iArr);
        }
        int i2 = parcel.readInt();
        c8072.f26714 = i2;
        if (i2 > 0) {
            int[] iArr2 = new int[i2];
            c8072.f26717 = iArr2;
            parcel.readIntArray(iArr2);
        }
        c8072.f26712 = parcel.readInt() == 1;
        c8072.f26715 = parcel.readInt() == 1;
        c8072.f26709 = parcel.readInt() == 1;
        c8072.f26716 = parcel.readArrayList(C21497.class.getClassLoader());
        return c8072;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new C8072[i];
    }
}
