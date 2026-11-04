package l;

import android.media.Rating;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.ᩴۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 757I */
/* JADX INFO: loaded from: classes5.dex */
public final class C19573 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C10622();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f63128;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final float f63129;

    public C19573(float f, int i) {
        this.f63128 = i;
        this.f63129 = f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Rating:style=");
        sb.append(this.f63128);
        sb.append(" rating=");
        float f = this.f63129;
        sb.append(f < 0.0f ? "unrated" : String.valueOf(f));
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.f63128;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f63128);
        parcel.writeFloat(this.f63129);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C19573 m45174(Rating rating) {
        float f;
        C19573 c19573 = null;
        if (rating != null) {
            int iM50788 = C22557.m50788(rating);
            if (!C22557.m50787(rating)) {
                switch (iM50788) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        c19573 = new C19573(-1.0f, iM50788);
                        break;
                }
            } else {
                switch (iM50788) {
                    case 1:
                        c19573 = new C19573(C22557.m50789(rating) ? 1.0f : 0.0f, 1);
                        break;
                    case 2:
                        c19573 = new C19573(C22557.m50786(rating) ? 1.0f : 0.0f, 2);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        float fM50785 = C22557.m50785(rating);
                        if (iM50788 == 3) {
                            f = 3.0f;
                        } else if (iM50788 == 4) {
                            f = 4.0f;
                        } else if (iM50788 == 5) {
                            f = 5.0f;
                        }
                        if (fM50785 >= 0.0f && fM50785 <= f) {
                            c19573 = new C19573(fM50785, iM50788);
                        }
                        break;
                    case 6:
                        float fM50784 = C22557.m50784(rating);
                        if (fM50784 >= 0.0f && fM50784 <= 100.0f) {
                            c19573 = new C19573(fM50784, 6);
                        }
                        break;
                }
            }
            c19573.getClass();
        }
        return c19573;
    }
}
