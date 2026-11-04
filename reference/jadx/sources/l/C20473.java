package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩵ۢۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: 46E9 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C20473 implements Consumer {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f65595;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f65596;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f65597;

    public /* synthetic */ C20473(int i, Object obj, Object obj2) {
        this.f65595 = i;
        this.f65597 = obj;
        this.f65596 = obj2;
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C12312.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void n(Object obj) {
        switch (this.f65595) {
            case 0:
                C6303.m17993((C6303) this.f65597, (C18959[]) this.f65596, (InterfaceC7377) obj);
                break;
            default:
                C2551 c2551 = (C2551) this.f65597;
                AbstractC1566 abstractC1566 = (AbstractC1566) this.f65596;
                C17973 c17973 = (C17973) obj;
                AbstractC1566 abstractC1566M41941 = c17973.m41941();
                if (abstractC1566M41941 != null && abstractC1566M41941.mo5564()) {
                    EnumC7215 enumC7215M23403 = c2551.mo8527().m5685().m26142().m23403(abstractC1566M41941, abstractC1566);
                    if (enumC7215M23403 == EnumC7215.CONFLICT || enumC7215M23403.m19812()) {
                        c2551.m31136("Incorrect type for immutable var: ssa=" + abstractC1566M41941 + ", code=" + abstractC1566 + ", for " + c17973.m41929(c2551));
                    }
                    break;
                }
                break;
        }
    }
}
