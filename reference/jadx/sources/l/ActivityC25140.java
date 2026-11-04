package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩻ܶ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: CAHS */
/* JADX INFO: loaded from: classes2.dex */
public class ActivityC25140 extends AbstractActivityC2952 {
    @Override // l.AbstractActivityC17204
    /* JADX INFO: renamed from: ᩶ */
    public String mo122() {
        return "FullEditorPreferences";
    }

    public ActivityC25140() {
        super(R.xml.MT_Protector);
    }

    @Override // l.AbstractActivityC2952
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo6717(C9663 c9663, C3906 c3906, Object obj) {
        boolean zBooleanValue;
        String str;
        C10176 c10176M16741 = c9663.m16741();
        String strM12557 = c3906.m12557();
        strM12557.getClass();
        switch (strM12557) {
            case "symbol_input":
                zBooleanValue = ((Boolean) obj).booleanValue();
                str = "custom_symbols";
                break;
            case "edit_show_line_numbers":
                zBooleanValue = ((Boolean) obj).booleanValue();
                str = "edit_fixed_line_numbers";
                break;
            case "edit_show_blank_symbol":
                zBooleanValue = ((Boolean) obj).booleanValue();
                str = "hide_single_space";
                break;
            default:
                return false;
        }
        c10176M16741.m39850((CharSequence) str).m12595(zBooleanValue);
        return true;
    }

    @Override // l.AbstractActivityC2952
    /* JADX INFO: renamed from: ۙ */
    public void mo6716(C9663 c9663, C10176 c10176) {
        if (!((C20071) c10176.m39850("edit_show_line_numbers")).m17139()) {
            c10176.m39850("edit_fixed_line_numbers").m12595(false);
        }
        if (!((C20071) c10176.m39850("edit_show_blank_symbol")).m17139()) {
            c10176.m39850("hide_single_space").m12595(false);
        }
        if (((C20071) c10176.m39850("symbol_input")).m17139()) {
            return;
        }
        c10176.m39850("custom_symbols").m12595(false);
    }
}
