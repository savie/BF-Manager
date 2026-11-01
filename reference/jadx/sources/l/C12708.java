package l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.۫᩹᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: H1KB */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C12708 implements IntConsumer {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f42383;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f42384;

    public /* synthetic */ C12708(int i, Object obj) {
        this.f42383 = i;
        this.f42384 = obj;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        switch (this.f42383) {
            case 0:
                C9886.m24985((C9886) this.f42384, i);
                break;
            default:
                ((Consumer) this.f42384).accept(Integer.valueOf(i));
                break;
        }
    }

    public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return C7100.$default$andThen(this, intConsumer);
    }
}
