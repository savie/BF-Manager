package l;

import android.view.View;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BooleanSupplier;

/* JADX INFO: renamed from: l.ۛۤ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: E4GI */
/* JADX INFO: loaded from: classes2.dex */
public final class C6004 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public BooleanSupplier f20401;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC12483 f20402;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f20403;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC17293 f20404;

    public C6004(AbstractActivityC12483 abstractActivityC12483, InterfaceC17293 interfaceC17293) {
        this.f20401 = new C19746();
        this.f20402 = abstractActivityC12483;
        this.f20404 = interfaceC17293;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6004(Main main, C2455 c2455) {
        this(main, new C13455(c2455));
        C13638.requireNonNull(c2455);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16303(BooleanSupplier booleanSupplier) {
        this.f20401 = booleanSupplier;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m16304() {
        C13890.m33727();
        if (this.f20401.getAsBoolean()) {
            this.f20403 = true;
            return false;
        }
        AbstractActivityC12483 abstractActivityC12483 = this.f20402;
        if (abstractActivityC12483 != null) {
            if (abstractActivityC12483.isFinishing() || this.f20402.isDestroyed()) {
                return false;
            }
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            final AtomicReference atomicReference = new AtomicReference();
            this.f20402.runOnUiThread(new Runnable() { // from class: l.ۡۤ᩹
                @Override // java.lang.Runnable
                public final void run() {
                    C6004.m16299(this.f30348, atomicBoolean, atomicReference);
                }
            });
            try {
                synchronized (this) {
                    while (true) {
                        wait(200L);
                        if (atomicBoolean.get()) {
                            break;
                        }
                        if (this.f20401.getAsBoolean() || this.f20402.isFinishing() || this.f20402.isDestroyed()) {
                            if (!atomicBoolean.compareAndSet(false, true)) {
                                break;
                            }
                            this.f20403 = true;
                            AbstractViewOnClickListenerC14664 abstractViewOnClickListenerC14664 = (AbstractViewOnClickListenerC14664) atomicReference.getAndSet(null);
                            if (abstractViewOnClickListenerC14664 == null) {
                                break;
                            }
                            this.f20402.runOnUiThread(new RunnableC4263(4, abstractViewOnClickListenerC14664));
                            break;
                        }
                    }
                }
            } catch (InterruptedException unused) {
            }
        } else {
            this.f20403 = !new C0359(this).m20356(this.f20401);
        }
        return !this.f20403;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m16299(C6004 c6004, AtomicBoolean atomicBoolean, AtomicReference atomicReference) {
        if (c6004.f20401.getAsBoolean()) {
            synchronized (c6004) {
                c6004.f20403 = true;
                atomicBoolean.compareAndSet(false, true);
                c6004.notify();
            }
            return;
        }
        C15883 c15883 = new C15883(c6004, c6004.f20402, atomicBoolean);
        c15883.m35195(null);
        atomicReference.set(c15883);
        if (!atomicBoolean.get() && !c6004.f20401.getAsBoolean()) {
            c15883.m35198();
            return;
        }
        while (!atomicReference.compareAndSet(c15883, null) && atomicReference.get() == c15883) {
        }
        synchronized (c6004) {
            c6004.f20403 = true;
            atomicBoolean.compareAndSet(false, true);
            c6004.notify();
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0108  */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.CharSequence[], java.lang.Cloneable] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m16305(List list) {
        int i;
        DialogInterfaceC19356 dialogInterfaceC19356;
        C13890.m33727();
        if (list.isEmpty()) {
            return m16304();
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (Object obj : list) {
            C13638.requireNonNull(obj);
            arrayList.add(obj);
        }
        List listUnmodifiableList = C0561.unmodifiableList(arrayList);
        ?? r4 = new CharSequence[listUnmodifiableList.size() + 1];
        for (int i2 = 0; i2 < listUnmodifiableList.size(); i2++) {
            r4[i2] = ((C6148) listUnmodifiableList.get(i2)).m17153();
        }
        r4[listUnmodifiableList.size()] = C16737.m39283(R.string.MT_Protector);
        AbstractActivityC12483 abstractActivityC12483 = this.f20402;
        if (abstractActivityC12483 == null) {
            AtomicInteger atomicInteger = new AtomicInteger(-1);
            if (new C12355(r4, atomicInteger).m20356(this.f20401)) {
                i = atomicInteger.get();
            } else {
                i = -1;
            }
        } else if (abstractActivityC12483.isFinishing() || this.f20402.isDestroyed() || this.f20401.getAsBoolean()) {
            i = -1;
        } else {
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            AtomicInteger atomicInteger2 = new AtomicInteger(-1);
            AtomicReference atomicReference = new AtomicReference();
            this.f20402.runOnUiThread(new RunnableC10238(this, atomicBoolean, r4, atomicInteger2, atomicReference, 0));
            try {
                synchronized (this) {
                    while (!atomicBoolean.get()) {
                        wait(200L);
                        if (this.f20401.getAsBoolean() || this.f20402.isFinishing() || this.f20402.isDestroyed()) {
                            if (atomicBoolean.compareAndSet(false, true) && (dialogInterfaceC19356 = (DialogInterfaceC19356) atomicReference.getAndSet(null)) != null) {
                                this.f20402.runOnUiThread(new RunnableC3787(3, dialogInterfaceC19356));
                            }
                        }
                    }
                }
                i = atomicInteger2.get();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                i = -1;
            }
        }
        if (i < 0) {
            this.f20403 = true;
            return false;
        }
        if (i == listUnmodifiableList.size()) {
            return m16304();
        }
        this.f20404.mo1826(((C6148) listUnmodifiableList.get(i)).f21002);
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m16300(final C6004 c6004, final AtomicBoolean atomicBoolean, CharSequence[] charSequenceArr, final AtomicInteger atomicInteger, AtomicReference atomicReference) {
        if (atomicBoolean.get() || c6004.f20401.getAsBoolean() || c6004.f20402.isFinishing() || c6004.f20402.isDestroyed()) {
            synchronized (c6004) {
                atomicBoolean.set(true);
                c6004.notify();
            }
            return;
        }
        C8067 c8067BuildDialog = c6004.f20402.buildDialog();
        c8067BuildDialog.m21274(R.string.MT_Protector);
        c8067BuildDialog.m21266(charSequenceArr, -1, new DialogInterfaceOnClickListenerC6569(1, atomicInteger));
        c8067BuildDialog.m21251(R.string.MT_Protector, null);
        c8067BuildDialog.m21275(R.string.MT_Protector, new DialogInterfaceOnClickListenerC7415(c6004, atomicBoolean, atomicInteger, 0));
        c8067BuildDialog.m21265(false);
        final DialogInterfaceC19356 dialogInterfaceC19356M21269 = c8067BuildDialog.m21269();
        atomicReference.set(dialogInterfaceC19356M21269);
        if (!atomicBoolean.get() && !c6004.f20401.getAsBoolean() && !c6004.f20402.isFinishing() && !c6004.f20402.isDestroyed()) {
            dialogInterfaceC19356M21269.m44373().setOnClickListener(new View.OnClickListener() { // from class: l.᩷ۤ᩹
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C6004 c6005 = this.f67663;
                    AtomicInteger atomicInteger2 = atomicInteger;
                    AtomicBoolean atomicBoolean2 = atomicBoolean;
                    DialogInterfaceC19356 dialogInterfaceC19356 = dialogInterfaceC19356M21269;
                    c6005.getClass();
                    if (atomicInteger2.get() < 0) {
                        return;
                    }
                    synchronized (c6005) {
                        if (atomicBoolean2.compareAndSet(false, true)) {
                            dialogInterfaceC19356.dismiss();
                            c6005.notify();
                        }
                    }
                }
            });
            return;
        }
        while (!atomicReference.compareAndSet(dialogInterfaceC19356M21269, null) && atomicReference.get() == dialogInterfaceC19356M21269) {
        }
        dialogInterfaceC19356M21269.dismiss();
        synchronized (c6004) {
            atomicBoolean.set(true);
            c6004.notify();
        }
    }
}
