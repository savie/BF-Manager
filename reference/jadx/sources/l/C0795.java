package l;

import android.media.MediaDescription;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.֨, reason: contains not printable characters */
/* JADX INFO: compiled from: J622 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0795 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return C6762.m18886(MediaDescription.CREATOR.createFromParcel(parcel));
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new C6762[i];
    }
}
