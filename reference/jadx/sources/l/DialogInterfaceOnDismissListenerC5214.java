package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import com.alipay.sdk.m.m.b;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: l.ۙ᩹۫, reason: contains not printable characters */
/* JADX INFO: compiled from: QAI5 */
/* JADX INFO: loaded from: classes3.dex */
public final class DialogInterfaceOnDismissListenerC5214 extends AbstractC9843 implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f18394;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public AbstractC18881 f18395;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f18396;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public long f18397;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f18398;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C12342 f18399;

    public DialogInterfaceOnDismissListenerC5214() {
        super(R.string.MT_Protector, R.drawable.MT_Protector);
        this.f18397 = 0L;
        this.f18398 = 0;
        this.f18394 = 0;
        this.f18396 = false;
    }

    @Override // l.AbstractC9843
    /* JADX INFO: renamed from: ۤ */
    public final void mo2016(C12915 c12915) {
        c12915.m31970(b.k);
        this.f18395 = (AbstractC18881) c12915.m31987().mo10174();
        final List listM31982 = c12915.m31982();
        this.f18399 = new C12342(c12915.m31983(), listM31982);
        if (listM31982.size() == 1) {
            final InterfaceC2386 interfaceC2386 = (InterfaceC2386) listM31982.get(0);
            if (interfaceC2386.isDirectory()) {
                this.f18399.m30781(this);
                this.f18399.m30785(interfaceC2386);
                C5261.f18540.execute(new Runnable() { // from class: l.ۡܶ۫
                    @Override // java.lang.Runnable
                    public final void run() {
                        DialogInterfaceOnDismissListenerC5214.m15684(this.f30681, interfaceC2386);
                    }
                });
                return;
            }
            this.f18399.m30783(interfaceC2386);
            return;
        }
        this.f18399.m30781(this);
        this.f18399.m30782(c12915.m31967());
        C5261.f18540.execute(new Runnable() { // from class: l.ۖܶ۫
            @Override // java.lang.Runnable
            public final void run() {
                DialogInterfaceOnDismissListenerC5214.m15683(this.f9118, listM31982);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m15684(final DialogInterfaceOnDismissListenerC5214 dialogInterfaceOnDismissListenerC5214, InterfaceC2386 interfaceC2386) {
        dialogInterfaceOnDismissListenerC5214.m15681(interfaceC2386.getPath());
        C21576.m49068(new Runnable() { // from class: l.۠ܶ۫
            @Override // java.lang.Runnable
            public final void run() {
                DialogInterfaceOnDismissListenerC5214.m15686(this.f28394);
            }
        });
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m15686(DialogInterfaceOnDismissListenerC5214 dialogInterfaceOnDismissListenerC5214) {
        dialogInterfaceOnDismissListenerC5214.f18399.m30780(dialogInterfaceOnDismissListenerC5214.f18398, dialogInterfaceOnDismissListenerC5214.f18394, dialogInterfaceOnDismissListenerC5214.f18397);
        dialogInterfaceOnDismissListenerC5214.f18399.m30779();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m15683(final DialogInterfaceOnDismissListenerC5214 dialogInterfaceOnDismissListenerC5214, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC2386 interfaceC2386 = (InterfaceC2386) it.next();
            if (interfaceC2386.isDirectory()) {
                dialogInterfaceOnDismissListenerC5214.f18394++;
                if (!interfaceC2386.mo8107()) {
                    dialogInterfaceOnDismissListenerC5214.m15681(interfaceC2386.getPath());
                }
            } else {
                dialogInterfaceOnDismissListenerC5214.f18398++;
                if (!interfaceC2386.mo8107()) {
                    dialogInterfaceOnDismissListenerC5214.f18397 = interfaceC2386.getSize() + dialogInterfaceOnDismissListenerC5214.f18397;
                }
            }
        }
        C21576.m49068(new Runnable() { // from class: l.ۜܶ۫
            @Override // java.lang.Runnable
            public final void run() {
                DialogInterfaceOnDismissListenerC5214.m15685(this.f23838);
            }
        });
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m15685(DialogInterfaceOnDismissListenerC5214 dialogInterfaceOnDismissListenerC5214) {
        dialogInterfaceOnDismissListenerC5214.f18399.m30780(dialogInterfaceOnDismissListenerC5214.f18398, dialogInterfaceOnDismissListenerC5214.f18394, dialogInterfaceOnDismissListenerC5214.f18397);
        dialogInterfaceOnDismissListenerC5214.f18399.m30779();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m15681(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty() && !this.f18396) {
            try {
                for (InterfaceC2386 interfaceC2386 : this.f18395.mo20830((String) linkedList.removeFirst(), true)) {
                    if (interfaceC2386.isDirectory()) {
                        this.f18394++;
                        if (!interfaceC2386.mo8107()) {
                            linkedList.addLast(interfaceC2386.getPath());
                        }
                    } else {
                        this.f18398++;
                        if (!interfaceC2386.mo8107()) {
                            this.f18397 = interfaceC2386.getSize() + this.f18397;
                        }
                    }
                }
                C21576.m49068(new Runnable() { // from class: l.۬ܶ۫
                    @Override // java.lang.Runnable
                    public final void run() {
                        DialogInterfaceOnDismissListenerC5214 dialogInterfaceOnDismissListenerC5214 = this.f44196;
                        dialogInterfaceOnDismissListenerC5214.f18399.m30780(dialogInterfaceOnDismissListenerC5214.f18398, dialogInterfaceOnDismissListenerC5214.f18394, dialogInterfaceOnDismissListenerC5214.f18397);
                    }
                });
            } catch (IOException unused) {
                return;
            }
        }
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f18396 = true;
    }
}
