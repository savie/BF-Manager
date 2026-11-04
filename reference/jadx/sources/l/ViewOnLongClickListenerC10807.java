package l;

import android.content.Context;
import android.content.DialogInterface;
import android.text.InputFilter;
import android.text.SpannableString;
import android.text.method.DigitsKeyListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import bin.mt.plus.R;
import com.umeng.analytics.pro.o;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۤۤܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 95HF */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnLongClickListenerC10807 implements View.OnLongClickListener, View.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public TextView f34289;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public TextView f34290;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f34291;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19758 f34292;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public ViewGroup f34293;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f34294;

    public ViewOnLongClickListenerC10807(C19758 c19758, int i, int i2) {
        this.f34292 = c19758;
        this.f34294 = i;
        this.f34291 = i2;
        ViewGroup viewGroup = (ViewGroup) c19758.f63597.m40418(i2);
        this.f34293 = viewGroup;
        viewGroup.setOnClickListener(this);
        viewGroup.setOnLongClickListener(this);
        this.f34290 = (TextView) viewGroup.getChildAt(1);
        this.f34289 = (TextView) viewGroup.getChildAt(0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m27544(int i) {
        int i2 = this.f34294;
        ViewGroup viewGroup = this.f34293;
        TextView textView = this.f34289;
        TextView textView2 = this.f34290;
        if (i >= i2) {
            textView2.setEnabled(true);
            textView2.setAlpha(1.0f);
            textView.setAlpha(1.0f);
            viewGroup.setEnabled(true);
            return true;
        }
        textView2.setText("----");
        textView2.setEnabled(false);
        textView2.setAlpha(0.3f);
        textView.setAlpha(0.3f);
        viewGroup.setEnabled(false);
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27543(String str) {
        this.f34290.setText(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m27542(byte[] bArr) {
        boolean zIsChecked = this.f34292.f63599.isChecked();
        int i = this.f34294;
        long j = 0;
        if (zIsChecked) {
            for (int i2 = 0; i2 < i; i2++) {
                j = (j << 8) | ((long) (bArr[i2] & 255));
            }
            return j;
        }
        while (true) {
            i--;
            if (i < 0) {
                return j;
            }
            j = (j << 8) | ((long) (bArr[i] & 255));
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00c1  */
    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        InputFilter[] filters;
        InterfaceC19106 interfaceC19106M54021;
        C19758 c19758 = this.f34292;
        if (c19758.f63595.mo44756()) {
            return false;
        }
        final C12628 c12628Mo44761 = c19758.f63595.mo44761();
        final C19143 c19143M17213 = c12628Mo44761.f40509.m17213();
        final long jM44373 = c19143M17213.m44373();
        final int iM17202 = c12628Mo44761.f40509.m17202();
        final String string = this.f34290.getText().toString();
        onClick(null);
        View viewInflate = View.inflate(view.getContext(), R.layout.MT_Protector, null);
        C23255 c23255 = (C23255) viewInflate.findViewById(R.id.MT_Protector);
        TextView textView = (TextView) viewInflate.findViewById(R.id.title);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.textView1);
        textView.setText(this.f34289.getText());
        int i = this.f34291;
        try {
            if (i == R.id.MT_Protector || i == R.id.MT_Protector || i == R.id.MT_Protector || i == R.id.MT_Protector) {
                c23255.m52326(o.a.b);
            } else if (i == R.id.MT_Protector || i == R.id.MT_Protector || i == R.id.MT_Protector || i == R.id.MT_Protector) {
                c23255.m52326(2);
            } else {
                if (i == R.id.MT_Protector || i == R.id.MT_Protector) {
                    DigitsKeyListener digitsKeyListener = DigitsKeyListener.getInstance("0123456789-.eE");
                    c23255.m52326(digitsKeyListener.getInputType());
                    filters = new InputFilter[]{digitsKeyListener};
                }
                interfaceC19106M54021 = c23255.m54021();
                if (filters == null) {
                    filters = interfaceC19106M54021.getFilters();
                }
                interfaceC19106M54021.setFilters(new InputFilter[0]);
                c23255.mo52335((CharSequence) string);
                interfaceC19106M54021.setFilters(filters);
                c23255.m52289();
                final C22742 c22742 = new C22742(c23255, textView2, i, c19758.f63599.isChecked());
                Context context = view.getContext();
                int i2 = DialogInterfaceC8327.f27315;
                C2361 c2361 = new C2361(context);
                c2361.m8005(viewInflate);
                c2361.m8026(R.string.MT_Protector, null);
                c2361.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                final DialogInterfaceC8327 dialogInterfaceC8327M8016 = c2361.m8016();
                dialogInterfaceC8327M8016.m22436().setOnClickListener(new View.OnClickListener() { // from class: l.᩷ۤܳ
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) throws Throwable {
                        ViewOnLongClickListenerC10807 viewOnLongClickListenerC10807 = this.f70958;
                        C19758 c19759 = viewOnLongClickListenerC10807.f34292;
                        C22742 c22743 = c22742;
                        if (!c22743.f73800 && !c22743.f73796) {
                            C12628 c12628Mo44762 = c19759.f63595.mo44761();
                            C12628 c12628 = c12628Mo44761;
                            DialogInterfaceC8327 dialogInterfaceC8327 = dialogInterfaceC8327M8016;
                            if (c12628Mo44762 == c12628) {
                                C5917 c5917 = c12628.f40509;
                                C19143 c19143M17214 = c5917.m17213();
                                C19143 c19143 = c19143M17213;
                                if (c19143M17214 == c19143 && c19143.m44373() == jM44373) {
                                    int iM17203 = c5917.m17202();
                                    int i3 = iM17202;
                                    if (iM17203 == i3) {
                                        if (c12628.m31394()) {
                                            C22673.m51152(R.string.MT_Protector);
                                            return;
                                        }
                                        if (c22743.f73799.m54021().toString().equals(string)) {
                                            dialogInterfaceC8327.dismiss();
                                            return;
                                        }
                                        byte[] bArr = c22743.f73802;
                                        try {
                                            c19143.m44375(i3, bArr.length + i3, bArr);
                                            c5917.m17211();
                                            c12628.invalidate();
                                            dialogInterfaceC8327.dismiss();
                                            c19759.m45517();
                                            viewOnLongClickListenerC10807.onClick(null);
                                            return;
                                        } catch (IOException e) {
                                            c12628.m31361(e);
                                            return;
                                        }
                                    }
                                }
                            }
                            dialogInterfaceC8327.dismiss();
                            return;
                        }
                        C22673.m51153(0, c22743.f73798.getText()).m51163();
                    }
                });
                C21576.m49090(c23255);
                return true;
            }
            c23255.mo52335((CharSequence) string);
            interfaceC19106M54021.setFilters(filters);
            c23255.m52289();
            final C22742 c22743 = new C22742(c23255, textView2, i, c19758.f63599.isChecked());
            Context context2 = view.getContext();
            int i3 = DialogInterfaceC8327.f27315;
            C2361 c2362 = new C2361(context2);
            c2362.m8005(viewInflate);
            c2362.m8026(R.string.MT_Protector, null);
            c2362.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            final DialogInterfaceC8327 dialogInterfaceC8327M8017 = c2362.m8016();
            dialogInterfaceC8327M8017.m22436().setOnClickListener(new View.OnClickListener() { // from class: l.᩷ۤܳ
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) throws Throwable {
                    ViewOnLongClickListenerC10807 viewOnLongClickListenerC10807 = this.f70958;
                    C19758 c19759 = viewOnLongClickListenerC10807.f34292;
                    C22742 c22744 = c22743;
                    if (!c22744.f73800 && !c22744.f73796) {
                        C12628 c12628Mo44762 = c19759.f63595.mo44761();
                        C12628 c12628 = c12628Mo44761;
                        DialogInterfaceC8327 dialogInterfaceC8327 = dialogInterfaceC8327M8017;
                        if (c12628Mo44762 == c12628) {
                            C5917 c5917 = c12628.f40509;
                            C19143 c19143M17214 = c5917.m17213();
                            C19143 c19143 = c19143M17213;
                            if (c19143M17214 == c19143 && c19143.m44373() == jM44373) {
                                int iM17203 = c5917.m17202();
                                int i4 = iM17202;
                                if (iM17203 == i4) {
                                    if (c12628.m31394()) {
                                        C22673.m51152(R.string.MT_Protector);
                                        return;
                                    }
                                    if (c22744.f73799.m54021().toString().equals(string)) {
                                        dialogInterfaceC8327.dismiss();
                                        return;
                                    }
                                    byte[] bArr = c22744.f73802;
                                    try {
                                        c19143.m44375(i4, bArr.length + i4, bArr);
                                        c5917.m17211();
                                        c12628.invalidate();
                                        dialogInterfaceC8327.dismiss();
                                        c19759.m45517();
                                        viewOnLongClickListenerC10807.onClick(null);
                                        return;
                                    } catch (IOException e) {
                                        c12628.m31361(e);
                                        return;
                                    }
                                }
                            }
                        }
                        dialogInterfaceC8327.dismiss();
                        return;
                    }
                    C22673.m51153(0, c22744.f73798.getText()).m51163();
                }
            });
            C21576.m49090(c23255);
            return true;
        } catch (Throwable th) {
            interfaceC19106M54021.setFilters(filters);
            throw th;
        }
        filters = null;
        interfaceC19106M54021 = c23255.m54021();
        if (filters == null) {
            filters = interfaceC19106M54021.getFilters();
        }
        interfaceC19106M54021.setFilters(new InputFilter[0]);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C19758 c19758 = this.f34292;
        SpannableString spannableString = new SpannableString(c19758.f63598.getText().toString());
        spannableString.setSpan(c19758.f63600, 0, (this.f34294 * 3) - 1, 33);
        c19758.f63598.setText(spannableString);
    }
}
