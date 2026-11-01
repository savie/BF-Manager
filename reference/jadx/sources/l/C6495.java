package l;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.ۜۗܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: F1OQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C6495 implements Parcelable.ClassLoaderCreator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        if (Build.VERSION.SDK_INT < 24) {
            C22724 c22724 = new C22724(parcel);
            c22724.f74032 = parcel.readInt();
            c22724.f74034 = parcel.readInt();
            c22724.f74033 = parcel.readParcelable(null);
            return c22724;
        }
        return new C22724(parcel, null);
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        if (Build.VERSION.SDK_INT < 24) {
            C22724 c22724 = new C22724(parcel);
            c22724.f74032 = parcel.readInt();
            c22724.f74034 = parcel.readInt();
            c22724.f74033 = parcel.readParcelable(null);
            return c22724;
        }
        return new C22724(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new C22724[i];
    }
}
