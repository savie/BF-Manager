package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩺ۖ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class C22699 extends AbstractC7238 {
    public final /* synthetic */ int s;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C22699(AbstractC5752 abstractC5752, int i, Object obj, int i2) {
        super(abstractC5752, i);
        this.s = i2;
        this.t = obj;
    }

    @Override // l.AbstractC5752
    public final InterfaceC19171 q0(int i, InterfaceC19171 interfaceC19171) {
        switch (this.s) {
            case 0:
                return new C3211(this, interfaceC19171, 0);
            case 1:
                return new C19877(this, interfaceC19171, 0);
            case 2:
                return new C8803(this, interfaceC19171, 0);
            case 3:
                return new C4622(this, interfaceC19171, 1);
            default:
                return new C4622(this, interfaceC19171, 2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22699(AbstractC14295 abstractC14295, Consumer consumer) {
        super(abstractC14295, 0);
        this.s = 3;
        this.t = consumer;
    }
}
