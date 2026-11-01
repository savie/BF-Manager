package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۖ֡᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: IB3L */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2185 implements Predicate {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f7922;

    public /* synthetic */ C2185(int i) {
        this.f7922 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C8512.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo9645negate() {
        switch (this.f7922) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return C8512.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return C8512.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f7922) {
            case 0:
                return ((InterfaceC2557) obj).isDirectory();
            case 1:
                return (C3128.m9431((AbstractC8774) ((InterfaceC17428) obj)) & 16777216) == 0;
            case 2:
                return ((AbstractC16579) obj).f53222.f77452 == EnumC10477.f35866;
            default:
                C10229 c10229 = (C10229) obj;
                EnumC8112 enumC8112 = EnumC8112.f28427;
                C21825 c21825M26012 = c10229.m26012(enumC8112);
                C19003 c19003 = new C19003();
                int i = 0;
                for (AbstractC16579 abstractC16579 : c10229.m26012(enumC8112)) {
                    int i2 = i + 1;
                    if (i == c10229.f34908) {
                        C21825 c21825M48593 = c21825M26012.m48593(c19003.m43726());
                        C21825 c21825M26013 = c10229.m26012(EnumC8112.f28428, EnumC8112.f28425);
                        c21825M48593.getClass();
                        return c21825M26013.m48594(c21825M48593).m48595();
                    }
                    c19003.m43723(abstractC16579);
                    i = i2;
                }
                C21825 c21825M48594 = c21825M26012.m48593(c19003.m43726());
                C21825 c21825M26014 = c10229.m26012(EnumC8112.f28428, EnumC8112.f28425);
                c21825M48594.getClass();
                return c21825M26014.m48594(c21825M48594).m48595();
        }
    }
}
