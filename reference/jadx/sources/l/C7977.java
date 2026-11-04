package l;

import bin.mt.plus.R;
import com.alipay.sdk.m.m.b;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

/* JADX INFO: renamed from: l.۟ܶ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 7AHA */
/* JADX INFO: loaded from: classes4.dex */
public final class C7977 extends AbstractC9843 implements Function {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public List f26513;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public String f26514;

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
        boolean zStartsWith;
        C8614 c8614 = (C8614) obj;
        String strM23166 = c8614.m23166();
        if (strM23166.equals(this.f26514)) {
            C22673.m51152(R.string.MT_Protector);
            return Boolean.FALSE;
        }
        boolean zMo20839 = c8614.m23213().mo10174().mo20839();
        Set setM2200 = C0391.m2200(zMo20839);
        for (InterfaceC2386 interfaceC2386 : this.f26513) {
            if (interfaceC2386.isDirectory()) {
                String str = interfaceC2386.getPath() + "/";
                if (zMo20839) {
                    int i = C24276.f78588;
                    zStartsWith = AbstractC21292.f67895.m48533(str, strM23166);
                } else {
                    zStartsWith = strM23166.startsWith(str);
                }
                if (zStartsWith) {
                    c8614.m23233().m40400(C21576.m49059(R.string.MT_Protector, interfaceC2386.getName()), false);
                    return Boolean.FALSE;
                }
            }
            setM2200.add(interfaceC2386.getName());
        }
        for (InterfaceC2386 interfaceC2387 : c8614.m23202()) {
            if (setM2200.contains(interfaceC2387.getName())) {
                C22673.m51154((CharSequence) (C21576.m49088(R.string.MT_Protector) + ": " + interfaceC2387.getName()));
                return Boolean.FALSE;
            }
        }
        int i2 = C13678.f43415;
        C8458 c8458 = new C8458(C18418.class);
        c8458.m22723(this.f26513);
        c8458.m22725(c8614);
        c8458.m22724(c8614.m23213());
        c8458.m22719("targetPath", strM23166);
        c8458.m22714();
        return Boolean.TRUE;
    }

    @Override // l.AbstractC9843
    /* JADX INFO: renamed from: ᩸ */
    public final boolean mo2481(C12915 c12915) {
        return c12915.m31986(b.k);
    }

    @Override // l.AbstractC9843
    /* JADX INFO: renamed from: ۤ */
    public final void mo2016(C12915 c12915) {
        this.f26513 = c12915.m31982();
        this.f26514 = c12915.m31978();
        c12915.m31983().m23172(R.string.MT_Protector, this);
    }
}
