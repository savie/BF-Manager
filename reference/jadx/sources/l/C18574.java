package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ᩴۛܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: I5ZF */
/* JADX INFO: loaded from: classes5.dex */
public final class C18574 extends AbstractC6827 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC11955 f59074;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18574(Iterator it, InterfaceC11955 interfaceC11955) {
        super(it);
        this.f59074 = interfaceC11955;
    }

    @Override // l.AbstractC6827
    /* JADX INFO: renamed from: ۙ */
    public final Object mo5533(Object obj) {
        return this.f59074.apply(obj);
    }
}
