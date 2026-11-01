package l;

import android.content.Context;
import android.content.DialogInterface;
import android.widget.LinearLayout;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩻ۖ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: R6KO */
/* JADX INFO: loaded from: classes.dex */
public final class C23416 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51561(final C11545 c11545, final InterfaceC2557 interfaceC2557) {
        C18559 c18559M42969;
        String strM42973;
        C6564 c6564;
        final AbstractC11462 abstractC11462M28817 = c11545.m28817();
        final boolean zEquals = "multipart/related".equals(C10010.m25285(interfaceC2557.getName()));
        try {
            c18559M42969 = C18559.m42969(c11545, interfaceC2557);
        } catch (IllegalArgumentException unused) {
            c18559M42969 = null;
        }
        C8067 c8067BuildDialog = c11545.m28824().buildDialog();
        Context contextM21273 = c8067BuildDialog.m21273();
        LinearLayout linearLayout = new LinearLayout(contextM21273);
        linearLayout.setOrientation(1);
        int iM51559 = m51559(contextM21273, 24);
        linearLayout.setPadding(iM51559, m51559(contextM21273, 12), iM51559, 0);
        final C10093 c10093 = new C10093(C16737.f53607);
        if (c18559M42969 == null) {
            strM42973 = null;
        } else {
            strM42973 = zEquals ? c18559M42969.m42973() : c10093.m25504(c18559M42969);
        }
        final boolean[] zArr = {false};
        if (zEquals || c18559M42969 == null) {
            c6564 = null;
        } else {
            m51560(linearLayout, contextM21273.getString(R.string.MT_Protector), 14, false, 0);
            C22357 c22357 = new C22357(contextM21273);
            c22357.setTextSize(14.0f);
            c22357.setTextColor(C20368.f66007);
            c22357.setText("/" + c18559M42969.m42974(strM42973));
            C6564 c6565 = new C6564(contextM21273, c18559M42969, strM42973, new C12127(zArr, c22357, c18559M42969));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.topMargin = m51559(contextM21273, 10);
            linearLayout.addView(c6565, layoutParams);
            m51560(linearLayout, contextM21273.getString(R.string.MT_Protector), 12, true, 14);
            linearLayout.addView(c22357);
            c8067BuildDialog.m21276(linearLayout);
            c6564 = c6565;
        }
        c8067BuildDialog.m21274(R.string.MT_Protector);
        final C6564 c6566 = c6564;
        final C18559 c18559 = c18559M42969;
        c8067BuildDialog.m21275(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ܿۖ᩹
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C11545 c11546 = c11545;
                if (c11546.m28817() == abstractC11462M28817) {
                    C6564 c6567 = c6566;
                    if (c6567 != null) {
                        c10093.m25505(c18559, c6567.m17810(), zArr[0]);
                    }
                    C8265.m21676(c11546, interfaceC2557, ActivityC11632.class);
                }
            }
        });
        final C18559 c185510 = c18559M42969;
        final C6564 c6567 = c6564;
        final String str = strM42973;
        c8067BuildDialog.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۛۖ᩹
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C11545 c11546 = c11545;
                if (c11546.m28817() != abstractC11462M28817) {
                    return;
                }
                C18559 c185511 = c185510;
                if (c185511 == null) {
                    C15829.m37611(R.string.MT_Protector);
                    return;
                }
                C6564 c6568 = c6567;
                String strM17810 = c6568 == null ? str : c6568.m17810();
                ActivityC10181.m25941(c11546, interfaceC2557, c185511, strM17810, new RunnableC10716(zEquals, c10093, c185511, strM17810, zArr));
            }
        });
        c8067BuildDialog.m21269();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51560(LinearLayout linearLayout, String str, int i, boolean z, int i2) {
        Context context = linearLayout.getContext();
        C22357 c22357 = new C22357(context);
        c22357.setText(str);
        c22357.setTextSize(i);
        c22357.setTextColor(z ? C20368.f65988 : C20368.f66007);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = m51559(context, i2);
        linearLayout.addView(c22357, layoutParams);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m51559(Context context, int i) {
        return Math.round(i * context.getResources().getDisplayMetrics().density);
    }
}
