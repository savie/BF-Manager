package l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۚܰᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: SATH */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C5398 implements InterfaceC1164 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC1164 f18631;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC1164 f18632;

    public /* synthetic */ C5398(InterfaceC1164 interfaceC1164, InterfaceC1164 interfaceC1165) {
        this.f18631 = interfaceC1164;
        this.f18632 = interfaceC1165;
    }

    @Override // java.util.function.IntConsumer
    public final /* synthetic */ void accept(int i) {
        C22332.m49498(this, i);
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo4298((Character) obj);
    }

    @Override // l.InterfaceC1164
    /* JADX INFO: renamed from: ܰ */
    public final /* synthetic */ void mo4298(Character ch) {
        C22332.m49499((InterfaceC1164) this, ch);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return C22332.m49497((InterfaceC1164) this, intConsumer);
    }

    @Override // l.InterfaceC1164
    /* JADX INFO: renamed from: ۨ */
    public final C5398 mo4296(InterfaceC1164 interfaceC1164) {
        return new C5398(this, interfaceC1164);
    }

    @Override // l.InterfaceC1164
    /* JADX INFO: renamed from: ۨ */
    public final void mo4297(char c) {
        this.f18631.mo4297(c);
        this.f18632.mo4297(c);
    }

    public final Consumer andThen(Consumer consumer) {
        return C1455.$default$andThen(this, consumer);
    }
}
