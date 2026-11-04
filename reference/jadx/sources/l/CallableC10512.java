package l;

import android.content.Context;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: l.ۤ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 2B21 */
/* JADX INFO: loaded from: classes3.dex */
public final class CallableC10512 implements Callable {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Context f33444;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21701 f33445;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f33446;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f33447;

    public CallableC10512(String str, Context context, C21701 c21701, int i) {
        this.f33446 = str;
        this.f33444 = context;
        this.f33445 = c21701;
        this.f33447 = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return C5293.m15889(this.f33446, this.f33444, this.f33445, this.f33447);
    }
}
