package l;

import java.text.SimpleDateFormat;
import java.util.Locale;

/* JADX INFO: renamed from: l.ۨ֨ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 052E */
/* JADX INFO: loaded from: classes4.dex */
public final class C12015 extends AbstractDialogInterfaceOnClickListenerC8552 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public SimpleDateFormat f38746;

    @Override // l.AbstractDialogInterfaceOnClickListenerC8552
    /* JADX INFO: renamed from: ܶ */
    public final void mo1877() {
        String strM22914 = m22914();
        if (strM22914.trim().isEmpty()) {
            m22951();
            return;
        }
        try {
            new SimpleDateFormat(strM22914, Locale.ENGLISH);
            ApplicationC17729.f58258.edit().putString("rdtp", strM22914).apply();
            m22951();
        } catch (Exception unused) {
        }
    }
}
