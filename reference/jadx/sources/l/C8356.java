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

/* JADX INFO: renamed from: l.۠ۗᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N15M */
/* JADX INFO: loaded from: classes4.dex */
public final class C8356 extends C13334 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ProgressBar f27405;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24941 f27406;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24941 f27407;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextView f27408;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6865 f27409;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2390 f27410;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceC8327 f27411;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextView f27412;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextView f27413;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextView f27414;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8356(Spinner spinner, C2390 c2390, Spinner spinner2, C3054 c3054, Spinner spinner3, C3054 c3055, View view, TextView textView, C24941 c24941, C6865 c6865, C24941 c24942, TextView textView2, TextView textView3, TextView textView4, ProgressBar progressBar, DialogInterfaceC8327 dialogInterfaceC8327) {
        super(spinner, c2390, spinner2, c3054, spinner3, c3055, view);
        this.f27410 = c2390;
        this.f27414 = textView;
        this.f27406 = c24941;
        this.f27409 = c6865;
        this.f27407 = c24942;
        this.f27412 = textView2;
        this.f27408 = textView3;
        this.f27413 = textView4;
        this.f27405 = progressBar;
        this.f27411 = dialogInterfaceC8327;
    }

    @Override // l.C13334
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo22490(InterfaceC5877 interfaceC5877) {
        C15243.m36590(interfaceC5877, d.R);
        String id = interfaceC5877.getId();
        C24941 c24941 = this.f27406;
        if (C15243.m36589(c24941.f80717, (Object) id)) {
            return;
        }
        C15243.m36586((Object) id);
        c24941.f80717 = id;
        C6865 c6865 = this.f27409;
        AtomicInteger atomicInteger = c6865.f22794;
        String str = (String) this.f27407.f80717;
        AbstractActivityC17204 abstractActivityC17204 = c6865.f22791;
        TextView textView = this.f27412;
        C15243.m36586((Object) textView);
        TextView textView2 = this.f27408;
        C15243.m36586((Object) textView2);
        TextView textView3 = this.f27413;
        C15243.m36586((Object) textView3);
        ProgressBar progressBar = this.f27405;
        C15243.m36586((Object) progressBar);
        Button buttonM22433 = this.f27411.m22433();
        C15243.m36591(buttonM22433, "getNegativeButton(...)");
        new C9847(interfaceC5877, atomicInteger, str, abstractActivityC17204, textView, textView2, textView3, progressBar, buttonM22433).m8197();
    }

    @Override // l.C13334
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo22489(int i) {
        InterfaceC22285 interfaceC22285 = i == -1 ? null : (InterfaceC22285) this.f27410.getItem(i);
        TextView textView = this.f27414;
        if (interfaceC22285 == null) {
            textView.setText("-- NULL --");
            return;
        }
        SpannableString spannableString = new SpannableString(interfaceC22285.toString());
        spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
        textView.setText(spannableString);
    }
}
