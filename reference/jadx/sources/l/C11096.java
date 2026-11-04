package l;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: l.ۤ᩵ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 014Z */
/* JADX INFO: loaded from: classes3.dex */
public final class C11096 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3054 f34998;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13334 f34999;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3054 f35000;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2390 f35001;

    public C11096(C13334 c13334, C2390 c2390, C3054 c3054, C3054 c3055) {
        this.f34999 = c13334;
        this.f35001 = c2390;
        this.f35000 = c3054;
        this.f34998 = c3055;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        InterfaceC22285 interfaceC22285 = (InterfaceC22285) this.f35001.getItem(i);
        C13334 c13334 = this.f34999;
        c13334.f42531 = interfaceC22285;
        if (interfaceC22285 == null) {
            onNothingSelected(adapterView);
            return;
        }
        c13334.m32914();
        c13334.mo22489(i);
        ApplicationC17729.f58258.edit().putString("text_translator_engine", interfaceC22285.getId()).apply();
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        C13334 c13334 = this.f34999;
        c13334.f42531 = null;
        C13334.m32907(this.f35000, "");
        C13334.m32907(this.f34998, "");
        c13334.mo22489(-1);
    }
}
