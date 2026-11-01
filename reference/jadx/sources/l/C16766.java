package l;

import android.content.DialogInterface;
import android.view.MenuItem;
import android.view.View;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܽܽ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: Q6ZJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C16766 extends AbstractDialogInterfaceOnClickListenerC17341 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C16195 f53662;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final C12562 f53663;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final C12562 f53664;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final C23117 f53665;

    public C16766(AbstractActivityC12483 abstractActivityC12483, String str, C22411 c22411, boolean z, C23117 c23117) {
        super(abstractActivityC12483, -1);
        this.f53665 = c23117;
        m40376(R.string.MT_Protector);
        m40369();
        m40361(true);
        m40348(false);
        m40357();
        m40341(C13932.m33769(6.0f));
        m40373();
        m40334(8);
        m40353(R.string.MT_Protector);
        m40367("Referer: https://example.com/\nCookie: session=value\nX-Custom-Header: value");
        m40340();
        m40346((CharSequence) c22411.m49697());
        m40370();
        m40343(R.string.MT_Protector, new ViewOnClickListenerC0557(1, this), (ViewOnLongClickListenerC0856) null);
        View viewM30995 = abstractActivityC12483.m30995(R.layout.MT_Protector);
        viewM30995.findViewById(R.id.MT_Protector).setOnClickListener(new View.OnClickListener() { // from class: l.۠ܽ۬
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C16766.m39330(this.f28820, view);
            }
        });
        viewM30995.findViewById(R.id.MT_Protector).setOnClickListener(new View.OnClickListener() { // from class: l.᩵ܽ۬
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f62924.m39331("Referer", (String) null);
            }
        });
        viewM30995.findViewById(R.id.MT_Protector).setOnClickListener(new ViewOnClickListenerC17491(1, this));
        viewM30995.findViewById(R.id.MT_Protector).setOnClickListener(new View.OnClickListener() { // from class: l.ۡܽ۬
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C16766.m39327(this.f30800, view);
            }
        });
        C12562 c12562 = (C12562) viewM30995.findViewById(R.id.MT_Protector);
        this.f53663 = c12562;
        c12562.setChecked(c22411.m49695());
        C12562 c12563 = (C12562) viewM30995.findViewById(R.id.MT_Protector);
        this.f53664 = c12563;
        boolean z2 = str.length() <= 2000 && C11122.m28042(str) == EnumC6182.VALID;
        c12563.setEnabled(z2);
        c12563.setChecked(z2 && z);
        m40333().addView(viewM30995);
        m40333().setVisibility(0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m39326(C16766 c16766) {
        c16766.m40346("");
        c16766.m40347((String) null);
        c16766.m39329(0, 0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m39327(final C16766 c16766, View view) {
        C16195 c16195 = c16766.f53662;
        if (c16195 != null) {
            c16195.m38293();
        }
        C16195 c16196 = new C16195(c16766.m40358(), view, 0);
        c16766.f53662 = c16196;
        c16196.m38295(new C20294(c16766));
        String[] strArr = {"Origin", "Authorization", "Accept", "Accept-Language"};
        for (int i = 0; i < 4; i++) {
            final String str = strArr[i];
            c16196.m38298().add(str).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: l.ۤܽ۬
                @Override // android.view.MenuItem.OnMenuItemClickListener
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    this.f35610.m39331(str, (String) null);
                    return true;
                }
            });
        }
        c16196.m38297();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m39330(final C16766 c16766, View view) {
        C16195 c16195 = c16766.f53662;
        if (c16195 != null) {
            c16195.m38293();
        }
        C16195 c16196 = new C16195(c16766.m40358(), view, 0);
        c16766.f53662 = c16196;
        c16196.m38295(new C20294(c16766));
        c16196.m38298().add(R.string.MT_Protector).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: l.۟ܽ۬
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                this.f25142.m39331("User-Agent", "Mozilla/5.0 (Linux; Android 13; Pixel 7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Mobile Safari/537.36");
                return true;
            }
        });
        c16196.m38298().add(R.string.MT_Protector).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: l.᩷ܽ۬
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                this.f68372.m39331("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36");
                return true;
            }
        });
        c16196.m38298().add(R.string.MT_Protector).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: l.ܺܽ۬
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                this.f51956.m39331("User-Agent", (String) null);
                return true;
            }
        });
        c16196.m38297();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m39328(C16766 c16766, C16195 c16195) {
        if (c16766.f53662 == c16195) {
            c16766.f53662 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39331(String str, String str2) {
        String strM40352 = m40352();
        int i = 0;
        while (i <= strM40352.length()) {
            int iIndexOf = strM40352.indexOf(10, i);
            if (iIndexOf < 0) {
                iIndexOf = strM40352.length();
            }
            int iIndexOf2 = strM40352.indexOf(58, i);
            if (iIndexOf2 >= i && iIndexOf2 < iIndexOf && str.equalsIgnoreCase(strM40352.substring(i, iIndexOf2).trim())) {
                int i2 = iIndexOf2 + 1;
                while (i2 < iIndexOf && (strM40352.charAt(i2) == ' ' || strM40352.charAt(i2) == '\t')) {
                    i2++;
                }
                if (iIndexOf > i2 && strM40352.charAt(iIndexOf - 1) == '\r') {
                    iIndexOf--;
                }
                if (str2 != null) {
                    m40374().replace(i2, iIndexOf, str2);
                    iIndexOf = str2.length() + i2;
                }
                m39329(i2, iIndexOf);
                return;
            }
            if (iIndexOf == strM40352.length()) {
                break;
            } else {
                i = iIndexOf + 1;
            }
        }
        InterfaceC2916 interfaceC2916M40374 = m40374();
        if (!strM40352.isEmpty() && C3184.m9601(1, strM40352) != '\n') {
            interfaceC2916M40374.append('\n');
        }
        interfaceC2916M40374.append((CharSequence) str).append(": ");
        int length = interfaceC2916M40374.length();
        if (str2 != null) {
            interfaceC2916M40374.append((CharSequence) str2);
        }
        m39329(length, interfaceC2916M40374.length());
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m39329(int i, int i2) {
        m40342(i, i2);
        C10948 c10948 = (C10948) m40335().m44364(R.id.MT_Protector);
        if (c10948 != null) {
            c10948.requestFocus();
            C16737.m39290(c10948);
        }
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC17341
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1069() {
        int i;
        try {
            this.f53665.accept(C22411.m49694(m40352(), this.f53663.isChecked()), Boolean.valueOf(this.f53664.isChecked()));
            m40364();
        } catch (C2654 e) {
            int i2 = C0537.f2291[e.m8178().ordinal()];
            if (i2 == 1) {
                i = R.string.MT_Protector;
            } else if (i2 == 2) {
                i = R.string.MT_Protector;
            } else if (i2 == 3) {
                i = R.string.MT_Protector;
            } else if (i2 == 4) {
                i = R.string.MT_Protector;
            } else {
                if (i2 != 5) {
                    throw new IncompatibleClassChangeError();
                }
                i = R.string.MT_Protector;
            }
            int length = 0;
            m40347(m40358().getString(R.string.MT_Protector, Integer.valueOf(e.m8177()), m40358().getString(i)));
            String strM40352 = m40352();
            for (int i3 = 1; i3 < e.m8177(); i3++) {
                int iIndexOf = strM40352.indexOf(10, length);
                length = iIndexOf < 0 ? strM40352.length() : iIndexOf + 1;
            }
            int iIndexOf2 = strM40352.indexOf(10, length);
            if (iIndexOf2 < 0) {
                iIndexOf2 = strM40352.length();
            }
            m39329(length, iIndexOf2);
        }
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC17341, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        C16195 c16195 = this.f53662;
        if (c16195 != null) {
            c16195.m38293();
        }
    }
}
