package l;

import android.widget.EditText;
import bin.mt.plus.R;
import java.util.List;

/* JADX INFO: renamed from: l.ۡ᩸֨, reason: contains not printable characters */
/* JADX INFO: compiled from: H88G */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9141 {
    /* JADX INFO: renamed from: ۖ */
    public abstract int mo11849();

    /* JADX INFO: renamed from: ۙ */
    public abstract String mo11850();

    /* JADX INFO: renamed from: ۙ */
    public abstract List mo11851(String str, String str2);

    /* JADX INFO: renamed from: ۚ */
    public abstract String mo11852();

    /* JADX INFO: renamed from: ۨ */
    public abstract String mo11853();

    /* JADX INFO: renamed from: ܰ */
    public abstract String mo11854();

    /* JADX INFO: renamed from: ᩹ */
    public abstract boolean mo11855();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC9141 m23469(int i) {
        if (i == 0) {
            return C19724.f63298;
        }
        if (i == 1) {
            return C21840.f70901;
        }
        if (i == 2) {
            return C13374.f44305;
        }
        if (i == 3) {
            return C15491.f50468;
        }
        if (i == 4) {
            return C4200.f15260;
        }
        if (i == 5) {
            return C8435.f29289;
        }
        return C19724.f63298;
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo22090(AbstractActivityC12483 abstractActivityC12483, EditText editText, EditText editText2, EditText editText3, EditText editText4, EditText editText5) {
        if (AbstractC12068.m29994(editText, R.string.MT_Protector) && AbstractC12068.m29994(editText2, R.string.MT_Protector)) {
            new C1378(abstractActivityC12483, new C2789(this, editText, editText2), editText5, editText3, editText4).m10243();
        }
    }

    public final String toString() {
        return mo11853();
    }
}
