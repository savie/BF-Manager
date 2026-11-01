package l;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: renamed from: l.᩺ۗܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: F1OQ */
/* JADX INFO: loaded from: classes.dex */
public final class C22724 extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new C6495();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f74032;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public Parcelable f74033;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f74034;

    public C22724(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f74032 = parcel.readInt();
        this.f74034 = parcel.readInt();
        this.f74033 = parcel.readParcelable(classLoader);
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f74032);
        parcel.writeInt(this.f74034);
        parcel.writeParcelable(this.f74033, i);
    }
}
