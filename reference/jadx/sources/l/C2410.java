package l;

import com.alipay.sdk.m.y.l;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۖۘܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: O69P */
/* JADX INFO: loaded from: classes3.dex */
public final class C2410 extends AbstractC10172 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean f7729;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final InterfaceC11050 f7730;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C7631 f7731;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C18181 f7732;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C4953 f7733;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C7697 f7734;

    public C2410(C18181 c18181, C7697 c7697, boolean z, InterfaceC11050 interfaceC11050) {
        super(4, -1);
        if (c7697 == null) {
            throw new NullPointerException("code == null");
        }
        if (interfaceC11050 == null) {
            throw new NullPointerException("throwsList == null");
        }
        this.f7732 = c18181;
        this.f7734 = c7697;
        this.f7729 = z;
        this.f7730 = interfaceC11050;
        this.f7731 = null;
        this.f7733 = null;
    }

    @Override // l.AbstractC23599
    /* JADX INFO: renamed from: ۙ */
    public final EnumC3461 mo1454() {
        return EnumC3461.TYPE_CODE_ITEM;
    }

    @Override // l.AbstractC23599
    /* JADX INFO: renamed from: ۙ */
    public final void mo1455(C10918 c10918) {
        C19123 c19123M27697 = c10918.m27697();
        C20067 c20067M27694 = c10918.m27694();
        C7697 c7697 = this.f7734;
        if (c7697.m20968() || c7697.m20971()) {
            C4953 c4953 = new C4953(c7697, this.f7729, this.f7732);
            this.f7733 = c4953;
            c19123M27697.m44244((AbstractC10172) c4953);
        }
        if (c7697.m20973()) {
            Iterator it = c7697.m20969().iterator();
            while (it.hasNext()) {
                c20067M27694.m46188((C5085) it.next());
            }
            this.f7731 = new C7631(c7697);
        }
        Iterator it2 = c7697.m20972().iterator();
        while (it2.hasNext()) {
            c10918.m27712((AbstractC13487) it2.next());
        }
    }

    public final String toString() {
        return "CodeItem{" + this.f7732.mo1843() + l.d;
    }

    @Override // l.AbstractC10172
    /* JADX INFO: renamed from: ۧ */
    public final String mo1456() {
        return this.f7732.mo1843();
    }

    @Override // l.AbstractC10172
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1458(C19123 c19123, int i) {
        int iM20849;
        C10918 c10918M23369 = c19123.m23369();
        C9121 c9121 = new C9121(c10918M23369);
        C7697 c7697 = this.f7734;
        c7697.m20970(c9121);
        C7631 c7631 = this.f7731;
        if (c7631 != null) {
            c7631.m20847(c10918M23369);
            iM20849 = this.f7731.m20849();
        } else {
            iM20849 = 0;
        }
        int iM25769 = c7697.m20977().m25769();
        if ((iM25769 & 1) != 0) {
            iM25769++;
        }
        m26283((iM25769 * 2) + 16 + iM20849);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x010e  */
    @Override // l.AbstractC10172
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1457(C10918 c10918, C15000 c15000) {
        int i;
        String string;
        boolean zM36116 = c15000.m36116();
        C7697 c7697 = this.f7734;
        int iM25767 = c7697.m20977().m25767();
        int iM25770 = c7697.m20977().m25770();
        boolean z = this.f7729;
        C18181 c18181 = this.f7732;
        int iM33501 = c18181.m51052(z).m19309().m33501();
        int iM25769 = c7697.m20977().m25769();
        boolean z2 = (iM25769 & 1) != 0;
        C7631 c7631 = this.f7731;
        int iM20846 = c7631 == null ? 0 : c7631.m20846();
        C4953 c4953 = this.f7733;
        int iM26285 = c4953 == null ? 0 : c4953.m26285();
        if (zM36116) {
            c15000.m36111(0, m26281() + ' ' + c18181.mo1843());
            c15000.m36111(2, "  registers_size: ".concat(C5306.m15934(iM25767)));
            c15000.m36111(2, "  ins_size:       ".concat(C5306.m15934(iM33501)));
            c15000.m36111(2, "  outs_size:      ".concat(C5306.m15934(iM25770)));
            c15000.m36111(2, "  tries_size:     ".concat(C5306.m15934(iM20846)));
            c15000.m36111(4, "  debug_off:      ".concat(C5306.m15938(iM26285)));
            c15000.m36111(4, "  insns_size:     ".concat(C5306.m15938(iM25769)));
            InterfaceC11050 interfaceC11050 = this.f7730;
            if (interfaceC11050.size() != 0) {
                StringBuilder sb = new StringBuilder("  throws ");
                int size = interfaceC11050.size();
                if (size == 0) {
                    string = "<empty>";
                } else {
                    StringBuilder sb2 = new StringBuilder(100);
                    int i2 = 0;
                    while (i2 < size) {
                        int i3 = size;
                        if (i2 != 0) {
                            sb2.append(", ");
                        }
                        sb2.append(interfaceC11050.getType(i2).mo1843());
                        i2++;
                        size = i3;
                    }
                    string = sb2.toString();
                }
                sb.append(string);
                c15000.m36111(0, sb.toString());
            } else {
                c18181 = c18181;
            }
        } else {
            c18181 = c18181;
        }
        c15000.m36123(iM25767);
        c15000.m36123(iM33501);
        c15000.m36123(iM25770);
        c15000.m36123(iM20846);
        c15000.m36124(iM26285);
        c15000.m36124(iM25769);
        try {
            c7697.m20977().m25768(c15000);
            if (this.f7731 != null) {
                if (z2) {
                    if (zM36116) {
                        c15000.m36111(2, "  padding: 0");
                    }
                    i = 0;
                    c15000.m36123(0);
                } else {
                    i = 0;
                }
                this.f7731.m20848(c15000);
            } else {
                i = 0;
            }
            if (!zM36116 || this.f7733 == null) {
                return;
            }
            c15000.m36111(i, "  debug info");
            this.f7733.m15155(c10918, c15000);
        } catch (RuntimeException e) {
            throw C3880.m12507("...while writing instructions for " + c18181.mo1843(), e);
        }
    }
}
