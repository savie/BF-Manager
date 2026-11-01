package l;

import com.google.android.material.motion.MotionUtils;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۘۤᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z2OJ */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3882 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC6705 f14512;

    public AbstractC3882(AbstractC6705 abstractC6705) {
        if (abstractC6705 == null) {
            throw new IllegalArgumentException("Expecting non-null transport");
        }
        this.f14512 = abstractC6705;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14427 m11257(C10899 c10899, EnumC20071... enumC20071Arr) throws IOException {
        C14427 c14427M18121 = this.f14512.m18121(c10899);
        int iM46763 = c14427M18121.m46763();
        for (EnumC20071 enumC20071 : enumC20071Arr) {
            if (enumC20071 != null && enumC20071.m45438(iM46763)) {
                return c14427M18121;
            }
        }
        EnumC20071 enumC20071M45437 = EnumC20071.m45437(iM46763);
        C6664 c6664 = new C6664(String.format("%s returned error code: 0x%08X %s", "NetrShareEnum[1]", Integer.valueOf(iM46763), enumC20071M45437 == null ? "" : MotionUtils.EASING_TYPE_FORMAT_START + enumC20071M45437 + MotionUtils.EASING_TYPE_FORMAT_END));
        EnumC20071.m45437(iM46763);
        throw c6664;
    }
}
