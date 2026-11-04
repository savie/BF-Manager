package l;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: J622 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6762 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C0795();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final Bitmap f22560;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final CharSequence f22561;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final Uri f22562;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final CharSequence f22563;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final Uri f22564;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final CharSequence f22565;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Bundle f22566;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String f22567;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public MediaDescription f22568;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public C6762(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f22567 = str;
        this.f22563 = charSequence;
        this.f22561 = charSequence2;
        this.f22565 = charSequence3;
        this.f22560 = bitmap;
        this.f22562 = uri;
        this.f22566 = bundle;
        this.f22564 = uri2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m18887() {
        return this.f22567;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Bundle bundle;
        int i2 = Build.VERSION.SDK_INT;
        MediaDescription mediaDescriptionM23994 = this.f22568;
        if (mediaDescriptionM23994 == null) {
            MediaDescription.Builder builderM23993 = C8998.m23993();
            C8998.m24000(builderM23993, this.f22567);
            C8998.m24002(builderM23993, this.f22563);
            C8998.m24007(builderM23993, this.f22561);
            C8998.m23999(builderM23993, this.f22565);
            C8998.m23996(builderM23993, this.f22560);
            C8998.m23997(builderM23993, this.f22562);
            Bundle bundle2 = this.f22566;
            Uri uri = this.f22564;
            if (i2 < 23 && uri != null) {
                if (bundle2 == null) {
                    bundle = new Bundle();
                    bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
                } else {
                    bundle = new Bundle(bundle2);
                }
                bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", uri);
                C8998.m23998(builderM23993, bundle);
            } else {
                C8998.m23998(builderM23993, bundle2);
            }
            if (i2 >= 23) {
                C2287.m7740(builderM23993, uri);
            }
            mediaDescriptionM23994 = C8998.m23994(builderM23993);
            this.f22568 = mediaDescriptionM23994;
        }
        mediaDescriptionM23994.writeToParcel(parcel, i);
    }

    public final String toString() {
        return ((Object) this.f22563) + ", " + ((Object) this.f22561) + ", " + ((Object) this.f22565);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C6762 m18886(Object obj) {
        Bundle bundle = null;
        if (obj == null) {
            return null;
        }
        int i = Build.VERSION.SDK_INT;
        C8253 c8253 = new C8253();
        MediaDescription mediaDescription = (MediaDescription) obj;
        c8253.m22221(C8998.m24005(mediaDescription));
        c8253.m22222(C8998.m24003(mediaDescription));
        c8253.m22224(C8998.m24004(mediaDescription));
        c8253.m22220(C8998.m23995(mediaDescription));
        c8253.m22217(C8998.m24001(mediaDescription));
        c8253.m22218(C8998.m24008(mediaDescription));
        Bundle bundleM24006 = C8998.m24006(mediaDescription);
        if (bundleM24006 != null) {
            C13363.m32945(bundleM24006);
            try {
                bundleM24006.isEmpty();
            } catch (BadParcelableException unused) {
                bundleM24006 = null;
            }
        }
        Uri uri = bundleM24006 != null ? (Uri) bundleM24006.getParcelable("android.support.v4.media.description.MEDIA_URI") : null;
        if (uri == null) {
            bundle = bundleM24006;
        } else if (!bundleM24006.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") || bundleM24006.size() != 2) {
            bundleM24006.remove("android.support.v4.media.description.MEDIA_URI");
            bundleM24006.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
            bundle = bundleM24006;
        }
        c8253.m22219(bundle);
        if (uri != null) {
            c8253.m22223(uri);
        } else if (i >= 23) {
            c8253.m22223(C2287.m7739(mediaDescription));
        }
        C6762 c6762M22216 = c8253.m22216();
        c6762M22216.f22568 = mediaDescription;
        return c6762M22216;
    }
}
