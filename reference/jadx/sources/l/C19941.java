package l;

import android.text.SpannableStringBuilder;
import android.widget.TextView;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: l.ᩴܺ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 5907 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19941 extends AbstractC24593 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C24659 f64135 = new C24659();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C19941 m45865(C22556 c22556) {
        C19941 c19941 = new C19941();
        c22556.m50783(c19941);
        return c19941;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45866(AbstractC13228 abstractC13228) {
        this.f64135.m55014(abstractC13228);
    }

    @Override // l.AbstractC24593, l.InterfaceC2963
    /* JADX INFO: renamed from: ۙ */
    public final void mo8845(C19371 c19371) {
        C24659 c24659 = this.f64135;
        if (!c24659.f79820) {
            c24659.f79820 = true;
            if (c24659.f79822 == null) {
                c24659.f79822 = Executors.newCachedThreadPool();
            }
            c19371.m44805(new C21675(c24659));
            return;
        }
        throw new IllegalStateException("ImagesPlugin has already been configured and cannot be modified any further");
    }

    @Override // l.AbstractC24593, l.InterfaceC2963
    /* JADX INFO: renamed from: ۙ */
    public final void mo9654(InterfaceC8929 interfaceC8929) {
        interfaceC8929.mo23841(C1330.class, new C22925());
    }

    @Override // l.AbstractC24593, l.InterfaceC2963
    /* JADX INFO: renamed from: ۙ */
    public final void mo9653(TextView textView, SpannableStringBuilder spannableStringBuilder) {
        AbstractC1538.m5452(textView);
    }

    @Override // l.AbstractC24593, l.InterfaceC2963
    /* JADX INFO: renamed from: ۙ */
    public final void mo9652(TextView textView) {
        AbstractC1538.m5453(textView);
    }
}
