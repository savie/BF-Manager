package l;

import java.util.Collections;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۤۜۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: I6DT */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C10690 implements Function {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC1566 f33924;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14022 f33925;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21879 f33926;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2551 f33927;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2551 f33928;

    public /* synthetic */ C10690(C11436 c11436, C21879 c21879, C2551 c2551, C2551 c2552, AbstractC1566 abstractC1566, C14022 c14022) {
        this.f33926 = c21879;
        this.f33928 = c2551;
        this.f33927 = c2552;
        this.f33924 = abstractC1566;
        this.f33925 = c14022;
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
        C21965 c21965Mo8532;
        C18959 c18959 = (C18959) obj;
        if (c18959.getType() != EnumC24203.SGET || !this.f33926.test(c18959)) {
            return null;
        }
        C2551 c2551 = this.f33928;
        C2551 c2552 = this.f33927;
        if (c2551 == null) {
            C1610 c1610Mo8527 = c2552.mo8527();
            AbstractC1566 abstractC1566 = this.f33924;
            c21965Mo8532 = C21965.m49691(c1610Mo8527, C1345.m4955(c1610Mo8527, abstractC1566), "values", Collections.EMPTY_LIST, AbstractC1566.m5528(abstractC1566));
        } else {
            c21965Mo8532 = c2551.mo8532();
        }
        C21219 c21219 = new C21219(c21965Mo8532, EnumC0336.STATIC, 0);
        c21219.m44031(c18959.m44027());
        if (c2551 == null) {
            c21219.mo17866(EnumC1763.FORCE_RAW_NAME);
        }
        c2552.m31133("Replace access to removed values field (" + this.f33925.m34147() + ") with 'values()' method");
        return c21219;
    }
}
