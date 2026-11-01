package l;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: renamed from: l.ᩴᩴۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: U8TP */
/* JADX INFO: loaded from: classes4.dex */
public final class C18937 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C18231();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final String f61262;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final UUID f61263;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final byte[] f61264;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f61265;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f61266;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public C18937(UUID uuid, String str, String str2, byte[] bArr) {
        uuid.getClass();
        this.f61263 = uuid;
        this.f61262 = str;
        str2.getClass();
        this.f61265 = C6632.m17989(str2);
        this.f61264 = bArr;
    }

    public C18937(Parcel parcel) {
        this.f61263 = new UUID(parcel.readLong(), parcel.readLong());
        this.f61262 = parcel.readString();
        String string = parcel.readString();
        String str = C17983.f57504;
        this.f61265 = string;
        this.f61264 = parcel.createByteArray();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m43619(UUID uuid) {
        UUID uuid2 = C1297.f5560;
        UUID uuid3 = this.f61263;
        return uuid2.equals(uuid3) || uuid.equals(uuid3);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C18937)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C18937 c18937 = (C18937) obj;
        return C13638.equals(this.f61262, c18937.f61262) && C13638.equals(this.f61265, c18937.f61265) && C13638.equals(this.f61263, c18937.f61263) && Arrays.equals(this.f61264, c18937.f61264);
    }

    public final int hashCode() {
        if (this.f61266 == 0) {
            int iHashCode = this.f61263.hashCode() * 31;
            String str = this.f61262;
            this.f61266 = Arrays.hashCode(this.f61264) + C13958.m33812((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f61265);
        }
        return this.f61266;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        UUID uuid = this.f61263;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.f61262);
        parcel.writeString(this.f61265);
        parcel.writeByteArray(this.f61264);
    }
}
