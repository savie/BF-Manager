package l;

import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.TextView;
import com.umeng.analytics.pro.d;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.۠ᩴۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: N15M */
/* JADX INFO: loaded from: classes3.dex */
public final class C8355 extends C12588 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextView f28973;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ProgressBar f28974;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextView f28975;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0763 f28976;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19644 f28977;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18938 f28978;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextView f28979;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextView f28980;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0763 f28981;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceC19356 f28982;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8355(Spinner spinner, C18938 c18938, Spinner spinner2, C0733 c0733, Spinner spinner3, C0733 c0734, View view, TextView textView, C0763 c0763, C19644 c19644, C0763 c0764, TextView textView2, TextView textView3, TextView textView4, ProgressBar progressBar, DialogInterfaceC19356 dialogInterfaceC19356) {
        super(spinner, c18938, spinner2, c0733, spinner3, c0734, view);
        this.f28978 = c18938;
        this.f28973 = textView;
        this.f28981 = c0763;
        this.f28977 = c19644;
        this.f28976 = c0764;
        this.f28980 = textView2;
        this.f28975 = textView3;
        this.f28979 = textView4;
        this.f28974 = progressBar;
        this.f28982 = dialogInterfaceC19356;
    }

    @Override // l.C12588
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo21878(InterfaceC17526 interfaceC17526) {
        C13465.m32966(interfaceC17526, d.R);
        String id = interfaceC17526.getId();
        C0763 c0763 = this.f28981;
        if (C13465.m32965(c0763.f3078, (Object) id)) {
            return;
        }
        C13465.m32962((Object) id);
        c0763.f3078 = id;
        C19644 c19644 = this.f28977;
        AtomicInteger atomicInteger = c19644.f63084;
        String str = (String) this.f28976.f3078;
        AbstractActivityC12483 abstractActivityC12483 = c19644.f63080;
        TextView textView = this.f28980;
        C13465.m32962((Object) textView);
        TextView textView2 = this.f28975;
        C13465.m32962((Object) textView2);
        TextView textView3 = this.f28979;
        C13465.m32962((Object) textView3);
        ProgressBar progressBar = this.f28974;
        C13465.m32962((Object) progressBar);
        Button buttonM44374 = this.f28982.m44374();
        C13465.m32967(buttonM44374, "getNegativeButton(...)");
        new C15411(interfaceC17526, atomicInteger, str, abstractActivityC12483, textView, textView2, textView3, progressBar, buttonM44374).m10243();
    }

    @Override // l.C12588
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo21877(int i) {
        InterfaceC7649 interfaceC7649 = i == -1 ? null : (InterfaceC7649) this.f28978.getItem(i);
        TextView textView = this.f28973;
        if (interfaceC7649 == null) {
            textView.setText("-- NULL --");
            return;
        }
        SpannableString spannableString = new SpannableString(interfaceC7649.toString());
        spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
        textView.setText(spannableString);
    }
}
