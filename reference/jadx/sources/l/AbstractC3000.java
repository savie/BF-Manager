package l;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.ۗۙۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: H6B6 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3000 implements Parcelable {
    public final Parcelable mSuperState;
    public static final AbstractC3000 EMPTY_STATE = new C1589(null);
    public static final Parcelable.Creator CREATOR = new C9352();

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public /* synthetic */ AbstractC3000(C1589 c1589) {
        this();
    }

    public AbstractC3000() {
        this.mSuperState = null;
    }

    public AbstractC3000(Parcelable parcelable) {
        if (parcelable == null) {
            throw new IllegalArgumentException("superState must not be null");
        }
        this.mSuperState = parcelable == EMPTY_STATE ? null : parcelable;
    }

    public AbstractC3000(Parcel parcel) {
        this(parcel, null);
    }

    public AbstractC3000(Parcel parcel, ClassLoader classLoader) {
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
