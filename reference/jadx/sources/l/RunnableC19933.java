package l;

import android.app.Application;

/* JADX INFO: renamed from: l.ᩴܺܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 7IS1 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class RunnableC19933 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f64122;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f64123;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Application f64124;

    public /* synthetic */ RunnableC19933(String str, Application application, String str2) {
        this.f64122 = str;
        this.f64124 = application;
        this.f64123 = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C15457.m37013(this.f64122, this.f64124, this.f64123);
    }
}
