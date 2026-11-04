package l;

import com.amazonaws.services.s3.model.PutObjectRequest;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.֨᩵ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4BN4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC1395 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Serializable f4957;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f4958;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f4959;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f4960;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f4961;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f4962;

    public /* synthetic */ RunnableC1395(Object obj, Object obj2, Serializable serializable, Object obj3, Object obj4, int i) {
        this.f4959 = i;
        this.f4962 = obj;
        this.f4960 = obj2;
        this.f4957 = serializable;
        this.f4958 = obj3;
        this.f4961 = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4959) {
            case 0:
                C22037.m49824((C22037) this.f4962, (ArrayList) this.f4960, (ArrayList) this.f4957, (ArrayList) this.f4958, (ArrayList) this.f4961);
                break;
            default:
                C22302.m50360((C22302) this.f4962, (PutObjectRequest) this.f4960, (AtomicReference) this.f4957, (InterfaceC13810) this.f4958, (CountDownLatch) this.f4961);
                break;
        }
    }
}
