package l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.֫ܿ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: I6UD */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2085 implements Function {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f6919;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f6920;

    public /* synthetic */ C2085(int i, Object obj) {
        this.f6919 = i;
        this.f6920 = obj;
    }

    public /* synthetic */ C2085(C3101 c3101, C2551 c2551) {
        this.f6919 = 2;
        this.f6920 = c2551;
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
        switch (this.f6919) {
            case 0:
                return C17000.m40057((C17000) this.f6920);
            case 1:
                CharSequence charSequence = (CharSequence) obj;
                return charSequence.length() != 0 ? charSequence : ((C23255) this.f6920).m54021();
            case 2:
                AbstractC1566 abstractC1566 = (AbstractC1566) obj;
                C3101.m10100((C2551) this.f6920, abstractC1566);
                return abstractC1566;
            default:
                C19991 c19991 = (C19991) this.f6920;
                if (obj instanceof C15515) {
                    return c19991.m45975((C15515) obj);
                }
                c19991.getClass();
                return obj;
        }
    }
}
