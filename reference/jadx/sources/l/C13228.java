package l;

import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import java.util.Map;

/* JADX INFO: renamed from: l.۬ܽ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 75VW */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C13228 implements InterfaceC0166, InterfaceC4509 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f43981;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f43982;

    public /* synthetic */ C13228(Object obj, Object obj2) {
        this.f43981 = obj;
        this.f43982 = obj2;
    }

    @Override // l.InterfaceC0166
    /* JADX INFO: renamed from: ۙ */
    public InterfaceC0166 mo1320() {
        return this;
    }

    @Override // l.InterfaceC0166
    /* JADX INFO: renamed from: ۙ */
    public InterfaceC0166 mo1321(C11164 c11164) {
        return this;
    }

    @Override // l.InterfaceC0166
    /* JADX INFO: renamed from: ۙ */
    public InterfaceC0166 mo1322(boolean z) {
        return this;
    }

    @Override // l.InterfaceC4509
    /* JADX INFO: renamed from: ۙ */
    public void mo4354(TextView textView) {
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) this.f43981;
        C12107 c12107 = (C12107) this.f43982;
        textView.setText(spannableStringBuilder);
        C0674.m3027(textView);
        textView.setOnClickListener(new ViewOnClickListenerC2702(4, c12107));
    }

    @Override // l.InterfaceC0166
    /* JADX INFO: renamed from: ۙ */
    public InterfaceC10045[] mo1323(Uri uri, Map map) {
        return C1598.m5442((C1598) this.f43981, (C7648) this.f43982);
    }
}
