package l;

import bin.mt.plus.R;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

/* JADX INFO: renamed from: l.۫֫۫, reason: contains not printable characters */
/* JADX INFO: compiled from: V7BK */
/* JADX INFO: loaded from: classes4.dex */
public final class C12782 extends AbstractC9843 implements Function {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public String f40889;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public List f40890;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public String f40891;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public String f40892;

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
        if (c8614.m23192().equals(this.f40889)) {
            C22673.m51152(R.string.MT_Protector);
            return Boolean.FALSE;
        }
        AbstractC22044 abstractC22044M35193 = C14584.m35193(c8614.m23204(), new String[0]);
        for (InterfaceC2386 interfaceC2386 : this.f40890) {
            if (interfaceC2386.isDirectory() && abstractC22044M35193.m49851(interfaceC2386.mo8093())) {
                c8614.m23233().m40400(C21576.m49059(R.string.MT_Protector, interfaceC2386.getName()), false);
                return Boolean.FALSE;
            }
        }
        int i = C13678.f43415;
        C8458 c8458 = new C8458(C15019.class);
        c8458.m22723(this.f40890);
        c8458.m22725(c8614);
        c8458.m22719("ARG_MSG_FROM", this.f40892);
        c8458.m22719("ARG_MSG_TO", c8614.m23222());
        c8458.m22719("sourcePath", this.f40891);
        c8458.m22719("targetPath", c8614.m23204());
        c8458.m22714();
        return Boolean.TRUE;
    }

    public C12782() {
        super(android.R.string.cut, R.drawable.MT_Protector);
        this.f40890 = Collections.EMPTY_LIST;
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
            throw new IllegalStateException("Search results do not support single-window move.");
        }
        this.f40890 = c12915.m31982();
        this.f40889 = c12915.m31976();
        this.f40891 = c12915.m31967();
        this.f40892 = c12915.m31972();
        c12915.m31983().m23172(R.string.MT_Protector, this);
    }
}
