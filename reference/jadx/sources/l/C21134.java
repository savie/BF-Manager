package l;

import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import bin.mt.plus.R;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: renamed from: l.᩷᩸֨, reason: contains not printable characters */
/* JADX INFO: compiled from: V89B */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C21134 implements InterfaceC17295 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC12483 f68809;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextInputLayout f68810;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ EditText f68811;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12562 f68812;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextInputLayout f68813;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ EditText f68814;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ EditText f68815;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ EditText f68816;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AutoCompleteTextView f68817;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextInputLayout f68818;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ EditText f68819;

    public /* synthetic */ C21134(C12562 c12562, AutoCompleteTextView autoCompleteTextView, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, AbstractActivityC12483 abstractActivityC12483, EditText editText, EditText editText2, EditText editText3, EditText editText4, EditText editText5) {
        this.f68812 = c12562;
        this.f68817 = autoCompleteTextView;
        this.f68810 = textInputLayout;
        this.f68813 = textInputLayout2;
        this.f68818 = textInputLayout3;
        this.f68809 = abstractActivityC12483;
        this.f68816 = editText;
        this.f68811 = editText2;
        this.f68814 = editText3;
        this.f68819 = editText4;
        this.f68815 = editText5;
    }

    @Override // l.InterfaceC17295
    public final void accept(Object obj) {
        final AbstractC9141 abstractC9141 = (AbstractC9141) obj;
        this.f68812.setVisibility(abstractC9141.mo11849() == 0 ? 0 : 8);
        this.f68817.setTag(abstractC9141);
        this.f68810.setHint(abstractC9141.mo11850());
        this.f68813.setHint(abstractC9141.mo11854());
        boolean zMo11855 = abstractC9141.mo11855();
        TextInputLayout textInputLayout = this.f68818;
        if (zMo11855) {
            textInputLayout.setEndIconMode(-1);
            textInputLayout.setEndIconDrawable(R.drawable.MT_Protector);
            final AbstractActivityC12483 abstractActivityC12483 = this.f68809;
            final EditText editText = this.f68816;
            final EditText editText2 = this.f68811;
            final EditText editText3 = this.f68814;
            final EditText editText4 = this.f68819;
            final EditText editText5 = this.f68815;
            textInputLayout.setEndIconOnClickListener(new View.OnClickListener() { // from class: l.ܽ᩸֨
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    abstractC9141.mo22090(abstractActivityC12483, editText, editText2, editText3, editText4, editText5);
                }
            });
            return;
        }
        textInputLayout.setEndIconMode(0);
    }
}
