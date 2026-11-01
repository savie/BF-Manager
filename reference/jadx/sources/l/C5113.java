package l;

import android.media.Rating;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.ۚۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 757I */
/* JADX INFO: loaded from: classes2.dex */
public final class C5113 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C11464();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f17808;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final float f17809;

    public C5113(float f, int i) {
        this.f17808 = i;
        this.f17809 = f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Rating:style=");
        sb.append(this.f17808);
        sb.append(" rating=");
        float f = this.f17809;
        sb.append(f < 0.0f ? "unrated" : String.valueOf(f));
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.f17808;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f17808);
        parcel.writeFloat(this.f17809);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5113 m14259(Rating rating) {
        float f;
        C5113 c5113 = null;
        if (rating != null) {
            int iM7003 = C2290.m7003(rating);
            if (!C2290.m7001(rating)) {
                switch (iM7003) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        c5113 = new C5113(-1.0f, iM7003);
                        break;
                }
            } else {
                switch (iM7003) {
                    case 1:
                        c5113 = new C5113(C2290.m6995(rating) ? 1.0f : 0.0f, 1);
                        break;
                    case 2:
                        c5113 = new C5113(C2290.m7005(rating) ? 1.0f : 0.0f, 2);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        float fM7002 = C2290.m7002(rating);
                        if (iM7003 == 3) {
                            f = 3.0f;
                        } else if (iM7003 == 4) {
                            f = 4.0f;
                        } else if (iM7003 == 5) {
                            f = 5.0f;
                        }
                        if (fM7002 >= 0.0f && fM7002 <= f) {
                            c5113 = new C5113(fM7002, iM7003);
                        }
                        break;
                    case 6:
                        float fM6996 = C2290.m6996(rating);
                        if (fM6996 >= 0.0f && fM6996 <= 100.0f) {
                            c5113 = new C5113(fM6996, 6);
                        }
                        break;
                }
            }
            c5113.getClass();
        }
        return c5113;
    }
}
