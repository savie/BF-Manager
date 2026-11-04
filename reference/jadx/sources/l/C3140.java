package l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۗۗ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: SATH */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C3140 implements InterfaceC12089 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC12089 f10175;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC12089 f10176;

    public /* synthetic */ C3140(InterfaceC12089 interfaceC12089, InterfaceC12089 interfaceC120810) {
        this.f10175 = interfaceC12089;
        this.f10176 = interfaceC120810;
    }

    @Override // java.util.function.IntConsumer
    public final /* synthetic */ void accept(int i) {
        C20294.m46630(this, i);
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo10259((Character) obj);
    }

    @Override // l.InterfaceC12089
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ void mo10259(Character ch) {
        C20294.m46631((InterfaceC12089) this, ch);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return C20294.m46629((InterfaceC12089) this, intConsumer);
    }

    @Override // l.InterfaceC12089
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C3140 mo10257(InterfaceC12089 interfaceC12089) {
        return new C3140(this, interfaceC12089);
    }

    @Override // l.InterfaceC12089
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void mo10258(char c) {
        this.f10175.mo10258(c);
        this.f10176.mo10258(c);
    }

    public final Consumer andThen(Consumer consumer) {
        return C12312.$default$andThen(this, consumer);
    }
}
