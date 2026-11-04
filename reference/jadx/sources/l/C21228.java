package l;

import android.content.Intent;
import bin.mt.plus.R;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.᩶ۢܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: E4GI */
/* JADX INFO: loaded from: classes5.dex */
public final class C21228 extends AbstractViewOnClickListenerC22702 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10039 f67742;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AtomicBoolean f67743;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21228(C10039 c10039, AbstractActivityC17204 abstractActivityC17204, AtomicBoolean atomicBoolean) {
        super(abstractActivityC17204, R.string.MT_Protector);
        this.f67742 = c10039;
        this.f67743 = atomicBoolean;
    }

    @Override // l.AbstractViewOnClickListenerC22702
    /* JADX INFO: renamed from: ᩴ */
    public final void mo8572() {
        String strM51185 = m51185();
        if (strM51185.isEmpty()) {
            C22673.m51158(R.string.MT_Protector, 0).m51163();
            return;
        }
        synchronized (this.f67742) {
            if (!this.f67743.compareAndSet(false, true)) {
                m51180();
                return;
            }
            this.f67742.f32174.mo11476(strM51185);
            m51180();
            this.f67742.notify();
        }
    }

    @Override // l.AbstractViewOnClickListenerC22702
    /* JADX INFO: renamed from: ۤ */
    public final void mo8571() {
        this.f67742.f32173 = true;
        synchronized (this.f67742) {
            if (this.f67743.compareAndSet(false, true)) {
                this.f67742.notify();
            }
        }
    }

    @Override // l.AbstractViewOnClickListenerC22702
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void mo48383() {
        C10039 c10039 = this.f67742;
        c10039.f32172.startActivity(new Intent(c10039.f32172, (Class<?>) ActivityC6138.class));
    }
}
