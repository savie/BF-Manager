package l;

import android.content.DialogInterface;
import android.widget.EditText;
import bin.mt.plus.R;
import com.umeng.commonsdk.framework.UMModuleRegister;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۜᩳ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 27JL */
/* JADX INFO: loaded from: classes3.dex */
public final class C6918 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC12483 f23258;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f23259;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ EditText f23260;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public String f23261;

    public C6918(AbstractActivityC12483 abstractActivityC12483, String str, EditText editText) {
        this.f23258 = abstractActivityC12483;
        this.f23259 = str;
        this.f23260 = editText;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        m10246(this.f23258, R.string.MT_Protector);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() throws IOException {
        String strM46730 = C5553.m15313(this.f23259, new String[0]).m46730();
        this.f23261 = strM46730;
        if (strM46730.length() > 20480) {
            this.f23261 = this.f23261.substring(0, UMModuleRegister.PUSH_EVENT_VALUE_HIGH);
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        this.f23260.setText(this.f23261);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        this.f23258.m31002(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        m10251();
    }
}
