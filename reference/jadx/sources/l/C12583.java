package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.ۨ᩵۫, reason: contains not printable characters */
/* JADX INFO: compiled from: TAHS */
/* JADX INFO: loaded from: classes4.dex */
public final class C12583 extends AbstractC2432 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6618 f40394;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C10745 f40395;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f40396;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ long f40399;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ RunnableC5631 f40400;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC18881 f40401;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f40402;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f40398 = false;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public AtomicReference f40397 = new AtomicReference();

    public C12583(C6618 c6618, AbstractC18881 abstractC18881, boolean z, boolean z2, long j, RunnableC5631 runnableC5631) {
        this.f40394 = c6618;
        this.f40401 = abstractC18881;
        this.f40396 = z;
        this.f40402 = z2;
        this.f40399 = j;
        this.f40400 = runnableC5631;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        C10745 c10745 = new C10745(this.f40394.f22119.m23233());
        c10745.m27397(R.string.MT_Protector);
        c10745.m27393("...");
        c10745.mo25916((Runnable) null);
        c10745.mo25931();
        this.f40395 = c10745;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() throws Exception {
        InterfaceC7509 interfaceC7509 = new InterfaceC7509() { // from class: l.ۗ᩵۫
            @Override // l.InterfaceC7509
            /* JADX INFO: renamed from: ۫ */
            public final boolean mo924() {
                C12583 c12583 = this.f12446;
                return c12583.f40395.m27399() || c12583.f40397.get() != null;
            }
        };
        final AbstractC18881 abstractC18881 = this.f40401;
        C2143 c2143 = new C2143(abstractC18881, interfaceC7509);
        c2143.m7405(this.f40396);
        c2143.m7407(this.f40402);
        List list = this.f40394.f22118;
        final long j = this.f40399;
        c2143.m7404(list, new InterfaceC13329() { // from class: l.᩵᩵۫
            @Override // l.InterfaceC13329
            /* JADX INFO: renamed from: ۙ */
            public final void mo6894(C5872 c5872, int i, int i2) {
                AbstractC18881 abstractC18882 = abstractC18881;
                long j2 = j;
                C12583 c12583 = this.f66594;
                C10745 c10745 = c12583.f40395;
                String str = c5872.f20146;
                String str2 = c5872.f20147;
                c10745.m27393(str);
                c12583.f40395.m27392(i, i2);
                try {
                    abstractC18882.mo43668(j2, str2);
                    c12583.f40398 = true;
                    if (str.indexOf(47) == -1) {
                        for (InterfaceC2386 interfaceC2386 : c12583.f40394.f22118) {
                            if (interfaceC2386.getPath().equals(str2)) {
                                interfaceC2386.setTime(j2);
                                return;
                            }
                        }
                    }
                } catch (Exception e) {
                    AtomicReference atomicReference = c12583.f40397;
                    Exception exc = new Exception(e.getMessage() + MotionUtils.EASING_TYPE_FORMAT_START + str + MotionUtils.EASING_TYPE_FORMAT_END, e);
                    while (!atomicReference.compareAndSet(null, exc) && atomicReference.get() == null) {
                    }
                }
            }
        });
        if (this.f40395.m27399()) {
            return;
        }
        AtomicReference atomicReference = this.f40397;
        if (atomicReference.get() == null) {
            return;
        }
        Exception exc = (Exception) atomicReference.get();
        C22327.m50389(exc);
        throw exc;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        if (this.f40395.m27399() || !this.f40398) {
            return;
        }
        C22673.m51152(R.string.MT_Protector);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        this.f40394.f22119.m23233().m40401(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        if (this.f40398) {
            this.f40400.run();
        }
        this.f40395.m27405();
    }
}
