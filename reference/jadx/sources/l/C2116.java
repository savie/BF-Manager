package l;

import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.Locale;

/* JADX INFO: renamed from: l.֫ᩴۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: I6X2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2116 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final int[] f6997 = {R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector};

    /* JADX WARN: Type inference failed for: r2v8, types: [l.ܳᩴۚ] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m7296(final AbstractActivityC17204 abstractActivityC17204, int i, C7073 c7073) {
        View viewM40395 = abstractActivityC17204.m40395(R.layout.MT_Protector);
        ((TextView) viewM40395.findViewById(R.id.title)).setText(R.string.MT_Protector);
        final ImageView imageView = (ImageView) viewM40395.findViewById(R.id.icon);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
        int iM19160 = C6907.m19160(48.0f);
        marginLayoutParams.height = iM19160;
        marginLayoutParams.width = iM19160;
        marginLayoutParams.topMargin = C6907.m19160(4.0f);
        imageView.setLayoutParams(marginLayoutParams);
        imageView.setTranslationY(-marginLayoutParams.topMargin);
        final int[] iArr = {C0492.m2365(i)};
        final GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        imageView.setBackground(gradientDrawable);
        imageView.setImageResource(R.drawable.MT_Protector);
        int iRound = Math.round((Math.min(imageView.getLayoutParams().width, imageView.getLayoutParams().height) * 0.39999998f) / 2.0f);
        imageView.setPadding(iRound, iRound, iRound, iRound);
        imageView.setClickable(false);
        imageView.setFocusable(false);
        imageView.setContentDescription(abstractActivityC17204.getString(R.string.MT_Protector));
        int iM2366 = C0492.m2366(abstractActivityC17204, iArr[0]);
        gradientDrawable.setColor(iM2366);
        imageView.setImageTintList(ColorStateList.valueOf(C8420.m22611(iM2366) > 220 ? -12895429 : -1));
        ?? r2 = new View.OnClickListener() { // from class: l.ܳᩴۚ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int iIntValue = ((Integer) view.getTag()).intValue();
                iArr[0] = iIntValue;
                int iM2367 = C0492.m2366(abstractActivityC17204, iIntValue);
                gradientDrawable.setColor(iM2367);
                imageView.setImageTintList(ColorStateList.valueOf(C8420.m22611(iM2367) > 220 ? -12895429 : -1));
            }
        };
        m7297(abstractActivityC17204, (ImageView) viewM40395.findViewById(R.id.MT_Protector), 16777216, C0492.m2366(abstractActivityC17204, 16777216), r2);
        m7297(abstractActivityC17204, (ImageView) viewM40395.findViewById(R.id.MT_Protector), 0, C0492.m2366(abstractActivityC17204, 0), r2);
        C11651 c11651 = (C11651) viewM40395.findViewById(R.id.MT_Protector).getLayoutParams();
        C11651 c11652 = (C11651) viewM40395.findViewById(R.id.MT_Protector).getLayoutParams();
        C11651 c11653 = (C11651) viewM40395.findViewById(R.id.MT_Protector).getLayoutParams();
        C11651 c11654 = (C11651) viewM40395.findViewById(R.id.divider).getLayoutParams();
        c11651.f37745 = R.id.MT_Protector;
        c11651.f37730 = R.id.MT_Protector;
        c11652.f37745 = R.id.MT_Protector;
        c11652.f37730 = R.id.MT_Protector;
        c11653.f37745 = R.id.MT_Protector;
        c11653.f37730 = R.id.MT_Protector;
        c11654.f37745 = R.id.MT_Protector;
        viewM40395.findViewById(R.id.MT_Protector).setVisibility(8);
        for (int i2 = 0; i2 < 14; i2++) {
            ImageView imageView2 = (ImageView) viewM40395.findViewById(f6997[i2]);
            ColorStateList imageTintList = imageView2.getImageTintList();
            C17359.requireNonNull(imageTintList);
            int defaultColor = imageTintList.getDefaultColor();
            m7297(abstractActivityC17204, imageView2, defaultColor, defaultColor, r2);
        }
        ImageView imageView3 = (ImageView) viewM40395.findViewById(R.id.MT_Protector);
        imageView3.setContentDescription(abstractActivityC17204.getString(R.string.MT_Protector));
        imageView3.setOnClickListener(new View.OnClickListener() { // from class: l.۫ᩴۚ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final AbstractActivityC17204 abstractActivityC17205 = abstractActivityC17204;
                DialogInterfaceOnClickListenerC6316 dialogInterfaceOnClickListenerC6316 = new DialogInterfaceOnClickListenerC6316(abstractActivityC17205, false);
                final GradientDrawable gradientDrawable2 = gradientDrawable;
                final ImageView imageView4 = imageView;
                final int[] iArr2 = iArr;
                dialogInterfaceOnClickListenerC6316.m18031(new InterfaceC12281() { // from class: l.ۚᩴۚ
                    @Override // l.InterfaceC12281
                    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
                    public final void mo17031(int i3) {
                        int iM2365 = C0492.m2365(i3);
                        iArr2[0] = iM2365;
                        int iM2367 = C0492.m2366(abstractActivityC17205, iM2365);
                        gradientDrawable2.setColor(iM2367);
                        imageView4.setImageTintList(ColorStateList.valueOf(C8420.m22611(iM2367) > 220 ? -12895429 : -1));
                    }
                });
                dialogInterfaceOnClickListenerC6316.m18030(C0492.m2366(abstractActivityC17205, iArr2[0]));
            }
        });
        C2361 c2361BuildDialog = abstractActivityC17204.buildDialog();
        c2361BuildDialog.m8005(viewM40395);
        c2361BuildDialog.m8026(R.string.MT_Protector, new DialogInterfaceOnClickListenerC9931(1, c7073, iArr));
        c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        C21232.m48398(c2361BuildDialog.m8016());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m7297(AbstractActivityC17204 abstractActivityC17204, ImageView imageView, int i, int i2, ViewOnClickListenerC15539 viewOnClickListenerC15539) {
        String string;
        imageView.setImageTintList(ColorStateList.valueOf(i2));
        imageView.setTag(Integer.valueOf(i));
        int i3 = C0492.f2135;
        if (i == 0 || i == 16777216) {
            string = abstractActivityC17204.getString(R.string.MT_Protector);
        } else {
            string = String.format(Locale.ROOT, "#%06X", Integer.valueOf(16777215 & i2));
        }
        imageView.setContentDescription(string);
        imageView.setOnClickListener(viewOnClickListenerC15539);
    }
}
