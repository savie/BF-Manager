package l;

import java.io.File;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;

/* JADX INFO: renamed from: l.᩻᩵ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 898C */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C25269 implements Function {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f81599;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f81600;

    public /* synthetic */ C25269(int i, Object obj) {
        this.f81599 = i;
        this.f81600 = obj;
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
        switch (this.f81599) {
            case 0:
                return C17063.m40198((File) obj, (String) this.f81600);
            case 1:
                Set set = (Set) this.f81600;
                AbstractC1566 abstractC1566 = (AbstractC1566) obj;
                if (!abstractC1566.m5569() || set.contains(abstractC1566)) {
                    return null;
                }
                return abstractC1566;
            default:
                HashSet hashSet = (HashSet) this.f81600;
                AbstractC1566 abstractC1567 = (AbstractC1566) obj;
                if (!abstractC1567.m5569()) {
                    return null;
                }
                hashSet.add(abstractC1567.mo5570());
                return null;
        }
    }
}
