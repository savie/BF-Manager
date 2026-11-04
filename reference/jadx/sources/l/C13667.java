package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.۬ۛ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C13667 implements Consumer {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7941 f43406;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33446(boolean z) {
        C7941.m21557(this.f43406, z);
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void n(Object obj) {
        m33446(((Boolean) obj).booleanValue());
    }

    public final Consumer andThen(Consumer consumer) {
        return C12312.$default$andThen(this, consumer);
    }
}
