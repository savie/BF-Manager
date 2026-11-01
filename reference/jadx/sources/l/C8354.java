package l;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;

/* JADX INFO: renamed from: l.۠ᩴۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: U8TP */
/* JADX INFO: loaded from: classes3.dex */
public final class C8354 implements Comparator, Parcelable {
    public static final Parcelable.Creator CREATOR = new C21759();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C18937[] f28969;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f28970;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f28971;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f28972;

    public C8354() {
        throw null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C18937 c18937 = (C18937) obj;
        C18937 c18938 = (C18937) obj2;
        UUID uuid = C1297.f5560;
        if (uuid.equals(c18937.f61263)) {
            return uuid.equals(c18938.f61263) ? 0 : 1;
        }
        return c18937.f61263.compareTo(c18938.f61263);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C8354 m21874(C8354 c8354, C8354 c8355) {
        String str;
        ArrayList arrayList = new ArrayList();
        if (c8354 != null) {
            str = c8354.f28971;
            for (C18937 c18937 : c8354.f28969) {
                if (c18937.f61264 != null) {
                    arrayList.add(c18937);
                }
            }
        } else {
            str = null;
        }
        if (c8355 != null) {
            if (str == null) {
                str = c8355.f28971;
            }
            int size = arrayList.size();
            for (C18937 c18938 : c8355.f28969) {
                if (c18938.f61264 != null) {
                    UUID uuid = c18938.f61263;
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            arrayList.add(c18938);
                            break;
                        }
                        if (((C18937) arrayList.get(i)).f61263.equals(uuid)) {
                            break;
                        }
                        i++;
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C8354(str, false, (C18937[]) arrayList.toArray(new C18937[0]));
    }

    public C8354(ArrayList arrayList) {
        this(null, false, (C18937[]) arrayList.toArray(new C18937[0]));
    }

    public C8354(String str, C18937... c18937Arr) {
        this(str, true, c18937Arr);
    }

    public C8354(C18937... c18937Arr) {
        this(null, true, c18937Arr);
    }

    public C8354(String str, boolean z, C18937... c18937Arr) {
        this.f28971 = str;
        c18937Arr = z ? (C18937[]) c18937Arr.clone() : c18937Arr;
        this.f28969 = c18937Arr;
        this.f28972 = c18937Arr.length;
        Arrays.sort(c18937Arr, this);
    }

    public C8354(Parcel parcel) {
        this.f28971 = parcel.readString();
        C18937[] c18937Arr = (C18937[]) parcel.createTypedArray(C18937.CREATOR);
        String str = C17983.f57504;
        this.f28969 = c18937Arr;
        this.f28972 = c18937Arr.length;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18937 m21876(int i) {
        return this.f28969[i];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C8354 m21875(String str) {
        return C13638.equals(this.f28971, str) ? this : new C8354(str, false, this.f28969);
    }

    public final int hashCode() {
        if (this.f28970 == 0) {
            String str = this.f28971;
            this.f28970 = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f28969);
        }
        return this.f28970;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C8354.class == obj.getClass()) {
            C8354 c8354 = (C8354) obj;
            if (C13638.equals(this.f28971, c8354.f28971) && Arrays.equals(this.f28969, c8354.f28969)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f28971);
        parcel.writeTypedArray(this.f28969, 0);
    }
}
