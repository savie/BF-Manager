package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۗۚܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: I5ZF */
/* JADX INFO: loaded from: classes3.dex */
public final class C3201 extends AbstractC13465 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC5417 f10440;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3201(Iterator it, InterfaceC5417 interfaceC5417) {
        super(it);
        this.f10440 = interfaceC5417;
    }

    @Override // l.AbstractC13465
    /* JADX INFO: renamed from: ۙ */
    public final Object mo8279(Object obj) {
        return this.f10440.apply(obj);
    }
}
