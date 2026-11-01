package l;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.᩶᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: N5WL */
/* JADX INFO: loaded from: classes4.dex */
public final class C20470 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        C0713 c0713 = new C0713(parcel);
        c0713.f2985 = parcel.readByte() != 0;
        return c0713;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new C0713[i];
    }
}
