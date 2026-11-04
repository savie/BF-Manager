package l;

import android.net.Uri;
import android.os.Parcel;
import java.io.Serializable;

/* JADX INFO: renamed from: l.۟᩶ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: U170 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8136 implements Serializable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public transient Uri f26844;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public byte[] f26845;

    public C8136(Uri uri) {
        this.f26844 = uri;
        Parcel parcelObtain = Parcel.obtain();
        uri.writeToParcel(parcelObtain, 0);
        this.f26845 = parcelObtain.marshall();
        parcelObtain.recycle();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Uri m22013() {
        if (this.f26844 == null) {
            Parcel parcelObtain = Parcel.obtain();
            byte[] bArr = this.f26845;
            parcelObtain.unmarshall(bArr, 0, bArr.length);
            parcelObtain.setDataPosition(0);
            this.f26844 = (Uri) Uri.CREATOR.createFromParcel(parcelObtain);
            parcelObtain.recycle();
        }
        return this.f26844;
    }

    public final String toString() {
        return this.f26844.toString();
    }
}
