package l;

import com.alipay.sdk.m.p.a;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۢ۫ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: E4CH */
/* JADX INFO: loaded from: classes4.dex */
public final class C10125 implements InterfaceC17649 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC8831 f32408;

    public C10125(InterfaceC8831 interfaceC8831) {
        this.f32408 = interfaceC8831;
    }

    @Override // l.InterfaceC17649
    /* JADX INFO: renamed from: ۙ */
    public final C9444 mo19233(C4688 c4688) {
        boolean z;
        C7954 c7954M14558 = c4688.m14558();
        C0496 c0496M21650 = c7954M14558.m21650();
        AbstractC10190 abstractC10190M21647 = c7954M14558.m21647();
        if (abstractC10190M21647 != null) {
            C16157 c16157Mo26312 = abstractC10190M21647.mo26312();
            if (c16157Mo26312 != null) {
                c0496M21650.m2398("Content-Type", c16157Mo26312.toString());
            }
            long jMo26310 = abstractC10190M21647.mo26310();
            if (jMo26310 != -1) {
                c0496M21650.m2398("Content-Length", Long.toString(jMo26310));
                c0496M21650.m2390("Transfer-Encoding");
            } else {
                c0496M21650.m2398("Transfer-Encoding", "chunked");
                c0496M21650.m2390("Content-Length");
            }
        }
        if (c7954M14558.m21646("Host") == null) {
            c0496M21650.m2398("Host", C19822.m45594(c7954M14558.m21649(), false));
        }
        if (c7954M14558.m21646("Connection") == null) {
            c0496M21650.m2398("Connection", "Keep-Alive");
        }
        if (c7954M14558.m21646("Accept-Encoding") == null && c7954M14558.m21646("Range") == null) {
            c0496M21650.m2398("Accept-Encoding", "gzip");
            z = true;
        } else {
            z = false;
        }
        InterfaceC8831 interfaceC8831 = this.f32408;
        interfaceC8831.mo9461();
        List list = Collections.EMPTY_LIST;
        if (!list.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (i > 0) {
                    sb.append("; ");
                }
                C9576 c9576 = (C9576) list.get(i);
                sb.append(c9576.m25009());
                sb.append(a.h);
                sb.append(c9576.m25010());
            }
            c0496M21650.m2398("Cookie", sb.toString());
        }
        if (c7954M14558.m21646("User-Agent") == null) {
            c0496M21650.m2398("User-Agent", "okhttp/3.12.13");
        }
        C9444 c9444M14554 = c4688.m14554(c0496M21650.m2389());
        C16903 c16903M21649 = c7954M14558.m21649();
        C11682 c11682M24822 = c9444M14554.m24822();
        int i2 = C13854.f43953;
        if (interfaceC8831 != InterfaceC8831.f28889) {
            C9576.m25008(c16903M21649, c11682M24822).isEmpty();
        }
        C1242 c1242M24824 = c9444M14554.m24824();
        c1242M24824.m4485(c7954M14558);
        if (z && "gzip".equalsIgnoreCase(c9444M14554.m24817("Content-Encoding")) && C13854.m33802(c9444M14554)) {
            C3370 c3370 = new C3370(c9444M14554.m24818().mo9080());
            C1988 c1988M29362 = c9444M14554.m24822().m29362();
            c1988M29362.m6812("Content-Encoding");
            c1988M29362.m6812("Content-Length");
            c1242M24824.m4488(c1988M29362.m6809());
            c1242M24824.m4486(new C21842(c9444M14554.m24817("Content-Type"), -1L, C14556.m35108(c3370)));
        }
        return c1242M24824.m4479();
    }
}
