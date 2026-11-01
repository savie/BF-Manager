package l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ܺ֫ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: QATC */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C15630 implements InterfaceC0106 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC0106 f50826;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC0106 f50827;

    public /* synthetic */ C15630(InterfaceC0106 interfaceC0106, InterfaceC0106 interfaceC0107) {
        this.f50826 = interfaceC0106;
        this.f50827 = interfaceC0107;
    }

    @Override // java.util.function.IntConsumer
    public final /* synthetic */ void accept(int i) {
        C19863.m45116(this, i);
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo1139((Byte) obj);
    }

    @Override // l.InterfaceC0106
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo1139(Byte b) {
        C19863.m45117((InterfaceC0106) this, b);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return C19863.m45115((InterfaceC0106) this, intConsumer);
    }

    @Override // l.InterfaceC0106
    /* JADX INFO: renamed from: ۙ */
    public final C15630 mo1137(InterfaceC0106 interfaceC0106) {
        return new C15630(this, interfaceC0106);
    }

    @Override // l.InterfaceC0106
    /* JADX INFO: renamed from: ۙ */
    public final void mo1138(byte b) {
        this.f50826.mo1138(b);
        this.f50827.mo1138(b);
    }

    public final Consumer andThen(Consumer consumer) {
        return C1455.$default$andThen(this, consumer);
    }
}
