package l;

import java.text.SimpleDateFormat;
import java.util.Locale;

/* JADX INFO: renamed from: l.۠۟᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 052E */
/* JADX INFO: loaded from: classes3.dex */
public final class C8038 extends AbstractDialogInterfaceOnClickListenerC17341 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public SimpleDateFormat f28142;

    @Override // l.AbstractDialogInterfaceOnClickListenerC17341
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1069() {
        String strM40352 = m40352();
        if (strM40352.trim().isEmpty()) {
            m40364();
            return;
        }
        try {
            new SimpleDateFormat(strM40352, Locale.ENGLISH);
            ApplicationC0716.f2992.edit().putString("rdtp", strM40352).apply();
            m40364();
        } catch (Exception unused) {
        }
    }
}
