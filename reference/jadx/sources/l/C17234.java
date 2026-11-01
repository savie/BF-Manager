package l;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ܿۡ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 19Q0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17234 extends AbstractC4674 {
    @Override // l.AbstractC4674
    /* JADX INFO: renamed from: ۨ */
    public final void mo1962(C21422 c21422) {
        c21422.m47963("payload");
        C22149 c22149 = new C22149(c21422.m47980());
        c22149.m49138();
        List listM47979 = c21422.m47979();
        if (listM47979.size() == 1) {
            C8103 c8103 = (C8103) listM47979.get(0);
            c22149.m49151(c8103.getName(), (ViewOnLongClickListenerC10944) null);
            c22149.m49157(c8103.getSize()).m9599(8);
            c22149.m49144(c8103.m21322());
            c22149.m49155();
            c22149.m49159();
            C23519.m51792(c22149.m49160(), c21422.m47965(), c8103);
            return;
        }
        c22149.m49152(listM47979);
        Iterator it = listM47979.iterator();
        long size = 0;
        long jM21322 = 0;
        while (it.hasNext()) {
            C8103 c8104 = (C8103) ((InterfaceC2557) it.next());
            size += c8104.getSize();
            jM21322 += c8104.m21322();
        }
        c22149.m49157(size).m9599(8);
        c22149.m49144(jM21322);
        c22149.m49159();
    }
}
