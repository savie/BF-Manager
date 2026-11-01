package l;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: J622 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9223 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C10634();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final Bundle f31347;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final Uri f31348;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final CharSequence f31349;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final Uri f31350;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final CharSequence f31351;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Bitmap f31352;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f31353;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public MediaDescription f31354;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final CharSequence f31355;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public C9223(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f31353 = str;
        this.f31355 = charSequence;
        this.f31349 = charSequence2;
        this.f31351 = charSequence3;
        this.f31352 = bitmap;
        this.f31350 = uri;
        this.f31347 = bundle;
        this.f31348 = uri2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m23744() {
        return this.f31353;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Bundle bundle;
        int i2 = Build.VERSION.SDK_INT;
        MediaDescription mediaDescriptionM51417 = this.f31354;
        if (mediaDescriptionM51417 == null) {
            MediaDescription.Builder builderM51416 = C23334.m51416();
            C23334.m51423(builderM51416, this.f31353);
            C23334.m51426(builderM51416, this.f31355);
            C23334.m51428(builderM51416, this.f31349);
            C23334.m51422(builderM51416, this.f31351);
            C23334.m51419(builderM51416, this.f31352);
            C23334.m51420(builderM51416, this.f31350);
            Bundle bundle2 = this.f31347;
            Uri uri = this.f31348;
            if (i2 < 23 && uri != null) {
                if (bundle2 == null) {
                    bundle = new Bundle();
                    bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
                } else {
                    bundle = new Bundle(bundle2);
                }
                bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", uri);
                C23334.m51421(builderM51416, bundle);
            } else {
                C23334.m51421(builderM51416, bundle2);
            }
            if (i2 >= 23) {
                C14162.m34235(builderM51416, uri);
            }
            mediaDescriptionM51417 = C23334.m51417(builderM51416);
            this.f31354 = mediaDescriptionM51417;
        }
        mediaDescriptionM51417.writeToParcel(parcel, i);
    }

    public final String toString() {
        return ((Object) this.f31355) + ", " + ((Object) this.f31349) + ", " + ((Object) this.f31351);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C9223 m23743(Object obj) {
        Bundle bundle = null;
        if (obj == null) {
            return null;
        }
        int i = Build.VERSION.SDK_INT;
        C1460 c1460 = new C1460();
        MediaDescription mediaDescription = (MediaDescription) obj;
        c1460.m5066(C23334.m51424(mediaDescription));
        c1460.m5067(C23334.m51414(mediaDescription));
        c1460.m5069(C23334.m51429(mediaDescription));
        c1460.m5065(C23334.m51418(mediaDescription));
        c1460.m5062(C23334.m51425(mediaDescription));
        c1460.m5063(C23334.m51415(mediaDescription));
        Bundle bundleM51427 = C23334.m51427(mediaDescription);
        if (bundleM51427 != null) {
            C1148.m4220(bundleM51427);
            try {
                bundleM51427.isEmpty();
            } catch (BadParcelableException unused) {
                bundleM51427 = null;
            }
        }
        Uri uri = bundleM51427 != null ? (Uri) bundleM51427.getParcelable("android.support.v4.media.description.MEDIA_URI") : null;
        if (uri == null) {
            bundle = bundleM51427;
        } else if (!bundleM51427.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") || bundleM51427.size() != 2) {
            bundleM51427.remove("android.support.v4.media.description.MEDIA_URI");
            bundleM51427.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
            bundle = bundleM51427;
        }
        c1460.m5064(bundle);
        if (uri != null) {
            c1460.m5068(uri);
        } else if (i >= 23) {
            c1460.m5068(C14162.m34234(mediaDescription));
        }
        C9223 c9223M5061 = c1460.m5061();
        c9223M5061.f31354 = mediaDescription;
        return c9223M5061;
    }
}
