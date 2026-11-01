package l;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: l.ۨۙܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 58LL */
/* JADX INFO: loaded from: classes3.dex */
public final class C11477 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C1548();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final byte[] f38637;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final List f38638;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C13594 f38639;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final byte[] f38640;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C2959 f38641;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f38642;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f38643;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f38644;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final Uri f38645;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public C11477(Parcel parcel) {
        String string = parcel.readString();
        String str = C17983.f57504;
        this.f38642 = string;
        this.f38645 = Uri.parse(parcel.readString());
        this.f38643 = parcel.readString();
        int i = parcel.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add((C20744) parcel.readParcelable(C20744.class.getClassLoader()));
        }
        this.f38638 = C0561.unmodifiableList(arrayList);
        this.f38640 = parcel.createByteArray();
        this.f38644 = parcel.readString();
        this.f38637 = parcel.createByteArray();
        this.f38641 = (C2959) parcel.readParcelable(C2959.class.getClassLoader());
        this.f38639 = (C13594) parcel.readParcelable(C13594.class.getClassLoader());
    }

    public final String toString() {
        return this.f38643 + ":" + this.f38642;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C11477)) {
            return false;
        }
        C11477 c11477 = (C11477) obj;
        return this.f38642.equals(c11477.f38642) && this.f38645.equals(c11477.f38645) && C13638.equals(this.f38643, c11477.f38643) && this.f38638.equals(c11477.f38638) && Arrays.equals(this.f38640, c11477.f38640) && C13638.equals(this.f38644, c11477.f38644) && Arrays.equals(this.f38637, c11477.f38637) && C13638.equals(this.f38641, c11477.f38641) && C13638.equals(this.f38639, c11477.f38639);
    }

    public final int hashCode() {
        int iHashCode = (this.f38645.hashCode() + (this.f38642.hashCode() * 961)) * 31;
        String str = this.f38643;
        int iHashCode2 = (Arrays.hashCode(this.f38640) + ((this.f38638.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31;
        String str2 = this.f38644;
        int iHashCode3 = (Arrays.hashCode(this.f38637) + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31;
        C2959 c2959 = this.f38641;
        int iHashCode4 = (iHashCode3 + (c2959 != null ? c2959.hashCode() : 0)) * 31;
        C13594 c13594 = this.f38639;
        return iHashCode4 + (c13594 != null ? c13594.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f38642);
        parcel.writeString(this.f38645.toString());
        parcel.writeString(this.f38643);
        List list = this.f38638;
        parcel.writeInt(list.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            parcel.writeParcelable((Parcelable) list.get(i2), 0);
        }
        parcel.writeByteArray(this.f38640);
        parcel.writeString(this.f38644);
        parcel.writeByteArray(this.f38637);
        parcel.writeParcelable(this.f38641, 0);
        parcel.writeParcelable(this.f38639, 0);
    }
}
