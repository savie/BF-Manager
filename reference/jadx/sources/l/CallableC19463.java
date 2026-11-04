package l;

import android.content.Context;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: l.ᩴ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 2B21 */
/* JADX INFO: loaded from: classes5.dex */
public final class CallableC19463 implements Callable {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Context f62887;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21701 f62888;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f62889;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f62890;

    public CallableC19463(String str, Context context, C21701 c21701, int i) {
        this.f62889 = str;
        this.f62887 = context;
        this.f62888 = c21701;
        this.f62890 = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        try {
            return C5293.m15889(this.f62889, this.f62887, this.f62888, this.f62890);
        } catch (Throwable unused) {
            return new C12750(-3);
        }
    }
}
