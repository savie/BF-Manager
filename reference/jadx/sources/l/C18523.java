package l;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.ᩴۙۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: E6AF */
/* JADX INFO: loaded from: classes4.dex */
public final class C18523 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        C7940 c7940 = new C7940(parcel);
        c7940.f26101 = parcel.readInt();
        return c7940;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new C7940[i];
    }
}
