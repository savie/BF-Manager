package l;

import android.content.DialogInterface;
import android.view.View;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.BooleanSupplier;

/* JADX INFO: renamed from: l.۟᩷ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: CAJ1 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7713 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f25520 = 0;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public volatile boolean f25522;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public volatile AtomicBoolean f25523;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public volatile EnumC10536 f25524 = EnumC10536.RETRY;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public volatile DialogInterfaceC19356 f25525;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final ConcurrentLinkedQueue f25519 = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final C9186 f25521 = new C9186(new Object());

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public synchronized void m20351(EnumC10536 enumC10536) {
        if (this.f25522) {
            this.f25524 = enumC10536;
            this.f25522 = false;
            this.f25523 = null;
            this.f25525 = null;
            notify();
        }
        f25521.mo23641(new Object());
    }

    /* JADX INFO: renamed from: ۙ */
    public abstract View mo2074(Main main);

    /* JADX INFO: renamed from: ۙ */
    public void mo2075(C8067 c8067) {
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo2076(DialogInterfaceC19356 dialogInterfaceC19356) {
    }

    /* JADX INFO: renamed from: ۙ */
    public abstract boolean mo2077(View view);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m20356(BooleanSupplier booleanSupplier) {
        C13890.m33727();
        while (true) {
            if (C20725.m46662()) {
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
                f25519.offer(this);
                f25521.mo23641(new Object());
                while (true) {
                    if (!this.f25522 && this.f25524 != EnumC10536.RETRY) {
                        return this.f25524 == EnumC10536.SUCCESS;
                    }
                    if (booleanSupplier.getAsBoolean()) {
                        m20347();
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

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m20352(final Main main) {
        f25521.m44959(main, new InterfaceC10597() { // from class: l.᩸᩷ۜ
            @Override // l.InterfaceC10597
            /* JADX INFO: renamed from: ۙ */
            public final void mo1473(Object obj) {
                AbstractC7713.m20354(main);
            }
        });
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m20354(Main main) {
        while (true) {
            ConcurrentLinkedQueue concurrentLinkedQueue = f25519;
            final AbstractC7713 abstractC7713 = (AbstractC7713) concurrentLinkedQueue.peek();
            if (abstractC7713 == null || abstractC7713.f25522) {
                return;
            }
            EnumC10536 enumC10536 = abstractC7713.f25524;
            EnumC10536 enumC10537 = EnumC10536.RETRY;
            if (enumC10536 == enumC10537) {
                synchronized (abstractC7713) {
                    if (abstractC7713.f25524 != enumC10537) {
                        return;
                    }
                    abstractC7713.f25522 = true;
                    final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
                    final View viewMo2074 = abstractC7713.mo2074(main);
                    if (viewMo2074 != null) {
                        viewMo2074.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC9125(abstractC7713, atomicBoolean));
                    }
                    C8067 c8067BuildDialog = main.buildDialog();
                    c8067BuildDialog.m21265(false);
                    c8067BuildDialog.m21251(R.string.MT_Protector, null);
                    c8067BuildDialog.m21275(R.string.MT_Protector, new DialogInterfaceOnClickListenerC18296(0, abstractC7713, atomicBoolean));
                    c8067BuildDialog.m21256(new DialogInterfaceOnCancelListenerC19002(0, abstractC7713, atomicBoolean));
                    c8067BuildDialog.m21257(new DialogInterface.OnDismissListener() { // from class: l.۠᩷ۜ
                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                            AbstractC7713.m20353(this.f29185, atomicBoolean);
                        }
                    });
                    if (viewMo2074 != null) {
                        c8067BuildDialog.m21258(viewMo2074);
                    }
                    abstractC7713.mo2075(c8067BuildDialog);
                    final DialogInterfaceC19356 dialogInterfaceC19356M21269 = c8067BuildDialog.m21269();
                    abstractC7713.f25523 = atomicBoolean;
                    abstractC7713.f25525 = dialogInterfaceC19356M21269;
                    dialogInterfaceC19356M21269.m44373().setOnClickListener(new View.OnClickListener() { // from class: l.᩵᩷ۜ
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            AbstractC7713.m20349(this.f63265, atomicBoolean, viewMo2074, dialogInterfaceC19356M21269);
                        }
                    });
                    abstractC7713.mo2076(dialogInterfaceC19356M21269);
                    return;
                }
            }
            concurrentLinkedQueue.remove();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m20348(AbstractC7713 abstractC7713, AtomicBoolean atomicBoolean) {
        if (atomicBoolean.compareAndSet(true, false)) {
            abstractC7713.m20351(EnumC10536.CANCEL);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m20355(AbstractC7713 abstractC7713, AtomicBoolean atomicBoolean) {
        if (atomicBoolean.compareAndSet(true, false)) {
            abstractC7713.m20351(EnumC10536.CANCEL);
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m20353(AbstractC7713 abstractC7713, AtomicBoolean atomicBoolean) {
        if (atomicBoolean.compareAndSet(true, false)) {
            abstractC7713.m20351(EnumC10536.RETRY);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m20349(AbstractC7713 abstractC7713, AtomicBoolean atomicBoolean, View view, DialogInterfaceC19356 dialogInterfaceC19356) {
        if (atomicBoolean.compareAndSet(true, false)) {
            if (abstractC7713.mo2077(view)) {
                abstractC7713.m20351(EnumC10536.SUCCESS);
                dialogInterfaceC19356.dismiss();
            } else {
                atomicBoolean.set(true);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m20347() {
        AtomicBoolean atomicBoolean = this.f25523;
        if (atomicBoolean != null) {
            atomicBoolean.compareAndSet(true, false);
        }
        DialogInterfaceC19356 dialogInterfaceC19356 = this.f25525;
        this.f25523 = null;
        this.f25525 = null;
        this.f25524 = EnumC10536.CANCEL;
        this.f25522 = false;
        f25519.remove(this);
        notify();
        if (dialogInterfaceC19356 != null) {
            C16737.m39273(new RunnableC3787(3, dialogInterfaceC19356));
        }
        f25521.mo23641(new Object());
    }
}
