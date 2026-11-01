package l;

import android.media.session.MediaSession;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ܰܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: U6BF */
/* JADX INFO: loaded from: classes3.dex */
public final class C13850 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C2996();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C9223 f45685;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final long f45686;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public C13850(C9223 c9223, long j) {
        if (c9223 == null) {
            throw new IllegalArgumentException("Description cannot be null");
        }
        if (j == -1) {
            throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
        }
        this.f45685 = c9223;
        this.f45686 = j;
    }

    public C13850(Parcel parcel) {
        this.f45685 = (C9223) C9223.CREATOR.createFromParcel(parcel);
        this.f45686 = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.f45685.writeToParcel(parcel, i);
        parcel.writeLong(this.f45686);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m33690(List list) {
        C13850 c13850;
        if (list != null) {
            ArrayList arrayList = new ArrayList(list.size());
            for (Object obj : list) {
                if (obj != null) {
                    MediaSession.QueueItem queueItem = (MediaSession.QueueItem) obj;
                    c13850 = new C13850(C9223.m23743(C4676.m12950(queueItem)), C4676.m12952(queueItem));
                } else {
                    c13850 = null;
                }
                arrayList.add(c13850);
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaSession.QueueItem {Description=");
        sb.append(this.f45685);
        sb.append(", Id=");
        return C15037.m36023(sb, this.f45686, " }");
    }
}
