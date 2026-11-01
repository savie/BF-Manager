package l;

import bin.mt.plus.R;
import com.alipay.sdk.m.m.b;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

/* JADX INFO: renamed from: l.֫ۚ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 7AHA */
/* JADX INFO: loaded from: classes2.dex */
public final class C1607 extends AbstractC4674 implements Function {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public List f6490;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f6491;

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public /* synthetic */ Function mo33696andThen(Function function) {
        return C4277.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return C4277.$default$compose(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        boolean zStartsWith;
        C11545 c11545 = (C11545) obj;
        String strM28798 = c11545.m28798();
        if (strM28798.equals(this.f6491)) {
            C15829.m37611(R.string.MT_Protector);
            return Boolean.FALSE;
        }
        boolean zMo24615 = c11545.m28817().mo13029().mo24615();
        Set setM39769 = C16982.m39769(zMo24615);
        for (InterfaceC2557 interfaceC2557 : this.f6490) {
            if (interfaceC2557.isDirectory()) {
                String str = interfaceC2557.getPath() + "/";
                if (zMo24615) {
                    zStartsWith = C6851.m18466(str, strM28798);
                } else {
                    zStartsWith = strM28798.startsWith(str);
                }
                if (zStartsWith) {
                    c11545.m28824().m31000(C16737.m39264(R.string.MT_Protector, interfaceC2557.getName()), false);
                    return Boolean.FALSE;
                }
            }
            setM39769.add(interfaceC2557.getName());
        }
        for (InterfaceC2557 interfaceC2558 : c11545.m28795()) {
            if (setM39769.contains(interfaceC2558.getName())) {
                C15829.m37613((CharSequence) (C16737.m39288(R.string.MT_Protector) + ": " + interfaceC2558.getName()));
                return Boolean.FALSE;
            }
        }
        int i = C20725.f67443;
        C10142 c10142 = new C10142(C23481.class);
        c10142.m25772(this.f6490);
        c10142.m25774(c11545);
        c10142.m25773(c11545.m28817());
        c10142.m25768("targetPath", strM28798);
        c10142.m25763();
        return Boolean.TRUE;
    }

    @Override // l.AbstractC4674
    /* JADX INFO: renamed from: ۖ */
    public final boolean mo1960(C21422 c21422) {
        return c21422.m47974(b.k);
    }

    @Override // l.AbstractC4674
    /* JADX INFO: renamed from: ۨ */
    public final void mo1962(C21422 c21422) {
        this.f6490 = c21422.m47979();
        this.f6491 = c21422.m47959();
        c21422.m47965().m28773(R.string.MT_Protector, this);
    }
}
