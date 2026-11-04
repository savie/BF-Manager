package l;

import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۨᩴۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: N9TB */
/* JADX INFO: loaded from: classes4.dex */
public class C12559 extends AbstractC11813 {
    public C12559(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m12575((InterfaceC24044) new C1793(this));
    }

    public C12559(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m12575((InterfaceC24044) new C1793(this));
    }

    public C12559(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m12575((InterfaceC24044) new C1793(this));
    }

    public C12559(Context context) {
        super(context);
        m12575((InterfaceC24044) new C1793(this));
    }

    @Override // l.AbstractC11813
    /* JADX INFO: renamed from: ۙ */
    public final void mo2388(AbstractActivityC17204 abstractActivityC17204) {
        m31259(abstractActivityC17204, m12578(), m29658().getString(m12557(), "10MB"), new C20764(0, this));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m31258(C12559 c12559, String str) {
        try {
            c12559.m29658().edit().putString(c12559.m12557(), str).apply();
            c12559.mo7306();
            C23026.m51926();
        } catch (NumberFormatException unused) {
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m31259(AbstractActivityC17204 abstractActivityC17204, CharSequence charSequence, String str, InterfaceC0818 interfaceC0818) {
        View viewM40395 = abstractActivityC17204.m40395(R.layout.MT_Protector);
        C23255 c23255 = (C23255) viewM40395.findViewById(R.id.MT_Protector);
        Spinner spinner = (Spinner) viewM40395.findViewById(R.id.spinner);
        spinner.setAdapter((SpinnerAdapter) new C3054(abstractActivityC17204, new String[]{"MB", "KB"}));
        if (str.endsWith("KB")) {
            spinner.setSelection(1);
        }
        try {
            c23255.mo52335((CharSequence) String.valueOf(Integer.parseInt(str.substring(0, str.length() - 2))));
        } catch (NumberFormatException unused) {
            c23255.mo52335((CharSequence) "10");
            spinner.setSelection(0);
        }
        c23255.m52289();
        C2361 c2361BuildDialog = abstractActivityC17204.buildDialog();
        c2361BuildDialog.m8024(charSequence);
        c2361BuildDialog.m8005(viewM40395);
        c2361BuildDialog.m8026(R.string.MT_Protector, new DialogInterfaceOnClickListenerC21995(c23255, spinner, interfaceC0818, 1));
        c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c2361BuildDialog.m8016();
        C21576.m49090(c23255);
    }
}
