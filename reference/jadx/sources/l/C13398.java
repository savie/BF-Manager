package l;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.۬᩹ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: G20T */
/* JADX INFO: loaded from: classes3.dex */
public final class C13398 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C1402();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final ArrayList f44357;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final ArrayList f44358;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public C13398(Parcel parcel) {
        this.f44357 = parcel.createStringArrayList();
        this.f44358 = parcel.createTypedArrayList(C22570.CREATOR);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f44357);
        parcel.writeTypedList(this.f44358);
    }
}
