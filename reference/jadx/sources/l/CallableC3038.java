package l;

import android.content.Context;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: l.ۗۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2B21 */
/* JADX INFO: loaded from: classes2.dex */
public final class CallableC3038 implements Callable {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f11349;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Context f11350;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14329 f11351;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f11352;

    public CallableC3038(String str, Context context, C14329 c14329, int i) {
        this.f11352 = str;
        this.f11350 = context;
        this.f11351 = c14329;
        this.f11349 = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        try {
            return C11651.m29107(this.f11352, this.f11350, this.f11351, this.f11349);
        } catch (Throwable unused) {
            return new C13768(-3);
        }
    }
}
