package l;

import android.net.Uri;
import android.widget.Button;
import android.widget.TextView;
import java.util.Map;

/* JADX INFO: renamed from: l.ۙۖ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: V8F2 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C4601 implements InterfaceC1603, InterfaceC19474, InterfaceC4232 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f16326;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f16327;

    public /* synthetic */ C4601(Object obj, Object obj2) {
        this.f16326 = obj;
        this.f16327 = obj2;
    }

    @Override // l.InterfaceC1603
    /* JADX INFO: renamed from: ۙ */
    public InterfaceC1603 mo5614() {
        return this;
    }

    @Override // l.InterfaceC1603
    /* JADX INFO: renamed from: ۙ */
    public InterfaceC1603 mo5615(C3509 c3509) {
        return this;
    }

    @Override // l.InterfaceC1603
    /* JADX INFO: renamed from: ۙ */
    public InterfaceC1603 mo5616(boolean z) {
        return this;
    }

    @Override // l.InterfaceC4232
    /* JADX INFO: renamed from: ۙ */
    public EnumC4695 mo11179(EnumC4695 enumC4695) {
        C10132.m26130((C7150) this.f16326, (C17973) this.f16327, enumC4695);
        return enumC4695;
    }

    @Override // l.InterfaceC19474
    /* JADX INFO: renamed from: ۙ */
    public void mo12172(TextView textView, TextView textView2, Button button) {
        String str = (String) this.f16326;
        String str2 = (String) this.f16327;
        ViewOnClickListenerC15284.m36687(textView, str);
        ViewOnClickListenerC15284.m36687(textView2, str2);
        button.setVisibility(4);
    }

    @Override // l.InterfaceC1603
    /* JADX INFO: renamed from: ۙ */
    public InterfaceC22486[] mo5617(Uri uri, Map map) {
        return C12131.m30323((C12131) this.f16326, (C15648) this.f16327);
    }
}
