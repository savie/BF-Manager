package l;

import android.media.browse.MediaBrowser;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 95XT */
/* JADX INFO: loaded from: classes2.dex */
public class C3778 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C23916();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C6762 f12951;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f12952;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m12254(List list) {
        C3778 c3778;
        if (list != null) {
            ArrayList arrayList = new ArrayList(list.size());
            for (Object obj : list) {
                if (obj != null) {
                    MediaBrowser.MediaItem mediaItem = (MediaBrowser.MediaItem) obj;
                    c3778 = new C3778(C6762.m18886(C11235.m28301(mediaItem)), C11235.m28314(mediaItem));
                } else {
                    c3778 = null;
                }
                arrayList.add(c3778);
            }
        }
    }

    public C3778(C6762 c6762, int i) {
        if (c6762 == null) {
            throw new IllegalArgumentException("description cannot be null");
        }
        if (TextUtils.isEmpty(c6762.m18887())) {
            throw new IllegalArgumentException("description must have a non-empty media id");
        }
        this.f12952 = i;
        this.f12951 = c6762;
    }

    public C3778(Parcel parcel) {
        this.f12952 = parcel.readInt();
        this.f12951 = (C6762) C6762.CREATOR.createFromParcel(parcel);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f12952);
        this.f12951.writeToParcel(parcel, i);
    }

    public final String toString() {
        return "MediaItem{mFlags=" + this.f12952 + ", mDescription=" + this.f12951 + '}';
    }
}
