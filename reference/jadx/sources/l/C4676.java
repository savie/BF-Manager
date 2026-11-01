package l;

import android.media.MediaDescription;
import android.media.session.MediaSession;

/* JADX INFO: renamed from: l.ۙܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: U6BF */
/* JADX INFO: loaded from: classes2.dex */
public final class C4676 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static MediaSession.QueueItem m12951(MediaDescription mediaDescription, long j) {
        return new MediaSession.QueueItem(mediaDescription, j);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static MediaDescription m12950(MediaSession.QueueItem queueItem) {
        return queueItem.getDescription();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static long m12952(MediaSession.QueueItem queueItem) {
        return queueItem.getQueueId();
    }
}
