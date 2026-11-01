package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: l.ܽܺ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: J97P */
/* JADX INFO: loaded from: classes4.dex */
public final class DialogInterfaceOnDismissListenerC16735 extends AbstractC4674 implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f53597;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f53598;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f53599;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C12502 f53600;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public long f53601;

    public DialogInterfaceOnDismissListenerC16735() {
        super(R.string.MT_Protector, R.drawable.MT_Protector);
        this.f53601 = 0L;
        this.f53597 = 0;
        this.f53598 = 0;
        this.f53599 = false;
    }

    @Override // l.AbstractC4674
    /* JADX INFO: renamed from: ۨ */
    public final void mo1962(C21422 c21422) {
        c21422.m47963("trash");
        final List listM47979 = c21422.m47979();
        this.f53600 = new C12502(c21422.m47965());
        if (listM47979.size() == 1) {
            final InterfaceC2557 interfaceC2557 = (InterfaceC2557) listM47979.get(0);
            if (interfaceC2557.isDirectory()) {
                this.f53600.m31053(this);
                this.f53600.m31056(interfaceC2557);
                C4716.f16636.execute(new Runnable() { // from class: l.ۤܺ֨
                    @Override // java.lang.Runnable
                    public final void run() {
                        DialogInterfaceOnDismissListenerC16735.m39255(this.f35562, interfaceC2557);
                    }
                });
                return;
            }
            this.f53600.m31055(interfaceC2557);
            return;
        }
        this.f53600.m31053(this);
        this.f53600.m31054(c21422.m47961(), listM47979);
        C4716.f16636.execute(new Runnable() { // from class: l.۟ܺ֨
            @Override // java.lang.Runnable
            public final void run() {
                DialogInterfaceOnDismissListenerC16735.m39254(this.f25077, listM47979);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m39255(final DialogInterfaceOnDismissListenerC16735 dialogInterfaceOnDismissListenerC16735, InterfaceC2557 interfaceC2557) {
        dialogInterfaceOnDismissListenerC16735.m39252(Collections.singleton(interfaceC2557.mo7989()));
        C16737.m39273(new Runnable() { // from class: l.᩷ܺ֨
            @Override // java.lang.Runnable
            public final void run() {
                DialogInterfaceOnDismissListenerC16735.m39253(this.f68307);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m39253(DialogInterfaceOnDismissListenerC16735 dialogInterfaceOnDismissListenerC16735) {
        dialogInterfaceOnDismissListenerC16735.f53600.m31052(dialogInterfaceOnDismissListenerC16735.f53597, dialogInterfaceOnDismissListenerC16735.f53598, dialogInterfaceOnDismissListenerC16735.f53601);
        dialogInterfaceOnDismissListenerC16735.f53600.m31051();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m39254(final DialogInterfaceOnDismissListenerC16735 dialogInterfaceOnDismissListenerC16735, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC2557 interfaceC2557 = (InterfaceC2557) it.next();
            if (interfaceC2557.isDirectory()) {
                dialogInterfaceOnDismissListenerC16735.f53598++;
                if (!interfaceC2557.mo7986()) {
                    arrayList.add(interfaceC2557.mo7989());
                }
            } else {
                dialogInterfaceOnDismissListenerC16735.f53597++;
                if (!interfaceC2557.mo7986()) {
                    dialogInterfaceOnDismissListenerC16735.f53601 = interfaceC2557.getSize() + dialogInterfaceOnDismissListenerC16735.f53601;
                }
            }
        }
        C16737.m39273(new Runnable() { // from class: l.ܺܺ֨
            @Override // java.lang.Runnable
            public final void run() {
                DialogInterfaceOnDismissListenerC16735 dialogInterfaceOnDismissListenerC16736 = this.f51902;
                dialogInterfaceOnDismissListenerC16736.f53600.m31052(dialogInterfaceOnDismissListenerC16736.f53597, dialogInterfaceOnDismissListenerC16736.f53598, dialogInterfaceOnDismissListenerC16736.f53601);
            }
        });
        dialogInterfaceOnDismissListenerC16735.m39252(arrayList);
        C16737.m39273(new Runnable() { // from class: l.᩶ܺ֨
            @Override // java.lang.Runnable
            public final void run() {
                DialogInterfaceOnDismissListenerC16735.m39257(this.f65710);
            }
        });
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m39257(DialogInterfaceOnDismissListenerC16735 dialogInterfaceOnDismissListenerC16735) {
        dialogInterfaceOnDismissListenerC16735.f53600.m31052(dialogInterfaceOnDismissListenerC16735.f53597, dialogInterfaceOnDismissListenerC16735.f53598, dialogInterfaceOnDismissListenerC16735.f53601);
        dialogInterfaceOnDismissListenerC16735.f53600.m31051();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m39252(Collection collection) {
        LinkedList linkedList = new LinkedList(collection);
        while (!linkedList.isEmpty() && !this.f53599) {
            for (AbstractC20745 abstractC20745 : ((AbstractC20745) linkedList.removeFirst()).mo33983(true)) {
                if (abstractC20745.mo33974()) {
                    this.f53598++;
                    if (!abstractC20745.m46723()) {
                        linkedList.addLast(abstractC20745);
                    }
                } else {
                    this.f53597++;
                    if (!abstractC20745.m46723()) {
                        this.f53601 = abstractC20745.mo33964() + this.f53601;
                    }
                }
            }
            C16737.m39273(new Runnable() { // from class: l.֡ܺ֨
                @Override // java.lang.Runnable
                public final void run() {
                    DialogInterfaceOnDismissListenerC16735 dialogInterfaceOnDismissListenerC16735 = this.f2199;
                    dialogInterfaceOnDismissListenerC16735.f53600.m31052(dialogInterfaceOnDismissListenerC16735.f53597, dialogInterfaceOnDismissListenerC16735.f53598, dialogInterfaceOnDismissListenerC16735.f53601);
                }
            });
        }
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f53599 = true;
    }
}
