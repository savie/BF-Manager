package l;

import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۢ֨ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5EO */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9781 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC17204 f31529;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final TextView f31531;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final LinearLayout f31532;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC8327 f31533;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ArrayList f31534 = new ArrayList();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f31530 = true;

    /* JADX INFO: renamed from: ۤ */
    public abstract boolean mo5156();

    public AbstractC9781(AbstractActivityC17204 abstractActivityC17204) {
        this.f31529 = abstractActivityC17204;
        View viewM40395 = abstractActivityC17204.m40395(R.layout.MT_Protector);
        this.f31532 = (LinearLayout) viewM40395.findViewById(R.id.MT_Protector);
        this.f31531 = (TextView) viewM40395.findViewById(R.id.title);
        int i = DialogInterfaceC8327.f27315;
        C2361 c2361 = new C2361(abstractActivityC17204);
        c2361.m8005(viewM40395);
        c2361.m8026(R.string.MT_Protector, null);
        c2361.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        this.f31533 = c2361.m7999();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m25517() {
        DialogInterfaceC8327 dialogInterfaceC8327 = this.f31533;
        dialogInterfaceC8327.m22432();
        if (this.f31530) {
            this.f31530 = false;
            dialogInterfaceC8327.m22436().setOnClickListener(new ViewOnClickListenerC3238(1, this));
            dialogInterfaceC8327.m22433().setOnClickListener(new View.OnClickListener() { // from class: l.ᩳ֨ᩴ
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f60889.f31533.dismiss();
                }
            });
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m25506(AbstractC9781 abstractC9781) {
        if (abstractC9781.mo5156()) {
            abstractC9781.f31533.dismiss();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m25508(AbstractC9781 abstractC9781) {
        ArrayList arrayList = abstractC9781.f31534;
        if (arrayList.isEmpty()) {
            return;
        }
        C23255 c23255M5756 = ((C1626) arrayList.get(0)).m5756();
        C17359.requireNonNull(c23255M5756);
        c23255M5756.requestFocus();
        InputMethodManager inputMethodManager = (InputMethodManager) c23255M5756.getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(c23255M5756, 0);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Button m25515() {
        if (this.f31530) {
            throw new NullPointerException("Please call show la least once");
        }
        return this.f31533.m22436();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m25513(int i) {
        this.f31531.setText(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25512(int... iArr) {
        for (int i : iArr) {
            m25511(i, null);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25511(int i, String str) {
        AbstractActivityC17204 abstractActivityC17204 = this.f31529;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(abstractActivityC17204);
        ViewGroup viewGroup = this.f31532;
        C1626 c1626 = (C1626) layoutInflaterFrom.inflate(R.layout.MT_Protector, viewGroup, false);
        viewGroup.addView(c1626);
        this.f31534.add(c1626);
        C23255 c23255M5756 = c1626.m5756();
        if (str != null && c23255M5756 != null) {
            c23255M5756.mo52335((CharSequence) str);
        }
        c1626.m5761(abstractActivityC17204.getString(i));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C1626 m25516(int i) {
        return (C1626) this.f31534.get(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23255 m25509(int i) {
        C23255 c23255M5756 = ((C1626) this.f31534.get(i)).m5756();
        C17359.requireNonNull(c23255M5756);
        return c23255M5756;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m25514() {
        return this.f31534.size();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25510() {
        this.f31533.dismiss();
    }
}
