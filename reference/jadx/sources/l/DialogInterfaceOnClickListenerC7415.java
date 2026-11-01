package l;

import android.content.Context;
import android.content.DialogInterface;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.۟ۤ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: E4GI */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC7415 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f24688;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f24689;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f24690;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f24691;

    public /* synthetic */ DialogInterfaceOnClickListenerC7415(Object obj, Object obj2, Object obj3, int i) {
        this.f24689 = i;
        this.f24691 = obj;
        this.f24688 = obj2;
        this.f24690 = obj3;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f24689) {
            case 0:
                C6004 c6004 = (C6004) this.f24691;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f24688;
                AtomicInteger atomicInteger = (AtomicInteger) this.f24690;
                synchronized (c6004) {
                    if (atomicBoolean.compareAndSet(false, true)) {
                        atomicInteger.set(-1);
                        c6004.notify();
                    }
                    break;
                }
                return;
            default:
                C16125.m38164((Context) this.f24690, (InterfaceC21063) this.f24691, (Runnable) this.f24688);
                return;
        }
    }
}
