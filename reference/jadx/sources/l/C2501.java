package l;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: renamed from: l.ۖۜ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: F1OQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C2501 extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new C9212();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Parcelable f8008;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f8009;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f8010;

    public C2501(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f8009 = parcel.readInt();
        this.f8010 = parcel.readInt();
        this.f8008 = parcel.readParcelable(classLoader);
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f8009);
        parcel.writeInt(this.f8010);
        parcel.writeParcelable(this.f8008, i);
    }
}
