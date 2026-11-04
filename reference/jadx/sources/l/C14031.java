package l;

import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.Collections;
import java.util.Locale;

/* JADX INFO: renamed from: l.۬ᩳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 66IZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C14031 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractDialogInterfaceOnClickListenerC8552 f44452;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C11381 f44453;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final TextView f44454;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public String f44455 = ApplicationC17729.f58258.getString("aqrp", "{AN}_{AV}.apk");

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C8811 f44456;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f44457;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f44458;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C19253 f44459;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f44460;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC2386 f44461;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public String f44462;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m34164(AbstractDialogInterfaceOnClickListenerC8552 abstractDialogInterfaceOnClickListenerC8552, InterfaceC2386 interfaceC2386) {
        if (interfaceC2386.mo8090() && interfaceC2386.mo8114().equals("application/vnd.android.package-archive") && !interfaceC2386.getName().toLowerCase(Locale.ROOT).endsWith(".apex")) {
            new C14031(abstractDialogInterfaceOnClickListenerC8552, interfaceC2386);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [l.ᩳᩳܳ, l.᩷᩻ۙ] */
    public C14031(final AbstractDialogInterfaceOnClickListenerC8552 abstractDialogInterfaceOnClickListenerC8552, InterfaceC2386 interfaceC2386) {
        this.f44452 = abstractDialogInterfaceOnClickListenerC8552;
        this.f44461 = interfaceC2386;
        View viewM40395 = abstractDialogInterfaceOnClickListenerC8552.m22931().m40395(R.layout.MT_Protector);
        TextView textView = (TextView) viewM40395.findViewById(R.id.MT_Protector);
        this.f44454 = textView;
        textView.setOnClickListener(new View.OnClickListener() { // from class: l.۟ᩳܳ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C14031.m34167(this.f26695, abstractDialogInterfaceOnClickListenerC8552);
            }
        });
        int i = 1;
        viewM40395.findViewById(R.id.MT_Protector).setOnClickListener(new ViewOnClickListenerC17724(i, this));
        ?? r0 = new InterfaceC5252() { // from class: l.ᩳᩳܳ
            @Override // l.InterfaceC5252
            /* JADX INFO: renamed from: ۙ */
            public final void mo2183(InterfaceC11217 interfaceC11217, EnumC9330 enumC9330) {
                C14031.m34169(this.f62280, enumC9330);
            }
        };
        this.f44459 = r0;
        abstractDialogInterfaceOnClickListenerC8552.m22931().getLifecycle().mo23077(r0);
        abstractDialogInterfaceOnClickListenerC8552.m22956().m22426(new DialogInterfaceOnDismissListenerC7541(i, this, abstractDialogInterfaceOnClickListenerC8552));
        abstractDialogInterfaceOnClickListenerC8552.m22941().addView(viewM40395);
        abstractDialogInterfaceOnClickListenerC8552.m22941().setVisibility(0);
        m34173();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m34167(C14031 c14031, AbstractDialogInterfaceOnClickListenerC8552 abstractDialogInterfaceOnClickListenerC8552) {
        String str;
        if (!c14031.m34179() || (str = c14031.f44462) == null) {
            return;
        }
        abstractDialogInterfaceOnClickListenerC8552.m22924((CharSequence) str);
        int iLastIndexOf = c14031.f44462.lastIndexOf(46);
        if (iLastIndexOf <= 0) {
            iLastIndexOf = c14031.f44462.length();
        }
        abstractDialogInterfaceOnClickListenerC8552.m22920(0, iLastIndexOf);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m34165(C14031 c14031) {
        if (c14031.m34179() && c14031.f44456 == null) {
            C8811 c8811 = new C8811(c14031);
            c14031.f44456 = c8811;
            c8811.m22955(true);
            c14031.f44456.m22956().m22436().setText(R.string.MT_Protector);
            c14031.f44456.m23651();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m34169(C14031 c14031, EnumC9330 enumC9330) {
        if (enumC9330 == EnumC9330.ON_DESTROY) {
            c14031.m34163();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean m34179() {
        if (this.f44460) {
            return false;
        }
        AbstractDialogInterfaceOnClickListenerC8552 abstractDialogInterfaceOnClickListenerC8552 = this.f44452;
        return (!abstractDialogInterfaceOnClickListenerC8552.m22956().m22434() || abstractDialogInterfaceOnClickListenerC8552.m22931().isFinishing() || abstractDialogInterfaceOnClickListenerC8552.m22931().isDestroyed()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m34163() {
        if (this.f44460) {
            return;
        }
        this.f44460 = true;
        this.f44452.m22931().getLifecycle().mo23078(this.f44459);
        C8811 c8811 = this.f44456;
        if (c8811 != null) {
            c8811.m22951();
        }
        this.f44453 = null;
        this.f44462 = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C7320 m34162(String str) {
        boolean z;
        if (!C16602.m39285(str) || (z = this.f44458)) {
            InterfaceC2386 interfaceC2386 = this.f44461;
            C11381 c11381 = this.f44453;
            if (C16602.m39285(str)) {
                if (c11381 == null) {
                    return new C7320(null, R.string.MT_Protector);
                }
                if ((str.contains("{AN}") && c11381.m28715().trim().isEmpty()) || ((str.contains("{AP}") && c11381.m28718().trim().isEmpty()) || (str.contains("{AV}") && (c11381.m28716().trim().isEmpty() || c11381.m28716().equals("null"))))) {
                    return new C7320(null, R.string.MT_Protector);
                }
            }
            C15632 c15632 = new C15632();
            c15632.f50770 = c11381;
            try {
                String strM33027 = ((C13395) C5938.m17253(Collections.singletonList(interfaceC2386), str, "", "", false, Collections.singletonMap(interfaceC2386.getName(), c15632)).get(0)).m33027();
                if (strM33027.trim().isEmpty() || strM33027.equals(".") || strM33027.equals("..")) {
                    return new C7320(null, R.string.MT_Protector);
                }
                for (int i = 0; i < strM33027.length(); i++) {
                    char cCharAt = strM33027.charAt(i);
                    if (cCharAt == '/' || cCharAt == '\\' || cCharAt < ' ' || cCharAt == 127) {
                        return new C7320(null, R.string.MT_Protector);
                    }
                }
                return new C7320(strM33027, 0);
            } catch (IllegalArgumentException unused) {
                return new C7320(null, R.string.MT_Protector);
            }
        }
        if (!this.f44457 && !z && !this.f44460) {
            this.f44457 = true;
            new C10302(this).m8197();
        }
        return new C7320(null, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public void m34173() {
        String string;
        C7320 c7320M34162 = m34162(this.f44455);
        this.f44462 = c7320M34162.f24114;
        if (c7320M34162.f24114 != null) {
            string = c7320M34162.f24114;
        } else {
            string = this.f44452.m22931().getString(c7320M34162.f24113 != 0 ? c7320M34162.f24113 : R.string.MT_Protector);
        }
        TextView textView = this.f44454;
        textView.setText(string);
        int paintFlags = textView.getPaintFlags();
        textView.setPaintFlags(c7320M34162.f24114 != null ? paintFlags | 8 : paintFlags & (-9));
        textView.setTextColor(c7320M34162.f24114 != null ? C3296.f10738 : C3296.f10741);
        textView.setEnabled(c7320M34162.f24114 != null);
        textView.setFocusable(c7320M34162.f24114 != null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m34170(C14031 c14031, C11381 c11381) {
        if (c14031.m34179()) {
            c14031.f44457 = false;
            c14031.f44458 = true;
            c14031.f44453 = c11381;
            c14031.m34173();
            C8811 c8811 = c14031.f44456;
            if (c8811 != null) {
                c8811.m23651();
            }
        }
    }
}
