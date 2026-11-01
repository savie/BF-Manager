package l;

import android.content.DialogInterface;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩶᩷ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: MB7O */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC20418 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f66186;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f66187;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f66188;

    public /* synthetic */ DialogInterfaceOnClickListenerC20418(int i, Object obj, Object obj2) {
        this.f66187 = i;
        this.f66188 = obj;
        this.f66186 = obj2;
    }

    public /* synthetic */ DialogInterfaceOnClickListenerC20418(C11545 c11545, InterfaceC2557 interfaceC2557) {
        this.f66187 = 2;
        this.f66186 = c11545;
        this.f66188 = interfaceC2557;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.f66187;
        Object obj = this.f66186;
        Object obj2 = this.f66188;
        switch (i2) {
            case 0:
                C3246 c3246 = (C3246) obj2;
                c3246.m9717();
                AbstractC20745 abstractC20745 = c3246.f12071;
                AbstractC20745 abstractC20746 = c3246.f12074;
                AbstractC20745 abstractC20745M4734 = C1333.m4734((C11545) obj, R.string.MT_Protector, "mtcr");
                int i3 = C20725.f67443;
                C10142 c10142 = new C10142(C17595.class);
                c10142.m25768("saveAsPath", abstractC20745M4734.mo33986());
                c10142.m25768("inputPath1", abstractC20745.mo33986());
                c10142.m25768("inputPath2", abstractC20746.mo33986());
                c10142.m25763();
                break;
            case 1:
                ActivityC0061.m971((ActivityC0061) obj2, (C0176) obj);
                break;
            case 2:
                C11545 c11545 = (C11545) obj;
                C8265.m21677(c11545, (InterfaceC2557) obj2, new C20206(2, c11545));
                break;
            default:
                C16753.m39306((C16753) obj2, (C0524) obj);
                break;
        }
    }
}
