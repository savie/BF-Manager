package l;

import java.util.ArrayList;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ۡᩳۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAO9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9046 extends ArrayList {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f30860 = 0;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static Pattern f30861 = Pattern.compile("\\s*");

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C9046 m23372(C3504 c3504, boolean z) {
        C8340 c8340;
        C9046 c9046 = new C9046(1);
        Stack stack = new Stack();
        Matcher matcher = f30861.matcher("");
        while (true) {
            int iM10327 = c3504.m10327();
            if (iM10327 == 1) {
                return c9046;
            }
            if (iM10327 == 2) {
                if (stack.isEmpty()) {
                    c8340 = new C8340();
                    c9046.add(c8340);
                } else {
                    c8340 = new C8340();
                    ((C8340) stack.peek()).f28879.add(c8340);
                }
                stack.push(c8340);
                c8340.f75168 = c3504.m10320();
                c8340.f75171 = c3504.m10311();
                c8340.f28877 = c3504.m10328();
                c8340.f75170 = c3504.m10313();
                c8340.f75169 = c3504.m10323();
                int iM10314 = c3504.m10314();
                ArrayList arrayList = c8340.f28878;
                arrayList.ensureCapacity(iM10314);
                for (int i = 0; i < c3504.m10314(); i++) {
                    if (!"xmlns".equals(c3504.m10312(i))) {
                        C18923 c18923 = new C18923();
                        c18923.f61220 = c3504.m10315(i);
                        c18923.f61226 = c3504.m10319(i);
                        C11868 c11868M10325 = c3504.m10325(i);
                        c18923.f61218 = c11868M10325.m29578();
                        c18923.f61225 = c11868M10325.m29580();
                        c18923.f61221 = c11868M10325.m29583();
                        c18923.f61223 = c11868M10325.m29585();
                        C11868 c11868M10329 = c3504.m10329(i);
                        c18923.f61219 = c11868M10329.m29578();
                        c18923.f61217 = c11868M10329.m29580();
                        c18923.f61222 = c11868M10329.m29583();
                        c18923.f61224 = c11868M10329.m29585();
                        arrayList.add(c18923);
                    }
                }
            } else if (iM10327 == 3) {
                ((C8340) stack.pop()).f75171 = c3504.m10311();
            } else if (iM10327 == 4 && (!z || !matcher.reset(c3504.m10326()).matches())) {
                C10457 c10457 = new C10457();
                c10457.f35694 = c3504.m10326();
                c10457.f75170 = c3504.m10313();
                c10457.f75169 = c3504.m10323();
                c10457.f75168 = c3504.m10320();
                c10457.f75171 = c3504.m10311();
                if (stack.isEmpty()) {
                    throw new C4811("Unexpected text: " + c10457.f35694.toString().trim(), c3504);
                }
                ((C8340) stack.peek()).f28879.add(c10457);
            }
        }
    }
}
