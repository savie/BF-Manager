package l;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.ۡۜ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: F1OQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C9212 implements Parcelable.ClassLoaderCreator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        if (Build.VERSION.SDK_INT < 24) {
            C2501 c2501 = new C2501(parcel);
            c2501.f8009 = parcel.readInt();
            c2501.f8010 = parcel.readInt();
            c2501.f8008 = parcel.readParcelable(null);
            return c2501;
        }
        return new C2501(parcel, null);
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        if (Build.VERSION.SDK_INT < 24) {
            C2501 c2501 = new C2501(parcel);
            c2501.f8009 = parcel.readInt();
            c2501.f8010 = parcel.readInt();
            c2501.f8008 = parcel.readParcelable(null);
            return c2501;
        }
        return new C2501(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new C2501[i];
    }
}
