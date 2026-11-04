package l;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۛۚۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 223J */
/* JADX INFO: loaded from: classes3.dex */
public final class C6175 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C12140();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f21029;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public ArrayList f21032;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public ArrayList f21033;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C22866[] f21034;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public ArrayList f21036;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public String f21030 = null;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public ArrayList f21031 = new ArrayList();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public ArrayList f21035 = new ArrayList();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f21033);
        parcel.writeStringList(this.f21036);
        parcel.writeTypedArray(this.f21034, i);
        parcel.writeInt(this.f21029);
        parcel.writeString(this.f21030);
        parcel.writeStringList(this.f21031);
        parcel.writeTypedList(this.f21035);
        parcel.writeTypedList(this.f21032);
    }
}
