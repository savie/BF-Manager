package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.google.android.material.textfield.TextInputLayout;
import java.io.IOException;
import java.util.List;

/* JADX INFO: renamed from: l.ۢۨ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: J951 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9556 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21986 f32255;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceC19356 f32256;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ EditText f32257;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ CheckBox f32258;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f32259;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f32260;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21422 f32261;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Main f32262;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextInputLayout f32263;

    public C9556(Main main, C21422 c21422, String str, DialogInterfaceC19356 dialogInterfaceC19356, C21986 c21986, CheckBox checkBox, View view, TextInputLayout textInputLayout, EditText editText) {
        this.f32262 = main;
        this.f32261 = c21422;
        this.f32259 = str;
        this.f32256 = dialogInterfaceC19356;
        this.f32255 = c21986;
        this.f32258 = checkBox;
        this.f32260 = view;
        this.f32263 = textInputLayout;
        this.f32257 = editText;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        m10252(this.f32262, 250);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() throws IOException {
        List listM47979 = this.f32261.m47979();
        int i = 0;
        while (i < listM47979.size()) {
            final AbstractC20745 abstractC20745Mo7989 = ((InterfaceC2557) listM47979.get(i)).mo7989();
            final boolean z = i == 0;
            try {
                C19431.m44468(new C8101(abstractC20745Mo7989, this.f32259, new InterfaceC23949() { // from class: l.֫ۨ֨
                    @Override // l.InterfaceC23949
                    public final Object get() {
                        return z ? new C17978() : new C17978(abstractC20745Mo7989.getName());
                    }
                }));
                i++;
            } catch (IOException e) {
                if ("Bad magic".equals(e.getMessage())) {
                    if (listM47979.size() == 1) {
                        throw new C8142(R.string.MT_Protector);
                    }
                    throw new C8142(C16737.m39288(R.string.MT_Protector) + ": " + abstractC20745Mo7989.getName());
                }
                throw e;
            }
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        this.f32256.dismiss();
        C21986 c21986 = this.f32255;
        boolean z = c21986.f71306;
        CheckBox checkBox = this.f32258;
        if (z != checkBox.isChecked()) {
            c21986.f71306 = checkBox.isChecked();
            c21986.m48810();
        }
        int i = C20725.f67443;
        C10142 c10142 = new C10142(C13520.class);
        C21422 c21422 = this.f32261;
        c10142.m25777(c21422);
        c10142.m25772(c21422.m47979());
        c10142.m25768("password", this.f32259);
        c10142.m25769("removeSource", checkBox.isChecked());
        c10142.m25763();
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        this.f32260.setEnabled(true);
        if (exc instanceof C8142) {
            this.f32263.setError(exc.getMessage());
            this.f32257.requestFocus();
        } else {
            this.f32262.m31002(exc, (DialogInterface.OnDismissListener) null);
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        m10251();
    }
}
