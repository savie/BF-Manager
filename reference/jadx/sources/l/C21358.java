package l;

import com.alipay.sdk.m.p.a;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.᩸ۙ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: E4CH */
/* JADX INFO: loaded from: classes5.dex */
public final class C21358 implements InterfaceC1738 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC8089 f69481;

    public C21358(InterfaceC8089 interfaceC8089) {
        this.f69481 = interfaceC8089;
    }

    @Override // l.InterfaceC1738
    /* JADX INFO: renamed from: ۙ */
    public final C18485 mo5785(C7247 c7247) {
        boolean z;
        C22719 c22719M19366 = c7247.m19366();
        C6490 c6490M50362 = c22719M19366.m50362();
        AbstractC21307 abstractC21307M50358 = c22719M19366.m50358();
        if (abstractC21307M50358 != null) {
            C9501 c9501Mo4377 = abstractC21307M50358.mo4377();
            if (c9501Mo4377 != null) {
                c6490M50362.m17687("Content-Type", c9501Mo4377.toString());
            }
            long jMo4375 = abstractC21307M50358.mo4375();
            if (jMo4375 != -1) {
                c6490M50362.m17687("Content-Length", Long.toString(jMo4375));
                c6490M50362.m17679("Transfer-Encoding");
            } else {
                c6490M50362.m17687("Transfer-Encoding", "chunked");
                c6490M50362.m17679("Content-Length");
            }
        }
        if (c22719M19366.m50357("Host") == null) {
            c6490M50362.m17687("Host", C0140.m1224(c22719M19366.m50355(), false));
        }
        if (c22719M19366.m50357("Connection") == null) {
            c6490M50362.m17687("Connection", "Keep-Alive");
        }
        if (c22719M19366.m50357("Accept-Encoding") == null && c22719M19366.m50357("Range") == null) {
            c6490M50362.m17687("Accept-Encoding", "gzip");
            z = true;
        } else {
            z = false;
        }
        InterfaceC8089 interfaceC8089 = this.f69481;
        interfaceC8089.mo21298();
        List list = Collections.EMPTY_LIST;
        if (!list.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (i > 0) {
                    sb.append("; ");
                }
                C17966 c17966 = (C17966) list.get(i);
                sb.append(c17966.m41797());
                sb.append(a.h);
                sb.append(c17966.m41798());
            }
            c6490M50362.m17687("Cookie", sb.toString());
        }
        if (c22719M19366.m50357("User-Agent") == null) {
            c6490M50362.m17687("User-Agent", "okhttp/3.12.13");
        }
        C18485 c18485M19370 = c7247.m19370(c6490M50362.m17678());
        C14440 c14440M50355 = c22719M19366.m50355();
        C10912 c10912M42857 = c18485M19370.m42857();
        int i2 = C10070.f34404;
        if (interfaceC8089 != InterfaceC8089.f28341) {
            C17966.m41796(c14440M50355, c10912M42857).isEmpty();
        }
        C17779 c17779M42864 = c18485M19370.m42864();
        c17779M42864.m41349(c22719M19366);
        if (z && "gzip".equalsIgnoreCase(c18485M19370.m42859("Content-Encoding")) && C10070.m25483(c18485M19370)) {
            C4362 c4362 = new C4362(c18485M19370.m42860().mo5211());
            C5972 c5972M27346 = c18485M19370.m42857().m27346();
            c5972M27346.m16268("Content-Encoding");
            c5972M27346.m16268("Content-Length");
            c17779M42864.m41344(c5972M27346.m16265());
            c17779M42864.m41347(new C20653(c18485M19370.m42859("Content-Type"), -1L, C0834.m3437(c4362)));
        }
        return c17779M42864.m41340();
    }
}
