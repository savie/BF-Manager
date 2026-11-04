package l;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;

/* JADX INFO: renamed from: l.᩷᩹ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: U8TP */
/* JADX INFO: loaded from: classes.dex */
public final class C22362 implements Comparator, Parcelable {
    public static final Parcelable.Creator CREATOR = new C7225();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final String f72387;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f72388;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C5208[] f72389;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f72390;

    public C22362() {
        throw null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C5208 c5208 = (C5208) obj;
        C5208 c5209 = (C5208) obj2;
        UUID uuid = C19158.f61990;
        if (uuid.equals(c5208.f18371)) {
            return uuid.equals(c5209.f18371) ? 0 : 1;
        }
        return c5208.f18371.compareTo(c5209.f18371);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C22362 m50437(C22362 c22362, C22362 c22363) {
        String str;
        ArrayList arrayList = new ArrayList();
        if (c22362 != null) {
            str = c22362.f72387;
            for (C5208 c5208 : c22362.f72389) {
                if (c5208.f18372 != null) {
                    arrayList.add(c5208);
                }
            }
        } else {
            str = null;
        }
        if (c22363 != null) {
            if (str == null) {
                str = c22363.f72387;
            }
            int size = arrayList.size();
            for (C5208 c5209 : c22363.f72389) {
                if (c5209.f18372 != null) {
                    UUID uuid = c5209.f18371;
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            arrayList.add(c5209);
                            break;
                        }
                        if (((C5208) arrayList.get(i)).f18371.equals(uuid)) {
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
        return new C22362(str, false, (C5208[]) arrayList.toArray(new C5208[0]));
    }

    public C22362(ArrayList arrayList) {
        this(null, false, (C5208[]) arrayList.toArray(new C5208[0]));
    }

    public C22362(String str, C5208... c5208Arr) {
        this(str, true, c5208Arr);
    }

    public C22362(C5208... c5208Arr) {
        this(null, true, c5208Arr);
    }

    public C22362(String str, boolean z, C5208... c5208Arr) {
        this.f72387 = str;
        c5208Arr = z ? (C5208[]) c5208Arr.clone() : c5208Arr;
        this.f72389 = c5208Arr;
        this.f72390 = c5208Arr.length;
        Arrays.sort(c5208Arr, this);
    }

    public C22362(Parcel parcel) {
        this.f72387 = parcel.readString();
        C5208[] c5208Arr = (C5208[]) parcel.createTypedArray(C5208.CREATOR);
        String str = C7116.f23455;
        this.f72389 = c5208Arr;
        this.f72390 = c5208Arr.length;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5208 m50438(int i) {
        return this.f72389[i];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22362 m50439(String str) {
        return C17359.equals(this.f72387, str) ? this : new C22362(str, false, this.f72389);
    }

    public final int hashCode() {
        if (this.f72388 == 0) {
            String str = this.f72387;
            this.f72388 = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f72389);
        }
        return this.f72388;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C22362.class == obj.getClass()) {
            C22362 c22362 = (C22362) obj;
            if (C17359.equals(this.f72387, c22362.f72387) && Arrays.equals(this.f72389, c22362.f72389)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f72387);
        parcel.writeTypedArray(this.f72389, 0);
    }
}
