package l;

import android.content.DialogInterface;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.ۘۢܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: E4GI */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC4074 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f13913;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f13914;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f13915;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f13916;

    public /* synthetic */ DialogInterfaceOnClickListenerC4074(Object obj, Object obj2, Object obj3, int i) {
        this.f13914 = i;
        this.f13916 = obj;
        this.f13915 = obj2;
        this.f13913 = obj3;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f13914) {
            case 0:
                C10039 c10039 = (C10039) this.f13916;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f13915;
                AtomicInteger atomicInteger = (AtomicInteger) this.f13913;
                synchronized (c10039) {
                    if (atomicBoolean.compareAndSet(false, true)) {
                        atomicInteger.set(-1);
                        c10039.notify();
                    }
                    break;
                }
                return;
            default:
                ArrayList arrayList = (ArrayList) this.f13916;
                C20065 c20065 = (C20065) this.f13915;
                C12915 c12915 = (C12915) this.f13913;
                C22961.m51815(arrayList, c20065.m46167());
                C20634.m47244(c12915.m31979());
                return;
        }
    }
}
