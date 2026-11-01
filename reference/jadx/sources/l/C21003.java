package l;

import com.google.android.material.motion.MotionUtils;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.᩷ܽᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21003 implements InterfaceC22415 {
    public final InterfaceC11002 a;
    public final EnumC4069 b;
    public final C9240 c;
    public volatile C21709 d;

    public C21003(InterfaceC11002 interfaceC11002, EnumC4069 enumC4069, C9240 c9240) {
        this.a = interfaceC11002;
        this.b = enumC4069;
        this.c = c9240;
    }

    @Override // l.InterfaceC22415
    public final boolean l(C11126 c11126, StringBuilder sb) {
        String strC;
        Long lA = c11126.a(this.a);
        C23351 c23351 = c11126.b;
        if (lA == null) {
            return false;
        }
        InterfaceC21233 interfaceC21233 = (InterfaceC21233) c11126.a.T(AbstractC23702.b);
        if (interfaceC21233 == null || interfaceC21233 == C7122.c) {
            strC = this.c.c(this.a, lA.longValue(), this.b, c23351.b);
        } else {
            strC = this.c.b(interfaceC21233, this.a, lA.longValue(), this.b, c23351.b);
        }
        if (strC != null) {
            sb.append(strC);
            return true;
        }
        if (this.d == null) {
            this.d = new C21709(this.a, 1, 19, EnumC1247.NORMAL);
        }
        return this.d.l(c11126, sb);
    }

    @Override // l.InterfaceC22415
    public final int m(C12537 c12537, CharSequence charSequence, int i) {
        Iterator itE;
        C9240 c9240 = this.c;
        InterfaceC11002 interfaceC11002 = this.a;
        int length = charSequence.length();
        if (i >= 0 && i <= length) {
            boolean z = c12537.c;
            C23351 c23351 = c12537.a;
            EnumC4069 enumC4069 = z ? this.b : null;
            InterfaceC21233 interfaceC21233 = c12537.c().c;
            if (interfaceC21233 == null && (interfaceC21233 = c12537.a.e) == null) {
                interfaceC21233 = C7122.c;
            }
            InterfaceC21233 interfaceC21234 = interfaceC21233;
            if (interfaceC21234 == null || interfaceC21234 == C7122.c) {
                itE = c9240.e(interfaceC11002, enumC4069, c23351.b);
            } else {
                itE = c9240.d(interfaceC21234, interfaceC11002, enumC4069, c23351.b);
            }
            Iterator it = itE;
            if (it != null) {
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    String str = (String) entry.getKey();
                    if (c12537.g(str, 0, charSequence, i, str.length())) {
                        return c12537.f(this.a, ((Long) entry.getValue()).longValue(), i, str.length() + i);
                    }
                }
                if (interfaceC11002 == EnumC18762.ERA && !c12537.c) {
                    for (InterfaceC17705 interfaceC17705 : interfaceC21234.x()) {
                        String string = interfaceC17705.toString();
                        if (c12537.g(string, 0, charSequence, i, string.length())) {
                            return c12537.f(this.a, interfaceC17705.getValue(), i, string.length() + i);
                        }
                    }
                }
                if (c12537.c) {
                    return ~i;
                }
            }
            if (this.d == null) {
                this.d = new C21709(this.a, 1, 19, EnumC1247.NORMAL);
            }
            return this.d.m(c12537, charSequence, i);
        }
        throw new IndexOutOfBoundsException();
    }

    public final String toString() {
        EnumC4069 enumC4069 = EnumC4069.FULL;
        InterfaceC11002 interfaceC11002 = this.a;
        EnumC4069 enumC40610 = this.b;
        if (enumC40610 == enumC4069) {
            return "Text(" + interfaceC11002 + MotionUtils.EASING_TYPE_FORMAT_END;
        }
        return "Text(" + interfaceC11002 + "," + enumC40610 + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
