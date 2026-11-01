package l;

import android.widget.BaseAdapter;
import android.widget.Spinner;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۙܳۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5BW */
/* JADX INFO: loaded from: classes3.dex */
public class C4707 implements InterfaceC7296 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6824 f16612;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public String f16613;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Spinner f16614;

    @Override // l.InterfaceC7296
    /* JADX INFO: renamed from: ۖ */
    public final /* synthetic */ void mo10182(InterfaceC1423 interfaceC1423) {
    }

    @Override // l.InterfaceC7296
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo10183(InterfaceC1423 interfaceC1423) {
    }

    @Override // l.InterfaceC7296
    /* JADX INFO: renamed from: ۚ */
    public final /* synthetic */ void mo10184(InterfaceC1423 interfaceC1423) {
    }

    @Override // l.InterfaceC7296
    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ void mo10187(InterfaceC1423 interfaceC1423) {
    }

    public C4707(String str, Spinner spinner, C6824 c6824) {
        this.f16614 = spinner;
        this.f16612 = c6824;
        this.f16613 = str;
    }

    @Override // l.InterfaceC7296
    /* JADX INFO: renamed from: ۨ */
    public final void mo10185(InterfaceC1423 interfaceC1423) {
        try {
            this.f16613 = ((AbstractC17131) C23053.f74904.get(this.f16614.getSelectedItemPosition())).mo1456();
        } catch (Exception unused) {
        }
    }

    @Override // l.InterfaceC7296
    /* JADX INFO: renamed from: ܰ */
    public final void mo10186(InterfaceC1423 interfaceC1423) {
        C6824 c6824 = this.f16612;
        Spinner spinner = this.f16614;
        try {
            if (((AbstractC17131) C23053.f74904.get(spinner.getSelectedItemPosition())).mo1456().equals(this.f16613)) {
                C6824.m18425(c6824);
                return;
            }
        } catch (Exception unused) {
        }
        int i = 0;
        if (!this.f16613.isEmpty()) {
            int i2 = 0;
            while (true) {
                ArrayList arrayList = C23053.f74904;
                if (i2 >= arrayList.size()) {
                    break;
                }
                if (((AbstractC17131) arrayList.get(i2)).mo1456().equals(this.f16613)) {
                    i = i2;
                    break;
                }
                i2++;
            }
        }
        ((BaseAdapter) spinner.getAdapter()).notifyDataSetChanged();
        spinner.setSelection(i);
        C6824.m18425(c6824);
    }
}
