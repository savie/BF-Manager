package l;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SubMenu;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۢ֫ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnClickListenerC9796 extends AbstractC11800 implements View.OnClickListener, View.OnLongClickListener, View.OnTouchListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public TextView f31572;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public TextView f31573;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC0848 f31574;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public View f31575;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public ImageView f31576;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public View f31577;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public ImageView f31578;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC9796(ActivityC0848 activityC0848, View view) {
        super(view);
        this.f31574 = activityC0848;
        view.setOnClickListener(this);
        view.setOnLongClickListener(this);
        this.f31575 = view.findViewById(R.id.MT_Protector);
        this.f31577 = view.findViewById(R.id.MT_Protector);
        this.f31576 = (ImageView) view.findViewById(R.id.icon);
        this.f31573 = (TextView) view.findViewById(R.id.MT_Protector);
        this.f31572 = (TextView) view.findViewById(R.id.MT_Protector);
        ImageView imageView = (ImageView) view.findViewById(R.id.drag);
        this.f31578 = imageView;
        imageView.setOnTouchListener(this);
        imageView.setFocusable(true);
        imageView.setClickable(true);
        Drawable drawableM20563 = C7508.m20563(activityC0848, R.drawable.MT_Protector);
        C17359.requireNonNull(drawableM20563);
        Drawable drawableMutate = drawableM20563.mutate();
        drawableMutate.setAlpha(119);
        imageView.setImageDrawable(drawableMutate);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int bindingAdapterPosition;
        ActivityC0848 activityC0848 = this.f31574;
        if (activityC0848.f3177.m23776() || (bindingAdapterPosition = getBindingAdapterPosition()) == -1) {
            return;
        }
        ActivityC0848.m3363(activityC0848, bindingAdapterPosition, true);
        activityC0848.m3457();
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        final int bindingAdapterPosition;
        ActivityC0848 activityC0848 = this.f31574;
        if (!activityC0848.f3177.m23776() && (bindingAdapterPosition = getBindingAdapterPosition()) != -1) {
            final AbstractC9051 abstractC9051 = (AbstractC9051) activityC0848.f3173.get(bindingAdapterPosition);
            C7560 c7560M3412 = ActivityC0848.m3412(activityC0848, bindingAdapterPosition);
            if (abstractC9051.mo9150() || C7560.m20643(c7560M3412)) {
                View view2 = this.f31577;
                C18452 c18452 = new C18452(activityC0848, view2, 8388611);
                C10378.m26694(view2);
                c18452.m42997();
                C9898 c9898M42995 = c18452.m42995();
                if (abstractC9051.mo9150()) {
                    c9898M42995.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
                }
                if (C7560.m20643(c7560M3412)) {
                    SubMenu subMenuAddSubMenu = c9898M42995.addSubMenu(0, R.id.MT_Protector, 0, activityC0848.getString(R.string.MT_Protector) + "…");
                    subMenuAddSubMenu.getItem().setIcon(R.drawable.MT_Protector);
                    subMenuAddSubMenu.setHeaderTitle(R.string.MT_Protector);
                    subMenuAddSubMenu.add(0, R.id.MT_Protector, 0, R.string.MT_Protector).setEnabled(c7560M3412.f24925 + c7560M3412.f24926 > 0);
                    subMenuAddSubMenu.add(0, R.id.MT_Protector, 0, R.string.MT_Protector).setEnabled(c7560M3412.f24927 > 0);
                    subMenuAddSubMenu.add(0, R.id.MT_Protector, 0, R.string.MT_Protector).setEnabled(c7560M3412.f24928 > 0);
                    subMenuAddSubMenu.add(0, R.id.MT_Protector, 0, R.string.MT_Protector).setEnabled(c7560M3412.f24925 > 0);
                    subMenuAddSubMenu.add(0, R.id.MT_Protector, 0, R.string.MT_Protector).setEnabled(c7560M3412.f24926 > 0);
                }
                if (abstractC9051.mo9150()) {
                    if (abstractC9051.m24169()) {
                        c9898M42995.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
                    } else {
                        c9898M42995.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
                    }
                    if (abstractC9051.mo1446()) {
                        c9898M42995.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
                    }
                    c9898M42995.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
                }
                c18452.m42994(new InterfaceC21436() { // from class: l.ᩳ֫ۧ
                    @Override // l.InterfaceC21436
                    public final boolean onMenuItemClick(MenuItem menuItem) {
                        final ActivityC0848 activityC0849 = this.f60903.f31574;
                        int itemId = menuItem.getItemId();
                        AbstractC9051 abstractC9052 = abstractC9051;
                        if (itemId == R.string.MT_Protector) {
                            abstractC9052.mo24175(activityC0849);
                            return true;
                        }
                        int i = bindingAdapterPosition;
                        if (itemId == R.id.MT_Protector) {
                            activityC0849.m3441(i);
                            return true;
                        }
                        if (itemId == R.id.MT_Protector) {
                            View viewM40395 = activityC0849.m40395(R.layout.MT_Protector);
                            ((TextView) viewM40395.findViewById(R.id.MT_Protector)).setText(R.string.MT_Protector);
                            final CheckBox checkBox = (CheckBox) viewM40395.findViewById(R.id.MT_Protector);
                            final int i2 = 1;
                            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: l.۟ۛܳ
                                {
                                    int i3 = -1760696251;
                                    int i4 = AbstractC0116.f1064;
                                    int i5 = C3033.f9831;
                                    int iM3169 = C0773.m3169("ۜܰ") ^ i5;
                                    int i6 = ((iM3169 ^ i4) * (-19241)) ^ (-646418192);
                                    int i7 = -1535035163;
                                    while (true) {
                                        i3 = (iM3169 ^ i7) ^ (i6 & (((i3 ^ i4) * (-239)) >> 31));
                                        switch (i3) {
                                            case -2126062769:
                                            case 558361176:
                                                AbstractC0641.m2813();
                                                throw new RuntimeException();
                                            case -2022136329:
                                            case -1553634470:
                                                return;
                                            case -992136292:
                                            case 105609452:
                                                if (C2288.f7433 > 0) {
                                                    iM3169 = (C0619.m2761("ۙܳ") ^ i5) * (-35);
                                                    i6 = ((iM3169 ^ i4) * (-16761)) ^ (-723593137);
                                                    i7 = -432392785;
                                                } else {
                                                    iM3169 = (i5 - C0619.m2761("ܳۚ")) * 11;
                                                    i6 = ((iM3169 ^ i4) * 17041) ^ 1635837421;
                                                    i7 = 208560186;
                                                }
                                                break;
                                            case -755773889:
                                            case 1474428740:
                                                if (C3998.f13671 != 0) {
                                                    iM3169 = (C0773.m3169("᩺ۘ") + i4) * 87;
                                                    i6 = ((iM3169 ^ i5) * 319) ^ 1331974461;
                                                    i7 = -317477216;
                                                } else {
                                                    iM3169 = C0773.m3169("ܽۜ") ^ i5;
                                                    i6 = ((iM3169 ^ i4) * 23667) ^ 348870780;
                                                    i7 = 1855594458;
                                                }
                                                break;
                                            case -199717499:
                                            case 1264435355:
                                                if (RunnableC1848.f6235) {
                                                    iM3169 = (i4 - C0773.m3169("۠ۗ")) * (-121);
                                                    i6 = ((iM3169 ^ i5) * (-3305)) ^ 168189183;
                                                    i7 = 193556751;
                                                } else {
                                                    iM3169 = C0773.m3169("۟ۢ") ^ i4;
                                                    i6 = ((iM3169 ^ i5) * (-17393)) ^ 1658096630;
                                                    i7 = -1485091579;
                                                }
                                                break;
                                            case 1107674683:
                                            case 1301976027:
                                                C20932.m47848();
                                                if (C3448.f11240 < 0) {
                                                    iM3169 = (C0619.m2761("ۙܳ") ^ i5) * (-35);
                                                    i6 = ((iM3169 ^ i4) * (-16761)) ^ (-723593137);
                                                    i7 = -432392785;
                                                } else {
                                                    iM3169 = (C0773.m3169("᩺ۘ") + i4) * 87;
                                                    i6 = ((iM3169 ^ i5) * 319) ^ 1331974461;
                                                    i7 = -317477216;
                                                }
                                                break;
                                            default:
                                                C1343.m4943();
                                                iM3169 = C0773.m3169("ܽۜ") ^ i5;
                                                i6 = ((iM3169 ^ i4) * 23667) ^ 348870780;
                                                i7 = 1855594458;
                                                break;
                                        }
                                    }
                                }

                                /* JADX WARN: Code duplicated, block: B:62:0x01d0  */
                                /* JADX WARN: Code duplicated, block: B:70:0x0217 A[PHI: r7 r14
                                  0x0217: PHI (r7v3 bin.mt.plus.Main) = (r7v2 bin.mt.plus.Main), (r7v2 bin.mt.plus.Main), (r7v4 bin.mt.plus.Main) binds: [B:69:0x0215, B:65:0x01fc, B:26:0x009e] A[DONT_GENERATE, DONT_INLINE]
                                  0x0217: PHI (r14v5 android.content.Intent) = (r14v4 android.content.Intent), (r14v4 android.content.Intent), (r14v6 android.content.Intent) binds: [B:69:0x0215, B:65:0x01fc, B:26:0x009e] A[DONT_GENERATE, DONT_INLINE]] */
                                /* JADX WARN: Code duplicated, block: B:74:0x0241 A[PHI: r5 r6
                                  0x0241: PHI (r5v5 l.֨֫ۧ) = (r5v2 l.֨֫ۧ), (r5v4 l.֨֫ۧ), (r5v2 l.֨֫ۧ), (r5v2 l.֨֫ۧ), (r5v2 l.֨֫ۧ) binds: [B:73:0x023f, B:44:0x012f, B:16:0x005f, B:13:0x0059, B:10:0x0050] A[DONT_GENERATE, DONT_INLINE]
                                  0x0241: PHI (r6v5 java.lang.Object) = 
                                  (r6v2 java.lang.Object)
                                  (r6v4 java.lang.Object)
                                  (r6v2 java.lang.Object)
                                  (r6v2 java.lang.Object)
                                  (r6v2 java.lang.Object)
                                 binds: [B:73:0x023f, B:44:0x012f, B:16:0x005f, B:13:0x0059, B:10:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
                                /* JADX WARN: Code duplicated, block: B:78:0x026d A[PHI: r2 r3
                                  0x026d: PHI (r2v5 l.۠ۨܳ) = (r2v2 l.۠ۨܳ), (r2v4 l.۠ۨܳ), (r2v2 l.۠ۨܳ) binds: [B:77:0x026b, B:52:0x0181, B:13:0x0059] A[DONT_GENERATE, DONT_INLINE]
                                  0x026d: PHI (r3v4 java.lang.Object) = (r3v2 java.lang.Object), (r3v3 java.lang.Object), (r3v2 java.lang.Object) binds: [B:77:0x026b, B:52:0x0181, B:13:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i3) {
                                    int iM3169;
                                    int i4;
                                    C8614 c8614 = null;
                                    Object obj = null;
                                    InterfaceC2386 interfaceC2386 = null;
                                    ActivityC0848 activityC08410 = null;
                                    Object obj2 = null;
                                    Main mainM9939 = null;
                                    int i5 = 564950166;
                                    int i6 = C2419.f7754;
                                    int i7 = AbstractC0641.f2496;
                                    int iM31610 = (C0773.m3169("۟ۧ") ^ i7) * (-75);
                                    int i8 = ((iM31610 ^ i6) * (-3329)) ^ (-254947103);
                                    int i9 = 1540850295;
                                    while (true) {
                                        int i10 = iM31610 ^ i9;
                                        Intent intent = null;
                                        while (true) {
                                            i5 = ((((i5 ^ i6) * (-28921)) >> 31) & i8) ^ i10;
                                            switch (i5) {
                                                case -2108498316:
                                                case -1795540205:
                                                    C2288.m7757(c8614, interfaceC2386, new C6443(c8614));
                                                    iM3169 = C0773.m3169("ۤ֨") ^ i7;
                                                    i8 = ((iM3169 ^ i6) * (-31901)) ^ (-1604128896);
                                                    i4 = -889304374;
                                                    i10 = iM3169 ^ i4;
                                                    break;
                                                case -2079158994:
                                                case -52070955:
                                                    mainM9939 = RunnableC3055.m9939(c8614);
                                                    if (C0773.f2792 > 0) {
                                                        intent = new Intent(mainM9939, (Class<?>) ActivityC9641.class);
                                                        if (C1321.f4751 >= 0) {
                                                            iM3169 = C0619.m2761("֡۟") ^ i7;
                                                            i8 = ((iM3169 ^ i6) * 29615) ^ (-105373457);
                                                            i4 = -197862756;
                                                        } else {
                                                            iM3169 = (i6 - C0619.m2761("ۜܰ")) * 81;
                                                            i8 = ((iM3169 ^ i7) * (-6475)) ^ 1306169289;
                                                            i4 = -1183561352;
                                                        }
                                                        i10 = iM3169 ^ i4;
                                                    }
                                                    break;
                                                case -2070855942:
                                                case -1322089536:
                                                    if (RunnableC0334.f1808 <= 0) {
                                                        iM3169 = C0619.m2761("᩺ۖ") ^ i6;
                                                        i8 = ((iM3169 ^ i7) * (-465)) ^ (-599529871);
                                                        i4 = -16561503;
                                                    } else {
                                                        iM3169 = C0773.m3169("ܽܳ") ^ i6;
                                                        i8 = ((iM3169 ^ i7) * 5143) ^ (-1953451867);
                                                        i4 = 1357345218;
                                                    }
                                                    i10 = iM3169 ^ i4;
                                                    break;
                                                case -1859081181:
                                                case -1123903724:
                                                    if (C13473.f42873 != 0) {
                                                        iM3169 = C0619.m2761("֡۟") ^ i7;
                                                        i8 = ((iM3169 ^ i6) * 29615) ^ (-105373457);
                                                        i4 = -197862756;
                                                    } else {
                                                        iM3169 = C0619.m2761("ۜ֡") ^ i6;
                                                        i8 = ((iM3169 ^ i7) * (-20767)) ^ (-492623140);
                                                        i4 = 1745968035;
                                                    }
                                                    i10 = iM3169 ^ i4;
                                                    break;
                                                case -1853080790:
                                                case 1520194900:
                                                    C1663.m5972(interfaceC2386, c8614, ActivityC18143.class);
                                                    iM3169 = C0773.m3169("ۤ֨") ^ i7;
                                                    i8 = ((iM3169 ^ i6) * (-31901)) ^ (-1604128896);
                                                    i4 = -889304374;
                                                    i10 = iM3169 ^ i4;
                                                    break;
                                                case -1812491238:
                                                case 2004332727:
                                                    C1321.m4852();
                                                    if (C1826.f6190 > 0) {
                                                        iM3169 = (C0773.m3169("֨֫") ^ i6) * (-95);
                                                        i8 = ((iM3169 ^ i7) * (-16625)) ^ (-2101687593);
                                                        i4 = 1555457198;
                                                    } else {
                                                        iM3169 = C0773.m3169("ۡ۫") ^ i7;
                                                        i8 = ((iM3169 ^ i6) * 9627) ^ 135518386;
                                                        i4 = -168759696;
                                                    }
                                                    i10 = iM3169 ^ i4;
                                                    break;
                                                case -1796544530:
                                                case 2098773395:
                                                    C3033.m9858(mainM9939, intent);
                                                    C20065.m46116(interfaceC2386, 2000);
                                                    iM3169 = C0773.m3169("ۤ֨") ^ i7;
                                                    i8 = ((iM3169 ^ i6) * (-31901)) ^ (-1604128896);
                                                    i4 = -889304374;
                                                    i10 = iM3169 ^ i4;
                                                    break;
                                                case -1582553831:
                                                case -661628962:
                                                    if (C2310.m7813() <= 0) {
                                                        iM3169 = C0619.m2761("᩺ۖ") ^ i6;
                                                        i8 = ((iM3169 ^ i7) * (-465)) ^ (-599529871);
                                                        i4 = -16561503;
                                                    } else {
                                                        iM3169 = (C0773.m3169("ܿ᩹") + i7) * (-63);
                                                        i8 = ((iM3169 ^ i6) * 16195) ^ 1547173142;
                                                        i4 = 1676274955;
                                                    }
                                                    i10 = iM3169 ^ i4;
                                                    break;
                                                case -1536053772:
                                                case -874648029:
                                                    ActivityC0848.m3364(activityC08410, (CheckBox) obj2);
                                                    break;
                                                case -1257503963:
                                                case 689418657:
                                                    c8614 = (C8614) activityC0849;
                                                    obj = checkBox;
                                                    if (C2834.f9334 <= 0) {
                                                        iM3169 = C0773.m3169("ۡ۫") ^ i7;
                                                        i8 = ((iM3169 ^ i6) * 9627) ^ 135518386;
                                                        i4 = -168759696;
                                                    } else {
                                                        iM3169 = (C0773.m3169("ܺۜ") + i7) * 123;
                                                        i8 = ((iM3169 ^ i6) * 22007) ^ 1727181900;
                                                        i4 = -1931090994;
                                                    }
                                                    i10 = iM3169 ^ i4;
                                                    break;
                                                case -1216597371:
                                                case 119383431:
                                                    C1826.m6301();
                                                    RunnableC3646.m11813();
                                                    break;
                                                case -1189045350:
                                                case -385546763:
                                                    if (C0269.f1558 <= 0) {
                                                        iM3169 = (C0773.m3169("֨֫") ^ i6) * (-95);
                                                        i8 = ((iM3169 ^ i7) * (-16625)) ^ (-2101687593);
                                                        i4 = 1555457198;
                                                    } else {
                                                        iM3169 = C0773.m3169("ۢۗ") ^ i7;
                                                        i8 = ((iM3169 ^ i6) * (-5881)) ^ 1409348652;
                                                        i4 = 936894163;
                                                    }
                                                    i10 = iM3169 ^ i4;
                                                    break;
                                                case -1162197340:
                                                case 971512338:
                                                    interfaceC2386 = (InterfaceC2386) obj;
                                                    dialogInterface.dismiss();
                                                    if (i3 != 0) {
                                                        iM3169 = (C0619.m2761("۬ᩳ") + i7) * 85;
                                                        i8 = ((iM3169 ^ i6) * 10701) ^ 631645599;
                                                        i4 = 1700534733;
                                                    } else {
                                                        iM3169 = C0773.m3169("۬ۤ") ^ i6;
                                                        i8 = ((iM3169 ^ i7) * 5369) ^ 1415816295;
                                                        i4 = 170246790;
                                                    }
                                                    i10 = iM3169 ^ i4;
                                                    break;
                                                case -1009727834:
                                                case -432224961:
                                                    if (i3 != 2) {
                                                        iM3169 = C0773.m3169("ۤ֨") ^ i7;
                                                        i8 = ((iM3169 ^ i6) * (-31901)) ^ (-1604128896);
                                                        i4 = -889304374;
                                                    } else {
                                                        iM3169 = C0773.m3169("ܿܿ") ^ i6;
                                                        i8 = ((iM3169 ^ i7) * (-12267)) ^ (-849624189);
                                                        i4 = 207989572;
                                                    }
                                                    i10 = iM3169 ^ i4;
                                                    break;
                                                case -801673211:
                                                case 1704098583:
                                                    activityC08410 = (ActivityC0848) activityC0849;
                                                    obj2 = checkBox;
                                                    if (C23916.f77426 <= 0) {
                                                        iM3169 = (C0773.m3169("֨֫") ^ i6) * (-95);
                                                        i8 = ((iM3169 ^ i7) * (-16625)) ^ (-2101687593);
                                                        i4 = 1555457198;
                                                    } else {
                                                        iM3169 = C0773.m3169("֡᩸") ^ i7;
                                                        i8 = ((iM3169 ^ i6) * (-26341)) ^ (-1249592894);
                                                        i4 = 782561521;
                                                    }
                                                    i10 = iM3169 ^ i4;
                                                    break;
                                                case -765708826:
                                                case -267327716:
                                                    C2834.m9344();
                                                    break;
                                                case -530169748:
                                                case 1032459053:
                                                    if (C1146.m4231()) {
                                                        iM3169 = C0619.m2761("᩵۟") ^ i7;
                                                        i8 = ((iM3169 ^ i6) * (-21517)) ^ (-795323892);
                                                        i4 = 1004809528;
                                                    } else {
                                                        iM3169 = C0619.m2761("֡۟") ^ i7;
                                                        i8 = ((iM3169 ^ i6) * 29615) ^ (-105373457);
                                                        i4 = -197862756;
                                                    }
                                                    i10 = iM3169 ^ i4;
                                                    break;
                                                case -340453436:
                                                case 2087111008:
                                                    if (i3 != 1) {
                                                        iM3169 = C0773.m3169("ۚ۫") ^ i7;
                                                        i8 = ((iM3169 ^ i6) * (-29971)) ^ (-1485987476);
                                                        i4 = 1225099269;
                                                    } else {
                                                        iM3169 = (C0619.m2761("֨ۧ") + i6) * (-113);
                                                        i8 = ((iM3169 ^ i7) * 12059) ^ 520162153;
                                                        i4 = 1398741869;
                                                    }
                                                    i10 = iM3169 ^ i4;
                                                    break;
                                                case 139828245:
                                                case 1597183212:
                                                    if (C3099.f10023 <= 0) {
                                                        iM3169 = C0773.m3169("ۡ۫") ^ i7;
                                                        i8 = ((iM3169 ^ i6) * 9627) ^ 135518386;
                                                        i4 = -168759696;
                                                    } else {
                                                        iM3169 = (C0773.m3169("ᩳ᩺") ^ i6) * (-37);
                                                        i8 = ((iM3169 ^ i7) * 19497) ^ 1436694842;
                                                        i4 = -1373489334;
                                                    }
                                                    i10 = iM3169 ^ i4;
                                                    break;
                                                case 1076561020:
                                                case 1151661000:
                                                    break;
                                                case 1630149820:
                                                case 2133174184:
                                                    if (C1343.f4799 != 0) {
                                                    }
                                                    iM3169 = (C0773.m3169("֨֫") ^ i6) * (-95);
                                                    i8 = ((iM3169 ^ i7) * (-16625)) ^ (-2101687593);
                                                    i4 = 1555457198;
                                                    i10 = iM3169 ^ i4;
                                                    break;
                                                case 2128738864:
                                                case 2132942885:
                                                    C17202.m40372();
                                                    if (C3734.f12817 >= 0) {
                                                        iM3169 = (C0773.m3169("֨֫") ^ i6) * (-95);
                                                        i8 = ((iM3169 ^ i7) * (-16625)) ^ (-2101687593);
                                                        i4 = 1555457198;
                                                    } else {
                                                        iM3169 = C0619.m2761("᩺ۖ") ^ i6;
                                                        i8 = ((iM3169 ^ i7) * (-465)) ^ (-599529871);
                                                        i4 = -16561503;
                                                    }
                                                    i10 = iM3169 ^ i4;
                                                    break;
                                                default:
                                                    switch (i2) {
                                                        case 0:
                                                            iM3169 = C0619.m2761("᩹ۗ") ^ i6;
                                                            i8 = ((iM3169 ^ i7) * (-10469)) ^ (-266007258);
                                                            i4 = 1031338449;
                                                            break;
                                                        default:
                                                            iM3169 = C0773.m3169("ܶۤ") ^ i6;
                                                            i8 = ((iM3169 ^ i7) * (-22953)) ^ 118211176;
                                                            i4 = -303735565;
                                                            break;
                                                    }
                                                    i10 = iM3169 ^ i4;
                                                    break;
                                            }
                                            return;
                                        }
                                        iM31610 = (i7 - C0773.m3169("۫ۡ")) * (-123);
                                        i8 = ((iM31610 ^ i6) * 12415) ^ 1454244992;
                                        i9 = -1143231984;
                                    }
                                }
                            };
                            C2361 c2361BuildDialog = activityC0849.buildDialog();
                            c2361BuildDialog.m8005(viewM40395);
                            c2361BuildDialog.m8026(R.string.MT_Protector, onClickListener);
                            c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                            c2361BuildDialog.m8016();
                            return true;
                        }
                        if (itemId == R.id.MT_Protector) {
                            C2361 c2361BuildDialog2 = activityC0849.buildDialog();
                            c2361BuildDialog2.m8021(R.string.MT_Protector);
                            c2361BuildDialog2.m8000(R.string.MT_Protector);
                            c2361BuildDialog2.m8026(R.string.MT_Protector, new DialogInterfaceOnClickListenerC20097(2, activityC0849));
                            c2361BuildDialog2.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                            c2361BuildDialog2.m8016();
                            return true;
                        }
                        if (itemId == R.id.MT_Protector) {
                            activityC0849.m3448(i);
                            return true;
                        }
                        if (itemId == R.id.MT_Protector) {
                            activityC0849.m3443(i);
                            return true;
                        }
                        if (itemId == R.string.MT_Protector) {
                            ActivityC0848.m3389(activityC0849, i);
                            return true;
                        }
                        if (itemId == R.string.MT_Protector) {
                            abstractC9052.mo1436(activityC0849.f3171);
                            activityC0849.m3457();
                            return true;
                        }
                        if (itemId != R.string.MT_Protector) {
                            return true;
                        }
                        activityC0849.f3177.m23769();
                        return true;
                    }
                });
                c18452.mo21878();
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ImageView imageView = this.f31578;
        if (view != imageView || motionEvent.getActionMasked() != 0 || imageView.getVisibility() != 0) {
            return false;
        }
        this.f31574.f3177.m23771(this);
        return true;
    }
}
