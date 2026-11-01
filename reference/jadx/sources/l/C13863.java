package l;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: l.ܰܰܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: I8NB */
/* JADX INFO: loaded from: classes3.dex */
public final class C13863 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final AtomicLong f45703 = new AtomicLong();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f45704;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m33700() {
        return f45703.getAndIncrement();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C13863(C12257 c12257) {
        this(0L, Collections.EMPTY_MAP);
        Uri uri = c12257.f41015;
    }

    public C13863(long j, Map map) {
        this.f45704 = j;
    }
}
