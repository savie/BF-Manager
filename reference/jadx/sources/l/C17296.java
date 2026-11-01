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

/* JADX INFO: renamed from: l.ܿۧ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: I6X2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17296 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final int[] f55057 = {R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector};

    /* JADX WARN: Type inference failed for: r2v8, types: [l.֡ۧ֨] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m40261(final AbstractActivityC12483 abstractActivityC12483, int i, C19268 c19268) {
        View viewM30995 = abstractActivityC12483.m30995(R.layout.MT_Protector);
        ((TextView) viewM30995.findViewById(R.id.MT_Protector)).setText(R.string.MT_Protector);
        final ImageView imageView = (ImageView) viewM30995.findViewById(R.id.icon);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
        int iM33769 = C13932.m33769(48.0f);
        marginLayoutParams.height = iM33769;
        marginLayoutParams.width = iM33769;
        marginLayoutParams.topMargin = C13932.m33769(4.0f);
        imageView.setLayoutParams(marginLayoutParams);
        imageView.setTranslationY(-marginLayoutParams.topMargin);
        final int[] iArr = {C16259.m38411(i)};
        final GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        imageView.setBackground(gradientDrawable);
        imageView.setImageResource(R.drawable.MT_Protector);
        int iRound = Math.round((Math.min(imageView.getLayoutParams().width, imageView.getLayoutParams().height) * 0.39999998f) / 2.0f);
        imageView.setPadding(iRound, iRound, iRound, iRound);
        imageView.setClickable(false);
        imageView.setFocusable(false);
        imageView.setContentDescription(abstractActivityC12483.getString(R.string.MT_Protector));
        int iM38412 = C16259.m38412(abstractActivityC12483, iArr[0]);
        gradientDrawable.setColor(iM38412);
        imageView.setImageTintList(ColorStateList.valueOf(C3057.m9159(iM38412) > 220 ? -12895429 : -1));
        ?? r2 = new View.OnClickListener() { // from class: l.֡ۧ֨
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int iIntValue = ((Integer) view.getTag()).intValue();
                iArr[0] = iIntValue;
                int iM38413 = C16259.m38412(abstractActivityC12483, iIntValue);
                gradientDrawable.setColor(iM38413);
                imageView.setImageTintList(ColorStateList.valueOf(C3057.m9159(iM38413) > 220 ? -12895429 : -1));
            }
        };
        m40262(abstractActivityC12483, (ImageView) viewM30995.findViewById(R.id.MT_Protector), 16777216, C16259.m38412(abstractActivityC12483, 16777216), r2);
        m40262(abstractActivityC12483, (ImageView) viewM30995.findViewById(R.id.MT_Protector), 0, C16259.m38412(abstractActivityC12483, 0), r2);
        C11795 c11795 = (C11795) viewM30995.findViewById(R.id.MT_Protector).getLayoutParams();
        C11795 c11796 = (C11795) viewM30995.findViewById(R.id.MT_Protector).getLayoutParams();
        C11795 c11797 = (C11795) viewM30995.findViewById(R.id.MT_Protector).getLayoutParams();
        C11795 c11798 = (C11795) viewM30995.findViewById(R.id.divider).getLayoutParams();
        c11795.f39651 = R.id.MT_Protector;
        c11795.f39644 = R.id.MT_Protector;
        c11796.f39651 = R.id.MT_Protector;
        c11796.f39644 = R.id.MT_Protector;
        c11797.f39651 = R.id.MT_Protector;
        c11797.f39644 = R.id.MT_Protector;
        c11798.f39651 = R.id.MT_Protector;
        viewM30995.findViewById(R.id.MT_Protector).setVisibility(8);
        for (int i2 = 0; i2 < 14; i2++) {
            ImageView imageView2 = (ImageView) viewM30995.findViewById(f55057[i2]);
            ColorStateList imageTintList = imageView2.getImageTintList();
            C13638.requireNonNull(imageTintList);
            int defaultColor = imageTintList.getDefaultColor();
            m40262(abstractActivityC12483, imageView2, defaultColor, defaultColor, r2);
        }
        ImageView imageView3 = (ImageView) viewM30995.findViewById(R.id.MT_Protector);
        imageView3.setContentDescription(abstractActivityC12483.getString(R.string.MT_Protector));
        imageView3.setOnClickListener(new View.OnClickListener() { // from class: l.ܽۧ֨
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final AbstractActivityC12483 abstractActivityC12484 = abstractActivityC12483;
                DialogInterfaceOnClickListenerC18046 dialogInterfaceOnClickListenerC18046 = new DialogInterfaceOnClickListenerC18046(abstractActivityC12484, false);
                final GradientDrawable gradientDrawable2 = gradientDrawable;
                final ImageView imageView4 = imageView;
                final int[] iArr2 = iArr;
                dialogInterfaceOnClickListenerC18046.m42043(new InterfaceC21574() { // from class: l.۫ۧ֨
                    @Override // l.InterfaceC21574
                    /* JADX INFO: renamed from: ܰ */
                    public final void mo14999(int i3) {
                        int iM38411 = C16259.m38411(i3);
                        iArr2[0] = iM38411;
                        int iM38413 = C16259.m38412(abstractActivityC12484, iM38411);
                        gradientDrawable2.setColor(iM38413);
                        imageView4.setImageTintList(ColorStateList.valueOf(C3057.m9159(iM38413) > 220 ? -12895429 : -1));
                    }
                });
                dialogInterfaceOnClickListenerC18046.m42042(C16259.m38412(abstractActivityC12484, iArr2[0]));
            }
        });
        C8067 c8067BuildDialog = abstractActivityC12483.buildDialog();
        c8067BuildDialog.m21258(viewM30995);
        c8067BuildDialog.m21251(R.string.MT_Protector, new DialogInterfaceOnClickListenerC12728(2, c19268, iArr));
        c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        C8875.m23019(c8067BuildDialog.m21269());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m40262(AbstractActivityC12483 abstractActivityC12483, ImageView imageView, int i, int i2, ViewOnClickListenerC0362 viewOnClickListenerC0362) {
        String string;
        imageView.setImageTintList(ColorStateList.valueOf(i2));
        imageView.setTag(Integer.valueOf(i));
        int i3 = C16259.f52420;
        if (i == 0 || i == 16777216) {
            string = abstractActivityC12483.getString(R.string.MT_Protector);
        } else {
            string = String.format(Locale.ROOT, "#%06X", Integer.valueOf(16777215 & i2));
        }
        imageView.setContentDescription(string);
        imageView.setOnClickListener(viewOnClickListenerC0362);
    }
}
