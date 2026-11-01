package l;

import java.io.Writer;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.۟᩻᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: M605 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7807 extends AbstractC9031 implements InterfaceC22762 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C17684 f25683;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f25684;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final int f25685;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f25689;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public AbstractC13556 f25690;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f25691;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C10630 f25692;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f25693;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f25694;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f25687 = 0;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f25688 = 0;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f25686 = 0;

    public C7807(C17684 c17684, int i, int i2) {
        this.f25683 = c17684;
        this.f25693 = i;
        int iMo9809 = c17684.m41166().mo9809(i + 24);
        if (iMo9809 == 0) {
            this.f25689 = -1;
            this.f25694 = 0;
            this.f25685 = 0;
            this.f25691 = 0;
            this.f25684 = 0;
        } else {
            C18825 c18825M42184 = c17684.m41166().m42184(iMo9809);
            this.f25694 = c18825M42184.m43449();
            this.f25685 = c18825M42184.m43449();
            this.f25691 = c18825M42184.m43449();
            this.f25684 = c18825M42184.m43449();
            this.f25689 = c18825M42184.m43447();
            c18825M42184.m43450();
        }
        if (i2 != 0) {
            this.f25692 = new C10630(this, i2);
        } else {
            this.f25692 = null;
        }
    }

    @Override // l.InterfaceC15914
    public final String getType() {
        C17684 c17684 = this.f25683;
        return c17684.m41204(c17684.m41166().mo9809(this.f25693));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20483(Writer writer) {
        C17684 c17684 = this.f25683;
        c17684.m41172(writer, c17684.m41166().mo9809(this.f25693));
    }

    @Override // l.InterfaceC22762
    /* JADX INFO: renamed from: ۬ۨ, reason: not valid java name and contains not printable characters */
    public final String mo20494() {
        C17684 c17684 = this.f25683;
        int iM42185 = c17684.m41166().m42185(this.f25693 + 8);
        if (iM42185 == -1) {
            return null;
        }
        return c17684.m41204(iM42185);
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int m20497() {
        return this.f25683.m41166().m42185(this.f25693 + 8);
    }

    @Override // l.InterfaceC22762
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int mo20491() {
        return this.f25683.m41166().mo9809(this.f25693 + 4);
    }

    @Override // l.InterfaceC22762
    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final String mo20493() {
        C17684 c17684 = this.f25683;
        return c17684.m41164(c17684.m41166().m42185(this.f25693 + 16));
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final int m20487() {
        return this.f25683.m41166().m42185(this.f25693 + 16);
    }

    @Override // l.InterfaceC22762
    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public final List mo20500() {
        C17684 c17684 = this.f25683;
        int iMo9809 = c17684.m41166().mo9809(this.f25693 + 12);
        if (iMo9809 > 0) {
            return new C22624(this, iMo9809, c17684.m41166().mo9809(iMo9809));
        }
        return AbstractC22433.of();
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int[] m20488() {
        C17684 c17684 = this.f25683;
        int iMo9809 = c17684.m41166().mo9809(this.f25693 + 12);
        int[] iArr = null;
        if (iMo9809 > 0) {
            int iMo98010 = c17684.m41166().mo9809(iMo9809);
            if (iMo98010 == 0) {
                return null;
            }
            iArr = new int[iMo98010];
            for (int i = 0; i < iMo98010; i++) {
                iArr[i] = c17684.m41166().m42183((i * 2) + iMo9809 + 4);
            }
        }
        return iArr;
    }

    @Override // l.InterfaceC22762
    public final Set getAnnotations() {
        return m20481().mo12233();
    }

    @Override // l.InterfaceC22762
    public final Iterable getFields() {
        return C22808.m50465(m20485(true), m20482(true));
    }

    @Override // l.InterfaceC22762
    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public final Iterable mo20496() {
        return m20485(true);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Iterable m20485(boolean z) {
        if (this.f25694 > 0) {
            AbstractC13556 abstractC13556M20481 = m20481();
            int iMo9809 = this.f25683.m41166().mo9809(this.f25693 + 28);
            C10630 c10630 = this.f25692;
            return new C13452(this, abstractC13556M20481, iMo9809, c10630 == null ? null : C10630.m26809(c10630), z);
        }
        this.f25687 = this.f25689;
        return AbstractC23844.of();
    }

    @Override // l.InterfaceC22762
    /* JADX INFO: renamed from: ۢܰ, reason: not valid java name and contains not printable characters */
    public final Iterable mo20489() {
        return m20482(true);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Iterable m20482(boolean z) {
        if (this.f25685 > 0) {
            AbstractC13556 abstractC13556M20481 = m20481();
            int iM20477 = m20477();
            C10630 c10630 = this.f25692;
            return new C7101(this, abstractC13556M20481, iM20477, c10630 == null ? null : C10630.m26812(c10630), z);
        }
        int i = this.f25687;
        if (i > 0) {
            this.f25688 = i;
        }
        return AbstractC23844.of();
    }

    @Override // l.InterfaceC22762
    public final Iterable getMethods() {
        return C22808.m50465(m20492(true), m20499(true));
    }

    @Override // l.InterfaceC22762
    /* JADX INFO: renamed from: ܰۨ, reason: not valid java name and contains not printable characters */
    public final Iterable mo20495() {
        return m20492(true);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Iterable m20492(boolean z) {
        if (this.f25691 > 0) {
            AbstractC13556 abstractC13556M20481 = m20481();
            int iM20480 = m20480();
            C10630 c10630 = this.f25692;
            return new C15569(this, abstractC13556M20481, iM20480, c10630 == null ? null : C10630.m26807(c10630), z);
        }
        int i = this.f25688;
        if (i > 0) {
            this.f25686 = i;
        }
        return AbstractC23844.of();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Iterable m20499(boolean z) {
        if (this.f25684 > 0) {
            AbstractC13556 abstractC13556M20481 = m20481();
            int i = this.f25686;
            if (i <= 0) {
                C18825 c18825M42184 = this.f25683.m41166().m42184(m20480());
                int i2 = C11770.f39503;
                for (int i3 = 0; i3 < this.f25691; i3++) {
                    c18825M42184.m43452();
                    c18825M42184.m43452();
                    c18825M42184.m43452();
                }
                this.f25686 = c18825M42184.m43447();
                c18825M42184.m43450();
                i = this.f25686;
            }
            int i4 = i;
            C10630 c10630 = this.f25692;
            return new C18390(this, abstractC13556M20481, i4, c10630 == null ? null : C10630.m26805(c10630), z);
        }
        return AbstractC23844.of();
    }

    @Override // l.InterfaceC22762
    /* JADX INFO: renamed from: ۚۨ, reason: not valid java name and contains not printable characters */
    public final Iterable mo20486() {
        return m20499(true);
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    private AbstractC13556 m20481() {
        if (this.f25690 == null) {
            C17684 c17684 = this.f25683;
            this.f25690 = AbstractC13556.m33144(c17684, c17684.m41166().mo9809(this.f25693 + 20));
        }
        return this.f25690;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    private int m20477() {
        int i = this.f25687;
        if (i > 0) {
            return i;
        }
        C18825 c18825M42184 = this.f25683.m41166().m42184(this.f25689);
        for (int i2 = 0; i2 < this.f25694; i2++) {
            c18825M42184.m43452();
            c18825M42184.m43452();
        }
        this.f25687 = c18825M42184.m43447();
        c18825M42184.m43450();
        return this.f25687;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private int m20480() {
        int i = this.f25688;
        if (i > 0) {
            return i;
        }
        C18825 c18825M42184 = this.f25683.m41166().m42184(m20477());
        for (int i2 = 0; i2 < this.f25685; i2++) {
            c18825M42184.m43452();
            c18825M42184.m43452();
        }
        this.f25688 = c18825M42184.m43447();
        c18825M42184.m43450();
        return this.f25688;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m20490() {
        return this.f25691 + this.f25684;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final int m20498() {
        return this.f25694 + this.f25685;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m20484(C7807 c7807, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        if (mo20491() == c7807.mo20491() && this.f25694 == c7807.f25694 && this.f25685 == c7807.f25685 && this.f25691 == c7807.f25691 && this.f25684 == c7807.f25684 && getType().equals(c7807.getType()) && C13638.equals(mo20494(), c7807.mo20494())) {
            List listMo20500 = mo20500();
            List listMo20501 = c7807.mo20500();
            if (listMo20500.size() == listMo20501.size()) {
                int size = listMo20500.size();
                for (int i = 0; i < size; i++) {
                    if (listMo20500.get(i).equals(listMo20501.get(i))) {
                    }
                }
                if ((z || C13638.equals(mo20493(), c7807.mo20493())) && C12076.m30044(getAnnotations(), c7807.getAnnotations()) && C12076.m30042(m20485(false), c7807.m20485(false), z5) && C12076.m30042(m20482(false), c7807.m20482(false), z5) && C12076.m30043(m20492(false), c7807.m20492(false), z, z2, z3, z4, z5) && C12076.m30043(m20499(false), c7807.m20499(false), z, z2, z3, z4, z5)) {
                    return true;
                }
            }
        }
        return false;
    }
}
