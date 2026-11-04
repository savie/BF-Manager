package l;

import bin.mt.plus.R;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۗ۫۫, reason: contains not printable characters */
/* JADX INFO: compiled from: K7BU */
/* JADX INFO: loaded from: classes3.dex */
public final class C3415 extends AbstractC9843 implements Function {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public List f11085;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public String f11086;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public String f11087;

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
        C8614 c8614 = (C8614) obj;
        if (!c8614.m23228("local") || c8614.m23197()) {
            return Boolean.FALSE;
        }
        if (c8614.m23192().equals(this.f11086)) {
            if (this.f11085.size() != 1) {
                C22673.m51152(R.string.MT_Protector);
                return Boolean.FALSE;
            }
            InterfaceC2386 interfaceC2386 = (InterfaceC2386) this.f11085.get(0);
            C17585.m41246(c8614.m23233(), interfaceC2386, c8614.m23166(), new C16093(interfaceC2386, c8614));
            return Boolean.TRUE;
        }
        m11166(this.f11085, c8614, this.f11087, c8614.m23222(), c8614.m23166(), null).m22714();
        return Boolean.TRUE;
    }

    public C3415() {
        super(R.string.MT_Protector, R.drawable.MT_Protector);
        this.f11085 = Collections.EMPTY_LIST;
    }

    @Override // l.AbstractC9843
    /* JADX INFO: renamed from: ᩸ */
    public final boolean mo2481(C12915 c12915) {
        return c12915.m31986("local") && !c12915.m31988();
    }

    @Override // l.AbstractC9843
    /* JADX INFO: renamed from: ۤ */
    public final void mo2016(C12915 c12915) {
        c12915.m31970("local");
        if (c12915.m31988()) {
            throw new IllegalStateException("Search results do not support single-window copy.");
        }
        this.f11085 = c12915.m31982();
        this.f11086 = c12915.m31976();
        this.f11087 = c12915.m31972();
        c12915.m31983().m23172(R.string.MT_Protector, this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C8458 m11166(List list, C8614 c8614, String str, String str2, String str3, String str4) {
        int i = C13678.f43415;
        C8458 c8458 = new C8458(C23553.class);
        c8458.m22730(list);
        c8458.m22725(c8614);
        c8458.m22719("ARG_MSG_FROM", str);
        c8458.m22719("targetPath", str3);
        if (str2 != null) {
            c8458.m22719("ARG_MSG_TO", str2);
        }
        if (str4 != null) {
            c8458.m22719("replacedName", str4);
        }
        return c8458;
    }
}
