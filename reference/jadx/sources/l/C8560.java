package l;

import android.content.DialogInterface;
import android.view.MenuItem;
import android.view.View;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۠ۤ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: Q6ZJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C8560 extends AbstractDialogInterfaceOnClickListenerC8552 {

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final C12289 f27947;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C18452 f27948;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C1255 f27949;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final C1255 f27950;

    public C8560(AbstractActivityC17204 abstractActivityC17204, String str, C17510 c17510, boolean z, C12289 c12289) {
        super(abstractActivityC17204, -1);
        this.f27947 = c12289;
        m22945(R.string.MT_Protector);
        m22961();
        m22934(true);
        m22927(false);
        m22937();
        m22919(C6907.m19160(6.0f));
        m22960();
        m22939(8);
        m22935(R.string.MT_Protector);
        m22933("Referer: https://example.com/\nCookie: session=value\nX-Custom-Header: value");
        m22918();
        m22924((CharSequence) c17510.m41130());
        m22917();
        m22921(R.string.MT_Protector, new View.OnClickListener() { // from class: l.᩶ۤ֫
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C8560.m22968(this.f67776);
            }
        }, (ViewOnLongClickListenerC1596) null);
        View viewM40395 = abstractActivityC17204.m40395(R.layout.MT_Protector);
        viewM40395.findViewById(R.id.MT_Protector).setOnClickListener(new View.OnClickListener() { // from class: l.ܿۤ֫
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C8560.m22972(this.f59575, view);
            }
        });
        viewM40395.findViewById(R.id.MT_Protector).setOnClickListener(new View.OnClickListener() { // from class: l.֡ۤ֫
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f1868.m22973("Referer", (String) null);
            }
        });
        viewM40395.findViewById(R.id.MT_Protector).setOnClickListener(new ViewOnClickListenerC15403(1, this));
        viewM40395.findViewById(R.id.MT_Protector).setOnClickListener(new View.OnClickListener() { // from class: l.۟ۤ֫
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C8560.m22969(this.f26034, view);
            }
        });
        C1255 c1255 = (C1255) viewM40395.findViewById(R.id.MT_Protector);
        this.f27949 = c1255;
        c1255.setChecked(c17510.m41128());
        C1255 c1256 = (C1255) viewM40395.findViewById(R.id.MT_Protector);
        this.f27950 = c1256;
        boolean z2 = str.length() <= 2000 && C22337.m50404(str) == EnumC5183.VALID;
        c1256.setEnabled(z2);
        c1256.setChecked(z2 && z);
        m22941().addView(viewM40395);
        m22941().setVisibility(0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m22968(C8560 c8560) {
        c8560.m22924("");
        c8560.m22925((String) null);
        c8560.m22971(0, 0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m22969(final C8560 c8560, View view) {
        C18452 c18452 = c8560.f27948;
        if (c18452 != null) {
            c18452.m42991();
        }
        C18452 c18453 = new C18452(c8560.m22931(), view, 0);
        c8560.f27948 = c18453;
        c18453.m42993(new C20258(c8560));
        String[] strArr = {"Origin", "Authorization", "Accept", "Accept-Language"};
        for (int i = 0; i < 4; i++) {
            final String str = strArr[i];
            c18453.m42995().add(str).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: l.ᩳۤ֫
                @Override // android.view.MenuItem.OnMenuItemClickListener
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    this.f61560.m22973(str, (String) null);
                    return true;
                }
            });
        }
        c18453.mo21878();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m22972(final C8560 c8560, View view) {
        C18452 c18452 = c8560.f27948;
        if (c18452 != null) {
            c18452.m42991();
        }
        C18452 c18453 = new C18452(c8560.m22931(), view, 0);
        c8560.f27948 = c18453;
        c18453.m42993(new C20258(c8560));
        c18453.m42995().add(R.string.MT_Protector).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: l.ۢۤ֫
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                this.f32232.m22973("User-Agent", "Mozilla/5.0 (Linux; Android 13; Pixel 7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Mobile Safari/537.36");
                return true;
            }
        });
        c18453.m42995().add(R.string.MT_Protector).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: l.֨ۤ֫
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                this.f3923.m22973("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36");
                return true;
            }
        });
        c18453.m42995().add(R.string.MT_Protector).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: l.ۡۤ֫
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                this.f30239.m22973("User-Agent", (String) null);
                return true;
            }
        });
        c18453.mo21878();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m22970(C8560 c8560, C18452 c18452) {
        if (c8560.f27948 == c18452) {
            c8560.f27948 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22973(String str, String str2) {
        String strM22914 = m22914();
        int i = 0;
        while (i <= strM22914.length()) {
            int iIndexOf = strM22914.indexOf(10, i);
            if (iIndexOf < 0) {
                iIndexOf = strM22914.length();
            }
            int iIndexOf2 = strM22914.indexOf(58, i);
            if (iIndexOf2 >= i && iIndexOf2 < iIndexOf && str.equalsIgnoreCase(strM22914.substring(i, iIndexOf2).trim())) {
                int i2 = iIndexOf2 + 1;
                while (i2 < iIndexOf && (strM22914.charAt(i2) == ' ' || strM22914.charAt(i2) == '\t')) {
                    i2++;
                }
                if (iIndexOf > i2 && strM22914.charAt(iIndexOf - 1) == '\r') {
                    iIndexOf--;
                }
                if (str2 != null) {
                    m22947().replace(i2, iIndexOf, str2);
                    iIndexOf = str2.length() + i2;
                }
                m22971(i2, iIndexOf);
                return;
            }
            if (iIndexOf == strM22914.length()) {
                break;
            } else {
                i = iIndexOf + 1;
            }
        }
        InterfaceC19106 interfaceC19106M22947 = m22947();
        if (!strM22914.isEmpty() && C22313.m50373(1, strM22914) != '\n') {
            interfaceC19106M22947.append('\n');
        }
        interfaceC19106M22947.append((CharSequence) str).append(": ");
        int length = interfaceC19106M22947.length();
        if (str2 != null) {
            interfaceC19106M22947.append((CharSequence) str2);
        }
        m22971(length, interfaceC19106M22947.length());
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m22971(int i, int i2) {
        m22920(i, i2);
        C23255 c23255 = (C23255) m22956().m22423(R.id.MT_Protector);
        if (c23255 != null) {
            c23255.requestFocus();
            C21576.m49090(c23255);
        }
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC8552
    /* JADX INFO: renamed from: ܶ */
    public final void mo1877() {
        int i;
        try {
            this.f27947.accept(C17510.m41127(m22914(), this.f27949.isChecked()), Boolean.valueOf(this.f27950.isChecked()));
            m22951();
        } catch (C24970 e) {
            int i2 = C2594.f8334[e.m55777().ordinal()];
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
            m22925(m22931().getString(R.string.MT_Protector, Integer.valueOf(e.m55776()), m22931().getString(i)));
            String strM22914 = m22914();
            for (int i3 = 1; i3 < e.m55776(); i3++) {
                int iIndexOf = strM22914.indexOf(10, length);
                length = iIndexOf < 0 ? strM22914.length() : iIndexOf + 1;
            }
            int iIndexOf2 = strM22914.indexOf(10, length);
            if (iIndexOf2 < 0) {
                iIndexOf2 = strM22914.length();
            }
            m22971(length, iIndexOf2);
        }
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC8552, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        C18452 c18452 = this.f27948;
        if (c18452 != null) {
            c18452.m42991();
        }
    }
}
