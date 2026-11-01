package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.᩶ᩳ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: 37RB */
/* JADX INFO: loaded from: classes4.dex */
public class C20330 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f65847;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21825 f65848;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final EnumC0573 f65849;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f65850;

    public C20330(EnumC0573 enumC0573, int i, int i2, C21825 c21825) {
        this.f65849 = enumC0573;
        this.f65847 = i;
        this.f65850 = i2;
        this.f65848 = c21825;
        mo20176();
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo20176() {
        EnumC16097 enumC16097 = this.f65849.f2498;
        EnumC16097 enumC16098 = EnumC16097.DEFAULT;
        if (enumC16097 == enumC16098) {
            return;
        }
        throw new AssertionError("Bad token kind - expected " + enumC16098);
    }

    /* JADX INFO: renamed from: ۖ */
    public AbstractC11242 mo26414() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public String mo45897() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ۚ */
    public int mo20177() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC9042 m45896() {
        C21825 c21825M45894 = m45894(EnumC19625.JAVADOC);
        if (c21825M45894.isEmpty()) {
            return null;
        }
        return (InterfaceC9042) c21825M45894.f70876;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m45895() {
        Iterator it = m45894(EnumC19625.JAVADOC).iterator();
        while (it.hasNext()) {
            if (((InterfaceC9042) it.next()).isDeprecated()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C21825 m45894(EnumC19625 enumC19625) {
        C21825<InterfaceC9042> c21825 = this.f65848;
        if (c21825 == null) {
            return C21825.m48588();
        }
        C19003 c19003 = new C19003();
        for (InterfaceC9042 interfaceC9042 : c21825) {
            if (interfaceC9042.getStyle() == enumC19625) {
                c19003.m43723(interfaceC9042);
            }
        }
        return c19003.m43726();
    }
}
