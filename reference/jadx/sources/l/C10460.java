package l;

import android.content.DialogInterface;
import android.content.Intent;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.view.MenuItem;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.io.DataInputStream;

/* JADX INFO: renamed from: l.ۢ᩺ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 313P */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C10460 implements InterfaceC5392, InterfaceC21436 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f33279;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f33280;

    public /* synthetic */ C10460(Object obj, Object obj2) {
        this.f33279 = obj;
        this.f33280 = obj2;
    }

    @Override // l.InterfaceC21436
    public boolean onMenuItemClick(MenuItem menuItem) {
        C19206.m44513((C19206) this.f33279, (C8230) this.f33280, menuItem);
        return true;
    }

    @Override // l.InterfaceC5392
    /* JADX INFO: renamed from: ۙ */
    public void mo1772(final AbstractC22044 abstractC22044) {
        boolean z;
        C8614 c8614 = (C8614) this.f33279;
        final InterfaceC2386 interfaceC2386 = (InterfaceC2386) this.f33280;
        final Main mainM23233 = c8614.m23233();
        int i = ActivityC11563.f36350;
        int i2 = 0;
        try {
            DataInputStream dataInputStream = new DataInputStream(abstractC22044.mo4290());
            try {
                z = ((long) dataInputStream.readInt()) == 2135247942;
                try {
                    dataInputStream.close();
                } catch (Exception unused) {
                }
            } catch (Throwable th) {
                try {
                    dataInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Exception unused2) {
            z = false;
        }
        String strM49088 = C21576.m49088(R.string.MT_Protector);
        SpannableString spannableString = new SpannableString(((Object) strM49088) + "\n" + C21576.m49088(R.string.MT_Protector));
        spannableString.setSpan(new ForegroundColorSpan(C3296.f10774), strM49088.length() + 1, spannableString.length(), 17);
        spannableString.setSpan(new AbsoluteSizeSpan(C6907.m19161(12.0f)), strM49088.length() + 1, spannableString.length(), 17);
        C2361 c2361BuildDialog = mainM23233.buildDialog();
        c2361BuildDialog.m8024(abstractC22044.getName());
        c2361BuildDialog.m8008(ApplicationC17729.f58258.getBoolean("ewrp", false) ? spannableString : strM49088);
        c2361BuildDialog.m8026(R.string.MT_Protector, new DialogInterfaceOnClickListenerC15046(mainM23233, abstractC22044, interfaceC2386, 2));
        c2361BuildDialog.m8022(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۙۤ᩻
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                int i4 = ActivityC11563.f36350;
                int i5 = C1663.f5756;
                AbstractActivityC17204 abstractActivityC17204 = mainM23233;
                Intent intent = new Intent(abstractActivityC17204, (Class<?>) ActivityC18143.class);
                intent.addFlags(268435456);
                intent.setAction("android.intent.action.VIEW");
                intent.setData(abstractC22044.m49836());
                abstractActivityC17204.startActivity(intent);
                C20065.m46116(interfaceC2386, 2000);
            }
        });
        c2361BuildDialog.m8018(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        DialogInterfaceC8327 dialogInterfaceC8327M8016 = c2361BuildDialog.m8016();
        if (z) {
            dialogInterfaceC8327M8016.m22433().setEnabled(false);
        }
        C5416.m16141(dialogInterfaceC8327M8016);
        dialogInterfaceC8327M8016.m22440().setOnClickListener(new ViewOnClickListenerC22006(dialogInterfaceC8327M8016, spannableString, strM49088, i2));
    }
}
