package l;

import android.widget.EditText;

/* JADX INFO: renamed from: l.ۚ᩵֨, reason: contains not printable characters */
/* JADX INFO: compiled from: QA0A */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C5549 implements InterfaceC17295 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ EditText f19039;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ EditText f19040;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ EditText f19041;

    public /* synthetic */ C5549(EditText editText, EditText editText2, EditText editText3) {
        this.f19039 = editText;
        this.f19041 = editText2;
        this.f19040 = editText3;
    }

    @Override // l.InterfaceC17295
    public final void accept(Object obj) {
        C18955 c18955 = (C18955) obj;
        this.f19039.setText(c18955.m43662());
        this.f19041.setText(String.valueOf(c18955.m43663()));
        this.f19040.setText(c18955.m43664());
    }
}
