package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: l.۟ۢ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: Z26I */
/* JADX INFO: loaded from: classes3.dex */
public final class DialogInterfaceOnDismissListenerC7394 extends AbstractC4674 implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f24575;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f24576;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f24577;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C4677 f24578;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public long f24579;

    public DialogInterfaceOnDismissListenerC7394() {
        super(R.string.MT_Protector, R.drawable.MT_Protector);
        this.f24579 = 0L;
        this.f24575 = 0;
        this.f24576 = 0;
        this.f24577 = false;
    }

    @Override // l.AbstractC4674
    /* JADX INFO: renamed from: ۨ */
    public final void mo1962(C21422 c21422) {
        c21422.m47963("local");
        final List listM47979 = c21422.m47979();
        this.f24578 = new C4677(c21422.m47965(), listM47979);
        if (listM47979.size() == 1) {
            InterfaceC2557 interfaceC2557 = (InterfaceC2557) listM47979.get(0);
            if (interfaceC2557.isDirectory()) {
                this.f24578.m12964(this);
                this.f24578.m12967(interfaceC2557);
                C4716.f16636.execute(new RunnableC17977(0, this, interfaceC2557));
                return;
            }
            this.f24578.m12966(interfaceC2557);
            return;
        }
        this.f24578.m12964(this);
        this.f24578.m12965(c21422.m47961());
        C4716.f16636.execute(new Runnable() { // from class: l.ᩴۢ᩹
            @Override // java.lang.Runnable
            public final void run() {
                DialogInterfaceOnDismissListenerC7394.m19726(this.f60636, listM47979);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m19727(final DialogInterfaceOnDismissListenerC7394 dialogInterfaceOnDismissListenerC7394, InterfaceC2557 interfaceC2557) {
        dialogInterfaceOnDismissListenerC7394.m19724(Collections.singleton(interfaceC2557.mo7989()));
        C16737.m39273(new Runnable() { // from class: l.ۡۢ᩹
            @Override // java.lang.Runnable
            public final void run() {
                DialogInterfaceOnDismissListenerC7394.m19728(this.f30281);
            }
        });
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m19728(DialogInterfaceOnDismissListenerC7394 dialogInterfaceOnDismissListenerC7394) {
        dialogInterfaceOnDismissListenerC7394.f24578.m12963(dialogInterfaceOnDismissListenerC7394.f24575, dialogInterfaceOnDismissListenerC7394.f24576, dialogInterfaceOnDismissListenerC7394.f24579);
        dialogInterfaceOnDismissListenerC7394.f24578.m12962();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m19726(final DialogInterfaceOnDismissListenerC7394 dialogInterfaceOnDismissListenerC7394, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC2557 interfaceC2557 = (InterfaceC2557) it.next();
            if (interfaceC2557.isDirectory()) {
                dialogInterfaceOnDismissListenerC7394.f24576++;
                if (!interfaceC2557.mo7986()) {
                    arrayList.add(interfaceC2557.mo7989());
                }
            } else {
                dialogInterfaceOnDismissListenerC7394.f24575++;
                if (!interfaceC2557.mo7986()) {
                    dialogInterfaceOnDismissListenerC7394.f24579 = interfaceC2557.getSize() + dialogInterfaceOnDismissListenerC7394.f24579;
                }
            }
        }
        C16737.m39273(new Runnable() { // from class: l.۠ۢ᩹
            @Override // java.lang.Runnable
            public final void run() {
                DialogInterfaceOnDismissListenerC7394 dialogInterfaceOnDismissListenerC7395 = this.f28365;
                dialogInterfaceOnDismissListenerC7395.f24578.m12963(dialogInterfaceOnDismissListenerC7395.f24575, dialogInterfaceOnDismissListenerC7395.f24576, dialogInterfaceOnDismissListenerC7395.f24579);
            }
        });
        dialogInterfaceOnDismissListenerC7394.m19724(arrayList);
        C16737.m39273(new Runnable() { // from class: l.᩵ۢ᩹
            @Override // java.lang.Runnable
            public final void run() {
                DialogInterfaceOnDismissListenerC7394.m19723(this.f62515);
            }
        });
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m19723(DialogInterfaceOnDismissListenerC7394 dialogInterfaceOnDismissListenerC7394) {
        dialogInterfaceOnDismissListenerC7394.f24578.m12963(dialogInterfaceOnDismissListenerC7394.f24575, dialogInterfaceOnDismissListenerC7394.f24576, dialogInterfaceOnDismissListenerC7394.f24579);
        dialogInterfaceOnDismissListenerC7394.f24578.m12962();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m19724(Collection collection) {
        LinkedList linkedList = new LinkedList(collection);
        while (!linkedList.isEmpty() && !this.f24577) {
            for (AbstractC20745 abstractC20745 : ((AbstractC20745) linkedList.removeFirst()).mo33983(true)) {
                if (abstractC20745.mo33974()) {
                    this.f24576++;
                    if (!abstractC20745.m46723()) {
                        linkedList.addLast(abstractC20745);
                    }
                } else {
                    this.f24575++;
                    if (!abstractC20745.m46723()) {
                        this.f24579 = abstractC20745.mo33964() + this.f24579;
                    }
                }
            }
            C16737.m39273(new Runnable() { // from class: l.ۤۢ᩹
                @Override // java.lang.Runnable
                public final void run() {
                    DialogInterfaceOnDismissListenerC7394 dialogInterfaceOnDismissListenerC7394 = this.f34875;
                    dialogInterfaceOnDismissListenerC7394.f24578.m12963(dialogInterfaceOnDismissListenerC7394.f24575, dialogInterfaceOnDismissListenerC7394.f24576, dialogInterfaceOnDismissListenerC7394.f24579);
                }
            });
        }
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f24577 = true;
    }
}
