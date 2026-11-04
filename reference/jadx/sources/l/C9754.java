package l;

import android.text.TextUtils;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۢ֡۫, reason: contains not printable characters */
/* JADX INFO: compiled from: R9JP */
/* JADX INFO: loaded from: classes4.dex */
public final class C9754 extends AbstractC11946 {
    @Override // l.AbstractC11946
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo25426(Object obj) throws Exception {
        C9009 c9009 = (C9009) obj;
        C9973 c9973M24046 = c9009.m24046();
        C19541 c19541 = new C19541(C4754.m14660(false, c9009.m24045(), c9009.m24044()));
        try {
            String str = c9973M24046.f32073;
            String str2 = c9973M24046.f32071;
            C21033 c21033M45076 = c19541.m45076(c9973M24046.f32072, str);
            if ((c9009.m24045() == EnumC13484.SMB2_UNSIGNED) && c21033M45076.m48067().m42059()) {
                throw new IOException("SMB server requires signing");
            }
            C1642 c1642M14667 = C4754.m14667(c9973M24046);
            String str3 = c9973M24046.f32074;
            if ((!TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str3)) && str2.equals("guest")) {
                TextUtils.isEmpty(str3);
            }
            return new C0806(c9009, c19541, c21033M45076, c21033M45076.m48059(c1642M14667));
        } catch (Exception e) {
            C20244.m46520(c19541);
            throw e;
        }
    }

    @Override // l.AbstractC11946
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo25427(Object obj, InterfaceC17913 interfaceC17913) {
        C20244.m46520(((C0806) interfaceC17913.mo14204()).f2859);
    }

    @Override // l.AbstractC11946
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC17913 mo25428(Object obj) {
        return new C8264((C0806) obj);
    }

    @Override // l.AbstractC11946
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean mo25429(Object obj, InterfaceC17913 interfaceC17913) {
        if (!((C0806) interfaceC17913.mo14204()).f2861.m48058()) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - interfaceC17913.mo14206().toEpochMilli();
        if (jCurrentTimeMillis < 0 || jCurrentTimeMillis > 2000) {
            try {
                C8264 c8264 = (C8264) interfaceC17913;
                if (c8264.m22281()) {
                    c8264.m22282();
                }
            } catch (Exception unused) {
                return false;
            }
        }
        return true;
    }
}
