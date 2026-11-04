package l;

import java.util.Map;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ܳۧ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 76EN */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C15309 implements Function {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f50047;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f50048;

    public /* synthetic */ C15309(int i, Object obj) {
        this.f50047 = i;
        this.f50048 = obj;
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
        switch (this.f50047) {
            case 0:
                return (String) ((Map) this.f50048).get((InterfaceC13673) obj);
            case 1:
                return C15186.m36535(AbstractC1566.m5532((C1610) this.f50048, (AbstractC1566) obj));
            case 2:
                return C2551.m8487((C24927) this.f50048, (InterfaceC2704) obj);
            default:
                return Boolean.valueOf(C3486.m11474((C3486) this.f50048, (C2551) obj));
        }
    }
}
