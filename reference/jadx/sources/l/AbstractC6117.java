package l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۛܳۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 37E8 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6117 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C12738 f20884;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C12925 f20886;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f20887;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C12925 f20888;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C7986 f20891;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final AbstractC0410 f20893;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C3564 f20890 = null;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C3564 f20892 = null;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C3564 f20894 = null;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C3564 f20889 = null;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public EnumC12550 f20885 = EnumC12550.unknown;

    public AbstractC6117(C12738 c12738, AbstractC0410 abstractC0410, int i) {
        this.f20884 = c12738;
        this.f20893 = abstractC0410;
        this.f20887 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17091() {
        boolean zM52535 = EnumC23839.m52535(this.f20887);
        C12738 c12738 = this.f20884;
        if (zM52535) {
            this.f20886 = new C12925(c12738, EnumC16783.f53742);
            this.f20887 &= ~EnumC23839.f77067.m52558();
        }
        if (EnumC23839.m52550(this.f20887)) {
            this.f20888 = new C12925(c12738, EnumC16783.f53739);
            this.f20887 &= ~EnumC23839.f77058.m52558();
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC0410 m17095() {
        return this.f20893;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17093(C15187 c15187) {
        C7986 c7986 = this.f20891;
        if (c7986 != null && c15187.f43854 != c7986.f26222.f43854) {
            this.f20893.mo2157("The new attribute \"{0}\" overwrites an already declared one in the \"{1}\" structure.", EnumC20934.f68121.m47084(), this.f20885.m31242());
        }
        this.f20891 = new C7986(this.f20884, EnumC16783.f53727, c15187);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17094(C15187 c15187, long j) {
        C7986 c7986 = this.f20891;
        if (c7986 != null && c15187.f43854 != c7986.f26222.f43854) {
            this.f20893.mo2164(j, "The new attribute \"{0}\" overwrites an already declared one in the \"{1}\" structure.", EnumC20934.f68121.m47084(), this.f20885.m31242());
        }
        this.f20891 = new C7986(this.f20884, EnumC16783.f53727, c15187);
    }

    @SafeVarargs
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C24027 m17090(InterfaceC4705... interfaceC4705Arr) {
        C24027 c24027 = new C24027();
        for (InterfaceC4705 interfaceC4705 : interfaceC4705Arr) {
            if (interfaceC4705 != null) {
                c24027.m52871(interfaceC4705);
            }
        }
        C3564 c3564 = this.f20890;
        if (c3564 != null) {
            c24027.m52871(c3564);
        }
        C3564 c3565 = this.f20892;
        if (c3565 != null) {
            c24027.m52871(c3565);
        }
        C3564 c3566 = this.f20894;
        if (c3566 != null) {
            c24027.m52871(c3566);
        }
        C3564 c3567 = this.f20889;
        if (c3567 != null) {
            c24027.m52871(c3567);
        }
        return c24027;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17092(ArrayList arrayList) {
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C11514 c11514 = (C11514) it.next();
                boolean z = c11514.f38708;
                boolean z2 = c11514 instanceof C7197;
                C12738 c12738 = this.f20884;
                if (z2) {
                    C7197 c7197 = (C7197) c11514;
                    if (z) {
                        if (this.f20889 == null) {
                            this.f20889 = new C3564(c12738, EnumC16783.f53728);
                        }
                        this.f20889.m10556(c7197);
                    } else {
                        if (this.f20894 == null) {
                            this.f20894 = new C3564(c12738, EnumC16783.f53731);
                        }
                        this.f20894.m10556(c7197);
                    }
                } else if (z) {
                    if (this.f20892 == null) {
                        this.f20892 = new C3564(c12738, EnumC16783.f53745);
                    }
                    this.f20892.m10556(c11514);
                } else {
                    if (this.f20890 == null) {
                        this.f20890 = new C3564(c12738, EnumC16783.f53747);
                    }
                    this.f20890.m10556(c11514);
                }
            }
        }
    }
}
