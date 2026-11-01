package l;

import android.content.DialogInterface;
import java.util.List;

/* JADX INFO: renamed from: l.ۛ۫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: V6YU */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC6050 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f20546;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f20547;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f20548;

    public /* synthetic */ DialogInterfaceOnClickListenerC6050(int i, Object obj, Object obj2) {
        this.f20547 = i;
        this.f20548 = obj;
        this.f20546 = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f20547) {
            case 0:
                C10990.m27743((C10990) this.f20548, (boolean[]) this.f20546);
                break;
            default:
                C16611.m39059((C16611) this.f20548, (List) this.f20546);
                break;
        }
    }
}
