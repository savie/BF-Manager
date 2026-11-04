package l;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.֡ۚܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: R6KO */
/* JADX INFO: loaded from: classes2.dex */
public final class C0215 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m1663(final C8614 c8614, final InterfaceC2386 interfaceC2386) {
        C2343 c2343M7885;
        String strM7890;
        final AbstractC7364 abstractC7364M23213 = c8614.m23213();
        final boolean zEquals = "multipart/related".equals(C11401.m28751(interfaceC2386.getName()));
        try {
            c2343M7885 = C2343.m7885(c8614, interfaceC2386);
        } catch (IllegalArgumentException unused) {
            c2343M7885 = null;
        }
        C2361 c2361BuildDialog = c8614.m23233().buildDialog();
        final C13529 c13529 = new C13529(C21576.f68931);
        if (c2343M7885 == null) {
            strM7890 = null;
        } else {
            strM7890 = zEquals ? c2343M7885.m7890() : c13529.m33234(c2343M7885);
        }
        final boolean[] zArr = {false};
        View viewInflate = LayoutInflater.from(c2361BuildDialog.m8020()).inflate(R.layout.MT_Protector, (ViewGroup) null);
        final C7563 c7563M1661 = m1661(viewInflate, zEquals ? null : c2343M7885, strM7890, new Runnable() { // from class: l.ۨۚܳ
            @Override // java.lang.Runnable
            public final void run() {
                zArr[0] = true;
            }
        });
        final boolean zM21368 = C7847.m21368(interfaceC2386.getName());
        final Spinner spinnerM1660 = m1660(viewInflate, zM21368);
        final View viewFindViewById = viewInflate.findViewById(R.id.MT_Protector);
        final View viewFindViewById2 = viewInflate.findViewById(R.id.MT_Protector);
        viewFindViewById.setVisibility(8);
        viewFindViewById2.setVisibility(8);
        if (c7563M1661 == null) {
            c2361BuildDialog.m8008(interfaceC2386.getName());
        }
        c2361BuildDialog.m8023(viewInflate);
        c2361BuildDialog.m8021(R.string.MT_Protector);
        c2361BuildDialog.m8018(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        final C2343 c2343 = c2343M7885;
        c2361BuildDialog.m8022(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۛۚܳ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C8614 c8615 = c8614;
                if (c8615.m23213() == abstractC7364M23213) {
                    C15699.m37472(spinnerM1660.getSelectedItemPosition(), zM21368);
                    C7563 c7563 = c7563M1661;
                    if (c7563 != null) {
                        c13529.m33235(c2343, c7563.m20654(), zArr[0]);
                    }
                    C1663.m5972(interfaceC2386, c8615, ActivityC18143.class);
                }
            }
        });
        final C2343 c2344 = c2343M7885;
        final String str = strM7890;
        c2361BuildDialog.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩺ۚܳ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C8614 c8615 = c8614;
                if (c8615.m23213() != abstractC7364M23213) {
                    return;
                }
                C15699.m37472(spinnerM1660.getSelectedItemPosition(), zM21368);
                final C2343 c2345 = c2344;
                if (c2345 == null) {
                    C22673.m51152(R.string.MT_Protector);
                    return;
                }
                C7563 c7563 = c7563M1661;
                String strM20654 = c7563 == null ? str : c7563.m20654();
                final boolean z = zEquals;
                final C13529 c135210 = c13529;
                final boolean[] zArr2 = zArr;
                final String str2 = strM20654;
                ActivityC3846.m12421(c8615, interfaceC2386, c2345, strM20654, new Runnable() { // from class: l.ܿۚܳ
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (z) {
                            return;
                        }
                        c135210.m33235(c2345, str2, zArr2[0]);
                    }
                });
            }
        });
        DialogInterfaceC8327 dialogInterfaceC8327M8016 = c2361BuildDialog.m8016();
        final View viewM22423 = dialogInterfaceC8327M8016.m22423(R.id.MT_Protector);
        viewM22423.setVisibility(c7563M1661 == null ? 8 : 0);
        final Button buttonM22440 = dialogInterfaceC8327M8016.m22440();
        final ColorStateList textColors = buttonM22440.getTextColors();
        final TextView textView = (TextView) viewInflate.findViewById(R.id.MT_Protector);
        buttonM22440.setOnClickListener(new View.OnClickListener() { // from class: l.ۘۚܳ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                View view2 = viewFindViewById;
                int i = 0;
                boolean z = view2.getVisibility() != 0;
                view2.setVisibility(z ? 0 : 8);
                C7563 c7563 = c7563M1661;
                viewFindViewById2.setVisibility((!z || c7563 == null) ? 8 : 0);
                if (!z && c7563 == null) {
                    i = 8;
                }
                viewM22423.setVisibility(i);
                buttonM22440.setTextColor(z ? textView.getTextColors() : textColors);
            }
        });
        C5416.m16144(dialogInterfaceC8327M8016);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m1662(ActivityC3846 activityC3846, C2343 c2343, String str, final boolean z, final C11296 c11296) {
        C2361 c2361BuildDialog = activityC3846.buildDialog();
        View viewInflate = LayoutInflater.from(c2361BuildDialog.m8020()).inflate(R.layout.MT_Protector, (ViewGroup) null);
        final C7563 c7563M1661 = m1661(viewInflate, c2343, str, new RunnableC10858(1));
        final Spinner spinnerM1660 = m1660(viewInflate, z);
        c2361BuildDialog.m8023(viewInflate);
        c2361BuildDialog.m8021(R.string.MT_Protector);
        c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c2361BuildDialog.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ܰۚܳ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C15699.m37472(spinnerM1660.getSelectedItemPosition(), z);
                C7563 c7563 = c7563M1661;
                if (c7563 != null) {
                    c11296.n(c7563.m20654());
                }
            }
        });
        C5416.m16144(c2361BuildDialog.m8016());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Spinner m1660(View view, boolean z) {
        Context context = view.getContext();
        String string = context.getString(z ? R.string.MT_Protector : R.string.MT_Protector);
        ((TextView) view.findViewById(R.id.MT_Protector)).setText(string);
        String[] strArr = {context.getString(R.string.MT_Protector), context.getString(R.string.MT_Protector), context.getString(R.string.MT_Protector)};
        Spinner spinner = (Spinner) view.findViewById(R.id.MT_Protector);
        spinner.setContentDescription(string);
        spinner.setAdapter((SpinnerAdapter) new C3054(context, strArr));
        spinner.setSelection(C15699.m37471(z));
        return spinner;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C7563 m1661(View view, C2343 c2343, String str, Runnable runnable) {
        if (c2343 == null) {
            view.findViewById(R.id.MT_Protector).setVisibility(8);
            view.findViewById(R.id.MT_Protector).setVisibility(8);
            return null;
        }
        TextView textView = (TextView) view.findViewById(R.id.MT_Protector);
        textView.setText("/" + c2343.m7891(str));
        C7563 c7563 = new C7563(view.getContext(), c2343, str, new C21098(runnable, textView, c2343));
        ((FrameLayout) view.findViewById(R.id.MT_Protector)).addView(c7563, new FrameLayout.LayoutParams(-1, -2));
        return c7563;
    }
}
