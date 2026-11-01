package l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.ۢۢᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9509 extends AbstractC7238 {
    public final /* synthetic */ int s;
    public final /* synthetic */ Function t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9509(AbstractC14295 abstractC14295, int i, Function function, int i2) {
        super(abstractC14295, i);
        this.s = i2;
        this.t = function;
    }

    @Override // l.AbstractC5752
    public final InterfaceC19171 q0(int i, InterfaceC19171 interfaceC19171) {
        switch (this.s) {
            case 0:
                return new C4622(this, interfaceC19171, 3);
            default:
                return new C0451(this, interfaceC19171);
        }
    }
}
