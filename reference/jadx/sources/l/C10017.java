package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۢۡܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: C1ZO */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C10017 implements Consumer {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1069 f32135;

    public /* synthetic */ C10017(C1069 c1069) {
        this.f32135 = c1069;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        C1069.m4004(this.f32135, (C10567) obj);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C12312.$default$andThen(this, consumer);
    }
}
