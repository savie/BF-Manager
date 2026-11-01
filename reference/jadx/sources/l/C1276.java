package l;

import android.media.browse.MediaBrowser;
import android.os.Parcel;
import android.service.media.MediaBrowserService;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.֨ᩳۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: X6AW */
/* JADX INFO: loaded from: classes2.dex */
public final class C1276 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public MediaBrowserService.Result f5513;

    public C1276(MediaBrowserService.Result result) {
        this.f5513 = result;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4604(Object obj) {
        boolean z = obj instanceof List;
        MediaBrowserService.Result result = this.f5513;
        if (z) {
            List<Parcel> list = (List) obj;
            ArrayList arrayList = new ArrayList(list.size());
            for (Parcel parcel : list) {
                parcel.setDataPosition(0);
                arrayList.add((MediaBrowser.MediaItem) MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
                parcel.recycle();
            }
            result.sendResult(arrayList);
            return;
        }
        if (obj instanceof Parcel) {
            Parcel parcel2 = (Parcel) obj;
            parcel2.setDataPosition(0);
            result.sendResult(MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel2));
            parcel2.recycle();
            return;
        }
        result.sendResult(null);
    }
}
