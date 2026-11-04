package l;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.֨ᩳ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 19Q0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1353 extends AbstractC9843 {
    @Override // l.AbstractC9843
    /* JADX INFO: renamed from: ۤ */
    public final void mo2016(C12915 c12915) {
        c12915.m31970("payload");
        C5304 c5304 = new C5304(c12915.m31979());
        c5304.m15924();
        List listM31982 = c12915.m31982();
        if (listM31982.size() == 1) {
            C3327 c3327 = (C3327) listM31982.get(0);
            c5304.m15916(c3327.getName(), (ViewOnLongClickListenerC9293) null);
            c5304.m15922(c3327.getSize()).m49281(8);
            c5304.m15909(c3327.m10961());
            c5304.m15926();
            c5304.m15920();
            C10060.m26010(c5304.m15927(), c12915.m31983(), c3327);
            return;
        }
        c5304.m15917(listM31982);
        Iterator it = listM31982.iterator();
        long size = 0;
        long jM10961 = 0;
        while (it.hasNext()) {
            C3327 c3328 = (C3327) ((InterfaceC2386) it.next());
            size += c3328.getSize();
            jM10961 += c3328.m10961();
        }
        c5304.m15922(size).m49281(8);
        c5304.m15909(jM10961);
        c5304.m15920();
    }
}
