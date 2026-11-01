package l;

import com.alipay.sdk.m.p.a;
import com.alipay.sdk.m.u0.b;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: l.ۨᩳۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: G67D */
/* JADX INFO: loaded from: classes4.dex */
public class C11867 extends AbstractC23156 implements InterfaceC6157 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C21825 f39809;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f39810;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C10935 f39811;

    public C11867() {
        throw null;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean m29573() {
        C13278 c13278M29572;
        C10935 c10935;
        if (!this.f39810 || this.f39809.m48596() != 1 || m29572() == null || (c13278M29572 = m29572()) == null || (c10935 = c13278M29572.f39811) == null || c10935.f37191 == EnumC6659.UNKNOWN) {
            return false;
        }
        this.f39811 = c10935;
        return true;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m29575() {
        return this.f39810;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m29577() {
        this.f39810 = true;
    }

    public C11867(AbstractC16579 abstractC16579, C21825 c21825, C10935 c10935) {
        super(abstractC16579);
        this.f39810 = false;
        this.f39809 = c21825;
        this.f39811 = c10935;
    }

    @Override // l.AbstractC23156
    /* JADX INFO: renamed from: ܰ */
    public final C10935 mo13366() {
        C2068 c2068;
        if (m29576()) {
            C21825 c21825 = this.f39809;
            if (c21825.m48596() != 0) {
                AbstractC11242 abstractC11242 = ((C18258) ((C2068) c21825.f70876).f7664).f77453.f38032.f21322.f77643;
                Iterator it = c21825.iterator();
                do {
                    if (!it.hasNext()) {
                        c2068 = null;
                        break;
                    }
                    c2068 = (C2068) it.next();
                } while (((C18258) c2068.f7664).f77453 != abstractC11242);
                this.f39811 = c2068 != null ? ((AbstractC23156) c2068.f7665).mo13366() : null;
            }
        }
        return this.f39811;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    private C13278 m29572() {
        C21825 c21825 = this.f39809;
        if (c21825.m48596() != 1) {
            return null;
        }
        C2068 c2068 = (C2068) c21825.get(0);
        if (!((C18258) c2068.f7664).f77453.mo28213(b.d)) {
            return null;
        }
        Object obj = c2068.f7665;
        if (!(obj instanceof C4810)) {
            return null;
        }
        AbstractC23156[] abstractC23156Arr = ((C4810) obj).f16902;
        if (abstractC23156Arr.length == 0) {
            return null;
        }
        AbstractC23156 abstractC23156 = abstractC23156Arr[0];
        if (abstractC23156 instanceof C13278) {
            return (C13278) abstractC23156;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m29576() {
        return this.f39811.f37191 == EnumC6659.UNKNOWN;
    }

    @Override // l.AbstractC23156
    /* JADX INFO: renamed from: ۙ */
    public final void mo4166(InterfaceC6927 interfaceC6927) {
        interfaceC6927.mo7550(this);
    }

    @Override // l.InterfaceC11097
    public final String toString() {
        StringBuilder sb = new StringBuilder("@");
        sb.append(this.f75167);
        C21825<C2068> c21825 = this.f39809;
        int iM48596 = c21825.m48596();
        if (iM48596 > 0) {
            sb.append('(');
            boolean z = true;
            for (C2068 c2068 : c21825) {
                if (!z) {
                    sb.append(", ");
                }
                AbstractC11242 abstractC11242 = ((C18258) c2068.f7664).f77453;
                if (iM48596 > 1 || abstractC11242 != abstractC11242.f38032.f21322.f77643) {
                    sb.append((CharSequence) abstractC11242);
                    sb.append(a.h);
                }
                sb.append(c2068.f7665);
                z = false;
            }
            sb.append(')');
        }
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:11:0x0020  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC23156 m29574(AbstractC11242 abstractC11242) {
        for (C2068 c2068 : this.f39809) {
            if (((C18258) c2068.f7664).f77453 == abstractC11242) {
                if (c2068 == null) {
                    return null;
                }
                return (AbstractC23156) c2068.f7665;
            }
        }
        c2068 = null;
        if (c2068 == null) {
            return null;
        }
        return (AbstractC23156) c2068.f7665;
    }

    @Override // l.AbstractC23156, l.InterfaceC11097
    /* JADX INFO: renamed from: ۙ */
    public final Object mo8225(InterfaceC23797 interfaceC23797) {
        return Boolean.FALSE;
    }

    @Override // l.InterfaceC6157
    /* JADX INFO: renamed from: ۖ */
    public final InterfaceC8399 mo17159() {
        return (InterfaceC8399) this.f75167;
    }

    @Override // l.InterfaceC6157
    /* JADX INFO: renamed from: ۙ */
    public final LinkedHashMap mo17160() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (C2068 c2068 : this.f39809) {
            linkedHashMap.put((C18258) c2068.f7664, (AbstractC23156) c2068.f7665);
        }
        return linkedHashMap;
    }
}
