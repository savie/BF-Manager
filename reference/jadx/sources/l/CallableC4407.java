package l;

import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;

/* JADX INFO: renamed from: l.ۘ᩶ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 49SV */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class CallableC4407 implements Callable {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f15833;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f15834;

    public /* synthetic */ CallableC4407(int i, Object obj) {
        this.f15833 = i;
        this.f15834 = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f15833) {
            case 0:
                return ((C0678) this.f15834).m2931();
            default:
                return new C7918((JsReplyProxyBoundaryInterface) this.f15834);
        }
    }
}
