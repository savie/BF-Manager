package l;

import android.content.SharedPreferences;
import android.graphics.Typeface;

/* JADX INFO: renamed from: l.᩹᩶ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 27EO */
/* JADX INFO: loaded from: classes.dex */
public final class C22509 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final AbstractC20745 f73471 = C11904.f39938.m46690("term_text_font_custom.dat");

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C10946 f73472;

    /* JADX WARN: Code duplicated, block: B:19:0x0061  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a3  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Typeface m50031() {
        int i;
        C10946 c10946;
        SharedPreferences sharedPreferences = C16737.f53615;
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
            if (C16737.f53615.getString("term_text_font_custom_md5", "").isEmpty() || !f73471.mo33975()) {
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
            return C16737.m39295();
        }
        synchronized (C22509.class) {
            String string = C16737.f53615.getString("term_text_font_custom_md5", "");
            c10946 = f73472;
            if (c10946 == null || !((String) c10946.f37217).equals(string)) {
                Typeface typefaceM39295 = C16737.m39295();
                if (string.isEmpty()) {
                    string = "";
                } else {
                    AbstractC20745 abstractC20745 = f73471;
                    if (abstractC20745.mo33975()) {
                        try {
                            Typeface typefaceCreateFromFile = Typeface.createFromFile(abstractC20745.mo33986());
                            if (typefaceCreateFromFile != null && typefaceCreateFromFile != Typeface.DEFAULT) {
                                typefaceM39295 = typefaceCreateFromFile;
                            }
                        } catch (Exception unused3) {
                        }
                    } else {
                        string = "";
                    }
                }
                C10946 c10947 = new C10946(string, typefaceM39295);
                f73472 = c10947;
                c10946 = c10947;
            }
        }
        return (Typeface) c10946.f37218;
    }
}
