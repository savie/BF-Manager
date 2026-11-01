package l;

import com.alipay.sdk.m.y.l;
import java.io.IOException;
import java.util.Stack;

/* JADX INFO: renamed from: l.ۤܰۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: K3OA */
/* JADX INFO: loaded from: classes3.dex */
public final class C10332 extends AbstractC12449 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11038 f35432;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int f35433;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Stack f35434;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10332(C11038 c11038, EnumC6098 enumC6098, int i, int i2) {
        super(c11038, enumC6098, Integer.valueOf(i));
        this.f35432 = c11038;
        this.f35434 = new Stack();
        this.f35433 = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10332(C11038 c11038, EnumC6098 enumC6098) {
        super(c11038, enumC6098, 0);
        this.f35432 = c11038;
        this.f35434 = new Stack();
        this.f35433 = 0;
    }

    @Override // l.AbstractC12449
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C10332) && super.equals(obj) && this.f35433 == ((C10332) obj).f35433;
    }

    @Override // l.AbstractC12449
    public final int hashCode() {
        return (super.hashCode() * 31) + this.f35433;
    }

    @Override // l.AbstractC12449
    /* JADX INFO: renamed from: ۨ */
    public final String mo2278() {
        EnumC6098 enumC6098 = this.f41512;
        int iOrdinal = enumC6098.ordinal();
        int i = this.f35433;
        Object obj = this.f41511;
        C11038 c11038 = this.f35432;
        switch (iOrdinal) {
            case 8:
                return C11038.m27808(c11038.m27822(((Integer) obj).intValue()), c11038.f37492.f14766) + "." + c11038.m27831(i);
            case 9:
            case 10:
                return c11038.m27816(enumC6098) + C11038.m27808(c11038.m27822(((Integer) obj).intValue()), c11038.f37492.f14766) + "." + c11038.m27831(i);
            case 11:
                return c11038.getName(((Integer) obj).intValue()) + ":" + c11038.m27831(i);
            case 12:
                return C11038.m27809(c11038, ((Integer) obj).intValue()) + ":" + c11038.m27831(i);
            case 13:
            default:
                return "UnknownTag";
            case 14:
            case 15:
                int iIntValue = ((Integer) obj).intValue();
                try {
                    C9358 c9358 = (C9358) ((AbstractC6741) c11038.f37492.f14764.f12145.get(iIntValue));
                    return c11038.m27831(c9358.f31712) + ":" + c11038.m27831(i) + m26215(c9358, "{", l.d);
                } catch (IndexOutOfBoundsException unused) {
                    return C2271.m6966(iIntValue, "<Invalid bootstrap method index:", ">");
                } catch (NullPointerException unused2) {
                    return "<Missing BootstrapMethods attribute>";
                }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m26215(C9358 c9358, String str, String str2) {
        StringBuilder sb = new StringBuilder();
        int size = c9358.f31714.size();
        sb.append(str);
        if (size > 0) {
            int i = 0;
            while (i < size) {
                int iIntValue = ((Integer) c9358.f31714.get(i)).intValue();
                boolean z = i != size + (-1);
                String str3 = "";
                String str4 = z ? "^" : "";
                if (z) {
                    str3 = "⾀";
                }
                sb.append(m26214(iIntValue, str4, str3));
                i++;
            }
        }
        sb.append(str2);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m26214(int i, String str, String str2) {
        String str3;
        String strConcat;
        C11038 c11038 = this.f35432;
        if (c11038.m27814(i)) {
            AbstractC12449 abstractC12449 = (AbstractC12449) c11038.f37499.get(i);
            Stack stack = this.f35434;
            if (stack.search(this) == -1) {
                stack.push(this);
                String strConcat2 = "".concat(c11038.m27825(i)).concat(str);
                stack.pop();
                return strConcat2;
            }
            if (abstractC12449 instanceof C10332) {
                str3 = String.format("%-8s %d:#%d; ", abstractC12449.f41512.m16590(), abstractC12449.f41511, Integer.valueOf(((C10332) abstractC12449).f35433));
            } else {
                str3 = String.format("%-8s #%d; ", abstractC12449.f41512.m16590(), abstractC12449.f41511);
            }
            String str4 = "circular reference to " + abstractC12449.f41512.m16590() + " #" + i;
            if (c11038.f22692) {
                strConcat = "".concat(c11038.m18222(25, str3)).concat("<").concat(str4).concat(">").concat(str);
            } else {
                strConcat = "".concat(c11038.m18222(25, str3)).concat(" // <").concat(str4).concat(">").concat(str2);
            }
            abstractC12449.m30923(new IOException(str4));
            return strConcat;
        }
        return c11038.f37494.m2162("??? The entry is missing from the constant_pool table", new Object[0]);
    }

    @Override // l.AbstractC12449
    /* JADX INFO: renamed from: ۙ */
    public final void mo2277(InterfaceC10434 interfaceC10434, int i) {
        super.mo2277(interfaceC10434, i);
        m26213();
    }

    @Override // l.AbstractC12449
    /* JADX INFO: renamed from: ܰ */
    public final void mo2280(InterfaceC10434 interfaceC10434, int i) {
        super.mo2280(interfaceC10434, i);
        m26213();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m26213() {
        C11038 c11038 = this.f35432;
        boolean z = c11038.f22704;
        EnumC6098 enumC6098 = this.f41512;
        int i = this.f35433;
        Object obj = this.f41511;
        if (z) {
            switch (enumC6098.ordinal()) {
                case 8:
                case 9:
                case 10:
                    c11038.m18210("#%d.#%d;", obj, Integer.valueOf(i));
                    break;
                case 11:
                    c11038.m18210("#%d:#%d;", obj, Integer.valueOf(i));
                    break;
                case 12:
                case 14:
                case 15:
                    c11038.m18210("%d:#%d;", obj, Integer.valueOf(i));
                    break;
                case 13:
                default:
                    c11038.m18218(this.f41510, String.format("%d:#%d;", obj, Integer.valueOf(i)));
                    c11038.m18219(" // unknown tag: " + enumC6098.f20663);
                    break;
            }
        }
        switch (enumC6098.ordinal()) {
            case 8:
            case 9:
            case 10:
                c11038.m18218(this.f41510, String.format("#%d.#%d;", obj, Integer.valueOf(i)));
                c11038.m18219(" // " + mo2278());
                break;
            case 11:
                c11038.m18218(this.f41510, String.format("#%d:#%d;", obj, Integer.valueOf(i)));
                c11038.m18219(" // " + mo2278());
                break;
            case 12:
                c11038.m18218(this.f41510, String.format("%d:#%d;", obj, Integer.valueOf(i)));
                c11038.m18219(" // " + mo2278());
                break;
            case 13:
            default:
                c11038.m18218(this.f41510, String.format("%d:#%d;", obj, Integer.valueOf(i)));
                c11038.m18219(" // unknown tag: " + enumC6098.f20663);
                break;
            case 14:
            case 15:
                c11038.m18218(this.f41510, String.format("%d:#%d;", obj, Integer.valueOf(i)));
                c11038.m18210(" // #%d:%s", obj, c11038.m27831(i));
                break;
        }
    }
}
