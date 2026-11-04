package l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.ۡ֫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 4IX4 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C9059 implements Function {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f29457;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f29458;

    public /* synthetic */ C9059(int i, Object obj) {
        this.f29457 = i;
        this.f29458 = obj;
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public /* synthetic */ Function mo10608andThen(Function function) {
        return C24247.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return C24247.$default$compose(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f29457) {
            case 0:
                C21922 c21922 = (C21922) this.f29458;
                C18959 c18959 = (C18959) obj;
                boolean zM44022 = c18959.m44022();
                C11457 c11457 = C11457.f36015;
                if ((zM44022 || c18959.mo17867(c11457)) && !C17359.equals(c18959.mo17862((InterfaceC2157) c11457), c21922)) {
                    return Boolean.TRUE;
                }
                return null;
            default:
                C23747 c23747M56365 = ((C13304) this.f29458).m32857().m56365();
                if (c23747M56365 == null) {
                    return null;
                }
                return c23747M56365.m53020();
        }
    }
}
