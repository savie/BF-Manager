package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import com.alipay.sdk.m.m.b;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: l.֨᩹֨, reason: contains not printable characters */
/* JADX INFO: compiled from: QAI5 */
/* JADX INFO: loaded from: classes2.dex */
public final class DialogInterfaceOnDismissListenerC1399 extends AbstractC4674 implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f5803;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f5804;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f5805;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public AbstractC12233 f5806;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C19205 f5807;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public long f5808;

    public DialogInterfaceOnDismissListenerC1399() {
        super(R.string.MT_Protector, R.drawable.MT_Protector);
        this.f5808 = 0L;
        this.f5803 = 0;
        this.f5804 = 0;
        this.f5805 = false;
    }

    @Override // l.AbstractC4674
    /* JADX INFO: renamed from: ۨ */
    public final void mo1962(C21422 c21422) {
        c21422.m47963(b.k);
        this.f5806 = (AbstractC12233) c21422.m47960().mo13029();
        final List listM47979 = c21422.m47979();
        this.f5807 = new C19205(c21422.m47965(), listM47979);
        if (listM47979.size() == 1) {
            final InterfaceC2557 interfaceC2557 = (InterfaceC2557) listM47979.get(0);
            if (interfaceC2557.isDirectory()) {
                this.f5807.m44121(this);
                this.f5807.m44125(interfaceC2557);
                C4716.f16636.execute(new Runnable() { // from class: l.ܰ᩹֨
                    @Override // java.lang.Runnable
                    public final void run() {
                        DialogInterfaceOnDismissListenerC1399.m4909(this.f46335, interfaceC2557);
                    }
                });
                return;
            }
            this.f5807.m44123(interfaceC2557);
            return;
        }
        this.f5807.m44121(this);
        this.f5807.m44122(c21422.m47961());
        C4716.f16636.execute(new Runnable() { // from class: l.ۨ᩹֨
            @Override // java.lang.Runnable
            public final void run() {
                DialogInterfaceOnDismissListenerC1399.m4908(this.f40131, listM47979);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m4909(final DialogInterfaceOnDismissListenerC1399 dialogInterfaceOnDismissListenerC1399, InterfaceC2557 interfaceC2557) {
        dialogInterfaceOnDismissListenerC1399.m4906(interfaceC2557.getPath());
        C16737.m39273(new Runnable() { // from class: l.ۖ᩹֨
            @Override // java.lang.Runnable
            public final void run() {
                DialogInterfaceOnDismissListenerC1399.m4911(this.f10680);
            }
        });
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m4911(DialogInterfaceOnDismissListenerC1399 dialogInterfaceOnDismissListenerC1399) {
        dialogInterfaceOnDismissListenerC1399.f5807.m44120(dialogInterfaceOnDismissListenerC1399.f5803, dialogInterfaceOnDismissListenerC1399.f5804, dialogInterfaceOnDismissListenerC1399.f5808);
        dialogInterfaceOnDismissListenerC1399.f5807.m44119();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m4908(final DialogInterfaceOnDismissListenerC1399 dialogInterfaceOnDismissListenerC1399, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC2557 interfaceC2557 = (InterfaceC2557) it.next();
            if (interfaceC2557.isDirectory()) {
                dialogInterfaceOnDismissListenerC1399.f5804++;
                if (!interfaceC2557.mo7986()) {
                    dialogInterfaceOnDismissListenerC1399.m4906(interfaceC2557.getPath());
                }
            } else {
                dialogInterfaceOnDismissListenerC1399.f5803++;
                if (!interfaceC2557.mo7986()) {
                    dialogInterfaceOnDismissListenerC1399.f5808 = interfaceC2557.getSize() + dialogInterfaceOnDismissListenerC1399.f5808;
                }
            }
        }
        C16737.m39273(new Runnable() { // from class: l.ۚ᩹֨
            @Override // java.lang.Runnable
            public final void run() {
                DialogInterfaceOnDismissListenerC1399.m4910(this.f19288);
            }
        });
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m4910(DialogInterfaceOnDismissListenerC1399 dialogInterfaceOnDismissListenerC1399) {
        dialogInterfaceOnDismissListenerC1399.f5807.m44120(dialogInterfaceOnDismissListenerC1399.f5803, dialogInterfaceOnDismissListenerC1399.f5804, dialogInterfaceOnDismissListenerC1399.f5808);
        dialogInterfaceOnDismissListenerC1399.f5807.m44119();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m4906(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty() && !this.f5805) {
            try {
                for (InterfaceC2557 interfaceC2557 : this.f5806.mo10263((String) linkedList.removeFirst(), true)) {
                    if (interfaceC2557.isDirectory()) {
                        this.f5804++;
                        if (!interfaceC2557.mo7986()) {
                            linkedList.addLast(interfaceC2557.getPath());
                        }
                    } else {
                        this.f5803++;
                        if (!interfaceC2557.mo7986()) {
                            this.f5808 = interfaceC2557.getSize() + this.f5808;
                        }
                    }
                }
                C16737.m39273(new Runnable() { // from class: l.᩹᩹֨
                    @Override // java.lang.Runnable
                    public final void run() {
                        DialogInterfaceOnDismissListenerC1399 dialogInterfaceOnDismissListenerC1399 = this.f73544;
                        dialogInterfaceOnDismissListenerC1399.f5807.m44120(dialogInterfaceOnDismissListenerC1399.f5803, dialogInterfaceOnDismissListenerC1399.f5804, dialogInterfaceOnDismissListenerC1399.f5808);
                    }
                });
            } catch (IOException unused) {
                return;
            }
        }
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f5805 = true;
    }
}
