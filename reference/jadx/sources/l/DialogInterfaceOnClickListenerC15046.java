package l;

import android.content.DialogInterface;
import android.content.Intent;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܳۖᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 964K */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC15046 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f49106;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f49107;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f49108;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f49109;

    public /* synthetic */ DialogInterfaceOnClickListenerC15046(Object obj, Object obj2, Object obj3, int i) {
        this.f49107 = i;
        this.f49109 = obj;
        this.f49108 = obj2;
        this.f49106 = obj3;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.f49107;
        Object obj = this.f49106;
        Object obj2 = this.f49108;
        Object obj3 = this.f49109;
        switch (i2) {
            case 0:
                DialogInterfaceOnClickListenerC14300.m34715((DialogInterfaceOnClickListenerC14300) obj3, (C8614) obj2, (String) obj, dialogInterface, i);
                break;
            case 1:
                C2361 c2361BuildDialog = ((AbstractActivityC17204) obj2).buildDialog();
                c2361BuildDialog.m8021(R.string.MT_Protector);
                c2361BuildDialog.m8000(R.string.MT_Protector);
                c2361BuildDialog.m8026(R.string.MT_Protector, new DialogInterfaceOnClickListenerC18867(1, (C2864) obj3, (int[]) obj));
                c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                c2361BuildDialog.m8016();
                break;
            default:
                AbstractActivityC17204 abstractActivityC17204 = (AbstractActivityC17204) obj3;
                int i3 = ActivityC11563.f36350;
                int i4 = C1663.f5756;
                Intent intent = new Intent(abstractActivityC17204, (Class<?>) ActivityC11563.class);
                intent.addFlags(268435456);
                intent.setAction("android.intent.action.VIEW");
                intent.setData(((AbstractC22044) obj2).m49836());
                abstractActivityC17204.startActivity(intent);
                C20065.m46116((InterfaceC2386) obj, 2000);
                break;
        }
    }
}
