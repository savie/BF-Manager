package l;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.widget.EditText;
import bin.mt.plus.R;
import java.util.List;

/* JADX INFO: renamed from: l.֨᩸֨, reason: contains not printable characters */
/* JADX INFO: compiled from: H88G */
/* JADX INFO: loaded from: classes2.dex */
public final class C1378 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC12483 f5751;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ EditText f5752;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC7023 f5753;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ EditText f5754;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public List f5755;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ EditText f5756;

    public C1378(AbstractActivityC12483 abstractActivityC12483, AbstractC7023 abstractC7023, EditText editText, EditText editText2, EditText editText3) {
        this.f5751 = abstractActivityC12483;
        this.f5753 = abstractC7023;
        this.f5756 = editText;
        this.f5752 = editText2;
        this.f5754 = editText3;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        m10245(this.f5751);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() {
        this.f5755 = this.f5753.mo8481();
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        if (this.f5755.isEmpty()) {
            C15829.m37611(R.string.MT_Protector);
            return;
        }
        CharSequence[] charSequenceArr = (CharSequence[]) C9030.stream(this.f5755).map(new C5612()).toArray(new C19314(2));
        C8067 c8067BuildDialog = this.f5751.buildDialog();
        final AbstractC7023 abstractC7023 = this.f5753;
        final EditText editText = this.f5756;
        final EditText editText2 = this.f5752;
        final EditText editText3 = this.f5754;
        c8067BuildDialog.m21267(charSequenceArr, new DialogInterface.OnClickListener(abstractC7023, editText, editText2, editText3) { // from class: l.᩹᩸֨

            /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
            public final /* synthetic */ EditText f73521;

            /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
            public final /* synthetic */ EditText f73523;

            /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
            public final /* synthetic */ EditText f73524;

            {
                this.f73524 = editText;
                this.f73521 = editText2;
                this.f73523 = editText3;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C23770 c23770 = (C23770) this.f73522.f5755.get(i);
                String strM52316 = c23770.m52316();
                String strM52315 = c23770.m52315();
                EditText editText4 = this.f73524;
                int length = editText4.length();
                EditText editText5 = this.f73521;
                if (length > 0 && TextUtils.equals(editText4.getText(), editText5.getText())) {
                    editText4.setText(strM52316);
                }
                editText5.setText(strM52316);
                this.f73523.setText(strM52315);
                editText5.requestFocus();
            }
        });
        c8067BuildDialog.m21269();
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        this.f5751.m31002(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        m10251();
    }
}
