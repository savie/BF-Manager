package l;

import android.app.Activity;
import androidx.window.extensions.layout.WindowLayoutInfo;
import com.alipay.sdk.m.u0.b;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Consumer;
import net.engio.mbassy.listener.MessageHandler;

/* JADX INFO: renamed from: l.ۙܰۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: TAN9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4687 implements Consumer {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Activity f16570;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C5331 f16572;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final ReentrantLock f16569 = new ReentrantLock();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final LinkedHashSet f16571 = new LinkedHashSet();

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C1455.$default$andThen(this, consumer);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12989(InterfaceC17295 interfaceC17295) {
        C13465.m32966(interfaceC17295, MessageHandler.Properties.Listener);
        ReentrantLock reentrantLock = this.f16569;
        reentrantLock.lock();
        try {
            this.f16571.remove(interfaceC17295);
        } finally {
            reentrantLock.unlock();
        }
    }

    public C4687(Activity activity) {
        this.f16570 = activity;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        WindowLayoutInfo windowLayoutInfo = (WindowLayoutInfo) obj;
        C13465.m32966(windowLayoutInfo, b.d);
        ReentrantLock reentrantLock = this.f16569;
        reentrantLock.lock();
        try {
            this.f16572 = C11744.m29349(this.f16570, windowLayoutInfo);
            Iterator it = this.f16571.iterator();
            while (it.hasNext()) {
                ((InterfaceC17295) it.next()).accept(this.f16572);
            }
            C7321 c7321 = C7321.f24318;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12988(C13799 c13799) {
        ReentrantLock reentrantLock = this.f16569;
        reentrantLock.lock();
        try {
            C5331 c5331 = this.f16572;
            if (c5331 != null) {
                c13799.accept(c5331);
            }
            this.f16571.add(c13799);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m12990() {
        return this.f16571.isEmpty();
    }
}
