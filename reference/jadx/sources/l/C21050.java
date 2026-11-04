package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.io.IOException;

/* JADX INFO: renamed from: l.᩶ۘۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: MB7O */
/* JADX INFO: loaded from: classes5.dex */
public final class C21050 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC22044 m48107(AbstractC22044 abstractC22044) {
        if (!abstractC22044.getName().toLowerCase().endsWith(".arsc")) {
            try {
                C22941 c22941 = new C22941(abstractC22044);
                try {
                    C8002 entry = c22941.getEntry("resources.arsc");
                    if (entry == null) {
                        c22941.close();
                        return abstractC22044;
                    }
                    AbstractC22044 abstractC22044M49857 = C6382.f21561.m49857(".arsc");
                    abstractC22044M49857.m49840(c22941.m51727(entry));
                    c22941.close();
                    return abstractC22044M49857;
                } catch (Throwable th) {
                    try {
                        c22941.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException unused) {
            }
        }
        return abstractC22044;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m48108(final C9170 c9170, final C8614 c8614) {
        Main mainM23233 = c8614.m23233();
        View viewM40395 = mainM23233.m40395(R.layout.MT_Protector);
        C23255 c23255 = (C23255) viewM40395.findViewById(R.id.MT_Protector);
        C23255 c23256 = (C23255) viewM40395.findViewById(R.id.editText2);
        ((TextView) viewM40395.findViewById(R.id.title)).setText(R.string.MT_Protector);
        c23255.m54107(true);
        c23256.m54107(true);
        C2459.m8293(c9170.f29768, c9170.f29767, c23255, c23256);
        int i = DialogInterfaceC8327.f27315;
        C2361 c2361 = new C2361(mainM23233);
        c2361.m8005(viewM40395);
        c2361.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۨۘۤ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                C9170 c9171 = c9170;
                c9171.m24303();
                AbstractC22044 abstractC22044 = c9171.f29765;
                AbstractC22044 abstractC22045 = c9171.f29769;
                AbstractC22044 abstractC22044M33163 = C13485.m33163(c8614, R.string.MT_Protector, "mtcr");
                int i3 = C13678.f43415;
                C8458 c8458 = new C8458(C14336.class);
                c8458.m22719("saveAsPath", abstractC22044M33163.mo4294());
                c8458.m22719("inputPath1", abstractC22044.mo4294());
                c8458.m22719("inputPath2", abstractC22045.mo4294());
                c8458.m22714();
            }
        });
        c2361.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c2361.m8018(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c2361.m8016().m22440().setOnClickListener(new ViewOnClickListenerC6134(c9170, c23255, c23256, 0));
    }
}
