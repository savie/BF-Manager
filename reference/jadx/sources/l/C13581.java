package l;

import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.media.Rating;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.ܰۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: N5RR */
/* JADX INFO: loaded from: classes3.dex */
public final class C13581 implements Parcelable {
    public static final Parcelable.Creator CREATOR;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final C21445 f44782;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Bundle f44783;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public MediaMetadata f44784;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        C21445 c21445 = new C21445();
        f44782 = c21445;
        c21445.put("android.media.metadata.TITLE", 1);
        c21445.put("android.media.metadata.ARTIST", 1);
        c21445.put("android.media.metadata.DURATION", 0);
        c21445.put("android.media.metadata.ALBUM", 1);
        c21445.put("android.media.metadata.AUTHOR", 1);
        c21445.put("android.media.metadata.WRITER", 1);
        c21445.put("android.media.metadata.COMPOSER", 1);
        c21445.put("android.media.metadata.COMPILATION", 1);
        c21445.put("android.media.metadata.DATE", 1);
        c21445.put("android.media.metadata.YEAR", 0);
        c21445.put("android.media.metadata.GENRE", 1);
        c21445.put("android.media.metadata.TRACK_NUMBER", 0);
        c21445.put("android.media.metadata.NUM_TRACKS", 0);
        c21445.put("android.media.metadata.DISC_NUMBER", 0);
        c21445.put("android.media.metadata.ALBUM_ARTIST", 1);
        c21445.put("android.media.metadata.ART", 2);
        c21445.put("android.media.metadata.ART_URI", 1);
        c21445.put("android.media.metadata.ALBUM_ART", 2);
        c21445.put("android.media.metadata.ALBUM_ART_URI", 1);
        c21445.put("android.media.metadata.USER_RATING", 3);
        c21445.put("android.media.metadata.RATING", 3);
        c21445.put("android.media.metadata.DISPLAY_TITLE", 1);
        c21445.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        c21445.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        c21445.put("android.media.metadata.DISPLAY_ICON", 2);
        c21445.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        c21445.put("android.media.metadata.MEDIA_ID", 1);
        c21445.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        c21445.put("android.media.metadata.MEDIA_URI", 1);
        c21445.put("android.media.metadata.ADVERTISEMENT", 0);
        c21445.put("android.media.metadata.DOWNLOAD_STATUS", 0);
        CREATOR = new C2871();
    }

    public C13581(Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        this.f44783 = bundle2;
        C1148.m4220(bundle2);
    }

    public C13581(Parcel parcel) {
        this.f44783 = parcel.readBundle(C1148.class.getClassLoader());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m33199() {
        return this.f44783.containsKey("android.media.metadata.DURATION");
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long m33201() {
        return this.f44783.getLong("android.media.metadata.DURATION", 0L);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f44783);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m33198(MediaMetadata mediaMetadata) {
        if (mediaMetadata != null) {
            Parcel parcelObtain = Parcel.obtain();
            mediaMetadata.writeToParcel(parcelObtain, 0);
            parcelObtain.setDataPosition(0);
            C13581 c13581 = (C13581) CREATOR.createFromParcel(parcelObtain);
            parcelObtain.recycle();
            c13581.f44784 = mediaMetadata;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final MediaMetadata m33200() {
        if (this.f44784 == null) {
            MediaMetadata.Builder builder = new MediaMetadata.Builder();
            Bundle bundle = this.f44783;
            for (String str : bundle.keySet()) {
                Integer num = (Integer) f44782.getOrDefault(str, null);
                if (num == null) {
                    num = -1;
                }
                int iIntValue = num.intValue();
                if (iIntValue == 0) {
                    builder.putLong(str, bundle.getLong(str, 0L));
                } else if (iIntValue == 1) {
                    builder.putText(str, bundle.getCharSequence(str));
                } else if (iIntValue == 2) {
                    builder.putBitmap(str, (Bitmap) bundle.getParcelable(str));
                } else if (iIntValue == 3) {
                    builder.putRating(str, (Rating) bundle.getParcelable(str));
                } else {
                    Object obj = bundle.get(str);
                    if (obj == null || (obj instanceof CharSequence)) {
                        builder.putText(str, (CharSequence) obj);
                    } else if (obj instanceof Long) {
                        builder.putLong(str, ((Long) obj).longValue());
                    } else if (obj instanceof Bitmap) {
                        builder.putBitmap(str, (Bitmap) obj);
                    } else if (obj instanceof Rating) {
                        builder.putRating(str, (Rating) obj);
                    }
                }
            }
            this.f44784 = builder.build();
        }
        return this.f44784;
    }
}
