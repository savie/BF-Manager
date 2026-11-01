package l;

import android.content.DialogInterface;
import android.widget.EditText;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.alipay.sdk.m.m.b;
import com.umeng.commonsdk.utils.UMUtils;

/* JADX INFO: renamed from: l.ۢܺ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: X5CP */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC9699 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f32679;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f32680;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f32681;

    public /* synthetic */ DialogInterfaceOnClickListenerC9699(int i, Object obj, Object obj2) {
        this.f32680 = i;
        this.f32681 = obj;
        this.f32679 = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0062 A[PHI: r9
      0x0062: PHI (r9v5 bin.mt.plus.Main) = (r9v4 bin.mt.plus.Main), (r9v7 bin.mt.plus.Main) binds: [B:24:0x0060, B:18:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        Main mainM28824;
        switch (this.f32680) {
            case 0:
                Main main = (Main) this.f32681;
                InterfaceC4883 interfaceC4883 = (InterfaceC4883) this.f32679;
                if (C10405.m26300(main, UMUtils.SD_PERMISSION) != 0) {
                    interfaceC4883.mo13590();
                } else {
                    interfaceC4883.onSuccess();
                }
                break;
            case 1:
                C11545 c11545 = (C11545) this.f32681;
                InterfaceC2557 interfaceC2557 = (InterfaceC2557) this.f32679;
                dialogInterface.dismiss();
                if (i == 0) {
                    C8265.m21677(c11545, interfaceC2557, new C1188(c11545));
                } else if (i == 1) {
                    C8265.m21677(c11545, interfaceC2557, new C21778(3, c11545));
                } else {
                    int i2 = R.string.MT_Protector;
                    if (i == 2) {
                        if (c11545.m28814("local")) {
                            C8265.m21677(c11545, interfaceC2557, new C1438(c11545));
                        } else {
                            boolean zM28814 = c11545.m28814(b.k);
                            mainM28824 = c11545.m28824();
                            if (zM28814) {
                                i2 = R.string.MT_Protector;
                            }
                        }
                        break;
                    } else if (i == 3) {
                        if (c11545.m28814("local")) {
                            C8265.m21677(c11545, interfaceC2557, new C23340(c11545));
                        } else {
                            boolean zM28815 = c11545.m28814(b.k);
                            mainM28824 = c11545.m28824();
                            if (zM28815) {
                                i2 = R.string.MT_Protector;
                            }
                        }
                        break;
                    }
                    mainM28824.m30996(R.string.MT_Protector, i2, false);
                }
                break;
            default:
                ((EditText) this.f32681).setText(((String[]) this.f32679)[i]);
                dialogInterface.dismiss();
                break;
        }
    }
}
