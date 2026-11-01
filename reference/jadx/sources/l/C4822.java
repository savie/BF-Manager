package l;

import android.content.DialogInterface;
import android.widget.EditText;
import bin.mt.plus.R;
import com.umeng.commonsdk.framework.UMModuleRegister;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۙᩴ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 1AFL */
/* JADX INFO: loaded from: classes3.dex */
public final class C4822 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC12483 f16962;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f16963;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ EditText f16964;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public String f16965;

    public C4822(AbstractActivityC12483 abstractActivityC12483, String str, EditText editText) {
        this.f16962 = abstractActivityC12483;
        this.f16963 = str;
        this.f16964 = editText;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        m10246(this.f16962, R.string.MT_Protector);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() throws IOException {
        String strM46730 = C5553.m15313(this.f16963, new String[0]).m46730();
        this.f16965 = strM46730;
        if (strM46730.length() > 20480) {
            this.f16965 = this.f16965.substring(0, UMModuleRegister.PUSH_EVENT_VALUE_HIGH);
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        this.f16964.setText(this.f16965);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        this.f16962.m31002(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        m10251();
    }
}
