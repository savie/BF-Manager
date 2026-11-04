package l;

import android.os.Bundle;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ܽ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: YB7L */
/* JADX INFO: loaded from: classes5.dex */
public final class C17860 implements InterfaceC5252 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f58552;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC12639 f58553;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC18606 f58554;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC25320 f58555;

    public C17860(AbstractC12639 abstractC12639, String str, InterfaceC25320 interfaceC25320, AbstractC18606 abstractC18606) {
        this.f58553 = abstractC12639;
        this.f58552 = str;
        this.f58555 = interfaceC25320;
        this.f58554 = abstractC18606;
    }

    @Override // l.InterfaceC5252
    /* JADX INFO: renamed from: ۙ */
    public final void mo2183(InterfaceC11217 interfaceC11217, EnumC9330 enumC9330) {
        AbstractC12639 abstractC12639 = this.f58553;
        Bundle bundle = abstractC12639.f40549;
        HashMap map = abstractC12639.f40546;
        HashMap map2 = abstractC12639.f40550;
        boolean zEquals = EnumC9330.ON_START.equals(enumC9330);
        String str = this.f58552;
        if (zEquals) {
            AbstractC18606 abstractC18606 = this.f58554;
            InterfaceC25320 interfaceC25320 = this.f58555;
            map.put(str, new C3690(abstractC18606, interfaceC25320));
            if (map2.containsKey(str)) {
                Object obj = map2.get(str);
                map2.remove(str);
                interfaceC25320.mo16160(obj);
            }
            C11893 c11893 = (C11893) bundle.getParcelable(str);
            if (c11893 != null) {
                bundle.remove(str);
                interfaceC25320.mo16160(abstractC18606.mo3029(c11893.m29770(), c11893.m29771()));
                return;
            }
            return;
        }
        if (EnumC9330.ON_STOP.equals(enumC9330)) {
            map.remove(str);
        } else if (EnumC9330.ON_DESTROY.equals(enumC9330)) {
            abstractC12639.m31424(str);
        }
    }
}
