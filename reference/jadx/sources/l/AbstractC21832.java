package l;

import android.content.DialogInterface;
import android.view.View;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.BooleanSupplier;

/* JADX INFO: renamed from: l.᩷ۙ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: CAJ1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC21832 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final ConcurrentLinkedQueue f69578 = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final C17930 f69579 = new C17930(new Object());

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f69580 = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public volatile AtomicBoolean f69581;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public volatile EnumC4678 f69582 = EnumC4678.RETRY;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public volatile DialogInterfaceC8327 f69583;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public volatile boolean f69584;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public synchronized void m49492(EnumC4678 enumC4678) {
        if (this.f69584) {
            this.f69582 = enumC4678;
            this.f69584 = false;
            this.f69581 = null;
            this.f69583 = null;
            notify();
        }
        f69579.mo40348(new Object());
    }

    /* JADX INFO: renamed from: ۙ */
    public abstract View mo2088(Main main);

    /* JADX INFO: renamed from: ۙ */
    public void mo2089(C2361 c2361) {
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo2090(DialogInterfaceC8327 dialogInterfaceC8327) {
    }

    /* JADX INFO: renamed from: ۙ */
    public abstract boolean mo2091(View view);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m49500(BooleanSupplier booleanSupplier) {
        C22415.m50556();
        while (true) {
            if (C13678.m33470()) {
                if (booleanSupplier.getAsBoolean()) {
                    return false;
                }
                try {
                    Thread.sleep(100L);
                } catch (InterruptedException unused) {
                }
            } else {
                if (booleanSupplier.getAsBoolean()) {
                    return false;
                }
                f69578.offer(this);
                f69579.mo40348(new Object());
                while (true) {
                    if (!this.f69584 && this.f69582 != EnumC4678.RETRY) {
                        return this.f69582 == EnumC4678.SUCCESS;
                    }
                    if (booleanSupplier.getAsBoolean()) {
                        m49491();
                        return false;
                    }
                    try {
                        wait(100L);
                    } catch (InterruptedException unused2) {
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m49496(final Main main) {
        f69579.m40350(main, new InterfaceC16438() { // from class: l.֨۬ۧ
            @Override // l.InterfaceC16438
            /* JADX INFO: renamed from: ۙ */
            public final void mo1486(Object obj) {
                AbstractC21832.m49498(main);
            }
        });
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m49498(Main main) {
        while (true) {
            ConcurrentLinkedQueue concurrentLinkedQueue = f69578;
            final AbstractC21832 abstractC21832 = (AbstractC21832) concurrentLinkedQueue.peek();
            if (abstractC21832 == null || abstractC21832.f69584) {
                return;
            }
            EnumC4678 enumC4678 = abstractC21832.f69582;
            EnumC4678 enumC4679 = EnumC4678.RETRY;
            if (enumC4678 == enumC4679) {
                synchronized (abstractC21832) {
                    if (abstractC21832.f69582 != enumC4679) {
                        return;
                    }
                    abstractC21832.f69584 = true;
                    final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
                    final View viewMo2088 = abstractC21832.mo2088(main);
                    if (viewMo2088 != null) {
                        viewMo2088.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC13874(abstractC21832, atomicBoolean));
                    }
                    C2361 c2361BuildDialog = main.buildDialog();
                    c2361BuildDialog.m8012(false);
                    c2361BuildDialog.m8026(R.string.MT_Protector, null);
                    c2361BuildDialog.m8022(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۡ۬ۧ
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            AbstractC21832.m49493(this.f30503, atomicBoolean);
                        }
                    });
                    c2361BuildDialog.m8003(new DialogInterface.OnCancelListener() { // from class: l.ۖ۬ۧ
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            AbstractC21832.m49499(this.f8558, atomicBoolean);
                        }
                    });
                    c2361BuildDialog.m8004(new DialogInterface.OnDismissListener() { // from class: l.۠۬ۧ
                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                            AbstractC21832.m49497(this.f28255, atomicBoolean);
                        }
                    });
                    if (viewMo2088 != null) {
                        c2361BuildDialog.m8005(viewMo2088);
                    }
                    abstractC21832.mo2089(c2361BuildDialog);
                    final DialogInterfaceC8327 dialogInterfaceC8327M8016 = c2361BuildDialog.m8016();
                    abstractC21832.f69581 = atomicBoolean;
                    abstractC21832.f69583 = dialogInterfaceC8327M8016;
                    dialogInterfaceC8327M8016.m22436().setOnClickListener(new View.OnClickListener() { // from class: l.ۜ۬ۧ
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            AbstractC21832.m49494(this.f23672, atomicBoolean, viewMo2088, dialogInterfaceC8327M8016);
                        }
                    });
                    abstractC21832.mo2090(dialogInterfaceC8327M8016);
                    return;
                }
            }
            concurrentLinkedQueue.remove();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m49493(AbstractC21832 abstractC21832, AtomicBoolean atomicBoolean) {
        if (atomicBoolean.compareAndSet(true, false)) {
            abstractC21832.m49492(EnumC4678.CANCEL);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m49499(AbstractC21832 abstractC21832, AtomicBoolean atomicBoolean) {
        if (atomicBoolean.compareAndSet(true, false)) {
            abstractC21832.m49492(EnumC4678.CANCEL);
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m49497(AbstractC21832 abstractC21832, AtomicBoolean atomicBoolean) {
        if (atomicBoolean.compareAndSet(true, false)) {
            abstractC21832.m49492(EnumC4678.RETRY);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m49494(AbstractC21832 abstractC21832, AtomicBoolean atomicBoolean, View view, DialogInterfaceC8327 dialogInterfaceC8327) {
        if (atomicBoolean.compareAndSet(true, false)) {
            if (abstractC21832.mo2091(view)) {
                abstractC21832.m49492(EnumC4678.SUCCESS);
                dialogInterfaceC8327.dismiss();
            } else {
                atomicBoolean.set(true);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m49491() {
        AtomicBoolean atomicBoolean = this.f69581;
        if (atomicBoolean != null) {
            atomicBoolean.compareAndSet(true, false);
        }
        DialogInterfaceC8327 dialogInterfaceC8327 = this.f69583;
        this.f69581 = null;
        this.f69583 = null;
        this.f69582 = EnumC4678.CANCEL;
        this.f69584 = false;
        f69578.remove(this);
        notify();
        if (dialogInterfaceC8327 != null) {
            C21576.m49068(new RunnableC22205(1, dialogInterfaceC8327));
        }
        f69579.mo40348(new Object());
    }
}
