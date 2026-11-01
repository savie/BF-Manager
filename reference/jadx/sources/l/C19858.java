package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩶֫ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8459 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19858 extends C22220 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC0618 f63689;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1512 f63690;

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3961(C23195 c23195) {
        m45104(c23195, c23195.f75263, this.f63689);
        super.mo3961(c23195);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3928(C6656 c6656) {
        C6263 c6263 = c6656.f22475;
        if (c6263.f77448.f77452 == EnumC10477.f35865) {
            m45104(c6656, c6263, this.f63689);
        }
        super.mo3928(c6656);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1065(C8753 c8753) {
        AbstractC0618 abstractC0618 = this.f63689;
        this.f63689 = c8753.f30086;
        try {
            super.mo1065(c8753);
        } finally {
            this.f63689 = abstractC0618;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45104(AbstractC8774 abstractC8774, AbstractC23903 abstractC23903, AbstractC0618 abstractC0618) {
        C1512 c1512;
        AbstractC16579 abstractC16579M52432 = abstractC0618.f77449;
        while (abstractC16579M52432 != AbstractC16579.f53219) {
            Iterator it = abstractC16579M52432.f53222.mo20272().mo3803(abstractC23903.f77453, null, EnumC10167.NON_RECURSIVE).iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                c1512 = this.f63690;
                if (zHasNext) {
                    AbstractC23903 abstractC23904 = (AbstractC23903) it.next();
                    if (abstractC23903.f77452 == abstractC23904.f77452 && c1512.f6206.m52399(c1512.f6206.m52402(abstractC23903.f77449), c1512.f6206.m52402(abstractC23904.f77449)) && abstractC23903 != abstractC23904 && (abstractC23903.mo20276() & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) != (abstractC23904.mo20276() & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) && (abstractC23903.mo20276() & 2147483648L) == 0 && (abstractC23904.mo20276() & 2147483648L) == 0) {
                        if ((abstractC23904.mo20276() & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) == 0) {
                            abstractC23903 = abstractC23904;
                        }
                        if (abstractC23903.f77449.mo1926()) {
                            return;
                        }
                        C20414 c20414 = c1512.f6196;
                        AbstractC23903 abstractC23903M52708 = abstractC23903.m52708();
                        AbstractC23903 abstractC23903M52709 = abstractC23903.m52708();
                        C14377 c14377 = C14707.f48054;
                        c20414.m48199(abstractC8774, C23879.m52624(abstractC23903M52708, new C14377("compiler", "synthetic.name.conflict", abstractC23903, abstractC23903M52709)));
                        return;
                    }
                }
            }
            abstractC16579M52432 = c1512.f6206.m52432(abstractC16579M52432);
        }
    }

    public C19858(C1512 c1512) {
        this.f63690 = c1512;
    }
}
