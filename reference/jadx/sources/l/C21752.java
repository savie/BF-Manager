package l;

import android.widget.BaseAdapter;
import android.widget.Spinner;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩷ۖۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5BW */
/* JADX INFO: loaded from: classes.dex */
public final class C21752 implements InterfaceC12314 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f69373;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24736 f69374;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Spinner f69375;

    @Override // l.InterfaceC12314
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo29776(InterfaceC11217 interfaceC11217) {
    }

    @Override // l.InterfaceC12314
    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ void mo29778(InterfaceC11217 interfaceC11217) {
    }

    @Override // l.InterfaceC12314
    /* JADX INFO: renamed from: ᩴ */
    public final /* synthetic */ void mo29779(InterfaceC11217 interfaceC11217) {
    }

    @Override // l.InterfaceC12314
    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ void mo29781(InterfaceC11217 interfaceC11217) {
    }

    public C21752(String str, Spinner spinner, C24736 c24736) {
        this.f69375 = spinner;
        this.f69374 = c24736;
        this.f69373 = str;
    }

    @Override // l.InterfaceC12314
    /* JADX INFO: renamed from: ۤ */
    public final void mo29777(InterfaceC11217 interfaceC11217) {
        try {
            this.f69373 = ((AbstractC14806) C16530.f53509.get(this.f69375.getSelectedItemPosition())).mo11753();
        } catch (Exception unused) {
        }
    }

    @Override // l.InterfaceC12314
    /* JADX INFO: renamed from: ᩷ */
    public final void mo29780(InterfaceC11217 interfaceC11217) {
        C24736 c24736 = this.f69374;
        Spinner spinner = this.f69375;
        try {
            if (((AbstractC14806) C16530.f53509.get(spinner.getSelectedItemPosition())).mo11753().equals(this.f69373)) {
                C24736.m55238(c24736);
                return;
            }
        } catch (Exception unused) {
        }
        int i = 0;
        if (!this.f69373.isEmpty()) {
            int i2 = 0;
            while (true) {
                ArrayList arrayList = C16530.f53509;
                if (i2 >= arrayList.size()) {
                    break;
                }
                if (((AbstractC14806) arrayList.get(i2)).mo11753().equals(this.f69373)) {
                    i = i2;
                    break;
                }
                i2++;
            }
        }
        ((BaseAdapter) spinner.getAdapter()).notifyDataSetChanged();
        spinner.setSelection(i);
        C24736.m55238(c24736);
    }
}
