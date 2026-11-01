package l;

import com.alipay.sdk.m.y.l;
import com.google.android.material.motion.MotionUtils;
import java.io.StringReader;

/* JADX INFO: renamed from: l.ۜܶۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: L5P8 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6843 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C17055 m18448(String str) throws C22085 {
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
        C21660 c21660 = new C21660(new StringReader(str.substring(iIndexOf2)), 15);
        c21660.m48384("Input");
        C17063 c17063 = new C17063(c21660);
        C23072 c23072 = new C23072(c17063);
        C5536 c5536M24852 = c23072.m24852();
        if (c23072.m45143() > 0 || c21660.m48387() > 0) {
            C22085 c22085M51049 = c23072.m51049();
            if (c22085M51049 == null) {
                c22085M51049 = c21660.m48382();
            }
            if (c22085M51049 == null) {
                return null;
            }
            throw c22085M51049;
        }
        C7974 c7974 = new C7974(c5536M24852.f18984);
        c7974.m21033(c17063);
        C15311 c15311 = new C15311(c7974);
        C12117 c12117M41707 = c15311.m41707();
        if (c15311.m45143() > 0) {
            C22085 c22085M36670 = c15311.m36670();
            if (c22085M36670 == null) {
                return null;
            }
            throw c22085M36670;
        }
        return new C17055(strSubstring, strSubstring2, c12117M41707.mo1995(), c12117M41707.mo1999());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C19213 m18449(String str, C8485 c8485, C8255 c8255) {
        C21660 c21660 = new C21660(new StringReader(str), c8255.f28708);
        c21660.m48384((String) null);
        C17063 c17063 = new C17063(c21660);
        C23072 c23072 = new C23072(c17063);
        c23072.m24820(c8255.f28707);
        c23072.m24776(c8255.f28708);
        C16120 c16120M24782 = c23072.m24782();
        if (c23072.m45143() > 0 || c21660.m48387() > 0) {
            C22085 c22085M51049 = c23072.m51049();
            if (c22085M51049 == null) {
                c22085M51049 = c21660.m48382();
            }
            if (c22085M51049 != null) {
                throw c22085M51049;
            }
        } else {
            C7974 c7974 = new C7974(c16120M24782.f52112);
            c7974.m21033(c17063);
            C15311 c15311 = new C15311(c7974);
            c15311.m41646(c8255.f28708);
            c15311.m41648(c8485);
            C19213 c19213M41734 = c15311.m41734();
            if (c15311.m45143() <= 0) {
                return c19213M41734;
            }
            C22085 c22085M36670 = c15311.m36670();
            if (c22085M36670 != null) {
                throw c22085M36670;
            }
        }
        return null;
    }
}
