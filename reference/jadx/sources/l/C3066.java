package l;

import android.text.Editable;
import android.text.TextWatcher;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* JADX INFO: renamed from: l.ۗ֨ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 052E */
/* JADX INFO: loaded from: classes2.dex */
public final class C3066 implements TextWatcher {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12015 f9936;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C3066(C12015 c12015) {
        this.f9936 = c12015;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        C12015 c12015 = this.f9936;
        try {
            c12015.f38746 = new SimpleDateFormat(editable.toString(), Locale.ENGLISH);
            c12015.m22925((String) null);
            c12015.m22954(c12015.f38746.format(Long.valueOf(System.currentTimeMillis())));
        } catch (Exception e) {
            c12015.f38746 = null;
            c12015.m22954((String) null);
            c12015.m22925(e.getMessage());
        }
    }
}
