package l;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: l.᩶۬ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 58LL */
/* JADX INFO: loaded from: classes5.dex */
public final class C21330 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C12379();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final String f67956;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C14616 f67957;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final byte[] f67958;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final Uri f67959;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final List f67960;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C24314 f67961;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final byte[] f67962;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String f67963;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f67964;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public C21330(Parcel parcel) {
        String string = parcel.readString();
        String str = C7116.f23455;
        this.f67956 = string;
        this.f67959 = Uri.parse(parcel.readString());
        this.f67963 = parcel.readString();
        int i = parcel.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add((C12820) parcel.readParcelable(C12820.class.getClassLoader()));
        }
        this.f67960 = C4681.unmodifiableList(arrayList);
        this.f67958 = parcel.createByteArray();
        this.f67964 = parcel.readString();
        this.f67962 = parcel.createByteArray();
        this.f67961 = (C24314) parcel.readParcelable(C24314.class.getClassLoader());
        this.f67957 = (C14616) parcel.readParcelable(C14616.class.getClassLoader());
    }

    public final String toString() {
        return this.f67963 + ":" + this.f67956;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C21330)) {
            return false;
        }
        C21330 c21330 = (C21330) obj;
        return this.f67956.equals(c21330.f67956) && this.f67959.equals(c21330.f67959) && C17359.equals(this.f67963, c21330.f67963) && this.f67960.equals(c21330.f67960) && Arrays.equals(this.f67958, c21330.f67958) && C17359.equals(this.f67964, c21330.f67964) && Arrays.equals(this.f67962, c21330.f67962) && C17359.equals(this.f67961, c21330.f67961) && C17359.equals(this.f67957, c21330.f67957);
    }

    public final int hashCode() {
        int iHashCode = (this.f67959.hashCode() + (this.f67956.hashCode() * 961)) * 31;
        String str = this.f67963;
        int iHashCode2 = (Arrays.hashCode(this.f67958) + ((this.f67960.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31;
        String str2 = this.f67964;
        int iHashCode3 = (Arrays.hashCode(this.f67962) + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31;
        C24314 c24314 = this.f67961;
        int iHashCode4 = (iHashCode3 + (c24314 != null ? c24314.hashCode() : 0)) * 31;
        C14616 c14616 = this.f67957;
        return iHashCode4 + (c14616 != null ? c14616.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f67956);
        parcel.writeString(this.f67959.toString());
        parcel.writeString(this.f67963);
        List list = this.f67960;
        parcel.writeInt(list.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            parcel.writeParcelable((Parcelable) list.get(i2), 0);
        }
        parcel.writeByteArray(this.f67958);
        parcel.writeString(this.f67964);
        parcel.writeByteArray(this.f67962);
        parcel.writeParcelable(this.f67961, 0);
        parcel.writeParcelable(this.f67957, 0);
    }
}
