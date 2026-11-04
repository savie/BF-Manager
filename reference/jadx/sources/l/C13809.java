package l;

import android.text.TextUtils;
import bin.mt.plugin.api.ui.PluginProgressBar;
import bin.mt.plugin.api.util.Consumer;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.۬ۧۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51FV */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C13809 implements InterfaceC2017, InterfaceC17544, Consumer, InterfaceC24044 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f43793;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f43794;

    public /* synthetic */ C13809(int i, Object obj) {
        this.f43793 = i;
        this.f43794 = obj;
    }

    @Override // bin.mt.plugin.api.util.Consumer
    public void accept(Object obj) {
        ((PluginProgressBar) this.f43794).setSecondaryProgress(((Integer) obj).intValue());
    }

    @Override // l.InterfaceC17544
    /* JADX INFO: renamed from: ۙ */
    public void mo1209(int i) {
        switch (this.f43793) {
            case 0:
                ((InterfaceC4115) this.f43794).mo13205(i);
                break;
            case 1:
            default:
                ((C10257) this.f43794).mo16839(i);
                break;
            case 2:
                ((C7738) this.f43794).mo16839(i);
                break;
        }
    }

    @Override // l.InterfaceC2017
    /* JADX INFO: renamed from: ᩷ */
    public void mo1355(Object obj, Throwable th) {
        C24238.m54223((C24238) this.f43794, th);
    }

    @Override // l.InterfaceC24044
    /* JADX INFO: renamed from: ۙ */
    public CharSequence mo6271(C3906 c3906) {
        C18394 c18394 = (C18394) this.f43794;
        c18394.getClass();
        int iM14043 = C4422.m14043();
        String[] strArrM54845 = C24560.m54845(c18394.m12560());
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 3; i++) {
            if (((1 << i) & iM14043) != 0) {
                arrayList.add(strArrM54845[i]);
            }
        }
        return arrayList.isEmpty() ? c18394.m12560().getString(R.string.MT_Protector) : TextUtils.join(", ", arrayList);
    }
}
