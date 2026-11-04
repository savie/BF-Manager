package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܺ᩸᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: B7FA */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C17134 implements Consumer {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7439 f55888;

    public /* synthetic */ C17134(C7439 c7439) {
        this.f55888 = c7439;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f55888.f24488.m21391((C19043) obj);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C12312.$default$andThen(this, consumer);
    }
}
