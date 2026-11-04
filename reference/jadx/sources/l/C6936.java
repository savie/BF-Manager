package l;

import com.alipay.sdk.m.y.l;
import java.io.IOException;
import java.util.Stack;

/* JADX INFO: renamed from: l.ۜۚ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: K3OA */
/* JADX INFO: loaded from: classes3.dex */
public final class C6936 extends AbstractC15029 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f22943;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1606 f22944;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Stack f22945;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6936(C1606 c1606, EnumC5335 enumC5335, int i, int i2) {
        super(c1606, enumC5335, Integer.valueOf(i));
        this.f22944 = c1606;
        this.f22945 = new Stack();
        this.f22943 = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6936(C1606 c1606, EnumC5335 enumC5335) {
        super(c1606, enumC5335, 0);
        this.f22944 = c1606;
        this.f22945 = new Stack();
        this.f22943 = 0;
    }

    @Override // l.AbstractC15029
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6936) && super.equals(obj) && this.f22943 == ((C6936) obj).f22943;
    }

    @Override // l.AbstractC15029
    public final int hashCode() {
        return (super.hashCode() * 31) + this.f22943;
    }

    @Override // l.AbstractC15029
    /* JADX INFO: renamed from: ۤ */
    public final String mo14388() {
        EnumC5335 enumC5335 = this.f49067;
        int iOrdinal = enumC5335.ordinal();
        int i = this.f22943;
        Object obj = this.f49068;
        C1606 c1606 = this.f22944;
        switch (iOrdinal) {
            case 8:
                return C1606.m5618(c1606.m5633(((Integer) obj).intValue()), c1606.f5515.f1449) + "." + c1606.m5644(i);
            case 9:
            case 10:
                return c1606.m5626(enumC5335) + C1606.m5618(c1606.m5633(((Integer) obj).intValue()), c1606.f5515.f1449) + "." + c1606.m5644(i);
            case 11:
                return c1606.getName(((Integer) obj).intValue()) + ":" + c1606.m5644(i);
            case 12:
                return C1606.m5619(c1606, ((Integer) obj).intValue()) + ":" + c1606.m5644(i);
            case 13:
            default:
                return "UnknownTag";
            case 14:
            case 15:
                int iIntValue = ((Integer) obj).intValue();
                try {
                    C20361 c20361 = (C20361) ((AbstractC20997) c1606.f5515.f1441.f53488.get(iIntValue));
                    return c1606.m5644(c20361.f65311) + ":" + c1606.m5644(i) + m19221(c20361, "{", l.d);
                } catch (IndexOutOfBoundsException unused) {
                    return C14442.m34864(iIntValue, "<Invalid bootstrap method index:", ">");
                } catch (NullPointerException unused2) {
                    return "<Missing BootstrapMethods attribute>";
                }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m19221(C20361 c20361, String str, String str2) {
        StringBuilder sb = new StringBuilder();
        int size = c20361.f65312.size();
        sb.append(str);
        if (size > 0) {
            int i = 0;
            while (i < size) {
                int iIntValue = ((Integer) c20361.f65312.get(i)).intValue();
                boolean z = i != size + (-1);
                String str3 = "";
                String str4 = z ? "^" : "";
                if (z) {
                    str3 = "⾀";
                }
                sb.append(m19220(iIntValue, str4, str3));
                i++;
            }
        }
        sb.append(str2);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m19220(int i, String str, String str2) {
        String str3;
        String strConcat;
        C1606 c1606 = this.f22944;
        if (c1606.m5638(i)) {
            AbstractC15029 abstractC15029 = (AbstractC15029) c1606.f5514.get(i);
            Stack stack = this.f22945;
            if (stack.search(this) == -1) {
                stack.push(this);
                String strConcat2 = "".concat(c1606.m5630(i)).concat(str);
                stack.pop();
                return strConcat2;
            }
            if (abstractC15029 instanceof C6936) {
                str3 = String.format("%-8s %d:#%d; ", abstractC15029.f49067.m15992(), abstractC15029.f49068, Integer.valueOf(((C6936) abstractC15029).f22943));
            } else {
                str3 = String.format("%-8s #%d; ", abstractC15029.f49067.m15992(), abstractC15029.f49068);
            }
            String str4 = "circular reference to " + abstractC15029.f49067.m15992() + " #" + i;
            if (c1606.f67132) {
                strConcat = "".concat(c1606.m47996(25, str3)).concat("<").concat(str4).concat(">").concat(str);
            } else {
                strConcat = "".concat(c1606.m47996(25, str3)).concat(" // <").concat(str4).concat(">").concat(str2);
            }
            abstractC15029.m36185(new IOException(str4));
            return strConcat;
        }
        return c1606.f5509.m32311("??? The entry is missing from the constant_pool table", new Object[0]);
    }

    @Override // l.AbstractC15029
    /* JADX INFO: renamed from: ۙ */
    public final void mo14387(InterfaceC13676 interfaceC13676, int i) {
        super.mo14387(interfaceC13676, i);
        m19219();
    }

    @Override // l.AbstractC15029
    /* JADX INFO: renamed from: ᩷ */
    public final void mo14390(InterfaceC13676 interfaceC13676, int i) {
        super.mo14390(interfaceC13676, i);
        m19219();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m19219() {
        C1606 c1606 = this.f22944;
        boolean z = c1606.f67146;
        EnumC5335 enumC5335 = this.f49067;
        int i = this.f22943;
        Object obj = this.f49068;
        if (z) {
            switch (enumC5335.ordinal()) {
                case 8:
                case 9:
                case 10:
                    c1606.m48014("#%d.#%d;", obj, Integer.valueOf(i));
                    break;
                case 11:
                    c1606.m48014("#%d:#%d;", obj, Integer.valueOf(i));
                    break;
                case 12:
                case 14:
                case 15:
                    c1606.m48014("%d:#%d;", obj, Integer.valueOf(i));
                    break;
                case 13:
                default:
                    c1606.m48005(this.f49066, String.format("%d:#%d;", obj, Integer.valueOf(i)));
                    c1606.m48006(" // unknown tag: " + enumC5335.f18750);
                    break;
            }
        }
        switch (enumC5335.ordinal()) {
            case 8:
            case 9:
            case 10:
                c1606.m48005(this.f49066, String.format("#%d.#%d;", obj, Integer.valueOf(i)));
                c1606.m48006(" // " + mo14388());
                break;
            case 11:
                c1606.m48005(this.f49066, String.format("#%d:#%d;", obj, Integer.valueOf(i)));
                c1606.m48006(" // " + mo14388());
                break;
            case 12:
                c1606.m48005(this.f49066, String.format("%d:#%d;", obj, Integer.valueOf(i)));
                c1606.m48006(" // " + mo14388());
                break;
            case 13:
            default:
                c1606.m48005(this.f49066, String.format("%d:#%d;", obj, Integer.valueOf(i)));
                c1606.m48006(" // unknown tag: " + enumC5335.f18750);
                break;
            case 14:
            case 15:
                c1606.m48005(this.f49066, String.format("%d:#%d;", obj, Integer.valueOf(i)));
                c1606.m48014(" // #%d:%s", obj, c1606.m5644(i));
                break;
        }
    }
}
