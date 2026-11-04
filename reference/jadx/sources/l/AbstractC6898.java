package l;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.ۜۙۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: H6B6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6898 implements Parcelable {
    public final Parcelable mSuperState;
    public static final AbstractC6898 EMPTY_STATE = new C2423(null);
    public static final Parcelable.Creator CREATOR = new C8389();

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public /* synthetic */ AbstractC6898(C2423 c2423) {
        this();
    }

    public AbstractC6898() {
        this.mSuperState = null;
    }

    public AbstractC6898(Parcelable parcelable) {
        if (parcelable == null) {
            throw new IllegalArgumentException("superState must not be null");
        }
        this.mSuperState = parcelable == EMPTY_STATE ? null : parcelable;
    }

    public AbstractC6898(Parcel parcel) {
        this(parcel, null);
    }

    public AbstractC6898(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.mSuperState = parcelable == null ? EMPTY_STATE : parcelable;
    }

    public final Parcelable getSuperState() {
        return this.mSuperState;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.mSuperState, i);
    }
}
