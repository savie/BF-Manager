package l;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import bin.mt.plus.R;
import com.umeng.analytics.pro.cb;

/* JADX INFO: renamed from: l.ۗ۬᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 8AHY */
/* JADX INFO: loaded from: classes2.dex */
public final class SharedPreferencesOnSharedPreferenceChangeListenerC3444 implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f11224 = 0;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final AbstractC22044 f11225 = C6382.f21568.m49876("edit_text_font2_custom.dat");

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static boolean f11226;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static C2310 f11227;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC17204 f11228;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C16361 f11231;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f11232;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C24132 f11235;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public String f11233 = "edit_word_wrap_normal";

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f11234 = true;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public String f11229 = "Text";

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f11230 = false;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static synchronized C2310 m11219() {
        String string = C21576.f68932.getString("edit_text_font2_custom_md5", "");
        C2310 c2310 = f11227;
        if (c2310 != null && ((String) c2310.f7473).equals(string)) {
            return c2310;
        }
        AbstractC22044 abstractC22044M49876 = C6382.f21568.m49876("edit_text_font2_custom.dat");
        Typeface typefaceCreateFromFile = Typeface.DEFAULT;
        if (!string.isEmpty() && abstractC22044M49876.mo2934()) {
            try {
                typefaceCreateFromFile = Typeface.createFromFile(abstractC22044M49876.mo4294());
            } catch (Exception unused) {
            }
            if (typefaceCreateFromFile == null) {
                typefaceCreateFromFile = Typeface.DEFAULT;
            }
        }
        if (typefaceCreateFromFile == Typeface.DEFAULT) {
            string = "";
        }
        C2310 c2311 = new C2310(string, typefaceCreateFromFile);
        f11227 = c2311;
        return c2311;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m11214(SharedPreferencesOnSharedPreferenceChangeListenerC3444 sharedPreferencesOnSharedPreferenceChangeListenerC3444, C13511 c13511) {
        sharedPreferencesOnSharedPreferenceChangeListenerC3444.getClass();
        c13511.m33185();
        C24132 c24132 = sharedPreferencesOnSharedPreferenceChangeListenerC3444.f11235;
        c24132.scrollTo(0, c24132.m54026());
        c24132.invalidate();
    }

    public SharedPreferencesOnSharedPreferenceChangeListenerC3444(AbstractActivityC17204 abstractActivityC17204, C24132 c24132) {
        this.f11228 = abstractActivityC17204;
        this.f11235 = c24132;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11225(String str, boolean z) {
        this.f11233 = str;
        this.f11234 = z;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m11235() {
        this.f11230 = true;
        this.f11233 = "edit_word_wrap_diff";
        this.f11234 = false;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m11237() {
        if (C21576.f68932.getBoolean(this.f11233, this.f11234)) {
            return C21576.f68932.getBoolean("edit_word_wrap_keep", true) ? 1 : 2;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11228(boolean z) {
        C21576.f68932.edit().putBoolean(this.f11233, z).apply();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m11231() {
        this.f11232 = true;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean m11232() {
        return this.f11232;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11224(String str) {
        String strM39683;
        if (str.startsWith("syntax:")) {
            strM39683 = str.substring(7);
        } else {
            C16800 c16800M24626 = C9341.m24626(str);
            strM39683 = c16800M24626 == null ? "Text" : c16800M24626.m39683();
        }
        this.f11229 = strM39683;
        boolean z = this.f11232;
        C24132 c24132 = this.f11235;
        if (z || m11215()) {
            c24132.m53903(this.f11229, true);
        }
        if (!this.f11230) {
            c24132.m54096(C21576.f68932.getBoolean("edit_show_line_numbers", true));
            c24132.m54004(C21576.f68932.getBoolean("edit_fixed_line_numbers", false));
        }
        boolean z2 = C21576.f68932.getBoolean("edit_show_indent_guides", true);
        C14540 c14540 = c24132.f78066;
        C14540 c14541 = c24132.f78066;
        if (c14540.f45745 != z2) {
            c14540.f45745 = z2;
            c24132.postInvalidate();
        }
        c14541.f45761 = C21576.f68932.getBoolean("edit_pinch_to_zoom", true);
        c24132.m54052(C21576.f68932.getBoolean("edit_auto_indent", true));
        c14541.f45753 = m11218();
        c24132.m54025(C21576.f68932.getBoolean("edit_show_blank_symbol", false));
        c24132.m53951(C21576.f68932.getBoolean("hide_single_space", true));
        c24132.m54037(C21576.f68932.getBoolean("edit_show_ascii_control", false));
        c24132.m54059(C21576.f68932.getBoolean("edit_show_unicode_special", true));
        c24132.m54058(C21576.f68932.getInt("edit_tab_size", 4));
        c24132.m53876(C21576.f68932.getBoolean("edit_indent_with_tabs", false));
        c24132.m53897(m11233(), m11217());
        c24132.m53896(m11216());
        c24132.mo52291(m11237());
        c24132.m53885(C21576.f68932.getBoolean("show_soft_wrap_arrows", true));
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String m11234() {
        return this.f11229;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m11236(String str) {
        this.f11229 = str;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m11220() {
        this.f11231 = m11230();
        C21576.f68932.registerOnSharedPreferenceChangeListener(this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11223(Class cls) {
        m11220();
        AbstractActivityC17204 abstractActivityC17204 = this.f11228;
        abstractActivityC17204.startActivity(new Intent(abstractActivityC17204, (Class<?>) cls));
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C16361 m11230() {
        int iM11217 = m11217();
        return new C16361(m11233(), m11216(), iM11217, m11237(), C21576.f68932.getInt("edit_tab_size", 4), this.f11229, iM11217 == 1 ? C21576.f68932.getString("edit_text_font2_custom_md5", "") : "", C21576.f68932.getBoolean("show_soft_wrap_arrows", true), this.f11230 || C21576.f68932.getBoolean("edit_show_line_numbers", true), C21576.f68932.getBoolean("edit_show_ascii_control", false), C21576.f68932.getBoolean("edit_show_unicode_special", true), m11215());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11226(C6178 c6178) {
        C16361 c16361M11230 = m11230();
        c6178.writeInt(388441883);
        c6178.m17786((CharSequence) c16361M11230.f53128);
        c6178.writeByte(c16361M11230.f53114);
        c6178.m17781(c16361M11230.f53129);
        c6178.writeInt(c16361M11230.f53113);
        c6178.m17789(c16361M11230.f53119);
        c6178.m17789(c16361M11230.f53116);
        c6178.m17789(c16361M11230.f53130);
        c6178.writeInt(0);
        c6178.writeInt(c16361M11230.f53117);
        c6178.m17800(c16361M11230.f53131);
        c6178.m17789(c16361M11230.f53125);
        c6178.m17789(c16361M11230.f53124);
        c6178.m17781(c16361M11230.f53123);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11227(C20348 c20348) {
        boolean zM46746 = c20348.m46746(388441883);
        boolean z = zM46746 || c20348.m46746(388441882);
        boolean z2 = z || c20348.m46746(388441881);
        boolean z3 = z2 || c20348.m46746(388441880);
        boolean z4 = z3 || c20348.m46746(388441879);
        boolean z5 = z4 || c20348.m46746(388441878);
        String strM46756 = c20348.m46756();
        int i = c20348.readByte() & 255;
        float fM46747 = c20348.m46747();
        int i2 = c20348.readInt();
        boolean zM46753 = c20348.m46753();
        boolean z6 = z4 && c20348.m46753();
        boolean zM46754 = c20348.m46753();
        if (z5) {
            c20348.readInt();
        }
        C16361 c16361 = new C16361(fM46747, zM46746 ? c20348.m46747() : 1.0f, i, i2, c20348.readInt(), strM46756, z3 ? c20348.m46758() : "", !z2 || c20348.m46753(), zM46753, z6, !z || c20348.m46753(), zM46754);
        this.f11229 = strM46756;
        C16361 c16361M11230 = m11230();
        c16361.f53133 = c16361M11230.f53114;
        c16361.f53122 = c16361M11230.f53129;
        c16361.f53127 = c16361M11230.f53123;
        c16361.f53132 = c16361M11230.f53113;
        c16361.f53134 = c16361M11230.f53125;
        c16361.f53112 = c16361M11230.f53119;
        c16361.f53121 = c16361M11230.f53116;
        c16361.f53126 = c16361M11230.f53124;
        c16361.f53115 = c16361M11230.f53130;
        c16361.f53120 = c16361M11230.f53117;
        c16361.f53118 = c16361M11230.f53131;
        if (!c16361.m38858()) {
            c16361 = null;
        }
        if (c16361 != null) {
            this.f11235.m53920(c16361);
            C21576.m49068(new RunnableC8518(1, this));
        }
        m11222();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m11213(SharedPreferencesOnSharedPreferenceChangeListenerC3444 sharedPreferencesOnSharedPreferenceChangeListenerC3444) {
        C24132 c24132 = sharedPreferencesOnSharedPreferenceChangeListenerC3444.f11235;
        c24132.scrollTo(0, c24132.m54026());
        c24132.invalidate();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16361 m11221(C3180 c3180) {
        String str = c3180.f10316;
        int i = c3180.f10311;
        C16361 c16361 = new C16361(c3180.f10315, c3180.f10319, i, c3180.f10317, c3180.f10313, str, c3180.f10314, c3180.f10318, c3180.f10321, c3180.f10312, c3180.f10322, c3180.f10320);
        this.f11229 = str;
        C16361 c16361M11230 = m11230();
        c16361.f53133 = c16361M11230.f53114;
        c16361.f53122 = c16361M11230.f53129;
        c16361.f53127 = c16361M11230.f53123;
        c16361.f53132 = c16361M11230.f53113;
        c16361.f53134 = c16361M11230.f53125;
        c16361.f53112 = c16361M11230.f53119;
        c16361.f53121 = c16361M11230.f53116;
        c16361.f53126 = c16361M11230.f53124;
        c16361.f53115 = c16361M11230.f53130;
        c16361.f53120 = c16361M11230.f53117;
        c16361.f53118 = c16361M11230.f53131;
        if (c16361.m38858()) {
            return c16361;
        }
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (str == null) {
            return;
        }
        byte b = -1;
        switch (str.hashCode()) {
            case -2113232115:
                if (str.equals("edit_line_spacing")) {
                    b = 0;
                }
                break;
            case -2099828180:
                if (str.equals("hide_single_space")) {
                    b = 1;
                }
                break;
            case -2032664963:
                if (str.equals("edit_show_indent_guides")) {
                    b = 2;
                }
                break;
            case -1797291235:
                if (str.equals("edit_pinch_to_zoom")) {
                    b = 3;
                }
                break;
            case -1384104704:
                if (str.equals("edit_tab_size")) {
                    b = 4;
                }
                break;
            case -391883495:
                if (str.equals("edit_indent_with_tabs")) {
                    b = 5;
                }
                break;
            case -343113470:
                if (str.equals("edit_show_ascii_control")) {
                    b = 6;
                }
                break;
            case 372354057:
                if (str.equals("edit_magnifier")) {
                    b = 7;
                }
                break;
            case 590121177:
                if (str.equals("diff_text_font_size")) {
                    b = 8;
                }
                break;
            case 760775466:
                if (str.equals("edit_show_unicode_special")) {
                    b = 9;
                }
                break;
            case 1050071438:
                if (str.equals("edit_high_light")) {
                    b = 10;
                }
                break;
            case 1329343111:
                if (str.equals("edit_auto_indent")) {
                    b = 11;
                }
                break;
            case 1447455756:
                if (str.equals("edit_show_line_numbers")) {
                    b = 12;
                }
                break;
            case 1493579248:
                if (str.equals("edit_show_blank_symbol")) {
                    b = cb.k;
                }
                break;
            case 1643461684:
                if (str.equals("edit_text_font_size")) {
                    b = cb.f82047l;
                }
                break;
            case 1975085119:
                if (str.equals("edit_fixed_line_numbers")) {
                    b = 15;
                }
                break;
        }
        C24132 c24132 = this.f11235;
        switch (b) {
            case 0:
                this.f11231.f53127 = m11216();
                break;
            case 1:
                c24132.m53951(C21576.f68932.getBoolean("hide_single_space", true));
                break;
            case 2:
                boolean z = C21576.f68932.getBoolean("edit_show_indent_guides", true);
                C14540 c14540 = c24132.f78066;
                if (c14540.f45745 != z) {
                    c14540.f45745 = z;
                    c24132.postInvalidate();
                }
                break;
            case 3:
                c24132.f78066.f45761 = C21576.f68932.getBoolean("edit_pinch_to_zoom", true);
                break;
            case 4:
                this.f11231.f53120 = C21576.f68932.getInt("edit_tab_size", 4);
                break;
            case 5:
                c24132.m53876(C21576.f68932.getBoolean("edit_indent_with_tabs", false));
                break;
            case 6:
                this.f11231.f53121 = C21576.f68932.getBoolean("edit_show_ascii_control", false);
                break;
            case 7:
                c24132.f78066.f45753 = m11218();
                break;
            case 8:
            case 14:
                this.f11231.f53122 = m11233();
                break;
            case 9:
                this.f11231.f53126 = C21576.f68932.getBoolean("edit_show_unicode_special", true);
                break;
            case 10:
                this.f11231.f53115 = m11215();
                break;
            case 11:
                c24132.m54052(C21576.f68932.getBoolean("edit_auto_indent", true));
                break;
            case 12:
                if (!this.f11230) {
                    this.f11231.f53112 = C21576.f68932.getBoolean("edit_show_line_numbers", true);
                }
                break;
            case 13:
                c24132.m54025(C21576.f68932.getBoolean("edit_show_blank_symbol", false));
                break;
            case 15:
                if (!this.f11230) {
                    c24132.m54004(C21576.f68932.getBoolean("edit_fixed_line_numbers", false));
                }
                break;
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m11229() {
        if (this.f11231 == null) {
            return false;
        }
        C21576.f68932.unregisterOnSharedPreferenceChangeListener(this);
        C16361 c16361 = this.f11231;
        this.f11231 = null;
        AbstractActivityC17204 abstractActivityC17204 = this.f11228;
        boolean zM8762 = abstractActivityC17204.getLifecycle().mo23076().m8762(EnumC2619.CREATED);
        c16361.f53132 = m11237();
        c16361.f53134 = C21576.f68932.getBoolean("show_soft_wrap_arrows", true);
        int iM11217 = m11217();
        c16361.f53133 = iM11217;
        if (iM11217 == 1) {
            c16361.f53118 = C21576.f68932.getString("edit_text_font2_custom_md5", "");
        }
        if (zM8762 && c16361.m38858()) {
            C13511 c13511 = new C13511(abstractActivityC17204, R.string.MT_Protector);
            c13511.m33192();
            this.f11235.m53921(c16361, new RunnableC16313(1, this, c13511));
        }
        return true;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static int m11217() {
        int i;
        try {
            try {
                i = C21576.f68932.getInt("edit_text_font2", 0);
            } catch (ClassCastException unused) {
                i = Integer.parseInt(C21576.f68932.getString("edit_text_font2", null));
                C21576.f68932.edit().putInt("edit_text_font2", i).apply();
            }
        } catch (Exception unused2) {
            C21576.f68932.edit().remove("edit_text_font2").apply();
            i = 0;
        }
        if (i == 2 && !f11225.mo2934()) {
            C21576.f68932.edit().remove("edit_text_font2").apply();
            i = 0;
        }
        if (i != 1) {
            return i != 2 ? 255 : 1;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static float m11216() {
        try {
            int i = C21576.f68932.getInt("edit_line_spacing", 100);
            if (i < 80 || i > 200) {
                return 1.0f;
            }
            return i / 100.0f;
        } catch (ClassCastException unused) {
            return 1.0f;
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m11233() {
        try {
            if (this.f11230) {
                return Integer.parseInt(C21576.f68932.getString("diff_text_font_size", "12"));
            }
            return Integer.parseInt(C21576.f68932.getString("edit_text_font_size", "15"));
        } catch (NumberFormatException unused) {
            return 15;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11222() {
        boolean z = C21576.f68932.getBoolean("edit_show_indent_guides", true);
        C24132 c24132 = this.f11235;
        C14540 c14540 = c24132.f78066;
        C14540 c14541 = c24132.f78066;
        if (c14540.f45745 != z) {
            c14540.f45745 = z;
            c24132.postInvalidate();
        }
        c14541.f45761 = C21576.f68932.getBoolean("edit_pinch_to_zoom", true);
        c24132.m54052(C21576.f68932.getBoolean("edit_auto_indent", true));
        c14541.f45753 = m11218();
        c24132.m54025(C21576.f68932.getBoolean("edit_show_blank_symbol", false));
        c24132.m53951(C21576.f68932.getBoolean("hide_single_space", true));
        c24132.m53876(C21576.f68932.getBoolean("edit_indent_with_tabs", false));
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static boolean m11215() {
        return C21576.f68932.getBoolean("edit_high_light", true);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static boolean m11218() {
        boolean z = C21576.f68932.getBoolean("edit_magnifier", true);
        f11226 = z;
        return z;
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static boolean m11212() {
        return f11226;
    }
}
