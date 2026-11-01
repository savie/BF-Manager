package l;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۧۤ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 673L */
/* JADX INFO: loaded from: classes3.dex */
public final class C10926 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C10948 f37167;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC12483 f37168;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C9160 f37169;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C0404 f37170;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC19356 f37171;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C10948 f37172;

    public C10926(Main main, C0404 c0404) {
        this.f37168 = main;
        this.f37170 = c0404;
        View viewM30995 = main.m30995(R.layout.MT_Protector);
        int i = DialogInterfaceC19356.f62401;
        C8067 c8067 = new C8067(main);
        c8067.m21258(viewM30995);
        c8067.m21265(false);
        c8067.m21251(R.string.MT_Protector, null);
        c8067.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        DialogInterfaceC19356 dialogInterfaceC19356M21252 = c8067.m21252();
        this.f37171 = dialogInterfaceC19356M21252;
        dialogInterfaceC19356M21252.m44368(new DialogInterface.OnKeyListener() { // from class: l.ܽۤ֨
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
                return C10926.m27406(this.f53201, i2, keyEvent);
            }
        });
        C9160 c9160 = (C9160) viewM30995.findViewById(R.id.MT_Protector);
        this.f37169 = c9160;
        c9160.m23508("rpur", (String) null);
        c9160.m23512();
        c9160.m23505(17);
        C10948 c10948M23516 = c9160.m23516();
        c10948M23516.m27481(6);
        c10948M23516.m16930(2);
        c10948M23516.setOnKeyListener(new View.OnKeyListener() { // from class: l.۫ۤ֨
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
                return C10926.m27405(this.f41229, i2, keyEvent);
            }
        });
        C10948 c10948 = (C10948) viewM30995.findViewById(R.id.MT_Protector);
        this.f37172 = c10948;
        c10948.m27481(5);
        String string = ApplicationC0716.f2992.getString("rpua", "MT-RemotePayload/1");
        c10948.mo16989((CharSequence) (C1711.m5700(string) ? string : "MT-RemotePayload/1"));
        C10948 c10949 = (C10948) viewM30995.findViewById(R.id.MT_Protector);
        this.f37167 = c10949;
        c10949.m27481(6);
        int i2 = 4;
        int i3 = ApplicationC0716.f2992.getInt("rpdt", 4);
        if (i3 >= 1 && i3 <= 16) {
            i2 = i3;
        }
        c10949.mo16989((CharSequence) String.valueOf(i2));
        c10949.setOnKeyListener(new View.OnKeyListener() { // from class: l.ܿۤ֨
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i4, KeyEvent keyEvent) {
                return C10926.m27408(this.f55018, i4, keyEvent);
            }
        });
        viewM30995.findViewById(R.id.MT_Protector).setOnClickListener(new ViewOnClickListenerC14141(3, main));
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m27406(C10926 c10926, int i, KeyEvent keyEvent) {
        if (i != 4 || keyEvent.getAction() != 0) {
            return false;
        }
        c10926.f37171.dismiss();
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m27405(C10926 c10926, int i, KeyEvent keyEvent) {
        if (i != 66 && i != 160) {
            return false;
        }
        if (keyEvent.getAction() == 1) {
            c10926.m27407();
        }
        return true;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m27408(C10926 c10926, int i, KeyEvent keyEvent) {
        if (i != 66 && i != 160) {
            return false;
        }
        if (keyEvent.getAction() == 1) {
            c10926.m27407();
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27409() {
        C9160 c9160 = this.f37169;
        c9160.m23503();
        DialogInterfaceC19356 dialogInterfaceC19356 = this.f37171;
        dialogInterfaceC19356.m44362();
        dialogInterfaceC19356.m44373().setOnClickListener(new View.OnClickListener() { // from class: l.ۛۤ֨
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f20351.m27407();
            }
        });
        C16737.m39290(c9160.m23516());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public void m27407() {
        C14440 c14440M34732;
        AbstractActivityC12483 abstractActivityC12483 = this.f37168;
        C10948 c10948 = this.f37167;
        C9160 c9160 = this.f37169;
        String strTrim = c9160.m23513().toString().trim();
        try {
            c14440M34732 = C14440.m34732(strTrim);
        } catch (IllegalArgumentException unused) {
            c14440M34732 = null;
        }
        if (c14440M34732 == null || !c14440M34732.m34746().isEmpty() || !c14440M34732.m34742().isEmpty() || c14440M34732.m34748().isEmpty()) {
            c9160.m23516().requestFocus();
            C15829.m37618(R.string.MT_Protector);
            return;
        }
        C10948 c10949 = this.f37172;
        String strTrim2 = c10949.m17000().toString().trim();
        if (!C1711.m5700(strTrim2)) {
            c10949.requestFocus();
            C15829.m37618(R.string.MT_Protector);
            return;
        }
        try {
            int i = Integer.parseInt(c10948.m17000().toString().trim());
            if (i >= 1 && i <= 16) {
                if (strTrim.length() <= 2000) {
                    c9160.m23507(strTrim);
                    c9160.m23519();
                }
                ApplicationC0716.f2992.edit().putString("rpua", strTrim2).mo4065(i, "rpdt").apply();
                this.f37171.dismiss();
                ((C11545) this.f37170.f1891).m28780((InterfaceC2288) new C0341(strTrim, strTrim2, i, new C1752()));
                return;
            }
            c10948.requestFocus();
            c10948.m27486();
            C15829.m37619(abstractActivityC12483.getString(R.string.MT_Protector, 16));
        } catch (NumberFormatException unused2) {
            c10948.requestFocus();
            c10948.m27486();
            C15829.m37619(abstractActivityC12483.getString(R.string.MT_Protector, 16));
        }
    }
}
