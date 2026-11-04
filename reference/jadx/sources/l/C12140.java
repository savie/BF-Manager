package l;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۨۚۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 223J */
/* JADX INFO: loaded from: classes3.dex */
public final class C12140 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        C6175 c6175 = new C6175();
        c6175.f21030 = null;
        c6175.f21031 = new ArrayList();
        c6175.f21035 = new ArrayList();
        c6175.f21033 = parcel.createStringArrayList();
        c6175.f21036 = parcel.createStringArrayList();
        c6175.f21034 = (C22866[]) parcel.createTypedArray(C22866.CREATOR);
        c6175.f21029 = parcel.readInt();
        c6175.f21030 = parcel.readString();
        c6175.f21031 = parcel.createStringArrayList();
        c6175.f21035 = parcel.createTypedArrayList(C15406.CREATOR);
        c6175.f21032 = parcel.createTypedArrayList(C16615.CREATOR);
        return c6175;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new C6175[i];
    }
}
