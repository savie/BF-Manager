package l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ᩴ᩵۬, reason: contains not printable characters */
/* JADX INFO: compiled from: 18PZ */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C18966 implements InterfaceC23537 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC7824 f61413;

    public /* synthetic */ C18966(InterfaceC7824 interfaceC7824) {
        this.f61413 = interfaceC7824;
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo1000((Integer) obj);
    }

    @Override // l.InterfaceC23537
    /* JADX INFO: renamed from: ۨ */
    public final /* synthetic */ void mo1000(Integer num) {
        C10837.m27159((InterfaceC23537) this, num);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return C10837.m27158((InterfaceC23537) this, intConsumer);
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        if (i > 0) {
            this.f61413.mo20645(i);
        }
    }

    public final Consumer andThen(Consumer consumer) {
        return C1455.$default$andThen(this, consumer);
    }
}
