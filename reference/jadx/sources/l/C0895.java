package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.֨ۙᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 97L */
/* JADX INFO: loaded from: classes3.dex */
public final class C0895 extends AbstractC15008 implements InterfaceC15277, InterfaceC6206 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7952 f3604;

    @Override // l.AbstractC15008, java.util.Iterator, l.InterfaceC6206
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C23038.m50971(this, consumer);
    }

    @Override // java.util.Iterator
    public final Object next() {
        return Character.valueOf(mo1416());
    }

    @Override // l.AbstractC15008
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo3571(int i, Object obj) {
        ((InterfaceC1164) obj).mo4297(this.f3604.f26123[i]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0895(C7952 c7952) {
        super(c7952);
        this.f3604 = c7952;
    }

    @Override // l.InterfaceC15277
    /* JADX INFO: renamed from: ᩵ܰ */
    public final char mo1416() {
        return this.f3604.f26123[m35989()];
    }
}
