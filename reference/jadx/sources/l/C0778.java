package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.֨֨ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: SB38 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0778 extends AbstractC8457 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f3356;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Consumer f3357;

    @Override // l.InterfaceC5614
    /* JADX INFO: renamed from: ֨ */
    public final boolean mo2357() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0778(String str, Consumer consumer) {
        super(null);
        this.f3356 = str;
        this.f3357 = consumer;
    }

    @Override // l.C10574, net.sf.sevenzipjbinding.ICryptoGetTextPassword
    public final String cryptoGetTextPassword() {
        return this.f3356;
    }

    @Override // l.AbstractC8457
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void mo3330(String str) {
        this.f3357.n(C5553.m15313(str, new String[0]));
    }
}
