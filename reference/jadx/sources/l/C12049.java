package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۨۖ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: E72G */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C12049 implements Consumer {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23984 f38818;

    public /* synthetic */ C12049(C23984 c23984) {
        this.f38818 = c23984;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        C23984.m53515(this.f38818, (C22764) obj);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C12312.$default$andThen(this, consumer);
    }
}
