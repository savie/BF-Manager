package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۧ᩻ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: B7KX */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11962 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17929 f38510;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC11962 f38511;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C18499 f38512 = new C18499();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final EnumC10712 f38513;

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo7699(C3168 c3168);

    public AbstractC11962(C17929 c17929, EnumC10712 enumC10712, AbstractC11962 abstractC11962) {
        this.f38510 = c17929;
        this.f38513 = enumC10712;
        this.f38511 = abstractC11962;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14769 m29938(C14769 c14769) {
        C18499 c18499 = this.f38512;
        boolean zIsEmpty = c18499.isEmpty();
        C17929 c17929 = this.f38510;
        AbstractC11962 abstractC11962 = c17929.f58733;
        try {
            c17929.f58733 = this;
            mo8759(c14769);
            c17929.f58733 = abstractC11962;
            if (zIsEmpty) {
                C14769 c14769M43093 = c18499.m43093();
                c18499.clear();
                AbstractC11962 abstractC11963 = this.f38511;
                return abstractC11963 != null ? abstractC11963.m29938(c14769M43093) : c14769M43093;
            }
            return C14769.m35543();
        } catch (Throwable th) {
            c17929.f58733 = abstractC11962;
            if (zIsEmpty) {
                c18499.clear();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᩷ */
    public void mo8759(C14769 c14769) {
        Iterator it = c14769.iterator();
        while (it.hasNext()) {
            C3168 c3168 = (C3168) it.next();
            C7926 c7926 = (C7926) c3168.f10273;
            this.f38512.m43089(c3168);
            C17929 c17929 = this.f38510;
            InterfaceC15976 interfaceC15976M34530 = c17929.f58731.m34530(c3168.f10275.f61856);
            C6147 c6147 = c17929.f58719;
            c7926.getClass();
            InterfaceC5075 interfaceC5075M17747 = c6147.m17747((InterfaceC5075) c7926);
            try {
                try {
                    c17929.f58727.mo39423(c3168.f10279.f26345, this.f38513);
                    mo7699(c3168);
                } catch (C21566 e) {
                    c17929.f58725.m49966(c7926, e);
                }
                c17929.f58727.mo39422();
                c17929.f58719.m17747(interfaceC5075M17747);
                c17929.f58731.m34530(interfaceC15976M34530);
            } catch (Throwable th) {
                c17929.f58727.mo39422();
                c17929.f58719.m17747(interfaceC5075M17747);
                c17929.f58731.m34530(interfaceC15976M34530);
                throw th;
            }
        }
    }
}
