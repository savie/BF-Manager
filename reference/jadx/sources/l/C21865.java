package l;

import android.widget.EditText;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩸᩹ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AWI */
/* JADX INFO: loaded from: classes5.dex */
public final class C21865 extends AbstractC21013 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18337 f70952;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21865(C18337 c18337, AbstractActivityC12483 abstractActivityC12483) {
        super(abstractActivityC12483);
        this.f70952 = c18337;
    }

    @Override // l.AbstractC21013
    /* JADX INFO: renamed from: ۨ */
    public final boolean mo13875() {
        EditText editTextM47193;
        try {
            int i = Integer.parseInt(m47193(0).getText().toString());
            try {
                int i2 = Integer.parseInt(m47193(1).getText().toString());
                int i3 = C7754.f25604;
                if (i < 1) {
                    i = 1;
                }
                if (i2 < i) {
                    i2 = i;
                }
                ApplicationC0716.f2992.edit().mo4065(i, "text_function_min_line").mo4065(i2, "text_function_max_line").apply();
                C7754.m20401();
                this.f70952.m42582();
                return true;
            } catch (NumberFormatException unused) {
                C15829.m37611(R.string.MT_Protector);
                editTextM47193 = m47193(1);
                editTextM47193.setSelection(0, editTextM47193.length());
                editTextM47193.requestFocus();
                return false;
            }
        } catch (NumberFormatException unused2) {
            C15829.m37611(R.string.MT_Protector);
            editTextM47193 = m47193(0);
        }
    }
}
