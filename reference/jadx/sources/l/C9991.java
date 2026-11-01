package l;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.ۤۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: TB8W */
/* JADX INFO: loaded from: classes3.dex */
public final class C9991 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        C13465.m32966(parcel, "inParcel");
        Parcelable parcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
        C13465.m32962(parcelable);
        return new C7168((IntentSender) parcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new C7168[i];
    }
}
