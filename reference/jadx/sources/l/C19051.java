package l;

import com.alipay.sdk.m.y.l;
import com.google.android.material.motion.MotionUtils;
import java.io.StringReader;

/* JADX INFO: renamed from: l.ᩳۨۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: L5P8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C19051 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C11965 m44162(String str) throws C4511 {
        int iIndexOf = str.indexOf("->");
        int i = iIndexOf + 2;
        int iIndexOf2 = str.indexOf(MotionUtils.EASING_TYPE_FORMAT_START, i);
        if (iIndexOf == -1 || iIndexOf2 == -1) {
            return null;
        }
        String strSubstring = str.substring(0, iIndexOf);
        if (!strSubstring.startsWith("L") || !strSubstring.endsWith(l.b)) {
            return null;
        }
        String strSubstring2 = str.substring(i, iIndexOf2);
        C9354 c9354 = new C9354(new StringReader(str.substring(iIndexOf2)), 15);
        c9354.m24663("Input");
        C6003 c6003 = new C6003(c9354);
        C10100 c10100 = new C10100(c6003);
        C14335 c14335M11370 = c10100.m11370();
        if (c10100.m52074() > 0 || c9354.m24668() > 0) {
            C4511 c4511M26059 = c10100.m26059();
            if (c4511M26059 == null) {
                c4511M26059 = c9354.m24661();
            }
            if (c4511M26059 == null) {
                return null;
            }
            throw c4511M26059;
        }
        C3019 c3019 = new C3019(c14335M11370.f45215);
        c3019.m9828(c6003);
        C1152 c1152 = new C1152(c3019);
        C2271 c2271M8904 = c1152.m8904();
        if (c1152.m52074() > 0) {
            C4511 c4511M4253 = c1152.m4253();
            if (c4511M4253 == null) {
                return null;
            }
            throw c4511M4253;
        }
        return new C11965(strSubstring, strSubstring2, c2271M8904.mo7392(), c2271M8904.mo7393());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C7447 m44161(String str, C8850 c8850, C7118 c7118) {
        C9354 c9354 = new C9354(new StringReader(str), c7118.f23465);
        c9354.m24663((String) null);
        C6003 c6003 = new C6003(c9354);
        C10100 c10100 = new C10100(c6003);
        c10100.m11371(c7118.f23464);
        c10100.m11293(c7118.f23465);
        C19862 c19862M11363 = c10100.m11363();
        if (c10100.m52074() > 0 || c9354.m24668() > 0) {
            C4511 c4511M26059 = c10100.m26059();
            if (c4511M26059 == null) {
                c4511M26059 = c9354.m24661();
            }
            if (c4511M26059 != null) {
                throw c4511M26059;
            }
        } else {
            C3019 c3019 = new C3019(c19862M11363.f63893);
            c3019.m9828(c6003);
            C1152 c1152 = new C1152(c3019);
            c1152.m8921(c7118.f23465);
            c1152.m8923(c8850);
            C7447 c7447M8971 = c1152.m8971();
            if (c1152.m52074() <= 0) {
                return c7447M8971;
            }
            C4511 c4511M4253 = c1152.m4253();
            if (c4511M4253 != null) {
                throw c4511M4253;
            }
        }
        return null;
    }
}
