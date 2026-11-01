package l;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: l.ܺᩴۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 014Z */
/* JADX INFO: loaded from: classes4.dex */
public final class C16116 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0733 f52099;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12588 f52100;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0733 f52101;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18938 f52102;

    public C16116(C12588 c12588, C18938 c18938, C0733 c0733, C0733 c0734) {
        this.f52100 = c12588;
        this.f52102 = c18938;
        this.f52099 = c0733;
        this.f52101 = c0734;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        InterfaceC7649 interfaceC7649 = (InterfaceC7649) this.f52102.getItem(i);
        C12588 c12588 = this.f52100;
        c12588.f42072 = interfaceC7649;
        if (interfaceC7649 == null) {
            onNothingSelected(adapterView);
            return;
        }
        c12588.m31323();
        c12588.mo21877(i);
        ApplicationC0716.f2992.edit().putString("text_translator_engine", interfaceC7649.getId()).apply();
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        C12588 c12588 = this.f52100;
        c12588.f42072 = null;
        C12588.m31313(this.f52099, "");
        C12588.m31313(this.f52101, "");
        c12588.mo21877(-1);
    }
}
