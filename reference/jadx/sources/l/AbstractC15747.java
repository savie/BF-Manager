package l;

/* JADX INFO: renamed from: l.ܺۛ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: UAXR */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC15747 extends AbstractC12405 implements InterfaceC5493 {
    public /* synthetic */ AbstractC15747(int i) {
        this();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public abstract AbstractC15747 mo37488();

    public AbstractC15747() {
    }

    @Override // l.AbstractC12405
    public String toString() {
        AbstractC15747 abstractC15747Mo37488;
        String str;
        int i = C6904.f23232;
        AbstractC15747 abstractC15747 = C18381.f58625;
        if (this == abstractC15747) {
            str = "Dispatchers.Main";
        } else {
            try {
                abstractC15747Mo37488 = abstractC15747.mo37488();
            } catch (UnsupportedOperationException unused) {
                abstractC15747Mo37488 = null;
            }
            str = this == abstractC15747Mo37488 ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        return getClass().getSimpleName() + '@' + C13961.m33816(this);
    }
}
