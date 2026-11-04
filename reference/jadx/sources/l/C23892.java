package l;

import com.alipay.sdk.m.p.a;
import com.alipay.sdk.m.u0.b;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: l.᩹᩺᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: G67D */
/* JADX INFO: loaded from: classes.dex */
public class C23892 extends AbstractC21654 implements InterfaceC22450 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f77370;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C5510 f77371;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C14769 f77372;

    public C23892() {
        throw null;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean m53393() {
        C24638 c24638M53391;
        C5510 c5510;
        if (!this.f77370 || this.f77372.m35551() != 1 || m53391() == null || (c24638M53391 = m53391()) == null || (c5510 = c24638M53391.f77371) == null || c5510.f19183 == EnumC21478.UNKNOWN) {
            return false;
        }
        this.f77371 = c5510;
        return true;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m53395() {
        return this.f77370;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m53394() {
        this.f77370 = true;
    }

    public C23892(AbstractC22664 abstractC22664, C14769 c14769, C5510 c5510) {
        super(abstractC22664);
        this.f77370 = false;
        this.f77372 = c14769;
        this.f77371 = c5510;
    }

    @Override // l.AbstractC21654
    /* JADX INFO: renamed from: ᩷ */
    public final C5510 mo41838() {
        C5558 c5558;
        if (m53396()) {
            C14769 c14769 = this.f77372;
            if (c14769.m35551() != 0) {
                AbstractC19728 abstractC19728 = ((C10377) ((C5558) c14769.f48335).f19300).f38072.f63499.f73707.f49766;
                Iterator it = c14769.iterator();
                do {
                    if (!it.hasNext()) {
                        c5558 = null;
                        break;
                    }
                    c5558 = (C5558) it.next();
                } while (((C10377) c5558.f19300).f38072 != abstractC19728);
                this.f77371 = c5558 != null ? ((AbstractC21654) c5558.f19301).mo41838() : null;
            }
        }
        return this.f77371;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private C24638 m53391() {
        C14769 c14769 = this.f77372;
        if (c14769.m35551() != 1) {
            return null;
        }
        C5558 c5558 = (C5558) c14769.get(0);
        if (!((C10377) c5558.f19300).f38072.mo9945(b.d)) {
            return null;
        }
        Object obj = c5558.f19301;
        if (!(obj instanceof C17924)) {
            return null;
        }
        AbstractC21654[] abstractC21654Arr = ((C17924) obj).f58709;
        if (abstractC21654Arr.length == 0) {
            return null;
        }
        AbstractC21654 abstractC21654 = abstractC21654Arr[0];
        if (abstractC21654 instanceof C24638) {
            return (C24638) abstractC21654;
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m53396() {
        return this.f77371.f19183 == EnumC21478.UNKNOWN;
    }

    @Override // l.AbstractC21654
    /* JADX INFO: renamed from: ۙ */
    public final void mo12192(InterfaceC14940 interfaceC14940) {
        interfaceC14940.mo18309(this);
    }

    @Override // l.InterfaceC19466
    public final String toString() {
        StringBuilder sb = new StringBuilder("@");
        sb.append(this.f69124);
        C14769<C5558> c14769 = this.f77372;
        int iM35551 = c14769.m35551();
        if (iM35551 > 0) {
            sb.append('(');
            boolean z = true;
            for (C5558 c5558 : c14769) {
                if (!z) {
                    sb.append(", ");
                }
                AbstractC19728 abstractC19728 = ((C10377) c5558.f19300).f38072;
                if (iM35551 > 1 || abstractC19728 != abstractC19728.f63499.f73707.f49766) {
                    sb.append((CharSequence) abstractC19728);
                    sb.append(a.h);
                }
                sb.append(c5558.f19301);
                z = false;
            }
            sb.append(')');
        }
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:11:0x0020  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC21654 m53392(AbstractC19728 abstractC19728) {
        for (C5558 c5558 : this.f77372) {
            if (((C10377) c5558.f19300).f38072 == abstractC19728) {
                if (c5558 == null) {
                    return null;
                }
                return (AbstractC21654) c5558.f19301;
            }
        }
        c5558 = null;
        if (c5558 == null) {
            return null;
        }
        return (AbstractC21654) c5558.f19301;
    }

    @Override // l.AbstractC21654, l.InterfaceC19466
    /* JADX INFO: renamed from: ۙ */
    public final Object mo12191(InterfaceC14990 interfaceC14990) {
        return Boolean.FALSE;
    }

    @Override // l.InterfaceC22450
    /* JADX INFO: renamed from: ۤ */
    public final InterfaceC7533 mo50625() {
        return (InterfaceC7533) this.f69124;
    }

    @Override // l.InterfaceC22450
    /* JADX INFO: renamed from: ۙ */
    public final LinkedHashMap mo50624() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (C5558 c5558 : this.f77372) {
            linkedHashMap.put((C10377) c5558.f19300, (AbstractC21654) c5558.f19301);
        }
        return linkedHashMap;
    }
}
