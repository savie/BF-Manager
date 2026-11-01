package l;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.᩹۫ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: K4ND */
/* JADX INFO: loaded from: classes.dex */
public final class C22287 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        C1119 c1119 = new C1119();
        c1119.f5043 = parcel.readInt();
        c1119.f5045 = parcel.readInt();
        c1119.f5044 = parcel.readInt() == 1;
        return c1119;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new C1119[i];
    }
}
