package l;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: l.᩵ᩴۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20758 extends C12553 {
    public final /* synthetic */ C3604 d;

    public C20758(C3604 c3604) {
        this.d = c3604;
    }

    @Override // l.C12553
    public final String b(InterfaceC8912 interfaceC8912, InterfaceC16831 interfaceC16831, long j, EnumC10315 enumC10315, Locale locale) {
        return this.d.a(j, enumC10315);
    }

    @Override // l.C12553
    public final String c(InterfaceC16831 interfaceC16831, long j, EnumC10315 enumC10315, Locale locale) {
        return this.d.a(j, enumC10315);
    }

    @Override // l.C12553
    public final Iterator d(InterfaceC8912 interfaceC8912, InterfaceC16831 interfaceC16831, EnumC10315 enumC10315, Locale locale) {
        List list = (List) ((HashMap) this.d.b).get(enumC10315);
        if (list != null) {
            return list.iterator();
        }
        return null;
    }

    @Override // l.C12553
    public final Iterator e(InterfaceC16831 interfaceC16831, EnumC10315 enumC10315, Locale locale) {
        List list = (List) ((HashMap) this.d.b).get(enumC10315);
        if (list != null) {
            return list.iterator();
        }
        return null;
    }
}
