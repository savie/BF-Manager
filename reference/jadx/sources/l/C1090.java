package l;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.֨ۢ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 673L */
/* JADX INFO: loaded from: classes2.dex */
public final class C1090 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC17204 f3888;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C17340 f3889;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C23255 f3890;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C17771 f3891;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC8327 f3892;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C23255 f3893;

    public C1090(Main main, C17340 c17340) {
        this.f3888 = main;
        this.f3889 = c17340;
        View viewM40395 = main.m40395(R.layout.MT_Protector);
        int i = DialogInterfaceC8327.f27315;
        C2361 c2361 = new C2361(main);
        c2361.m8005(viewM40395);
        c2361.m8012(false);
        c2361.m8026(R.string.MT_Protector, null);
        c2361.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        DialogInterfaceC8327 dialogInterfaceC8327M7999 = c2361.m7999();
        this.f3892 = dialogInterfaceC8327M7999;
        dialogInterfaceC8327M7999.m22427(new DialogInterface.OnKeyListener() { // from class: l.֡ۢ۫
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
                return C1090.m4089(this.f1837, i2, keyEvent);
            }
        });
        C17771 c17771 = (C17771) viewM40395.findViewById(R.id.MT_Protector);
        this.f3891 = c17771;
        c17771.m41595("rpur", (String) null);
        c17771.m41608();
        c17771.m41592(17);
        C23255 c23255M41605 = c17771.m41605();
        c23255M41605.m52333(6);
        c23255M41605.mo52291(2);
        c23255M41605.setOnKeyListener(new View.OnKeyListener() { // from class: l.۟ۢ۫
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
                return C1090.m4088(this.f25945, i2, keyEvent);
            }
        });
        C23255 c23255 = (C23255) viewM40395.findViewById(R.id.MT_Protector);
        this.f3890 = c23255;
        c23255.m52333(5);
        String string = ApplicationC17729.f58258.getString("rpua", "MT-RemotePayload/1");
        c23255.mo52335((CharSequence) (C14030.m34160(string) ? string : "MT-RemotePayload/1"));
        C23255 c23256 = (C23255) viewM40395.findViewById(R.id.MT_Protector);
        this.f3893 = c23256;
        c23256.m52333(6);
        int i2 = 4;
        int i3 = ApplicationC17729.f58258.getInt("rpdt", 4);
        if (i3 >= 1 && i3 <= 16) {
            i2 = i3;
        }
        c23256.mo52335((CharSequence) String.valueOf(i2));
        c23256.setOnKeyListener(new View.OnKeyListener() { // from class: l.ᩳۢ۫
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i4, KeyEvent keyEvent) {
                return C1090.m4091(this.f61536, i4, keyEvent);
            }
        });
        viewM40395.findViewById(R.id.help).setOnClickListener(new ViewOnClickListenerC16971(2, main));
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m4089(C1090 c1090, int i, KeyEvent keyEvent) {
        if (i != 4 || keyEvent.getAction() != 0) {
            return false;
        }
        c1090.f3892.dismiss();
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m4088(C1090 c1090, int i, KeyEvent keyEvent) {
        if (i != 66 && i != 160) {
            return false;
        }
        if (keyEvent.getAction() == 1) {
            c1090.m4090();
        }
        return true;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m4091(C1090 c1090, int i, KeyEvent keyEvent) {
        if (i != 66 && i != 160) {
            return false;
        }
        if (keyEvent.getAction() == 1) {
            c1090.m4090();
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4092() {
        C17771 c17771 = this.f3891;
        c17771.m41590();
        DialogInterfaceC8327 dialogInterfaceC8327 = this.f3892;
        dialogInterfaceC8327.m22432();
        dialogInterfaceC8327.m22436().setOnClickListener(new View.OnClickListener() { // from class: l.ۢۢ۫
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f32171.m4090();
            }
        });
        C21576.m49090(c17771.m41605());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public void m4090() {
        C16903 c16903M39861;
        AbstractActivityC17204 abstractActivityC17204 = this.f3888;
        C23255 c23255 = this.f3893;
        C17771 c17771 = this.f3891;
        String strTrim = c17771.m41599().toString().trim();
        try {
            c16903M39861 = C16903.m39861(strTrim);
        } catch (IllegalArgumentException unused) {
            c16903M39861 = null;
        }
        if (c16903M39861 == null || !c16903M39861.m39865().isEmpty() || !c16903M39861.m39864().isEmpty() || c16903M39861.m39872().isEmpty()) {
            c17771.m41605().requestFocus();
            C22673.m51159(R.string.MT_Protector);
            return;
        }
        C23255 c23256 = this.f3890;
        String strTrim2 = c23256.m54021().toString().trim();
        if (!C14030.m34160(strTrim2)) {
            c23256.requestFocus();
            C22673.m51159(R.string.MT_Protector);
            return;
        }
        try {
            int i = Integer.parseInt(c23255.m54021().toString().trim());
            if (i >= 1 && i <= 16) {
                if (strTrim.length() <= 2000) {
                    c17771.m41594(strTrim);
                    c17771.m41603();
                }
                ApplicationC17729.f58258.edit().putString("rpua", strTrim2).mo3486(i, "rpdt").apply();
                this.f3892.dismiss();
                ((C8614) this.f3889.f56446).m23184((InterfaceC14075) new C18243(strTrim, strTrim2, i, new C8547()));
                return;
            }
            c23255.requestFocus();
            c23255.m52289();
            C22673.m51160(abstractActivityC17204.getString(R.string.MT_Protector, 16));
        } catch (NumberFormatException unused2) {
            c23255.requestFocus();
            c23255.m52289();
            C22673.m51160(abstractActivityC17204.getString(R.string.MT_Protector, 16));
        }
    }
}
