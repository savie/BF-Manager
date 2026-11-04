package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: l.ۛۚ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: Z26I */
/* JADX INFO: loaded from: classes3.dex */
public final class DialogInterfaceOnDismissListenerC6181 extends AbstractC9843 implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f21054;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f21055;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public long f21056;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f21057;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C5258 f21058;

    public DialogInterfaceOnDismissListenerC6181() {
        super(R.string.MT_Protector, R.drawable.MT_Protector);
        this.f21056 = 0L;
        this.f21057 = 0;
        this.f21054 = 0;
        this.f21055 = false;
    }

    @Override // l.AbstractC9843
    /* JADX INFO: renamed from: ۤ */
    public final void mo2016(C12915 c12915) {
        c12915.m31970("local");
        final List listM31982 = c12915.m31982();
        this.f21058 = new C5258(c12915.m31983(), listM31982);
        if (listM31982.size() == 1) {
            final InterfaceC2386 interfaceC2386 = (InterfaceC2386) listM31982.get(0);
            if (interfaceC2386.isDirectory()) {
                this.f21058.m15826(this);
                this.f21058.m15829(interfaceC2386);
                C5261.f18540.execute(new Runnable() { // from class: l.ܽۚ۫
                    @Override // java.lang.Runnable
                    public final void run() {
                        DialogInterfaceOnDismissListenerC6181.m17819(this.f56507, interfaceC2386);
                    }
                });
                return;
            }
            this.f21058.m15828(interfaceC2386);
            return;
        }
        this.f21058.m15826(this);
        this.f21058.m15827(c12915.m31967());
        C5261.f18540.execute(new Runnable() { // from class: l.ܶۚ۫
            @Override // java.lang.Runnable
            public final void run() {
                DialogInterfaceOnDismissListenerC6181.m17818(this.f51615, listM31982);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m17819(final DialogInterfaceOnDismissListenerC6181 dialogInterfaceOnDismissListenerC6181, InterfaceC2386 interfaceC2386) {
        dialogInterfaceOnDismissListenerC6181.m17816(Collections.singleton(interfaceC2386.mo8093()));
        C21576.m49068(new Runnable() { // from class: l.᩵ۚ۫
            @Override // java.lang.Runnable
            public final void run() {
                DialogInterfaceOnDismissListenerC6181.m17820(this.f65283);
            }
        });
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m17820(DialogInterfaceOnDismissListenerC6181 dialogInterfaceOnDismissListenerC6181) {
        dialogInterfaceOnDismissListenerC6181.f21058.m15825(dialogInterfaceOnDismissListenerC6181.f21057, dialogInterfaceOnDismissListenerC6181.f21054, dialogInterfaceOnDismissListenerC6181.f21056);
        dialogInterfaceOnDismissListenerC6181.f21058.m15824();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m17818(final DialogInterfaceOnDismissListenerC6181 dialogInterfaceOnDismissListenerC6181, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC2386 interfaceC2386 = (InterfaceC2386) it.next();
            if (interfaceC2386.isDirectory()) {
                dialogInterfaceOnDismissListenerC6181.f21054++;
                if (!interfaceC2386.mo8107()) {
                    arrayList.add(interfaceC2386.mo8093());
                }
            } else {
                dialogInterfaceOnDismissListenerC6181.f21057++;
                if (!interfaceC2386.mo8107()) {
                    dialogInterfaceOnDismissListenerC6181.f21056 = interfaceC2386.getSize() + dialogInterfaceOnDismissListenerC6181.f21056;
                }
            }
        }
        C21576.m49068(new Runnable() { // from class: l.᩹ۚ۫
            @Override // java.lang.Runnable
            public final void run() {
                DialogInterfaceOnDismissListenerC6181 dialogInterfaceOnDismissListenerC6182 = this.f75579;
                dialogInterfaceOnDismissListenerC6182.f21058.m15825(dialogInterfaceOnDismissListenerC6182.f21057, dialogInterfaceOnDismissListenerC6182.f21054, dialogInterfaceOnDismissListenerC6182.f21056);
            }
        });
        dialogInterfaceOnDismissListenerC6181.m17816(arrayList);
        C21576.m49068(new Runnable() { // from class: l.ۗۚ۫
            @Override // java.lang.Runnable
            public final void run() {
                DialogInterfaceOnDismissListenerC6181.m17822(this.f10438);
            }
        });
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m17822(DialogInterfaceOnDismissListenerC6181 dialogInterfaceOnDismissListenerC6181) {
        dialogInterfaceOnDismissListenerC6181.f21058.m15825(dialogInterfaceOnDismissListenerC6181.f21057, dialogInterfaceOnDismissListenerC6181.f21054, dialogInterfaceOnDismissListenerC6181.f21056);
        dialogInterfaceOnDismissListenerC6181.f21058.m15824();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m17816(Collection collection) {
        LinkedList linkedList = new LinkedList(collection);
        while (!linkedList.isEmpty() && !this.f21055) {
            for (AbstractC22044 abstractC22044 : ((AbstractC22044) linkedList.removeFirst()).mo4299(true)) {
                if (abstractC22044.mo4281()) {
                    this.f21054++;
                    if (!abstractC22044.m49860()) {
                        linkedList.addLast(abstractC22044);
                    }
                } else {
                    this.f21057++;
                    if (!abstractC22044.m49860()) {
                        this.f21056 = abstractC22044.mo4285() + this.f21056;
                    }
                }
            }
            C21576.m49068(new Runnable() { // from class: l.ۨۚ۫
                @Override // java.lang.Runnable
                public final void run() {
                    DialogInterfaceOnDismissListenerC6181 dialogInterfaceOnDismissListenerC6181 = this.f39055;
                    dialogInterfaceOnDismissListenerC6181.f21058.m15825(dialogInterfaceOnDismissListenerC6181.f21057, dialogInterfaceOnDismissListenerC6181.f21054, dialogInterfaceOnDismissListenerC6181.f21056);
                }
            });
        }
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f21055 = true;
    }
}
