package l;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import bin.mt.plus.R;
import com.umeng.analytics.pro.cb;

/* JADX INFO: renamed from: l.ܺ֫ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8AHY */
/* JADX INFO: loaded from: classes4.dex */
public final class SharedPreferencesOnSharedPreferenceChangeListenerC15618 implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f50785 = 0;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final AbstractC20745 f50786 = C11904.f39938.m46690("edit_text_font2_custom.dat");

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static boolean f50787;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static C10946 f50788;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C0135 f50789;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C6111 f50790;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC12483 f50791;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f50796;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public String f50792 = "edit_word_wrap_normal";

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f50795 = true;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public String f50794 = "Text";

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f50793 = false;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static synchronized C10946 m37289() {
        String string = C16737.f53615.getString("edit_text_font2_custom_md5", "");
        C10946 c10946 = f50788;
        if (c10946 != null && ((String) c10946.f37217).equals(string)) {
            return c10946;
        }
        AbstractC20745 abstractC20745M46690 = C11904.f39938.m46690("edit_text_font2_custom.dat");
        Typeface typefaceCreateFromFile = Typeface.DEFAULT;
        if (!string.isEmpty() && abstractC20745M46690.mo33975()) {
            try {
                typefaceCreateFromFile = Typeface.createFromFile(abstractC20745M46690.mo33986());
            } catch (Exception unused) {
            }
            if (typefaceCreateFromFile == null) {
                typefaceCreateFromFile = Typeface.DEFAULT;
            }
        }
        if (typefaceCreateFromFile == Typeface.DEFAULT) {
            string = "";
        }
        C10946 c10947 = new C10946(string, typefaceCreateFromFile);
        f50788 = c10947;
        return c10947;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m37283(SharedPreferencesOnSharedPreferenceChangeListenerC15618 sharedPreferencesOnSharedPreferenceChangeListenerC15618, C17485 c17485) {
        sharedPreferencesOnSharedPreferenceChangeListenerC15618.getClass();
        c17485.m40694();
        C6111 c6111 = sharedPreferencesOnSharedPreferenceChangeListenerC15618.f50790;
        c6111.scrollTo(0, c6111.m17066());
        c6111.invalidate();
    }

    public SharedPreferencesOnSharedPreferenceChangeListenerC15618(AbstractActivityC12483 abstractActivityC12483, C6111 c6111) {
        this.f50791 = abstractActivityC12483;
        this.f50790 = c6111;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37297(String str, boolean z) {
        this.f50792 = str;
        this.f50795 = z;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m37305() {
        this.f50793 = true;
        this.f50792 = "edit_word_wrap_diff";
        this.f50795 = false;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m37291() {
        if (C16737.f53615.getBoolean(this.f50792, this.f50795)) {
            return C16737.f53615.getBoolean("edit_word_wrap_keep", true) ? 1 : 2;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37300(boolean z) {
        C16737.f53615.edit().putBoolean(this.f50792, z).apply();
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m37302() {
        this.f50796 = true;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean m37290() {
        return this.f50796;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37296(String str) {
        String strM46958;
        if (str.startsWith("syntax:")) {
            strM46958 = str.substring(7);
        } else {
            C20889 c20889M31869 = C12859.m31869(str);
            strM46958 = c20889M31869 == null ? "Text" : c20889M31869.m46958();
        }
        this.f50794 = strM46958;
        boolean z = this.f50796;
        C6111 c6111 = this.f50790;
        if (z || m37286()) {
            c6111.m16857(this.f50794, true);
        }
        if (!this.f50793) {
            c6111.m17030(C16737.f53615.getBoolean("edit_show_line_numbers", true));
            c6111.m16813(C16737.f53615.getBoolean("edit_fixed_line_numbers", false));
        }
        boolean z2 = C16737.f53615.getBoolean("edit_show_indent_guides", true);
        C1590 c1590 = c6111.f20794;
        C1590 c1591 = c6111.f20794;
        if (c1590.f6423 != z2) {
            c1590.f6423 = z2;
            c6111.postInvalidate();
        }
        c1591.f6429 = C16737.f53615.getBoolean("edit_pinch_to_zoom", true);
        c6111.m16907(C16737.f53615.getBoolean("edit_auto_indent", true));
        c1591.f6399 = m37287();
        c6111.m17024(C16737.f53615.getBoolean("edit_show_blank_symbol", false));
        c6111.m16977(C16737.f53615.getBoolean("hide_single_space", true));
        c6111.m17051(C16737.f53615.getBoolean("edit_show_ascii_control", false));
        c6111.m17036(C16737.f53615.getBoolean("edit_show_unicode_special", true));
        c6111.m17035(C16737.f53615.getInt("edit_tab_size", 4));
        c6111.m16840(C16737.f53615.getBoolean("edit_indent_with_tabs", false));
        c6111.m16850(m37307(), m37288());
        c6111.m16849(m37285());
        c6111.m16930(m37291());
        c6111.m16931(C16737.f53615.getBoolean("show_soft_wrap_arrows", true));
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String m37301() {
        return this.f50794;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m37306(String str) {
        this.f50794 = str;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m37292() {
        this.f50789 = m37303();
        C16737.f53615.registerOnSharedPreferenceChangeListener(this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37295(Class cls) {
        m37292();
        AbstractActivityC12483 abstractActivityC12483 = this.f50791;
        abstractActivityC12483.startActivity(new Intent(abstractActivityC12483, (Class<?>) cls));
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C0135 m37303() {
        int iM37288 = m37288();
        return new C0135(m37307(), m37285(), iM37288, m37291(), C16737.f53615.getInt("edit_tab_size", 4), this.f50794, iM37288 == 1 ? C16737.f53615.getString("edit_text_font2_custom_md5", "") : "", C16737.f53615.getBoolean("show_soft_wrap_arrows", true), this.f50793 || C16737.f53615.getBoolean("edit_show_line_numbers", true), C16737.f53615.getBoolean("edit_show_ascii_control", false), C16737.f53615.getBoolean("edit_show_unicode_special", true), m37286());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37298(C11018 c11018) {
        C0135 c0135M37303 = m37303();
        c11018.writeInt(388441883);
        c11018.m27782((CharSequence) c0135M37303.f1152);
        c11018.writeByte(c0135M37303.f1154);
        c11018.m27778(c0135M37303.f1153);
        c11018.writeInt(c0135M37303.f1142);
        c11018.m27784(c0135M37303.f1140);
        c11018.m27784(c0135M37303.f1146);
        c11018.m27784(c0135M37303.f1147);
        c11018.writeInt(0);
        c11018.writeInt(c0135M37303.f1144);
        c11018.m27786(c0135M37303.f1136);
        c11018.m27784(c0135M37303.f1148);
        c11018.m27784(c0135M37303.f1150);
        c11018.m27778(c0135M37303.f1156);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37299(C17367 c17367) {
        boolean zM40447 = c17367.m40447(388441883);
        boolean z = zM40447 || c17367.m40447(388441882);
        boolean z2 = z || c17367.m40447(388441881);
        boolean z3 = z2 || c17367.m40447(388441880);
        boolean z4 = z3 || c17367.m40447(388441879);
        boolean z5 = z4 || c17367.m40447(388441878);
        String strM40442 = c17367.m40442();
        int i = c17367.readByte() & 255;
        float fM40450 = c17367.m40450();
        int i2 = c17367.readInt();
        boolean zM40461 = c17367.m40461();
        boolean z6 = z4 && c17367.m40461();
        boolean zM40462 = c17367.m40461();
        if (z5) {
            c17367.readInt();
        }
        C0135 c0135 = new C0135(fM40450, zM40447 ? c17367.m40450() : 1.0f, i, i2, c17367.readInt(), strM40442, z3 ? c17367.m40458() : "", !z2 || c17367.m40461(), zM40461, z6, !z || c17367.m40461(), zM40462);
        this.f50794 = strM40442;
        C0135 c0135M37303 = m37303();
        c0135.f1141 = c0135M37303.f1154;
        c0135.f1149 = c0135M37303.f1153;
        c0135.f1139 = c0135M37303.f1156;
        c0135.f1151 = c0135M37303.f1142;
        c0135.f1157 = c0135M37303.f1148;
        c0135.f1137 = c0135M37303.f1140;
        c0135.f1135 = c0135M37303.f1146;
        c0135.f1155 = c0135M37303.f1150;
        c0135.f1138 = c0135M37303.f1147;
        c0135.f1143 = c0135M37303.f1144;
        c0135.f1145 = c0135M37303.f1136;
        if (!c0135.m1213()) {
            c0135 = null;
        }
        if (c0135 != null) {
            this.f50790.m16859(c0135);
            C16737.m39273(new RunnableC19269(1, this));
        }
        m37294();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m37282(SharedPreferencesOnSharedPreferenceChangeListenerC15618 sharedPreferencesOnSharedPreferenceChangeListenerC15618) {
        C6111 c6111 = sharedPreferencesOnSharedPreferenceChangeListenerC15618.f50790;
        c6111.scrollTo(0, c6111.m17066());
        c6111.invalidate();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C0135 m37293(C16551 c16551) {
        String str = c16551.f53145;
        int i = c16551.f53147;
        C0135 c0135 = new C0135(c16551.f53150, c16551.f53149, i, c16551.f53155, c16551.f53152, str, c16551.f53151, c16551.f53154, c16551.f53146, c16551.f53148, c16551.f53156, c16551.f53153);
        this.f50794 = str;
        C0135 c0135M37303 = m37303();
        c0135.f1141 = c0135M37303.f1154;
        c0135.f1149 = c0135M37303.f1153;
        c0135.f1139 = c0135M37303.f1156;
        c0135.f1151 = c0135M37303.f1142;
        c0135.f1157 = c0135M37303.f1148;
        c0135.f1137 = c0135M37303.f1140;
        c0135.f1135 = c0135M37303.f1146;
        c0135.f1155 = c0135M37303.f1150;
        c0135.f1138 = c0135M37303.f1147;
        c0135.f1143 = c0135M37303.f1144;
        c0135.f1145 = c0135M37303.f1136;
        if (c0135.m1213()) {
            return c0135;
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
                    b = cb.f77931l;
                }
                break;
            case 1975085119:
                if (str.equals("edit_fixed_line_numbers")) {
                    b = 15;
                }
                break;
        }
        C6111 c6111 = this.f50790;
        switch (b) {
            case 0:
                this.f50789.f1139 = m37285();
                break;
            case 1:
                c6111.m16977(C16737.f53615.getBoolean("hide_single_space", true));
                break;
            case 2:
                boolean z = C16737.f53615.getBoolean("edit_show_indent_guides", true);
                C1590 c1590 = c6111.f20794;
                if (c1590.f6423 != z) {
                    c1590.f6423 = z;
                    c6111.postInvalidate();
                }
                break;
            case 3:
                c6111.f20794.f6429 = C16737.f53615.getBoolean("edit_pinch_to_zoom", true);
                break;
            case 4:
                this.f50789.f1143 = C16737.f53615.getInt("edit_tab_size", 4);
                break;
            case 5:
                c6111.m16840(C16737.f53615.getBoolean("edit_indent_with_tabs", false));
                break;
            case 6:
                this.f50789.f1135 = C16737.f53615.getBoolean("edit_show_ascii_control", false);
                break;
            case 7:
                c6111.f20794.f6399 = m37287();
                break;
            case 8:
            case 14:
                this.f50789.f1149 = m37307();
                break;
            case 9:
                this.f50789.f1155 = C16737.f53615.getBoolean("edit_show_unicode_special", true);
                break;
            case 10:
                this.f50789.f1138 = m37286();
                break;
            case 11:
                c6111.m16907(C16737.f53615.getBoolean("edit_auto_indent", true));
                break;
            case 12:
                if (!this.f50793) {
                    this.f50789.f1137 = C16737.f53615.getBoolean("edit_show_line_numbers", true);
                }
                break;
            case 13:
                c6111.m17024(C16737.f53615.getBoolean("edit_show_blank_symbol", false));
                break;
            case 15:
                if (!this.f50793) {
                    c6111.m16813(C16737.f53615.getBoolean("edit_fixed_line_numbers", false));
                }
                break;
        }
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean m37304() {
        if (this.f50789 == null) {
            return false;
        }
        C16737.f53615.unregisterOnSharedPreferenceChangeListener(this);
        C0135 c0135 = this.f50789;
        this.f50789 = null;
        AbstractActivityC12483 abstractActivityC12483 = this.f50791;
        boolean zM24173 = abstractActivityC12483.getLifecycle().mo9170().m24173(EnumC9414.CREATED);
        c0135.f1151 = m37291();
        c0135.f1157 = C16737.f53615.getBoolean("show_soft_wrap_arrows", true);
        int iM37288 = m37288();
        c0135.f1141 = iM37288;
        if (iM37288 == 1) {
            c0135.f1145 = C16737.f53615.getString("edit_text_font2_custom_md5", "");
        }
        if (zM24173 && c0135.m1213()) {
            C17485 c17485 = new C17485(abstractActivityC12483, R.string.MT_Protector);
            c17485.m40704();
            this.f50790.m16860(c0135, new RunnableC5988(1, this, c17485));
        }
        return true;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static int m37288() {
        int i;
        try {
            try {
                i = C16737.f53615.getInt("edit_text_font2", 0);
            } catch (ClassCastException unused) {
                i = Integer.parseInt(C16737.f53615.getString("edit_text_font2", null));
                C16737.f53615.edit().putInt("edit_text_font2", i).apply();
            }
        } catch (Exception unused2) {
            C16737.f53615.edit().remove("edit_text_font2").apply();
            i = 0;
        }
        if (i == 2 && !f50786.mo33975()) {
            C16737.f53615.edit().remove("edit_text_font2").apply();
            i = 0;
        }
        if (i != 1) {
            return i != 2 ? 255 : 1;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static float m37285() {
        try {
            int i = C16737.f53615.getInt("edit_line_spacing", 100);
            if (i < 80 || i > 200) {
                return 1.0f;
            }
            return i / 100.0f;
        } catch (ClassCastException unused) {
            return 1.0f;
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int m37307() {
        try {
            if (this.f50793) {
                return Integer.parseInt(C16737.f53615.getString("diff_text_font_size", "12"));
            }
            return Integer.parseInt(C16737.f53615.getString("edit_text_font_size", "15"));
        } catch (NumberFormatException unused) {
            return 15;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37294() {
        boolean z = C16737.f53615.getBoolean("edit_show_indent_guides", true);
        C6111 c6111 = this.f50790;
        C1590 c1590 = c6111.f20794;
        C1590 c1591 = c6111.f20794;
        if (c1590.f6423 != z) {
            c1590.f6423 = z;
            c6111.postInvalidate();
        }
        c1591.f6429 = C16737.f53615.getBoolean("edit_pinch_to_zoom", true);
        c6111.m16907(C16737.f53615.getBoolean("edit_auto_indent", true));
        c1591.f6399 = m37287();
        c6111.m17024(C16737.f53615.getBoolean("edit_show_blank_symbol", false));
        c6111.m16977(C16737.f53615.getBoolean("hide_single_space", true));
        c6111.m16840(C16737.f53615.getBoolean("edit_indent_with_tabs", false));
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean m37286() {
        return C16737.f53615.getBoolean("edit_high_light", true);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static boolean m37287() {
        boolean z = C16737.f53615.getBoolean("edit_magnifier", true);
        f50787 = z;
        return z;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static boolean m37284() {
        return f50787;
    }
}
