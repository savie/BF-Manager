package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ᩴ۫᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: SB38 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19831 extends AbstractC16166 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Consumer f63752;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f63753;

    @Override // l.InterfaceC7509
    /* JADX INFO: renamed from: ۫ */
    public final boolean mo924() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19831(String str, Consumer consumer) {
        super(null);
        this.f63753 = str;
        this.f63752 = consumer;
    }

    @Override // l.C20642, net.sf.sevenzipjbinding.ICryptoGetTextPassword
    public final String cryptoGetTextPassword() {
        return this.f63753;
    }

    @Override // l.AbstractC16166
    /* JADX INFO: renamed from: ܽ */
    public final void mo36798(String str) {
        this.f63752.n(C14584.m35193(str, new String[0]));
    }
}
