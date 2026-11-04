package l;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;

/* JADX INFO: renamed from: l.ۤ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: U6BF */
/* JADX INFO: loaded from: classes3.dex */
public final class C11125 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        C23060 c23060 = new C23060();
        c23060.f74811 = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        return c23060;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new C23060[i];
    }
}
