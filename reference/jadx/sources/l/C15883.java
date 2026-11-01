package l;

import android.content.Intent;
import bin.mt.plus.R;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.ܺۤ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: E4GI */
/* JADX INFO: loaded from: classes4.dex */
public final class C15883 extends AbstractViewOnClickListenerC14664 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6004 f51462;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AtomicBoolean f51463;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15883(C6004 c6004, AbstractActivityC12483 abstractActivityC12483, AtomicBoolean atomicBoolean) {
        super(abstractActivityC12483, R.string.MT_Protector);
        this.f51462 = c6004;
        this.f51463 = atomicBoolean;
    }

    @Override // l.AbstractViewOnClickListenerC14664
    /* JADX INFO: renamed from: ۚ */
    public final void mo35196() {
        String strM35199 = m35199();
        if (strM35199.isEmpty()) {
            C15829.m37617(R.string.MT_Protector, 0).m37622();
            return;
        }
        synchronized (this.f51462) {
            if (!this.f51463.compareAndSet(false, true)) {
                m35194();
                return;
            }
            this.f51462.f20404.mo1826(strM35199);
            m35194();
            this.f51462.notify();
        }
    }

    @Override // l.AbstractViewOnClickListenerC14664
    /* JADX INFO: renamed from: ۨ */
    public final void mo35197() {
        this.f51462.f20403 = true;
        synchronized (this.f51462) {
            if (this.f51463.compareAndSet(false, true)) {
                this.f51462.notify();
            }
        }
    }

    @Override // l.AbstractViewOnClickListenerC14664
    /* JADX INFO: renamed from: ۖ */
    public final void mo35193() {
        C6004 c6004 = this.f51462;
        c6004.f20402.startActivity(new Intent(c6004.f20402, (Class<?>) ActivityC12499.class));
    }
}
