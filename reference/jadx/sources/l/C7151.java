package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.۟֫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: F1FR */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C7151 implements Consumer {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16324 f23907;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f23908;

    public /* synthetic */ C7151(C16324 c16324, boolean z) {
        this.f23907 = c16324;
        this.f23908 = z;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void n(Object obj) {
        C16324.m38492(this.f23907, this.f23908, (ActivityC5677) obj);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C1455.$default$andThen(this, consumer);
    }
}
