package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: l.ۡۖ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: J97P */
/* JADX INFO: loaded from: classes4.dex */
public final class DialogInterfaceOnDismissListenerC9074 extends AbstractC9843 implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f29501;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f29502;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public long f29503;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f29504;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C2363 f29505;

    public DialogInterfaceOnDismissListenerC9074() {
        super(R.string.MT_Protector, R.drawable.MT_Protector);
        this.f29503 = 0L;
        this.f29504 = 0;
        this.f29501 = 0;
        this.f29502 = false;
    }

    @Override // l.AbstractC9843
    /* JADX INFO: renamed from: ۤ */
    public final void mo2016(C12915 c12915) {
        c12915.m31970("trash");
        final List listM31982 = c12915.m31982();
        this.f29505 = new C2363(c12915.m31983());
        if (listM31982.size() == 1) {
            final InterfaceC2386 interfaceC2386 = (InterfaceC2386) listM31982.get(0);
            if (interfaceC2386.isDirectory()) {
                this.f29505.m8030(this);
                this.f29505.m8033(interfaceC2386);
                C5261.f18540.execute(new Runnable() { // from class: l.ܿۖ۫
                    @Override // java.lang.Runnable
                    public final void run() {
                        DialogInterfaceOnDismissListenerC9074.m24212(this.f59022, interfaceC2386);
                    }
                });
                return;
            }
            this.f29505.m8032(interfaceC2386);
            return;
        }
        this.f29505.m8030(this);
        this.f29505.m8031(c12915.m31967(), listM31982);
        C5261.f18540.execute(new Runnable() { // from class: l.֡ۖ۫
            @Override // java.lang.Runnable
            public final void run() {
                DialogInterfaceOnDismissListenerC9074.m24211(this.f1079, listM31982);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m24212(final DialogInterfaceOnDismissListenerC9074 dialogInterfaceOnDismissListenerC9074, InterfaceC2386 interfaceC2386) {
        dialogInterfaceOnDismissListenerC9074.m24209(Collections.singleton(interfaceC2386.mo8093()));
        C21576.m49068(new Runnable() { // from class: l.۟ۖ۫
            @Override // java.lang.Runnable
            public final void run() {
                DialogInterfaceOnDismissListenerC9074.m24210(this.f25053);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m24210(DialogInterfaceOnDismissListenerC9074 dialogInterfaceOnDismissListenerC9074) {
        dialogInterfaceOnDismissListenerC9074.f29505.m8029(dialogInterfaceOnDismissListenerC9074.f29504, dialogInterfaceOnDismissListenerC9074.f29501, dialogInterfaceOnDismissListenerC9074.f29503);
        dialogInterfaceOnDismissListenerC9074.f29505.m8028();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m24211(final DialogInterfaceOnDismissListenerC9074 dialogInterfaceOnDismissListenerC9074, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC2386 interfaceC2386 = (InterfaceC2386) it.next();
            if (interfaceC2386.isDirectory()) {
                dialogInterfaceOnDismissListenerC9074.f29501++;
                if (!interfaceC2386.mo8107()) {
                    arrayList.add(interfaceC2386.mo8093());
                }
            } else {
                dialogInterfaceOnDismissListenerC9074.f29504++;
                if (!interfaceC2386.mo8107()) {
                    dialogInterfaceOnDismissListenerC9074.f29503 = interfaceC2386.getSize() + dialogInterfaceOnDismissListenerC9074.f29503;
                }
            }
        }
        C21576.m49068(new Runnable() { // from class: l.ᩳۖ۫
            @Override // java.lang.Runnable
            public final void run() {
                DialogInterfaceOnDismissListenerC9074 dialogInterfaceOnDismissListenerC9075 = this.f60971;
                dialogInterfaceOnDismissListenerC9075.f29505.m8029(dialogInterfaceOnDismissListenerC9075.f29504, dialogInterfaceOnDismissListenerC9075.f29501, dialogInterfaceOnDismissListenerC9075.f29503);
            }
        });
        dialogInterfaceOnDismissListenerC9074.m24209(arrayList);
        C21576.m49068(new Runnable() { // from class: l.ۢۖ۫
            @Override // java.lang.Runnable
            public final void run() {
                DialogInterfaceOnDismissListenerC9074.m24214(this.f31631);
            }
        });
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m24214(DialogInterfaceOnDismissListenerC9074 dialogInterfaceOnDismissListenerC9074) {
        dialogInterfaceOnDismissListenerC9074.f29505.m8029(dialogInterfaceOnDismissListenerC9074.f29504, dialogInterfaceOnDismissListenerC9074.f29501, dialogInterfaceOnDismissListenerC9074.f29503);
        dialogInterfaceOnDismissListenerC9074.f29505.m8028();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m24209(Collection collection) {
        LinkedList linkedList = new LinkedList(collection);
        while (!linkedList.isEmpty() && !this.f29502) {
            for (AbstractC22044 abstractC22044 : ((AbstractC22044) linkedList.removeFirst()).mo4299(true)) {
                if (abstractC22044.mo4281()) {
                    this.f29501++;
                    if (!abstractC22044.m49860()) {
                        linkedList.addLast(abstractC22044);
                    }
                } else {
                    this.f29504++;
                    if (!abstractC22044.m49860()) {
                        this.f29503 = abstractC22044.mo4285() + this.f29503;
                    }
                }
            }
            C21576.m49068(new Runnable() { // from class: l.֨ۖ۫
                @Override // java.lang.Runnable
                public final void run() {
                    DialogInterfaceOnDismissListenerC9074 dialogInterfaceOnDismissListenerC9074 = this.f3257;
                    dialogInterfaceOnDismissListenerC9074.f29505.m8029(dialogInterfaceOnDismissListenerC9074.f29504, dialogInterfaceOnDismissListenerC9074.f29501, dialogInterfaceOnDismissListenerC9074.f29503);
                }
            });
        }
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f29502 = true;
    }
}
