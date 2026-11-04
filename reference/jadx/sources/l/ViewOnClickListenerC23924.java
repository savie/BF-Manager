package l;

import android.content.DialogInterface;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import bin.mt.plus.R;
import java.io.IOException;

/* JADX INFO: renamed from: l.᩺֡ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28VT */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC23924 extends AbstractC11800 implements View.OnClickListener, View.OnLongClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public ImageView f77451;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public TextView f77452;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC3786 f77453;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC23924(ActivityC3786 activityC3786, View view) {
        super(view);
        this.f77453 = activityC3786;
        this.f77451 = (ImageView) view.findViewById(R.id.icon);
        this.f77452 = (TextView) view.findViewById(R.id.textView);
        C17423.m40915(view);
        int i = C22744.f73805;
        view.setOnTouchListener(new ViewOnTouchListenerC10809());
        view.setOnClickListener(this);
        view.setOnLongClickListener(this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private Object m53441() {
        int size;
        int bindingAdapterPosition = getBindingAdapterPosition();
        int i = bindingAdapterPosition - 1;
        ActivityC3786 activityC3786 = this.f77453;
        if (activityC3786.f12979.isEmpty()) {
            size = bindingAdapterPosition - 3;
        } else {
            if (i < activityC3786.f12979.size()) {
                return activityC3786.f12979.get(i);
            }
            size = i - (activityC3786.f12979.size() + 1);
        }
        if (size < activityC3786.f12975.size()) {
            return activityC3786.f12975.get(size);
        }
        throw new AssertionError();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [l.ۚ֡ۤ] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object objM53441 = m53441();
        boolean z = objM53441 instanceof AbstractC14806;
        ActivityC3786 activityC3786 = this.f77453;
        if (!z) {
            if (objM53441 instanceof AbstractC22044) {
                C2368 c2368 = new C2368(activityC3786, (AbstractC22044) objM53441);
                c2368.m8052((C5278) new InterfaceC0818() { // from class: l.ۚ֡ۤ
                    @Override // l.InterfaceC0818
                    public final void accept(Object obj) {
                        ActivityC3786 activityC3787 = this.f18588.f77453;
                        activityC3787.f12972 = ((AbstractC22044) obj).getName();
                        ActivityC3786.m12309(activityC3787);
                        C22673.m51152(R.string.MT_Protector);
                    }
                });
                c2368.m8051();
                return;
            }
            return;
        }
        AbstractC14806 abstractC14806 = (AbstractC14806) objM53441;
        RunnableC9530 runnableC9530 = new RunnableC9530(0, activityC3786, abstractC14806);
        if (abstractC14806.mo18538()) {
            C12569.f40362 = true;
            C16530.m39163(new C22432(runnableC9530), abstractC14806, activityC3786);
        } else {
            runnableC9530.run();
        }
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        Object objM53441 = m53441();
        if (objM53441 instanceof AbstractC14806) {
            final AbstractC14806 abstractC14806 = (AbstractC14806) objM53441;
            C18452 c18452 = new C18452(view.getContext(), view, 0);
            c18452.m42995().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
            c18452.m42995().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
            c18452.m42995().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
            c18452.m42995().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
            c18452.m42995().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
            c18452.m42997();
            c18452.m42994(new InterfaceC21436() { // from class: l.֫֡ۤ
                @Override // l.InterfaceC21436
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    final ViewOnClickListenerC23924 viewOnClickListenerC23924 = this.f5352;
                    ActivityC3786 activityC3786 = viewOnClickListenerC23924.f77453;
                    int itemId = menuItem.getItemId();
                    final AbstractC14806 abstractC14807 = abstractC14806;
                    if (itemId == R.string.MT_Protector) {
                        C11989 c11989 = new C11989(viewOnClickListenerC23924, activityC3786, abstractC14807);
                        c11989.m22945(R.string.MT_Protector);
                        c11989.m22924((CharSequence) abstractC14807.mo18532());
                        c11989.m22918();
                        c11989.m22959();
                        c11989.m22955(true);
                        return true;
                    }
                    if (itemId == R.string.MT_Protector) {
                        C2361 c2361BuildDialog = activityC3786.buildDialog();
                        c2361BuildDialog.m8021(R.string.MT_Protector);
                        c2361BuildDialog.m8008(activityC3786.getString(R.string.MT_Protector, abstractC14807.mo11753()));
                        c2361BuildDialog.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ܺ֡ۤ
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i) {
                                ViewOnClickListenerC23924 viewOnClickListenerC23925 = viewOnClickListenerC23924;
                                viewOnClickListenerC23925.getClass();
                                abstractC14807.mo18536();
                                ActivityC3786.m12309(viewOnClickListenerC23925.f77453);
                            }
                        });
                        c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                        c2361BuildDialog.m8016();
                        return true;
                    }
                    if (itemId == R.string.MT_Protector) {
                        if (!C18978.m44079()) {
                            C22673.m51152(R.string.MT_Protector);
                            new ViewOnClickListenerC16544(activityC3786);
                            return true;
                        }
                        if (!C18978.m44078()) {
                            C22673.m51152(R.string.MT_Protector);
                            return true;
                        }
                        ActivityC3786.m12301(activityC3786, abstractC14807, new Runnable() { // from class: l.ܽ֡ۤ
                            @Override // java.lang.Runnable
                            public final void run() {
                                final int i;
                                ViewOnClickListenerC23924 viewOnClickListenerC23925 = viewOnClickListenerC23924;
                                final ActivityC3786 activityC3787 = viewOnClickListenerC23925.f77453;
                                final C20194 c20194 = new C20194(viewOnClickListenerC23925);
                                View viewM40395 = activityC3787.m40395(R.layout.MT_Protector);
                                ((TextView) viewM40395.findViewById(R.id.title)).setText(R.string.MT_Protector);
                                final RadioButton[] radioButtonArr = {(RadioButton) viewM40395.findViewById(R.id.MT_Protector), (RadioButton) viewM40395.findViewById(R.id.MT_Protector), (RadioButton) viewM40395.findViewById(R.id.radioButton3)};
                                radioButtonArr[0].setTag(C21576.m49088(R.string.MT_Protector));
                                radioButtonArr[1].setTag(C21576.m49088(R.string.MT_Protector));
                                radioButtonArr[2].setTag(C21576.m49088(R.string.MT_Protector));
                                final C23255 c23255 = (C23255) viewM40395.findViewById(R.id.MT_Protector);
                                final TextView textView = (TextView) viewM40395.findViewById(R.id.textView2);
                                View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.ܿۖᩴ
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
                                        c23255.setVisibility(view2 != radioButtonArr2[1] ? 8 : 0);
                                        textView.setText((String) view2.getTag());
                                    }
                                };
                                for (int i2 = 0; i2 < 3; i2++) {
                                    radioButtonArr[i2].setOnClickListener(onClickListener);
                                }
                                C2361 c2361BuildDialog2 = activityC3787.buildDialog();
                                c2361BuildDialog2.m8005(viewM40395);
                                c2361BuildDialog2.m8026(R.string.MT_Protector, null);
                                c2361BuildDialog2.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                                final DialogInterfaceC8327 dialogInterfaceC8327M8016 = c2361BuildDialog2.m8016();
                                final AbstractC14806 abstractC14808 = abstractC14807;
                                if (abstractC14808 instanceof C12569) {
                                    i = 0;
                                } else if (!(abstractC14808 instanceof C6604)) {
                                    if (!(abstractC14808 instanceof C24504) && !(abstractC14808 instanceof C21520)) {
                                        throw new AssertionError();
                                    }
                                    i = 2;
                                } else {
                                    c23255.m52337(c23255.getContext().getString(R.string.MT_Protector));
                                    i = 1;
                                }
                                onClickListener.onClick(radioButtonArr[i]);
                                dialogInterfaceC8327M8016.m22436().setOnClickListener(new View.OnClickListener() { // from class: l.֡ۖᩴ
                                    /* JADX WARN: Code duplicated, block: B:47:0x0091 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) throws Throwable {
                                        byte[] bArrM49865;
                                        RadioButton[] radioButtonArr2 = radioButtonArr;
                                        boolean zIsChecked = radioButtonArr2[0].isChecked();
                                        int i3 = i;
                                        DialogInterfaceC8327 dialogInterfaceC8327 = dialogInterfaceC8327M8016;
                                        AbstractActivityC17204 abstractActivityC17204 = activityC3787;
                                        AbstractC14806 abstractC14809 = abstractC14808;
                                        C20194 c20195 = c20194;
                                        if (zIsChecked) {
                                            if (i3 == 0) {
                                                dialogInterfaceC8327.dismiss();
                                                return;
                                            } else {
                                                new C9079(abstractActivityC17204, abstractC14809, dialogInterfaceC8327, c20195).m8197();
                                                return;
                                            }
                                        }
                                        if (radioButtonArr2[1].isChecked()) {
                                            C23255 c23256 = c23255;
                                            if (c23256.m54099() == 0) {
                                                if (i3 == 1) {
                                                    dialogInterfaceC8327.dismiss();
                                                    return;
                                                } else {
                                                    C22673.m51152(R.string.MT_Protector);
                                                    c23256.requestFocus();
                                                    return;
                                                }
                                            }
                                            if (i3 == 1) {
                                                try {
                                                    bArrM49865 = C6604.m18525(abstractC14809).m49865();
                                                    try {
                                                        abstractC14809.mo18536();
                                                    } catch (Exception e) {
                                                        e = e;
                                                        if (bArrM49865 != null) {
                                                            try {
                                                                AbstractC22044 abstractC22044M18525 = C6604.m18525(abstractC14809);
                                                                abstractC22044M18525.getClass();
                                                                abstractC22044M18525.m49850(bArrM49865, 0, bArrM49865.length);
                                                            } catch (IOException unused) {
                                                            }
                                                        }
                                                        abstractActivityC17204.m40401(e, (DialogInterface.OnDismissListener) null);
                                                    }
                                                } catch (Exception e2) {
                                                    e = e2;
                                                    bArrM49865 = null;
                                                    if (bArrM49865 != null) {
                                                        AbstractC22044 abstractC22044M18526 = C6604.m18525(abstractC14809);
                                                        abstractC22044M18526.getClass();
                                                        abstractC22044M18526.m49850(bArrM49865, 0, bArrM49865.length);
                                                    }
                                                    abstractActivityC17204.m40401(e, (DialogInterface.OnDismissListener) null);
                                                }
                                            } else {
                                                bArrM49865 = null;
                                            }
                                            AbstractC22044 abstractC22044M18527 = C6604.m18526(C16530.m39164(), abstractC14809.mo18532(), abstractC14809.m35652().getEncoded(), abstractC14809.m35653().getEncoded(), c23256.m54021().toString());
                                            abstractC14809.mo18535();
                                            if (i3 != 1) {
                                                abstractC14809.mo18536();
                                            }
                                            C6331.m18055();
                                            dialogInterfaceC8327.dismiss();
                                            c20195.accept(abstractC22044M18527);
                                            return;
                                        }
                                        if (i3 == 2) {
                                            dialogInterfaceC8327.dismiss();
                                            return;
                                        }
                                        try {
                                            AbstractC22044 abstractC22044M54766 = C24504.m54766(C16530.m39164(), abstractC14809.mo18532(), abstractC14809.m35652().getEncoded(), abstractC14809.m35653().getEncoded());
                                            abstractC14809.mo18535();
                                            abstractC14809.mo18536();
                                            C6331.m18055();
                                            dialogInterfaceC8327.dismiss();
                                            c20195.accept(abstractC22044M54766);
                                            return;
                                        } catch (Exception e3) {
                                            e = e3;
                                        }
                                        abstractActivityC17204.m40401(e, (DialogInterface.OnDismissListener) null);
                                    }
                                });
                            }
                        });
                        return true;
                    }
                    if (itemId == R.string.MT_Protector) {
                        if (!C18978.m44079()) {
                            C22673.m51152(R.string.MT_Protector);
                            new ViewOnClickListenerC16544(activityC3786);
                            return true;
                        }
                        if (!C18978.m44078()) {
                            C22673.m51152(R.string.MT_Protector);
                            return true;
                        }
                        ActivityC3786.m12301(activityC3786, abstractC14807, new Runnable() { // from class: l.ܶ֡ۤ
                            @Override // java.lang.Runnable
                            public final void run() {
                                final ViewOnClickListenerC23924 viewOnClickListenerC23925 = viewOnClickListenerC23924;
                                C10759 c10759 = new C10759(viewOnClickListenerC23925.f77453, new InterfaceC0818() { // from class: l.ۗ֡ۤ
                                    @Override // l.InterfaceC0818
                                    public final void accept(Object obj) {
                                        ActivityC3786 activityC3787 = viewOnClickListenerC23925.f77453;
                                        activityC3787.f12970 = ((AbstractC22044) obj).getName();
                                        ActivityC3786.m12309(activityC3787);
                                    }
                                });
                                c10759.m27421(abstractC14807);
                                c10759.m27420();
                            }
                        });
                        return true;
                    }
                    if (itemId == R.string.MT_Protector) {
                        if (!C18978.m44079()) {
                            C22673.m51152(R.string.MT_Protector);
                            new ViewOnClickListenerC16544(activityC3786);
                            return true;
                        }
                        if (!C18978.m44078()) {
                            C22673.m51152(R.string.MT_Protector);
                            return true;
                        }
                        ActivityC3786.m12301(activityC3786, abstractC14807, new Runnable() { // from class: l.᩹֡ۤ
                            @Override // java.lang.Runnable
                            public final void run() {
                                ActivityC3786 activityC3787 = viewOnClickListenerC23924.f77453;
                                AbstractC14806 abstractC14808 = abstractC14807;
                                activityC3787.f12971 = abstractC14808;
                                C20956 c20956 = activityC3787.f12976;
                                c20956.getClass();
                                C20956.m47908(c20956, R.string.MT_Protector, (String) null, abstractC14808.mo18532() + "_key.zip", new String[]{"zip"}, 16);
                            }
                        });
                    }
                    return true;
                }
            });
            C22744.m51282(view, c18452);
            return true;
        }
        if (!(objM53441 instanceof AbstractC22044)) {
            return false;
        }
        final AbstractC22044 abstractC22044 = (AbstractC22044) objM53441;
        C18452 c18453 = new C18452(view.getContext(), view, 0);
        c18453.m42995().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c18453.m42995().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c18453.m42997();
        c18453.m42994(new InterfaceC21436() { // from class: l.ۧ֡ۤ
            @Override // l.InterfaceC21436
            public final boolean onMenuItemClick(MenuItem menuItem) {
                final ViewOnClickListenerC23924 viewOnClickListenerC23924 = this.f35505;
                ActivityC3786 activityC3786 = viewOnClickListenerC23924.f77453;
                int itemId = menuItem.getItemId();
                final AbstractC22044 abstractC22045 = abstractC22044;
                if (itemId == R.string.MT_Protector) {
                    C6024 c6024 = new C6024(viewOnClickListenerC23924, activityC3786, abstractC22045);
                    c6024.m22945(R.string.MT_Protector);
                    c6024.m22924((CharSequence) abstractC22045.m49874());
                    c6024.m22918();
                    c6024.m22959();
                    c6024.m22955(true);
                    return true;
                }
                if (itemId == R.string.MT_Protector) {
                    C2361 c2361BuildDialog = activityC3786.buildDialog();
                    c2361BuildDialog.m8021(R.string.MT_Protector);
                    c2361BuildDialog.m8008(activityC3786.getString(R.string.MT_Protector, abstractC22045.getName()));
                    c2361BuildDialog.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩻֡ۤ
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            ViewOnClickListenerC23924 viewOnClickListenerC23925 = viewOnClickListenerC23924;
                            viewOnClickListenerC23925.getClass();
                            abstractC22045.mo4287();
                            ActivityC3786.m12309(viewOnClickListenerC23925.f77453);
                        }
                    });
                    c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                    c2361BuildDialog.m8016();
                }
                return true;
            }
        });
        C22744.m51282(view, c18453);
        return true;
    }
}
