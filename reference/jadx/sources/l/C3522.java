package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۗܺۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: F1FR */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C3522 implements Consumer {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24406 f12101;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f12102;

    public /* synthetic */ C3522(C24406 c24406, boolean z) {
        this.f12101 = c24406;
        this.f12102 = z;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void n(Object obj) {
        C24406.m54596(this.f12101, this.f12102, (ActivityC0848) obj);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C12312.$default$andThen(this, consumer);
    }
}
