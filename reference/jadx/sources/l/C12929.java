package l;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.۬ۛܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8539 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12929 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C0933();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public ArrayList f42962;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f42963;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int[] f42964;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f42965;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f42966;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f42967;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f42968;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int[] f42969;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f42970;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f42971;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f42970);
        parcel.writeInt(this.f42966);
        parcel.writeInt(this.f42971);
        if (this.f42971 > 0) {
            parcel.writeIntArray(this.f42964);
        }
        parcel.writeInt(this.f42963);
        if (this.f42963 > 0) {
            parcel.writeIntArray(this.f42969);
        }
        parcel.writeInt(this.f42965 ? 1 : 0);
        parcel.writeInt(this.f42967 ? 1 : 0);
        parcel.writeInt(this.f42968 ? 1 : 0);
        parcel.writeList(this.f42962);
    }
}
