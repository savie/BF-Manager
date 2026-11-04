package l;

import com.google.android.material.motion.MotionUtils;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.ܳܳۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15404 implements InterfaceC0621 {
    public final InterfaceC16831 a;
    public final EnumC10315 b;
    public final C12553 c;
    public volatile C8824 d;

    public C15404(InterfaceC16831 interfaceC16831, EnumC10315 enumC10315, C12553 c12553) {
        this.a = interfaceC16831;
        this.b = enumC10315;
        this.c = c12553;
    }

    @Override // l.InterfaceC0621
    public final boolean i(C16150 c16150, StringBuilder sb) {
        String strC;
        Long lA = c16150.a(this.a);
        C23742 c23742 = c16150.b;
        if (lA == null) {
            return false;
        }
        InterfaceC8912 interfaceC8912 = (InterfaceC8912) c16150.a.P(AbstractC17577.b);
        if (interfaceC8912 == null || interfaceC8912 == C20012.c) {
            strC = this.c.c(this.a, lA.longValue(), this.b, c23742.b);
        } else {
            strC = this.c.b(interfaceC8912, this.a, lA.longValue(), this.b, c23742.b);
        }
        if (strC != null) {
            sb.append(strC);
            return true;
        }
        if (this.d == null) {
            this.d = new C8824(this.a, 1, 19, EnumC8079.NORMAL);
        }
        return this.d.i(c16150, sb);
    }

    @Override // l.InterfaceC0621
    public final int j(C25102 c25102, CharSequence charSequence, int i) {
        Iterator itE;
        C12553 c12553 = this.c;
        InterfaceC16831 interfaceC16831 = this.a;
        int length = charSequence.length();
        if (i >= 0 && i <= length) {
            boolean z = c25102.c;
            C23742 c23742 = c25102.a;
            EnumC10315 enumC10315 = z ? this.b : null;
            InterfaceC8912 interfaceC8912 = c25102.c().c;
            if (interfaceC8912 == null && (interfaceC8912 = c25102.a.e) == null) {
                interfaceC8912 = C20012.c;
            }
            InterfaceC8912 interfaceC8913 = interfaceC8912;
            if (interfaceC8913 == null || interfaceC8913 == C20012.c) {
                itE = c12553.e(interfaceC16831, enumC10315, c23742.b);
            } else {
                itE = c12553.d(interfaceC8913, interfaceC16831, enumC10315, c23742.b);
            }
            Iterator it = itE;
            if (it != null) {
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    String str = (String) entry.getKey();
                    if (c25102.g(str, 0, charSequence, i, str.length())) {
                        return c25102.f(this.a, ((Long) entry.getValue()).longValue(), i, str.length() + i);
                    }
                }
                if (interfaceC16831 == EnumC8692.ERA && !c25102.c) {
                    for (InterfaceC7421 interfaceC7421 : interfaceC8913.u()) {
                        String string = interfaceC7421.toString();
                        if (c25102.g(string, 0, charSequence, i, string.length())) {
                            return c25102.f(this.a, interfaceC7421.getValue(), i, string.length() + i);
                        }
                    }
                }
                if (c25102.c) {
                    return ~i;
                }
            }
            if (this.d == null) {
                this.d = new C8824(this.a, 1, 19, EnumC8079.NORMAL);
            }
            return this.d.j(c25102, charSequence, i);
        }
        throw new IndexOutOfBoundsException();
    }

    public final String toString() {
        EnumC10315 enumC10315 = EnumC10315.FULL;
        InterfaceC16831 interfaceC16831 = this.a;
        EnumC10315 enumC10316 = this.b;
        if (enumC10316 == enumC10315) {
            return "Text(" + interfaceC16831 + MotionUtils.EASING_TYPE_FORMAT_END;
        }
        return "Text(" + interfaceC16831 + "," + enumC10316 + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
