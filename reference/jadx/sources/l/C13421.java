package l;

import android.animation.ObjectAnimator;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۬᩺ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31PG */
/* JADX INFO: loaded from: classes4.dex */
public final class C13421 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C13897 f44409;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C11780 f44410;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC3541 f44411;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public String f44412;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public String f44413;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public HashMap f44414 = new HashMap();

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f44415;

    public C13421(ActivityC3541 activityC3541, String str) {
        this.f44411 = activityC3541;
        this.f44415 = str;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        m10245(this.f44411);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() throws Exception {
        HashMap map = this.f44414;
        String str = this.f44415;
        C18310 c18310M43738 = C19016.m43738(C5553.m15313(str, new String[0]));
        if (c18310M43738 == null) {
            throw new Exception();
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(256, 256, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Drawable drawableM42529 = c18310M43738.m42529();
        Rect rectCopyBounds = drawableM42529.copyBounds();
        drawableM42529.setBounds(0, 0, 256, 256);
        drawableM42529.draw(canvas);
        drawableM42529.setBounds(rectCopyBounds);
        C2455 c2455 = new C2455(str);
        try {
            boolean z = c2455.getEntry("assets/xposed_init") != null;
            C12107 entry = c2455.getEntry(C12035.m29933(1));
            int i = 2;
            while (true) {
                for (C7807 c7807 : (AbstractC18494) C17684.m41160(c2455.m7471(entry)).mo34148()) {
                    String type = c7807.getType();
                    if (!map.containsKey(type)) {
                        map.put(type, new C21887(c7807));
                    }
                }
                int i2 = i + 1;
                C12107 entry2 = c2455.getEntry(C12035.m29933(i));
                if (entry2 == null) {
                    break;
                }
                i = i2;
                entry = entry2;
            }
            c2455.close();
            C11780 c11780 = new C11780();
            this.f44410 = c11780;
            c11780.f39569 = C1709.m5696();
            this.f44410.f39570 = c18310M43738.m42532();
            this.f44410.f39572 = c18310M43738.m42535();
            this.f44410.f39565 = c18310M43738.m42531();
            C11780 c11781 = this.f44410;
            c11781.f39564 = bitmapCreateBitmap;
            c11781.f39574 = System.currentTimeMillis();
            this.f44413 = String.valueOf(c18310M43738.m42528());
            this.f44412 = C1791.m5863(c18310M43738.m42527());
            String str2 = this.f44410.f39572;
            C13897 c13897 = new C13897();
            c13897.f45784 = true;
            c13897.f45782 = false;
            c13897.f45786 = z;
            c13897.f45783 = false;
            c13897.f45781 = C15489.m37076(str2, ".**");
            AbstractC20745 abstractC20745M46690 = C11904.m29695().m46690("protector/config/" + str2 + ".json");
            if (abstractC20745M46690.mo33975() && abstractC20745M46690.mo33971()) {
                try {
                    c13897.m33734(abstractC20745M46690.m46730());
                } catch (IOException unused) {
                }
            }
            this.f44409 = c13897;
        } catch (Throwable th) {
            try {
                c2455.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        ActivityC3541 activityC3541 = this.f44411;
        View viewM30995 = activityC3541.m30995(R.layout.MT_Protector);
        ImageView imageView = (ImageView) viewM30995.findViewById(R.id.icon);
        TextView textView = (TextView) viewM30995.findViewById(R.id.MT_Protector);
        TextView textView2 = (TextView) viewM30995.findViewById(R.id.MT_Protector);
        TextView textView3 = (TextView) viewM30995.findViewById(R.id.MT_Protector);
        TextView textView4 = (TextView) viewM30995.findViewById(R.id.MT_Protector);
        TextView textView5 = (TextView) viewM30995.findViewById(R.id.MT_Protector);
        final C10948 c10948 = (C10948) viewM30995.findViewById(R.id.MT_Protector);
        final C10948 c10949 = (C10948) viewM30995.findViewById(R.id.editText2);
        final CheckBox checkBox = (CheckBox) viewM30995.findViewById(R.id.MT_Protector);
        final CheckBox checkBox2 = (CheckBox) viewM30995.findViewById(R.id.MT_Protector);
        final CheckBox checkBox3 = (CheckBox) viewM30995.findViewById(R.id.MT_Protector);
        final CheckBox checkBox4 = (CheckBox) viewM30995.findViewById(R.id.MT_Protector);
        View viewFindViewById = viewM30995.findViewById(R.id.button1);
        View viewFindViewById2 = viewM30995.findViewById(R.id.MT_Protector);
        activityC3541.f13042 = c10949;
        final String str = this.f44415;
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: l.ۗۜۜ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C23566 c23566 = this.f11541.f44411.f13048;
                C10948 c109410 = c10949;
                String string = c109410.m16842() == 0 ? str : c109410.m17000().toString();
                c23566.getClass();
                C23566.m51966(c23566, R.string.MT_Protector, string, null, 12);
            }
        });
        checkBox.setChecked(this.f44409.f45784);
        checkBox2.setChecked(this.f44409.f45782);
        checkBox3.setChecked(this.f44409.f45786);
        checkBox4.setChecked(false);
        c10949.mo16989((CharSequence) this.f44409.f45785);
        c10948.mo16989((CharSequence) this.f44409.f45781);
        c10948.mo17029(c10948.m16842());
        imageView.setImageBitmap(this.f44410.f39564);
        textView.setText(this.f44410.f39570);
        textView2.setText(this.f44410.f39565);
        textView3.setText(this.f44413);
        textView4.setText(this.f44410.f39572);
        textView5.setText(this.f44412);
        viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: l.ۙ᩺ۜ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C13421 c13421 = this.f17292;
                ActivityC3541 activityC3542 = c13421.f44411;
                String string = c10948.m17000().toString();
                String string2 = c10949.m17000().toString();
                Collection collectionValues = c13421.f44414.values();
                int i = ActivityC3541.f13037;
                new C7070(activityC3542, string, string2, collectionValues).m10243();
            }
        });
        C8067 c8067BuildDialog = activityC3541.buildDialog();
        c8067BuildDialog.m21258(viewM30995);
        c8067BuildDialog.m21251(R.string.MT_Protector, null);
        c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c8067BuildDialog.m21271(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c8067BuildDialog.m21265(false);
        final DialogInterfaceC19356 dialogInterfaceC19356M21269 = c8067BuildDialog.m21269();
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.ܰ᩺ۜ
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                dialogInterfaceC19356M21269.m44373().setEnabled(checkBox.isChecked() || checkBox4.isChecked());
            }
        });
        checkBox4.setOnCheckedChangeListener(new C12010());
        C8875.m23019(dialogInterfaceC19356M21269);
        Button buttonM44373 = dialogInterfaceC19356M21269.m44373();
        final String str2 = this.f44415;
        buttonM44373.setOnClickListener(new View.OnClickListener() { // from class: l.ۖ᩺ۜ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                boolean z;
                final C13421 c13421 = this.f10738;
                C13897 c13897 = c13421.f44410.f39573;
                C10948 c109410 = c10948;
                c13897.f45781 = c109410.m17000().toString();
                c13421.f44410.f39573.f45784 = checkBox.isChecked();
                c13421.f44410.f39573.f45782 = checkBox2.isChecked();
                c13421.f44410.f39573.f45786 = checkBox3.isChecked();
                c13421.f44410.f39573.f45783 = checkBox4.isChecked();
                c13421.f44410.f39573.f45785 = c10949.m17000().toString().trim();
                c13421.f44410.f39574 = System.currentTimeMillis();
                ActivityC3541 activityC3542 = c13421.f44411;
                String str3 = c13421.f44410.f39573.f45785;
                Collection<C21887> collectionValues = c13421.f44414.values();
                C11780 c11780 = c13421.f44410;
                int i = ActivityC3541.f13037;
                boolean z2 = false;
                try {
                    C19999 c19999M45285 = C19999.m45285(str3);
                    ArrayList arrayList = new ArrayList();
                    for (String str4 : c11780.f39573.f45781.split("\n")) {
                        if (!str4.isEmpty()) {
                            arrayList.add(new C12238(str4, true));
                        }
                    }
                    Collections.sort(arrayList);
                    int i2 = 0;
                    int i3 = 0;
                    for (C21887 c21887 : collectionValues) {
                        String strM45286 = c19999M45285.m45286(c21887.f71006);
                        if (!c21887.f71004) {
                            Iterator it = arrayList.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z = false;
                                    break;
                                }
                                C12238 c12238 = (C12238) it.next();
                                if (c12238.m30440(strM45286)) {
                                    z = !c12238.f40967;
                                    break;
                                }
                            }
                        } else {
                            z = true;
                        }
                        if (z) {
                            i2++;
                            i3 += c21887.f71005;
                        }
                    }
                    if (i2 == 0) {
                        C15829.m37611(R.string.MT_Protector);
                        int iM33769 = C13932.m33769(6.0f);
                        int iM337610 = C13932.m33769(3.0f);
                        float f = -iM33769;
                        float f2 = iM33769;
                        float f3 = -iM337610;
                        ObjectAnimator duration = ObjectAnimator.ofFloat(c109410, "translationX", 0.0f, f, 0.0f, f2, 0.0f, f, 0.0f, f2, 0.0f, f3, 0.0f, iM337610, 0.0f, f3, 0.0f).setDuration(1000L);
                        duration.setInterpolator(new DecelerateInterpolator());
                        duration.start();
                    } else if (i2 > C15157.m36335() || i3 > C15157.m36346()) {
                        C8067 c8067BuildDialog2 = activityC3542.buildDialog();
                        c8067BuildDialog2.m21274(R.string.MT_Protector);
                        c8067BuildDialog2.m21261(activityC3542.getString(R.string.MT_Protector, Integer.valueOf(i2), Integer.valueOf(i3)));
                        c8067BuildDialog2.m21251(R.string.MT_Protector, null);
                        c8067BuildDialog2.m21269();
                    } else {
                        z2 = true;
                    }
                } catch (Exception e) {
                    activityC3542.m31002(new Exception(activityC3542.getString(R.string.MT_Protector), e), (DialogInterface.OnDismissListener) null);
                }
                if (z2) {
                    C8067 c8067BuildDialog3 = activityC3542.buildDialog();
                    c8067BuildDialog3.m21274(R.string.MT_Protector);
                    c8067BuildDialog3.m21253(R.string.MT_Protector);
                    final String str5 = str2;
                    final DialogInterfaceC19356 dialogInterfaceC19356 = dialogInterfaceC19356M21269;
                    c8067BuildDialog3.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩹᩺ۜ
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i4) {
                            C13421 c13422 = c13421;
                            C11780 c11781 = c13422.f44410;
                            String str6 = c11781.f39572;
                            C13897 c13898 = c11781.f39573;
                            AbstractC20745 abstractC20745M46690 = C11904.m29695().m46690("protector/config/" + str6 + ".json");
                            if (abstractC20745M46690.mo33975()) {
                                abstractC20745M46690.mo24647();
                            }
                            try {
                                abstractC20745M46690.mo46720();
                                abstractC20745M46690.m46735(c13898.m33733());
                            } catch (IOException unused) {
                            }
                            ActivityC3541 activityC3543 = c13422.f44411;
                            C11780 c11782 = c13422.f44410;
                            int i5 = ActivityC3541.f13037;
                            new C23299(activityC3543, c11782, str5).m10243();
                            dialogInterfaceC19356.dismiss();
                        }
                    });
                    c8067BuildDialog3.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                    c8067BuildDialog3.m21271(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.֨᩺ۜ
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i4) {
                            C13421 c13422 = c13421;
                            ActivityC3541 activityC3543 = c13422.f44411;
                            C13897 c13898 = c13422.f44410.f39573;
                            String str6 = c13898.f45781;
                            String str7 = c13898.f45785;
                            Collection collectionValues2 = c13422.f44414.values();
                            int i5 = ActivityC3541.f13037;
                            new C7070(activityC3543, str6, str7, collectionValues2).m10243();
                        }
                    });
                    c8067BuildDialog3.m21269();
                }
            }
        });
        dialogInterfaceC19356M21269.m44361().setOnClickListener(new View.OnClickListener() { // from class: l.ۚ᩺ۜ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ActivityC3541 activityC3542 = this.f19338.f44411;
                int i = ActivityC3541.f13037;
                String[] strArr = {activityC3542.getString(R.string.MT_Protector), activityC3542.getString(R.string.MT_Protector), activityC3542.getString(R.string.MT_Protector), activityC3542.getString(R.string.MT_Protector)};
                SpannableString spannableString = new SpannableString(C6851.m18460(strArr));
                int i2 = 0;
                for (int i3 = 0; i3 < 4; i3++) {
                    String str3 = strArr[i3];
                    int iIndexOf = str3.indexOf(10) + 1;
                    if (iIndexOf != 0) {
                        int i4 = iIndexOf + i2;
                        spannableString.setSpan(new ForegroundColorSpan(C20368.f65988), i4, str3.length() + i2, 17);
                        spannableString.setSpan(new RelativeSizeSpan(0.85f), i4, str3.length() + i2, 17);
                        int length = str3.length() + 3 + i2;
                        if (length < spannableString.length()) {
                            spannableString.setSpan(new AbsoluteSizeSpan(C13932.m33770(6.0f)), length - 3, length, 17);
                        }
                        i2 = length;
                    }
                }
                C8067 c8067BuildDialog2 = activityC3542.buildDialog();
                c8067BuildDialog2.m21274(R.string.MT_Protector);
                c8067BuildDialog2.m21261(spannableString);
                c8067BuildDialog2.m21251(R.string.MT_Protector, null);
                c8067BuildDialog2.m21271(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                DialogInterfaceC19356 dialogInterfaceC19356M212610 = c8067BuildDialog2.m21269();
                C23250.m51307(dialogInterfaceC19356M212610);
                dialogInterfaceC19356M212610.m44361().setOnClickListener(new ViewOnClickListenerC20689(1, activityC3542));
            }
        });
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        C15829.m37611(R.string.MT_Protector);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        m10251();
    }
}
