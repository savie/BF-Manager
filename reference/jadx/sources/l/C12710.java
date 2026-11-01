package l;

import bin.mt.plus.R;
import com.alipay.sdk.m.w.a;
import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.۫᩺֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 9AFA */
/* JADX INFO: loaded from: classes4.dex */
public final class C12710 extends AbstractC12684 {
    @Override // l.AbstractC12684
    /* JADX INFO: renamed from: ۙ */
    public final Object mo16189(Object obj) throws IOException {
        InterfaceC17419 c6130;
        C12481 c12481 = (C12481) obj;
        boolean z = true;
        if (c12481.f41605 == 1) {
            C11070 c11070 = new C11070(!c12481.f41611, c12481);
            c11070.m27915(c12481.f41610);
            c6130 = c11070;
        } else {
            c6130 = new C6130(c12481);
        }
        String str = c12481.f41606;
        if (!str.equalsIgnoreCase(a.D) && !str.equalsIgnoreCase("UTF8")) {
            z = false;
        }
        c6130.m40608(str);
        Charset.forName(str);
        try {
            c6130.m40598(c12481.f41603, c12481.f41609);
            if (c12481.f41607) {
                c6130.m40597();
                if (c6130 instanceof C11070) {
                    C11070 c11071 = (C11070) c6130;
                    c11071.m24609();
                    c11071.m24605();
                }
            }
            try {
                String str2 = c12481.f41608;
                String str3 = c12481.f41612;
                if (str2.equals("anonymous") && str3.isEmpty()) {
                    str3 = "anonymous@";
                }
                if (!c6130.m40610(str2, str3)) {
                    StringBuilder sbM8976 = C3012.m8976(C16737.m39288(R.string.MT_Protector), ": ");
                    sbM8976.append(c6130.m40614());
                    throw new C8142(sbM8976.toString());
                }
                if (z) {
                    c6130.mo17115("OPTS", "UTF8 ON");
                }
                c6130.mo17117();
                if (c6130.m40613()) {
                    return c6130;
                }
                c6130.mo17113();
                throw null;
            } catch (Exception e) {
                throw new IOException(C8479.m22142(e, C3012.m8976(C16737.m39288(R.string.MT_Protector), ": ")), e);
            }
        } catch (Exception e2) {
            throw new IOException(C8479.m22142(e2, C3012.m8976(C16737.m39288(R.string.MT_Protector), ": ")), e2);
        }
    }

    @Override // l.AbstractC12684
    /* JADX INFO: renamed from: ۙ */
    public final void mo16190(Object obj, InterfaceC11273 interfaceC11273) {
        try {
            InterfaceC17419 interfaceC17419 = (InterfaceC17419) interfaceC11273.mo28254();
            if (interfaceC17419.m40611()) {
                interfaceC17419.m40616();
            }
        } catch (Exception unused) {
        }
    }

    @Override // l.AbstractC12684
    /* JADX INFO: renamed from: ܰ */
    public final InterfaceC11273 mo16191(Object obj) {
        return new C11874((InterfaceC17419) obj);
    }

    @Override // l.AbstractC12684
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo16192(Object obj, InterfaceC11273 interfaceC11273) {
        InterfaceC17419 interfaceC17419 = (InterfaceC17419) interfaceC11273.mo28254();
        if (!interfaceC17419.m40612()) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - interfaceC11273.mo28258().toEpochMilli();
        if (jCurrentTimeMillis >= 0 && jCurrentTimeMillis <= 2000) {
            return true;
        }
        try {
            return interfaceC17419.m40605();
        } catch (IOException unused) {
            return false;
        }
    }
}
