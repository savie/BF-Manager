package l;

import android.content.Intent;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: renamed from: l.ۧ᩷ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: I6DO */
/* JADX INFO: loaded from: classes4.dex */
public final class C11876 extends AbstractC11361 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final CountDownLatch f38290 = new CountDownLatch(1);

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public Intent f38291;

    @Override // l.AbstractC11361
    public final synchronized void send(Intent intent) {
        if (this.f38291 != null) {
            return;
        }
        this.f38291 = intent;
        this.f38290.countDown();
    }

    public C11876(int i) {
    }
}
