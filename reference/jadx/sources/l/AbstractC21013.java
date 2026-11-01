package l;

import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import bin.mt.plus.R;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩷ܿۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5EO */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC21013 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC12483 f68408;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final LinearLayout f68409;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC19356 f68411;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final TextView f68412;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final ArrayList f68407 = new ArrayList();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f68410 = true;

    /* JADX INFO: renamed from: ۨ */
    public abstract boolean mo13875();

    public AbstractC21013(AbstractActivityC12483 abstractActivityC12483) {
        this.f68408 = abstractActivityC12483;
        View viewM30995 = abstractActivityC12483.m30995(R.layout.MT_Protector);
        this.f68409 = (LinearLayout) viewM30995.findViewById(R.id.MT_Protector);
        this.f68412 = (TextView) viewM30995.findViewById(R.id.MT_Protector);
        int i = DialogInterfaceC19356.f62401;
        C8067 c8067 = new C8067(abstractActivityC12483);
        c8067.m21258(viewM30995);
        c8067.m21251(R.string.MT_Protector, null);
        c8067.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        this.f68411 = c8067.m21252();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m47192() {
        DialogInterfaceC19356 dialogInterfaceC19356 = this.f68411;
        dialogInterfaceC19356.m44362();
        if (this.f68410) {
            this.f68410 = false;
            dialogInterfaceC19356.m44373().setOnClickListener(new ViewOnClickListenerC13773(1, this));
            dialogInterfaceC19356.m44374().setOnClickListener(new ViewOnClickListenerC21509(1, this));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m47189(AbstractC21013 abstractC21013) {
        if (abstractC21013.mo13875()) {
            abstractC21013.f68411.dismiss();
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m47191(AbstractC21013 abstractC21013) {
        ArrayList arrayList = abstractC21013.f68407;
        if (arrayList.isEmpty()) {
            return;
        }
        EditText editText = ((TextInputLayout) arrayList.get(0)).getEditText();
        C13638.requireNonNull(editText);
        editText.requestFocus();
        InputMethodManager inputMethodManager = (InputMethodManager) editText.getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(editText, 0);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Button m47199() {
        if (this.f68410) {
            throw new NullPointerException("Please call show la least once");
        }
        return this.f68411.m44373();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m47198(int i) {
        this.f68412.setText(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47196(int... iArr) {
        for (int i : iArr) {
            m47195(i, null);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47195(int i, String str) {
        AbstractActivityC12483 abstractActivityC12483 = this.f68408;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(abstractActivityC12483);
        ViewGroup viewGroup = this.f68409;
        TextInputLayout textInputLayout = (TextInputLayout) layoutInflaterFrom.inflate(R.layout.MT_Protector, viewGroup, false);
        viewGroup.addView(textInputLayout);
        this.f68407.add(textInputLayout);
        EditText editText = textInputLayout.getEditText();
        if (str != null && editText != null) {
            editText.setText(str);
        }
        textInputLayout.setHint(abstractActivityC12483.getString(i));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final TextInputLayout m47200(int i) {
        return (TextInputLayout) this.f68407.get(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EditText m47193(int i) {
        EditText editText = ((TextInputLayout) this.f68407.get(i)).getEditText();
        C13638.requireNonNull(editText);
        return editText;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m47197() {
        return this.f68407.size();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47194() {
        this.f68411.dismiss();
    }
}
