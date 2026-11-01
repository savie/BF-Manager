package l;

import android.net.Uri;
import android.os.Parcel;
import java.io.Serializable;

/* JADX INFO: renamed from: l.ۛ᩷ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: U170 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6300 implements Serializable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public transient Uri f21319;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public byte[] f21320;

    public C6300(Uri uri) {
        this.f21319 = uri;
        Parcel parcelObtain = Parcel.obtain();
        uri.writeToParcel(parcelObtain, 0);
        this.f21320 = parcelObtain.marshall();
        parcelObtain.recycle();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Uri m17383() {
        if (this.f21319 == null) {
            Parcel parcelObtain = Parcel.obtain();
            byte[] bArr = this.f21320;
            parcelObtain.unmarshall(bArr, 0, bArr.length);
            parcelObtain.setDataPosition(0);
            this.f21319 = (Uri) Uri.CREATOR.createFromParcel(parcelObtain);
            parcelObtain.recycle();
        }
        return this.f21319;
    }

    public final String toString() {
        return this.f21319.toString();
    }
}
