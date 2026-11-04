package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۨ᩹᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 97L */
/* JADX INFO: loaded from: classes4.dex */
public final class C12680 extends AbstractC21631 implements InterfaceC21040, InterfaceC19597 {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19393 f40627;

    @Override // l.AbstractC21631, java.util.Iterator, l.InterfaceC19597
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C14326.m34753(this, consumer);
    }

    @Override // java.util.Iterator
    public final Object next() {
        return Character.valueOf(mo5320());
    }

    @Override // l.AbstractC21631
    /* JADX INFO: renamed from: ۙ */
    public final void mo3081(int i, Object obj) {
        ((InterfaceC12089) obj).mo10258(this.f40627.f62668[i]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12680(C19393 c19393) {
        super(c19393);
        this.f40627 = c19393;
    }

    @Override // l.InterfaceC21040
    /* JADX INFO: renamed from: ᩵᩷ */
    public final char mo5320() {
        return this.f40627.f62668[m49168()];
    }
}
