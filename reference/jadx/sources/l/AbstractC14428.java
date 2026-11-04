package l;

import com.google.android.material.motion.MotionUtils;
import java.io.IOException;

/* JADX INFO: renamed from: l.ܰۜܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z2OJ */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC14428 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC21142 f45435;

    public AbstractC14428(AbstractC21142 abstractC21142) {
        if (abstractC21142 == null) {
            throw new IllegalArgumentException("Expecting non-null transport");
        }
        this.f45435 = abstractC21142;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11445 m34852(C5480 c5480, EnumC21888... enumC21888Arr) throws IOException {
        C11445 c11445M48244 = this.f45435.m48244(c5480);
        int iM33542 = c11445M48244.m33542();
        for (EnumC21888 enumC21888 : enumC21888Arr) {
            if (enumC21888 != null && enumC21888.m49583(iM33542)) {
                return c11445M48244;
            }
        }
        EnumC21888 enumC21888M49582 = EnumC21888.m49582(iM33542);
        C21185 c21185 = new C21185(String.format("%s returned error code: 0x%08X %s", "NetrShareEnum[1]", Integer.valueOf(iM33542), enumC21888M49582 == null ? "" : MotionUtils.EASING_TYPE_FORMAT_START + enumC21888M49582 + MotionUtils.EASING_TYPE_FORMAT_END));
        EnumC21888.m49582(iM33542);
        throw c21185;
    }
}
