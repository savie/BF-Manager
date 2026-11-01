package l;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩷۬ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 223J */
/* JADX INFO: loaded from: classes4.dex */
public final class C20888 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C7482();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C22570[] f67838;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public ArrayList f67839;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public ArrayList f67842;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f67843;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public ArrayList f67845;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f67840 = null;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public ArrayList f67841 = new ArrayList();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public ArrayList f67844 = new ArrayList();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f67842);
        parcel.writeStringList(this.f67845);
        parcel.writeTypedArray(this.f67838, i);
        parcel.writeInt(this.f67843);
        parcel.writeString(this.f67840);
        parcel.writeStringList(this.f67841);
        parcel.writeTypedList(this.f67844);
        parcel.writeTypedList(this.f67839);
    }
}
