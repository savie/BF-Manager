package l;

import android.media.browse.MediaBrowser;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 95XT */
/* JADX INFO: loaded from: classes4.dex */
public class C20511 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C7105();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C9223 f66486;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f66487;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m46307(List list) {
        C20511 c20511;
        if (list != null) {
            ArrayList arrayList = new ArrayList(list.size());
            for (Object obj : list) {
                if (obj != null) {
                    MediaBrowser.MediaItem mediaItem = (MediaBrowser.MediaItem) obj;
                    c20511 = new C20511(C9223.m23743(C6399.m17547(mediaItem)), C6399.m17548(mediaItem));
                } else {
                    c20511 = null;
                }
                arrayList.add(c20511);
            }
        }
    }

    public C20511(C9223 c9223, int i) {
        if (c9223 == null) {
            throw new IllegalArgumentException("description cannot be null");
        }
        if (TextUtils.isEmpty(c9223.m23744())) {
            throw new IllegalArgumentException("description must have a non-empty media id");
        }
        this.f66487 = i;
        this.f66486 = c9223;
    }

    public C20511(Parcel parcel) {
        this.f66487 = parcel.readInt();
        this.f66486 = (C9223) C9223.CREATOR.createFromParcel(parcel);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f66487);
        this.f66486.writeToParcel(parcel, i);
    }

    public final String toString() {
        return "MediaItem{mFlags=" + this.f66487 + ", mDescription=" + this.f66486 + '}';
    }
}
