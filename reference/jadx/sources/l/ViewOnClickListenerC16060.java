package l;

import android.content.DialogInterface;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import bin.mt.plus.R;
import java.io.IOException;

/* JADX INFO: renamed from: l.ܺܽۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28VT */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnClickListenerC16060 extends AbstractC12554 implements View.OnClickListener, View.OnLongClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public TextView f51953;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public ImageView f51954;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC20293 f51955;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC16060(ActivityC20293 activityC20293, View view) {
        super(view);
        this.f51955 = activityC20293;
        this.f51954 = (ImageView) view.findViewById(R.id.icon);
        this.f51953 = (TextView) view.findViewById(R.id.textView);
        C0674.m3031(view);
        int i = C2766.f10586;
        view.setOnTouchListener(new ViewOnTouchListenerC11940());
        view.setOnClickListener(this);
        view.setOnLongClickListener(this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private Object m38052() {
        int size;
        int bindingAdapterPosition = getBindingAdapterPosition();
        int i = bindingAdapterPosition - 1;
        ActivityC20293 activityC20293 = this.f51955;
        if (activityC20293.f65762.isEmpty()) {
            size = bindingAdapterPosition - 3;
        } else {
            if (i < activityC20293.f65762.size()) {
                return activityC20293.f65762.get(i);
            }
            size = i - (activityC20293.f65762.size() + 1);
        }
        if (size < activityC20293.f65760.size()) {
            return activityC20293.f65760.get(size);
        }
        throw new AssertionError();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [l.ۜܽۨ] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object objM38052 = m38052();
        boolean z = objM38052 instanceof AbstractC17131;
        ActivityC20293 activityC20293 = this.f51955;
        if (!z) {
            if (objM38052 instanceof AbstractC20745) {
                C12362 c12362 = new C12362(activityC20293, (AbstractC20745) objM38052);
                c12362.m30774((C6887) new InterfaceC17295() { // from class: l.ۜܽۨ
                    @Override // l.InterfaceC17295
                    public final void accept(Object obj) {
                        ActivityC20293 activityC20294 = this.f23195.f51955;
                        activityC20294.f65754 = ((AbstractC20745) obj).getName();
                        ActivityC20293.m45803(activityC20294);
                        C15829.m37611(R.string.MT_Protector);
                    }
                });
                c12362.m30773();
                return;
            }
            return;
        }
        AbstractC17131 abstractC17131 = (AbstractC17131) objM38052;
        RunnableC15343 runnableC15343 = new RunnableC15343(1, activityC20293, abstractC17131);
        if (abstractC17131.mo1457()) {
            C19954.f63907 = true;
            C23053.m50999(new C22410(runnableC15343), abstractC17131, activityC20293);
        } else {
            runnableC15343.run();
        }
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        Object objM38052 = m38052();
        if (objM38052 instanceof AbstractC17131) {
            final AbstractC17131 abstractC17131 = (AbstractC17131) objM38052;
            C16195 c16195 = new C16195(view.getContext(), view, 0);
            c16195.m38298().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
            c16195.m38298().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
            c16195.m38298().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
            c16195.m38298().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
            c16195.m38298().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
            c16195.m38292();
            c16195.m38296(new InterfaceC21133() { // from class: l.᩺ܽۨ
                @Override // l.InterfaceC21133
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    final ViewOnClickListenerC16060 viewOnClickListenerC16060 = this.f75082;
                    ActivityC20293 activityC20293 = viewOnClickListenerC16060.f51955;
                    int itemId = menuItem.getItemId();
                    final AbstractC17131 abstractC17132 = abstractC17131;
                    if (itemId == R.string.MT_Protector) {
                        C7593 c7593 = new C7593(viewOnClickListenerC16060, activityC20293, abstractC17132);
                        c7593.m40376(R.string.MT_Protector);
                        c7593.m40346((CharSequence) abstractC17132.mo1460());
                        c7593.m40340();
                        c7593.m40355();
                        c7593.m40368(true);
                        return true;
                    }
                    if (itemId == R.string.MT_Protector) {
                        C8067 c8067BuildDialog = activityC20293.buildDialog();
                        c8067BuildDialog.m21274(R.string.MT_Protector);
                        c8067BuildDialog.m21261(activityC20293.getString(R.string.MT_Protector, abstractC17132.mo1456()));
                        c8067BuildDialog.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ᩳܽۨ
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i) {
                                ViewOnClickListenerC16060 viewOnClickListenerC16061 = viewOnClickListenerC16060;
                                viewOnClickListenerC16061.getClass();
                                abstractC17132.mo1455();
                                ActivityC20293.m45803(viewOnClickListenerC16061.f51955);
                            }
                        });
                        c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                        c8067BuildDialog.m21269();
                        return true;
                    }
                    if (itemId == R.string.MT_Protector) {
                        if (!C1709.m5692()) {
                            C15829.m37611(R.string.MT_Protector);
                            new ViewOnClickListenerC19680(activityC20293);
                            return true;
                        }
                        if (!C1709.m5693()) {
                            C15829.m37611(R.string.MT_Protector);
                            return true;
                        }
                        ActivityC20293.m45793(activityC20293, abstractC17132, new Runnable() { // from class: l.ᩴܽۨ
                            @Override // java.lang.Runnable
                            public final void run() {
                                final int i;
                                ViewOnClickListenerC16060 viewOnClickListenerC16061 = viewOnClickListenerC16060;
                                final ActivityC20293 activityC20294 = viewOnClickListenerC16061.f51955;
                                final C10416 c10416 = new C10416(viewOnClickListenerC16061);
                                View viewM30995 = activityC20294.m30995(R.layout.MT_Protector);
                                ((TextView) viewM30995.findViewById(R.id.MT_Protector)).setText(R.string.MT_Protector);
                                final RadioButton[] radioButtonArr = {(RadioButton) viewM30995.findViewById(R.id.MT_Protector), (RadioButton) viewM30995.findViewById(R.id.MT_Protector), (RadioButton) viewM30995.findViewById(R.id.radioButton3)};
                                radioButtonArr[0].setTag(C16737.m39288(R.string.MT_Protector));
                                radioButtonArr[1].setTag(C16737.m39288(R.string.MT_Protector));
                                radioButtonArr[2].setTag(C16737.m39288(R.string.MT_Protector));
                                final EditText editText = (EditText) viewM30995.findViewById(R.id.MT_Protector);
                                final TextView textView = (TextView) viewM30995.findViewById(R.id.textView2);
                                View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.ۡۧۚ
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        RadioButton[] radioButtonArr2 = radioButtonArr;
                                        int length = radioButtonArr2.length;
                                        int i2 = 0;
                                        while (true) {
                                            boolean z = true;
                                            if (i2 >= length) {
                                                break;
                                            }
                                            RadioButton radioButton = radioButtonArr2[i2];
                                            if (view2 != radioButton) {
                                                z = false;
                                            }
                                            radioButton.setChecked(z);
                                            i2++;
                                        }
                                        editText.setVisibility(view2 != radioButtonArr2[1] ? 8 : 0);
                                        textView.setText((String) view2.getTag());
                                    }
                                };
                                for (int i2 = 0; i2 < 3; i2++) {
                                    radioButtonArr[i2].setOnClickListener(onClickListener);
                                }
                                C8067 c8067BuildDialog2 = activityC20294.buildDialog();
                                c8067BuildDialog2.m21258(viewM30995);
                                c8067BuildDialog2.m21251(R.string.MT_Protector, null);
                                c8067BuildDialog2.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                                final DialogInterfaceC19356 dialogInterfaceC19356M21269 = c8067BuildDialog2.m21269();
                                final AbstractC17131 abstractC17133 = abstractC17132;
                                if (abstractC17133 instanceof C19954) {
                                    i = 0;
                                } else if (abstractC17133 instanceof C0197) {
                                    editText.setHint(R.string.MT_Protector);
                                    i = 1;
                                } else {
                                    if (!(abstractC17133 instanceof C16426) && !(abstractC17133 instanceof C5842)) {
                                        throw new AssertionError();
                                    }
                                    i = 2;
                                }
                                onClickListener.onClick(radioButtonArr[i]);
                                dialogInterfaceC19356M21269.m44373().setOnClickListener(new View.OnClickListener() { // from class: l.ۤۧۚ
                                    /* JADX WARN: Code duplicated, block: B:47:0x0091 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) throws Throwable {
                                        byte[] bArrM46727;
                                        RadioButton[] radioButtonArr2 = radioButtonArr;
                                        boolean zIsChecked = radioButtonArr2[0].isChecked();
                                        int i3 = i;
                                        DialogInterfaceC19356 dialogInterfaceC19356 = dialogInterfaceC19356M21269;
                                        AbstractActivityC12483 abstractActivityC12483 = activityC20294;
                                        AbstractC17131 abstractC17134 = abstractC17133;
                                        C10416 c10417 = c10416;
                                        if (zIsChecked) {
                                            if (i3 == 0) {
                                                dialogInterfaceC19356.dismiss();
                                                return;
                                            } else {
                                                new C16595(abstractActivityC12483, abstractC17134, dialogInterfaceC19356, c10417).m10243();
                                                return;
                                            }
                                        }
                                        if (radioButtonArr2[1].isChecked()) {
                                            EditText editText2 = editText;
                                            if (editText2.length() == 0) {
                                                if (i3 == 1) {
                                                    dialogInterfaceC19356.dismiss();
                                                    return;
                                                } else {
                                                    C15829.m37611(R.string.MT_Protector);
                                                    editText2.requestFocus();
                                                    return;
                                                }
                                            }
                                            if (i3 == 1) {
                                                try {
                                                    bArrM46727 = C0197.m1444(abstractC17134).m46727();
                                                    try {
                                                        abstractC17134.mo1455();
                                                    } catch (Exception e) {
                                                        e = e;
                                                        if (bArrM46727 != null) {
                                                            try {
                                                                AbstractC20745 abstractC20745M1444 = C0197.m1444(abstractC17134);
                                                                abstractC20745M1444.getClass();
                                                                abstractC20745M1444.m46704(bArrM46727, 0, bArrM46727.length);
                                                            } catch (IOException unused) {
                                                            }
                                                        }
                                                        abstractActivityC12483.m31002(e, (DialogInterface.OnDismissListener) null);
                                                    }
                                                } catch (Exception e2) {
                                                    e = e2;
                                                    bArrM46727 = null;
                                                    if (bArrM46727 != null) {
                                                        AbstractC20745 abstractC20745M1445 = C0197.m1444(abstractC17134);
                                                        abstractC20745M1445.getClass();
                                                        abstractC20745M1445.m46704(bArrM46727, 0, bArrM46727.length);
                                                    }
                                                    abstractActivityC12483.m31002(e, (DialogInterface.OnDismissListener) null);
                                                }
                                            } else {
                                                bArrM46727 = null;
                                            }
                                            AbstractC20745 abstractC20745M1446 = C0197.m1445(C23053.m51001(), abstractC17134.mo1460(), abstractC17134.m40009().getEncoded(), abstractC17134.m40013().getEncoded(), editText2.getText().toString());
                                            abstractC17134.mo1458();
                                            if (i3 != 1) {
                                                abstractC17134.mo1455();
                                            }
                                            C21094.m47530();
                                            dialogInterfaceC19356.dismiss();
                                            c10417.accept(abstractC20745M1446);
                                            return;
                                        }
                                        if (i3 == 2) {
                                            dialogInterfaceC19356.dismiss();
                                            return;
                                        }
                                        try {
                                            AbstractC20745 abstractC20745M38679 = C16426.m38679(C23053.m51001(), abstractC17134.mo1460(), abstractC17134.m40009().getEncoded(), abstractC17134.m40013().getEncoded());
                                            abstractC17134.mo1458();
                                            abstractC17134.mo1455();
                                            C21094.m47530();
                                            dialogInterfaceC19356.dismiss();
                                            c10417.accept(abstractC20745M38679);
                                            return;
                                        } catch (Exception e3) {
                                            e = e3;
                                        }
                                        abstractActivityC12483.m31002(e, (DialogInterface.OnDismissListener) null);
                                    }
                                });
                            }
                        });
                        return true;
                    }
                    if (itemId == R.string.MT_Protector) {
                        if (!C1709.m5692()) {
                            C15829.m37611(R.string.MT_Protector);
                            new ViewOnClickListenerC19680(activityC20293);
                            return true;
                        }
                        if (!C1709.m5693()) {
                            C15829.m37611(R.string.MT_Protector);
                            return true;
                        }
                        ActivityC20293.m45793(activityC20293, abstractC17132, new Runnable() { // from class: l.۠ܽۨ
                            @Override // java.lang.Runnable
                            public final void run() {
                                final ViewOnClickListenerC16060 viewOnClickListenerC16061 = viewOnClickListenerC16060;
                                C22618 c22618 = new C22618(viewOnClickListenerC16061.f51955, new InterfaceC17295() { // from class: l.ۡܽۨ
                                    @Override // l.InterfaceC17295
                                    public final void accept(Object obj) {
                                        ActivityC20293 activityC20294 = viewOnClickListenerC16061.f51955;
                                        activityC20294.f65759 = ((AbstractC20745) obj).getName();
                                        ActivityC20293.m45803(activityC20294);
                                    }
                                });
                                c22618.m50140(abstractC17132);
                                c22618.m50139();
                            }
                        });
                        return true;
                    }
                    if (itemId == R.string.MT_Protector) {
                        if (!C1709.m5692()) {
                            C15829.m37611(R.string.MT_Protector);
                            new ViewOnClickListenerC19680(activityC20293);
                            return true;
                        }
                        if (!C1709.m5693()) {
                            C15829.m37611(R.string.MT_Protector);
                            return true;
                        }
                        ActivityC20293.m45793(activityC20293, abstractC17132, new Runnable() { // from class: l.᩵ܽۨ
                            @Override // java.lang.Runnable
                            public final void run() {
                                ActivityC20293 activityC20294 = viewOnClickListenerC16060.f51955;
                                AbstractC17131 abstractC17133 = abstractC17132;
                                activityC20294.f65758 = abstractC17133;
                                C23566 c23566 = activityC20294.f65763;
                                c23566.getClass();
                                C23566.m51965(c23566, R.string.MT_Protector, (String) null, abstractC17133.mo1460() + "_key.zip", new String[]{"zip"}, 16);
                            }
                        });
                    }
                    return true;
                }
            });
            C2766.m8440(view, c16195);
            return true;
        }
        if (!(objM38052 instanceof AbstractC20745)) {
            return false;
        }
        final AbstractC20745 abstractC20745 = (AbstractC20745) objM38052;
        C16195 c16196 = new C16195(view.getContext(), view, 0);
        c16196.m38298().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c16196.m38298().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c16196.m38292();
        c16196.m38296(new InterfaceC21133() { // from class: l.ܶܽۨ
            @Override // l.InterfaceC21133
            public final boolean onMenuItemClick(MenuItem menuItem) {
                final ViewOnClickListenerC16060 viewOnClickListenerC16060 = this.f50029;
                ActivityC20293 activityC20293 = viewOnClickListenerC16060.f51955;
                int itemId = menuItem.getItemId();
                final AbstractC20745 abstractC20746 = abstractC20745;
                if (itemId == R.string.MT_Protector) {
                    C20998 c20998 = new C20998(viewOnClickListenerC16060, activityC20293, abstractC20746);
                    c20998.m40376(R.string.MT_Protector);
                    c20998.m40346((CharSequence) abstractC20746.m46718());
                    c20998.m40340();
                    c20998.m40355();
                    c20998.m40368(true);
                    return true;
                }
                if (itemId == R.string.MT_Protector) {
                    C8067 c8067BuildDialog = activityC20293.buildDialog();
                    c8067BuildDialog.m21274(R.string.MT_Protector);
                    c8067BuildDialog.m21261(activityC20293.getString(R.string.MT_Protector, abstractC20746.getName()));
                    c8067BuildDialog.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩸ܽۨ
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            ViewOnClickListenerC16060 viewOnClickListenerC16061 = viewOnClickListenerC16060;
                            viewOnClickListenerC16061.getClass();
                            abstractC20746.mo24644();
                            ActivityC20293.m45803(viewOnClickListenerC16061.f51955);
                        }
                    });
                    c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                    c8067BuildDialog.m21269();
                }
                return true;
            }
        });
        C2766.m8440(view, c16196);
        return true;
    }
}
