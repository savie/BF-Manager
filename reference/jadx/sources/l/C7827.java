package l;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.widget.TextView;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.۠֡ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: M903 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7827 extends AbstractC14883 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final List f25759;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final TextView.BufferType f25760;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C16999 f25761;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C4590 f25762;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f25763;

    public C7827(TextView.BufferType bufferType, C4590 c4590, C16999 c16999, List list, boolean z) {
        this.f25760 = bufferType;
        this.f25762 = c4590;
        this.f25761 = c16999;
        this.f25759 = list;
        this.f25763 = z;
    }

    @Override // l.AbstractC14883
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC19367 mo20651(String str) {
        Iterator it = this.f25759.iterator();
        while (it.hasNext()) {
            str = ((InterfaceC8533) it.next()).mo3307(str);
        }
        return this.f25762.m12737(str);
    }

    @Override // l.AbstractC14883
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Spanned mo20650(TextView textView, AbstractC19367 abstractC19367) {
        List list = this.f25759;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((InterfaceC8533) it.next()).mo1047(textView);
        }
        C16999 c16999 = this.f25761;
        InterfaceC12061 interfaceC12061M26839 = ((C10650) c16999.f54347).m26839(c16999.f54348, new C2887());
        abstractC19367.mo3851(interfaceC12061M26839);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ((InterfaceC8533) it2.next()).mo3311(interfaceC12061M26839);
        }
        return ((C23350) interfaceC12061M26839).builder().m8184();
    }

    @Override // l.AbstractC14883
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo20653(TextView textView, String str) {
        Spanned spannedMo20650 = mo20650(textView, mo20651(str));
        if (TextUtils.isEmpty(spannedMo20650) && this.f25763 && !TextUtils.isEmpty(str)) {
            spannedMo20650 = new SpannableStringBuilder(str);
        }
        mo20652(textView, (SpannableStringBuilder) spannedMo20650);
    }

    @Override // l.AbstractC14883
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo20652(TextView textView, SpannableStringBuilder spannableStringBuilder) {
        List list = this.f25759;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((InterfaceC8533) it.next()).mo1042(textView, spannableStringBuilder);
        }
        textView.setText(spannableStringBuilder, this.f25760);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ((InterfaceC8533) it2.next()).mo3308(textView);
        }
    }
}
