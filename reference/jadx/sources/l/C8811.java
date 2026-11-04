package l;

import android.content.DialogInterface;
import android.text.Selection;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.Locale;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.۠ᩳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 66IZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C8811 extends AbstractDialogInterfaceOnClickListenerC8552 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14031 f28776;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8811(C14031 c14031) {
        super(c14031.f44452.m22931(), -1);
        this.f28776 = c14031;
        m22945(R.string.MT_Protector);
        m22924((CharSequence) c14031.f44455);
        m22932(C3296.f10738);
        m22921(R.string.MT_Protector, new View.OnClickListener() { // from class: l.֨ᩳܳ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C8811.m23649(this.f4831);
            }
        }, (ViewOnLongClickListenerC1596) null);
        TextView textViewM22938 = m22938();
        String string = m22931().getString(R.string.MT_Protector);
        int iIndexOf = string.indexOf("\n{N}");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(iIndexOf >= 0 ? string.substring(0, iIndexOf) : "");
        spannableStringBuilder.append((CharSequence) "\n").append((CharSequence) m22931().getString(R.string.MT_Protector));
        C24940.m55623(textViewM22938, spannableStringBuilder, true, new Consumer() { // from class: l.ۡᩳܳ
            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return C12312.$default$andThen(this, consumer);
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                String str = (String) obj;
                C8811 c8811 = this.f30941;
                InterfaceC19106 interfaceC19106M22947 = c8811.m22947();
                int iMax = Math.max(0, Selection.getSelectionStart(interfaceC19106M22947));
                int iMax2 = Math.max(0, Selection.getSelectionEnd(interfaceC19106M22947));
                interfaceC19106M22947.replace(Math.min(iMax, iMax2), Math.max(iMax, iMax2), str);
                c8811.m22962(str.length() + Math.min(iMax, iMax2));
            }
        });
        textViewM22938.setTextSize(14.0f);
        textViewM22938.setLineSpacing(0.0f, 1.1f);
        textViewM22938.setVisibility(0);
        textViewM22938.setPadding(0, C6907.m19160(6.0f), 0, 0);
        m22923(new C2845(this));
        m23650();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m23649(C8811 c8811) {
        c8811.m22924("{AN}_{AV}.apk");
        c8811.m23650();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m23650() {
        String strM22914 = m22914();
        int length = strM22914.length();
        if (strM22914.toLowerCase(Locale.ROOT).endsWith(".apk")) {
            length -= 4;
        }
        m22920(0, length);
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final void m23651() {
        C14031 c14031 = this.f28776;
        if (c14031.m34179() && m22956().m22434()) {
            C7320 c7320M34162 = c14031.m34162(m22914());
            String string = null;
            m22925(c7320M34162.f24113 == 0 ? null : m22931().getString(c7320M34162.f24113));
            if (c7320M34162.f24113 == 0) {
                string = c7320M34162.f24114 != null ? c7320M34162.f24114 : m22931().getString(R.string.MT_Protector);
            }
            m22954(string);
            m22956().m22436().setEnabled(c7320M34162.f24114 != null);
        }
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC8552
    /* JADX INFO: renamed from: ܶ */
    public final void mo1877() {
        C14031 c14031 = this.f28776;
        if (c14031.m34179()) {
            if (c14031.m34162(m22914()).f24114 == null) {
                m23651();
                return;
            }
            c14031.f44455 = m22914();
            ApplicationC17729.f58258.edit().putString("aqrp", c14031.f44455).apply();
            c14031.m34173();
            m22951();
        }
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC8552, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        C14031 c14031 = this.f28776;
        if (c14031.f44456 == this) {
            c14031.f44456 = null;
        }
    }
}
