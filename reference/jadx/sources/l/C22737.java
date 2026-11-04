package l;

import java.io.Writer;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.᩸ۤۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: M605 */
/* JADX INFO: loaded from: classes2.dex */
public final class C22737 extends AbstractC22081 implements InterfaceC10122 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f73776;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f73778;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final int f73781;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int f73782;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int f73783;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public AbstractC6460 f73784;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C24975 f73785;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C10802 f73786;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f73787;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f73777 = 0;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f73780 = 0;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f73779 = 0;

    public C22737(C24975 c24975, int i, int i2) {
        this.f73785 = c24975;
        this.f73787 = i;
        int iMo8719 = c24975.m55818().mo8719(i + 24);
        if (iMo8719 == 0) {
            this.f73778 = -1;
            this.f73782 = 0;
            this.f73783 = 0;
            this.f73776 = 0;
            this.f73781 = 0;
        } else {
            C8565 c8565M8724 = c24975.m55818().m8724(iMo8719);
            this.f73782 = c8565M8724.m22996();
            this.f73783 = c8565M8724.m22996();
            this.f73776 = c8565M8724.m22996();
            this.f73781 = c8565M8724.m22996();
            this.f73778 = c8565M8724.m23001();
            c8565M8724.m22995();
        }
        if (i2 != 0) {
            this.f73786 = new C10802(this, i2);
        } else {
            this.f73786 = null;
        }
    }

    @Override // l.InterfaceC19775
    public final String getType() {
        C24975 c24975 = this.f73785;
        return c24975.m55822(c24975.m55818().mo8719(this.f73787));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51265(Writer writer) {
        C24975 c24975 = this.f73785;
        c24975.m55787(writer, c24975.m55818().mo8719(this.f73787));
    }

    @Override // l.InterfaceC10122
    /* JADX INFO: renamed from: ֫ۤ */
    public final String mo20397() {
        C24975 c24975 = this.f73785;
        int iM8723 = c24975.m55818().m8723(this.f73787 + 8);
        if (iM8723 == -1) {
            return null;
        }
        return c24975.m55822(iM8723);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m51270() {
        return this.f73785.m55818().m8723(this.f73787 + 8);
    }

    @Override // l.InterfaceC10122
    /* JADX INFO: renamed from: ᩷ */
    public final int mo20404() {
        return this.f73785.m55818().mo8719(this.f73787 + 4);
    }

    @Override // l.InterfaceC10122
    /* JADX INFO: renamed from: ۚ */
    public final String mo20400() {
        C24975 c24975 = this.f73785;
        return c24975.m55803(c24975.m55818().m8723(this.f73787 + 16));
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final int m51275() {
        return this.f73785.m55818().m8723(this.f73787 + 16);
    }

    @Override // l.InterfaceC10122
    /* JADX INFO: renamed from: ܳۙ */
    public final List mo20402() {
        C24975 c24975 = this.f73785;
        int iMo8719 = c24975.m55818().mo8719(this.f73787 + 12);
        if (iMo8719 > 0) {
            return new C18590(this, iMo8719, c24975.m55818().mo8719(iMo8719));
        }
        return AbstractC1928.of();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int[] m51269() {
        C24975 c24975 = this.f73785;
        int iMo8719 = c24975.m55818().mo8719(this.f73787 + 12);
        int[] iArr = null;
        if (iMo8719 > 0) {
            int iMo87110 = c24975.m55818().mo8719(iMo8719);
            if (iMo87110 == 0) {
                return null;
            }
            iArr = new int[iMo87110];
            for (int i = 0; i < iMo87110; i++) {
                iArr[i] = c24975.m55818().m8721((i * 2) + iMo8719 + 4);
            }
        }
        return iArr;
    }

    @Override // l.InterfaceC10122
    public final Set getAnnotations() {
        return m51261().mo18261();
    }

    @Override // l.InterfaceC10122
    public final Iterable getFields() {
        return C16625.m39329(m51272(true), m51274(true));
    }

    @Override // l.InterfaceC10122
    /* JADX INFO: renamed from: ۖۙ */
    public final Iterable mo20398() {
        return m51272(true);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final Iterable m51272(boolean z) {
        if (this.f73782 > 0) {
            AbstractC6460 abstractC6460M51261 = m51261();
            int iMo8719 = this.f73785.m55818().mo8719(this.f73787 + 28);
            C10802 c10802 = this.f73786;
            return new C8149(this, abstractC6460M51261, iMo8719, c10802 == null ? null : C10802.m27535(c10802), z);
        }
        this.f73777 = this.f73778;
        return AbstractC8639.of();
    }

    @Override // l.InterfaceC10122
    /* JADX INFO: renamed from: ۜ᩷ */
    public final Iterable mo20401() {
        return m51274(true);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Iterable m51274(boolean z) {
        if (this.f73783 > 0) {
            AbstractC6460 abstractC6460M51261 = m51261();
            int iM51257 = m51257();
            C10802 c10802 = this.f73786;
            return new C10385(this, abstractC6460M51261, iM51257, c10802 == null ? null : C10802.m27538(c10802), z);
        }
        int i = this.f73777;
        if (i > 0) {
            this.f73780 = i;
        }
        return AbstractC8639.of();
    }

    @Override // l.InterfaceC10122
    public final Iterable getMethods() {
        return C16625.m39329(m51268(true), m51271(true));
    }

    @Override // l.InterfaceC10122
    /* JADX INFO: renamed from: ᩷ۤ */
    public final Iterable mo20405() {
        return m51268(true);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Iterable m51268(boolean z) {
        if (this.f73776 > 0) {
            AbstractC6460 abstractC6460M51261 = m51261();
            int iM51254 = m51254();
            C10802 c10802 = this.f73786;
            return new C9639(this, abstractC6460M51261, iM51254, c10802 == null ? null : C10802.m27533(c10802), z);
        }
        int i = this.f73780;
        if (i > 0) {
            this.f73779 = i;
        }
        return AbstractC8639.of();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Iterable m51271(boolean z) {
        if (this.f73781 > 0) {
            AbstractC6460 abstractC6460M51261 = m51261();
            int i = this.f73779;
            if (i <= 0) {
                C8565 c8565M8724 = this.f73785.m55818().m8724(m51254());
                int i2 = C4091.f13937;
                for (int i3 = 0; i3 < this.f73776; i3++) {
                    c8565M8724.m23000();
                    c8565M8724.m23000();
                    c8565M8724.m23000();
                }
                this.f73779 = c8565M8724.m23001();
                c8565M8724.m22995();
                i = this.f73779;
            }
            int i4 = i;
            C10802 c10802 = this.f73786;
            return new C8894(this, abstractC6460M51261, i4, c10802 == null ? null : C10802.m27540(c10802), z);
        }
        return AbstractC8639.of();
    }

    @Override // l.InterfaceC10122
    /* JADX INFO: renamed from: ܳۤ */
    public final Iterable mo20403() {
        return m51271(true);
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    private AbstractC6460 m51261() {
        if (this.f73784 == null) {
            C24975 c24975 = this.f73785;
            this.f73784 = AbstractC6460.m18259(c24975, c24975.m55818().mo8719(this.f73787 + 20));
        }
        return this.f73784;
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    private int m51257() {
        int i = this.f73777;
        if (i > 0) {
            return i;
        }
        C8565 c8565M8724 = this.f73785.m55818().m8724(this.f73778);
        for (int i2 = 0; i2 < this.f73782; i2++) {
            c8565M8724.m23000();
            c8565M8724.m23000();
        }
        this.f73777 = c8565M8724.m23001();
        c8565M8724.m22995();
        return this.f73777;
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    private int m51254() {
        int i = this.f73780;
        if (i > 0) {
            return i;
        }
        C8565 c8565M8724 = this.f73785.m55818().m8724(m51257());
        for (int i2 = 0; i2 < this.f73783; i2++) {
            c8565M8724.m23000();
            c8565M8724.m23000();
        }
        this.f73780 = c8565M8724.m23001();
        c8565M8724.m22995();
        return this.f73780;
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final int m51267() {
        return this.f73776 + this.f73781;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final int m51273() {
        return this.f73782 + this.f73783;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m51266(C22737 c22737, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        if (mo20404() == c22737.mo20404() && this.f73782 == c22737.f73782 && this.f73783 == c22737.f73783 && this.f73776 == c22737.f73776 && this.f73781 == c22737.f73781 && getType().equals(c22737.getType()) && C17359.equals(mo20397(), c22737.mo20397())) {
            List listMo20402 = mo20402();
            List listMo20403 = c22737.mo20402();
            if (listMo20402.size() == listMo20403.size()) {
                int size = listMo20402.size();
                for (int i = 0; i < size; i++) {
                    if (listMo20402.get(i).equals(listMo20403.get(i))) {
                    }
                }
                if ((z || C17359.equals(mo20400(), c22737.mo20400())) && C17370.m40803(getAnnotations(), c22737.getAnnotations()) && C17370.m40801(m51272(false), c22737.m51272(false), z5) && C17370.m40801(m51274(false), c22737.m51274(false), z5) && C17370.m40802(m51268(false), c22737.m51268(false), z, z2, z3, z4, z5) && C17370.m40802(m51271(false), c22737.m51271(false), z, z2, z3, z4, z5)) {
                    return true;
                }
            }
        }
        return false;
    }
}
