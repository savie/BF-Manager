package l;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.widget.TextView;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.֨᩸᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: M903 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1472 extends AbstractC0726 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final TextView.BufferType f5128;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C23926 f5129;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C15553 f5130;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f5131;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final List f5132;

    public C1472(TextView.BufferType bufferType, C23926 c23926, C15553 c15553, List list, boolean z) {
        this.f5128 = bufferType;
        this.f5129 = c23926;
        this.f5130 = c15553;
        this.f5132 = list;
        this.f5131 = z;
    }

    @Override // l.AbstractC0726
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC4534 mo3050(String str) {
        Iterator it = this.f5132.iterator();
        while (it.hasNext()) {
            str = ((InterfaceC2963) it.next()).mo9651(str);
        }
        return this.f5129.m53443(str);
    }

    @Override // l.AbstractC0726
    /* JADX INFO: renamed from: ۙ */
    public final Spanned mo3049(TextView textView, AbstractC4534 abstractC4534) {
        List list = this.f5132;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((InterfaceC2963) it.next()).mo9657(textView);
        }
        C15553 c15553 = this.f5130;
        InterfaceC20029 interfaceC20029M17054 = ((C5859) c15553.f50596).m17054(c15553.f50597, new C17791());
        abstractC4534.mo2667(interfaceC20029M17054);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ((InterfaceC2963) it2.next()).mo8846(interfaceC20029M17054);
        }
        return ((C2130) interfaceC20029M17054).builder().m47530();
    }

    @Override // l.AbstractC0726
    /* JADX INFO: renamed from: ۙ */
    public final void mo3052(TextView textView, String str) {
        Spanned spannedMo3049 = mo3049(textView, mo3050(str));
        if (TextUtils.isEmpty(spannedMo3049) && this.f5131 && !TextUtils.isEmpty(str)) {
            spannedMo3049 = new SpannableStringBuilder(str);
        }
        mo3051(textView, (SpannableStringBuilder) spannedMo3049);
    }

    @Override // l.AbstractC0726
    /* JADX INFO: renamed from: ۙ */
    public final void mo3051(TextView textView, SpannableStringBuilder spannableStringBuilder) {
        List list = this.f5132;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((InterfaceC2963) it.next()).mo9653(textView, spannableStringBuilder);
        }
        textView.setText(spannableStringBuilder, this.f5128);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ((InterfaceC2963) it2.next()).mo9652(textView);
        }
    }
}
