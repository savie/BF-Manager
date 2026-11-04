package l;

import bin.mt.plus.R;
import com.alipay.sdk.app.OpenAuthTask;

/* JADX INFO: renamed from: l.ۚ۟ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D1Q7 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C5501 implements InterfaceC5392, InterfaceC9600, InterfaceC13083 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f19133;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f19134;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f19135;

    public /* synthetic */ C5501(Object obj, Object obj2, Object obj3) {
        this.f19133 = obj;
        this.f19135 = obj2;
        this.f19134 = obj3;
    }

    @Override // l.InterfaceC13083
    /* JADX INFO: renamed from: ۙ */
    public C1238 mo2836(int i) {
        return C17053.m40179((C17053) this.f19133, (C10671) this.f19135, (C4156) this.f19134, i);
    }

    @Override // l.InterfaceC9600
    /* JADX INFO: renamed from: ۙ */
    public void mo1839(C14406 c14406) {
        String name;
        String name2;
        C14406 c14407 = (C14406) this.f19133;
        C12915 c12915 = (C12915) this.f19135;
        C8614 c8614 = (C8614) this.f19134;
        c14406.m34838();
        AbstractC22044 abstractC22044M34845 = c14407.m34845();
        AbstractC22044 abstractC22044M34846 = c14406.m34845();
        boolean zM23195 = c12915.m31983().m23195();
        if (abstractC22044M34845.getName().equals(abstractC22044M34846.getName())) {
            int i = R.string.MT_Protector;
            name = C21576.m49059(zM23195 ? R.string.MT_Protector : R.string.MT_Protector, abstractC22044M34845.getName());
            if (!zM23195) {
                i = R.string.MT_Protector;
            }
            name2 = C21576.m49059(i, abstractC22044M34846.getName());
        } else {
            name = abstractC22044M34845.getName();
            name2 = abstractC22044M34846.getName();
        }
        C9170 c9170 = new C9170(c14407.m34845(), c14406.m34845(), name, name2, c12915.m31987(), c8614.m23213());
        if (!zM23195) {
            c9170.m24304();
        }
        C16879.m39842(c9170, c12915.m31983());
    }

    @Override // l.InterfaceC5392
    /* JADX INFO: renamed from: ۙ */
    public void mo1772(AbstractC22044 abstractC22044) {
        InterfaceC2386 interfaceC2386 = (InterfaceC2386) this.f19133;
        C20312 c20312 = (C20312) this.f19135;
        InterfaceC16648 interfaceC16648 = (InterfaceC16648) this.f19134;
        C20065.m46116(interfaceC2386, OpenAuthTask.Duplex);
        c20312.m46658(interfaceC16648, abstractC22044, false);
    }
}
