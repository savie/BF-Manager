package l;

import android.text.TextUtils;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۛ۠֨, reason: contains not printable characters */
/* JADX INFO: compiled from: R9JP */
/* JADX INFO: loaded from: classes3.dex */
public final class C5924 extends AbstractC12684 {
    @Override // l.AbstractC12684
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo16189(Object obj) throws Exception {
        C23564 c23564 = (C23564) obj;
        C6254 c6254M51964 = c23564.m51964();
        C19946 c19946 = new C19946(C4843.m13438(false, c23564.m51962(), c23564.m51963()));
        try {
            String str = c6254M51964.f21214;
            String str2 = c6254M51964.f21215;
            C1163 c1163M45243 = c19946.m45243(c6254M51964.f21212, str);
            if ((c23564.m51962() == EnumC3101.SMB2_UNSIGNED) && c1163M45243.m4281().m32543()) {
                throw new IOException("SMB server requires signing");
            }
            C12185 c12185M13445 = C4843.m13445(c6254M51964);
            String str3 = c6254M51964.f21210;
            if ((!TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str3)) && str2.equals("guest")) {
                TextUtils.isEmpty(str3);
            }
            return new C10864(c23564, c19946, c1163M45243, c1163M45243.m4285(c12185M13445));
        } catch (Exception e) {
            C19431.m44468(c19946);
            throw e;
        }
    }

    @Override // l.AbstractC12684
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo16190(Object obj, InterfaceC11273 interfaceC11273) {
        C19431.m44468(((C10864) interfaceC11273.mo28254()).f36942);
    }

    @Override // l.AbstractC12684
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC11273 mo16191(Object obj) {
        return new C1690((C10864) obj);
    }

    @Override // l.AbstractC12684
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean mo16192(Object obj, InterfaceC11273 interfaceC11273) {
        if (!((C10864) interfaceC11273.mo28254()).f36944.m4289()) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - interfaceC11273.mo28258().toEpochMilli();
        if (jCurrentTimeMillis < 0 || jCurrentTimeMillis > 2000) {
            try {
                C1690 c1690 = (C1690) interfaceC11273;
                if (c1690.m5611()) {
                    c1690.m5612();
                }
            } catch (Exception unused) {
                return false;
            }
        }
        return true;
    }
}
