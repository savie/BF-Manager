package l;

import android.content.Intent;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: renamed from: l.ۢۡۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAQJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C9478 extends AbstractC20102 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public CountDownLatch f32074;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Intent f32075;

    @Override // l.AbstractC20102
    public final void send(Intent intent) {
        this.f32075 = intent;
        this.f32074.countDown();
    }
}
