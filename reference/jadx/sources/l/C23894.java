package l;

import com.tencent.mm.opensdk.modelmsg.WXNativeGamePageObject;
import java.util.Arrays;

/* JADX INFO: renamed from: l.᩻᩵֨, reason: contains not printable characters */
/* JADX INFO: compiled from: E9TD */
/* JADX INFO: loaded from: classes.dex */
public final class C23894 extends AbstractC18864 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14722 f77405;

    public C23894(C14722 c14722) {
        this.f77405 = c14722;
    }

    @Override // l.AbstractC18864
    /* JADX INFO: renamed from: ۙ */
    public final Object mo11816(Object obj) {
        Long l2 = (Long) obj;
        C14722 c14722 = this.f77405;
        InterfaceC10033 interfaceC10033M35244 = C14722.m35244(c14722);
        try {
            byte[] bArr = new byte[WXNativeGamePageObject.LENGTH_LIMIT];
            interfaceC10033M35244.seek(l2.longValue() * 102400);
            int iMo20198 = interfaceC10033M35244.mo20198(bArr);
            if (iMo20198 == -1) {
                return new byte[0];
            }
            return iMo20198 != 102400 ? Arrays.copyOf(bArr, iMo20198) : bArr;
        } finally {
            C14722.m35245(c14722, interfaceC10033M35244);
        }
    }
}
