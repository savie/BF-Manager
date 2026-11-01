package l;

import android.widget.EditText;
import bin.mt.plus.R;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.۠᩸֨, reason: contains not printable characters */
/* JADX INFO: compiled from: H88G */
/* JADX INFO: loaded from: classes3.dex */
public final class C8435 extends AbstractC9141 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C8435 f29289 = new C8435();

    @Override // l.AbstractC9141
    /* JADX INFO: renamed from: ۖ */
    public final int mo11849() {
        return 5;
    }

    @Override // l.AbstractC9141
    /* JADX INFO: renamed from: ۙ */
    public final String mo11850() {
        return "Access Key ID";
    }

    @Override // l.AbstractC9141
    /* JADX INFO: renamed from: ۚ */
    public final String mo11852() {
        return "r2";
    }

    @Override // l.AbstractC9141
    /* JADX INFO: renamed from: ۨ */
    public final String mo11853() {
        return "Cloudflare R2";
    }

    @Override // l.AbstractC9141
    /* JADX INFO: renamed from: ܰ */
    public final String mo11854() {
        return "Secret Access Key";
    }

    @Override // l.AbstractC9141
    /* JADX INFO: renamed from: ᩹ */
    public final boolean mo11855() {
        return true;
    }

    @Override // l.AbstractC9141
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo22090(AbstractActivityC12483 abstractActivityC12483, EditText editText, EditText editText2, EditText editText3, EditText editText4, EditText editText5) {
        if (AbstractC12068.m29994(editText, R.string.MT_Protector) && AbstractC12068.m29994(editText2, R.string.MT_Protector)) {
            C19018 c19018 = new C19018(abstractActivityC12483, Pattern.compile("^(https?://)?([a-z0-9]{32})\\.r2\\.cloudflarestorage\\.com").matcher(editText4.getText().toString()), abstractActivityC12483, editText3, editText4, editText5, editText, editText2);
            c19018.m40376(R.string.cloudflare_account_id);
            c19018.m40363(R.string.MT_Protector);
            c19018.m40372();
            c19018.m40340();
            c19018.m40368(true);
        }
    }

    @Override // l.AbstractC9141
    /* JADX INFO: renamed from: ۙ */
    public final List mo11851(String str, String str2) {
        throw new RuntimeException();
    }
}
