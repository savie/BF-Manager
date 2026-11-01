package l;

import android.text.Editable;
import android.text.TextWatcher;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* JADX INFO: renamed from: l.ᩳ۟᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 052E */
/* JADX INFO: loaded from: classes4.dex */
public final class C17915 implements TextWatcher {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8038 f56904;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C17915(C8038 c8038) {
        this.f56904 = c8038;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        C8038 c8038 = this.f56904;
        try {
            c8038.f28142 = new SimpleDateFormat(editable.toString(), Locale.ENGLISH);
            c8038.m40359(C20368.f65970);
            c8038.m40347(c8038.f28142.format(Long.valueOf(System.currentTimeMillis())));
        } catch (Exception e) {
            c8038.f28142 = null;
            c8038.m40359(C20368.f65966);
            c8038.m40347(e.getMessage());
        }
    }
}
