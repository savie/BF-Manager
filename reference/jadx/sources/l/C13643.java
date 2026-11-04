package l;

import java.util.IdentityHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: l.۬ۚ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: BIYL */
/* JADX INFO: loaded from: classes4.dex */
public final class C13643 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final IdentityHashMap f43307 = new IdentityHashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ExecutorService f43306 = Executors.newSingleThreadExecutor(new ThreadFactoryC6932());

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m33378() {
        this.f43307.clear();
    }
}
