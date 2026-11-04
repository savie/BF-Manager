package l;

import java.util.ArrayList;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.᩻ܶۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAO9 */
/* JADX INFO: loaded from: classes.dex */
public final class C25129 extends ArrayList {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f81255 = 0;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static Pattern f81256 = Pattern.compile("\\s*");

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C25129 m55999(C19205 c19205, boolean z) {
        C2008 c2008;
        C25129 c25129 = new C25129(1);
        Stack stack = new Stack();
        Matcher matcher = f81256.matcher("");
        while (true) {
            int iM44501 = c19205.m44501();
            if (iM44501 == 1) {
                return c25129;
            }
            if (iM44501 == 2) {
                if (stack.isEmpty()) {
                    c2008 = new C2008();
                    c25129.add(c2008);
                } else {
                    c2008 = new C2008();
                    ((C2008) stack.peek()).f6680.add(c2008);
                }
                stack.push(c2008);
                c2008.f74369 = c19205.m44497();
                c2008.f74368 = c19205.m44506();
                c2008.f6679 = c19205.m44499();
                c2008.f74367 = c19205.m44489();
                c2008.f74366 = c19205.m44494();
                int iM44490 = c19205.m44490();
                ArrayList arrayList = c2008.f6681;
                arrayList.ensureCapacity(iM44490);
                for (int i = 0; i < c19205.m44490(); i++) {
                    if (!"xmlns".equals(c19205.m44507(i))) {
                        C5737 c5737 = new C5737();
                        c5737.f19745 = c19205.m44491(i);
                        c5737.f19750 = c19205.m44503(i);
                        C9508 c9508M44505 = c19205.m44505(i);
                        c5737.f19753 = c9508M44505.m24888();
                        c5737.f19752 = c9508M44505.m24885();
                        c5737.f19751 = c9508M44505.m24891();
                        c5737.f19747 = c9508M44505.m24893();
                        C9508 c9508M44500 = c19205.m44500(i);
                        c5737.f19744 = c9508M44500.m24888();
                        c5737.f19749 = c9508M44500.m24885();
                        c5737.f19748 = c9508M44500.m24891();
                        c5737.f19746 = c9508M44500.m24893();
                        arrayList.add(c5737);
                    }
                }
            } else if (iM44501 == 3) {
                ((C2008) stack.pop()).f74368 = c19205.m44506();
            } else if (iM44501 == 4 && (!z || !matcher.reset(c19205.m44508()).matches())) {
                C16923 c16923 = new C16923();
                c16923.f55314 = c19205.m44508();
                c16923.f74367 = c19205.m44489();
                c16923.f74366 = c19205.m44494();
                c16923.f74369 = c19205.m44497();
                c16923.f74368 = c19205.m44506();
                if (stack.isEmpty()) {
                    throw new C10254("Unexpected text: " + c16923.f55314.toString().trim(), c19205);
                }
                ((C2008) stack.peek()).f6680.add(c16923);
            }
        }
    }
}
