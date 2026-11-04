package l;

import android.content.SharedPreferences;
import android.graphics.Typeface;

/* JADX INFO: renamed from: l.֡᩷᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 27EO */
/* JADX INFO: loaded from: classes2.dex */
public final class C0706 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final AbstractC22044 f2621 = C6382.f21568.m49876("term_text_font_custom.dat");

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C2310 f2622;

    /* JADX WARN: Code duplicated, block: B:19:0x0061  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a3  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Typeface m3027() {
        int i;
        C2310 c2310;
        SharedPreferences sharedPreferences = C21576.f68932;
        int i2 = 0;
        try {
            i = sharedPreferences.getInt("term_text_font", 0);
        } catch (ClassCastException unused) {
            try {
                i = Integer.parseInt(sharedPreferences.getString("term_text_font", null));
                sharedPreferences.edit().putInt("term_text_font", i).apply();
            } catch (Exception unused2) {
                sharedPreferences.edit().remove("term_text_font").apply();
                i = 0;
            }
        }
        if (i == 1) {
            if (C21576.f68932.getString("term_text_font_custom_md5", "").isEmpty() || !f2621.mo2934()) {
                sharedPreferences.edit().remove("term_text_font").apply();
            } else {
                i2 = i;
            }
        } else if (i != 0) {
            sharedPreferences.edit().remove("term_text_font").apply();
        } else {
            i2 = i;
        }
        if (i2 != 1) {
            return C21576.m49083();
        }
        synchronized (C0706.class) {
            String string = C21576.f68932.getString("term_text_font_custom_md5", "");
            c2310 = f2622;
            if (c2310 == null || !((String) c2310.f7473).equals(string)) {
                Typeface typefaceM49083 = C21576.m49083();
                if (string.isEmpty()) {
                    string = "";
                } else {
                    AbstractC22044 abstractC22044 = f2621;
                    if (abstractC22044.mo2934()) {
                        try {
                            Typeface typefaceCreateFromFile = Typeface.createFromFile(abstractC22044.mo4294());
                            if (typefaceCreateFromFile != null && typefaceCreateFromFile != Typeface.DEFAULT) {
                                typefaceM49083 = typefaceCreateFromFile;
                            }
                        } catch (Exception unused3) {
                        }
                    } else {
                        string = "";
                    }
                }
                C2310 c2311 = new C2310(string, typefaceM49083);
                f2622 = c2311;
                c2310 = c2311;
            }
        }
        return (Typeface) c2310.f7474;
    }
}
