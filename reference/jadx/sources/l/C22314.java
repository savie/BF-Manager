package l;

import android.media.session.MediaSession;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.᩷᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: U6BF */
/* JADX INFO: loaded from: classes.dex */
public final class C22314 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C13605();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C6762 f72237;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final long f72238;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public C22314(C6762 c6762, long j) {
        if (c6762 == null) {
            throw new IllegalArgumentException("Description cannot be null");
        }
        if (j == -1) {
            throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
        }
        this.f72237 = c6762;
        this.f72238 = j;
    }

    public C22314(Parcel parcel) {
        this.f72237 = (C6762) C6762.CREATOR.createFromParcel(parcel);
        this.f72238 = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.f72237.writeToParcel(parcel, i);
        parcel.writeLong(this.f72238);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m50378(List list) {
        C22314 c22314;
        if (list != null) {
            ArrayList arrayList = new ArrayList(list.size());
            for (Object obj : list) {
                if (obj != null) {
                    MediaSession.QueueItem queueItem = (MediaSession.QueueItem) obj;
                    c22314 = new C22314(C6762.m18886(C5160.m15579(queueItem)), C5160.m15580(queueItem));
                } else {
                    c22314 = null;
                }
                arrayList.add(c22314);
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaSession.QueueItem {Description=");
        sb.append(this.f72237);
        sb.append(", Id=");
        return C2764.m9137(sb, this.f72238, " }");
    }
}
