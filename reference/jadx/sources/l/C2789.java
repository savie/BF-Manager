package l;

import android.widget.EditText;
import java.util.List;

/* JADX INFO: renamed from: l.ۖ᩸֨, reason: contains not printable characters */
/* JADX INFO: compiled from: H88G */
/* JADX INFO: loaded from: classes3.dex */
public final class C2789 extends AbstractC7023 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC9141 f10626;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ EditText f10627;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ EditText f10628;

    @Override // l.InterfaceC23252
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List mo8481() {
        return this.f10626.mo11851(this.f10628.getText().toString(), this.f10627.getText().toString());
    }

    public C2789(AbstractC9141 abstractC9141, EditText editText, EditText editText2) {
        this.f10626 = abstractC9141;
        this.f10628 = editText;
        this.f10627 = editText2;
    }
}
