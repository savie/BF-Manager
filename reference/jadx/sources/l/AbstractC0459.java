package l;

/* JADX INFO: renamed from: l.֡۬᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: UAXR */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0459 extends AbstractC18951 implements InterfaceC19654 {
    public /* synthetic */ AbstractC0459(int i) {
        this();
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public abstract AbstractC0459 mo2274();

    public AbstractC0459() {
    }

    @Override // l.AbstractC18951
    public String toString() {
        AbstractC0459 abstractC0459Mo2274;
        String str;
        int i = C1755.f5987;
        AbstractC0459 abstractC0459 = C18593.f60391;
        if (this == abstractC0459) {
            str = "Dispatchers.Main";
        } else {
            try {
                abstractC0459Mo2274 = abstractC0459.mo2274();
            } catch (UnsupportedOperationException unused) {
                abstractC0459Mo2274 = null;
            }
            str = this == abstractC0459Mo2274 ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        return getClass().getSimpleName() + '@' + C21892.m49586(this);
    }
}
