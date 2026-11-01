package l;

import android.os.Bundle;
import java.util.HashMap;

/* JADX INFO: renamed from: l.᩺ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: YB7L */
/* JADX INFO: loaded from: classes.dex */
public class C22691 implements InterfaceC5657 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC15636 f73909;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC7874 f73910;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f73911;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC3639 f73912;

    public C22691(AbstractC7874 abstractC7874, String str, InterfaceC3639 interfaceC3639, AbstractC15636 abstractC15636) {
        this.f73910 = abstractC7874;
        this.f73911 = str;
        this.f73912 = interfaceC3639;
        this.f73909 = abstractC15636;
    }

    @Override // l.InterfaceC5657
    /* JADX INFO: renamed from: ۙ */
    public final void mo4164(InterfaceC1423 interfaceC1423, EnumC1651 enumC1651) {
        AbstractC7874 abstractC7874 = this.f73910;
        Bundle bundle = abstractC7874.f25909;
        HashMap map = abstractC7874.f25905;
        HashMap map2 = abstractC7874.f25906;
        boolean zEquals = EnumC1651.ON_START.equals(enumC1651);
        String str = this.f73911;
        if (zEquals) {
            AbstractC15636 abstractC15636 = this.f73909;
            InterfaceC3639 interfaceC3639 = this.f73912;
            map.put(str, new C17751(abstractC15636, interfaceC3639));
            if (map2.containsKey(str)) {
                Object obj = map2.get(str);
                map2.remove(str);
                interfaceC3639.mo10739(obj);
            }
            C12813 c12813 = (C12813) bundle.getParcelable(str);
            if (c12813 != null) {
                bundle.remove(str);
                interfaceC3639.mo10739(abstractC15636.mo1152(c12813.m31805(), c12813.m31806()));
                return;
            }
            return;
        }
        if (EnumC1651.ON_STOP.equals(enumC1651)) {
            map.remove(str);
        } else if (EnumC1651.ON_DESTROY.equals(enumC1651)) {
            abstractC7874.m20785(str);
        }
    }
}
