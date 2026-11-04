package l;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: renamed from: l.ۙ᩹ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: U8TP */
/* JADX INFO: loaded from: classes2.dex */
public final class C5208 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C13936();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final String f18370;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final UUID f18371;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final byte[] f18372;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f18373;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f18374;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public C5208(UUID uuid, String str, String str2, byte[] bArr) {
        uuid.getClass();
        this.f18371 = uuid;
        this.f18373 = str;
        str2.getClass();
        this.f18370 = C9681.m25264(str2);
        this.f18372 = bArr;
    }

    public C5208(Parcel parcel) {
        this.f18371 = new UUID(parcel.readLong(), parcel.readLong());
        this.f18373 = parcel.readString();
        String string = parcel.readString();
        String str = C7116.f23455;
        this.f18370 = string;
        this.f18372 = parcel.createByteArray();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m15671(UUID uuid) {
        UUID uuid2 = C19158.f61990;
        UUID uuid3 = this.f18371;
        return uuid2.equals(uuid3) || uuid.equals(uuid3);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5208)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C5208 c5208 = (C5208) obj;
        return C17359.equals(this.f18373, c5208.f18373) && C17359.equals(this.f18370, c5208.f18370) && C17359.equals(this.f18371, c5208.f18371) && Arrays.equals(this.f18372, c5208.f18372);
    }

    public final int hashCode() {
        if (this.f18374 == 0) {
            int iHashCode = this.f18371.hashCode() * 31;
            String str = this.f18373;
            this.f18374 = Arrays.hashCode(this.f18372) + C12351.m30817((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f18370);
        }
        return this.f18374;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        UUID uuid = this.f18371;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.f18373);
        parcel.writeString(this.f18370);
        parcel.writeByteArray(this.f18372);
    }
}
