package l;

import java.util.HashSet;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۛ᩹ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: KAQ1 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C6704 implements Function {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f22295;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f22296;

    public /* synthetic */ C6704(int i, Object obj) {
        this.f22295 = i;
        this.f22296 = obj;
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
        switch (this.f22295) {
            case 0:
                return C24604.m54926((C24604) this.f22296, (String) obj);
            case 1:
                return ((AbstractC2805) obj).mo9275((AbstractC2805) this.f22296);
            default:
                HashSet hashSet = (HashSet) this.f22296;
                AbstractC1566 abstractC1566 = (AbstractC1566) obj;
                if (!abstractC1566.m5569()) {
                    return null;
                }
                hashSet.add(abstractC1566.mo5570());
                return null;
        }
    }
}
