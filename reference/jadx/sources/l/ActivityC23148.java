package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩺ᩳۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: CAHS */
/* JADX INFO: loaded from: classes2.dex */
public class ActivityC23148 extends AbstractActivityC4762 {
    @Override // l.AbstractActivityC12483
    /* JADX INFO: renamed from: ۡ */
    public String mo126() {
        return "FullEditorPreferences";
    }

    public ActivityC23148() {
        super(R.xml.MT_Protector);
    }

    @Override // l.AbstractActivityC4762
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo13232(C2875 c2875, C4751 c4751, Object obj) {
        boolean zBooleanValue;
        String str;
        C13344 c13344M38029 = c2875.m38029();
        String strM13157 = c4751.m13157();
        strM13157.getClass();
        switch (strM13157) {
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
        c13344M38029.m31077((CharSequence) str).m13154(zBooleanValue);
        return true;
    }

    @Override // l.AbstractActivityC4762
    /* JADX INFO: renamed from: ۙ */
    public void mo13231(C2875 c2875, C13344 c13344) {
        if (!((C10522) c13344.m31077("edit_show_line_numbers")).m38263()) {
            c13344.m31077("edit_fixed_line_numbers").m13154(false);
        }
        if (!((C10522) c13344.m31077("edit_show_blank_symbol")).m38263()) {
            c13344.m31077("hide_single_space").m13154(false);
        }
        if (((C10522) c13344.m31077("symbol_input")).m38263()) {
            return;
        }
        c13344.m31077("custom_symbols").m13154(false);
    }
}
