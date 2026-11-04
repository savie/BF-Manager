package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.ܿ᩵۫, reason: contains not printable characters */
/* JADX INFO: compiled from: B7T7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18550 extends AbstractC2432 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0651 f60269;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C10745 f60270;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f60271;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ RunnableC5631 f60274;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC18881 f60275;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f60276;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f60273 = false;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public AtomicReference f60272 = new AtomicReference();

    public C18550(C0651 c0651, AbstractC18881 abstractC18881, boolean z, boolean z2, RunnableC5631 runnableC5631) {
        this.f60269 = c0651;
        this.f60275 = abstractC18881;
        this.f60271 = z;
        this.f60276 = z2;
        this.f60274 = runnableC5631;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        C10745 c10745 = new C10745(this.f60269.f2517.m23233());
        c10745.m27397(R.string.MT_Protector);
        c10745.m27393("...");
        c10745.mo25916((Runnable) null);
        c10745.mo25931();
        this.f60270 = c10745;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() throws Exception {
        C0651 c0651 = this.f60269;
        final int iM5101 = c0651.f2516.m5101();
        final int iM5099 = c0651.f2516.m5099();
        final String strM5106 = c0651.f2516.m5106();
        final String strM5105 = c0651.f2516.m5105();
        C2143 c2143 = new C2143(this.f60275, new InterfaceC7509() { // from class: l.ܰ᩵۫
            @Override // l.InterfaceC7509
            /* JADX INFO: renamed from: ۫ */
            public final boolean mo924() {
                C18550 c18550 = this.f48451;
                return c18550.f60270.m27399() || c18550.f60272.get() != null;
            }
        });
        c2143.m7405(this.f60271);
        c2143.m7407(this.f60276);
        List list = c0651.f2515;
        final AbstractC18881 abstractC18881 = this.f60275;
        c2143.m7404(list, new InterfaceC13329() { // from class: l.᩶᩵۫
            @Override // l.InterfaceC13329
            /* JADX INFO: renamed from: ۙ */
            public final void mo6894(C5872 c5872, int i, int i2) {
                AbstractC18881 abstractC18882 = abstractC18881;
                int i3 = iM5101;
                int i4 = iM5099;
                String str = strM5106;
                String str2 = strM5105;
                C18550 c18550 = this.f68803;
                C10745 c10745 = c18550.f60270;
                String str3 = c5872.f20146;
                String str4 = c5872.f20147;
                c10745.m27393(str3);
                c18550.f60270.m27392(i, i2);
                try {
                    abstractC18882.mo43787(i3, i4, str4);
                    c18550.f60273 = true;
                    if (str3.indexOf(47) == -1) {
                        for (InterfaceC2386 interfaceC2386 : c18550.f60269.f2515) {
                            if (interfaceC2386.getPath().equals(str4)) {
                                AbstractC20042 abstractC20042 = (AbstractC20042) interfaceC2386;
                                C9097 c9097Mo5155 = abstractC20042.mo5155();
                                if (c9097Mo5155 != null) {
                                    abstractC20042.mo5154(c9097Mo5155.m24240(str, str2));
                                    return;
                                }
                                return;
                            }
                        }
                    }
                } catch (Exception e) {
                    AtomicReference atomicReference = c18550.f60272;
                    Exception exc = new Exception(e.getMessage() + MotionUtils.EASING_TYPE_FORMAT_START + str3 + MotionUtils.EASING_TYPE_FORMAT_END, e);
                    while (!atomicReference.compareAndSet(null, exc) && atomicReference.get() == null) {
                    }
                }
            }
        });
        if (this.f60270.m27399()) {
            return;
        }
        AtomicReference atomicReference = this.f60272;
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
        if (this.f60270.m27399() || !this.f60273) {
            return;
        }
        C22673.m51152(R.string.MT_Protector);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        this.f60269.f2517.m23233().m40401(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        if (this.f60273) {
            this.f60274.run();
        }
        this.f60270.m27405();
    }
}
