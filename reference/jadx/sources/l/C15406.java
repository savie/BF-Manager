package l;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܳܳۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: G20T */
/* JADX INFO: loaded from: classes4.dex */
public final class C15406 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C19882();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ArrayList f50219;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final ArrayList f50220;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public C15406(Parcel parcel) {
        this.f50219 = parcel.createStringArrayList();
        this.f50220 = parcel.createTypedArrayList(C22866.CREATOR);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f50219);
        parcel.writeTypedList(this.f50220);
    }
}
