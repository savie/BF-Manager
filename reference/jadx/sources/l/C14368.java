package l;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: l.ܰۙ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: I8NB */
/* JADX INFO: loaded from: classes4.dex */
public final class C14368 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final AtomicLong f45299 = new AtomicLong();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f45300;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m34811() {
        return f45299.getAndIncrement();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C14368(C25368 c25368) {
        this(0L, Collections.EMPTY_MAP);
        Uri uri = c25368.f81907;
    }

    public C14368(long j, Map map) {
        this.f45300 = j;
    }
}
