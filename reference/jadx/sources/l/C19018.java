package l;

import android.widget.EditText;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.regex.Matcher;

/* JADX INFO: renamed from: l.ᩴ᩸֨, reason: contains not printable characters */
/* JADX INFO: compiled from: H88G */
/* JADX INFO: loaded from: classes5.dex */
public final class C19018 extends AbstractDialogInterfaceOnClickListenerC17341 {

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ EditText f61530;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC12483 f61531;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ EditText f61532;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ EditText f61533;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ EditText f61534;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ EditText f61535;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19018(AbstractActivityC12483 abstractActivityC12483, Matcher matcher, AbstractActivityC12483 abstractActivityC12484, EditText editText, EditText editText2, EditText editText3, EditText editText4, EditText editText5) {
        super(abstractActivityC12483, -1);
        this.f61531 = abstractActivityC12484;
        this.f61535 = editText;
        this.f61532 = editText2;
        this.f61533 = editText3;
        this.f61534 = editText4;
        this.f61530 = editText5;
        if (matcher.find()) {
            m40346((CharSequence) matcher.group(2));
        }
        TextView textViewM40362 = m40362();
        textViewM40362.setTextColor(C20368.f66009);
        textViewM40362.setLineSpacing(0.0f, 1.1f);
        textViewM40362.setTextSize(12.0f);
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC17341
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1069() {
        String strTrim = m40352().trim();
        if (!strTrim.matches("[a-z0-9]{32}")) {
            m40365(R.string.MT_Protector);
            return;
        }
        m40364();
        new C1378(this.f61531, new C18312(this, strTrim), this.f61533, this.f61535, this.f61532).m10243();
    }
}
