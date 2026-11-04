package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.۬᩵۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 8AI4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14074 extends AbstractC2432 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4885 f44562;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C10745 f44563;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f44564;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ RunnableC5631 f44567;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC18881 f44568;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f44569;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f44566 = false;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public AtomicReference f44565 = new AtomicReference();

    public C14074(C4885 c4885, AbstractC18881 abstractC18881, boolean z, boolean z2, RunnableC5631 runnableC5631) {
        this.f44562 = c4885;
        this.f44568 = abstractC18881;
        this.f44564 = z;
        this.f44569 = z2;
        this.f44567 = runnableC5631;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        C10745 c10745 = new C10745(this.f44562.f17077.m23233());
        c10745.m27397(R.string.MT_Protector);
        c10745.m27393("...");
        c10745.mo25916((Runnable) null);
        c10745.mo25931();
        this.f44563 = c10745;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() throws Exception {
        C4885 c4885 = this.f44562;
        final int iM10968 = c4885.f17076.m10968();
        InterfaceC7509 interfaceC7509 = new InterfaceC7509() { // from class: l.۠᩵۫
            @Override // l.InterfaceC7509
            /* JADX INFO: renamed from: ۫ */
            public final boolean mo924() {
                C14074 c14074 = this.f28933;
                return c14074.f44563.m27399() || c14074.f44565.get() != null;
            }
        };
        final AbstractC18881 abstractC18881 = this.f44568;
        C2143 c2143 = new C2143(abstractC18881, interfaceC7509);
        c2143.m7405(this.f44564);
        c2143.m7407(this.f44569);
        c2143.m7404(c4885.f17075, new InterfaceC13329() { // from class: l.ۜ᩵۫
            @Override // l.InterfaceC13329
            /* JADX INFO: renamed from: ۙ */
            public final void mo6894(C5872 c5872, int i, int i2) {
                AbstractC18881 abstractC18882 = abstractC18881;
                int i3 = iM10968;
                C14074 c14074 = this.f24206;
                C10745 c10745 = c14074.f44563;
                String str = c5872.f20146;
                String str2 = c5872.f20147;
                c10745.m27393(str);
                c14074.f44563.m27392(i, i2);
                try {
                    abstractC18882.mo43669(i3, str2);
                    c14074.f44566 = true;
                    if (str.indexOf(47) == -1) {
                        for (InterfaceC2386 interfaceC2386 : c14074.f44562.f17075) {
                            if (interfaceC2386.getPath().equals(str2)) {
                                AbstractC20042 abstractC20042 = (AbstractC20042) interfaceC2386;
                                C9097 c9097Mo5155 = abstractC20042.mo5155();
                                if (c9097Mo5155 != null) {
                                    abstractC20042.mo5154(c9097Mo5155.m24238(i3));
                                    return;
                                }
                                return;
                            }
                        }
                    }
                } catch (Exception e) {
                    AtomicReference atomicReference = c14074.f44565;
                    Exception exc = new Exception(e.getMessage() + MotionUtils.EASING_TYPE_FORMAT_START + str + MotionUtils.EASING_TYPE_FORMAT_END, e);
                    while (!atomicReference.compareAndSet(null, exc) && atomicReference.get() == null) {
                    }
                }
            }
        });
        if (this.f44563.m27399()) {
            return;
        }
        AtomicReference atomicReference = this.f44565;
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
        if (this.f44563.m27399() || !this.f44566) {
            return;
        }
        C22673.m51152(R.string.MT_Protector);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        this.f44562.f17077.m23233().m40401(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        if (this.f44566) {
            this.f44567.run();
        }
        this.f44563.m27405();
    }
}
