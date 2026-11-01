package l;

import android.text.SpannableStringBuilder;
import android.widget.TextView;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: l.۫ܳᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 5907 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12474 extends AbstractC0770 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1183 f41589 = new C1183();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12474 m30977(C21258 c21258) {
        C12474 c12474 = new C12474();
        c21258.m47729(c12474);
        return c12474;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30978(AbstractC6123 abstractC6123) {
        this.f41589.m4321(abstractC6123);
    }

    @Override // l.AbstractC0770, l.InterfaceC8533
    /* JADX INFO: renamed from: ۙ */
    public final void mo1045(C17704 c17704) {
        C1183 c1183 = this.f41589;
        if (!c1183.f5259) {
            c1183.f5259 = true;
            if (c1183.f5260 == null) {
                c1183.f5260 = Executors.newCachedThreadPool();
            }
            c17704.m41249(new C6828(c1183));
            return;
        }
        throw new IllegalStateException("ImagesPlugin has already been configured and cannot be modified any further");
    }

    @Override // l.AbstractC0770, l.InterfaceC8533
    /* JADX INFO: renamed from: ۙ */
    public final void mo3310(InterfaceC9944 interfaceC9944) {
        interfaceC9944.mo25171(C22895.class, new C16707());
    }

    @Override // l.AbstractC0770, l.InterfaceC8533
    /* JADX INFO: renamed from: ۙ */
    public final void mo1042(TextView textView, SpannableStringBuilder spannableStringBuilder) {
        AbstractC8240.m21618(textView);
    }

    @Override // l.AbstractC0770, l.InterfaceC8533
    /* JADX INFO: renamed from: ۙ */
    public final void mo3308(TextView textView) {
        AbstractC8240.m21619(textView);
    }
}
