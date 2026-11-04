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

/* JADX INFO: renamed from: l.ۢۢܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: E4GI */
/* JADX INFO: loaded from: classes3.dex */
public final class C10039 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC17204 f32172;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f32173;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC18990 f32174;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public BooleanSupplier f32175;

    public C10039(AbstractActivityC17204 abstractActivityC17204, InterfaceC18990 interfaceC18990) {
        this.f32175 = new C23626();
        this.f32172 = abstractActivityC17204;
        this.f32174 = interfaceC18990;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C10039(Main main, C22941 c22941) {
        this(main, new C11398(4, c22941));
        C17359.requireNonNull(c22941);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25890(BooleanSupplier booleanSupplier) {
        this.f32175 = booleanSupplier;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m25891() {
        C22415.m50556();
        if (this.f32175.getAsBoolean()) {
            this.f32173 = true;
            return false;
        }
        AbstractActivityC17204 abstractActivityC17204 = this.f32172;
        if (abstractActivityC17204 != null) {
            if (abstractActivityC17204.isFinishing() || this.f32172.isDestroyed()) {
                return false;
            }
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            final AtomicReference atomicReference = new AtomicReference();
            this.f32172.runOnUiThread(new Runnable() { // from class: l.ۛۢܳ
                @Override // java.lang.Runnable
                public final void run() {
                    C10039.m25886(this.f21397, atomicBoolean, atomicReference);
                }
            });
            try {
                synchronized (this) {
                    while (true) {
                        wait(200L);
                        if (atomicBoolean.get()) {
                            break;
                        }
                        if (this.f32175.getAsBoolean() || this.f32172.isFinishing() || this.f32172.isDestroyed()) {
                            if (!atomicBoolean.compareAndSet(false, true)) {
                                break;
                            }
                            this.f32173 = true;
                            AbstractViewOnClickListenerC22702 abstractViewOnClickListenerC22702 = (AbstractViewOnClickListenerC22702) atomicReference.getAndSet(null);
                            if (abstractViewOnClickListenerC22702 == null) {
                                break;
                            }
                            this.f32172.runOnUiThread(new RunnableC5458(4, abstractViewOnClickListenerC22702));
                            break;
                        }
                    }
                }
            } catch (InterruptedException unused) {
            }
        } else {
            this.f32173 = !new C0345(this).m49500(this.f32175);
        }
        return !this.f32173;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m25886(C10039 c10039, AtomicBoolean atomicBoolean, AtomicReference atomicReference) {
        if (c10039.f32175.getAsBoolean()) {
            synchronized (c10039) {
                c10039.f32173 = true;
                atomicBoolean.compareAndSet(false, true);
                c10039.notify();
            }
            return;
        }
        C21228 c21228 = new C21228(c10039, c10039.f32172, atomicBoolean);
        c21228.m51181(null);
        atomicReference.set(c21228);
        if (!atomicBoolean.get() && !c10039.f32175.getAsBoolean()) {
            c21228.m51182();
            return;
        }
        while (!atomicReference.compareAndSet(c21228, null) && atomicReference.get() == c21228) {
        }
        synchronized (c10039) {
            c10039.f32173 = true;
            atomicBoolean.compareAndSet(false, true);
            c10039.notify();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m25892(List list) {
        DialogInterfaceC8327 dialogInterfaceC8327;
        C22415.m50556();
        if (list.isEmpty()) {
            return m25891();
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (Object obj : list) {
            C17359.requireNonNull(obj);
            arrayList.add(obj);
        }
        List listUnmodifiableList = C4681.unmodifiableList(arrayList);
        final CharSequence[] charSequenceArr = new CharSequence[listUnmodifiableList.size() + 1];
        for (int i = 0; i < listUnmodifiableList.size(); i++) {
            charSequenceArr[i] = ((C14340) listUnmodifiableList.get(i)).m34760();
        }
        charSequenceArr[listUnmodifiableList.size()] = C21576.m49075(R.string.MT_Protector);
        AbstractActivityC17204 abstractActivityC17204 = this.f32172;
        int i2 = -1;
        if (abstractActivityC17204 == null) {
            AtomicInteger atomicInteger = new AtomicInteger(-1);
            if (new C7803(charSequenceArr, atomicInteger).m49500(this.f32175)) {
                i2 = atomicInteger.get();
            }
        } else if (!abstractActivityC17204.isFinishing() && !this.f32172.isDestroyed() && !this.f32175.getAsBoolean()) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            final AtomicInteger atomicInteger2 = new AtomicInteger(-1);
            final AtomicReference atomicReference = new AtomicReference();
            this.f32172.runOnUiThread(new Runnable() { // from class: l.᩺ۢܳ
                @Override // java.lang.Runnable
                public final void run() {
                    C10039.m25887(this.f78461, atomicBoolean, charSequenceArr, atomicInteger2, atomicReference);
                }
            });
            try {
                synchronized (this) {
                    while (!atomicBoolean.get()) {
                        wait(200L);
                        if (this.f32175.getAsBoolean() || this.f32172.isFinishing() || this.f32172.isDestroyed()) {
                            if (atomicBoolean.compareAndSet(false, true) && (dialogInterfaceC8327 = (DialogInterfaceC8327) atomicReference.getAndSet(null)) != null) {
                                this.f32172.runOnUiThread(new RunnableC22205(1, dialogInterfaceC8327));
                            }
                        }
                    }
                }
                i2 = atomicInteger2.get();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
        if (i2 < 0) {
            this.f32173 = true;
            return false;
        }
        if (i2 == listUnmodifiableList.size()) {
            return m25891();
        }
        this.f32174.mo11476(((C14340) listUnmodifiableList.get(i2)).f45235);
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m25887(final C10039 c10039, final AtomicBoolean atomicBoolean, CharSequence[] charSequenceArr, final AtomicInteger atomicInteger, AtomicReference atomicReference) {
        if (atomicBoolean.get() || c10039.f32175.getAsBoolean() || c10039.f32172.isFinishing() || c10039.f32172.isDestroyed()) {
            synchronized (c10039) {
                atomicBoolean.set(true);
                c10039.notify();
            }
            return;
        }
        C2361 c2361BuildDialog = c10039.f32172.buildDialog();
        c2361BuildDialog.m8021(R.string.MT_Protector);
        c2361BuildDialog.m8013(charSequenceArr, -1, new DialogInterfaceOnClickListenerC3433(1, atomicInteger));
        c2361BuildDialog.m8026(R.string.MT_Protector, null);
        c2361BuildDialog.m8022(R.string.MT_Protector, new DialogInterfaceOnClickListenerC4074(c10039, atomicBoolean, atomicInteger, 0));
        c2361BuildDialog.m8012(false);
        final DialogInterfaceC8327 dialogInterfaceC8327M8016 = c2361BuildDialog.m8016();
        atomicReference.set(dialogInterfaceC8327M8016);
        if (!atomicBoolean.get() && !c10039.f32175.getAsBoolean() && !c10039.f32172.isFinishing() && !c10039.f32172.isDestroyed()) {
            dialogInterfaceC8327M8016.m22436().setOnClickListener(new View.OnClickListener() { // from class: l.ܰۢܳ
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C10039 c100310 = this.f45660;
                    AtomicInteger atomicInteger2 = atomicInteger;
                    AtomicBoolean atomicBoolean2 = atomicBoolean;
                    DialogInterfaceC8327 dialogInterfaceC8327 = dialogInterfaceC8327M8016;
                    c100310.getClass();
                    if (atomicInteger2.get() < 0) {
                        return;
                    }
                    synchronized (c100310) {
                        if (atomicBoolean2.compareAndSet(false, true)) {
                            dialogInterfaceC8327.dismiss();
                            c100310.notify();
                        }
                    }
                }
            });
            return;
        }
        while (!atomicReference.compareAndSet(dialogInterfaceC8327M8016, null) && atomicReference.get() == dialogInterfaceC8327M8016) {
        }
        dialogInterfaceC8327M8016.dismiss();
        synchronized (c10039) {
            atomicBoolean.set(true);
            c10039.notify();
        }
    }
}
