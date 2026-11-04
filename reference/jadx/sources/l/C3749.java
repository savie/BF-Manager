package l;

import android.content.Intent;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: renamed from: l.ۗ᩺ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAQJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C3749 extends AbstractC11361 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public CountDownLatch f12855;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public Intent f12856;

    @Override // l.AbstractC11361
    public final void send(Intent intent) {
        this.f12856 = intent;
        this.f12855.countDown();
    }
}
